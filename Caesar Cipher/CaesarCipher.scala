object Test extends App{

val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

val Encript = (c:Char, key:Int, a:String)=> a((a.indexOf(c.toUpper)+key)% a.size)

val Decript = (c:Char, key:Int, a:String)=> a((a.indexOf(c.toUpper)-key)% a.size)

val Cipher = (algo:(Char,Int,String)=>Char, s:String, key:Int,a:String)=> s.map (algo(_,key,a))

val s = "gemini"
val ct = Cipher(Encript,s,10,alphabet)
val pt = Cipher(Decript,ct,10,alphabet)

println(ct)
println(pt)
}
