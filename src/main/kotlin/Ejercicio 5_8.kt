import kotlin.system.exitProcess

class Tiempo (var hora: Byte, var min: Byte,
              var seg: Byte) {
    fun comhor(){
        println("¿Que hora es?")
        val hor = readLine()!!.toByte()
        if (hor in 0..23 ){
            hora = hor
        }else{
            println("Error, no existe esa hora!")
            exitProcess(-1)
        }
    }
    fun commin() {
        println("¿Que minuto es?")
        val mint = readLine()!!.toString()
        if (mint == "") {
            min = 0
        }else {
            try {
                val minc = mint.toByte()
                if (minc in 0..60) {
                    min = minc
                } else {
                    println("Error, no existe ese minuto!")
                    exitProcess(-1)
                }

            } catch (nfe: NumberFormatException) {
                println("Error!!! No es un numero")
                exitProcess(-1)
            }
        }
    }
    fun comseg() {
        println("¿Que segundo es?")
        val segu = readLine()!!.toString()
        if (segu == "") {
            seg = 0
        }else {
            try {
                val segc = segu.toByte()
                if (segc in 0..60) {
                    seg = segc
                } else {
                    println("Error, no existe ese segundo!")
                    exitProcess(-1)
                }

            } catch (nfe: NumberFormatException) {
                println("Error!!! No es un numero")
                exitProcess(-1)
            }
        }
    }
    override fun toString(): String {
        return ("$hora h $min m $seg s")
    }
}

fun main() {
    val uno= Tiempo(2,3,6)
    uno.comhor()
    uno.commin()
    uno.comseg()
    println(uno.toString())
}