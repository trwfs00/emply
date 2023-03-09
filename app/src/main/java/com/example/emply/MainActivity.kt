package com.example.emply

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.emply.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //Show HomeFragment
        if(savedInstanceState==null) replaceFragment(HomeFragment())

        //Click on Bottom Navbar
        binding.bottomNav.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.home -> replaceFragment(HomeFragment())
                R.id.application -> replaceFragment(ApplicationFragment())
                R.id.profile -> replaceFragment(ProfileFragment())
            }
            true
        }
    }

    private fun replaceFragment(someFragment: Fragment) {
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frameLayout, someFragment)
        fragmentTransaction.commit()
    }
}