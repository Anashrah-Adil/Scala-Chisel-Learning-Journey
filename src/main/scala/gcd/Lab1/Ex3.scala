package Lab1
import chisel3._
class Ex3( size : Int , maxValue : Int ) extends Module {
    val io = IO (new Bundle {
        val result = Output ( Bool () )
})

    val count = RegInit (0.U ( size.W ) )
    def genCounter ( n : Int , max : Int ) = {
        when ( count === max.asUInt ) {
            count := 0.U
        }.otherwise {
            count := count + 1.U
        }
        count
    }
    val c= genCounter ( size , maxValue )
    io.result := c

}