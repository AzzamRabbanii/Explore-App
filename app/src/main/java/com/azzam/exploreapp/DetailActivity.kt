package com.azzam.exploreapp

import android.os.Bundle

import androidx.appcompat.app.AppCompatActivity
import com.azzam.exploreapp.databinding.ActivityDetailBinding
import com.bumptech.glide.Glide

class DetailActivity: AppCompatActivity() {

    lateinit var binding: ActivityDetailBinding

    companion object{
        const val EXPLORE_DATA = "explore"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbarDetail)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val dataExplore = intent.getParcelableExtra<DetailExplore>(EXPLORE_DATA) as DetailExplore

        binding.apply {
            tvDescriptions.text = dataExplore.description
        }
        Glide.with(this).load(dataExplore.photo).into(binding.imgDetail)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}