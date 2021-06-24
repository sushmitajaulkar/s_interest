package org.example.simple_interest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val loginButton: Button = findViewById(R.id.btn_Cal)
        val etPrinciple : EditText = findViewById(R.id.et_Principle)
        val etRate : EditText = findViewById(R.id.et_Rate)
        val etTime : EditText = findViewById(R.id.et_Time)
        val tvAns : TextView = findViewById(R.id.tv_Ans)

        loginButton.setOnClickListener {
            val p = etPrinciple.text.toString().toFloat()
            val r = etRate.text.toString().toFloat()
            val t = etTime.text.toString().toFloat()
            val si = p * r * t
            tvAns.text = si.toString()
            Toast.makeText(this, "Calculate Successfully", Toast.LENGTH_LONG).show()
        }
    }

}
