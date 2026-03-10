package com.example.mycontacts

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.util.Log
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        val firstName = "Matthew"
            val lastName = "Lawrence"
                val address = "21 Church Road"
                    val isMale = true
                        val dayOfBirth = 18
                            val monthOfBirth = 4
                                val yearOfBirth = 2007

        Log.d("Hello" , "Your name is " + firstName + " " + lastName + " " + "Your Address"
                + " " + address + " " + "Are you male" + isMale + " " + "Your day of birth "
                + dayOfBirth + " " + "Your month of birth " + monthOfBirth+ " " + "Birthday year "
                + yearOfBirth + " ")

        val currentYear = 2026
        val age = currentYear - yearOfBirth
        val yearsUntil100 = 100 - age
        val ageInMonths = age * 12
        val remainder = age % 5
        val ageInDays = age * 365

        Log.d("Hello","remainder: $remainder")
        Log.d("Hello","yearsUntil100: $yearsUntil100")
        Log.d("Hello","ageInMonths: $ageInMonths")
        Log.d("Hello","ageInDays: $ageInDays")



        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}