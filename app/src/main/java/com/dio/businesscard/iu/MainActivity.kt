package com.dio.businesscard.iu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dio.businesscard.R
import com.dio.businesscard.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy{ActivityMainBinding.inflate(layoutInflater)}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}