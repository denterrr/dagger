package den.ter.feature_home.di

import dagger.Component
import den.ter.feature_home.presentation.HomeViewModel
import javax.inject.Singleton

@Singleton
@Component(modules = [HomeModule::class, RepoModule::class])
interface HomeComponent {
    fun inject(mainActivity: HomeViewModel)
}