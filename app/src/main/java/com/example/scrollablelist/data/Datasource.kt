package com.example.scrollablelist.data

import com.example.scrollablelist.R
import com.example.scrollablelist.model.Entertainment

class Datasource {
    fun loadEntertainment(): List<Entertainment>{
        return listOf<Entertainment>(
            Entertainment(R.string.image1, R.drawable.image1, R.string.theBatman),
            Entertainment(R.string.image2, R.drawable.image2, R.string.bvs),
            Entertainment(R.string.image3, R.drawable.image3, R.string.infinityWar),
            Entertainment(R.string.image4, R.drawable.image4, R.string.endgame),
            Entertainment(R.string.image5, R.drawable.image5, R.string.wandavision),
            Entertainment(R.string.image6, R.drawable.image6, R.string.snyderCut),
            Entertainment(R.string.image7, R.drawable.image7, R.string.superman),
            Entertainment(R.string.image8, R.drawable.image8, R.string.doctorStrange2),
            Entertainment(R.string.image9, R.drawable.image9, R.string.ragnarok),
            Entertainment(R.string.image10, R.drawable.image10, R.string.mos),
        )
    }
}