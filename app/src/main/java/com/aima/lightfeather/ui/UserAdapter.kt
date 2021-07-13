package com.aima.lightfeather.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.aima.lightfeather.databinding.UserItemBinding
import com.aima.lightfeather.models.User

class UserAdapter (var users: List<User>):
RecyclerView.Adapter<UserAdapter.UserViewHolder>()
{
    class UserViewHolder (private val binding: UserItemBinding):
    RecyclerView.ViewHolder(binding.root) {
        fun bindUser(user: User){
            binding.apply {
                nameDisplay.text = user.name
                emailDisplay.text = user.email
                streetDisplay.text =user.address.street
            }

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
     var binding = UserItemBinding.inflate(LayoutInflater.from(parent.context))
     return UserViewHolder(binding)
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        val user = users [position]
        holder.bind(user)
    }

    override fun getItemCount(): Int {
        return users.size
    }

}