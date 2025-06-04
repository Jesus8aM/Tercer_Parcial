package com.example.myapplicationferia.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.myapplicationferia.databinding.FragmentHomeBinding
import android.content.Intent
import android.net.Uri
import androidx.navigation.fragment.findNavController
import com.example.myapplicationferia.R


class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root

        binding.buttonCard1.setOnClickListener {
            val bundle = Bundle()
            bundle.putString("url", "https://www.lipsum.com/")
            findNavController().navigate(R.id.webViewFragment, bundle)
        }
        binding.buttonCard2.setOnClickListener {
            val bundle = Bundle()
            bundle.putString("url", "https://www.lipsum.com/")
            findNavController().navigate(R.id.webViewFragment, bundle)
        }
        binding.buttonCard3.setOnClickListener {
            val bundle = Bundle()
            bundle.putString("url", "https://www.lipsum.com/")
            findNavController().navigate(R.id.webViewFragment, bundle)
        }
        binding.buttonCard4.setOnClickListener {
            val bundle = Bundle()
            bundle.putString("imageUrl", "https://www.tabascohoy.com/wp-content/uploads/2023/05/atracciones-roca-feria-tabasco-2023-juegos-3-1024x906.jpg")
            findNavController().navigate(R.id.imageFragment, bundle)
        }
        //Boton de fechas importantes
        binding.buttonFechasImportantes.setOnClickListener {
            findNavController().navigate(R.id.fechasImportantesFragment)
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}