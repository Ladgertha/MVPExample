package ru.ladgertha.mvpexample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), MainView {

    private val presenter = Presenter(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        count_button.setOnClickListener {
            presenter.onButtonCountClick()
        }
    }

    override fun setButtonText(number: Int) {
        count_button.text = number.toString()
    }
}