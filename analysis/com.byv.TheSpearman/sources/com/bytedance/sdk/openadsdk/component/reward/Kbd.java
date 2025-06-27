package com.bytedance.sdk.openadsdk.component.reward;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.NZ;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdLoadListener;
import com.bytedance.sdk.openadsdk.component.reward.Pm;
import com.bytedance.sdk.openadsdk.core.UB;
import com.bytedance.sdk.openadsdk.core.hu;
import com.bytedance.sdk.openadsdk.core.model.UB;
import com.bytedance.sdk.openadsdk.core.model.hYh;
import com.bytedance.sdk.openadsdk.core.model.zF;
import com.bytedance.sdk.openadsdk.core.video.mZx.EYQ;
import com.bytedance.sdk.openadsdk.utils.Nvm;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* compiled from: FullScreenVideoLoadManager.java */
/* loaded from: classes2.dex */
public class Kbd {
    private static volatile Kbd EYQ;
    private com.bytedance.sdk.component.VwS.QQ Kbd;
    private final Context mZx;
    private final AtomicBoolean Td = new AtomicBoolean(false);
    private final List<mZx> Pm = Collections.synchronizedList(new ArrayList());
    private final NZ.EYQ IPb = new NZ.EYQ() { // from class: com.bytedance.sdk.openadsdk.component.reward.Kbd.7
        @Override // com.bytedance.sdk.component.utils.NZ.EYQ
        public void EYQ(Context context, Intent intent, boolean z, int i) {
            if (z) {
                if (Kbd.this.Kbd == null) {
                    Kbd kbd = Kbd.this;
                    kbd.Kbd = new com.bytedance.sdk.openadsdk.component.reward.mZx("fsv net connect task", kbd.Pm);
                }
                com.bytedance.sdk.component.utils.QQ.EYQ().post(Kbd.this.Kbd);
            }
        }
    };

    public static Kbd EYQ(Context context) {
        if (EYQ == null) {
            synchronized (Kbd.class) {
                if (EYQ == null) {
                    EYQ = new Kbd(context);
                }
            }
        }
        return EYQ;
    }

    private Kbd(Context context) {
        this.mZx = context == null ? hu.EYQ() : context.getApplicationContext();
        mZx();
    }

    public void EYQ() {
        try {
            Pm.EYQ(this.mZx).EYQ();
        } catch (Throwable unused) {
        }
    }

    public void EYQ(AdSlot adSlot) {
        if (adSlot == null || TextUtils.isEmpty(adSlot.getCodeId()) || Pm.EYQ(this.mZx).mZx(adSlot.getCodeId()) != null) {
            return;
        }
        mZx(adSlot);
    }

    public void EYQ(AdSlot adSlot, com.bytedance.sdk.openadsdk.common.Td td) {
        mZx(adSlot, td);
    }

    public void mZx(AdSlot adSlot) {
        if (adSlot == null || TextUtils.isEmpty(adSlot.getBidAdm())) {
            EYQ(adSlot, true, Nvm.EYQ(), null);
        }
    }

    private void mZx(AdSlot adSlot, com.bytedance.sdk.openadsdk.common.Td td) {
        com.bytedance.sdk.openadsdk.core.model.EYQ eyqMZx;
        Nvm nvmEYQ = Nvm.EYQ();
        if (TextUtils.isEmpty(adSlot.getBidAdm()) && (eyqMZx = Pm.EYQ(this.mZx).mZx(adSlot.getCodeId())) != null && eyqMZx.Pm()) {
            nWX nwx = new nWX(this.mZx, eyqMZx);
            if (!eyqMZx.IPb() && !zF.MxO(eyqMZx.Kbd())) {
                nwx.mZx();
            }
            if (td != null) {
                if (!eyqMZx.IPb() && (td instanceof PAGInterstitialAdLoadListener) && hu.Pm().zF() == 0) {
                    ((PAGInterstitialAdLoadListener) td).onAdLoaded(nwx.EYQ());
                }
                EYQ eyq = new EYQ(td, eyqMZx);
                for (int i = 0; i < eyqMZx.Td().size(); i++) {
                    EYQ(eyqMZx.Td().get(i), adSlot, eyq, nvmEYQ, nwx, eyqMZx.IPb());
                }
            }
            for (int i2 = 0; i2 < eyqMZx.Td().size(); i2++) {
                com.bytedance.sdk.openadsdk.core.video.mZx.EYQ.EYQ().EYQ(eyqMZx.Td().get(i2), new EYQ.InterfaceC0128EYQ() { // from class: com.bytedance.sdk.openadsdk.component.reward.Kbd.1
                });
            }
            return;
        }
        EYQ(adSlot, false, nvmEYQ, td);
    }

