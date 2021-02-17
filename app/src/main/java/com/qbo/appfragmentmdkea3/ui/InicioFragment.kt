package com.qbo.appfragmentmdkea3.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.snackbar.Snackbar
import com.qbo.appfragmentmdkea3.R
import com.qbo.appfragmentmdkea3.databinding.FragmentInicioBinding


class InicioFragment : Fragment() {

    private var bindingini : FragmentInicioBinding? = null
    private val binding get() = bindingini!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        bindingini = FragmentInicioBinding.inflate(inflater, container, false)
        val vista = binding.root
        binding.btncalcular.setOnClickListener {
            val nota1 = binding.etnota1.text.toString().toInt()
            val nota2 = binding.etnota2.text.toString().toInt()
            val promedio = (nota1 + nota2) / 2
            Snackbar.make(it, "Promedio $promedio", Snackbar.LENGTH_LONG).show()
        }
        return vista
    }

    override fun onDestroyView() {
        super.onDestroyView()
        bindingini = null
    }

}