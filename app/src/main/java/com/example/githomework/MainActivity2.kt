package com.example.githomework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.githomework.databinding.ActivityMain2Binding
import com.example.githomework.databinding.ActivityMainBinding

class MainActivity2 : AppCompatActivity() {
    private lateinit var binding: ActivityMain2Binding

    companion object {
        const val SOCCER = "soccer"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.textView2.text = "you pressed ${intent?.extras?.getInt(SOCCER)}"
    }
}