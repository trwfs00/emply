package com.example.emply

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.emply.databinding.ActivityHomeBinding
import com.example.emply.databinding.ActivityProfileBinding

class ProfileActivity : AppCompatActivity() {
    private lateinit var binding : ActivityProfileBinding
    private lateinit var session: SessionManager
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)
        session = SessionManager(applicationContext)
        // Read data from the preferences
        val username: String? = session.pref.getString(SessionManager.KEY_USERNAME, null)
        binding.txtUsername.text = username

        binding.btnLogout.setOnClickListener(){
            val edit = session.edior
            edit.clear()
            edit.commit()
            var i: Intent = Intent(applicationContext, MainActivity::class.java)
            startActivity(i)
            finish()
        }
        binding.bottomNav.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.home -> {
                    var i: Intent = Intent(applicationContext, HomeActivity::class.java)
                    startActivity(i)
                    finish()
                }
                R.id.application -> {
                    var i: Intent = Intent(applicationContext, ApplicationActivity::class.java)
                    startActivity(i)
                    finish()
                }
                R.id.profile -> {
                    it.isChecked = true
                }
            }
            true
        }
    }
}