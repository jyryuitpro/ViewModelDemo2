package io.jyryuitpro.viewmodeldemo2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import io.jyryuitpro.viewmodeldemo2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: MainActivityViewModel
    private lateinit var viewModelFactory: MainActivityViewModelFactory

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // setContentView(R.layout.activity_main)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        viewModelFactory = MainActivityViewModelFactory(125)
        viewModel = ViewModelProvider(this, viewModelFactory).get(MainActivityViewModel::class.java)
        binding.myViewModel = viewModel
        binding.lifecycleOwner = this

//        binding.resultTextView.text = viewModel.getTotal().toString()

        // initial
        // viewModel.total.observe(this, Observer {
//        viewModel.totalData.observe(this, Observer {
//            binding.resultTextView.text = it.toString()
//        })


//        binding.insertButton.setOnClickListener {
//            viewModel.setTotal(binding.inputEditText.text.toString().toInt())
//            binding.resultTextView.text = viewModel.getTotal().toString()
//        }
    }
}