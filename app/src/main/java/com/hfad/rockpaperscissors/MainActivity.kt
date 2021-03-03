package com.hfad.rockpaperscissors

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ProgressBar
import android.widget.TextView
import androidx.core.view.isVisible

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    var judge = Judge()

    fun getGameChoise(): String //тут комп рандомно делает свойй выбор
    {
        var options: Array<String> = arrayOf("Камень", "Ножницы", "Бумага")
        var gameChoise: String = options[(Math.random() * options.size).toInt()]
        return gameChoise
    }


    fun onClickPaperButton(view: View) { //поведение при клике по кнопке "бумага"

        var text: TextView = findViewById(R.id.text)//текст который показываем пользователю
        var result = judge.getResult(getGameChoise(), "Бумага")
        text.setText(result)

        var paper_button: Button = findViewById((R.id.paper_button))
        var rock_button: Button = findViewById((R.id.rock_button))
        var scissors_button: Button = findViewById((R.id.scissors_button))

        paper_button.isEnabled = false
        rock_button.isEnabled = false
        scissors_button.isEnabled = false

        var prograssBar: ProgressBar = findViewById(R.id.progressBar)

        prograssBar.isVisible = false

    }

    fun onClickRockButton(view: View) { //поведение при клике по кнопке "Камень"

        var text: TextView = findViewById(R.id.text)//текст который показываем пользователю
        var result = judge.getResult(getGameChoise(), "Камень")
        text.setText(result)

        var paper_button: Button = findViewById((R.id.paper_button))
        var rock_button: Button = findViewById((R.id.rock_button))
        var scissors_button: Button = findViewById((R.id.scissors_button))

        paper_button.isEnabled = false
        rock_button.isEnabled = false
        scissors_button.isEnabled = false

        var prograssBar: ProgressBar = findViewById(R.id.progressBar)

        prograssBar.isVisible = false


    }

    fun onClickScissorsButton(view: View) { //поведение при клике по кнопке "Ножницы"

        var text: TextView = findViewById(R.id.text)//текст который показываем пользователю
        var result = judge.getResult(getGameChoise(), "Ножницы")
        text.setText(result)

        var paper_button: Button = findViewById((R.id.paper_button))
        var rock_button: Button = findViewById((R.id.rock_button))
        var scissors_button: Button = findViewById((R.id.scissors_button))

        paper_button.isEnabled = false
        rock_button.isEnabled = false
        scissors_button.isEnabled = false

        var prograssBar: ProgressBar = findViewById(R.id.progressBar)

        prograssBar.isVisible = false


    }

    fun onClickPlayButton(view: View) { //Поведение при клике по кнопке "Играть"

        var text: TextView = findViewById(R.id.text)//текст который показываем пользователю
        text.setText(R.string.empty_option)

        var paper_button: Button = findViewById((R.id.paper_button))
        var rock_button: Button = findViewById((R.id.rock_button))
        var scissors_button: Button = findViewById((R.id.scissors_button))

        paper_button.isEnabled = true
        rock_button.isEnabled = true
        scissors_button.isEnabled = true

        var prograssBar: ProgressBar = findViewById(R.id.progressBar)

        prograssBar.isVisible = true
    }

}