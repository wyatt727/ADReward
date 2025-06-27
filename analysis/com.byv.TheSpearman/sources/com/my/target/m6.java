package com.my.target;

import android.view.View;
import com.my.target.nativeads.INativeAd;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes4.dex */
public class m6 {

    /* renamed from: a, reason: collision with root package name */
    public static final WeakHashMap<View, WeakReference<INativeAd>> f4055a = new WeakHashMap<>();

    public static void a(View view, INativeAd iNativeAd) {
        INativeAd iNativeAd2;
        a(iNativeAd);
        WeakHashMap<View, WeakReference<INativeAd>> weakHashMap = f4055a;
        WeakReference<INativeAd> weakReference = weakHashMap.get(view);
        if (weakReference != null && (iNativeAd2 = weakReference.get()) != null) {
            iNativeAd2.unregisterView();
        }
        weakHashMap.put(view, new WeakReference<>(iNativeAd));
    }

    public static void a(INativeAd iNativeAd) {
        INativeAd iNativeAd2;
        for (Map.Entry<View, WeakReference<INativeAd>> entry : f4055a.entrySet()) {
            View key = entry.getKey();
            WeakReference<INativeAd> value = entry.getValue();
            if (value != null && ((iNativeAd2 = value.get()) == null || iNativeAd2 == iNativeAd)) {
                f4055a.remove(key);
                return;
            }
        }
    }
}
