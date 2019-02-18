package com.abaffym.countriesapp.mock

import com.abaffym.countriesapp.model.Country

private val country1 =
    Country(
        0,
        "Norway",
        "Europe's northernmost country, the Kingdom of Norway is famed for its mountains and spectacular fjord coastline, as well as its history as a seafaring power." +
                "It also enjoys one of the world's highest standards of living, in large part due to the discovery in the late 1960s of offshore oil and gas.",
        "https://s3.amazonaws.com/bucketeer-6d83945e-b853-4020-b3f5-e90ed4d4edd1/magazine/wp-content/uploads/2018/05/11115753/Trolltunge-Norway-1024x683.jpeg"
    )

private val country2 =
    Country(
        1,
        "Japan",
        "Japan has the world's third-largest economy, having achieved remarkable growth in the second half of the 20th Century after the devastation of the Second World War." +
                "Its role in the international community is considerable. It is a major aid donor, and a source of global capital and credit.",
        "https://dynaimage.cdn.cnn.com/cnn/q_auto,w_412,c_fill,g_auto,h_232,ar_16:9/http%3A%2F%2Fcdn.cnn.com%2Fcnnnext%2Fdam%2Fassets%2F170606121226-japan---travel-destination---shutterstock-230107657.jpg"
    )

private val country3 = Country(
    2,
    "Australia",
    "Australia ranks as one of the best countries to live in the world by international comparisons of wealth, education, health and quality of life. The sixth-largest country by land mass, its population is comparatively small with most people living around the eastern and south-eastern coastlines." +
            "The country's first inhabitants, the Aboriginal people, are believed to have migrated from Asia tens of thousands of years before the arrival of British settlers in 1788. They now make up less than 3% of Australia's 23 million people.",
    "https://images10.content-hci.com/hca-cont/india/img/countrylanding/9_v1.jpg"
)

val mockCountries = listOf(country1, country2, country3)
