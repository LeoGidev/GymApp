package com.example.gymapp
import com.example.gymapp.R


import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Referencias a los campos de entrada
        val editTextExerciseName: EditText = findViewById(R.id.editTextExerciseName)
        val editTextDay: EditText = findViewById(R.id.editTextDay)
        val editTextTime: EditText = findViewById(R.id.editTextTime)
        val editTextRepetitions: EditText = findViewById(R.id.editTextRepetitions)
        val submitButton: Button = findViewById(R.id.submitButton)

        // Manejar el evento de clic del botón
        submitButton.setOnClickListener {
            // Obtener los datos de los campos de entrada
            val exerciseName = editTextExerciseName.text.toString()
            val day = editTextDay.text.toString()
            val time = editTextTime.text.toString()
            val repetitions = editTextRepetitions.text.toString()

            // Aquí puedes guardar los datos en una base de datos local, SharedPreferences, etc.
            // Por ahora, solo mostraremos los datos en un Toast como ejemplo.
            Toast.makeText(this, "Ejercicio: $exerciseName\nDía: $day\nHora: $time\nRepeticiones: $repetitions", Toast.LENGTH_LONG).show()
        }
    }
}
