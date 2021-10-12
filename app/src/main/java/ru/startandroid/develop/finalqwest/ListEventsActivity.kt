package ru.startandroid.develop.finalqwest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ru.startandroid.develop.finalqwest.databinding.ActivityListEventsBinding


class ListEventsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityListEventsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityListEventsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonOne.setOnClickListener {
            startActivity(Intent(this, FirstActivity::class.java))
        }
    }
}