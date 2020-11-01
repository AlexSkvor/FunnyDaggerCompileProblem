package ru.alexskvortsov.funnydaggercompileproblem.example.new

import android.content.Context
import ru.alexskvortsov.funnydaggercompileproblem.R
import ru.alexskvortsov.funnydaggercompileproblem.example.base.Presenter
import javax.inject.Inject

class NewPresenter @Inject constructor(
    private val context: Context
) : Presenter<NewView>() {

    override fun bindView(view: NewView) {
        super.bindView(view)
        view.setNewTitle(context.getString(R.string.newScreen))
    }

    fun onNavigateToCurrent() {
        view.navigateToCurrent()
    }

    fun onBackPressed() {
        view.navigateToCurrent()
    }

}