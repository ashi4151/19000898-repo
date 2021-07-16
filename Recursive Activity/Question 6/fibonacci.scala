object Test extends App{

  def fibonacci(n:Int):Int={
    if(n==0){
      return 0
    } else if(n==1){
      return 1
    } else{
      return fibonacci(n-1)+fibonacci(n-2)
    }
  }

  def fiboSeq(n:Int):Unit={
    if(n>0){
      fiboSeq(n-1)
      println(fibonacci(n))
    }

  }

  println(fiboSeq(8))
}
