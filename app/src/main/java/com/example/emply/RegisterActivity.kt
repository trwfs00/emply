package com.example.emply

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.emply.databinding.ActivityRegisterBinding
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RegisterActivity : AppCompatActivity() {
    private lateinit var bindingRegister : ActivityRegisterBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingRegister = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_register)

        bindingRegister.txtSignIn.setOnClickListener {
            var i: Intent = Intent(applicationContext, MainActivity::class.java)
            startActivity(i)
            finish()
        }
    }
    fun addRoleJob(v: View) {
        val serv : RoleAPI = Retrofit.Builder()
            .baseUrl("http://10.0.2.2:3000/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(RoleAPI::class.java)

        serv.insertRole(
            bindingRegister.edtUsername.text.toString(),
            bindingRegister.edtPassword.text.toString(),
            0
        ).enqueue(object : Callback<RoleClass> {
            override fun onResponse(call: Call<RoleClass>, response: Response<RoleClass>) {
                if(response.isSuccessful) {
                    Toast.makeText(applicationContext,"Succesfully Register", Toast.LENGTH_SHORT).show()
                    finish()
                } else {
                    Toast.makeText(applicationContext,"Error ",Toast.LENGTH_SHORT).show()
                }
            }
            override fun onFailure(call: Call<RoleClass>, t: Throwable) {
                Toast.makeText(applicationContext,"Error onFailure "+t.message, Toast.LENGTH_LONG).show()
            }
        })
    }

    fun addRoleEmp(v: View) {
        val serv : RoleAPI = Retrofit.Builder()
            .baseUrl("http://10.0.2.2:3000/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(RoleAPI::class.java)

        serv.insertRole(
            bindingRegister.edtUsername.text.toString(),
            bindingRegister.edtPassword.text.toString(),
            1
        ).enqueue(object : Callback<RoleClass> {
            override fun onResponse(call: Call<RoleClass>, response: Response<RoleClass>) {
                if(response.isSuccessful) {
                    Toast.makeText(applicationContext,"Succesfully Register", Toast.LENGTH_SHORT).show()
                    finish()
                } else {
                    Toast.makeText(applicationContext,"Error ",Toast.LENGTH_SHORT).show()
                }
            }
            override fun onFailure(call: Call<RoleClass>, t: Throwable) {
                Toast.makeText(applicationContext,"Error onFailure "+t.message, Toast.LENGTH_LONG).show()
            }
        })
    }
}