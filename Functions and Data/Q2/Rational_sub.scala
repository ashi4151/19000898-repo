object MyApp extends App{
  val x = new Rational(3,4)
  val y = new Rational(5,8)
  val z = new Rational(2,7)
  val p = x-y-z
  println(p)

}

class Rational(n:Int , d:Int){
  def numer = n/gcd(n,d)
  def denom = d/gcd(n,d)
  private def gcd(a:Int , b:Int):Int = if(b==0) a else gcd(b,a%b)

  def -(r:Rational) = new Rational(numer*r.denom - r.numer*denom , denom * r.denom)

  override def toString = numer+"/"+denom

  }
