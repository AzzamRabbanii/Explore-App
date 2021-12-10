package com.azzam.exploreapp.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import com.azzam.exploreapp.DataExploreApp
import com.azzam.exploreapp.DetailAdapter
import com.azzam.exploreapp.DetailExplore
import com.azzam.exploreapp.R
import com.azzam.exploreapp.databinding.FragmentParisBinding


class ParisFragment : Fragment() {
    private var _binding: FragmentParisBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
    _binding = FragmentParisBinding.inflate(inflater, container, false)

        binding.rvParis.apply {
            setHasFixedSize(true)
            layoutManager = GridLayoutManager(context, 2)
            adapter = DetailAdapter(DataExploreApp.listEifel)
        }
        return binding.root
  }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

}