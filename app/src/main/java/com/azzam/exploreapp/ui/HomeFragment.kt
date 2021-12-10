package com.azzam.exploreapp.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.azzam.exploreapp.DataExploreApp
import com.azzam.exploreapp.DetailAdapter
import com.azzam.exploreapp.R
import com.azzam.exploreapp.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
        private var _binding: FragmentHomeBinding? = null
        private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)

        binding.rvHome?.apply {
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(context)
            adapter = DetailAdapter(DataExploreApp.listEifel)
        }
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}