package com.ameer.shoeStore.adapters

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Context
import android.content.SharedPreferences
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ListAdapter
import androidx.databinding.DataBindingUtil
import com.ameer.shoestore.R
import com.ameer.shoestore.databinding.AddNewShoeBinding
import com.ameer.shoestore.databinding.CardDetailBinding
import kotlinx.coroutines.NonDisposableHandle.parent
import java.util.zip.Inflater


class ShoeAdapter (context: Context): BaseAdapter() {
    private val inflater = LayoutInflater.from(context)
    val data : SharedPreferences =  context.getSharedPreferences("data",0)

    override fun getCount(): Int {
      return  10
    }

    override fun getItem(position: Int): Any {
        return 0
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    @SuppressLint("ViewHolder")
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val binding = DataBindingUtil.inflate<CardDetailBinding>(inflater,R.layout.card_detail,parent,false)

        binding.tvShoeName.text ="shoe tag : "+ data.getString("name","not found")
        binding.tvSize.text ="size : " + data.getString("size" , "not found")
        binding.tvDesc.text ="description : " + data.getString("desc" , "not found")
        binding.tvCompany.text ="brand : " + data.getString("company" , "not found")
        Log.e("data size",data.all.size.toString())
        return binding.root
    }

}