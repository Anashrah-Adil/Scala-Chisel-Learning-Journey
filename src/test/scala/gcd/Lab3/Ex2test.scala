package Lab3

import chisel3._
import org.scalatest._
import chiseltest._
class Ex2test extends FreeSpec with ChiselScalatestTester{
    "Chisel Test File" in {
        test(new Ex2()){ c=>
        //Test case 1---add
        c.io.alu_Op.poke(0.U)//selects which operation to perform
        c.io.in_A.poke(2.U)
        c.io.in_B.poke(1.U)
        c.clock.step(1)
        c.io.out.expect(3.U)

        //Test case 2---sub
        c.io.alu_Op.poke(1.U)//selects which operation to perform
        c.io.in_A.poke(2.U)
        c.io.in_B.poke(1.U)
        c.clock.step(1)
        c.io.out.expect(1.U)

        //Test case 3---and
        c.io.alu_Op.poke(2.U)//selects which operation to perform
        c.io.in_A.poke(2.U)
        c.io.in_B.poke(2.U)
        c.clock.step(1)
        c.io.out.expect(2.U)

        //Test case 4---slt
        c.io.alu_Op.poke(7.U)//selects which operation to perform
        c.io.in_A.poke(1.U)
        c.io.in_B.poke(2.U)
        c.clock.step(1)
        c.io.out.expect(1.U)
    }
}
}