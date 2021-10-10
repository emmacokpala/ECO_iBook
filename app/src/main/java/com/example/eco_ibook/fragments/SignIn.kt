package com.example.eco_ibook.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import com.example.eco_ibook.R
import com.example.eco_ibook.databinding.FragmentSignInBinding

class SignIn : Fragment() {

    private var _binding: FragmentSignInBinding? = null
    private val binding get() = _binding!!
    private lateinit var navCon: NavController

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentSignInBinding.inflate(inflater, container, false)
        navCon = NavHostFragment.findNavController(this)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.signinButton.setOnClickListener {
            navCon.navigate(R.id.action_signIn_to_categorisation)
        }

        binding.signinFooter1.setOnClickListener {
            navCon.navigate(R.id.action_signIn_to_signUp)
        }
    }
}