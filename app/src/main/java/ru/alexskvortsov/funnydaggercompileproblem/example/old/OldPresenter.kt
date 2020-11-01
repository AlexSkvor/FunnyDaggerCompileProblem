package ru.alexskvortsov.funnydaggercompileproblem.example.old

import android.content.Context
import ru.alexskvortsov.funnydaggercompileproblem.R
import ru.alexskvortsov.funnydaggercompileproblem.example.base.Presenter
import javax.inject.Inject

class OldPresenter @Inject constructor(
    private val context: Context
) : Presenter<OldView>() {

    override fun bindView(view: OldView) {
        super.bindView(view)
        view.showOldTitle(context.getString(R.string.oldScreen))
    }

    fun onBackPressed() {
        view.navigateToCurrent()
    }

    fun onNavigateToCurrent() {
        view.navigateToCurrent()
    }

}