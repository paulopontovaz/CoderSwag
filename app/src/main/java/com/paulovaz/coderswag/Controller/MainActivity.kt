package com.paulovaz.coderswag.Controller

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import com.paulovaz.coderswag.Adapters.CategoryRecycleAdapter
import com.paulovaz.coderswag.R
import com.paulovaz.coderswag.Services.DataService
import com.paulovaz.coderswag.Utilities.EXTRA_CATEGORY
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var adapter: CategoryRecycleAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryRecycleAdapter(this, DataService.categories) {category ->
            val productIntent = Intent(this, ProductsActivity::class.java)
            productIntent.putExtra(EXTRA_CATEGORY, category.title)
            startActivity(productIntent)
        }
        categoryListView.adapter = adapter

        categoryListView.layoutManager = LinearLayoutManager(this)
        categoryListView.setHasFixedSize(true)
    }
}
