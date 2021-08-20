object MyApp extends App{
  var bank:List[Account] = List(new Account("584568712v",1023,8000.50), new Account("635484549v",4056,-5000.25), new Account("784512134v",7089,-1000.00),new Account("746512486v",1011,300.00))

  val overdraft=(b:List[Account])=>b.filter(x=>x.balance<0)

  val balance_sum=(b:List[Account])=>b.map(x=>(x.balance)).reduce((a,c)=>(a + c))

  val interest=(b:List[Account])=>b.map(x=>if(x.balance>0) x.balance*0.05 else x.balance*0.1)

  println("\nList of Accounts with negative values")
  println(overdraft(bank))
  println("\nSum of all account balances : Rs." + balance_sum(bank))
  println("\nList of interests per account\n" + interest(bank) + "\n")
}


class Account(id:String, n:Int, b:Double){
  val nic:String = id
  val acnum:Int = n
  var balance:Double = b

  override def toString = "[ " +nic+ " : " +acnum + " : " +balance+ " ]"
}
