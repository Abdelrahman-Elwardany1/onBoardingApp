package com.example.onboardingapp.onBoarding.screens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import android.widget.ProgressBar
import androidx.viewpager2.widget.ViewPager2
import com.example.onboardingapp.R

class SecondScreen : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_second_screen, container, false)

        val viewPager = activity?.findViewById<ViewPager2>(R.id.onBoardingViewPagerID)
        val onBoardingButton = view.findViewById<ImageButton>(R.id.onBoardingButtonID2)
        val myProgressBar = view.findViewById<ProgressBar>(R.id.onBoardingProgressBarID2)

        myProgressBar.progress = 66.66666666666666.toInt()

        onBoardingButton.setOnClickListener {
            viewPager?.currentItem = 2
        }

        return view
    }
}