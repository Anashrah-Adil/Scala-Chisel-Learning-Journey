package Gates
import chisel3._
import chisel3.tester._
import org.scalatest.FreeSpec
import chisel3.experimental.BundleLiterals._
class NANDtest extends FreeSpec with ChiselScalatestTester{
    "Chisel Test File" in{
        test(new NAND){
            a=>
            a.io.in1.poke(1.U)
            a.io.in2.poke(1.U)
            a.clock.step(1)
            a.io.out.expect(0.U)
        }
    }
}