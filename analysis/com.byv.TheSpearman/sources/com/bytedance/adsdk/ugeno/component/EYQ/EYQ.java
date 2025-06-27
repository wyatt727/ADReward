package com.bytedance.adsdk.ugeno.component.EYQ;

import android.content.Context;
import com.bytedance.adsdk.ugeno.component.frame.UGFrameLayout;

/* compiled from: UGenVideoWidget.java */
/* loaded from: classes2.dex */
public abstract class EYQ extends com.bytedance.adsdk.ugeno.component.EYQ<UGFrameLayout> {
    public EYQ(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.component.EYQ, com.bytedance.adsdk.ugeno.component.mZx
    public void mZx() {
        super.mZx();
    }

    @Override // com.bytedance.adsdk.ugeno.component.mZx
    public void EYQ(String str, String str2) {
        super.EYQ(str, str2);
        str.hashCode();
        switch (str) {
            case "onVideoProgress":
            case "onVideoFinish":
            case "onVideoPlay":
            case "onVideoResume":
            case "onVideoPause":
                mZx(str, str2);
                break;
        }
    }
}
