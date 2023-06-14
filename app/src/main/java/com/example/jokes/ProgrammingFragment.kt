package com.example.jokes

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.navigation.findNavController

/**
 * A simple [Fragment] subclass.
 * Use the [ProgrammingFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ProgrammingFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_programming, container, false)
        val btnBack = view?.findViewById<Button>(R.id.btnBack)
        val btnProgrammingJoke = view?.findViewById<Button>(R.id.btnProgrammingJoke)
        val txtProgrammingJoke = view?.findViewById<TextView>(R.id.txtProgrammingJoke)
        val programmingJokes = listOf("Eight bytes walk into a bar.  The bartender asks, “Can I get you anything?”\n" +
                "“Yeah,” reply the bytes.  “Make us a double.”",
            "How many programmers does it take to change a light bulb?\n" +
                    "None – It’s a hardware problem",
            "A programmer walks to the butcher shop and buys a kilo of meat.  An hour later he comes back upset that the butcher shortchanged him by 24 grams.",
            "Programming is 10% writing code and 90% understanding why it’s not working",
            "Why did the programmer quit her job? Because she didn’t get arrays")

        btnBack?.setOnClickListener() {
            view.findNavController().navigate(R.id.action_programmingFragment_to_startFragment)
        }

        btnProgrammingJoke?.setOnClickListener() {
            txtProgrammingJoke?.text = programmingJokes.random()
        }

        return view
    }
}