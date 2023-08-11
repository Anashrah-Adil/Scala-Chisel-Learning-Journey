package Lab2

import chisel3._
import chisel3.tester._
import org.scalatest.FreeSpec
import chisel3.experimental.BundleLiterals._
class Task1test extends FreeSpec with ChiselScalatestTester{
    "Chisel Test File" in {
        test(new Task1){
            a=>
                //TEST 1 (000)
                a.io.s0.poke(0.B) 
                a.io.s1.poke(0.B) 
                a.io.s2.poke(0.B)
                
                a.io.out.expect(0.U) 
                //TEST 2 (001)
                a.io.s0.poke(1.B) 
                a.io.s1.poke(0.B) 
                a.io.s2.poke(0.B)
                
                a.io.out.expect(8.U) 
                //TEST 3 (010)
                a.io.s0.poke(0.B) 
                a.io.s1.poke(1.B) 
                a.io.s2.poke(0.B)
                
                a.io.out.expect(16.U) 
                
                //TEST 4 (100)
                a.io.s0.poke(1.B) 
                a.io.s1.poke(1.B) 
                a.io.s2.poke(0.B)
                
                a.io.out.expect(24.U) 
                //TEST 5 (101)
                a.io.s0.poke(0.B) 
                a.io.s1.poke(0.B) 
                a.io.s2.poke(1.B)
                
                a.io.out.expect(32.U) 
        }
    }
}