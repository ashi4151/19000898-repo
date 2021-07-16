object sum extends App{

def sum( a:Int):Int={
  if(a>=1){
    a + sum(a-1)
  }else{
    return 0
  }
}
println(sum(5))
}
