package udb.dsa.testingandroid

import junit.framework.TestCase.assertEquals
import org.junit.Test

class CalculadoraTest {
    private val calculadora = Calculadora()

    @Test
    fun suma_correcta() {
        val resultado = calculadora.suma(2.2, 3.3)
        assertEquals(5.5, resultado)
    }
    @Test
    fun resta_correcta() {
        val resultado = calculadora.resta(5.0, 3.0)
        assertEquals(2.0, resultado)
    }
    @Test
    fun multiplicacion_correcta() {
        val resultado = calculadora.multiplicacion(4.0, 6.0)
        assertEquals(24.0, resultado)
    }
    @Test
    fun division_correcta() {
        val resultado = calculadora.division(10.0, 2.0)
        assertEquals(5.0, resultado)
    }
    @Test(expected = IllegalArgumentException::class)
    fun division_por_cero() {
        calculadora.division(10.0, 0.0)
    }
}