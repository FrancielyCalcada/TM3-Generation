import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class CalculadoraTest{


    @Test
    fun somaTeste(){

        assertEquals(8, Calculadora.soma(5, 3))

    }

    @Test
    fun subTest(){

        assertEquals(7, Calculadora.subtracao(15, 8))

    }

    @Test
    fun multiTest(){

        assertEquals(15, Calculadora.multi(3,5))

    }

    @Test
    fun divTest(){

        assertEquals(4, Calculadora.divisao(8,2))

    }

    @Test
    fun potTest(){

        assertEquals(16.0, Calculadora.potencia(4.0))

    }

    @Test
    fun raizTest(){

        assertEquals(7.0, Calculadora.raiz(49.0))

    }

}