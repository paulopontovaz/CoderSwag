package com.paulovaz.coderswag.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.paulovaz.coderswag.Model.Product
import com.paulovaz.coderswag.R
import com.paulovaz.coderswag.Utilities.EXTRA_PRODUCT
import kotlinx.android.synthetic.main.activity_product_detail.*

class ProductDetailActivity : AppCompatActivity() {
    private lateinit var product: Product

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product_detail)

        product = intent.getParcelableExtra(EXTRA_PRODUCT)

        val resourceId = this.resources.getIdentifier(product.image, "drawable", this.packageName)
        productDetailImage.setImageResource(resourceId)
        productDetailTitle.text = product.title
        productDetailPrice.text = product.price
        productDetailDescription.text = product.description

        productDetailButton.setOnClickListener{
            Toast.makeText(this,"Added ${product.title} to cart!",Toast.LENGTH_SHORT).show()
        }
    }
}
