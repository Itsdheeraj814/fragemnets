package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.btn1
import kotlinx.android.synthetic.main.activity_main.btn2

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val FirstFragement = FirstFragement()
        val SecondFragement = SecondFragement()


        supportFragmentManager.beginTransaction().apply {
            replace(R.id.FlFragement,FirstFragement)
            commit()
        }

        btn1.setOnClickListener(){
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.FlFragement,FirstFragement)
                addToBackStack(null)
                commit()
            }
        }

        btn2.setOnClickListener(){
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.FlFragement,SecondFragement)
                addToBackStack(null)
                commit()
            }
        }

    }

}