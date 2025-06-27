package com.google.ads.mediation.mintegral;

import android.content.Context;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.json.t2;
import com.mbridge.msdk.newinterstitial.out.NewInterstitialWithCodeListener;
import kotlin.Metadata;
import org.json.JSONObject;

/* compiled from: MintegralFactory.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0007H&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH&J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0010H&J\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0013H&J\b\u0010\u0014\u001a\u00020\u0003H&¨\u0006\u0015"}, d2 = {"Lcom/google/ads/mediation/mintegral/MintegralBidNewInterstitialAdWrapper;", "", "createAd", "", "context", "Landroid/content/Context;", t2.k, "", "adUnitId", "loadFromBid", "bidToken", "playVideoMute", "muteConstant", "", "setExtraInfo", "jsonObject", "Lorg/json/JSONObject;", "setInterstitialVideoListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/mbridge/msdk/newinterstitial/out/NewInterstitialWithCodeListener;", "showFromBid", "mintegral_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface MintegralBidNewInterstitialAdWrapper {
    void createAd(Context context, String placementId, String adUnitId);

    void loadFromBid(String bidToken);

    void playVideoMute(int muteConstant);

    void setExtraInfo(JSONObject jsonObject);

    void setInterstitialVideoListener(NewInterstitialWithCodeListener listener);

    void showFromBid();
}
