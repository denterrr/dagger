package den.ter.feature_home.di

import dagger.Component
import den.ter.core.di.CoreComponent
import den.ter.feature_home.data.ApiService
import den.ter.feature_home.data.SecondApiService
import den.ter.feature_home.presentation.HomeViewModel
import javax.inject.Scope
import javax.inject.Singleton

@HomeScope
@Component(modules = [HomeModule::class, RepoModule::class], dependencies = [CoreComponent::class])
interface HomeComponent {


    fun inject(mainActivity: HomeViewModel)


}

@Scope
annotation class HomeScope