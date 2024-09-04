package br.unisanta.todoapp.dao

import br.unisanta.todoapp.Model.Task

class TaskDao {

    companion object{
        private val task = mutableListOf<Task>()
    }
    fun adicionarUsuario(task:Task){
        Companion.task.add(task)
    }
    fun obterUsuarios():List<Task>{
        return Companion.task
    }
}