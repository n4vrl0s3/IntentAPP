package com.guan.intentapp

import android.os.Build
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MoveActivityWithObject : AppCompatActivity() {
    companion object {
        const val EXTRA_MAHASISWA = "extra_mahasiswa"
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_move_with_object)

        val tvObject: TextView = findViewById(R.id.tv_object_received)

        val mhs = if (Build.VERSION.SDK_INT >=35) {
            intent.getParcelableExtra<Mahasiswa>(EXTRA_MAHASISWA, Mahasiswa::class.java)
        } else {
            @Suppress("DEPRECATION")
            intent.getParcelableExtra<Mahasiswa>(EXTRA_MAHASISWA)
        }

        if (mhs != null) {
            val text = "Name : ${mhs.name.toString()}, \nKelas : ${mhs.clas}, \nUmur: ${mhs.age} \nEmail: ${mhs.email}, \nKota : ${mhs.city}"
            tvObject.text = text
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}