class Cuenta (var ncuen: String,  var sal:Double, var vect:Byte) {

    fun recibirAbono(){
        println("¿Cuanto dinero se le suma a la cuenta?")
        val dinero = readLine()!!.toDouble()
        sal += dinero
        println("Tienes actualmente $sal euros en la cuenta")
    }
    fun realizarPago(){
        println("¿Cuanto dinero tienes que pagar?")
        val dinero = readLine()!!.toDouble()
        sal -= dinero
        println("Tienes actualmente $sal euros en la cuenta")
        if(sal < 0){
            println("Ajusta tu presupuesto!! Tienes tu saldo en negativo!")
        }
    }
}

class Persona(val dni: String){
    fun anadirCuenta(){
        println("¿A que persona se le añada una nueva cuenta?")
        var vect = readLine()!!.toByte()
        println("¿Cuanto dinero tiene la cuenta?")
        var money = readLine()!!.toDouble()
        println("¿Que nombre le pones a la Cuenta?")
        var nc = readLine()!!.toString()
        Cuenta(nc,money,vect)
    }
}
fun main() {
val cuenta1= Cuenta("Cuenta1",600.00, 1)
cuenta1.recibirAbono()
cuenta1.realizarPago()
val prueba = Persona("1321321")
prueba.anadirCuenta()
}