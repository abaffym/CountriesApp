package com.abaffym.countriesapp.ui.detail

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.lifecycle.Observer

import com.abaffym.countriesapp.R
import com.abaffym.countriesapp.model.Country
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.fragment_country_detail.*
import java.lang.IllegalStateException

const val ARG_COUNTRY_ID = "extra_country_id"

class CountryDetailFragment : Fragment() {

    companion object {
        fun newInstance(countryId: Long) = CountryDetailFragment().apply {
            arguments = bundleOf(
                ARG_COUNTRY_ID to countryId
            )
        }
    }

    private lateinit var viewModel: CountryDetailViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_country_detail, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(CountryDetailViewModel::class.java)

        val countryId = arguments?.getLong(ARG_COUNTRY_ID)
            ?: throw IllegalStateException("Missing countryId argument.")

        viewModel.setCountryId(countryId)

        setupObservers()

    }

    private fun setupObservers() {
        viewModel.country.observe(this, Observer { renderCountry(it) })
    }

    private fun renderCountry(country: Country) {
        tv_country_name.text = country.name
        tv_country_description.text = country.description
        Picasso.with(context).load(country.imageUrl).into(iv_country_image)
    }


}
