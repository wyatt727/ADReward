package com.bytedance.sdk.openadsdk.core.Kbd;

import android.text.TextUtils;
import android.view.MotionEvent;
import java.util.HashMap;
import java.util.Map;

/* compiled from: SecSdkHelper.java */
/* loaded from: classes2.dex */
class mZx {
    private static com.bytedance.sdk.openadsdk.core.Kbd.EYQ EYQ;
    private String mZx;

    private mZx() {
        this.mZx = null;
        EYQ = new com.bytedance.sdk.openadsdk.core.Kbd.EYQ();
    }

    public void EYQ(String str) {
        com.bytedance.sdk.openadsdk.core.Kbd.EYQ eyq;
        if (TextUtils.isEmpty(str) || (eyq = EYQ) == null) {
            return;
        }
        eyq.EYQ(str);
    }

    public void mZx(String str) {
        com.bytedance.sdk.openadsdk.core.Kbd.EYQ eyq;
        if (TextUtils.isEmpty(str) || (eyq = EYQ) == null) {
            return;
        }
        eyq.mZx(str);
    }

    public static mZx EYQ() {
        return EYQ.EYQ;
    }

    public void Td(String str) {
        com.bytedance.sdk.openadsdk.core.Kbd.EYQ eyq = EYQ;
        if (eyq != null) {
            eyq.Td(str);
        }
    }

    public boolean mZx() {
        com.bytedance.sdk.openadsdk.core.Kbd.EYQ eyq = EYQ;
        if (eyq == null) {
            return false;
        }
        return eyq.mZx();
    }

    public String Td() {
        String strTd;
        com.bytedance.sdk.openadsdk.core.Kbd.EYQ eyq = EYQ;
        return (eyq == null || (strTd = eyq.Td()) == null) ? "" : strTd;
    }

    public Map<String, String> EYQ(String str, byte[] bArr) {
        com.bytedance.sdk.openadsdk.core.Kbd.EYQ eyq = EYQ;
        if (eyq != null) {
            return eyq.EYQ(str, bArr);
        }
        return new HashMap();
    }

    public String Pm() {
        com.bytedance.sdk.openadsdk.core.Kbd.EYQ eyq = EYQ;
        return eyq != null ? eyq.Pm() : "";
    }

    public int Kbd() {
        com.bytedance.sdk.openadsdk.core.Kbd.EYQ eyq = EYQ;
        if (eyq != null) {
            return eyq.Kbd();
        }
        return 1;
    }

    public void EYQ(MotionEvent motionEvent) {
        com.bytedance.sdk.openadsdk.core.Kbd.EYQ eyq = EYQ;
        if (eyq != null) {
            eyq.EYQ(motionEvent);
        }
    }

    /* compiled from: SecSdkHelper.java */
    private static class EYQ {
        private static final mZx EYQ = new mZx();
    }
}
