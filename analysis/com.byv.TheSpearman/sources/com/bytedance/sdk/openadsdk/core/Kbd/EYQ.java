package com.bytedance.sdk.openadsdk.core.Kbd;

import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import android.view.MotionEvent;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.MxO;
import com.bytedance.sdk.openadsdk.core.QQ;
import com.bytedance.sdk.openadsdk.core.hu;
import com.bytedance.sdk.openadsdk.utils.UB;
import com.bytedance.sdk.openadsdk.utils.xt;
import com.pgl.ssdk.ces.out.PglSSConfig;
import com.pgl.ssdk.ces.out.PglSSManager;
import java.util.HashMap;
import java.util.Map;

/* compiled from: MSSdkImpl.java */
/* loaded from: classes2.dex */
class EYQ {
    private PglSSManager EYQ;
    private volatile boolean mZx;
    private volatile boolean Td = true;
    private volatile boolean Pm = false;

    public EYQ() {
        EYQ();
    }

    public synchronized void EYQ() {
        Context contextEYQ;
        String strPm;
        if (!this.mZx) {
            try {
                contextEYQ = hu.EYQ();
                strPm = QQ.mZx().Pm();
                if (TextUtils.isEmpty(strPm)) {
                    strPm = QQ.EYQ("app_id", Long.MAX_VALUE);
                }
            } catch (Throwable unused) {
                QQ();
                this.mZx = false;
            }
            if (TextUtils.isEmpty(strPm)) {
                return;
            }
            PglSSManager.init(contextEYQ, PglSSConfig.builder().setAppId(strPm).setOVRegionType(0).setAdsdkVersionCode(BuildConfig.VERSION_CODE).build(), null, null, MxO.EYQ(contextEYQ), com.com.bytedance.overseas.sdk.mZx.EYQ.EYQ().mZx());
            VwS();
            this.mZx = true;
            try {
                if (this.Td) {
                    Pm(PglSSManager.getLoadError());
                }
            } catch (Throwable th) {
                UB.mZx("mssdk", "reportLoadError", th.getMessage());
            }
        }
    }

    public boolean mZx() {
        return this.mZx;
    }

    private boolean IPb() {
        if (!this.mZx && this.Td) {
            EYQ();
        }
        return this.mZx;
    }

    private void VwS() {
        if (this.EYQ == null) {
            this.EYQ = PglSSManager.getInstance();
        }
    }

    public void EYQ(String str) {
        if (IPb()) {
            VwS();
            PglSSManager pglSSManager = this.EYQ;
            if (pglSSManager != null) {
                pglSSManager.setGaid(str);
            }
        }
    }

    public void mZx(final String str) {
        if (IPb()) {
            VwS();
            if (this.EYQ != null) {
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    xt.mZx(new com.bytedance.sdk.component.VwS.QQ("updateDid") { // from class: com.bytedance.sdk.openadsdk.core.Kbd.EYQ.1
                        @Override // java.lang.Runnable
                        public void run() {
                            if (EYQ.this.EYQ != null) {
                                EYQ.this.EYQ.setDeviceId(str);
                            }
                        }
                    });
                } else {
                    this.EYQ.setDeviceId(str);
                }
            }
        }
    }

    public void Td(String str) {
        if (IPb()) {
            VwS();
            PglSSManager pglSSManager = this.EYQ;
            if (pglSSManager != null) {
                pglSSManager.reportNow(str);
            }
        }
    }

    public String Td() {
        if (!IPb()) {
            return "";
        }
        VwS();
        PglSSManager pglSSManager = this.EYQ;
        return pglSSManager != null ? pglSSManager.getToken() : "";
    }

    public String Pm() {
        if (!IPb()) {
            return "";
        }
        VwS();
        PglSSManager pglSSManager = this.EYQ;
        return pglSSManager != null ? pglSSManager.getSofChara() : "";
    }

    public void EYQ(MotionEvent motionEvent) {
        if (mZx()) {
            VwS();
            PglSSManager pglSSManager = this.EYQ;
            if (pglSSManager != null) {
                pglSSManager.checkEventVirtual(motionEvent);
            }
        }
    }

    public int Kbd() {
        if (this.Td) {
            return PglSSManager.getInitStatus();
        }
        return 5;
    }

    public Map<String, String> EYQ(String str, byte[] bArr) {
        Map<String, String> featureHash;
        return (!IPb() || (featureHash = this.EYQ.getFeatureHash(str, bArr)) == null) ? new HashMap() : featureHash;
    }

    private Class QQ() {
        Class<?> cls;
        try {
            cls = Class.forName("com.pgl.ssdk.ces.out.PglSSManager");
        } catch (Throwable unused) {
            cls = null;
        }
        try {
            this.Td = true;
        } catch (Throwable unused2) {
            this.Td = false;
            return cls;
        }
        return cls;
    }

    private void Pm(final String str) {
        if (this.Pm || TextUtils.isEmpty(str)) {
            return;
        }
        hu.Kbd().EYQ(new com.bytedance.sdk.openadsdk.tp.mZx() { // from class: com.bytedance.sdk.openadsdk.core.Kbd.EYQ.2
            @Override // com.bytedance.sdk.openadsdk.tp.mZx
            public com.bytedance.sdk.openadsdk.tp.EYQ.mZx getLogStats() throws Exception {
                return com.bytedance.sdk.openadsdk.tp.EYQ.Td.mZx().EYQ("secsdk_init_error").mZx(str);
            }
        }, false);
        this.Pm = true;
    }
}
