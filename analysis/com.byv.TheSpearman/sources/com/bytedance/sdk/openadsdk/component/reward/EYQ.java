package com.bytedance.sdk.openadsdk.component.reward;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.core.hu;
import com.bytedance.sdk.openadsdk.core.model.UB;

/* compiled from: ChooseAdHelper.java */
/* loaded from: classes2.dex */
public class EYQ {
    public static void EYQ(com.bytedance.sdk.openadsdk.core.model.EYQ eyq, int i) {
        if (eyq == null || eyq.Td() == null || eyq.Td().size() <= 0) {
            return;
        }
        if (i >= eyq.Td().size()) {
            i = 0;
        }
        EYQ(eyq.Td().get(i), !TextUtils.isEmpty(Pm.EYQ(hu.EYQ()).EYQ(r1)));
    }

    public static void EYQ(final UB ub, final boolean z) {
        com.bytedance.sdk.openadsdk.core.pi.mZx().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.EYQ.1
            @Override // java.lang.Runnable
            public void run() {
                if (ub == null) {
                    return;
                }
                try {
                    Context contextEYQ = hu.EYQ();
                    AdSlot adSlotNvm = ub.Nvm();
                    if (adSlotNvm != null) {
                        Kbd.EYQ(contextEYQ).EYQ(adSlotNvm.getCodeId());
                        if (z) {
                            Kbd.EYQ(contextEYQ).mZx(adSlotNvm);
                        }
                    }
                } catch (Throwable unused) {
                }
            }
        });
    }
}
