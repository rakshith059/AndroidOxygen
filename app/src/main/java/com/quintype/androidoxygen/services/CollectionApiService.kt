package com.quintype.androidoxygen.services

import io.reactivex.Flowable
import com.quintype.androidoxygen.models.BulkCollectionRequest
import com.quintype.androidoxygen.models.collection.CollectionResponse
import com.quintype.androidoxygen.Constants
import retrofit2.http.*

/**
 * Created TemplateCollectionWithRx by rakshith on 7/23/18.
 */

interface CollectionApiService {
    @Headers(Constants.CONTENT_TYPE_APPLICATION_JSON_CHARSET_UTF_8)
    @GET("/api/v1/collections/{" + Constants.COLLECTION_SLUG + "}")
    fun getCollectionApiService(
        @Path(Constants.COLLECTION_SLUG) mCollectionName: String,
        @Query(Constants.QUERY_PARAM_KEY_LIMIT) limit: Int,
        @Query(Constants.QUERY_PARAM_KEY_OFFSET) offset: Int,
        @Query(Constants.QUERY_PARAM_KEY_FIELDS) storyFields: String): Flowable<CollectionResponse>

    @Headers(Constants.CONTENT_TYPE_APPLICATION_JSON_CHARSET_UTF_8)
    @GET("/api/v1/collections/{" + Constants.COLLECTION_SLUG + "}")
    fun getCollectionOnlyStoriesApiService(
        @Path(Constants.COLLECTION_SLUG) mCollectionName: String,
        @Query(Constants.QUERY_PARAM_KEY_LIMIT) limit: Int,
        @Query(Constants.QUERY_PARAM_KEY_OFFSET) offset: Int,
        @Query(Constants.QUERY_PARAM_KEY_ITEM_TYPE) itemType: String,
        @Query(Constants.QUERY_PARAM_KEY_FIELDS) storyFields: String): Flowable<CollectionResponse>

    @Headers(Constants.CONTENT_TYPE_APPLICATION_JSON_CHARSET_UTF_8)
    @POST("/api/v1/bulk")
    fun getCollectionBulk(@QueryMap bulkCollectionRequest: BulkCollectionRequest): Flowable<CollectionResponse>
}