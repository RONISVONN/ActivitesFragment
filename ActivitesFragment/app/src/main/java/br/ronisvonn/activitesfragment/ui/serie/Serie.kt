package br.ronisvonn.activitesfragment.ui.serie

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Serie(
    val nome: String,
    val descricao: String,
    val imagemResId: Int
) : Parcelable