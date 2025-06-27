package com.my.target;

import com.my.target.common.models.IAdLoadingError;

/* loaded from: classes4.dex */
public interface t9 extends s9 {

    public interface a {
        void onLoad();

        void onNoAd(IAdLoadingError iAdLoadingError);
    }

    void a(a aVar);
}
