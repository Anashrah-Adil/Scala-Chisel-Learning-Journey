package Lab3

import chisel3._
import org.scalatest._
import chiseltest._
class Task1test extends FreeSpec with ChiselScalatestTester{
    "Chisel Test File" in {
        test(new Task1()){ 
            a=>   
            a.io.funct3.poke(0.U)
            a.io.branch.poke(1.B)
            a.io.arg_x.poke(2.U)
            a.io.arg_y.poke(2.U)
            a.clock.step(1)
            a.io.br_taken.expect(1.B)
    }
}
}