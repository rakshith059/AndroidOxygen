package com.quintype.androidoxygen.services

import io.reactivex.Single
import com.quintype.androidoxygen.models.story.SlugStory
import com.quintype.androidoxygen.Constants
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface StoryServiceApi {
    @Headers(Constants.CONTENT_TYPE_APPLICATION_JSON_CHARSET_UTF_8)
    @GET("/api/v1/stories-by-slug")
    fun getStoryDetailBySlug(@Query(Constants.QUERY_PARAM_KEY_STORY_SLUG) storySlug: String): Single<SlugStory>
}
