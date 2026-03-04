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
        var firstName = "Matthew"
            var lastName = "Lawrence"
                var Address = "21 Church Road"
                    var isMale = true
                        var dayOfBirth = 18
                            var monthOfBirth = 4
                                var yearOfBirth = 2007
        Log.d("Hello" , "Your name is" + firstName + " " + lastName + " " + "Your Address" + "" + Address + " " + "Are you male" + isMale)
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}