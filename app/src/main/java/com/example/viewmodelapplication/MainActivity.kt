package com.example.viewmodelapplication

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.example.viewmodelapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    val viewModel : MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)

        viewModel.countlive.observe(this) {

            binding.textView.text = "$it"

        }

        binding.button.setOnClickListener {
            //lets run this MainActivity sub class>>>
            viewModel.countlogic()
            //we did yeah..clap clap clap......!!!!!!!!!!Buisness Logic
        }
    }
}