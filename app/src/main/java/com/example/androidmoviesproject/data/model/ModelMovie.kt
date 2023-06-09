package com.example.androidmoviesproject.data.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class ModelMovie(
    @SerializedName("adult") val adult: Boolean? = null,
    @SerializedName("backdrop_path") val backDropPath: String? = null,
    @SerializedName("genre_ids") val genreIds: List<Int>? = null,
    @SerializedName("id") val id: Int? = null,
    @SerializedName("media_type") val mediaType: String? = null,
    @SerializedName("original_language") val originalLanguage: String? = null,
    @SerializedName("original_title") val originalTitle: String? = null,
    @SerializedName("overview") val overView: String? = null,
    @SerializedName("popularity") val popularity: Double? = null,
    @SerializedName("poster_path") val posterPath: String? = null,
    @SerializedName("release_date") val releaseDate: String,
    @SerializedName("title") val title: String? = null,
    @SerializedName("video") val video: Boolean? = null,
    @SerializedName("vote_average") val voteAverage: Double? = null,
    @SerializedName("vote_count") val voteCount: Int? = null
) : Serializable