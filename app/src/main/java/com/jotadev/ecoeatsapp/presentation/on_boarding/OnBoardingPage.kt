package com.jotadev.ecoeatsapp.presentation.on_boarding

import androidx.annotation.DrawableRes
import com.jotadev.ecoeatsapp.R

sealed class OnBoardingPage(
    @DrawableRes
    val image:Int,
    val title:String,
    val description:String
){
    object First : OnBoardingPage(
        image = R.drawable.image_pager1,
        title = "Greetings",
        description = "Are you a Boruto fan? Because if you are then we have a great news for you!"
    )

    object Second : OnBoardingPage(
        image = R.drawable.image_pager2,
        title = "Explore",
        description = "Find your favorite heroes and learn some of the things that you didn't know about."
    )

    object Third : OnBoardingPage(
        image = R.drawable.image_pager3,
        title = "Power",
        description = "Check out your hero's power and  see how much are they strong comparing to others."
    )



}