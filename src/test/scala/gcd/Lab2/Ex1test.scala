package Lab2
import chisel3._
import chisel3.tester._
import org.scalatest.FreeSpec
import chisel3.experimental.BundleLiterals._
class Ex1test extends FreeSpec with ChiselScalatestTester{
    "Chisel Test File" in{
        test(new Ex1){
            a=>
            a.io.in_A.poke(15.U)
            a.io.in_B.poke(10.U)
            // a.io.select.poke(true.B)
            a.io.select.poke(true.B)
            a.clock.step(10)
            a.io.out.expect(15.U)
        }
        }
        }