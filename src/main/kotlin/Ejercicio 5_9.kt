class Cuenta (var ncuen: Int,  var sal:Double, var vect:Byte) {

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
    }
    fun verCuenta(){
         ncuen = (111111..999999).random()
        println("Tu numero de cuenta es $ncuen")
        println("Tienes de saldo $sal")
    }
}

class Persona(val dni: String, var vect:Byte){
    fun anadirCuenta(){
        println("¿A que persona se le añada una nueva cuenta?")
        vect = readLine()!!.toByte()
        println("¿Cuanto dinero tiene la cuenta?")
        val money = readLine()!!.toDouble()


    }
    fun esMoroso(){
    }

}
fun main() {

}