package com.example.emply

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.emply.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {
    private lateinit var bindingHome : FragmentHomeBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        bindingHome = FragmentHomeBinding.inflate(layoutInflater)
        return bindingHome.root

    }

}