package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ListView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_favourite.*

class Favourite : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_favourite)

        var listview = findViewById<ListView>(R.id.listView)

        var list = mutableListOf<Model>()

        list.add(Model("Fundamental of networking", "By Steve Oleleke", R.drawable.book))
        list.add(Model("Student Survival Guide", "Maths Textbook, By Hanri", R.drawable.book))
        list.add(Model("Pure Mathematics For College", "Publisher By Author Max", R.drawable.book))
        list.add(Model("Engineering Mathematics II", "For University and College", R.drawable.book))
        list.add(Model("History Of Nigeria", "By Hamdal International", R.drawable.book))
        list.add(Model("Understanding Of Cloud", "Prof Timothy Chirs", R.drawable.book))


        listview.adapter = MyAdapter(this, R.layout.row, list)



        listview.setOnItemClickListener { parent:AdapterView<*>  , view: View , position:Int, id:Long ->

            if (position == 0){

                Toast.makeText(this, "babangida", Toast.LENGTH_LONG).show()
            }

            if (position == 1){

                Toast.makeText(this, "babangida", Toast.LENGTH_LONG).show()
            }

            if (position == 2){

                Toast.makeText(this, "babangida", Toast.LENGTH_LONG).show()
            }

            if (position == 3){

                Toast.makeText(this, "babangida", Toast.LENGTH_LONG).show()
            }

            if (position == 4){

                Toast.makeText(this, "babangida", Toast.LENGTH_LONG).show()
            }



        }


    }
}
