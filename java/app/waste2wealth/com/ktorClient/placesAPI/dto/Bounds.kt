package app.waste2wealth.com.ktorClient.placesAPI.dto


import com.google.gson.annotations.SerializedName

data class Bounds(
    @SerializedName("northeast")
    val northeast: Northeast?,
    @SerializedName("southwest")
    val southwest: Southwest?
)