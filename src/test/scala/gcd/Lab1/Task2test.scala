package Lab1

import chisel3._
import chisel3.tester._
import org.scalatest.FreeSpec
import chisel3.experimental.BundleLiterals._

class Task2test extends FreeSpec with ChiselScalatestTester {
  "Chisel Tester file" in {
    test(new Task2(5)) { c =>
    c.io.data_in.poke(4.U)
    c.clock.step(20)
    c.io.out.expect(1.U)
    }
  }
}


// package Lab1
// import chisel3._
// import chisel3.tester._
// import org.scalatest.FreeSpec
// import chisel3.experimental.BundleLiterals._
// class Countertest extends FreeSpec with ChiselScalatestTester{
//     "Chisel Test File" in{
//         test(new Counter(4.U)){
//             a=>
//             a.clock.step(1)
//             a.io.result.expect(0.B)
//         }
//     }
// }