package den.ter.feature_home.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModelProvider
import den.ter.feature_home.R
import den.ter.feature_home.databinding.ActivitySecondBinding
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.schedulers.Schedulers

class SecondActivity : AppCompatActivity() {

    lateinit var homeViewModel: HomeViewModel
    lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }

    override fun onStart() {
        super.onStart()

        homeViewModel = ViewModelProvider(this).get(HomeViewModel::class.java)
        homeViewModel.getSecondData()
            .retry(3)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({
                binding.tv.text = it.price.toString()
            },{
                it.localizedMessage?.let { it1 -> Log.e("error", it1) }
                binding.tv.text = "error"
            })

        homeViewModel.getData()
            .retry(3)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({
                binding.tv2.text = it.info.count.toString()
            },{
                it.localizedMessage?.let { it1 -> Log.e("error", it1) }
                binding.tv.text = "error"
            })

    }
}