package com.ameer.shoeStore.splashScreens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.ameer.shoestore.R
import com.ameer.shoestore.databinding.WelcomeScreen2Binding


class WelcomeScreen2 : Fragment() {



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = DataBindingUtil.inflate<WelcomeScreen2Binding>(inflater,
            R.layout.welcome_screen2,container,false)
        binding.btStart.setOnClickListener{
            findNavController().navigate(R.id.action_welcomeScreen2_to_homeScreen)}
        return binding.root
    }

}