package Lab1
import chisel3._
import chisel3.tester._
import org.scalatest.FreeSpec
import chisel3.experimental.BundleLiterals._
class Ex2test extends FreeSpec with ChiselScalatestTester{
    "Chisel Test File" in{
        test(new Ex2(4)){
            a=>
            a.clock.step(15)
        }
    }
}