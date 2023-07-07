package com.example.beeradviser

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Spinner
import android.widget.TextView

class MainActivity : AppCompatActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)

		val beerButton: Button = findViewById(R.id.find_beer)

		beerButton.setOnClickListener { onClickFindBeer() }
	}

	private fun onClickFindBeer() {
		val brands: TextView = findViewById(R.id.brands)
		val color: Spinner = findViewById(R.id.color)
		val myBeer = BeerExpert()

		val myArray: MutableList<String> = myBeer.getBrands(color.selectedItem.toString())
		var myString = ""
		for (item in myArray) {
			myString += item
			myString += "\n"
		}
		brands.text = myString
	}
}
