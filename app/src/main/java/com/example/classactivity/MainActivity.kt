package com.example.classactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /* CAMBIAR DE UNA PANTALLA A OTRA CON EL BOTON */
        val btnIraPagina2kt =  findViewById<Button>(R.id.btnirapantalla2);
        btnIraPagina2kt.setOnClickListener(
            {
                val nextPagina = Intent(this, Pantalla2::class.java);
                startActivity(nextPagina);
                finish();
            }
        )


    }

}