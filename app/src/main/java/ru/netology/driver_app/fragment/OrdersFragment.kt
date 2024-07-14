package ru.netology.driver_app.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import ru.netology.driver_app.databinding.OrdersFragmentBinding

class OrdersFragment: Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        val binding = OrdersFragmentBinding.inflate(inflater, container, false)

        return binding.root
    }
}