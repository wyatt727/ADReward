package com.google.ads.mediation.mintegral;

import android.view.ViewGroup;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.json.i1;
import com.json.t2;
import com.mbridge.msdk.out.MBSplashLoadWithCodeListener;
import com.mbridge.msdk.out.MBSplashShowListener;
import kotlin.Metadata;
import org.json.JSONObject;

/* compiled from: MintegralFactory.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&J\b\u0010\u0007\u001a\u00020\u0003H&J\b\u0010\b\u001a\u00020\u0003H&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0005H&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH&J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0010H&J\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0012H&J\u0010\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0015H&J\u0018\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0005H&¨\u0006\u0017"}, d2 = {"Lcom/google/ads/mediation/mintegral/MintegralSplashAdWrapper;", "", "createAd", "", t2.k, "", "adUnitId", "onDestroy", "preLoad", "preLoadByToken", "token", "setExtraInfo", "jsonObject", "Lorg/json/JSONObject;", "setSplashLoadListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/mbridge/msdk/out/MBSplashLoadWithCodeListener;", "setSplashShowListener", "Lcom/mbridge/msdk/out/MBSplashShowListener;", i1.u, "group", "Landroid/view/ViewGroup;", "bidToken", "mintegral_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface MintegralSplashAdWrapper {
    void createAd(String placementId, String adUnitId);

    void onDestroy();

    void preLoad();

    void preLoadByToken(String token);

    void setExtraInfo(JSONObject jsonObject);

    void setSplashLoadListener(MBSplashLoadWithCodeListener listener);

    void setSplashShowListener(MBSplashShowListener listener);

    void show(ViewGroup group);

    void show(ViewGroup group, String bidToken);
}
