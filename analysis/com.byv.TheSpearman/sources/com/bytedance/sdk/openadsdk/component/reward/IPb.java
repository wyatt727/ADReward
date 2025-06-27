package com.bytedance.sdk.openadsdk.component.reward;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import android.os.SystemClock;
import com.bytedance.sdk.component.utils.mZx;
import com.bytedance.sdk.openadsdk.IListenerManager;
import com.bytedance.sdk.openadsdk.activity.TTFullScreenExpressVideoActivity;
import com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity;
import com.bytedance.sdk.openadsdk.activity.TTInterstitialActivity;
import com.bytedance.sdk.openadsdk.activity.TTInterstitialExpressActivity;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdInteractionCallback;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdInteractionListener;
import com.bytedance.sdk.openadsdk.core.hu;
import com.bytedance.sdk.openadsdk.core.model.UB;
import com.bytedance.sdk.openadsdk.core.zF;
import com.bytedance.sdk.openadsdk.utils.hYh;
import com.bytedance.sdk.openadsdk.utils.tPj;
import com.bytedance.sdk.openadsdk.utils.xt;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;

/* compiled from: PAGInterstitialAdImpl.java */
/* loaded from: classes2.dex */
class IPb extends PAGInterstitialAd {
    private final Context EYQ;
    private boolean HX;
    private boolean QQ;
    private com.bytedance.sdk.openadsdk.apiImpl.mZx.mZx Td;
    private final com.bytedance.sdk.openadsdk.core.model.EYQ mZx;
    private final AtomicBoolean Kbd = new AtomicBoolean(false);
    private boolean IPb = false;
    private boolean Pm = false;
    private final String VwS = hYh.EYQ();

    IPb(Context context, com.bytedance.sdk.openadsdk.core.model.EYQ eyq) {
        this.EYQ = context;
        this.mZx = eyq;
    }

    public void EYQ(boolean z) {
        this.IPb = z;
    }

    public void EYQ() {
        if (this.Kbd.get()) {
            return;
        }
        this.Pm = true;
    }

    @Override // com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd
    public void setAdInteractionListener(PAGInterstitialAdInteractionListener pAGInterstitialAdInteractionListener) {
        this.Td = new com.bytedance.sdk.openadsdk.component.Td.EYQ(pAGInterstitialAdInteractionListener);
        EYQ(1);
    }

    @Override // com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd
    public void setAdInteractionCallback(PAGInterstitialAdInteractionCallback pAGInterstitialAdInteractionCallback) {
        this.Td = new com.bytedance.sdk.openadsdk.component.Td.EYQ(pAGInterstitialAdInteractionCallback);
        EYQ(1);
    }

    private static boolean EYQ(UB ub) {
        if (ub == null) {
            return false;
        }
        int iNWX = ub.nWX();
        return (ub.zF() != 2 || iNWX == 5 || iNWX == 6 || iNWX == 19 || iNWX == 12) ? false : true;
    }

