package br.unisanta.todoapp.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import br.unisanta.todoapp.Model.Task
import br.unisanta.todoapp.R

class TaskAdapter(private val task:List<Task>):
    RecyclerView.Adapter<TaskAdapter.ViewHolder>() {
    class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        val txvNome: TextView = itemView.findViewById(R.id.NomeFilme)
        val txvDiretor: TextView = itemView.findViewById(R.id.DiretorFilme)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_filme,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val filme = task[position]
        holder.txvNome.text = filme.nome
        holder.txvDiretor.text = filme.Diretor
    }
    override fun getItemCount(): Int {
        return task.size
    }
}