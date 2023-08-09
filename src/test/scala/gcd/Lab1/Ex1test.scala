package Lab1
import chisel3._
import chisel3.tester._
import org.scalatest.FreeSpec
import chisel3.experimental.BundleLiterals._
class Ex1test extends FreeSpec with ChiselScalatestTester{
    "Chisel Test File" in{
        test(new Ex1(5)){
            a=>
            a.clock.step(31)
        }
    }
}