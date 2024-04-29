package com.example.socialappdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.socialappdemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.vfollwers.posttext.setText("followers")
        binding.vfollwers.tvPostscount.setText("100")

        binding.vfollowing.tvPostscount.setText("100")
        binding.vfollowing.posttext.setText("following")


    }
}