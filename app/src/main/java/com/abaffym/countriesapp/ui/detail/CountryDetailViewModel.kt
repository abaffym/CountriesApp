package com.abaffym.countriesapp.ui.detail

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel;
import com.abaffym.countriesapp.mock.mockCountries
import com.abaffym.countriesapp.model.Country

class CountryDetailViewModel : ViewModel() {

    private val _country: MutableLiveData<Country> = MutableLiveData()

    val country: LiveData<Country> = _country

    fun setCountryId(countryId: Long) {
        _country.value = mockCountries.first { it.id == countryId }
    }

}
