package br.ronisvonn.activitesfragment.ui.serie

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import br.ronisvonn.activitesfragment.R

class DetalhesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_detalhes)

        val serie = intent.getParcelableExtra<Serie>("serie")

        serie?.let {
            findViewById<ImageView>(R.id.imgSerieDetalhe).setImageResource(it.imagemResId)
            findViewById<TextView>(R.id.txtNome).text = it.nome
            findViewById<TextView>(R.id.txtDescricao).text = it.descricao
        }
    }
}