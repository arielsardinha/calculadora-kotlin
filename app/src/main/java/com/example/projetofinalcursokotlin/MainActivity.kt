package com.example.projetofinalcursokotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnSomar = findViewById<Button>(R.id.btnSomar)
        val btnSubtrair = findViewById<Button>(R.id.btnSubtrair)
        val btnDividir = findViewById<Button>(R.id.btnDividir)
        val btnMultiplicar = findViewById<Button>(R.id.btnMultiplicar)

        btnSomar.setOnClickListener(this)
        btnSubtrair.setOnClickListener(this)
        btnDividir.setOnClickListener(this)
        btnMultiplicar.setOnClickListener(this)

    }

    override fun onClick(v: View?) {
        val val1 = findViewById<EditText>(R.id.value1).text.toString()
        val val2 = findViewById<EditText>(R.id.value2).text.toString()

        val text = findViewById<TextView>(R.id.texto)
        text.text = when(v?.id){
            R.id.btnSomar ->  "Resultado = ${val1.toInt() + val2.toInt()}"
            R.id.btnSubtrair ->  "Resultado = ${val1.toInt() - val2.toInt()}"
            R.id.btnDividir ->  "Resultado = ${val1.toInt() / val2.toInt()}"
            R.id.btnMultiplicar ->  "Resultado = ${val1.toInt() * val2.toInt()}"
            else -> "Não foi possivel realizar a operação"
        }
    }
}