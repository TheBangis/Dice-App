package com.example.diceroller

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import org.w3c.dom.Text
import kotlin.random.Random
import kotlin.random.nextInt

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        startBtn.setOnClickListener{
            intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }
            /* val rollButton : Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener{
            rollDice()
        }*/

        }

        /* private fun rollDice() {


       val randomInt =  java.util.Random().nextInt(6) + 1

       val drawableImage =  when(randomInt){

            1 -> R.drawable.images1
            2 -> R.drawable.images2
            3 -> R.drawable.images3
            4 -> R.drawable.images4
            5 -> R.drawable.images5
            else -> R.drawable.images6
        }

        val diceImage: ImageView = findViewById(R.id.dice_image)

        diceImage.setImageResource(drawableImage)


    }*/


    }

