package Lab2

import chisel3._
import chisel3.tester._
import org.scalatest.FreeSpec
import chisel3.experimental.BundleLiterals._

class Task2test extends FreeSpec with ChiselScalatestTester{
    "Chisel Test File" in {
        test(new Task2){
            a=>
                //0010->0001
                a.io.sel.poke(0.U)
                a.io.shift_type.poke(0.B)

                a.io.in0.poke(0.U)
                a.io.in1.poke(1.U)
                a.io.in2.poke(0.U)
                a.io.in3.poke(0.U)

                a.io.out.expect(2.U)

                //0011->0001
                a.io.sel.poke(1.U)
                a.io.shift_type.poke(0.B)
                
                a.io.in0.poke(1.U)
                a.io.in1.poke(1.U)
                a.io.in2.poke(0.U)
                a.io.in3.poke(0.U)
                
                a.io.out.expect(1.U)

                // //1100->0011
                a.io.sel.poke(2.U)
                a.io.shift_type.poke(0.B)
                
                a.io.in0.poke(0.U)
                a.io.in1.poke(0.U)
                a.io.in2.poke(1.U)
                a.io.in3.poke(1.U)
                
                a.io.out.expect(3.U)

                // //1000->0001
                a.io.sel.poke(3.U)
                a.io.shift_type.poke(0.B)

                a.io.in0.poke(0.U)
                a.io.in1.poke(0.U)
                a.io.in2.poke(0.U)
                a.io.in3.poke(1.U)

                a.io.out.expect(1.U)

        }
    }
}