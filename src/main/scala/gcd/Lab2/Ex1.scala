package Lab2

import chisel3._
import chisel3.util._

class Ex1_IO extends Bundle {
    val in_A =Input(UInt(32.W))
    val in_B =Input(UInt(32.W))
    val select =Input(Bool())
    val out =Output(UInt())
}
class Ex1 extends Module{
    val io=IO(new Ex1_IO)
    val duplicate=Fill(32,io.select.asUInt)
    io.out:= (io.in_A & (~duplicate))|(io.in_B & duplicate)
    // io.out:= (io.in_A & (~io.select))|(io.in_B & io.select)
}
