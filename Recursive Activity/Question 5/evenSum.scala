object Test extends App{

  def evenSum(n:Int):Int={

    if(n<=0){
      return 0
    } else if(n%2 == 0){
      n + evenSum(n-1)
    } else{
      evenSum(n-1)
    }
}
println(evenSum(7))
}
