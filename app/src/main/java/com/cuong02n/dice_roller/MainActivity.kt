package com.cuong02n.dice_roller

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.cuong02n.dice_roller.ui.theme.DiceRollerTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button : Button = findViewById(R.id.rollButton)

        button.setOnClickListener {
            val dice = (1..6).random()
            val img: ImageView = findViewById(R.id.imageView)
            when (dice) {
                1 -> img.setImageResource(R.drawable.dice_1)
                2 -> img.setImageResource(R.drawable.dice_2)
                3 -> img.setImageResource(R.drawable.dice_3)
                4 -> img.setImageResource(R.drawable.dice_4)
                5 -> img.setImageResource(R.drawable.dice_5)
                6 -> img.setImageResource(R.drawable.dice_6)
            }
            Toast.makeText(this, dice.toString(), Toast.LENGTH_SHORT).show()
        }
    }
}