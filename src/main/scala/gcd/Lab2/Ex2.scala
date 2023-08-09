package Lab2
import chisel3._
import chisel3.util._ 

class Ex2 extends Module{
    val io = IO(new Bundle {
    val select = Input(UInt(3.W))
    val input = Input(UInt(8.W))
    val out = Output(Bool())
  })

  io.out := MuxLookup(io.select(2),false.B, Array(
    //if 0------s2
    (0.U) -> MuxLookup(io.select(1),false.B,Array(
        
        //if 0------s1
        ( 0. U ) -> MuxLookup(io.select(0),false.B,Array(
            //if 0------s0
            ( 0. U ) -> io . input(0) ,
            //if 1------s0
            ( 1. U ) -> io . input(1))
            ),
        //if 1------s1
        ( 1. U ) -> MuxLookup(io.select(0),false.B,Array(
            //if 0------s0
            ( 0. U ) -> io . input(2) ,
            //if 1------s0
            ( 1. U ) -> io . input(3))
            )   
        )
        ),
    //if 1------s2
    ( 1. U ) ->  MuxLookup(io.select(1),false.B,Array(
        //if 0------s1
        ( 0. U ) -> MuxLookup(io.select(0),false.B,Array(
            //if 0------s0
            ( 0. U ) -> io . input(4) ,
            //if 1------s0
            ( 1. U ) -> io . input(5))
            ),
        //if 1------s1
        ( 1. U ) -> MuxLookup(io.select(0),false.B,Array(
            //if 0------s0
            ( 0. U ) -> io . input(6) ,
            //if 1------s0
            ( 1. U ) -> io . input(7))
            )
    )
    )
  )
  )
}