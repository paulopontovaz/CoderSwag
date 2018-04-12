package com.paulovaz.coderswag.Controller

import android.content.Intent
import android.content.res.Configuration
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import com.paulovaz.coderswag.Adapters.ProductsAdapter
import com.paulovaz.coderswag.R
import com.paulovaz.coderswag.Services.DataService
import com.paulovaz.coderswag.Utilities.EXTRA_CATEGORY
import com.paulovaz.coderswag.Utilities.EXTRA_PRODUCT
import kotlinx.android.synthetic.main.activity_products.*

class ProductsActivity : AppCompatActivity() {
    lateinit var adapter: ProductsAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products)

        val categoryType = intent.getStringExtra(EXTRA_CATEGORY)
        adapter = ProductsAdapter(this, DataService.getProducts(categoryType)) {product ->
            val productDetailIntent = Intent(this, ProductDetailActivity::class.java)
            productDetailIntent.putExtra(EXTRA_PRODUCT, product)
            startActivity(productDetailIntent)
        }

        var spanCount: Int = 2
        var screenSize: Int = resources.configuration.screenWidthDp

        if(resources.configuration.orientation == Configuration.ORIENTATION_LANDSCAPE)
            spanCount = 3

        if(screenSize > 720)
            spanCount = 3

        productListView.layoutManager = GridLayoutManager(this, spanCount)
        productListView.adapter = adapter
    }
}
