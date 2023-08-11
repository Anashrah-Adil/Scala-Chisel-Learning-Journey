package Lab2
import chisel3._
import chisel3.util._ 

class Ex3 extends Module {
        val io = IO (new Bundle{
        val in0=Input(UInt(1.W))
        val in1=Input(UInt(1.W))
        val in2=Input(UInt(1.W))
        val in3=Input(UInt(1.W))
        val out=Output(UInt(2.W))
    })
    // Pre-determined inputs for the 4-to-2 encoder
    val sel=Cat(io.in3,io.in2,io.in1,io.in0)//MSB-LSB
    io.out:=Mux1H(sel,Seq(0.U,1.U,2.U,3.U))
}
