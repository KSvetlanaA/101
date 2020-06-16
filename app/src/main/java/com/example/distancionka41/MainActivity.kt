package com.example.distancionka41

import android.content.Intent
import android.content.pm.PackageManager
import android.database.Cursor
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.widget.SimpleCursorAdapter
import android.widget.Toast
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imageList = listOf<ItemOfList>(
            ItemOfList(
                R.drawable.pic_1,
                "Вельш-корги на фламинго",
                "Вельщ-корги отдыхает летним днём в бассейне на фламинго."
            ),

            ItemOfList(
                R.drawable.pic_2,
                "Сиба-ину - бурундук",
                "Сиба-ину надевала плюшевую голову бурундука, чтобы воровать орешки и быть незамеченной."
            ),

            ItemOfList(
                R.drawable.pic_3,
                "Сиба-ину - мотоциклист",
                "Хозяин сибы-ины не разрешал ей есть много вкусняшек. Из-за этого собака была вынуждена взять мотоцикл хозяина и поехать в зоомагазин. К счастью с ней не случилось ничего страшного, а также она надела защиту."
            ),

            ItemOfList(
                R.drawable.pic_4,
                "Сиба-ину - плед",
                "Любимый герой сибы-ины был Чёрный-плащ, именно поэтому она ходит в пледе."
            ),

            ItemOfList(
                R.drawable.pic_5,
                "Вельш-корги - акула",
                "Вчера одним прохожим в Красном море была замечена вельш-корги - акула. По словам очевидцев она чуть не зализала до смерти человека."
            )
        )

        val recyclerView = findViewById<RecyclerView>(R.id.image)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = ItemAdapter(this, imageList){
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra("OBJECT_INTENT", it)
            startActivity(intent)
        }
    }
}
