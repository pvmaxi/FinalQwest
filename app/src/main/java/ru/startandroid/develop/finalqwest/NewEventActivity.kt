package ru.startandroid.develop.finalqwest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import ru.startandroid.develop.finalqwest.databinding.ActivityNewEventBinding

class NewEventActivity : AppCompatActivity() {

    private lateinit var binding: ActivityNewEventBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNewEventBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.back.setOnClickListener {
            supportFragmentManager.beginTransaction()
                .add(binding.frame.id, FirstFragment())
                .commit()
        }
    }
}