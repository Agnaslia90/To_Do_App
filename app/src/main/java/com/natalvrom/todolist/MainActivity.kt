package com.natalvrom.todolist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton
import androidx.core.content.ContextCompat.startActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnToDoList = findViewById<AppCompatButton>(R.id.btnToDoList)
        btnToDoList.setOnClickListener { navegatetoToDoList() }

    }

    private fun navegatetoToDoList() {
        val intent = Intent(this, ToDoListActivity::class.java)
        startActivity(intent)
    }

}




