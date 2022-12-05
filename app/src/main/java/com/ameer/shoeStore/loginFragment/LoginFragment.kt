package com.ameer.shoeStore.loginFragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.ameer.shoestore.R
import com.ameer.shoestore.databinding.LoginScreenBinding

class LoginFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View {
        val binding = DataBindingUtil.inflate<LoginScreenBinding>(
            inflater, R.layout.login_screen, container, false)

        binding.btSignIn.setOnClickListener{
            findNavController().navigate(R.id.action_loginFragment_to_welcomeScreen)
        }
        binding.btSignUp.setOnClickListener{

        }
        return binding.root
    }
}