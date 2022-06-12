package den.ter.dagger

import android.app.Application
import den.ter.core.di.CoreComponent
import den.ter.core.di.DaggerCoreComponent
import den.ter.dagger.di.*
import den.ter.feature_home.di.DaggerHomeComponent
import den.ter.feature_home.di.HomeComponent

class App: Application() {

    lateinit var appComponent: AppComponent
    lateinit var coreComponent: CoreComponent
    lateinit var homeComponent: HomeComponent
    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.create()
        coreComponent = DaggerCoreComponent.create()
        homeComponent = DaggerHomeComponent.create()
    }
}