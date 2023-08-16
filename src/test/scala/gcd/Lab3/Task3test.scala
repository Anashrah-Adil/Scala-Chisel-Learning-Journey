package Lab3
import chisel3._
import org.scalatest._
import chiseltest._
class Task3test extends FreeSpec with ChiselScalatestTester{
    "Chisel Test File" in {
        test(new Task3()){ 
            a=>
                a.io.in.poke(2.U)
                a.clock.step(1)
                a.io.out.bits.expect(4.U)
                a.io.out.valid.expect(1.B)
    }
}
}