package com.bytedance.sdk.openadsdk.component;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.RemoteException;
import android.os.SystemClock;
import com.bytedance.sdk.component.VwS.QQ;
import com.bytedance.sdk.component.utils.mZx;
import com.bytedance.sdk.component.utils.pi;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.IListenerManager;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAd;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAdInteractionCallback;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAdInteractionListener;
import com.bytedance.sdk.openadsdk.core.hu;
import com.bytedance.sdk.openadsdk.core.model.UB;
import com.bytedance.sdk.openadsdk.core.settings.KO;
import com.bytedance.sdk.openadsdk.core.zF;
import com.bytedance.sdk.openadsdk.utils.hYh;
import com.bytedance.sdk.openadsdk.utils.tPj;
import com.bytedance.sdk.openadsdk.utils.xt;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PAGAppOpenAdImpl.java */
/* loaded from: classes2.dex */
public class Pm extends PAGAppOpenAd {
    private final Context EYQ;
    private boolean HX;
    private com.bytedance.sdk.openadsdk.apiImpl.Td.mZx Pm;
    private boolean QQ;
    private final AdSlot Td;
    private final boolean VwS;
    private final UB mZx;
    private final AtomicBoolean Kbd = new AtomicBoolean(false);
    private final String IPb = hYh.EYQ();

    public Pm(Context context, UB ub, boolean z, AdSlot adSlot) {
        this.EYQ = context;
        this.mZx = ub;
        this.VwS = z;
        this.Td = adSlot;
    }

    @Override // com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAd
    public void setAdInteractionListener(PAGAppOpenAdInteractionListener pAGAppOpenAdInteractionListener) {
        this.Pm = new Kbd(pAGAppOpenAdInteractionListener);
        EYQ();
    }

    @Override // com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAd
    public void setAdInteractionCallback(PAGAppOpenAdInteractionCallback pAGAppOpenAdInteractionCallback) {
        this.Pm = new Kbd(pAGAppOpenAdInteractionCallback);
        EYQ();
    }

    private void EYQ() {
        if (com.bytedance.sdk.openadsdk.multipro.mZx.Td()) {
            xt.Td(new QQ("AppOpenAd_registerMultiProcessListener") { // from class: com.bytedance.sdk.openadsdk.component.Pm.1
                @Override // java.lang.Runnable
                public void run() {
                    IListenerManager iListenerManagerAsInterface;
                    com.bytedance.sdk.openadsdk.multipro.aidl.EYQ EYQ = com.bytedance.sdk.openadsdk.multipro.aidl.EYQ.EYQ();
                    if (Pm.this.Pm == null || (iListenerManagerAsInterface = com.bytedance.sdk.openadsdk.multipro.aidl.EYQ.mZx.asInterface(EYQ.EYQ(7))) == null) {
                        return;
                    }
                    try {
                        iListenerManagerAsInterface.registerAppOpenAdListener(Pm.this.IPb, new com.bytedance.sdk.openadsdk.multipro.aidl.mZx.EYQ(Pm.this.Pm));
                        Pm.this.Pm = null;
                    } catch (RemoteException e) {
                        pi.EYQ("TTAppOpenAdImpl", e.getMessage());
                    }
                }
            }, 5);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAd
    public void show(Activity activity) {
        if (activity != null && activity.isFinishing()) {
            activity = null;
        }
        if (this.Kbd.getAndSet(true)) {
            return;
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            pi.EYQ("TTAppOpenAdImpl", "showTTAppOpenAd error: not main looper");
            throw new IllegalStateException("Cannot be called in a child thread ---- TTAppOpenAdImpl.showAppOpenAd");
        }
        Context contextEYQ = activity != null ? activity : this.EYQ;
        if (contextEYQ == null) {
            contextEYQ = hu.EYQ();
        }
        int rotation = 0;
        try {
            rotation = activity.getWindowManager().getDefaultDisplay().getRotation();
        } catch (Exception unused) {
        }
        Intent intent = new Intent(contextEYQ, (Class<?>) TTAppOpenAdActivity.class);
        intent.putExtra("orientation_angle", rotation);
        intent.putExtra(FirebaseAnalytics.Param.AD_SOURCE, this.VwS ? 1 : 2);
        if (com.bytedance.sdk.openadsdk.multipro.mZx.Td()) {
            intent.putExtra(TTAdConstant.MULTI_PROCESS_MATERIALMETA, this.mZx.aEX().toString());
            intent.putExtra(TTAdConstant.MULTI_PROCESS_META_MD5, this.IPb);
        } else {
            zF.EYQ().IPb();
            zF.EYQ().EYQ(this.mZx);
            zF.EYQ().EYQ(this.Pm);
            this.Pm = null;
        }
        intent.putExtra("start_show_time", SystemClock.elapsedRealtime());
        com.bytedance.sdk.component.utils.mZx.EYQ(contextEYQ, intent, new mZx.EYQ() { // from class: com.bytedance.sdk.openadsdk.component.Pm.2
            @Override // com.bytedance.sdk.component.utils.mZx.EYQ
            public void EYQ() {
            }

            @Override // com.bytedance.sdk.component.utils.mZx.EYQ
            public void EYQ(Throwable th) {
            }
        });
        if (this.Td != null) {
            try {
                if (KO.Jpu().tPj(this.Td.getCodeId()) == 1) {
                    IPb iPbEYQ = IPb.EYQ(this.EYQ);
                    iPbEYQ.VwS(Integer.parseInt(this.Td.getCodeId()));
                    iPbEYQ.EYQ(this.Td);
                }
            } catch (Throwable unused2) {
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGClientBidding
    public void win(Double d) {
        if (this.QQ) {
            return;
        }
        tPj.EYQ(this.mZx, d);
        this.QQ = true;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGClientBidding
    public void loss(Double d, String str, String str2) {
        if (this.HX) {
            return;
        }
        tPj.EYQ(this.mZx, d, str, str2);
        this.HX = true;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PangleAd
    public Map<String, Object> getMediaExtraInfo() {
        UB ub = this.mZx;
        if (ub != null) {
            return ub.Hnh();
        }
        return null;
    }
}