    private void EYQ(UB ub, AdSlot adSlot, final EYQ eyq, Nvm nvm, final nWX nwx, final boolean z) {
        boolean z2 = true;
        boolean z3 = false;
        if (eyq == null || (!z && hu.Pm().zF() != 1)) {
            z2 = false;
        }
        if (zF.MxO(ub) || !UB.Kbd(ub) || Build.VERSION.SDK_INT < 23) {
            z3 = z2;
        } else {
            ub.mN();
            com.bytedance.sdk.openadsdk.core.video.EYQ.mZx mzxEYQ = UB.EYQ(CacheDirFactory.getICacheDir(ub.Cia()).EYQ(), ub);
            mzxEYQ.EYQ("material_meta", ub);
            mzxEYQ.EYQ("ad_slot", adSlot);
            com.bytedance.sdk.openadsdk.core.video.Pm.EYQ.EYQ(mzxEYQ, new com.bykv.vk.openvk.component.video.api.Kbd.mZx() { // from class: com.bytedance.sdk.openadsdk.component.reward.Kbd.2
                @Override // com.bykv.vk.openvk.component.video.api.Kbd.EYQ.InterfaceC0064EYQ
                public void EYQ(com.bykv.vk.openvk.component.video.api.Td.Td td, int i) {
                    if (eyq != null) {
                        if (z || hu.Pm().zF() == 1) {
                            eyq.onAdLoaded(nwx.EYQ());
                        }
                    }
                }

                @Override // com.bykv.vk.openvk.component.video.api.Kbd.EYQ.InterfaceC0064EYQ
                public void EYQ(com.bykv.vk.openvk.component.video.api.Td.Td td, int i, String str) {
                    if (eyq != null) {
                        if (z || hu.Pm().zF() == 1) {
                            eyq.onError(i, str);
                        }
                    }
                }
            });
        }
        if (z3) {
            eyq.onAdLoaded(nwx.EYQ());
        }
    }

