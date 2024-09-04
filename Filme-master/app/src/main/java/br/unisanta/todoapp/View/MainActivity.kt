package br.unisanta.todoapp.View

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import br.unisanta.todoapp.Model.Task
import br.unisanta.todoapp.R
import br.unisanta.todoapp.dao.TaskDao
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    val dao = TaskDao()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        val btnCadastrar = findViewById<Button>(R.id.btn_cadastrar)
        val fabAvanca = findViewById<FloatingActionButton>(R.id.IrLista)

        btnCadastrar.setOnClickListener {
            val edtNome = findViewById<EditText>(R.id.Nome)
            val edtDiretor = findViewById<EditText>(R.id.Diretor)
            val nome = edtNome.text.toString()
            val diretor = edtDiretor.text.toString()
            val Filme = Task(nome,diretor)
            dao.adicionarUsuario(Filme)
            edtNome.text.clear()
            edtDiretor.text.clear()
            Toast.makeText(this, "Filme Cadastrado Com Sucesso!", Toast.LENGTH_LONG).show()
        }
        fabAvanca.setOnClickListener {
            val intent = Intent(this,ListaTodo::class.java)
            startActivity(intent)
        }
    }
}