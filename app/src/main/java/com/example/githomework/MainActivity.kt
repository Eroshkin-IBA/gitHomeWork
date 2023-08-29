package com.example.githomework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.githomework.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var counter: Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.textView.text = counter.toString()
        binding.button.setOnClickListener {
            ++counter
            binding.textView.text = counter.toString()
        }
    }
}