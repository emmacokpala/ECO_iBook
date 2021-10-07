package com.example.eco_ibook.fragments

import android.annotation.SuppressLint
import android.os.Bundle
import android.os.Handler
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import com.example.eco_ibook.R
import com.example.eco_ibook.databinding.FragmentSplashScreen1Binding

@SuppressLint("CustomSplashScreen")
class SplashScreen1 : Fragment() {

    private var _binding: FragmentSplashScreen1Binding? = null
    private val binding get() = _binding!!
    private lateinit var navCon: NavController

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentSplashScreen1Binding.inflate(inflater, container, false)
        navCon = NavHostFragment.findNavController(this)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val bundle = Bundle()
        Handler().postDelayed({
            navCon.navigate(R.id.action_splashScreen1_to_onboardingScreen, bundle)
        }, 2000)
    }
}