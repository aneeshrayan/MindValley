package com.demo.mindvalley.main.presentation.ui.activity

import android.os.Bundle
import com.demo.mindvalley.R
import com.demo.mindvalley.common.Utils
import dagger.android.support.DaggerAppCompatActivity

class HomeActivity : DaggerAppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        Utils().transparentStatusAndNavigation(window)
    }
}
