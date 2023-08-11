package Lab2
import chisel3._
import chisel3.util._ 

class Task2_IO extends Bundle{
    val sel = Input ( UInt(2.W) )
    // val s1 = Input ( Bool () )
    val shift_type = Input ( Bool () )

    val in0=Input(UInt(1.W))
    val in1=Input(UInt(1.W))
    val in2=Input(UInt(1.W))
    val in3=Input(UInt(1.W))

    val out=Output(UInt(4.W))
    // val out1=Output(UInt(1.W))
    // val out2=Output(UInt(1.W))
    // val out3=Output(UInt(1.W))


}
class Task2 extends Module {
    val io = IO (new Task2_IO)

    val mux1=Mux(io.shift_type,io.in0,0.B)
    val mux2=Mux(io.shift_type,io.in1,0.B)
    val mux3=Mux(io.shift_type,io.in2,0.B)

    val Y0=MuxLookup(io.sel,false.B,Array(
        0.U->io.in0,
        1.U->io.in1,
        2.U->io.in2,
        3.U->io.in3
    ))

    val Y1=MuxLookup(io.sel,false.B,Array(
        0.U->io.in1,
        1.U->io.in2,
        2.U->io.in3,
        3.U->mux1
    ))

    val Y2=MuxLookup(io.sel,false.B,Array(
        0.U->io.in2,
        1.U->io.in3,
        2.U->mux1,
        3.U->mux2
    ))

    val Y3=MuxLookup(io.sel,false.B,Array(
        0.U->io.in3,
        1.U->mux1,
        2.U->mux2,
        3.U->mux3
    ))
    io.out:=Cat(Y3,Y2,Y1,Y0)

    // io.out0:=Y0
    // io.out1:=Y1
    // io.out2:=Y2
    // io.out3:=Y3
}
