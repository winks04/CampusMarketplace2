package com.example.campusmarketplace

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.example.campusmarketplace.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
//    NavigationView.OnNavigationItemSelectedListner {

//    private lateinit var fragmentManager: FragmentManager
//    private lateinit var binding: ActivityMainBinding
//
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        binding = ActivityMainBinding.inflate(layoutInflater)
//        setContentView(binding.root)
//
//        setSupportActionBar(binding.toolbar)
//
//        val toggle = ActionBarDrawerToggle(activity: this, binding.drawerLayout, binding.toolbar, R.string)
    }
//
//    override fun onNavigationItemSelected(item: MenuItem): Boolean {
//        when(item.itemId){
//            R.id.nav_cart -> openFragment(CartFragment())
//        }
//        binding.drawerLayout.closeDrawer(GravityCompat.START)
//    }
//
//    override fun onBackPressed() {
//        if (binding.drawerLayout.isDrawerOpen(GravityCompat.START)){
//            binding.drawerLayout.closeDrawer(GravityCompat.START)
//        } else {
//            super.getOnBackPressedDispatcher().onBackPressed()
//        }
//    }
//    private fun openFragment(fragment: Fragment) {
//        val fragmentTransaction: FragmentTransaction = fragmentManager.beginTransaction()
//        fragmentTransaction.replace(R.id.fragment_container, fragment)
//        fragmentTransaction.commit()
//    }
}