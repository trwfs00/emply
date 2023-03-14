package com.example.emply

import android.app.Application
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.emply.databinding.ApplicationItemLayoutBinding

class ApplicationAdapter(val context: Context, val applicationList: ArrayList<ApplicationClass>?) :
    RecyclerView.Adapter<ApplicationAdapter.ViewHolder>() {

    class ViewHolder(view: View, val binding: ApplicationItemLayoutBinding) :
        RecyclerView.ViewHolder(view) {
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ApplicationItemLayoutBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ViewHolder(binding.root, binding)
    }

    override fun getItemCount(): Int {
        return applicationList!!.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val binding = holder.binding

        binding.txtName.text = "${applicationList!![position].job_name}"
        binding.txtInc.text = "${applicationList!![position].company_name}"
        binding.txtStatus.text = "${applicationList!![position].status}"


        // ใช้ Picasso สำหรับโหลดภาพจาก URL
        //Picasso.get().load(app.iconUrl).into(holder.appIconImageView)
    }
}
