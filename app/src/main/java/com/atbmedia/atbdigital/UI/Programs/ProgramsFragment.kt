package com.atbmedia.atbdigital.UI.Programs

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.atbmedia.atbdigital.R
import com.atbmedia.atbdigital.databinding.FragmentProgramsBinding
import com.atbmedia.atbdigital.databinding.FragmentSectionsBinding

class ProgramsFragment : Fragment() {

    private var _binding: FragmentProgramsBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentProgramsBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

}