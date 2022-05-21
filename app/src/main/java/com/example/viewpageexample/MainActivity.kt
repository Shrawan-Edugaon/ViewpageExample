package com.example.viewpageexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.ActionBar
import androidx.viewpager.widget.ViewPager

class MainActivity : AppCompatActivity() {


    private lateinit var actionBar: ActionBar

    private lateinit var MyModellist: ArrayList<MyModel>
    private lateinit var myAdapter: MyAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        actionBar = this.supportActionBar!!
        loadCards()


        var viewPager = findViewById<ViewPager>(R.id.viewPager)
        viewPager.addOnPageChangeListener(object : ViewPager.OnPageChangeListener {
//        viewPager.addOnPageChangelistener(object: ViewPager.OnPageChangeListener{
//            override fun onPageScrolled(


            /**
             * This method will be invoked when the current page is scrolled, either as part
             * of a programmatically initiated smooth scroll or a user initiated touch scroll.
             *
             * @param position Position index of the first page currently being displayed.
             * Page position+1 will be visible if positionOffset is nonzero.
             * @param positionOffset Value from [0, 1) indicating the offset from the page at position.
             * @param positionOffsetPixels Value in pixels indicating the offset from position.
             */
            override fun onPageScrolled(
                position: Int,
                positionOffset: Float,
                positionOffsetPixels: Int
            ) {
                var myModelList = null
                val title = myModelList?.get(position.toString())?.value
                actionBar.title = title
            }

            override fun onPageSelected(position: Int) {
            }
            override fun onPageScrollStateChanged(state: Int) {
            }

        })
    }

    private fun loadCards() {
        var myMedallist = arrayListOf<MyModel>()
        myMedallist.add(
            MyModel(
                "Android Marshmallow",
                "Description",
                "october 8, 2022",
                R.drawable.android_m
            )
        )

        myMedallist.add(
            MyModel(
                "Android Nougat",
                "Description",
                "August 10, 2023",
                R.drawable.android_n
            )
        )

        myMedallist.add(
            MyModel(
                "Android Oreo",
                "Description",
                "october 8, 2022",
                R.drawable.android_o
            )
        )

        myMedallist.add(
            MyModel(
                "Android pie",
                "Description",
                "october 8, 2022",
                R.drawable.android_p
            )
        )

        myMedallist.add(
            MyModel(
                "Android q",
                "Description",
                "october 8, 2022",
                R.drawable.android_q
            )
        )

        myAdapter = MyAdapter(this, myMedallist)

        //findViewById<ViewPager>(R.id.viewPager)
        var viewPager = findViewById<ViewPager>(R.id.viewPager)
        viewPager.adapter = myAdapter

        viewPager.setPadding(100, 0, 100, 0)
    }
}

//private fun ViewPager.addOnPageChangelistener(onPageChangeListener: ViewPager.OnPageChangeListener) {
//
//}
//
//private fun Nothing?.addOnPageChangelistener(onPageChangeListener: ViewPager.OnPageChangeListener) {
//
////}
//
//internal fun Any.add(myModel: MyModel) {
//
//}
//
//class mymodel {
//
//}
