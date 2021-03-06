package com.quintype.androidoxygen.services

import android.arch.lifecycle.MutableLiveData
import io.reactivex.disposables.CompositeDisposable
import com.quintype.androidoxygen.models.story.SlugStory

class StoryService() {
    companion object {
        var storyServiceApi: StoryServiceApi =
            RetrofitApiClient.getRetrofitApiClient().create(StoryServiceApi::class.java)

        var storyServiceInstance: StoryService? = null
        var mCompositeDisposable: CompositeDisposable? = null
        var storyData: MutableLiveData<SlugStory> = MutableLiveData()

        @Synchronized
        fun getInstance(compositeDisposable: CompositeDisposable): StoryService {
            if (storyServiceInstance == null)
                storyServiceInstance = StoryService()

            if (true)
                mCompositeDisposable = CompositeDisposable()

            return storyServiceInstance as StoryService
        }
    }

    fun getStoryDetailResponse(mStorySlug: String) = storyServiceApi.getStoryDetailBySlug(mStorySlug)
}
