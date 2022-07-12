package com.android4.travel.adapter

import android.app.Activity
import android.provider.ContactsContract
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.android4.travel.MyApplication
import com.android4.travel.databinding.ItemInputBinding
import com.android4.travel.model.User
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class InputHolder(val binding: ItemInputBinding): RecyclerView.ViewHolder(binding.root)

class InputAdapter(val memberName: List<String>?, val nickname: String?): RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder
    = InputHolder(ItemInputBinding.inflate(LayoutInflater.from(parent.context), parent, false))

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val binding = (holder as InputHolder).binding

        if(memberName?.get(position)==nickname) {
            Log.d("test", "inputAdapter=====================$nickname")
            binding.textView7.text = "나"
        } else {
            binding.textView7.text = memberName?.get(position)
        }
    }

    override fun getItemCount(): Int {
        if(memberName?.size!! >2) {
            return memberName?.size?.minus(1) ?:0
        } else {
            return memberName?.size ?:0
        }
    }

}