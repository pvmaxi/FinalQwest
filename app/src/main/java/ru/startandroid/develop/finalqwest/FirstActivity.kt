package ru.startandroid.develop.finalqwest


import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import ru.startandroid.develop.finalqwest.databinding.ActivityFirstBinding

class FirstActivity : AppCompatActivity() {

    private lateinit var binding: ActivityFirstBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFirstBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.newEvent.setOnClickListener{
            supportFragmentManager.beginTransaction()
                .add(binding.frame.id, TwoFragment())
                .commit()
        }

        binding.List.setOnClickListener {
            supportFragmentManager.beginTransaction()
                .add(binding.frame.id, AllEventsFragment())
                .commit()
        }

        binding.sort.setOnClickListener{
            supportFragmentManager.beginTransaction()
                .add(binding.frame.id, SortListFragment())
                .commit()
        }
    }
    fun setFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(binding.frame.id, fragment)
            .commit()
    }
}