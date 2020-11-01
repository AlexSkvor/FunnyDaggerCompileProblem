package ru.alexskvortsov.funnydaggercompileproblem.example.current

import kotlinx.android.synthetic.main.activity_current.*
import ru.alexskvortsov.funnydaggercompileproblem.R
import ru.alexskvortsov.funnydaggercompileproblem.di.ComponentProvider
import ru.alexskvortsov.funnydaggercompileproblem.example.base.MvpActivity
import ru.alexskvortsov.funnydaggercompileproblem.example.utils.navigateToNewScreen
import ru.alexskvortsov.funnydaggercompileproblem.example.utils.navigateToOldScreen
import javax.inject.Inject

class CurrentActivity : MvpActivity(), CurrentView {

    override val layout: Int = R.layout.activity_current

    @Inject
    lateinit var presenter: CurrentPresenter

    override fun initPresenter() {
        ComponentProvider.get().getPresentersComponent().inject(this)
        presenter.bindView(this)

        oldScreenButton.setOnClickListener { presenter.onNavigateToOld() }
        newScreenButton.setOnClickListener { presenter.onNavigateToNew() }
    }

    override fun stopPresenter() {
        presenter.onStop()
    }

    override fun showCurrentTitle(title: String) {
        currentTitle.text = title
    }

    override fun navigateToNew() {
        navigateToNewScreen()
    }

    override fun navigateToOld() {
        navigateToOldScreen()
    }

    override fun onBackPressed() {}

}