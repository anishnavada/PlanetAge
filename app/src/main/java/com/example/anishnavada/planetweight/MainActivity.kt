package com.example.anishnavada.planetweight

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Mercury.setOnClickListener {
            changeAge(87.97)
        }
        Mars.setOnClickListener {
            changeAge(686.2)
        }
        Venus.setOnClickListener {
            changeAge(224.7)
        }
        Uranus.setOnClickListener {
            changeAge(30663.65)
        }
        Jupiter.setOnClickListener {
            changeAge(4328.9)
        }
        Saturn.setOnClickListener {
            changeAge(10752.9)
        }
    }

   fun changeAge(factor: Double){
       try {
           error_message.text = ""
           var days_old =
               (years.text.toString().toDouble() * 365.0) + (months.text.toString().toDouble() * 30.0) + (days.text.toString().toDouble())
           var result_years = days_old / factor
           result.text = result_years.toString()
       }
       catch (e: Exception){
           error_message.text = "Make sure all of your inputs are numbers!"
       }
    }
}
