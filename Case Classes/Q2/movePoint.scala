case class Point(a:Int, b:Int){
  def x:Int = a
  def y:Int = b

  def move(dx:Int , dy:Int) = Point(x + dx, y + dy)

}

object MyApp extends App{

  val p1 = Point(1,2)
  val p2 = p1.move(2,3)

  println(p1)
  println(p2)
}
