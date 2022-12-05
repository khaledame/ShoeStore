package com.ameer.shoeStore.models

import android.annotation.SuppressLint
import android.content.SharedPreferences
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.ameer.shoestore.R
import com.ameer.shoestore.databinding.AddNewShoeBinding

class AddItem : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = DataBindingUtil.inflate<AddNewShoeBinding>(inflater,
            R.layout.add_new_shoe,container,false)
        val dataArray : ArrayList<String>? = null
        binding.tbAddItem.title = "add new shoe"
        binding.tbAddItem.setNavigationOnClickListener { activity?.onBackPressedDispatcher?.onBackPressed() }
        binding.btAdd.setOnClickListener{
            val shoeName =  binding.etName.text.toString()
            val company = binding.etCompany.text.toString()
            val size = binding.etSize.text.toString()
            val desc = binding.etDesc.text.toString()
            dataArray?.add(shoeName)
            dataArray?.add(company)
            dataArray?.add(size)
            dataArray?.add(desc)
            saveItems(shoeName,company,size,desc)
            findNavController().navigate(R.id.action_addItem_to_homeScreen)


        }

        return binding.root
    }

    @SuppressLint("CommitPrefEdits")
    fun saveItems (shoeName : String, company :String, size:String, desc : String){
        var sharedPref: SharedPreferences? = activity?.getSharedPreferences("data" , 0)
        val editor : SharedPreferences.Editor = sharedPref!!.edit()
        sharedPref = activity?.getSharedPreferences("data",0)
        editor.putString("name" , shoeName)
        editor.putString("company" , company)
        editor.putString("size" , size)
        editor.putString("desc" , desc)
        editor.apply()

    }

}