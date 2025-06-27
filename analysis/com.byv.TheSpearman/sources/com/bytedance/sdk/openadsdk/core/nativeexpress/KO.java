package com.bytedance.sdk.openadsdk.core.nativeexpress;

import android.os.SystemClock;
import com.json.t2;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: UGenLoadTemplateListenerImpl.java */
/* loaded from: classes2.dex */
public class KO implements com.bytedance.sdk.openadsdk.core.ugen.Pm.mZx {
    private long EYQ = 0;
    private long mZx = 0;
    private int Td = 0;
    private String Pm = null;
    private String Kbd = null;
    private final AtomicBoolean IPb = new AtomicBoolean(false);

    @Override // com.bytedance.sdk.openadsdk.core.ugen.Pm.mZx
    public void EYQ() {
        this.EYQ = SystemClock.elapsedRealtime();
    }

    @Override // com.bytedance.sdk.openadsdk.core.ugen.Pm.mZx
    public void EYQ(int i, String str, String str2) {
        this.Td = i;
        this.Pm = str;
        this.Kbd = str2;
        this.mZx = SystemClock.elapsedRealtime();
        this.IPb.set(false);
    }

    @Override // com.bytedance.sdk.openadsdk.core.ugen.Pm.mZx
    public void EYQ(String str) {
        this.Kbd = str;
        this.mZx = SystemClock.elapsedRealtime();
        this.IPb.set(true);
    }

    public void EYQ(com.bytedance.sdk.openadsdk.core.model.UB ub, String str) {
        if (this.IPb.get()) {
            com.bytedance.sdk.openadsdk.mZx.Td.EYQ(ub, str, "success", this.mZx - this.EYQ, this.Kbd, "ad", 0, null);
        } else {
            com.bytedance.sdk.openadsdk.mZx.Td.EYQ(ub, str, t2.f.e, this.mZx - this.EYQ, this.Kbd, "ad", this.Td, this.Pm);
        }
    }
}
