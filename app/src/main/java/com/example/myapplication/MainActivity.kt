package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val emailEditText: EditText = findViewById(R.id.emailEditText)
        val passwordEditText: EditText = findViewById(R.id.passwordEditText)
        val loginButton: Button = findViewById(R.id.loginButton)
        val forgotPasswordTextView: TextView = findViewById(R.id.forgotPasswordTextView)
        val googleLoginButton: Button = findViewById(R.id.googleLoginButton)
        val appleLoginButton: Button = findViewById(R.id.appleLoginButton)
        val phoneLoginButton: Button = findViewById(R.id.phoneLoginButton)
        val registerTextView: TextView = findViewById(R.id.registerTextView)

        loginButton.setOnClickListener {
            // Aquí iría la lógica de login
            // Por ahora, simplemente navegamos a la actividad del conversor de divisas
            val intent = Intent(this, CurrencyConverterActivity::class.java)
            startActivity(intent)
        }

        forgotPasswordTextView.setOnClickListener {
            // Implementar lógica para recuperar contraseña
        }

        googleLoginButton.setOnClickListener {
            // Implementar login con Google
        }

        appleLoginButton.setOnClickListener {
            // Implementar login con Apple
        }

        phoneLoginButton.setOnClickListener {
            // Implementar login con teléfono
        }

        registerTextView.setOnClickListener {
            // Implementar navegación a la pantalla de registro
        }
    }
}