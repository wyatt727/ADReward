package com.bytedance.sdk.openadsdk;

import android.content.Context;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdLoadListener;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdLoadListener;
import com.bytedance.sdk.openadsdk.component.Td.mZx;
import com.bytedance.sdk.openadsdk.component.reward.Kbd;
import com.bytedance.sdk.openadsdk.component.reward.VwS;
import com.bytedance.sdk.openadsdk.component.reward.tp;
import com.bytedance.sdk.openadsdk.component.reward.tsL;
import org.json.JSONException;

/* loaded from: classes2.dex */
public class TTC3Proxy {
    public static void verityPlayable(String str, int i, String str2, String str3, String str4) throws JSONException {
        tp.EYQ(str, i, str2, str3, str4);
    }

    public static void loadReward(Context context, AdSlot adSlot, PAGRewardedAdLoadListener pAGRewardedAdLoadListener) {
        adSlot.setDurationSlotType(7);
        tsL.EYQ(context).EYQ(adSlot, new VwS(pAGRewardedAdLoadListener));
    }

    public static void loadFull(Context context, AdSlot adSlot, PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener) {
        adSlot.setDurationSlotType(8);
        Kbd.EYQ(context).EYQ(adSlot, new mZx(pAGInterstitialAdLoadListener));
    }

    public static void a(Context context) {
        try {
            tsL.EYQ(context).EYQ();
        } catch (Throwable unused) {
        }
        try {
            Kbd.EYQ(context).EYQ();
        } catch (Throwable unused2) {
        }
    }
}
