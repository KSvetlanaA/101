package com.example.distancionka41

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val item = intent.getParcelableExtra<ItemOfList>("OBJECT_INTENT")

        val imgSrc = findViewById<ImageView>(R.id.imageDetail)
        val imgTitle = findViewById<TextView>(R.id.imageTitle)
        val imgDesc = findViewById<TextView>(R.id.imageDesc)

        imgSrc.setImageResource(item.imageScr)
        imgTitle.text = item.imageTitle
        imgDesc.text = item.imageDesc
    }
}
