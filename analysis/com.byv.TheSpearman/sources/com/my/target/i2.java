package com.my.target;

import com.my.target.ads.MyTargetView;
import com.my.target.common.models.IAdLoadingError;

/* loaded from: classes4.dex */
public interface i2 {

    public interface a {
        void a();

        void a(z4 z4Var);

        void b();

        void c();

        void d();

        void onClick();

        void onLoad();

        void onNoAd(IAdLoadingError iAdLoadingError);
    }

    void a();

    void a(MyTargetView.AdSize adSize);

    void a(a aVar);

    String b();

    float c();

    void destroy();

    void pause();

    void prepare();

    void start();

    void stop();
}
