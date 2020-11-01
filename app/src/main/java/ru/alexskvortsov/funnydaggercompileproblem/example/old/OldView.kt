package ru.alexskvortsov.funnydaggercompileproblem.example.old

import ru.alexskvortsov.funnydaggercompileproblem.example.base.MvpView

interface OldView : MvpView {

    fun showOldTitle(title: String)
    fun navigateToCurrent()

}