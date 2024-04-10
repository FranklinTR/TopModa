package com.franklintorres.topmoda

import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Cargar la fuente desde assets/font
        val typeface = Typeface.createFromAsset(assets, "font/Arima-Bold.ttf") 

        // Obtener referencias a los elementos de tu diseño XML
        val title = findViewById<TextView>(R.id.title)
        val btnIniciar = findViewById<Button>(R.id.btnIniciar)
        val btnRegistrar = findViewById<Button>(R.id.btnRegistrar)
        val subtitle = findViewById<TextView>(R.id.subtitle)
        val comment = findViewById<TextView>(R.id.comment)


        // Aplicar la fuente a los elementos TextView y Button
        title.typeface = typeface
        btnIniciar.typeface = typeface
        btnRegistrar.typeface = typeface
        subtitle.typeface = typeface
        comment.typeface = typeface
    }
}