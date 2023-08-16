package Lab3

import chisel3._
import chisel3.util._

class Ex1_IO extends Bundle {
val out = Output ( UInt (2. W ) )
val in = Input ( UInt (4. W ) )
}
class Ex1 extends Module {
val io = IO (new Ex1_IO )
io.out := 0.U
switch (io.in) {
    is ("b0001".U){
        io.out := "b00".U
    }
    is ("b0010".U){
        io.out := "b01".U
    }
    is ("b0100".U){
        io.out := "b10".U
    }
    is ("b1000".U){
        io.out := "b11".U
}
}
}