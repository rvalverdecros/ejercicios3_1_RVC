class coche (var color: String, val marca:String,
             val modelo:String, val caballo:Int,
             val puerta:Int, val matri:String) {

    fun cambicolor(){
        do{
            println("¿De que color quieres cambiar tu color?")
            color = readLine().toString()
        } while (color == "")
    }
    override fun toString(): String {
        return ("Tu coche es un $marca $modelo, de color $color, con $puerta puertas, $caballo caballos y con matricula $matri")
    }

}
class marc(marca: String) {
    var mar: String = marca.uppercase()
        set(value) {
            field = value.uppercase()
        }
    override fun toString(): String {
        return ("Tu coche es un $mar")
    }

}
fun main() {
    val m1= marc("opel")
    println(m1.toString())
    val uno= coche("negro","opel","corsa",100,4,"8710PKQ")
    println(uno.toString())
    uno.cambicolor()
    println(uno.toString())
    val dos= coche("rojo","ford","mondeo",80,6,"5106YHJ")
    println(dos.toString())
    dos.cambicolor()
    println(dos.toString())
}