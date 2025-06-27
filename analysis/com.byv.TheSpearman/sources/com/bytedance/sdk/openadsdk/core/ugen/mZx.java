package com.bytedance.sdk.openadsdk.core.ugen;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* compiled from: UGenInitHelper.java */
/* loaded from: classes2.dex */
public class mZx {
    public static void EYQ(Context context) {
        com.bytedance.adsdk.ugeno.Td.EYQ().EYQ(context, new com.bytedance.adsdk.ugeno.core.Td() { // from class: com.bytedance.sdk.openadsdk.core.ugen.mZx.1
            @Override // com.bytedance.adsdk.ugeno.core.Td
            public List<com.bytedance.adsdk.ugeno.core.mZx> EYQ() {
                ArrayList arrayList = new ArrayList();
                arrayList.add(new com.bytedance.adsdk.ugeno.core.mZx("Gif") { // from class: com.bytedance.sdk.openadsdk.core.ugen.mZx.1.1
                    @Override // com.bytedance.adsdk.ugeno.core.mZx
                    public com.bytedance.adsdk.ugeno.component.mZx EYQ(Context context2) {
                        return new com.bytedance.sdk.openadsdk.core.ugen.component.mZx(context2);
                    }
                });
                arrayList.add(new com.bytedance.adsdk.ugeno.core.mZx("Lottie") { // from class: com.bytedance.sdk.openadsdk.core.ugen.mZx.1.2
                    @Override // com.bytedance.adsdk.ugeno.core.mZx
                    public com.bytedance.adsdk.ugeno.component.mZx EYQ(Context context2) {
                        return new com.bytedance.adsdk.mZx.EYQ(context2);
                    }
                });
                arrayList.add(new com.bytedance.adsdk.ugeno.core.mZx("Logo") { // from class: com.bytedance.sdk.openadsdk.core.ugen.mZx.1.3
                    @Override // com.bytedance.adsdk.ugeno.core.mZx
                    public com.bytedance.adsdk.ugeno.component.mZx EYQ(Context context2) {
                        return new com.bytedance.sdk.openadsdk.core.ugen.component.Td(context2);
                    }
                });
                arrayList.add(new com.bytedance.adsdk.ugeno.core.mZx("CommentNum") { // from class: com.bytedance.sdk.openadsdk.core.ugen.mZx.1.4
                    @Override // com.bytedance.adsdk.ugeno.core.mZx
                    public com.bytedance.adsdk.ugeno.component.mZx EYQ(Context context2) {
                        return new com.bytedance.sdk.openadsdk.core.ugen.component.EYQ(context2);
                    }
                });
                arrayList.add(new com.bytedance.adsdk.ugeno.core.mZx("Video") { // from class: com.bytedance.sdk.openadsdk.core.ugen.mZx.1.5
                    @Override // com.bytedance.adsdk.ugeno.core.mZx
                    public com.bytedance.adsdk.ugeno.component.mZx EYQ(Context context2) {
                        return new com.bytedance.sdk.openadsdk.core.ugen.component.video.EYQ(context2);
                    }
                });
                return arrayList;
            }
        }, new EYQ());
    }
}
