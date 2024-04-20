package com.example.tempconverter.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.tempconverter.R
import com.example.tempconverter.data.reposytori.saveReposytImpl
import com.example.tempconverter.domaine.usecase.convertingUseCase
import com.example.tempconverter.domaine.usecase.getResulUseCase
import com.example.tempconverter.domaine.usecase.saveResultUseCase

class MainActivity : AppCompatActivity() {
    val repos  by lazy{saveReposytImpl(context = applicationContext)}
    val saveUse  by lazy{saveResultUseCase(repos)}
    val getUse  by lazy {getResulUseCase(repos)}
    val calculate  by lazy{convertingUseCase()}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textIn = findViewById<EditText>(R.id.textIn)
        val textOut = findViewById<TextView>(R.id.textOut)
        val Button = findViewById<Button>(R.id.button)
        val saveBut = findViewById<Button>(R.id.saveButt)

        textOut.text = getUse.get()

        Button.setOnClickListener(){
            val temp = textIn.text.toString()
            val result = calculate.calculate(temp)
            textOut.text = result

        }
        saveBut.setOnClickListener(){
            val calc = textOut.text.toString()
            saveUse.saveGet(calc)
        }
    }
}