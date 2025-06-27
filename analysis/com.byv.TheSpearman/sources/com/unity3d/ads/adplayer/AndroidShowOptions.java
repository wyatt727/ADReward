package com.unity3d.ads.adplayer;

import android.content.Context;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AndroidShowOptions.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005¢\u0006\u0002\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u0017\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005HÆ\u0003J+\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001f\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/unity3d/ads/adplayer/AndroidShowOptions;", "Lcom/unity3d/ads/adplayer/ShowOptions;", "context", "Landroid/content/Context;", "unityAdsShowOptions", "", "", "", "(Landroid/content/Context;Ljava/util/Map;)V", "getContext", "()Landroid/content/Context;", "getUnityAdsShowOptions", "()Ljava/util/Map;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class AndroidShowOptions implements ShowOptions {
    private final Context context;
    private final Map<String, Object> unityAdsShowOptions;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AndroidShowOptions copy$default(AndroidShowOptions androidShowOptions, Context context, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            context = androidShowOptions.context;
        }
        if ((i & 2) != 0) {
            map = androidShowOptions.unityAdsShowOptions;
        }
        return androidShowOptions.copy(context, map);
    }

    /* renamed from: component1, reason: from getter */
    public final Context getContext() {
        return this.context;
    }

    public final Map<String, Object> component2() {
        return this.unityAdsShowOptions;
    }

    public final AndroidShowOptions copy(Context context, Map<String, ? extends Object> unityAdsShowOptions) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new AndroidShowOptions(context, unityAdsShowOptions);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AndroidShowOptions)) {
            return false;
        }
        AndroidShowOptions androidShowOptions = (AndroidShowOptions) other;
        return Intrinsics.areEqual(this.context, androidShowOptions.context) && Intrinsics.areEqual(this.unityAdsShowOptions, androidShowOptions.unityAdsShowOptions);
    }

    public int hashCode() {
        int iHashCode = this.context.hashCode() * 31;
        Map<String, Object> map = this.unityAdsShowOptions;
        return iHashCode + (map == null ? 0 : map.hashCode());
    }

    public String toString() {
        return "AndroidShowOptions(context=" + this.context + ", unityAdsShowOptions=" + this.unityAdsShowOptions + ')';
    }

    public AndroidShowOptions(Context context, Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.unityAdsShowOptions = map;
    }

    public final Context getContext() {
        return this.context;
    }

    public final Map<String, Object> getUnityAdsShowOptions() {
        return this.unityAdsShowOptions;
    }
}
