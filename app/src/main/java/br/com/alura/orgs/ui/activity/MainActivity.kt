package br.com.alura.orgs.ui.activity

import android.app.Activity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import br.com.alura.orgs.R
import br.com.alura.orgs.ui.recyclerview.adapter.ListaProdutosAdapter
import java.util.Arrays

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Toast.makeText(this, "Bem vindo(a) ao Orgs! Marcílio", Toast.LENGTH_SHORT).show()
        setContentView(R.layout.produto_item)

        val nome: TextView = findViewById<TextView>(R.id.nome)
        val descricao = findViewById<TextView>(R.id.descricao)
        val valor = findViewById<TextView>(R.id.valor)

        nome.text = "Cesta de Frutas"
        descricao.text = "Laranja, manga e maça"
        valor.text = "19.90"

//        val recyclerView= findViewById<RecyclerView>(R.id.recyclerView)
//        recyclerView.adapter = ListaProdutosAdapter()
    }
}