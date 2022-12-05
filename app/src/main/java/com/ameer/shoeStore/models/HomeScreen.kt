package com.ameer.shoeStore.models

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.ameer.shoeStore.adapters.ShoeAdapter
import com.ameer.shoestore.R
import com.ameer.shoestore.databinding.HomeScreenBinding

class HomeScreen : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        val binding = DataBindingUtil.inflate<HomeScreenBinding>(inflater,
            R.layout.home_screen,container,false)
        binding.tbHome.title = "home"
        binding.tbHome.setNavigationOnClickListener { activity?.onBackPressedDispatcher?.onBackPressed() }
        binding.tbHome.setOnMenuItemClickListener{
            when(it.itemId){
                R.id.logout -> findNavController().navigate(R.id.action_homeScreen_to_loginFragment2)
            }
            true
        }
        binding.btAdd.setOnClickListener {
        findNavController().navigate(R.id.action_homeScreen_to_addItem)
        }
        binding.lvHome.adapter = ShoeAdapter(requireContext())
        Log.i("data" , binding.lvHome.adapter.toString())
        return binding.root
    }



}

