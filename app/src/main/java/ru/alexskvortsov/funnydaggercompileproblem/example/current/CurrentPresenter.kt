package ru.alexskvortsov.funnydaggercompileproblem.example.current

import android.content.Context
import ru.alexskvortsov.funnydaggercompileproblem.R
import ru.alexskvortsov.funnydaggercompileproblem.example.base.Presenter
import javax.inject.Inject

class CurrentPresenter @Inject constructor(
    private val context: Context
) : Presenter<CurrentView>() {

    override fun bindView(view: CurrentView) {
        super.bindView(view)

        view.showCurrentTitle(context.getString(R.string.currentScreen))
    }

    fun onNavigateToNew() {
        view.navigateToNew()
    }

    fun onNavigateToOld() {
        view.navigateToOld()
    }

}