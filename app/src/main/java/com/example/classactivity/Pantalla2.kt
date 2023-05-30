package com.example.classactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.widget.EditText
import android.widget.TextView
import androidx.core.widget.addTextChangedListener
import org.w3c.dom.Text

class Pantalla2 : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pantalla2)
        Log.i("ciclodevida", "Ciclo on start")

            val editTextkt = findViewById<EditText>(R.id.editTextText1)
            val txtTextkt = findViewById<TextView>(R.id.textView1)

    editTextkt.addTextChangedListener(object : TextWatcher {
        override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
        }
        override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
        }
        override fun afterTextChanged(s: Editable?) {
            txtTextkt.setText("Texto Editabl :"+s);
        }
       })
    }
}