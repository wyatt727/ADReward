package com.my.target.nativeads;

import android.view.View;
import com.my.target.nativeads.views.MediaAdView;
import java.util.List;

/* loaded from: classes4.dex */
public final class MediationHelper {
    public static void registerView(NativeAd nativeAd, View view, List<View> list, MediaAdView mediaAdView) {
        nativeAd.registerView(view, list, mediaAdView);
    }
}
