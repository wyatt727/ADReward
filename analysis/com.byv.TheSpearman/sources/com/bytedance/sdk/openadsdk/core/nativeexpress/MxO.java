package com.bytedance.sdk.openadsdk.core.nativeexpress;

import com.bytedance.sdk.openadsdk.utils.xt;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: ExpressRenderEventMonitor.java */
/* loaded from: classes2.dex */
public class MxO implements com.bytedance.adsdk.ugeno.core.hu, com.bytedance.sdk.component.adexpress.mZx.HX {
    private final com.bytedance.sdk.openadsdk.mZx.Td.Kbd EYQ;
    private long Kbd;
    private final String Pm;
    private final com.bytedance.sdk.openadsdk.core.model.UB Td;
    private final String mZx;

    public MxO(com.bytedance.sdk.openadsdk.mZx.Td.Kbd kbd, String str, com.bytedance.sdk.openadsdk.core.model.UB ub, String str2) {
        this.EYQ = kbd;
        this.mZx = str;
        this.Pm = str2;
        this.Td = ub;
    }

    @Override // com.bytedance.sdk.component.adexpress.mZx.HX
    public void Pm() {
        this.EYQ.EYQ();
    }

    @Override // com.bytedance.sdk.component.adexpress.mZx.HX
    public void EYQ(boolean z) {
        this.EYQ.EYQ(z ? 1 : 0);
    }

    @Override // com.bytedance.sdk.component.adexpress.mZx.HX
    public void Kbd() {
        this.EYQ.mZx();
    }

    @Override // com.bytedance.sdk.component.adexpress.mZx.HX
    public void EYQ(int i, String str) throws JSONException {
        this.EYQ.EYQ(i, null);
        HX.EYQ("Web", i, str, this.mZx, this.Pm, this.Td);
    }

    @Override // com.bytedance.sdk.component.adexpress.mZx.HX
    public void EYQ(int i) {
        this.Kbd = System.currentTimeMillis();
        if (i == 3) {
            this.EYQ.Td("dynamic_render2_start");
        } else {
            this.EYQ.Td("dynamic_render_start");
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.mZx.HX
    public void mZx(int i) {
        if (i == 3) {
            this.EYQ.Pm("dynamic_sub_analysis2_start");
        } else {
            this.EYQ.Pm("dynamic_sub_analysis_start");
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.mZx.HX
    public void Td(int i) {
        if (i == 3) {
            this.EYQ.Pm("dynamic_sub_analysis2_end");
        } else {
            this.EYQ.Pm("dynamic_sub_analysis_end");
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.mZx.HX
    public void Pm(int i) {
        if (i == 3) {
            this.EYQ.Pm("dynamic_sub_render2_start");
        } else {
            this.EYQ.Pm("dynamic_sub_render_start");
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.mZx.HX
    public void Kbd(int i) {
        if (i == 3) {
            this.EYQ.Pm("dynamic_sub_render2_end");
        } else {
            this.EYQ.Pm("dynamic_sub_render_end");
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.mZx.HX
    public void IPb(int i) {
        final String str;
        System.currentTimeMillis();
        if (i == 3) {
            this.EYQ.VwS("dynamic_render2_success");
            str = "dynamic2_render";
        } else {
            this.EYQ.VwS("dynamic_render_success");
            str = "dynamic_backup_native_render";
        }
        this.EYQ.EYQ(true);
        xt.mZx(new com.bytedance.sdk.component.VwS.QQ("dynamic_success") { // from class: com.bytedance.sdk.openadsdk.core.nativeexpress.MxO.1
            @Override // java.lang.Runnable
            public void run() {
                com.bytedance.sdk.openadsdk.mZx.Td.mZx(MxO.this.Td, MxO.this.mZx, str, (JSONObject) null);
            }
        }, 10);
    }

    @Override // com.bytedance.sdk.component.adexpress.mZx.HX
    public void EYQ(int i, int i2, String str, boolean z) throws JSONException {
        if (!z) {
            this.EYQ.EYQ(true);
        }
        if (i == 3) {
            this.EYQ.mZx(i2, "dynamic_render2_error");
        } else {
            this.EYQ.mZx(i2, "dynamic_render_error");
        }
        HX.EYQ("NDR", i2, str, this.mZx, this.Pm, this.Td);
    }

    @Override // com.bytedance.sdk.component.adexpress.mZx.HX
    public void IPb() {
        this.EYQ.Td();
    }

    @Override // com.bytedance.sdk.component.adexpress.mZx.HX
    public void VwS() {
        this.EYQ.EYQ(true);
        this.EYQ.pi();
        xt.mZx(new com.bytedance.sdk.component.VwS.QQ("native_success") { // from class: com.bytedance.sdk.openadsdk.core.nativeexpress.MxO.2
            @Override // java.lang.Runnable
            public void run() {
                com.bytedance.sdk.openadsdk.mZx.Td.mZx(MxO.this.Td, MxO.this.mZx, "dynamic_backup_render", (JSONObject) null);
            }
        }, 10);
    }

    @Override // com.bytedance.sdk.component.adexpress.mZx.HX
    public void QQ() {
        this.EYQ.nWX();
    }

    @Override // com.bytedance.sdk.component.adexpress.mZx.HX
    public void HX() {
        this.EYQ.KO();
    }

    @Override // com.bytedance.sdk.component.adexpress.mZx.HX
    public void tp() {
        this.EYQ.mZx();
    }

    public void MxO() {
        this.EYQ.MxO();
        this.EYQ.tsL();
    }

    @Override // com.bytedance.adsdk.ugeno.core.hu
    public void EYQ() {
        this.EYQ.Kbd("ugen_render_start");
        this.EYQ.Kbd("ugen_sub_analysis_start");
    }

    @Override // com.bytedance.adsdk.ugeno.core.hu
    public void mZx() {
        this.EYQ.Kbd("ugen_sub_analysis_end");
    }

    @Override // com.bytedance.adsdk.ugeno.core.hu
    public void Td() {
        this.EYQ.Kbd("ugen_sub_render_start");
    }

    @Override // com.bytedance.adsdk.ugeno.core.hu
    public void EYQ(com.bytedance.adsdk.ugeno.core.KO ko) throws JSONException {
        if (ko.EYQ() == 0) {
            this.EYQ.Kbd("ugen_sub_render_end");
            this.EYQ.IPb("ugen_render_success");
        } else {
            this.EYQ.Td(ko.EYQ(), "ugen_render_error");
            HX.EYQ("UGen", ko.EYQ(), ko.mZx(), this.mZx, this.Pm, this.Td);
        }
        this.EYQ.EYQ(true);
    }
}
