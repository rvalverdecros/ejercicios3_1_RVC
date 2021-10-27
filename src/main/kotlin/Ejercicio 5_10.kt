import org.jetbrains.annotations.TestOnly

class Libros(var titulo: String, var autor: String, var npag: Int, var cal:Int) {
    fun camtit() {
        println("¿Como se llama el libro?")
        val tit = readLine()!!.toString()
        titulo = tit
    }

    fun camnpag() {
        println("¿Cuantas paginas tiene el libro?")
        val pag = readLine()!!.toInt()
        npag = pag
    }

    fun calificacion() {
        println("¿Que Calficacion le das al libro?")
        val ca = readLine()!!.toInt()
        if (ca <= 10) {
            cal = ca
        } else {
            println("Tiene que ser calificacion del 1 al 10")
        }
    }
}

class ConjuntoLibros(var can: Int) {
    val conjunto = arrayListOf<Libros>()

    fun anadirLibro(LibrosNueva: Libros) {
        if (conjunto.size <= can) {
            conjunto.add(LibrosNueva)
            println("Esta dentro correctamente")
        } else
            println("Este conjunto ya tiene demasiados libros")
    }

    fun eliminarLibro(campo: String) {
        var eliminado : Boolean = false
        val contadorMax = conjunto.size
        var i = 0
        do {
            val lActual = conjunto[i]
            if (lActual.autor == campo || lActual.titulo == campo) {
                conjunto.remove(lActual)
                println("Se ha eliminado correctamente")
                eliminado = true
            } else
                i++
        } while (!eliminado && i != contadorMax)
        if(!eliminado){
            println("No hay ningun libro con ese campo")
        }
    }
    fun mecalificacion(){
        val contadorMax = conjunto.size
        var i = 0
        var califi= 0
        var sal = 0
        var califimin= 10
        var salmin = 0
        do {

            val conca = conjunto[i]
            if(conca.cal > califi){
                califi = conca.cal
                sal = i
                println("La calificacion mas alta es de $califi")
                val li = conjunto[sal]
                println("Y el libro es ${li.titulo}")
            }
            if(conca.cal< califimin){
                califimin = conca.cal
                salmin = i
                println("La calificacion mas baja es de $califimin")
                val limin = conjunto[salmin]
                println("Y el libro es ${limin.titulo}")
            }
            else{
                i++
            }
        }while (i != contadorMax)
        if (i != contadorMax){
            println("La calificacion mas alta es de $califi")
            val li = conjunto[sal]
            println("Y el libro es ${li.titulo}")
            println("La calificacion mas baja es de $califimin")
            val limin = conjunto[salmin]
            println("Y el libro es ${limin.titulo}")
        }
    }
    fun mostrarTodo(){
        val contadorMax = conjunto.size
        var i = 0
        do{
            if (i<contadorMax) {
                val todo = conjunto[i]
                println("El libro se llama ${todo.titulo}")
                println("Tiene un total de ${todo.npag} paginas")
                println("Su autor se llama ${todo.autor}")
                println("Su calificacion es ${todo.cal}")
                i++
            }
        }while (i != contadorMax)
    }
}

fun main() {
    val libro1 = Libros("coche","Alfonso",100,10)
    val libro2 = Libros("moto","Juan",200,5)
    val vector = ConjuntoLibros(3)
    vector.anadirLibro(libro1)
    vector.anadirLibro(libro2)
    vector.mecalificacion()
    vector.eliminarLibro("coche")
    vector.eliminarLibro("moto")
    val libro3 = Libros("camion","Juanma",300,9)
    vector.anadirLibro(libro3)
    vector.mostrarTodo()
}
