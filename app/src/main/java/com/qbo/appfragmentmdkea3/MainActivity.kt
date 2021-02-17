package com.qbo.appfragmentmdkea3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import com.qbo.appfragmentmdkea3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        binding.btnlogin.setOnClickListener {
            if(binding.etusuario.text.toString() == "Luis"
                && binding.etpassword.text.toString() == "12345"){
                startActivity(Intent(this, ListaActivity::class.java))
            }else{
                Snackbar.make(it, "Usuario o password incorrecto",
                    Snackbar.LENGTH_LONG).show()
            }

        }
    }
}