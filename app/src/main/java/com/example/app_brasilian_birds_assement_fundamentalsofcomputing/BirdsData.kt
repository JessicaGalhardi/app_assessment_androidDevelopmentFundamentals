package com.example.app_brasilian_birds_assement_fundamentalsofcomputing

import android.os.Parcel
import android.os.Parcelable

data class BirdsData (

    val id:Int?,
    val title:String?,
    val feature: String?,
    val curiosity: String?,
    val overview:String?

    ):Parcelable{
    constructor(parcel: Parcel) : this(
        parcel.readValue(Int::class.java.classLoader) as? Int,
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeValue(id)
        parcel.writeString(title)
        parcel.writeString(feature)
        parcel.writeString(curiosity)
        parcel.writeString(overview)

    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<BirdsData> {
        override fun createFromParcel(parcel: Parcel): BirdsData {
            return BirdsData(parcel)
        }

        override fun newArray(size: Int): Array<BirdsData?> {
            return arrayOfNulls(size)
        }
    }

}



