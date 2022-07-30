package com.dio.businesscard.iu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dio.businesscard.databinding.ActivityAddBusinessCardBinding

class AddBusinessCardActivity : AppCompatActivity() {
    private val binding by lazy { ActivityAddBusinessCardBinding.inflate(layoutInflater)}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        insertListeners()
    }

    private fun insertListeners(){
        binding.bntClose.setOnClickListener{
            finish()
        }

        binding.btnConfirm.setOnClickListener{

        }
    }
}