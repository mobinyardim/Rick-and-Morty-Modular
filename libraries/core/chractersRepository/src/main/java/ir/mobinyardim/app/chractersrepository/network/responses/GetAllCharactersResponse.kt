package ir.mobinyardim.app.chractersrepository.network.responses


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class GetAllCharactersResponse(
    @Json(name = "info")
    val info: Info,
    @Json(name = "results")
    val characters: List<CharacterResponse>
) {
    @JsonClass(generateAdapter = true)
    data class Info(
        @Json(name = "count")
        val count: Int,
        @Json(name = "next")
        val next: String,
        @Json(name = "pages")
        val pages: Int,
        @Json(name = "prev")
        val prev: Any
    )


}