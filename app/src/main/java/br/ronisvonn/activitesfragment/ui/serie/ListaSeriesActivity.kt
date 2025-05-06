package br.ronisvonn.activitesfragment.ui.serie

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import br.ronisvonn.activitesfragment.R
import com.google.android.material.button.MaterialButton

class ListaSeriesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista_series)

        // One Piece (Banner principal)
        val btnMaisInfo = findViewById<MaterialButton>(R.id.btnMaisInfo)

        btnMaisInfo.setOnClickListener {
            val serie = Serie(
                nome = "One Piece",
                descricao = "Monkey D. Luffy parte em busca do maior tesouro do mundo: o One Piece.",
                imagemResId = R.drawable.one_piece
            )
            val intent = Intent(this, DetalhesActivity::class.java)
            intent.putExtra("serie", serie)
            startActivity(intent)
        }

        // Outras séries
        val imgBreakingBad = findViewById<ImageView>(R.id.imgBreakingBad)
        val imgBrooklyn = findViewById<ImageView>(R.id.imgBrooklyn)
        val imgHouse = findViewById<ImageView>(R.id.imgHouse)
        val imgOffice = findViewById<ImageView>(R.id.imgOffice)

        imgBreakingBad.setOnClickListener {
            abrirDetalhe("Breaking Bad", "Um professor de química vira produtor de metanfetamina.", R.drawable.breaking)
        }

        imgBrooklyn.setOnClickListener {
            abrirDetalhe("Brooklyn Nine-Nine", "Detetives hilários em uma delegacia do Brooklyn.", R.drawable.brooklyn)
        }

        imgHouse.setOnClickListener {
            abrirDetalhe("House", "Um médico genial e sarcástico resolve casos médicos misteriosos.", R.drawable.house)
        }

        imgOffice.setOnClickListener {
            abrirDetalhe("The Office", "O cotidiano de um escritório cheio de personagens peculiares.", R.drawable.office)
        }
    }

    private fun abrirDetalhe(nome: String, descricao: String, imagemResId: Int) {
        val intent = Intent(this, DetalhesActivity::class.java)
        intent.putExtra("serie", Serie(nome, descricao, imagemResId))
        startActivity(intent)
    }
}
