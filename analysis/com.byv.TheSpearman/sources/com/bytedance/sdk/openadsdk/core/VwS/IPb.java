package com.bytedance.sdk.openadsdk.core.VwS;

import android.os.Handler;
import android.util.Pair;
import android.view.View;
import android.webkit.WebView;
import com.bytedance.sdk.component.utils.pi;
import com.bytedance.sdk.openadsdk.core.hu;
import com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* compiled from: ViewabilitySessionManager.java */
/* loaded from: classes2.dex */
public class IPb {
    final Set<Pair<View, FriendlyObstructionPurpose>> EYQ = new HashSet();
    private VwS mZx;

    private IPb() {
        Kbd.EYQ(hu.EYQ());
    }

    private Handler Kbd() {
        return com.bytedance.sdk.component.utils.QQ.mZx();
    }

    public static IPb EYQ() {
        return new IPb();
    }

    public void EYQ(final WebView webView) {
        if (webView == null || this.mZx != null) {
            return;
        }
        if (com.bykv.vk.openvk.component.video.EYQ.Td.EYQ.mZx()) {
            mZx(webView);
        } else {
            Kbd().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.VwS.IPb.1
                @Override // java.lang.Runnable
                public void run() {
                    IPb.this.mZx(webView);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mZx(WebView webView) {
        try {
            if (this.mZx == null) {
                this.mZx = QQ.EYQ(webView);
            }
        } catch (Throwable th) {
            pi.mZx("createWebViewSession failed : ".concat(String.valueOf(th)));
            HashMap map = new HashMap();
            map.put("scene", "createWebViewSession");
            map.put("message", th.getMessage());
            Kbd.EYQ(map);
        }
    }

    public void EYQ(final View view, final Set<tp> set) {
        if (this.mZx != null || view == null || set == null) {
            return;
        }
        if (com.bykv.vk.openvk.component.video.EYQ.Td.EYQ.mZx()) {
            mZx(view, set);
        } else {
            Kbd().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.VwS.IPb.4
                @Override // java.lang.Runnable
                public void run() {
                    IPb.this.mZx(view, (Set<tp>) set);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mZx(View view, Set<tp> set) {
        try {
            if (this.mZx == null) {
                this.mZx = QQ.EYQ(view, set);
            }
        } catch (Throwable th) {
            pi.mZx("createVideoSession failed : ".concat(String.valueOf(th)));
            HashMap map = new HashMap();
            map.put("scene", "createVideoSession");
            map.put("message", th.getMessage());
            Kbd.EYQ(map);
        }
    }

    public void mZx() {
        if (com.bykv.vk.openvk.component.video.EYQ.Td.EYQ.mZx()) {
            IPb();
        } else {
            Kbd().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.VwS.IPb.5
                @Override // java.lang.Runnable
                public void run() {
                    IPb.this.IPb();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void IPb() {
        if (this.mZx != null) {
            try {
                EYQ((View) null, (FriendlyObstructionPurpose) null);
                this.mZx.mZx();
            } catch (Throwable unused) {
            }
        }
    }

    public void EYQ(final boolean z, final float f) {
        if (com.bykv.vk.openvk.component.video.EYQ.Td.EYQ.mZx()) {
            mZx(z, f);
        } else {
            Kbd().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.VwS.IPb.6
                @Override // java.lang.Runnable
                public void run() {
                    IPb.this.mZx(z, f);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mZx(boolean z, float f) {
        if (this.mZx != null) {
            try {
                EYQ((View) null, (FriendlyObstructionPurpose) null);
                this.mZx.EYQ(z, f);
            } catch (Throwable unused) {
            }
        }
    }

    public void Td() {
        if (com.bykv.vk.openvk.component.video.EYQ.Td.EYQ.mZx()) {
            VwS();
        } else {
            Kbd().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.VwS.IPb.7
                @Override // java.lang.Runnable
                public void run() {
                    IPb.this.VwS();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void VwS() {
        VwS vwS = this.mZx;
        if (vwS != null) {
            try {
                vwS.Pm();
            } catch (Throwable unused) {
            }
        }
    }

    public void Pm() {
        if (com.bykv.vk.openvk.component.video.EYQ.Td.EYQ.mZx()) {
            QQ();
        } else {
            Kbd().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.VwS.IPb.8
                @Override // java.lang.Runnable
                public void run() {
                    IPb.this.QQ();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void QQ() {
        VwS vwS = this.mZx;
        if (vwS != null) {
            try {
                vwS.Td();
            } catch (Throwable unused) {
            }
        }
    }

    public void EYQ(final View view, final FriendlyObstructionPurpose friendlyObstructionPurpose) {
        if (com.bykv.vk.openvk.component.video.EYQ.Td.EYQ.mZx()) {
            mZx(view, friendlyObstructionPurpose);
        } else {
            Kbd().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.VwS.IPb.9
                @Override // java.lang.Runnable
                public void run() {
                    IPb.this.mZx(view, friendlyObstructionPurpose);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mZx(View view, FriendlyObstructionPurpose friendlyObstructionPurpose) {
        VwS vwS = this.mZx;
        try {
            if (vwS == null) {
                if (view == null || friendlyObstructionPurpose == null) {
                    return;
                }
                this.EYQ.add(new Pair<>(view, friendlyObstructionPurpose));
                return;
            }
            if (view != null && friendlyObstructionPurpose != null) {
                vwS.EYQ(view, friendlyObstructionPurpose);
            }
            if (this.EYQ.size() > 0) {
                vwS.EYQ(this.EYQ);
                this.EYQ.clear();
            }
        } catch (Throwable unused) {
        }
    }

    public void EYQ(final long j, final boolean z) {
        if (com.bykv.vk.openvk.component.video.EYQ.Td.EYQ.mZx()) {
            mZx(j, z);
        } else {
            Kbd().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.VwS.IPb.10
                @Override // java.lang.Runnable
                public void run() {
                    IPb.this.mZx(j, z);
                }
            });
        }
    }

    public void mZx(long j, boolean z) {
        VwS vwS = this.mZx;
        if (vwS != null) {
            try {
                vwS.EYQ(j / 1000.0f, z);
            } catch (Throwable unused) {
            }
        }
    }

    public void EYQ(final boolean z) {
        if (com.bykv.vk.openvk.component.video.EYQ.Td.EYQ.mZx()) {
            mZx(z);
        } else {
            Kbd().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.VwS.IPb.2
                @Override // java.lang.Runnable
                public void run() {
                    IPb.this.mZx(z);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mZx(boolean z) {
        VwS vwS = this.mZx;
        if (vwS != null) {
            try {
                vwS.EYQ(z);
            } catch (Throwable unused) {
            }
        }
    }

    public void EYQ(final int i) {
        if (com.bykv.vk.openvk.component.video.EYQ.Td.EYQ.mZx()) {
            mZx(i);
        } else {
            Kbd().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.VwS.IPb.3
                @Override // java.lang.Runnable
                public void run() {
                    IPb.this.mZx(i);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mZx(int i) {
        VwS vwS = this.mZx;
        if (vwS != null) {
            try {
                vwS.mZx(i);
            } catch (Throwable unused) {
            }
        }
    }
}
