package com.abaffym.countriesapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.abaffym.countriesapp.list.CountryListFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, CountryListFragment.newInstance())
                .commit()
        }
    }
}
