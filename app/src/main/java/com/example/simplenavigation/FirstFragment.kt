package com.example.simplenavigation

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController

// this class is auto generated when you add data binding to the gradle.  The name of the auto generated class is ... ClassNameBinding
import com.example.simplenavigation.databinding.FirstFragmentBinding

class FirstFragment : Fragment() {



    private lateinit var binding : FirstFragmentBinding

    // viewModel not needed in this example, but good practice if you know you'll be accessing data in DB later on
    private lateinit var viewModel: FirstViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FirstFragmentBinding.inflate(inflater, container, false)

        // get your hands on  Button3 in the fragment, and set a onClickListener. If the button is clicked moveToThird() function is called.
        binding.buttonMove3.setOnClickListener{ view : View->
             moveToThird()

        }

        binding.buttonMove1.setOnClickListener{ view : View->
            view.findNavController().navigate(R.id.action_view_second)
        }

        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(FirstViewModel::class.java)
        // TODO: Use the ViewModel
    }

    // this is my own function, not android defined.
    fun moveToThird(){
        // FirstFragmentDirections is another auto generated class which is created when you are using SafeArgs,
        // the method actionViewThird() is named after the action I defined in the nav_graph - action_view_third
        // this action (see the nav_graph) has one argument passed in which is an Integer.
        val action = FirstFragmentDirections.actionViewThird(101)
        findNavController().navigate(action)


    }

}