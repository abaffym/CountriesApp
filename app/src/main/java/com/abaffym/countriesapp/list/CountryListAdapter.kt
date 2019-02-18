package com.abaffym.countriesapp.list

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.abaffym.countriesapp.R
import com.abaffym.countriesapp.model.Country
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.item_country.view.*

interface OnCountryClickedListener {
    fun onCountryClicked(countryId: Long)
}

class CountryListAdapter : RecyclerView.Adapter<CountryListAdapter.CountryListViewHolder>() {

    private val countries = mutableListOf<Country>()

    var onCountryClickedListener: OnCountryClickedListener? = null

    fun setCountries(newCountries: List<Country>) {
        countries.clear()
        countries.addAll(newCountries)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CountryListViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_country, parent, false)
        return CountryListViewHolder(view)
    }

    override fun getItemCount() = countries.size

    override fun onBindViewHolder(holder: CountryListViewHolder, position: Int) {
        val country = countries[position]
        holder.bind(country)
    }


    inner class CountryListViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {

        fun bind(country: Country) = view.apply {
            tv_country_name.text = country.name
            tv_country_description.text = country.description
            Picasso.with(view.context).apply {
                isLoggingEnabled = true
            }.load(country.imageUrl).into(iv_country_image)
            setOnClickListener {
                onCountryClickedListener?.onCountryClicked(country.id)
            }
        }

    }

}
