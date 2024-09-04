package br.unisanta.todoapp.View

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import br.unisanta.todoapp.R
import br.unisanta.todoapp.adapter.TaskAdapter
import br.unisanta.todoapp.dao.TaskDao

class ListaTodo : AppCompatActivity() {
    val dao = TaskDao()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_lista_todo)
        val rvUsuarios = findViewById<RecyclerView>(R.id.Lista)
        val Filmes = dao.obterUsuarios()
        rvUsuarios.layoutManager = LinearLayoutManager(this)
        rvUsuarios.adapter = TaskAdapter(Filmes)
    }
}