package com.portfolio.romanustiantcev.listmaker

import android.support.v7.widget.RecyclerView
import android.widget.TextView
import android.view.View

class ListSelectionViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)  {

    val listPosition = itemView.findViewById(R.id.itemNumber) as TextView
    val listTitle = itemView.findViewById(R.id.itemString) as TextView


}