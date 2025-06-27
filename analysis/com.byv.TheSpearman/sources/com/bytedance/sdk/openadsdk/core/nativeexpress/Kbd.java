package com.bytedance.sdk.openadsdk.core.nativeexpress;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAd;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdLoadListener;
import com.bytedance.sdk.openadsdk.core.UB;
import com.bytedance.sdk.openadsdk.core.model.hYh;
import com.bytedance.sdk.openadsdk.utils.Nvm;
import com.bytedance.sdk.openadsdk.utils.xt;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: ExpressAdLoadManager.java */
/* loaded from: classes2.dex */
public class Kbd {
    private static final Set<Kbd> tp = Collections.synchronizedSet(new HashSet());
    private AdSlot EYQ;
    private List<com.bytedance.sdk.openadsdk.core.model.UB> IPb;
    private PAGBannerAdLoadListener Pm;
    private EYQ QQ;
    private final Context Td;
    private List<com.bytedance.sdk.openadsdk.core.model.UB> VwS;
    private final AtomicBoolean Kbd = new AtomicBoolean(false);
    private int HX = 5;
    private final ScheduledFuture<?> MxO = null;
    private ScheduledFuture<?> tsL = null;
    private ScheduledFuture<?> pi = null;
    private final Nvm nWX = Nvm.mZx();
    private final com.bytedance.sdk.openadsdk.core.UB mZx = com.bytedance.sdk.openadsdk.core.hu.Td();

    /* compiled from: ExpressAdLoadManager.java */
    public interface EYQ {
        void EYQ();

        void EYQ(List<com.bytedance.sdk.openadsdk.core.model.UB> list);
    }

    private Kbd(Context context) {
        if (context != null) {
            this.Td = context.getApplicationContext();
        } else {
            this.Td = com.bytedance.sdk.openadsdk.core.hu.EYQ();
        }
        tp.add(this);
    }

    public static Kbd EYQ(Context context) {
        return new Kbd(context);
    }

    public void EYQ(AdSlot adSlot, int i, com.bytedance.sdk.openadsdk.common.Td td, int i2) {
        EYQ(adSlot, i, td, null, i2);
    }

    public void EYQ(AdSlot adSlot, int i, com.bytedance.sdk.openadsdk.common.Td td, EYQ eyq, int i2) {
        this.nWX.Pm();
        if (this.Kbd.get()) {
            com.bytedance.sdk.component.utils.pi.EYQ("ExpressAdLoadManager", "express ad is loading...");
            return;
        }
        this.HX = i;
        this.Kbd.set(true);
        this.EYQ = adSlot;
        if (td instanceof PAGBannerAdLoadListener) {
            this.Pm = (PAGBannerAdLoadListener) td;
        }
        this.QQ = eyq;
        EYQ(adSlot, td);
    }