    @Override // com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd
    public void show(Activity activity) throws JSONException {
        Intent intent;
        if (activity != null && activity.isFinishing()) {
            com.bytedance.sdk.component.utils.pi.EYQ("TTFullScreenVideoAdImpl", "showFullScreenVideoAd error1: activity is finishing");
            activity = null;
        }
        com.bytedance.sdk.openadsdk.core.model.EYQ eyq = this.mZx;
        if (eyq == null || !eyq.Pm()) {
            return;
        }
        boolean zIPb = this.mZx.IPb();
        final UB ubKbd = this.mZx.Kbd();
        if (!com.bykv.vk.openvk.component.video.EYQ.Td.EYQ.mZx()) {
            com.bytedance.sdk.openadsdk.mZx.Td.mZx(ubKbd, "fullscreen_interstitial_ad", "showFullScreenVideoAd error2: not main looper");
            com.bytedance.sdk.component.utils.pi.EYQ("TTFullScreenVideoAdImpl", "showFullScreenVideoAd error2: not main looper");
            throw new IllegalStateException("Cannot be called in a child thread —— TTFullScreenVideoAd.showFullScreenVideoAd");
        }
        if (this.Kbd.get()) {
            return;
        }
        this.Kbd.set(true);
        if (ubKbd == null || (ubKbd.mN() == null && ubKbd.Dal() == null)) {
            com.bytedance.sdk.openadsdk.mZx.Td.mZx(ubKbd, "fullscreen_interstitial_ad", "materialMeta error ");
            return;
        }
        Context contextEYQ = activity == null ? this.EYQ : activity;
        if (contextEYQ == null) {
            contextEYQ = hu.EYQ();
        }
        if (zIPb) {
            intent = new Intent(contextEYQ, (Class<?>) TTFullScreenExpressVideoActivity.class);
        } else if (EYQ(ubKbd)) {
            if (com.bytedance.sdk.openadsdk.component.reward.mZx.QQ.EYQ(ubKbd)) {
                intent = new Intent(contextEYQ, (Class<?>) TTInterstitialExpressActivity.class);
            } else {
                intent = new Intent(contextEYQ, (Class<?>) TTFullScreenExpressVideoActivity.class);
            }
        } else if (com.bytedance.sdk.openadsdk.component.reward.mZx.QQ.EYQ(ubKbd)) {
            intent = new Intent(contextEYQ, (Class<?>) TTInterstitialActivity.class);
        } else {
            intent = new Intent(contextEYQ, (Class<?>) TTFullScreenVideoActivity.class);
        }
        intent.putExtra("start_show_time", SystemClock.elapsedRealtime());
        com.bytedance.sdk.openadsdk.component.reward.EYQ.mZx.EYQ(intent, activity, this.Pm, this.mZx, this.VwS);
        intent.putExtra("is_verity_playable", this.IPb);
        if (!com.bytedance.sdk.openadsdk.multipro.mZx.Td()) {
            zF.EYQ().EYQ(this.Td);
            this.Td = null;
        }
        com.bytedance.sdk.component.utils.mZx.EYQ(contextEYQ, intent, new mZx.EYQ() { // from class: com.bytedance.sdk.openadsdk.component.reward.IPb.1
            @Override // com.bytedance.sdk.component.utils.mZx.EYQ
            public void EYQ() {
                if (IPb.this.IPb) {
                    try {
                        com.bytedance.sdk.openadsdk.tp.Td.EYQ().EYQ(ubKbd.mN().tsL());
                    } catch (Throwable unused) {
                    }
                }
            }

            @Override // com.bytedance.sdk.component.utils.mZx.EYQ
            public void EYQ(Throwable th) throws JSONException {
                com.bytedance.sdk.component.utils.pi.EYQ("TTFullScreenVideoAdImpl", "show full screen video error: ", th);
                if (IPb.this.IPb) {
                    try {
                        com.bytedance.sdk.openadsdk.tp.Td.EYQ().EYQ(ubKbd.mN().tsL(), -1, th != null ? th.getMessage() : "playable tool error open");
                    } catch (Throwable unused) {
                    }
                }
                com.bytedance.sdk.openadsdk.mZx.Td.mZx(ubKbd, "fullscreen_interstitial_ad", "activity start  fail ");
            }
        });
        if (zIPb) {
            return;
        }
        EYQ.EYQ(this.mZx.Kbd(), this.Pm);
    }

    @Override // com.bytedance.sdk.openadsdk.api.PangleAd
    public Map<String, Object> getMediaExtraInfo() {
        com.bytedance.sdk.openadsdk.core.model.EYQ eyq = this.mZx;
        if (eyq == null || eyq.Kbd() == null) {
            return null;
        }
        return this.mZx.Kbd().Hnh();
    }

    private void EYQ(final int i) {
        if (com.bytedance.sdk.openadsdk.multipro.mZx.Td()) {
            xt.Td(new com.bytedance.sdk.component.VwS.QQ("FullScreen_registerMultiProcessListener") { // from class: com.bytedance.sdk.openadsdk.component.reward.IPb.2
                @Override // java.lang.Runnable
                public void run() {
                    com.bytedance.sdk.openadsdk.multipro.aidl.EYQ EYQ = com.bytedance.sdk.openadsdk.multipro.aidl.EYQ.EYQ();
                    if (i != 1 || IPb.this.Td == null) {
                        return;
                    }
                    com.bytedance.sdk.openadsdk.multipro.aidl.mZx.Td td = new com.bytedance.sdk.openadsdk.multipro.aidl.mZx.Td(IPb.this.Td);
                    IListenerManager iListenerManagerAsInterface = com.bytedance.sdk.openadsdk.multipro.aidl.EYQ.Kbd.asInterface(EYQ.EYQ(1));
                    if (iListenerManagerAsInterface != null) {
                        try {
                            iListenerManagerAsInterface.registerFullVideoListener(IPb.this.VwS, td);
                        } catch (RemoteException e) {
                            com.bytedance.sdk.component.utils.pi.EYQ("TTFullScreenVideoAdImpl", e.getMessage());
                        }
                    }
                }
            }, 5);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGClientBidding
    public void win(Double d) {
        if (this.QQ) {
            return;
        }
        tPj.EYQ(this.mZx.Kbd(), d);
        this.QQ = true;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGClientBidding
    public void loss(Double d, String str, String str2) {
        if (this.HX) {
            return;
        }
        tPj.EYQ(this.mZx.Kbd(), d, str, str2);
        this.HX = true;
    }
}
