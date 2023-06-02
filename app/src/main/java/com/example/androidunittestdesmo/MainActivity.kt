package com.example.androidunittestdesmo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.androidunittestdesmo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.one.setOnClickListener {
            binding.tv.text = "one"
        }

        binding.two.setOnClickListener {
            binding.tv.text = "two"
        }

        binding.three.setOnClickListener {
            binding.tv.text = "three"
        }

        binding.four.setOnClickListener {
            binding.tv.text = "four"
        }

        binding.five.setOnClickListener {
            binding.tv.text = "five"
        }
    }


}
