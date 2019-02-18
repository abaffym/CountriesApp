package com.abaffym.countriesapp.ui.list

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

import com.abaffym.countriesapp.R
import com.abaffym.countriesapp.ui.detail.CountryDetailFragment
import com.abaffym.countriesapp.mock.mockCountries
import kotlinx.android.synthetic.main.fragment_country_list.*
import java.lang.IllegalStateException

class CountryListFragment : Fragment() {

    companion object {
        fun newInstance() = CountryListFragment()
    }

    private lateinit var viewModel: CountryListViewModel

    private lateinit var countryListAdapter: CountryListAdapter

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_country_list, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(CountryListViewModel::class.java)

        setupCountryList()
    }

    private fun setupCountryList() {
        countryListAdapter = CountryListAdapter()

        recycler_country.apply {
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(context, RecyclerView.VERTICAL, false)
            adapter = countryListAdapter
        }

        countryListAdapter.apply {
            setCountries(mockCountries)
            onCountryClickedListener = object : OnCountryClickedListener {
                override fun onCountryClicked(countryId: Long) {
                    navigateToDetail(countryId)
                }
            }
        }
    }

    private fun navigateToDetail(countryId: Long) {
        val fragmentManager = fragmentManager
            ?: throw IllegalStateException("Fragment not attached!")

        fragmentManager.beginTransaction()
            .replace(R.id.fragment_container, CountryDetailFragment.newInstance(countryId))
            .addToBackStack("")
            .commit()
    }


}
