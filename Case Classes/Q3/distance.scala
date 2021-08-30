case class Point(a:Int, b:Int){
  def x:Int = a
  def y:Int = b

  def distance(p:Point){
    val d1 = x - p.x
    val d2 = y - p.y

    val pow1 = scala.math.pow(d1,2)
    val pow2 = scala.math.pow(d2,2)

    val d3 = scala.math.pow((pow1 + pow2),0.5)
    println("Distance between two points is " + d3)
  }

}

object MyApp extends App{

  val p1 = Point(1,2)
  val p2 = Point(4,5)

  println(p1 + "\n" + p2)

  val p3 = p1.distance(p2)


}
