package com.my.target;

import android.content.Context;
import com.my.target.ads.Reward;
import com.my.target.common.models.IAdLoadingError;

/* loaded from: classes4.dex */
public interface f2 {

    public interface a {
        void onClick();

        void onDismiss();

        void onDisplay();

        void onLoad();

        void onNoAd(IAdLoadingError iAdLoadingError);

        void onStartDisplaying();

        void onVideoCompleted();
    }

    public interface b {
        void onReward(Reward reward);
    }

    void a(Context context);

    void a(b bVar);

    String b();

    float c();

    void destroy();

    void dismiss();
}
