package br.ronisvonn.activitesfragment.ui.login

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import br.ronisvonn.activitesfragment.R
import br.ronisvonn.activitesfragment.ui.serie.ListaSeriesActivity

class LoginActivity : AppCompatActivity() {
    private val emailValido = "ronisvonn@gmail.com"
    private val senhaValida = "12345678"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)

        val campoEmail = findViewById<EditText>(R.id.editEmail)
        val campoSenha = findViewById<EditText>(R.id.editSenha)
        val botaoEntrar = findViewById<Button>(R.id.btnEntrar)

        botaoEntrar.setOnClickListener {
            val email = campoEmail.text.toString()
            val senha = campoSenha.text.toString()

            if (email == emailValido && senha == senhaValida) {
                startActivity(Intent(this, ListaSeriesActivity::class.java))
            } else {
                Toast.makeText(this, "E-mail ou senha inválidos", Toast.LENGTH_SHORT).show()
            }
        }

    }
}