case class Point(a:Int, b:Int){
  def x:Int = a
  def y:Int = b

  def +(p:Point) =  Point(x + p.x , y + p.y)
}

object MyApp extends App{

  val p1 = Point(1,2)
  val p2 = Point(4,5)

  val p3 = p1+p2

  println(p3)
}