    private void EYQ(final AdSlot adSlot, com.bytedance.sdk.openadsdk.common.Td td) {
        if (adSlot == null) {
            return;
        }
        hYh hyh = new hYh();
        hyh.IPb = 2;
        this.mZx.EYQ(adSlot, hyh, this.HX, new UB.EYQ() { // from class: com.bytedance.sdk.openadsdk.core.nativeexpress.Kbd.1
            @Override // com.bytedance.sdk.openadsdk.core.UB.EYQ
            public void EYQ(int i, String str) {
                Kbd.this.EYQ(i, str);
            }

            @Override // com.bytedance.sdk.openadsdk.core.UB.EYQ
            public void EYQ(com.bytedance.sdk.openadsdk.core.model.EYQ eyq, com.bytedance.sdk.openadsdk.core.model.mZx mzx) {
                if (eyq.Td() == null || eyq.Td().isEmpty()) {
                    Kbd.this.EYQ(-3, com.bytedance.sdk.openadsdk.core.VwS.EYQ(-3));
                    mzx.EYQ(-3);
                    com.bytedance.sdk.openadsdk.core.model.mZx.EYQ(mzx);
                    return;
                }
                Kbd.this.IPb = eyq.Td();
                Kbd.this.VwS = eyq.Td();
                Kbd.this.EYQ(adSlot);
                Kbd kbd = Kbd.this;
                kbd.EYQ(kbd.nWX);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void EYQ(AdSlot adSlot) {
        List<com.bytedance.sdk.openadsdk.core.model.UB> list = this.IPb;
        if (list == null) {
            return;
        }
        for (com.bytedance.sdk.openadsdk.core.model.UB ub : list) {
            if (com.bytedance.sdk.openadsdk.core.model.UB.Kbd(ub) && ub.mN() != null && ub.mN().MxO() != null) {
                if (com.bytedance.sdk.openadsdk.core.hu.Pm().Kbd(String.valueOf(ub.yK())) && com.bytedance.sdk.openadsdk.core.hu.Pm().VOV()) {
                    com.bytedance.sdk.openadsdk.core.video.EYQ.mZx mzxEYQ = com.bytedance.sdk.openadsdk.core.model.UB.EYQ(CacheDirFactory.getICacheDir(ub.Cia()).Td(), ub);
                    mzxEYQ.EYQ("material_meta", ub);
                    mzxEYQ.EYQ("ad_slot", adSlot);
                    com.bytedance.sdk.openadsdk.core.video.Pm.EYQ.EYQ(mzxEYQ, null);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void EYQ(final Nvm nvm) {
        if (this.Kbd.getAndSet(false)) {
            xt.EYQ(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.nativeexpress.Kbd.2
                @Override // java.lang.Runnable
                public void run() {
                    if (Kbd.this.VwS == null || Kbd.this.VwS.size() <= 0) {
                        if (Kbd.this.QQ != null) {
                            Kbd.this.QQ.EYQ();
                        }
                    } else {
                        Kbd.this.mZx(nvm);
                        if (Kbd.this.QQ != null) {
                            Kbd.this.QQ.EYQ(Kbd.this.VwS);
                        }
                    }
                    Kbd.this.EYQ();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mZx(Nvm nvm) {
        if (this.Pm != null) {
            PAGBannerAd pAGBannerAdEYQ = null;
            Iterator<com.bytedance.sdk.openadsdk.core.model.UB> it = this.VwS.iterator();
            while (it.hasNext() && (pAGBannerAdEYQ = EYQ(it.next())) == null) {
            }
            if (pAGBannerAdEYQ != null) {
                if (!TextUtils.isEmpty(this.EYQ.getBidAdm())) {
                    com.bytedance.sdk.openadsdk.tp.Td.EYQ(this.VwS.get(0), this.nWX.Td());
                }
                this.Pm.onAdLoaded(pAGBannerAdEYQ);
            } else {
                this.Pm.onError(103, com.bytedance.sdk.openadsdk.core.VwS.EYQ(103));
                EYQ(103);
            }
        }
    }

    private void EYQ(int i) {
        List<com.bytedance.sdk.openadsdk.core.model.UB> list = this.IPb;
        com.bytedance.sdk.openadsdk.tp.Td.EYQ().EYQ(com.bytedance.sdk.openadsdk.tp.EYQ.Td.mZx().EYQ(this.HX).Td(this.EYQ.getCodeId()).Kbd((list == null || list.size() <= 0) ? "" : this.IPb.get(0).ZFP()).mZx(i).IPb(com.bytedance.sdk.openadsdk.core.VwS.EYQ(i)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void EYQ(int i, String str) {
        if (this.Kbd.getAndSet(false)) {
            PAGBannerAdLoadListener pAGBannerAdLoadListener = this.Pm;
            if (pAGBannerAdLoadListener != null) {
                pAGBannerAdLoadListener.onError(i, str);
            }
            EYQ eyq = this.QQ;
            if (eyq != null) {
                eyq.EYQ();
            }
            EYQ();
        }
    }

    private PAGBannerAd EYQ(com.bytedance.sdk.openadsdk.core.model.UB ub) {
        if (this.HX != 1) {
            return null;
        }
        if (ub.mN() != null) {
            return new com.bytedance.sdk.openadsdk.core.bannerexpress.Td(this.Td, ub, this.EYQ);
        }
        return new com.bytedance.sdk.openadsdk.core.bannerexpress.EYQ(this.Td, ub, this.EYQ);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void EYQ() {
        List<com.bytedance.sdk.openadsdk.core.model.UB> list = this.IPb;
        if (list != null) {
            list.clear();
        }
        List<com.bytedance.sdk.openadsdk.core.model.UB> list2 = this.VwS;
        if (list2 != null) {
            list2.clear();
        }
        EYQ(true);
        mZx(true);
        Td(true);
        mZx();
    }

    private void EYQ(boolean z) {
        try {
            ScheduledFuture<?> scheduledFuture = this.tsL;
            if (scheduledFuture == null || scheduledFuture.isCancelled()) {
                return;
            }
            com.bytedance.sdk.component.utils.pi.EYQ("ExpressAdLoadManager", "CheckValidFutureTask-->cancel......success=".concat(String.valueOf(this.tsL.cancel(z))));
        } catch (Throwable unused) {
        }
    }

    private void mZx(boolean z) {
        try {
            ScheduledFuture<?> scheduledFuture = this.pi;
            if (scheduledFuture == null || scheduledFuture.isCancelled()) {
                return;
            }
            this.pi.cancel(z);
        } catch (Throwable unused) {
        }
    }

    private void Td(boolean z) {
        try {
            ScheduledFuture<?> scheduledFuture = this.MxO;
            if (scheduledFuture == null || scheduledFuture.isCancelled()) {
                return;
            }
            com.bytedance.sdk.component.utils.pi.EYQ("ExpressAdLoadManager", "TimeOutFutureTask-->cancel......success=".concat(String.valueOf(this.MxO.cancel(z))));
        } catch (Throwable unused) {
        }
    }

    private void mZx() {
        tp.remove(this);
    }
}
