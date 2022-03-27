import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import kotlin.test.assertContains

internal class NumerosPaqueteTest{

    val numeros = Numeros(arrayOf(1,2,3,4,5))

    @Test
    fun paqueteTests(){
        assertAll(
            { assertTrue(numeros.suma() > 50, "No suman más de 50") },
            { assertContains(numeros.arrayNumeros,10,"No hay ningún 10") },
            { assertTrue(numeros.suma() == null, "La suma es null" )}, //Nunca se da, lo realizo para el ejercicio
            { assertNotEquals(numeros.menor(),5,"La suma es 5") }
        )
    }

}