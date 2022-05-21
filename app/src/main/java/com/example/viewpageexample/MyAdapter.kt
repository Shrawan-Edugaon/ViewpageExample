package com.example.viewpageexample

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.viewpager.widget.PagerAdapter

class MyAdapter(private val context: Context, private val myModelArrayList:ArrayList<MyModel>) : PagerAdapter() {

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view ==`object`
    }
    override fun getCount(): Int {
        return myModelArrayList.size
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        val rowView = LayoutInflater.from(context).inflate(R.layout.card_item,container,false)

        val model = myModelArrayList.get(position)
        val title = model.title
        val description = model.description
        val data = model.data
        val image = model.image

        val img = rowView.findViewById<ImageView>(R.id.bannerTv)
        val setTitle = rowView.findViewById<TextView>(R.id.titleTv)
        val setDescription = rowView.findViewById<TextView>(R.id.descriptionTv)
         val  setData = rowView.findViewById<TextView>(R.id.dataTv)

        setTitle.text = title.toString()
        setDescription.text = title.toString()
        setData.text = data.toString()

        rowView.setOnClickListener {

            Toast.makeText(context,"$title \n $description \n $data", Toast.LENGTH_SHORT).show()
        }
        container.addView(rowView,position)
        return rowView
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        container.removeView(`object` as View)
    }
}