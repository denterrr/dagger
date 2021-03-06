package den.ter.feature_home.di

import dagger.Module
import dagger.Provides
import den.ter.core.di.CoreModule
import den.ter.core.di.First
import den.ter.core.di.Second
import den.ter.feature_home.data.ApiService
import den.ter.feature_home.data.SecondApiService
import retrofit2.Retrofit

@Module
class HomeModule {

    @Provides
    @HomeScope
    fun provideApiService(@First retrofit: Retrofit): ApiService {
        return retrofit.create(ApiService::class.java)
    }

    @Provides
    @HomeScope
    fun provideSecondApiService(@Second retrofit: Retrofit): SecondApiService {
        return retrofit.create(SecondApiService::class.java)
    }
}