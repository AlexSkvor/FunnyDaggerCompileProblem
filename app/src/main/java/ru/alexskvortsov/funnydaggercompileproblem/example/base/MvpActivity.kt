package ru.alexskvortsov.funnydaggercompileproblem.example.base

import android.os.Bundle
import android.view.Gravity
import android.widget.Toast
import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatActivity

abstract class MvpActivity : AppCompatActivity(), MvpView {

    protected abstract val layout: Int
        @LayoutRes get

    protected abstract fun initPresenter()
    protected abstract fun stopPresenter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout)
        initPresenter()
    }

    override fun onStop() {
        stopPresenter()
        super.onStop()
    }

    override fun showMessage(message: String) {
        val toast = Toast.makeText(this, message, Toast.LENGTH_SHORT)
        toast.setGravity(Gravity.BOTTOM, 0, 0)
        toast.show()
    }

    override fun showMessage(res: Int) {
        showMessage(getString(res))
    }
}