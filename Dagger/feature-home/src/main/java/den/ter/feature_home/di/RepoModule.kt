package den.ter.feature_home.di

import dagger.Binds
import dagger.Module
import den.ter.feature_home.data.Repository
import den.ter.feature_home.domain.RepositoryInterface
import javax.inject.Singleton

@Module
interface RepoModule {

    @Binds
    @Singleton
    fun provideRepo(repository: Repository): RepositoryInterface
}