    private void EYQ(final AdSlot adSlot, final boolean z, final Nvm nvm, final com.bytedance.sdk.openadsdk.common.Td td) {
        final long jCurrentTimeMillis = System.currentTimeMillis();
        hYh hyh = new hYh();
        hyh.Td = z ? 2 : 1;
        if (hu.Pm().MxO(adSlot.getCodeId()) || adSlot.getExpressViewAcceptedWidth() > 0.0f || adSlot.isExpressAd()) {
            hyh.IPb = 2;
        }
        hu.Td().EYQ(adSlot, hyh, 8, new UB.EYQ() { // from class: com.bytedance.sdk.openadsdk.component.reward.Kbd.3
            @Override // com.bytedance.sdk.openadsdk.core.UB.EYQ
            public void EYQ(int i, String str) {
                com.bytedance.sdk.openadsdk.common.Td td2;
                if (z || (td2 = td) == null) {
                    return;
                }
                td2.onError(i, str);
            }

            @Override // com.bytedance.sdk.openadsdk.core.UB.EYQ
            public void EYQ(com.bytedance.sdk.openadsdk.core.model.EYQ eyq, com.bytedance.sdk.openadsdk.core.model.mZx mzx) {
                com.bytedance.sdk.openadsdk.common.Td td2;
                if (eyq.Td() != null && !eyq.Td().isEmpty()) {
                    nWX nwx = new nWX(Kbd.this.mZx, eyq);
                    if (!z) {
                        if (!TextUtils.isEmpty(adSlot.getBidAdm())) {
                            com.bytedance.sdk.openadsdk.tp.Td.EYQ(eyq.Kbd(), System.currentTimeMillis() - jCurrentTimeMillis);
                        }
                        if (!eyq.IPb() && (td instanceof PAGInterstitialAdLoadListener) && hu.Pm().zF() == 0) {
                            ((PAGInterstitialAdLoadListener) td).onAdLoaded(nwx.EYQ());
                        }
                    }
                    EYQ eyq2 = new EYQ(td, eyq);
                    for (int i = 0; i < eyq.Td().size(); i++) {
                        Kbd.this.EYQ(eyq, eyq.Td().get(i), nwx, adSlot, z, nvm, eyq2, eyq.IPb());
                    }
                    return;
                }
                if (z || (td2 = td) == null) {
                    return;
                }
                td2.onError(-3, com.bytedance.sdk.openadsdk.core.VwS.EYQ(-3));
                mzx.EYQ(-3);
                com.bytedance.sdk.openadsdk.core.model.mZx.EYQ(mzx);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void EYQ(final com.bytedance.sdk.openadsdk.core.model.EYQ r15, com.bytedance.sdk.openadsdk.core.model.UB r16, final com.bytedance.sdk.openadsdk.component.reward.nWX r17, final com.bytedance.sdk.openadsdk.AdSlot r18, final boolean r19, com.bytedance.sdk.openadsdk.utils.Nvm r20, final com.bytedance.sdk.openadsdk.component.reward.Kbd.EYQ r21, final boolean r22) {
        /*
            r14 = this;
            r8 = r14
            r9 = r16
            r6 = r18
            r10 = r21
            com.bytedance.sdk.openadsdk.core.video.mZx.EYQ r0 = com.bytedance.sdk.openadsdk.core.video.mZx.EYQ.EYQ()
            com.bytedance.sdk.openadsdk.component.reward.Kbd$4 r1 = new com.bytedance.sdk.openadsdk.component.reward.Kbd$4
            r1.<init>()
            r0.EYQ(r9, r1)
            r0 = 1
            if (r19 == 0) goto L43
            boolean r1 = com.bytedance.sdk.openadsdk.core.model.zF.MxO(r16)
            if (r1 != 0) goto L43
            boolean r1 = com.bytedance.sdk.openadsdk.core.model.UB.Kbd(r16)
            if (r1 == 0) goto L43
            com.bytedance.sdk.openadsdk.core.settings.Kbd r1 = com.bytedance.sdk.openadsdk.core.hu.Pm()
            java.lang.String r2 = r18.getCodeId()
            com.bytedance.sdk.openadsdk.core.settings.EYQ r1 = r1.rfB(r2)
            int r1 = r1.Pm
            if (r1 != r0) goto L43
            android.content.Context r1 = r8.mZx
            boolean r1 = com.bytedance.sdk.component.utils.hu.Pm(r1)
            if (r1 != 0) goto L43
            com.bytedance.sdk.openadsdk.component.reward.Kbd$mZx r0 = new com.bytedance.sdk.openadsdk.component.reward.Kbd$mZx
            r0.<init>(r9, r6)
            r14.EYQ(r0)
            return
        L43:
            r11 = 0
            if (r10 == 0) goto L53
            if (r22 != 0) goto L54
            com.bytedance.sdk.openadsdk.core.settings.Kbd r1 = com.bytedance.sdk.openadsdk.core.hu.Pm()
            int r1 = r1.zF()
            if (r1 != r0) goto L53
            goto L54
        L53:
            r0 = r11
        L54:
            boolean r1 = com.bytedance.sdk.openadsdk.core.model.zF.MxO(r16)
            if (r1 != 0) goto Lba
            boolean r1 = com.bytedance.sdk.openadsdk.core.model.UB.Kbd(r16)
            if (r1 == 0) goto Lb8
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 23
            if (r1 < r2) goto L9c
            com.bykv.vk.openvk.component.video.api.Td.mZx r1 = r16.mN()
            if (r1 == 0) goto Lc4
            int r0 = r16.Cia()
            com.bykv.vk.openvk.component.video.api.EYQ.mZx r0 = com.bytedance.sdk.openadsdk.CacheDirFactory.getICacheDir(r0)
            java.lang.String r0 = r0.EYQ()
            com.bytedance.sdk.openadsdk.core.video.EYQ.mZx r12 = com.bytedance.sdk.openadsdk.core.model.UB.EYQ(r0, r9)
            java.lang.String r0 = "material_meta"
            r12.EYQ(r0, r9)
            java.lang.String r0 = "ad_slot"
            r12.EYQ(r0, r6)
            com.bytedance.sdk.openadsdk.component.reward.Kbd$5 r9 = new com.bytedance.sdk.openadsdk.component.reward.Kbd$5
            r0 = r9
            r1 = r14
            r2 = r19
            r3 = r21
            r4 = r22
            r5 = r17
            r6 = r18
            r7 = r15
            r0.<init>()
            com.bytedance.sdk.openadsdk.core.video.Pm.EYQ.EYQ(r12, r9)
            goto Lc5
        L9c:
            android.content.Context r0 = r8.mZx
            com.bytedance.sdk.openadsdk.component.reward.Pm r12 = com.bytedance.sdk.openadsdk.component.reward.Pm.EYQ(r0)
            com.bytedance.sdk.openadsdk.component.reward.Kbd$6 r13 = new com.bytedance.sdk.openadsdk.component.reward.Kbd$6
            r0 = r13
            r1 = r14
            r2 = r19
            r3 = r17
            r4 = r21
            r5 = r22
            r6 = r18
            r7 = r15
            r0.<init>()
            r12.EYQ(r9, r13)
            goto Lc5
        Lb8:
            if (r19 == 0) goto Lc4
        Lba:
            android.content.Context r1 = r8.mZx
            com.bytedance.sdk.openadsdk.component.reward.Pm r1 = com.bytedance.sdk.openadsdk.component.reward.Pm.EYQ(r1)
            r2 = r15
            r1.EYQ(r6, r15)
        Lc4:
            r11 = r0
        Lc5:
            if (r11 == 0) goto Lce
            com.bytedance.sdk.openadsdk.component.reward.IPb r0 = r17.EYQ()
            r10.onAdLoaded(r0)
        Lce:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.component.reward.Kbd.EYQ(com.bytedance.sdk.openadsdk.core.model.EYQ, com.bytedance.sdk.openadsdk.core.model.UB, com.bytedance.sdk.openadsdk.component.reward.nWX, com.bytedance.sdk.openadsdk.AdSlot, boolean, com.bytedance.sdk.openadsdk.utils.Nvm, com.bytedance.sdk.openadsdk.component.reward.Kbd$EYQ, boolean):void");
    }

    public void EYQ(String str) {
        Pm.EYQ(this.mZx).EYQ(str);
    }

    private void EYQ(mZx mzx) {
        if (mzx == null) {
            return;
        }
        if (this.Pm.size() > 0) {
            this.Pm.remove(0);
        }
        this.Pm.add(mzx);
    }

    private void mZx() {
        if (this.Td.get()) {
            return;
        }
        this.Td.set(true);
        NZ.EYQ(this.IPb, this.mZx);
    }

    private void Td() {
        if (this.Td.get()) {
            this.Td.set(false);
            try {
                NZ.EYQ(this.IPb);
            } catch (Exception unused) {
            }
        }
    }

    protected void finalize() throws Throwable {
        super.finalize();
        if (this.Kbd != null) {
            try {
                com.bytedance.sdk.component.utils.QQ.EYQ().removeCallbacks(this.Kbd);
            } catch (Exception unused) {
            }
            this.Kbd = null;
        }
        Td();
    }

    /* compiled from: FullScreenVideoLoadManager.java */
    private static class mZx extends com.bytedance.sdk.component.VwS.QQ {
        com.bytedance.sdk.openadsdk.core.model.UB EYQ;
        com.bytedance.sdk.openadsdk.core.model.EYQ Td;
        AdSlot mZx;

        mZx(com.bytedance.sdk.openadsdk.core.model.UB ub, AdSlot adSlot) {
            super("Fullscreen Task");
            this.EYQ = ub;
            this.mZx = adSlot;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.EYQ == null) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 23) {
                if (this.EYQ.mN() != null) {
                    com.bytedance.sdk.openadsdk.core.video.EYQ.mZx mzxEYQ = com.bytedance.sdk.openadsdk.core.model.UB.EYQ(CacheDirFactory.getICacheDir(this.EYQ.Cia()).EYQ(), this.EYQ);
                    mzxEYQ.EYQ("material_meta", this.EYQ);
                    mzxEYQ.EYQ("ad_slot", this.mZx);
                    com.bytedance.sdk.openadsdk.core.video.Pm.EYQ.EYQ(mzxEYQ, new com.bykv.vk.openvk.component.video.api.Kbd.mZx() { // from class: com.bytedance.sdk.openadsdk.component.reward.Kbd.mZx.1
                        @Override // com.bykv.vk.openvk.component.video.api.Kbd.EYQ.InterfaceC0064EYQ
                        public void EYQ(com.bykv.vk.openvk.component.video.api.Td.Td td, int i, String str) {
                        }

                        @Override // com.bykv.vk.openvk.component.video.api.Kbd.EYQ.InterfaceC0064EYQ
                        public void EYQ(com.bykv.vk.openvk.component.video.api.Td.Td td, int i) {
                            Pm.EYQ(hu.EYQ()).EYQ(mZx.this.mZx, mZx.this.Td);
                        }
                    });
                    return;
                }
                return;
            }
            Pm.EYQ(hu.EYQ()).EYQ(this.EYQ, new Pm.EYQ<Object>() { // from class: com.bytedance.sdk.openadsdk.component.reward.Kbd.mZx.2
                @Override // com.bytedance.sdk.openadsdk.component.reward.Pm.EYQ
                public void EYQ(boolean z, Object obj) {
                    if (z) {
                        Pm.EYQ(hu.EYQ()).EYQ(mZx.this.mZx, mZx.this.Td);
                    }
                }
            });
        }
    }

    /* compiled from: FullScreenVideoLoadManager.java */
    private static class EYQ implements PAGInterstitialAdLoadListener {
        private final com.bytedance.sdk.openadsdk.common.Td EYQ;
        private final com.bytedance.sdk.openadsdk.core.model.EYQ Pm;
        private final AtomicInteger Td;
        private final AtomicBoolean mZx;

        private EYQ(com.bytedance.sdk.openadsdk.common.Td td, com.bytedance.sdk.openadsdk.core.model.EYQ eyq) {
            this.mZx = new AtomicBoolean(false);
            this.EYQ = td;
            this.Pm = eyq;
            this.Td = new AtomicInteger(EYQ());
        }

        private int EYQ() {
            if (!this.Pm.Pm()) {
                return 0;
            }
            int i = 0;
            for (int i2 = 0; i2 < this.Pm.Td().size(); i2++) {
                com.bytedance.sdk.openadsdk.core.model.UB ub = this.Pm.Td().get(i2);
                if (ub != null && !zF.MxO(ub) && ub.mN() != null) {
                    i++;
                }
            }
            return i;
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.Td
        public void onError(int i, String str) {
            if (this.Td.decrementAndGet() > 0 || !this.mZx.compareAndSet(false, true)) {
                return;
            }
            this.EYQ.onError(i, str);
            com.bytedance.sdk.openadsdk.tp.Td.EYQ("choose_ad_load_error", false, new com.bytedance.sdk.openadsdk.tp.mZx() { // from class: com.bytedance.sdk.openadsdk.component.reward.Kbd.EYQ.1
                @Override // com.bytedance.sdk.openadsdk.tp.mZx
                public com.bytedance.sdk.openadsdk.tp.EYQ.mZx getLogStats() throws Exception {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("req_id", EYQ.this.Pm.EYQ());
                    return com.bytedance.sdk.openadsdk.tp.EYQ.Td.mZx().EYQ("choose_ad_load_error").mZx(jSONObject.toString());
                }
            });
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
        /* renamed from: EYQ, reason: merged with bridge method [inline-methods] */
        public void onAdLoaded(PAGInterstitialAd pAGInterstitialAd) {
            this.Td.decrementAndGet();
            if ((this.EYQ instanceof PAGInterstitialAdLoadListener) && this.mZx.compareAndSet(false, true)) {
                ((PAGInterstitialAdLoadListener) this.EYQ).onAdLoaded(pAGInterstitialAd);
            }
        }
    }
}
