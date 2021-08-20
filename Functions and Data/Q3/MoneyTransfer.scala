object MyApp extends App{
  
  var x = new Account("584568712v",123,8000.50)
  var y = new Account("635484549v",456,5000.25)
  x.transfer(y,2500.00)

  println(x)
  println(y)
}


class Account(id:String, n:Int, b:Double){
  val nic:String = id
  val acnum:Int = n
  var balance:Double = b

  def transfer(a1:Account, b:Double) = {
    require(this.balance>=b , "Insufficient balance")
    this.balance = this.balance - b
    a1.balance = a1.balance + b
  }


  override def toString = "[ " +nic+ " : " +acnum + " : " +balance+ " ]"
}
