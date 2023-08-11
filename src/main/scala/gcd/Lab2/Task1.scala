package Lab2
import chisel3._
class Task1_IO extends Bundle {
    val s0 = Input ( Bool () )
    val s1 = Input ( Bool () )
    val s2 = Input ( Bool () )
    val out = Output ( UInt (32. W ) )  
}
//Mux_5to1
class Task1 extends Module {
    val io = IO (new Task1_IO)
    // Start coding here
    val in_Mux_4to1=Mux(io.s1,Mux(io.s0,24.U,16.U),Mux(io.s0,8.U,0.U))
    val Mux_5to1_C=Mux(io.s2,32.U,in_Mux_4to1)

    io.out:=Mux_5to1_C
}