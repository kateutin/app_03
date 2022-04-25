package com.example.app_03

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.app_03.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        val diceImage1 = binding.dice1 //이미지를 찾아옴
        val diceImage2 = binding.dice2

        binding.diceStartBtn.setOnClickListener{

            Toast.makeText(this, "주사위 Go", Toast.LENGTH_LONG).show()

            Log.d("MainActivity", Random.nextInt(1,6).toString())
            Log.d("MainActivity", Random.nextInt(1,6).toString())//숫자를 문자열로 바꿔줌

            val number1 = Random.nextInt(1,6)//number 1에 1~6까지 랜덤의 값을 넣어 준다
            val number2 = Random.nextInt(1,6)

            if(number1 == 1){
                diceImage1.setImageResource(R.drawable.dice_1)
            } else if (number1 == 2){
                diceImage1.setImageResource(R.drawable.dice_2)
            } else if (number1 == 3){
                diceImage1.setImageResource(R.drawable.dice_3)
            } else if (number1 == 4) {
                diceImage1.setImageResource(R.drawable.dice_4)
            } else if (number1 == 5) {
                diceImage1.setImageResource(R.drawable.dice_5)
            } else {
                diceImage1.setImageResource(R.drawable.dice_6)
            }

            //if문 if (조건){실행 해야 할 내용}
            if(number2 == 1){
                diceImage2.setImageResource(R.drawable.dice_1)
            } else if (number2 == 2){
                diceImage2.setImageResource(R.drawable.dice_2)
            } else if (number2 == 3){
                diceImage2.setImageResource(R.drawable.dice_3)
            } else if (number2 == 4) {
                diceImage2.setImageResource(R.drawable.dice_4)
            } else if (number2 == 5) {
                diceImage2.setImageResource(R.drawable.dice_5)
            } else {
                diceImage2.setImageResource(R.drawable.dice_6)
            }
        }

    }
}