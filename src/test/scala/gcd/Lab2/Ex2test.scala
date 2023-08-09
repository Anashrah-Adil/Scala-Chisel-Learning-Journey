package Lab2
import chisel3._
import chisel3.tester._
import org.scalatest.FreeSpec
import chisel3.experimental.BundleLiterals._

class Ex2test extends FreeSpec with ChiselScalatestTester{
    "Chisel Test File" in{
        test(new Ex2){
            a=>//0000 1101
                a.io.input.poke(13.U)
                a.io.select.poke(2.U)//011
                a.io.out.expect(1.B)
        }
    }
}