package br.com.alura.orgs

import android.app.Activity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Toast.makeText(this, "Bem vindo(a) ao Orgs! Marcílio", Toast.LENGTH_SHORT).show()
        val view_text = TextView(this)
        val view = View(this)
        view_text.setText("Marcílio Zanatta Bezerra da Silva")

        setContentView(view)
        setContentView(view_text)
    }
}