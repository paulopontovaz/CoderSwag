package com.paulovaz.coderswag.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.paulovaz.coderswag.Model.Category
import com.paulovaz.coderswag.R

class CategoryAdapter(
        private val context: Context,
        private val categories: List<Category>
): BaseAdapter() {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val categoryView: View
        val category = categories[position]
        val resourceId = context.resources.getIdentifier(
                category.image,
                "drawable",
                context.packageName
        )
        var holder: ViewHolder

        if (convertView == null) {
            categoryView = LayoutInflater.from(context).inflate(R.layout.category_list_item, null)
            val categoryName : TextView = categoryView.findViewById(R.id.categoryName)
            val categoryImage : ImageView = categoryView.findViewById(R.id.categoryImage)
            holder = ViewHolder()
            holder.categoryName = categoryName
            holder.categoryImage = categoryImage

            categoryView.tag = holder
        }
        else {
            holder = convertView.tag as ViewHolder
            categoryView = convertView
        }

        holder.categoryImage?.setImageResource(resourceId)
        holder.categoryName?.text = category.title
        return categoryView
    }

    override fun getItem(position: Int): Any {
        return categories[position]
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getCount(): Int {
        return categories.count()
    }

    private class ViewHolder {
        var categoryName: TextView? = null
        var categoryImage: ImageView? = null
    }
}