package com.example.emply

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.emply.databinding.ActivitySignInBinding
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class SignInActivity : AppCompatActivity() {
    private lateinit var bindinglogin:ActivitySignInBinding
    lateinit var session: SessionManager
    val createClient = UserAPI.create()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindinglogin = ActivitySignInBinding.inflate(layoutInflater)
        setContentView(bindinglogin.root)

        session = SessionManager(applicationContext)
        if (session.isLoggedIn()) {
            var i:Intent = Intent(applicationContext, MainActivity::class.java)
            startActivity(i)
            finish()
        }

        if (!session.pref.getString(SessionManager.KEY_USERNAME,null).isNullOrEmpty()){
            val username: String? = session.pref.getString(SessionManager.KEY_USERNAME,null)
            bindinglogin.editEmail.setText(username)
        }
        bindinglogin.btnSignIn.setOnClickListener(){
            var username = bindinglogin.editEmail.text.toString()
            var password = bindinglogin.editPass.text.toString()
            if(username.isEmpty() || password.isEmpty()) {
                Toast.makeText(applicationContext,"Enter username and password.", Toast.LENGTH_LONG).show()
            }else{
                createClient.userLogin(username, password)
                    .enqueue(object : Callback<LoginuserClass> {
                        override fun onResponse(
                            call: Call<LoginuserClass>,
                            response: Response<LoginuserClass>
                        ) {
                            val success = response.body()?.success.toString().toInt()
                            if(success == 0){
                                Toast.makeText(applicationContext,"The username or password is incorrect.",Toast.LENGTH_LONG).show()
                            }else{
                                val id_back = response.body()?.userid.toString()
                                val role_back = response.body()?.userrole.toString()
                                if (role_back == "0"){
                                    session.createLoginSession(role_back,id_back,username)
                                    var i:Intent = Intent(applicationContext, MainActivity::class.java)
                                    startActivity(i)
                                    finish()
                                }else{
                                    session.createLoginSession(role_back,id_back,username)
                                    var i:Intent = Intent(applicationContext, MainActivity::class.java)
                                    startActivity(i)
                                    finish()
                                }
                            }
                        }

                        override fun onFailure(call: Call<LoginuserClass>, t: Throwable) {
                            Toast.makeText(applicationContext,"Error onFailure." + t.message,Toast.LENGTH_LONG).show()
                        }
                    })
            }
            if (bindinglogin.cbRememberMe.isChecked){
                val edit = session.edior
                edit.clear()
                edit.commit()

                edit.putString(SessionManager.KEY_USERNAME,username)
                edit.commit()
            }
        }

        bindinglogin.txtSignUp.setOnClickListener{
            val intent = Intent(applicationContext, SignupActivity::class.java)
            startActivity(intent)
        }
    }
}