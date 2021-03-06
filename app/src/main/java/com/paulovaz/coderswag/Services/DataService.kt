package com.paulovaz.coderswag.Services

import com.paulovaz.coderswag.Model.Category
import com.paulovaz.coderswag.Model.Product

object DataService {
    val categories = listOf(
        Category("Shirts", "shirtimage"),
        Category("Hoodies", "hoodieimage"),
        Category("Hats", "hatimage"),
        Category("Digital", "digitalgoodsimage"),
        Category("Shirts", "shirtimage"),
        Category("Hoodies", "hoodieimage"),
        Category("Hats", "hatimage"),
        Category("Digital", "digitalgoodsimage"),
        Category("Shirts", "shirtimage"),
        Category("Hoodies", "hoodieimage"),
        Category("Hats", "hatimage"),
        Category("Digital", "digitalgoodsimage")
    )

    val hats = listOf(
        Product("Devslopes Graphic Beanie", "$18", "Devslopes Graphic Beanie DESCRIPTION TEXT", "hat1"),
        Product("Devslopes Hat Black", "$20", "Devslopes Hat Black DESCRIPTION TEXT", "hat2"),
        Product("Devslopes Hat White", "$18", "Devslopes Hat White\" DESCRIPTION TEXT", "hat3"),
        Product("Devslopes Hat Snapback", "$22", "Devslopes Hat Snapback DESCRIPTION TEXT", "hat4"),
        Product("Devslopes Graphic Beanie", "$18", "Devslopes Graphic Beanie DESCRIPTION TEXT", "hat1"),
        Product("Devslopes Hat Black", "$20", "Devslopes Hat Black DESCRIPTION TEXT", "hat2"),
        Product("Devslopes Hat White", "$18", "Devslopes Hat White DESCRIPTION TEXT", "hat3"),
        Product("Devslopes Hat Snapback", "$22", "Devslopes Hat Snapback DESCRIPTION TEXT", "hat4"),
        Product("Devslopes Graphic Beanie", "$18", "Devslopes Graphic Beanie DESCRIPTION TEXT", "hat1"),
        Product("Devslopes Hat Black", "$20", "Devslopes Hat Black DESCRIPTION TEXT", "hat2"),
        Product("Devslopes Hat White", "$18", "Devslopes Hat White DESCRIPTION TEXT", "hat3"),
        Product("Devslopes Hat Snapback", "$22", "Devslopes Hat Snapback DESCRIPTION TEXT", "hat4")
    )

    val hoodies = listOf(
        Product("Devslopes Hoodie Gray", "$28", "Devslopes Hoodie Gray DESCRIPTION TEXT", "hoodie1"),
        Product("Devslopes Hoodie Red", "$32", "Devslopes Hoodie Red DESCRIPTION TEXT", "hoodie2"),
        Product("Devslopes Gray Hoodie", "$28", "Devslopes Gray Hoodie DESCRIPTION TEXT", "hoodie3"),
        Product("Devslopes Black Hoodie", "$32", "Devslopes Black Hoodie DESCRIPTION TEXT", "hoodie4"),
        Product("Devslopes Hoodie Gray", "$28", "Devslopes Hoodie Gray DESCRIPTION TEXT", "hoodie1"),
        Product("Devslopes Hoodie Red", "$32", "Devslopes Hoodie Red DESCRIPTION TEXT", "hoodie2"),
        Product("Devslopes Gray Hoodie", "$28", "Devslopes Gray Hoodie DESCRIPTION TEXT", "hoodie3"),
        Product("Devslopes Black Hoodie", "$32", "Devslopes Black Hoodie DESCRIPTION TEXT", "hoodie4"),
        Product("Devslopes Hoodie Gray", "$28", "Devslopes Hoodie Gray DESCRIPTION TEXT", "hoodie1"),
        Product("Devslopes Hoodie Red", "$32", "Devslopes Hoodie Red DESCRIPTION TEXT", "hoodie2"),
        Product("Devslopes Gray Hoodie", "$28", "Devslopes Gray Hoodie DESCRIPTION TEXT", "hoodie3"),
        Product("Devslopes Black Hoodie", "$32", "Devslopes Black Hoodie DESCRIPTION TEXT", "hoodie4")
    )

    val shirts = listOf(
        Product("Devslopes Shirt Black", "$18", "Devslopes Shirt Black DESCRIPTION TEXT", "shirt1"),
        Product("Devslopes Badge Light Gray", "$20", "Devslopes Badge Light Gray DESCRIPTION TEXT", "shirt2"),
        Product("Devslopes Logo Shirt Red", "$22", "Devslopes Logo Shirt Red DESCRIPTION TEXT", "shirt3"),
        Product("Devslopes Hustle", "$22", "Devslopes Hustle DESCRIPTION TEXT", "shirt4"),
        Product("Kickflip Studios", "$18", "Kickflip Studios DESCRIPTION TEXT", "shirt5"),
        Product("Devslopes Shirt Black", "$18", "Devslopes Shirt Black DESCRIPTION TEXT", "shirt1"),
        Product("Devslopes Badge Light Gray", "$20", "Devslopes Badge Light Gray DESCRIPTION TEXT", "shirt2"),
        Product("Devslopes Logo Shirt Red", "$22", "Devslopes Logo Shirt Red DESCRIPTION TEXT", "shirt3"),
        Product("Devslopes Hustle", "$22", "Devslopes Hustle DESCRIPTION TEXT", "shirt4"),
        Product("Kickflip Studios", "$18", "Kickflip Studios DESCRIPTION TEXT", "shirt5"),
        Product("Devslopes Shirt Black", "$18", "Devslopes Shirt Black DESCRIPTION TEXT", "shirt1"),
        Product("Devslopes Badge Light Gray", "$20", "Devslopes Badge Light Gray DESCRIPTION TEXT", "shirt2"),
        Product("Devslopes Logo Shirt Red", "$22", "Devslopes Logo Shirt Red DESCRIPTION TEXT", "shirt3"),
        Product("Devslopes Hustle", "$22", "Devslopes Hustle DESCRIPTION TEXT", "shirt4"),
        Product("Kickflip Studios", "$18", "Kickflip Studios DESCRIPTION TEXT", "shirt5")
    )

    val digitalGoods = listOf<Product>()

    fun getProducts(category: String): List<Product> {
        return when(category){
            "Shirts" -> shirts
            "Hoodies" ->  hoodies
            "Hats" ->  hats
            else ->  digitalGoods
        }
    }
}