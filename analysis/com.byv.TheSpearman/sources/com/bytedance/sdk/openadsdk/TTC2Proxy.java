package com.bytedance.sdk.openadsdk;

import android.content.Context;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAdLoadListener;
import com.bytedance.sdk.openadsdk.component.VwS;
import com.bytedance.sdk.openadsdk.component.VwS.EYQ;

/* loaded from: classes2.dex */
public class TTC2Proxy {
    private TTC2Proxy() {
    }

    public static void load(Context context, AdSlot adSlot, PAGAppOpenAdLoadListener pAGAppOpenAdLoadListener, int i) {
        adSlot.setDurationSlotType(3);
        VwS.EYQ(context).EYQ(adSlot, pAGAppOpenAdLoadListener, i);
    }

    public static void a(Context context) {
        EYQ.EYQ(context);
    }
}
