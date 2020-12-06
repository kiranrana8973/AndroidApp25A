package com.kiran.androidapp25a

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity() {
    //Global variable
    private lateinit var tvResult: TextView
    private lateinit var etFirst: EditText
    private lateinit var etSecond: EditText
    private lateinit var btnAdd: Button
    private lateinit var rdoAdd: RadioButton
    private lateinit var rdoSubtract: RadioButton
    private lateinit var rdoMultiply: RadioButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // Reference / Binding
        tvResult = findViewById(R.id.tvResult)
        etFirst = findViewById(R.id.etFirst)
        etSecond = findViewById(R.id.etSecond)
        btnAdd = findViewById(R.id.btnAdd)
        rdoAdd = findViewById(R.id.rdoAdd)
        rdoSubtract = findViewById(R.id.rdoSubtract)
        rdoMultiply = findViewById(R.id.rdoMultiply)

        btnAdd.setOnClickListener {
            // Validation
            if (checkEmptyValues())
                retrieveValues()
        }
    }
    private fun checkEmptyValues(): Boolean {
        var flag: Boolean = true
        if (TextUtils.isEmpty(etFirst.text)) {
            etFirst.error = "Enter first number"
            etFirst.requestFocus()
            flag = false
        } else if (TextUtils.isEmpty(etSecond.text)) {
            etSecond.error = "Enter second number"
            etSecond.requestFocus()
            flag = false
        }
        return flag
    }

    private fun retrieveValues() {
        val first: Int = etFirst.text.toString().toInt()
        val second: Int = etSecond.text.toString().toInt()
        var result: Int = 0
        when {
            rdoAdd.isChecked -> {
                result = add(first, second)
                tvResult.text = result.toString()
            }
            rdoSubtract.isChecked -> {
                result = first - second
                tvResult.text = result.toString()
            }
            rdoMultiply.isChecked -> {
                multiply(first, second)
            }
        }
    }

    // Function with no return type
    private fun multiply(first: Int, second: Int) {
        val result = first * second
        tvResult.text = result.toString()
    }

    // Function with return type
    private fun add(first: Int, second: Int): Int {
        return first + second
    }

}

