package ru.alexskvortsov.funnydaggercompileproblem.example.base

import androidx.annotation.CallSuper

abstract class Presenter<VIEW : MvpView> {

    protected lateinit var view: VIEW
        private set

    @CallSuper
    open fun bindView(view: VIEW) {
        this.view = view
    }

    @CallSuper
    fun onStop() {
        // cleaning work
    }
}