package ru.alexskvortsov.funnydaggercompileproblem.example.old

import kotlinx.android.synthetic.main.activity_old.*
import ru.alexskvortsov.funnydaggercompileproblem.di.ComponentProvider
import ru.alexskvortsov.funnydaggercompileproblem.example.base.MvpActivity
import ru.alexskvortsov.funnydaggercompileproblem.R
import ru.alexskvortsov.funnydaggercompileproblem.example.utils.navigateToCurrentScreen
import javax.inject.Inject

class OldActivity : MvpActivity(), OldView {

    override val layout: Int = R.layout.activity_old

    @Inject
    lateinit var presenter: OldPresenter

    override fun initPresenter() {
        ComponentProvider.get().getPresentersComponent().inject(this)
        presenter.bindView(this)

        currentScreenButton.setOnClickListener { presenter.onNavigateToCurrent() }
    }

    override fun stopPresenter() {
        presenter.onStop()
    }

    override fun showOldTitle(title: String) {
        oldTitle.text = title
    }

    override fun navigateToCurrent() {
        navigateToCurrentScreen()
    }

    override fun onBackPressed() {
        presenter.onBackPressed()
    }
}