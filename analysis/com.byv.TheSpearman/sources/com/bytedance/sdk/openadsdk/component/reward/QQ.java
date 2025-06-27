package com.bytedance.sdk.openadsdk.component.reward;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import android.os.SystemClock;
import com.bytedance.sdk.component.utils.mZx;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.IListenerManager;
import com.bytedance.sdk.openadsdk.activity.TTRewardExpressVideoActivity;
import com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdInteractionCallback;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdInteractionListener;
import com.bytedance.sdk.openadsdk.core.hu;
import com.bytedance.sdk.openadsdk.core.model.UB;
import com.bytedance.sdk.openadsdk.core.zF;
import com.bytedance.sdk.openadsdk.utils.hYh;
import com.bytedance.sdk.openadsdk.utils.tPj;
import com.bytedance.sdk.openadsdk.utils.xt;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;

/* compiled from: PAGRewardVideoAdImpl.java */
/* loaded from: classes2.dex */
class QQ extends PAGRewardedAd {
    private final Context EYQ;
    private boolean HX;
    private boolean Kbd;
    private com.bytedance.sdk.openadsdk.apiImpl.Pm.EYQ Pm;
    private boolean QQ;
    private final AdSlot Td;
    private final com.bytedance.sdk.openadsdk.core.model.EYQ mZx;
    private final AtomicBoolean IPb = new AtomicBoolean(false);
    private final String VwS = hYh.EYQ();

    QQ(Context context, com.bytedance.sdk.openadsdk.core.model.EYQ eyq, AdSlot adSlot) {
        this.EYQ = context;
        this.mZx = eyq;
        this.Td = adSlot;
    }

    public void EYQ() {
        if (this.IPb.get()) {
            return;
        }
        this.Kbd = true;
    }

    @Override // com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd
    public void setAdInteractionListener(PAGRewardedAdInteractionListener pAGRewardedAdInteractionListener) {
        this.Pm = new HX(pAGRewardedAdInteractionListener);
        EYQ(0);
    }

    @Override // com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd
    public void setAdInteractionCallback(PAGRewardedAdInteractionCallback pAGRewardedAdInteractionCallback) {
        this.Pm = new HX(pAGRewardedAdInteractionCallback);
        EYQ(0);
    }

    @Override // com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd
    public void show(Activity activity) throws JSONException {
        Intent intent;
        if (activity != null && activity.isFinishing()) {
            com.bytedance.sdk.component.utils.pi.EYQ("TTRewardVideoAdImpl", "showRewardVideoAd error1: activity is finishing");
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
            com.bytedance.sdk.component.utils.pi.EYQ("TTRewardVideoAdImpl", "showRewardVideoAd error2: not main looper");
            throw new IllegalStateException("Cannot be called in a child thread —— TTRewardVideoAd.showRewardVideoAd");
        }
        if (this.IPb.compareAndSet(false, true)) {
            if (ubKbd == null || ubKbd.mN() == null) {
                com.bytedance.sdk.openadsdk.mZx.Td.mZx(ubKbd, "fullscreen_interstitial_ad", "materialMeta error ");
                return;
            }
            Context contextEYQ = activity == null ? this.EYQ : activity;
            if (contextEYQ == null) {
                contextEYQ = hu.EYQ();
            }
            if (zIPb || EYQ(ubKbd)) {
                intent = new Intent(contextEYQ, (Class<?>) TTRewardExpressVideoActivity.class);
            } else {
                intent = new Intent(contextEYQ, (Class<?>) TTRewardVideoActivity.class);
            }
            com.bytedance.sdk.openadsdk.component.reward.EYQ.mZx.EYQ(intent, activity, this.Kbd, this.mZx, this.VwS);
            intent.putExtra("media_extra", this.Td.getMediaExtra());
            intent.putExtra("user_id", this.Td.getUserID());
            intent.putExtra("start_show_time", SystemClock.elapsedRealtime());
            if (!com.bytedance.sdk.openadsdk.multipro.mZx.Td()) {
                zF.EYQ().EYQ(this.Pm);
                this.Pm = null;
            }
            com.bytedance.sdk.component.utils.mZx.EYQ(contextEYQ, intent, new mZx.EYQ() { // from class: com.bytedance.sdk.openadsdk.component.reward.QQ.1
                @Override // com.bytedance.sdk.component.utils.mZx.EYQ
                public void EYQ() {
                }

                @Override // com.bytedance.sdk.component.utils.mZx.EYQ
                public void EYQ(Throwable th) throws JSONException {
                    com.bytedance.sdk.component.utils.pi.EYQ("TTRewardVideoAdImpl", "show reward video error: ", th);
                    com.bytedance.sdk.openadsdk.mZx.Td.mZx(ubKbd, "fullscreen_interstitial_ad", "activity start  fail ");
                }
            });
            com.bytedance.sdk.openadsdk.core.pi.mZx().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.QQ.2
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        AdSlot adSlotNvm = ubKbd.Nvm();
                        if (adSlotNvm != null) {
                            tsL.EYQ(QQ.this.EYQ).EYQ(adSlotNvm.getCodeId());
                            if (QQ.this.Kbd) {
                                tsL.EYQ(QQ.this.EYQ).mZx(adSlotNvm);
                            }
                        }
                    } catch (Throwable unused) {
                    }
                }
            });
        }
    }

    private static boolean EYQ(UB ub) {
        if (ub == null) {
            return false;
        }
        int iNWX = ub.nWX();
        return (ub.zF() != 2 || iNWX == 5 || iNWX == 6 || iNWX == 19 || iNWX == 12) ? false : true;
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
            xt.Td(new com.bytedance.sdk.component.VwS.QQ("Reward_registerMultiProcessListener") { // from class: com.bytedance.sdk.openadsdk.component.reward.QQ.3
                @Override // java.lang.Runnable
                public void run() {
                    com.bytedance.sdk.openadsdk.multipro.aidl.EYQ EYQ = com.bytedance.sdk.openadsdk.multipro.aidl.EYQ.EYQ();
                    if (i != 0 || QQ.this.Pm == null) {
                        return;
                    }
                    com.bytedance.sdk.openadsdk.multipro.aidl.mZx.Pm pm = new com.bytedance.sdk.openadsdk.multipro.aidl.mZx.Pm(QQ.this.Pm);
                    IListenerManager iListenerManagerAsInterface = com.bytedance.sdk.openadsdk.multipro.aidl.EYQ.VwS.asInterface(EYQ.EYQ(0));
                    if (iListenerManagerAsInterface != null) {
                        try {
                            iListenerManagerAsInterface.registerRewardVideoListener(QQ.this.VwS, pm);
                        } catch (RemoteException e) {
                            com.bytedance.sdk.component.utils.pi.EYQ("TTRewardVideoAdImpl", e.getMessage());
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
