package com.example.nyarkobetrand_muguthiwilsonmungai_optional_assignment.model

class FragranceResponse(
    val id: Int,
    val title: String,
    val description: String,
    val brand: String,
    val rating: Float,
    val thumbnail:String,
    val images: Array<String>
) {
    override fun equals(other: Any?): Boolean
    {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as FragranceResponse

        if (!images.contentEquals(other.images)) return false

        return true
    }

    override fun hashCode(): Int
    {
        return images.contentHashCode()
    }
}