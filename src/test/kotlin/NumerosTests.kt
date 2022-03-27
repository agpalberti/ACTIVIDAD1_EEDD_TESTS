import org.junit.jupiter.api.Order
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*
import kotlin.test.assertContains
import java.util.*

class NumerosTests {
    val numeros = Numeros(arrayOf(1,2,3,4,5))

    @Test
    @Order(4)
    fun SumaMayor50 (){
        println("${Calendar.getInstance().time}: Comienzo test")
        assertTrue(numeros.suma() > 50, "No suman más de 50")
        println("${Calendar.getInstance().time}: Finaliza test")
    }

    @Test
    @Order(2)
    fun Contiene10(){
        println("${Calendar.getInstance().time}: Comienzo test")
        assertContains(numeros.arrayNumeros,10,"No hay ningún 10")
        println("${Calendar.getInstance().time}: Finaliza test")
    }

    @Test
    @Order(3)
    fun SumaNotNull(){
        println("${Calendar.getInstance().time}: Comienzo test")
        assertTrue(numeros.suma() != null, "La suma es null" )
        println("${Calendar.getInstance().time}: Finaliza test")
    }

    @Test
    @Order(1)
    fun MenorNot5(){
        println("${Calendar.getInstance().time}: Comienzo test")
        assertNotEquals(numeros.menor(),5,"La suma es 5")
        println("${Calendar.getInstance().time}: Finaliza test")
    }

}