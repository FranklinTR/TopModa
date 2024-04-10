package com.franklintorres.topmoda

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.fragment.app.FragmentManager
import com.franklintorres.topmoda.databinding.ActivityNavigationBinding

class NavigationActivity : AppCompatActivity() {

    private lateinit var fragmentManager: FragmentManager
    private lateinit var binding: ActivityNavigationBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNavigationBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)

        val toogle = ActionBarDrawerToggle(this,binding.drawerLayout,binding.toolbar,
            R.string.nav_open,R.string.nav_close)
        binding.drawerLayout.addDrawerListener(toogle)
        toogle.syncState()

    }
}