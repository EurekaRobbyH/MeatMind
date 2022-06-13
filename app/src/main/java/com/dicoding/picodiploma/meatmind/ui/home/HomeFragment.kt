package com.dicoding.picodiploma.meatmind.ui.home

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.dicoding.picodiploma.meatmind.R
import com.dicoding.picodiploma.meatmind.camera.CameraTakeActivity
import com.dicoding.picodiploma.meatmind.databinding.FragmentHomeBinding


class HomeFragment : Fragment(R.layout.fragment_home) {
    private var _binding : FragmentHomeBinding?=null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentHomeBinding.inflate(inflater,container,false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        (activity as AppCompatActivity).supportActionBar?.hide()

        binding.ScanButton.setOnClickListener{
            val intent = Intent(requireActivity(), CameraTakeActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}



