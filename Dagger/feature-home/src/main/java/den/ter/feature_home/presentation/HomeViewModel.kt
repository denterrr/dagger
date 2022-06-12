package den.ter.feature_home.presentation

import android.app.Application
import android.util.Log
import androidx.lifecycle.*
import den.ter.feature_home.data.Repository
import den.ter.feature_home.di.DaggerHomeComponent
import den.ter.feature_home.domain.models.Morty
import den.ter.feature_home.domain.models.resp2.two
import den.ter.feature_home.domain.usecases.FirstUseCase
import den.ter.feature_home.domain.usecases.SecondUseCase
import io.reactivex.rxjava3.core.Single
import kotlinx.coroutines.launch
import javax.inject.Inject

class HomeViewModel(application: Application) : AndroidViewModel(application) {


    @Inject
    lateinit var firstUseCase: FirstUseCase

    @Inject
    lateinit var secondUseCase: SecondUseCase


    init {
        val comp = DaggerHomeComponent.create()
        comp.inject(this)
    }



    fun getData() = Single.create<Morty> { emitter ->
        Log.e("aa", "getdata")
        viewModelScope.launch{
            firstUseCase.execute().let {
                Log.e("aa", "resp")
                if (it.isSuccessful) {
                    emitter.onSuccess(it.body()!!)
                } else {
                    Log.e("mytag", "Error Response")
                }
            }
        }
    }

    fun getSecondData() = Single.create<two> { emitter ->
        Log.e("aa", "getdata")
        viewModelScope.launch{
            secondUseCase.execute().let {
                Log.e("aa", "resp")
                if (it.isSuccessful) {
                    emitter.onSuccess(it.body()!!)
                } else {
                    Log.e("mytag", "Error Response")
                }
            }
        }
    }

}