package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.btnAdd
import kotlinx.android.synthetic.main.activity_main.btnDiv
import kotlinx.android.synthetic.main.activity_main.btnMul
import kotlinx.android.synthetic.main.activity_main.btnSub
import kotlinx.android.synthetic.main.activity_main.eTInput1
import kotlinx.android.synthetic.main.activity_main.eTInput2
import kotlinx.android.synthetic.main.activity_main.resultTextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnAdd.setOnClickListener {
            val input1 = eTInput1.text.toString().toInt()
            val input2 = eTInput2.text.toString().toInt()
            resultTextView.text = (input1 + input2).toString()
        }
        btnSub.setOnClickListener {
                val input1 = eTInput1.text.toString().toInt()
                val input2 = eTInput2.text.toString().toInt()
                resultTextView.text = (input1 - input2).toString()

        }
        btnDiv.setOnClickListener {
            val input1 = eTInput1.text.toString().toInt()
            val input2 = eTInput2.text.toString().toInt()
            resultTextView.text = (input1 / input2).toString()
        }
        btnMul.setOnClickListener {
            val input1 = eTInput1.text.toString().toInt()
            val input2 = eTInput2.text.toString().toInt()
            resultTextView.text = (input1 * input2).toString()
        }
    }
}