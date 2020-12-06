package com.kiran.androidapp25a

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.RadioButton

class ImageActivity : AppCompatActivity() {
    private lateinit var rdoPradeep : RadioButton
    private lateinit var imgProfile : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image)

        rdoPradeep = findViewById(R.id.rdoPradeep)
        imgProfile = findViewById(R.id.imgProfile)

        rdoPradeep.setOnClickListener {
            imgProfile.setImageResource(R.drawable.pradeep)
        }


    }
}