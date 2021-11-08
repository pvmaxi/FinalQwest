package ru.startandroid.develop.finalqwest

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.Gravity
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import ru.startandroid.develop.finalqwest.databinding.FragmentTwoBinding


class TwoFragment : Fragment() {

    private var _binding: FragmentTwoBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentTwoBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.back.setOnClickListener {
            (requireActivity() as FirstActivity).setFragment(FirstFragment())
        }
//
//        binding.save.setOnClickListener{
//            fun onSave(view: View) {
//                val sharedPref = requireActivity().getPreferences(Context.MODE_PRIVATE) ?: return
//                with (sharedPref.edit()) {
//                    putString(getString(R.string.newEvent),)
//                    apply()
//                }
//            }
        }
    }