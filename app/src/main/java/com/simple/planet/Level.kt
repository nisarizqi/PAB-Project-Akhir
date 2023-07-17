package com.simple.planet

import android.os.Parcel
import android.os.Parcelable

data class Level(
    val id: Int,
    val text: String
) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readInt(),
        parcel.readString()!!
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(id)
        parcel.writeString(text)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Level> {
        override fun createFromParcel(parcel: Parcel): Level {
            return Level(parcel)
        }

        override fun newArray(size: Int): Array<Level?> {
            return arrayOfNulls(size)
        }
    }
}
