package com.portfolio.romanustiantcev.listmaker

import android.os.Parcel
import android.os.Parcelable
import java.util.ArrayList

class TaskList(val name: String, val tasks: ArrayList<String> = ArrayList<String>()): Parcelable {
    constructor(source: Parcel): this(
            source.readString(),
            source.createStringArrayList()
    )

    override fun describeContents() = 0

    override fun writeToParcel(dest: Parcel?, flags: Int) {
        dest?.writeString(name)
        dest?.writeStringList(tasks)
    }

    companion object CREATOR: Parcelable.Creator<TaskList> {
        override fun createFromParcel(source: Parcel): TaskList {
            return TaskList(source)
        }

        override fun newArray(size: Int): Array<TaskList?> {
            return arrayOfNulls(size)
        }
    }


}