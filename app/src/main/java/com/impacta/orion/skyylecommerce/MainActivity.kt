package com.impacta.orion.skyylecommerce

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    var redirecionarLogin = findViewById<Button>(R.id.tela_login)
    redirecionarLogin.setOnClickListener{
        val intent = Intent(context, LoginActivity::class.java)
        startActivityForResult(intent, 1)
    }


}