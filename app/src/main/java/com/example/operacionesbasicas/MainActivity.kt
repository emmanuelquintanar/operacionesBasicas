package com.example.operacionesbasicas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var num1: EditText
    private lateinit var num2: EditText
    private lateinit var btnSuma: Button
    private lateinit var btnResta: Button
    private lateinit var btnDiv: Button
    private lateinit var btnMul: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        num1=findViewById(R.id.textnum1)
        num2=findViewById(R.id.textnum2)
        btnSuma=findViewById(R.id.btn_suma)
        btnResta=findViewById(R.id.btn_resta)
        btnDiv=findViewById(R.id.btn_div)
        btnMul=findViewById(R.id.btn_mul)

        btnSuma.setOnClickListener{
            var res=operaciones("suma")
            Toast.makeText(this, "La suma es $res", Toast.LENGTH_LONG).show()
        }

        btnResta.setOnClickListener{
            var res=operaciones("resta")
            Toast.makeText(this, "La resta es $res", Toast.LENGTH_LONG).show()
        }
        btnDiv.setOnClickListener{
            var res=operaciones("division")
            Toast.makeText(this, "La division es es $res", Toast.LENGTH_LONG).show()
        }
        btnMul.setOnClickListener{
            var res=operaciones("multi")
            Toast.makeText(this, "La multiplicacion es $res", Toast.LENGTH_LONG).show()
        }

    }





    fun operaciones(operacion:String): Int{
        var resultado:  Int=0
        if (operacion=="suma"){
            var numero1=num1.text.toString().toInt()
            var numero2=num2.text.toString().toInt()
            resultado=numero1+numero2
        }

        if (operacion=="resta"){
            var numero1=num1.text.toString().toInt()
            var numero2=num2.text.toString().toInt()
            resultado= numero1-numero2
        }
        if (operacion=="division"){
            var numero1=num1.text.toString().toInt()
            var numero2=num2.text.toString().toInt()
            resultado= numero1/numero2

        }
        if (operacion=="multi"){
            var numero1=num1.text.toString().toInt()
            var numero2=num2.text.toString().toInt()
            resultado= numero1*numero2
        }


        return resultado
    }
}
