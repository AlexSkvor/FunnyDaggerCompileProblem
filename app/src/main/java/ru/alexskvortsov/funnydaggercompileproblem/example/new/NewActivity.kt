package ru.alexskvortsov.funnydaggercompileproblem.example.new

import kotlinx.android.synthetic.main.activity_new.*
import ru.alexskvortsov.funnydaggercompileproblem.R
import ru.alexskvortsov.funnydaggercompileproblem.di.ComponentProvider
import ru.alexskvortsov.funnydaggercompileproblem.example.base.MvpActivity
import ru.alexskvortsov.funnydaggercompileproblem.example.utils.navigateToCurrentScreen
import javax.inject.Inject

class NewActivity : MvpActivity(), NewView {

    override val layout: Int = R.layout.activity_new

    @Inject
    lateinit var presenter: NewPresenter

    override fun initPresenter() {
        ComponentProvider.get().getPresentersComponent().inject(this)
        presenter.bindView(this)

        currentScreenButton.setOnClickListener { presenter.onNavigateToCurrent() }
    }

    override fun stopPresenter() {
        presenter.onStop()
    }

    override fun setNewTitle(title: String) {
        newTitle.text = title
    }

    override fun navigateToCurrent() {
        navigateToCurrentScreen()
    }

    override fun onBackPressed() {
        presenter.onBackPressed()
    }
}