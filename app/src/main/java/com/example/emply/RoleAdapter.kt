package com.example.emply

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.emply.databinding.RoleItemLayoutBinding

class RoleAdapter(val items: List<RoleClass>, val context: Context):
RecyclerView.Adapter<RoleAdapter.ViewHolder>() {
    inner class ViewHolder(view: View, val binding: RoleItemLayoutBinding) :
        RecyclerView.ViewHolder(view) {
        init {
            binding.roleGroup.setOnClickListener {
                val item = items[adapterPosition]
                Toast.makeText(
                    context,
                    "Click on movie: ${item.username} ${if(item.role==0) "Jobseeker" else if(item.role==1) "Employer" else "Admin"}",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = RoleItemLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding.root, binding)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val binding_holder = holder.binding

        binding_holder.txtUsername?.text = items[position].username
        binding_holder.txtPassword?.text = items[position].password
        binding_holder.txtRole?.text = if(items[position].role==0) "Jobseeker" else if (items[position].role==1) "Employer" else "Admin"
    }
}