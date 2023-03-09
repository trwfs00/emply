package com.example.emply

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.emply.databinding.FragmentProfileBinding

class ProfileFragment : Fragment() {
   private lateinit var bindingProfile : FragmentProfileBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        bindingProfile = FragmentProfileBinding.inflate(layoutInflater)
        return bindingProfile.root
    }
}