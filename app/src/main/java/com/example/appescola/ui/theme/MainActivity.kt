package com.example.appescola.ui.theme

import MateriaActivity
import ProfessorActivity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.appescola.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnAlunos = findViewById<Button>(R.id.btnAlunos)
        val btnMaterias = findViewById<Button>(R.id.btnMaterias)
        val btnProfessores = findViewById<Button>(R.id.btnProfessores)
        val btnTurmas = findViewById<Button>(R.id.btnTurmas)

        btnAlunos.setOnClickListener {
            startActivity(Intent(this@MainActivity, AlunoActivity::class.java))
        }

        btnMaterias.setOnClickListener {
            startActivity(Intent(this@MainActivity, MateriaActivity::class.java))
        }

        btnProfessores.setOnClickListener {
            startActivity(Intent(this@MainActivity, ProfessorActivity::class.java))
        }

        btnTurmas.setOnClickListener {
            startActivity(Intent(this@MainActivity, TurmaActivity::class.java))
        }
    }
}
