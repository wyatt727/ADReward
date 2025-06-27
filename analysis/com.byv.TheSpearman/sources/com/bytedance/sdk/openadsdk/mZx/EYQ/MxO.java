package com.bytedance.sdk.openadsdk.mZx.EYQ;

import android.content.Context;
import com.bytedance.sdk.component.utils.hu;
import com.bytedance.sdk.openadsdk.core.settings.KO;
import com.bytedance.sdk.openadsdk.multipro.aidl.BinderPoolService;
import com.bytedance.sdk.openadsdk.utils.FH;
import com.bytedance.sdk.openadsdk.utils.xt;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* compiled from: OverSeaLogDepend.java */
/* loaded from: classes2.dex */
public class MxO implements com.bytedance.sdk.component.Kbd.EYQ.Kbd {
    private final String EYQ = "[5906]";

    @Override // com.bytedance.sdk.component.Kbd.EYQ.Kbd
    public com.bytedance.sdk.component.Kbd.EYQ.Pm.EYQ EYQ(JSONObject jSONObject) {
        return null;
    }

    @Override // com.bytedance.sdk.component.Kbd.EYQ.Kbd
    public boolean EYQ() {
        return false;
    }

    @Override // com.bytedance.sdk.component.Kbd.EYQ.Kbd
    public int IPb() {
        return 1;
    }

    @Override // com.bytedance.sdk.component.Kbd.EYQ.Kbd
    public boolean QQ() {
        return true;
    }

    @Override // com.bytedance.sdk.component.Kbd.EYQ.Kbd
    public boolean Td() {
        return true;
    }

    @Override // com.bytedance.sdk.component.Kbd.EYQ.Kbd
    public boolean VwS() {
        return false;
    }

    @Override // com.bytedance.sdk.component.Kbd.EYQ.Kbd
    public boolean mZx() {
        return false;
    }

    @Override // com.bytedance.sdk.component.Kbd.EYQ.Kbd
    public com.bytedance.sdk.component.Kbd.EYQ.VwS tsL() {
        return null;
    }

    @Override // com.bytedance.sdk.component.Kbd.EYQ.Kbd
    public boolean EYQ(Context context) {
        return hu.EYQ(context);
    }

    @Override // com.bytedance.sdk.component.Kbd.EYQ.Kbd
    public String EYQ(String str) {
        return com.bytedance.sdk.component.Td.EYQ.mZx(str, com.bytedance.sdk.openadsdk.core.EYQ.EYQ());
    }

    @Override // com.bytedance.sdk.component.Kbd.EYQ.Kbd
    public String mZx(String str) {
        return com.bytedance.sdk.component.Td.EYQ.EYQ(str, com.bytedance.sdk.openadsdk.core.EYQ.EYQ());
    }

    @Override // com.bytedance.sdk.component.Kbd.EYQ.Kbd
    public String HX() {
        return FH.Td();
    }

    @Override // com.bytedance.sdk.component.Kbd.EYQ.Kbd
    public com.bytedance.sdk.component.Kbd.EYQ.Kbd.Td tp() {
        return new VwS();
    }

    @Override // com.bytedance.sdk.component.Kbd.EYQ.Kbd
    public Executor Pm() {
        return xt.Td();
    }

    @Override // com.bytedance.sdk.component.Kbd.EYQ.Kbd
    public Executor Kbd() {
        return xt.VwS();
    }

    @Override // com.bytedance.sdk.component.Kbd.EYQ.Kbd
    public com.bytedance.sdk.component.Kbd.EYQ.IPb MxO() {
        com.bytedance.sdk.component.Kbd.EYQ.IPb iPbEYQ;
        synchronized (this) {
            iPbEYQ = com.bytedance.sdk.openadsdk.multipro.EYQ.EYQ.EYQ(com.bytedance.sdk.openadsdk.core.hu.EYQ());
        }
        return iPbEYQ;
    }

    @Override // com.bytedance.sdk.component.Kbd.EYQ.Kbd
    public void EYQ(boolean z, int i, long j, com.bytedance.sdk.component.Kbd.EYQ.IPb.Pm pm) {
        Runnable runnableEYQ;
        if (pm == null) {
            return;
        }
        EYQ.EYQ(EYQ.Td, z, i, j);
        if (z) {
            com.bytedance.sdk.openadsdk.tp.Td.EYQ("track_link_result", false, (com.bytedance.sdk.openadsdk.tp.mZx) new pi(true, pm));
            return;
        }
        nWX nwxZzY = KO.Jpu().zzY();
        if (nwxZzY != null && pm.Pm() < nwxZzY.EYQ(pm.IPb())) {
            if (!nwxZzY.EYQ() || (runnableEYQ = pm.EYQ(com.bytedance.sdk.openadsdk.core.MxO.EYQ(com.bytedance.sdk.openadsdk.core.hu.EYQ()), null)) == null) {
                return;
            }
            xt.EYQ().schedule(runnableEYQ, nwxZzY.mZx(pm.IPb()), TimeUnit.SECONDS);
            return;
        }
        com.bytedance.sdk.openadsdk.tp.Td.EYQ("track_link_result", false, (com.bytedance.sdk.openadsdk.tp.mZx) new pi(false, pm));
    }

    @Override // com.bytedance.sdk.component.Kbd.EYQ.Kbd
    public void EYQ(boolean z) {
        EYQ.EYQ(EYQ.IPb, z);
    }

    @Override // com.bytedance.sdk.component.Kbd.EYQ.Kbd
    public boolean nWX() {
        return BinderPoolService.EYQ;
    }

    @Override // com.bytedance.sdk.component.Kbd.EYQ.Kbd
    public int Td(String str) {
        return KO.Jpu().zzY().EYQ(str);
    }

    @Override // com.bytedance.sdk.component.Kbd.EYQ.Kbd
    public void pi() {
        EYQ.EYQ(EYQ.IPb);
    }
}
