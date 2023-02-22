package com.almseit.bazaar.presentation.bottomNavigation

import com.almseit.bazaar.R

sealed class BottomItem(val title:String,val iconId:Int,val route:String){
    object Screen1: BottomItem("Screen1", R.drawable.email_24,"screen_1")
    object Screen2: BottomItem("Screen2", R.drawable.email_24,"screen_2")
    object Screen3: BottomItem("Screen3", R.drawable.email_24,"screen_3")
    object Screen4: BottomItem("Screen4", R.drawable.email_24,"screen_4")
    object Screen5: BottomItem("Screen5", R.drawable.email_24,"screen_5")
}
