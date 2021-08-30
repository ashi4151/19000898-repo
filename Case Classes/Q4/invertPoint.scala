case class Point(a:Int, b:Int){
  def x:Int = a
  def y:Int = b

  def invert()= Point(y,x)

}

object MyApp extends App{

  val p1 = Point(1,2)
  println(p1)

  val p2 = p1.invert()
  println(p2)

}
