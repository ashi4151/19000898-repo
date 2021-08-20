object MyApp extends App{
  val a = new Rational(2,3)
  val r = a.neg
  println(r)

}

class Rational(x:Int , y:Int){
  def numer = x
  def denom = y

  def neg = new Rational(- this.numer,this.denom)

  override def toString = numer+"/"+denom

  }
