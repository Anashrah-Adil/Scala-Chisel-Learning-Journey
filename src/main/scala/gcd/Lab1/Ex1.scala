package Lab1

import chisel3._

class Ex1(counterBits: Int) extends Module{
    val io=IO(new Bundle{
        val result=Output(SInt(counterBits.W))
    })

    val max=(1.S << (counterBits-1))-1.S
    val count= RegInit(0.S(counterBits.W))

    when(count=== max){
        count:= 0.S
    }.otherwise{
        count:= count+1.S
    }
    io.result:= count
    // println(s"counter created with max value $max") 
    printf("\nCounter created with max value %d\n", max)
}
