

object obj6 {

 
   def Fibonacci(n:Int):Int= n match

    {

        case x if x<=0 => 0
        case 0=> 0
        case 1=> 1
        case _ =>Fibonacci(n-1) + Fibonacci(n-2)
        

    }


    
    def PrintFibo(n:Int): Unit = 
    {
      if (n>0) PrintFibo(n-1)
      println(Fibonacci(n))
    }

    def main(args: Array[String]) {
 

        println("Fibonachchi Numbers: ");
       PrintFibo(10)


    }
}

