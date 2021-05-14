object Book extends App{

  def cost(a:Double,b:Double)={

  var y:Double =0;

  if(b<=50){
     y= (((a*100)/60)*b)  + b*3;
  }else{
     y = (((a*100)/60)*b) + ((b-50)*0.75) + 150;
  }

   println(y);
 }

 cost(24.95,60);
}
