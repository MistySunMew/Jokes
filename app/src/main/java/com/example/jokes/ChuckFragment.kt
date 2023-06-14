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
 * Use the [ChuckFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ChuckFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_chuck, container, false)
        val btnBack = view?.findViewById<Button>(R.id.btnBack)
        val btnDadJoke = view?.findViewById<Button>(R.id.btnChuckJoke)
        val txtDadJoke = view?.findViewById<TextView>(R.id.txtChuckJoke)
        val dadJokes = listOf("Chuck Norris doesn't read books. He stares them down until he gets the information he wants.",
            "Chuck Norris can dribble a bowling ball.",
            "Chuck Norris does not use spell check. If he happens to misspell a word, Oxford will change the spelling.",
            "Chuck Norris counted to infinity... twice.",
            "Chuck Norris can speak Braille.")

        btnBack?.setOnClickListener() {
            view.findNavController().navigate(R.id.action_chuckFragment_to_startFragment)
        }

        btnDadJoke?.setOnClickListener() {
            txtDadJoke?.text = dadJokes.random()
        }

        return view
    }
}