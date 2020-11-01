package ru.alexskvortsov.funnydaggercompileproblem.example.current

import ru.alexskvortsov.funnydaggercompileproblem.example.base.MvpView

interface CurrentView : MvpView {

    fun showCurrentTitle(title: String)
    fun navigateToNew()
    fun navigateToOld()

}