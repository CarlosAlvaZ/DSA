package udb.dsa.testingandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import udb.dsa.testingandroid.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val num1_edittext = findViewById<EditText>(R.id.num1_edittext)
        val num2_edittext = findViewById<EditText>(R.id.num2_edittext)
        val operacion_radiogroup = findViewById<RadioGroup>(R.id.operacion_radiogroup)
        val resultado_textview = findViewById<TextView>(R.id.resultado_textview)
        val calcular_button = findViewById<Button>(R.id.calbular_button)
        val calculadora = Calculadora()
        calcular_button.setOnClickListener {
            val num1 = num1_edittext.text.toString().toDouble()
            val num2 = num2_edittext.text.toString().toDouble()
            when (operacion_radiogroup.checkedRadioButtonId) {
                R.id.suma_radiobutton -> {
                    val resultado = calculadora.suma(num1, num2)
                    resultado_textview.text = resultado.toString()
                }

                R.id.resta_radiobutton -> {
                    val resultado = calculadora.resta(num1, num2)
                    resultado_textview.text = resultado.toString()
                }

                R.id.multiplicacion_radiobutton -> {
                    val resultado = calculadora.multiplicacion(num1, num2)
                    resultado_textview.text = resultado.toString()
                }

                R.id.division_radiobutton -> {
                    val resultado = calculadora.division(num1, num2)
                    resultado_textview.text = resultado.toString()
                }
            }
        }
    }
}