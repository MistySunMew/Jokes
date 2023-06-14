package com.example.jokes

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController
/**
 * A simple [Fragment] subclass.
 * Use the [StartFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class StartFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_start, container, false)
        val btnChuck = view?.findViewById<Button>(R.id.btnChuck)
        val btnProgramming = view?.findViewById<Button>(R.id.btnProgramming)
        val btnDad = view?.findViewById<Button>(R.id.btnDad)
        btnChuck?.setOnClickListener() {
            view.findNavController().navigate(R.id.action_startFragment_to_chuckFragment)
        }
        btnProgramming?.setOnClickListener() {
            view.findNavController().navigate(R.id.action_startFragment_to_programmingFragment)
        }
        btnDad?.setOnClickListener() {
            view.findNavController().navigate(R.id.action_startFragment_to_dadFragment)
        }

        // Inflate the layout for this fragment
        return view
    }
}