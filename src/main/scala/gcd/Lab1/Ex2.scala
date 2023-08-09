package Lab1

import chisel3._

class Ex2(counterBits: Int) extends Module{
    val io=IO(new Bundle{
        val result=Output(SInt(counterBits.W))
    })

    val max=(1.S << (counterBits-1))-1.S
    val count= RegInit(0.S(counterBits.W))
    val msb=RegInit(0.B)

    when(count === max || (msb === 0.B && count(counterBits - 1) === 1.B))
    {
        count := 0.S
    }
    .otherwise{
        count:= count+1.S
    }
    msb := count(counterBits - 1) 
    io.result:=count
    printf("%d",count)
}