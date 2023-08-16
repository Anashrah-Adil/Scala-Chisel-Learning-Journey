package Lab3

import chisel3._
import org.scalatest._
import chiseltest._
class Task2test extends FreeSpec with ChiselScalatestTester{
    "Chisel Test File" in {
        test(new Task2()){ c =>
        c.io.instr.poke("b0001011101101010101000010010011".U)
        c.clock.step(1)
        c.io.immd_se.expect(187.U)
    }
}
}
