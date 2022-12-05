package com.ameer.shoeStore.splashScreens

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.ameer.shoestore.R
import com.ameer.shoestore.databinding.SplashScreenBinding

class SplashScreen : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = DataBindingUtil.inflate<SplashScreenBinding>(
            inflater,
            R.layout.splash_screen,
            container,
            false
        )
        Handler(Looper.getMainLooper()).postDelayed({
            findNavController().navigate(R.id.action_splashScreen_to_loginFragment)
        }, 3000)
        return binding.root
    }
}