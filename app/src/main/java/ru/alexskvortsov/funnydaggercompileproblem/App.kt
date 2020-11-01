package ru.alexskvortsov.funnydaggercompileproblem

import android.app.Application
import ru.alexskvortsov.funnydaggercompileproblem.di.AppModule
import ru.alexskvortsov.funnydaggercompileproblem.di.ComponentProvider
import ru.alexskvortsov.funnydaggercompileproblem.di.DaggerAppComponent
import timber.log.Timber
import voodoo.rocks.flux.lifecyclecallbacks.ActivityLifecycleLogger

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        registerActivityLifecycleCallbacks(ActivityLifecycleLogger)
        initTimber()
        initComponentProvider()
    }

    private fun initTimber(){
        Timber.plant(Timber.DebugTree())
    }

    private fun initComponentProvider() {
        val appComponent = DaggerAppComponent.builder()
            .appModule(AppModule(this))
            .build()
        ComponentProvider.get().init(appComponent)
    }

}