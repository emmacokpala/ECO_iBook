package com.example.eco_ibook.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import com.example.eco_ibook.R
import com.example.eco_ibook.databinding.FragmentSignInBinding
import com.example.eco_ibook.databinding.FragmentSplashScreen2Binding

class SplashScreen2 : Fragment() {

    private var _binding: FragmentSplashScreen2Binding? = null
    private val binding get() = _binding!!
    private lateinit var navCon: NavController

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentSplashScreen2Binding.inflate(inflater, container, false)
        navCon = NavHostFragment.findNavController(this)
        return binding.root
    }
}