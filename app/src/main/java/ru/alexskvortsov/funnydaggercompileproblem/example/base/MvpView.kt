package ru.alexskvortsov.funnydaggercompileproblem.example.base

import androidx.annotation.StringRes

interface MvpView {

    fun showMessage(message: String)
    fun showMessage(@StringRes res: Int)

}