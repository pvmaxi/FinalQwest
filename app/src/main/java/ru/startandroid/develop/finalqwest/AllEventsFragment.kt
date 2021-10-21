package ru.startandroid.develop.finalqwest


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import ru.startandroid.develop.finalqwest.databinding.FragmentAllEventsBinding

class AllEventsFragment : Fragment() {

    private var _binding: FragmentAllEventsBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentAllEventsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val events = listOf<EventAdapter.Event>(
            EventAdapter.Event(),
            EventAdapter.Event(),
            EventAdapter.Event("Andre"),
            EventAdapter.Event(),
            EventAdapter.Event(),
            EventAdapter.Event(),
            EventAdapter.Event(),
            EventAdapter.Event(),
            EventAdapter.Event(),
            EventAdapter.Event(),
            EventAdapter.Event(),
        )

        binding.recyclerView.adapter = EventAdapter(events)
    }
}