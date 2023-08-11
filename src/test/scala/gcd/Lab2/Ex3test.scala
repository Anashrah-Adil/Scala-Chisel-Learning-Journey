package Lab2

import chisel3._
import chisel3.tester._
import org.scalatest.FreeSpec
import chisel3.experimental.BundleLiterals._
class Ex3test  extends FreeSpec with ChiselScalatestTester {
    "Chisel Test File" in {
        test(new Ex3){
            a=>
                //0001
                a.io.in0.poke(1.U)
                a.io.in1.poke(0.U)
                a.io.in2.poke(0.U)
                a.io.in3.poke(0.U)
                
                a.io.out.expect(0.U)
                //0010
                a.io.in0.poke(0.U)
                a.io.in1.poke(1.U)
                a.io.in2.poke(0.U)
                a.io.in3.poke(0.U)
                
                
                a.io.out.expect(1.U)
                
                //0100
                a.io.in0.poke(0.U)
                a.io.in1.poke(0.U)
                a.io.in2.poke(1.U)
                a.io.in3.poke(0.U)

                a.io.out.expect(2.U)
                
                //1000
                a.io.in0.poke(0.U)
                a.io.in1.poke(0.U)
                a.io.in2.poke(0.U)
                a.io.in3.poke(1.U)
                a.io.out.expect(3.U)
            }
        }
  
}
