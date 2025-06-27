package com.google.ads.mediation.vungle;

import android.content.Context;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.json.t2;
import com.vungle.ads.InitializationListener;
import kotlin.Metadata;

/* compiled from: VungleSdkWrapper.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&J \u0010\u0007\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH&J\b\u0010\f\u001a\u00020\rH&¨\u0006\u000e"}, d2 = {"Lcom/google/ads/mediation/vungle/SdkWrapper;", "", "getBiddingToken", "", "context", "Landroid/content/Context;", "getSdkVersion", t2.a.e, "", RemoteConfigConstants.RequestFieldKey.APP_ID, "initializationListener", "Lcom/vungle/ads/InitializationListener;", "isInitialized", "", "liftoffmonetize_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface SdkWrapper {
    String getBiddingToken(Context context);

    String getSdkVersion();

    void init(Context context, String appId, InitializationListener initializationListener);

    boolean isInitialized();
}
