package ru.startandroid.develop.finalqwest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ru.startandroid.develop.finalqwest.databinding.ActivitySortListBinding

class SortListActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySortListBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySortListBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}