package com.example.beeradviser

class BeerExpert {
	public fun getBrands(color: String): MutableList<String> {
		val brands: MutableList<String> = mutableListOf()

		if (color == "amber") {
			brands.add("Jack Amber");
			brands.add("Red Moose");
		} else {
			brands.add("Jail Pale Ale");
			brands.add("Gout Stout");
		}

		return brands
	}

}
