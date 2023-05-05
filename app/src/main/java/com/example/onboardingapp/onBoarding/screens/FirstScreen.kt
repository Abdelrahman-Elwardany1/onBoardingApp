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

class FirstScreen : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_first_screen, container, false)

        val viewPager = activity?.findViewById<ViewPager2>(R.id.onBoardingViewPagerID)
        val onBoardingButton = view.findViewById<ImageButton>(R.id.onBoardingButtonID)
        val myProgressBar = view.findViewById<ProgressBar>(R.id.onBoardingProgressBarID)

        myProgressBar.progress = 33.33333333333333.toInt()

        onBoardingButton.setOnClickListener {
            viewPager?.currentItem = 1
        }

        return view
    }
}