package Lab2
import chisel3._
import chisel3.util._ 

class Ex3 extends Module {
        val io = IO (new Bundle{
        val in0=Input(UInt(4.W))
        val in1=Input(UInt(4.W))
        val in2=Input(UInt(4.W))
        val in3=Input(UInt(4.W))
        // val sel=Input(UInt(1.W))
        val out=Output(UInt(2.W))
    })
    io.out:=Mux1H(io.in,Seq(10.U,20.U,30.U,40.U))
}
