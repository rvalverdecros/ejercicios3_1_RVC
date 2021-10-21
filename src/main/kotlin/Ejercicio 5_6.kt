class rec (val base: Int,  val alt:Int) {
    fun area():Int{
        return (base * alt)
    }
    fun per():Int{
        return ((base*2) +(alt*2))
    }
    override fun toString(): String {
        return ("El perimetro del rectangulo es ${per()} y El area es ${area()}")
    }
}
fun main() {
    val uno= rec(4,2)
    println(uno.toString())
    val dos= rec(5,3)
    println(dos.toString())
    val tres= rec(8,4)
    println(tres.toString())
    val cuatro= rec(9,5)
    println(cuatro.toString())
}