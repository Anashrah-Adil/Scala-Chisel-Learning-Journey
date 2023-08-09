package Lab1

import chisel3._
import org.scalatest._
import chiseltest._

class Ex3test extends FreeSpec with ChiselScalatestTester{
    "Chisel Test File" in {
        test (new Ex3(4,15)){
        c =>
        c.clock.step(30)
        c.io.result.expect(0.B)
		}
	}
}                                        