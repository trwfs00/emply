package com.example.emply

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.emply.databinding.FragmentApplicationBinding

class ApplicationFragment : Fragment() {
    private lateinit var bindingApplication : FragmentApplicationBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        bindingApplication = FragmentApplicationBinding.inflate(layoutInflater)
        return bindingApplication.root
    }
}