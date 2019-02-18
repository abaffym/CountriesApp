package com.abaffym.countriesapp.mock

import com.abaffym.countriesapp.model.Country

private val country1 =
    Country(
        0,
        "Norway",
        "Norway",
        "https://s3.amazonaws.com/bucketeer-6d83945e-b853-4020-b3f5-e90ed4d4edd1/magazine/wp-content/uploads/2018/05/11115753/Trolltunge-Norway-1024x683.jpeg"
    )

private val country2 =
    Country(
        1,
        "Japan",
        "Japan",
        "https://dynaimage.cdn.cnn.com/cnn/q_auto,w_412,c_fill,g_auto,h_232,ar_16:9/http%3A%2F%2Fcdn.cnn.com%2Fcnnnext%2Fdam%2Fassets%2F170606121226-japan---travel-destination---shutterstock-230107657.jpg"
    )

private val country3 = Country(
    2,
    "Australia",
    "Australia",
    "https://images10.content-hci.com/hca-cont/india/img/countrylanding/9_v1.jpg"
)

val mockCountries = listOf(country1, country2, country3)
