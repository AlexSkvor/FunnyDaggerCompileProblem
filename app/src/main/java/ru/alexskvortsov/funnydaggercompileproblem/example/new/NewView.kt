package ru.alexskvortsov.funnydaggercompileproblem.example.new

import ru.alexskvortsov.funnydaggercompileproblem.example.base.MvpView

interface NewView : MvpView {

    fun setNewTitle(title: String)

    fun navigateToCurrent()

}