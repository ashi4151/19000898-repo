object Test extends App{
  def isEven(n:Int):Boolean= n match{
 case 0 => true
 case _ => isOdd(n-1)
  }

  def isOdd(n:Int):Boolean= !(isEven(n))

  println("2 = " + isEven(2))
  println("7 = " +isEven(7))
  println("15 = " +isEven(15))
  println("8 = " +isEven(8))
}
