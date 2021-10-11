package ru.startandroid.develop.finalqwest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ru.startandroid.develop.finalqwest.databinding.ActivityFirstBinding

class FirstActivity : AppCompatActivity() {

    private lateinit var binding: ActivityFirstBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFirstBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.newEvent.setOnClickListener {
            startActivity(Intent(this, NewEventActivity::class.java))
        }

        binding.List.setOnClickListener {
            startActivity(Intent(this, ListEventsActivity::class.java))
        }

        binding.sort.setOnClickListener {
            startActivity(Intent(this, SortListActivity::class.java))
        }
    }
}