package br.com.alura.orgs

import android.app.Activity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import java.util.Arrays

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Toast.makeText(this, "Bem vindo(a) ao Orgs! Marcílio", Toast.LENGTH_SHORT).show()
        setContentView(R.layout.activity_main)

        val nome: TextView = findViewById<TextView>(R.id.nome)
        val descricao = findViewById<TextView>(R.id.descricao)
        val valor = findViewById<TextView>(R.id.valor)

        nome.text = "Cesta de Frutas"
        descricao.text = "Laranja, manga e maça"
        valor.text = "19.90"
    }
}