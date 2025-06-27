package com.my.target.instreamads;

import android.content.Context;
import com.my.target.instreamads.InstreamAd;

/* loaded from: classes4.dex */
public interface InstreamAdVideoMotionPlayer {

    public interface VideoMotionPlayerListener {
        void onBannerComplete(Context context);

        void onBannerShow(Context context);

        void onCloseByUser(Context context);

        void onError(String str, Context context);

        void onHeaderClick(Context context);

        void onItemClick(String str, Context context);

        void onItemShow(String str, Context context);
    }

    void playVideoMotionBanner(InstreamAd.InstreamAdVideoMotionBanner instreamAdVideoMotionBanner);

    void setVideoMotionPlayerListener(VideoMotionPlayerListener videoMotionPlayerListener);
}
