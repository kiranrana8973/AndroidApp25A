package com.kiran.androidapp25a

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val a : Int
        // Reference / Binding
        val etFirst: EditText =
                findViewById(R.id.etFirst)
        val etSecond: EditText =
                findViewById(R.id.etSecond)
        val btnAdd: Button =
                findViewById(R.id.btnAdd)
        val tvResult: TextView =
                findViewById(R.id.tvResult)
        val rdoAdd: RadioButton =
                findViewById(R.id.rdoAdd)
        val rdoSubtract: RadioButton =
                findViewById(R.id.rdoSubtract)
        val rdoMultiply: RadioButton =
                findViewById(R.id.rdoMultiply)
        // set a click listener on Button

        btnAdd.setOnClickListener {
            val first : Int = etFirst.text.toString().toInt()
            val second : Int = etSecond.text.toString().toInt()
            var result : Int = 0
            when {
                rdoAdd.isChecked -> {
                    result = first + second
                }
                rdoSubtract.isChecked -> {
                    result = first - second
                }
                rdoMultiply.isChecked -> {
                    result = first * second
                }
            }

            tvResult.visibility = View.VISIBLE
            tvResult.text = result.toString()
        }
    }
}

