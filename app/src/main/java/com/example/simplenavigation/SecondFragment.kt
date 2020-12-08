package com.example.simplenavigation

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.example.simplenavigation.databinding.SecondFragmentBinding

class SecondFragment : Fragment() {

    private lateinit var binding : SecondFragmentBinding

    private lateinit var viewModel: SecondViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = SecondFragmentBinding.inflate(inflater, container, false)

        // get the button2, listen for a click, if clicked ask the navigation controller to navigate to the action_view_first (this is defined in nav_graph as line from Fragment2 to Fragment1
        binding.buttonMove2.setOnClickListener{ view : View->
            view.findNavController().navigate(R.id.action_view_first)
        }
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(SecondViewModel::class.java)
        // TODO: Use the ViewModel
    }

}