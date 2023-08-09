package Lab1
import chisel3._
class Task2(n:Int)extends Module{
    val io=IO(new Bundle{
        val data_in=Input(UInt(n.W))
        val out=Output(UInt(n.W))
    })
    val counter = RegInit(0.U(10.W))
    var reload =  RegInit(1.U(1.W))
    // val max_count=RegInit(6.U(n.w))

    when(reload === true.B && counter === io.data_in) {
        counter := counter - 1.U
        reload := false.B
    }.elsewhen(reload === true.B && counter < io.data_in) {
        counter := counter + 1.U 
    }
    .elsewhen(reload === false.B && counter === 0.U) {
        counter:=counter+1.U
        reload:=true.B
    }
    .elsewhen(reload === false.B && counter > 0.U) {
        counter := counter - 1.U
    }

    io.out := counter
}












//     val isCountingUp = RegInit(true.B)
  
//    when(io.reload) {
//     counter := io.data_in
//     max_count := io.data_in
//    }.elsewhen(isCountingUp) {
//     when(counter === max_count) {
//       isCountingUp := false.B
//       counter := counter - 1.U
//     }.otherwise {
//       counter := counter + 1.U
//     }
//   }.otherwise {
//     when(counter === 0.U) {
//       isCountingUp := true.B
//       counter := counter + 1.U
//     }.otherwise {
//       counter := counter - 1.U
//     }
//   }

//   io.out := (counter === 0.U) || (counter === max_count)
// }

