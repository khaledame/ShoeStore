package com.ameer.shoeStore.splashScreens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.ameer.shoestore.R
import com.ameer.shoestore.databinding.WelcomeScreenBinding

class WelcomeScreen : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        val binding = DataBindingUtil.inflate<WelcomeScreenBinding>(inflater,
            R.layout.welcome_screen,container,false)
         binding.btNext.setOnClickListener{
             findNavController().navigate(R.id.action_welcomeScreen_to_welcomeScreen2)}

             return binding.root
         }
    }