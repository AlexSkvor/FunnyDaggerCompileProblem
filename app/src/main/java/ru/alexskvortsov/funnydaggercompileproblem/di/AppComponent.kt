package ru.alexskvortsov.funnydaggercompileproblem.di

import dagger.Component
import ru.alexskvortsov.funnydaggercompileproblem.example.current.CurrentActivity
import ru.alexskvortsov.funnydaggercompileproblem.example.new.NewActivity
import ru.alexskvortsov.funnydaggercompileproblem.example.old.OldActivity
import javax.inject.Singleton

@Singleton
@Component(
    modules = [AppModule::class]
)

interface AppComponent {
    fun inject(currentActivity: CurrentActivity)
    fun inject(oldActivity: OldActivity)
    fun inject(newActivity: NewActivity)
}