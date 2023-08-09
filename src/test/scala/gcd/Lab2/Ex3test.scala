package Lab2

import chisel3._
import chisel3.tester._
import org.scalatest.FreeSpec
import chisel3.experimental.BundleLiterals._
class Ex3test  extends FreeSpec with ChiselScalatestTester {
    "Chisel Test File" in {
        test(new Ex3){
            a=>
                a.io.in0.poke(10.U)
                a.io.in1.poke(20.U)
                a.io.in2.poke(30.U)
                a.io.in3.poke(40.U)
                
                a.io.sel.poke(1.U)
                a.io.out.expect(10.U)
                // a.io.sel.poke(2.U)
                // a.io.out.expect(20.U)
                // a.io.sel.poke(4.U)
                // a.io.out.expect(30.U)
                // a.io.sel.poke(8.U)
                // a.io.out.expect(11.U)
            }
        }
  
}
