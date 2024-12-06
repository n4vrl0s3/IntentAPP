package com.guan.intentapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val btnMoveActivity: Button = findViewById(R.id.btn_move_activity)
        btnMoveActivity.setOnClickListener(this)

        val btnMoveActivitywithData: Button = findViewById(R.id.btn_move_activity_with_data)
        btnMoveActivitywithData.setOnClickListener(this)

        val btnMoveActivitywithObject: Button = findViewById(R.id.btn_move_activity_with_object)
        btnMoveActivitywithObject.setOnClickListener(this)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.btn_move_activity -> {
                val moveIntent = Intent (this,MoveActivity::class.java)
                startActivity(moveIntent)
            }

            R.id.btn_move_activity_with_data -> {
                val moveIntentWithData = Intent(this, MoveActivityWithData::class.java)
                moveIntentWithData.putExtra(MoveActivityWithData.YOUR_NAME, "Guan")
                moveIntentWithData.putExtra(MoveActivityWithData.YOUR_CLASS, "TI.23.B.2")
                moveIntentWithData.putExtra(MoveActivityWithData.YOUR_AGE, 18)
                startActivity(moveIntentWithData)
            }

            R.id.btn_move_activity_with_object -> {
                val objectmhs = Mahasiswa("Guan", "TI.23.B.2", 18, "guanshiyinnn@gmail.com", "Java")
                val moveIntentWithObject = Intent(this, MoveActivityWithObject::class.java)
                moveIntentWithObject.putExtra(MoveActivityWithObject.EXTRA_MAHASISWA, objectmhs)
                startActivity(moveIntentWithObject)
            }
        }
    }
}