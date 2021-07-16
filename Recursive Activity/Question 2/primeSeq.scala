object Test extends App{

  def GCD(a:Int,b:Int):Int=b match{
    case 0 => a
    case x if x>a => GCD(x,a)
    case _ => GCD(b,a%b)
  }


  def prime(p:Int,n:Int=2):Boolean= n match {
    case x if(x==p) => true
    case x if GCD(p,x)>1 => false
    case x => prime(p,x+1)
  }

  def primeSeq(n:Int):Unit={
      while(n>0){
        if(prime(n)==true){
          println(n)
          primeSeq(n-1)
        }else{
          primeSeq(n-1)
        }
      }

    }

  println(primeSeq(10))
}
