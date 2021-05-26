package com.example.demolib1

import android.database.DatabaseUtils
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.demolib1.databinding.ActivityMainBinding
import com.example.mystringlibrary.StringUtil

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    val stringUtil = StringUtil()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)

        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        binding.button.setOnClickListener {
            binding.textView.text = stringUtil.reverse(binding.editTextTextPersonName.text.toString())
        }
    }
}