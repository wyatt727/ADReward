package com.my.target;

import android.content.Context;
import android.view.View;
import com.my.target.nativeads.NativeBannerAd;
import com.my.target.nativeads.banners.NativeBanner;
import java.util.List;

/* loaded from: classes4.dex */
public interface h2 {
    void a(NativeBannerAd.NativeBannerAdMediaListener nativeBannerAdMediaListener);

    String b();

    float c();

    NativeBanner d();

    void handleAdChoicesClick(Context context);

    void registerView(View view, List<View> list, int i);

    void unregisterView();
}
