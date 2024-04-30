package com.example.socialappdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.socialappdemo.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding
    private lateinit var bottomNav: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.vfollwers.posttext.setText("followers")
        binding.vfollwers.tvPostscount.setText("100")

        binding.vfollowing.tvPostscount.setText("100")
        binding.vfollowing.posttext.setText("following")

        val homeFragment = home_fragment()
        val SearchFragment = SearchFragment()
        val ProfileFragment = ProfileFragment()

        loadFragment(homeFragment)
        bottomNav = binding.bottomNav
        bottomNav.setOnItemSelectedListener {
            when(it.itemId){
                R.id.home_button -> {
                    loadFragment(homeFragment)
                    true
                }
                R.id.search_button ->{
                    loadFragment(SearchFragment)
                    true
                }
                R.id.proflie_button ->{
                    loadFragment(ProfileFragment)
                    true
                }

                else -> {
                    loadFragment(homeFragment)
                    true
                }
            }
        }




    }

    private fun loadFragment(fragment: Fragment) {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.bottonnavcontainer, fragment)
        transaction.commit()
    }
}