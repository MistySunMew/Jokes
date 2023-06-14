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
 * Use the [DadFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class DadFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_dad, container, false)
        val btnBack = view?.findViewById<Button>(R.id.btnBack)
        val btnDadJoke = view?.findViewById<Button>(R.id.btnDadJoke)
        val txtDadJoke = view?.findViewById<TextView>(R.id.txtDadJoke)
        val dadJokes = listOf("I'm afraid for the calendar. Its days are numbered.",
            "Why do fathers take an extra pair of socks when they go golfing? In case they get a hole in one!",
            "Singing in the shower is fun until you get soap in your mouth. Then it's a soap opera.",
            "If April showers bring May flowers, what do May flowers bring? Pilgrims.",
            "Have you heard about the chocolate record player? It sounds pretty sweet.")

        btnBack?.setOnClickListener() {
            view.findNavController().navigate(R.id.action_dadFragment_to_startFragment)
        }

        btnDadJoke?.setOnClickListener() {
            txtDadJoke?.text = dadJokes.random()
        }

        return view
    }
}