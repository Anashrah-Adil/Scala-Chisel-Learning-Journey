package Gates
import chisel3._
import chisel3.tester._
import org.scalatest.FreeSpec
import chisel3.experimental.BundleLiterals._
class NORtest extends FreeSpec with ChiselScalatestTester{
    "Chisel Test File" in{
        test(new NOR){
            a=>
            a.io.in1.poke(0.U)
            a.io.in2.poke(0.U)
            a.clock.step(1)
            a.io.out.expect(1.U)
        }
    }
}