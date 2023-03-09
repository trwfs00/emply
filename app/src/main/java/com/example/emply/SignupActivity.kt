package com.example.emply

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.CalendarContract.Colors
import android.widget.Toast
import com.example.emply.databinding.ActivitySignupBinding
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import kotlinx.coroutines.delay as delay

class SignupActivity : AppCompatActivity() {
    private lateinit var bindingSignup: ActivitySignupBinding
    lateinit var session: SessionManager
    val createClient = UserAPI.create()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingSignup = ActivitySignupBinding.inflate(layoutInflater)
        setContentView(bindingSignup.root)
        SetUnClickJobseeker()
        SetUnClickEmployer()

        session = SessionManager(applicationContext)
        if (session.isLoggedIn()) {
            var i:Intent = Intent(applicationContext, MainActivity::class.java)
            startActivity(i)
            finish()
        }

        bindingSignup.crdJobseeker.setOnClickListener{
            val jobSeeker = 0
            SetClickJobseeker()
            SetUnClickEmployer()
            var username = bindingSignup.editEmail.text.toString()
            var password = bindingSignup.editPass.text.toString()
            if(username.isEmpty() || password.isEmpty()) {
                Toast.makeText(applicationContext,"Enter username and password.", Toast.LENGTH_LONG).show()
            }else{
                createClient.insertUser(username, password, jobSeeker)
                    .enqueue(object : Callback<LoginuserClass> {
                        override fun onResponse(
                            call: Call<LoginuserClass>, response: retrofit2.Response<LoginuserClass>
                        ) {
                            if (response.isSuccessful()){
                                Toast.makeText(applicationContext,"Successfully Inserted",Toast.LENGTH_LONG).show()
                                finish()
                            }else{
                                Toast.makeText(applicationContext,"Inserted Failed",Toast.LENGTH_LONG).show()
                            }
                        }

                        override fun onFailure(call: Call<LoginuserClass>, t: Throwable) {
                            Toast.makeText(applicationContext,"Error onFailure" + t.message,Toast.LENGTH_LONG).show()
                        }
                    })
            }
        }

        bindingSignup.crdEmployer.setOnClickListener{
            val jobEmployer = 1
            SetClickEmployer()
            SetUnClickJobseeker()
            var username = bindingSignup.editEmail.text.toString()
            var password = bindingSignup.editPass.text.toString()
            if(username.isEmpty() || password.isEmpty()) {
                Toast.makeText(applicationContext,"Enter username and password.", Toast.LENGTH_LONG).show()
            }else{
                createClient.insertUser(username, password, jobEmployer)
                    .enqueue(object : Callback<LoginuserClass> {
                        override fun onResponse(
                            call: Call<LoginuserClass>, response: retrofit2.Response<LoginuserClass>
                        ) {
                            if (response.isSuccessful()){
                                Toast.makeText(applicationContext,"Successfully Inserted",Toast.LENGTH_LONG).show()
                                finish()
                            }else{
                                Toast.makeText(applicationContext,"Inserted Failed",Toast.LENGTH_LONG).show()
                            }
                        }

                        override fun onFailure(call: Call<LoginuserClass>, t: Throwable) {
                            Toast.makeText(applicationContext,"Error onFailure" + t.message,Toast.LENGTH_LONG).show()
                        }
                    })
            }
        }

        bindingSignup.txtSignIn.setOnClickListener{
            val intent = Intent(applicationContext, SignInActivity::class.java)
            startActivity(intent)
        }
    }

    fun SetClickJobseeker() {
        bindingSignup.layoutBGJs.setBackgroundColor(Color.parseColor("#009FFF"))
        bindingSignup.txtJobseeker.setTextColor(Color.parseColor("#FFFFFF"))
        bindingSignup.txtJobDis.setTextColor(Color.parseColor("#DCEFFF"))
    }
    fun SetUnClickJobseeker() {
        bindingSignup.layoutBGJs.setBackgroundColor(Color.parseColor("#EDF3F8"))
        bindingSignup.txtJobseeker.setTextColor(Color.parseColor("#009FFF"))
        bindingSignup.txtJobDis.setTextColor(Color.parseColor("#55697A"))
    }
    fun SetClickEmployer() {
        bindingSignup.layoutBGEm.setBackgroundColor(Color.parseColor("#009FFF"))
        bindingSignup.txtEmployer.setTextColor(Color.parseColor("#FFFFFF"))
        bindingSignup.txtEmDis.setTextColor(Color.parseColor("#DCEFFF"))
    }
    fun SetUnClickEmployer() {
        bindingSignup.layoutBGEm.setBackgroundColor(Color.parseColor("#EDF3F8"))
        bindingSignup.txtEmployer.setTextColor(Color.parseColor("#009FFF"))
        bindingSignup.txtEmDis.setTextColor(Color.parseColor("#55697A"))
    }
}