package ru.alexskvortsov.funnydaggercompileproblem.di

class ComponentProvider {

    private lateinit var appComponent: AppComponent

    fun init(appComponent: AppComponent) {
        this.appComponent = appComponent
    }

    fun getPresentersComponent(): AppComponent {
        checkInitialized(appComponent)
        return appComponent
    }

    private fun checkInitialized(component: Any?) {
        if (component == null) {
            throw IllegalArgumentException("appComponent was not initialized!")
        }
    }

    companion object {
        private var instance: ComponentProvider? = null

        fun get(): ComponentProvider {
            if (instance == null) {
                synchronized(ComponentProvider::class.java) {
                    if (instance == null) {
                        instance = ComponentProvider()
                    }
                }
            }
            return instance!!
        }
    }
}
