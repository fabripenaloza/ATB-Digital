package com.atbmedia.atbdigital.UI.Sections

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.atbmedia.atbdigital.R
import com.atbmedia.atbdigital.databinding.FragmentSectionsBinding


class SectionsFragment : Fragment() {

    private var _binding:FragmentSectionsBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentSectionsBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

}