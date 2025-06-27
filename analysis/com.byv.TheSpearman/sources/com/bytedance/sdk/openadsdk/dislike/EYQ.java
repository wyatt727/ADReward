package com.bytedance.sdk.openadsdk.dislike;

import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.core.UB;
import com.bytedance.sdk.openadsdk.core.hu;
import java.util.List;

/* compiled from: DislikeDispatcher.java */
/* loaded from: classes2.dex */
public class EYQ {
    private static volatile EYQ EYQ;
    private final UB<com.bytedance.sdk.openadsdk.mZx.EYQ> mZx = hu.Td();

    private EYQ() {
    }

    public static EYQ EYQ() {
        if (EYQ == null) {
            synchronized (EYQ.class) {
                if (EYQ == null) {
                    EYQ = new EYQ();
                }
            }
        }
        return EYQ;
    }

    public void EYQ(String str, List<FilterWord> list) {
        EYQ(str, list, null, null);
    }

    public void EYQ(String str, List<FilterWord> list, String str2, String str3) {
        this.mZx.EYQ(str, list, str2, str3);
    }
}
