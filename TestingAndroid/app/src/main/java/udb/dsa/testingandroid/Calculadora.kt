package udb.dsa.testingandroid

class Calculadora {
    fun suma(numero1: Double, numero2: Double): Double {
        return numero1 + numero2
    }

    fun resta(numero1: Double, numero2: Double): Double {
        return numero1 - numero2
    }

    fun multiplicacion(numero1: Double, numero2: Double): Double {
        return numero1 * numero2
    }

    fun division(numero1: Double, numero2: Double): Double {
        if (numero2 == 0.0) {
            throw IllegalArgumentException("No se puede dividir por cero")
        }
        return numero1 / numero2
    }
}