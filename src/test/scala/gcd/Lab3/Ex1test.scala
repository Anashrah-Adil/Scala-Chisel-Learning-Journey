package Lab3

import chisel3._
import org.scalatest._
import chiseltest._

class Ex1test extends FreeSpec with ChiselScalatestTester{
    "Chisel Test File" in {
        test (new Ex1 ()){
        a=>
            a.io.in.poke("b1000".U)
            a.clock.step(1)
            a.io.out.expect("b11".U)
    }
    }
}