package com.bytedance.sdk.openadsdk.component.reward.mZx;

import com.bytedance.sdk.openadsdk.core.model.UB;
import com.bytedance.sdk.openadsdk.core.model.Uc;
import com.bytedance.sdk.openadsdk.core.model.zF;

/* compiled from: RewardFullTypeFactory.java */
/* loaded from: classes2.dex */
public class IPb {
    public static mZx EYQ(com.bytedance.sdk.openadsdk.component.reward.EYQ.EYQ eyq) {
        UB ub = eyq.EYQ;
        if ((ub instanceof Uc) && ((Uc) ub).oFG()) {
            return new Kbd(eyq);
        }
        if (zF.MxO(ub)) {
            return new HX(eyq);
        }
        if (VwS.Td(ub)) {
            return new VwS(eyq);
        }
        if (QQ.EYQ(ub)) {
            return new QQ(eyq);
        }
        if (HX.EYQ(ub)) {
            return new HX(eyq);
        }
        if (Td.EYQ(ub)) {
            return new Td(eyq);
        }
        return new Pm(eyq);
    }
}
