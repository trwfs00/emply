package com.example.emply

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.emply.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {
    private lateinit var binding : ActivityHomeBinding
    private lateinit var session: SessionManager
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        session = SessionManager(applicationContext)
// Read data from the preferences
        val username: String? = session.pref.getString(SessionManager.KEY_USERNAME, null)
        binding.txtUsername.text = username

        binding.bottomNav.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.home -> {
                    it.isChecked = true
                }
                R.id.application -> {
                    var i: Intent = Intent(applicationContext, ApplicationActivity::class.java)
                    startActivity(i)
                    finish()
                    it.isChecked = true
                }
                R.id.profile -> {
                    var i: Intent = Intent(applicationContext, ProfileActivity::class.java)
                    startActivity(i)
                    finish()
                    it.isChecked = true
                }
            }
            true
        }
    }
}