package ru.ladgertha.mvpexample

class Presenter(private val view: MainView) {
    private val model = Model()

    fun onButtonCountClick() {
        val newNumber = sum(model.number)
        model.number = newNumber
        view.setButtonText(newNumber)
    }

    private fun sum(number: Int) = number + 2
}