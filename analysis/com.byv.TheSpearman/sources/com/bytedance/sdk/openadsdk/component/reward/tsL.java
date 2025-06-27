package com.bytedance.sdk.openadsdk.component.reward;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.sdk.component.utils.NZ;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdLoadListener;
import com.bytedance.sdk.openadsdk.component.reward.MxO;
import com.bytedance.sdk.openadsdk.core.UB;
import com.bytedance.sdk.openadsdk.core.hu;
import com.bytedance.sdk.openadsdk.core.model.UB;
import com.bytedance.sdk.openadsdk.core.model.hYh;
import com.bytedance.sdk.openadsdk.core.model.zF;
import com.bytedance.sdk.openadsdk.core.video.mZx.EYQ;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* compiled from: RewardVideoLoadManager.java */
/* loaded from: classes2.dex */
public class tsL {
    private static volatile tsL EYQ;
    private com.bytedance.sdk.component.VwS.QQ Kbd;
    private final Context mZx;
    private final AtomicBoolean Td = new AtomicBoolean(false);
    private final List<mZx> Pm = Collections.synchronizedList(new ArrayList());
    private final NZ.EYQ IPb = new NZ.EYQ() { // from class: com.bytedance.sdk.openadsdk.component.reward.tsL.7
        @Override // com.bytedance.sdk.component.utils.NZ.EYQ
        public void EYQ(Context context, Intent intent, boolean z, int i) {
            if (z) {
                if (tsL.this.Kbd == null) {
                    tsL tsl = tsL.this;
                    tsl.Kbd = new com.bytedance.sdk.openadsdk.component.reward.mZx("net connect task", tsl.Pm);
                }
                com.bytedance.sdk.component.utils.QQ.EYQ().post(tsL.this.Kbd);
            }
        }
    };

    public static tsL EYQ(Context context) {
        if (EYQ == null) {
            synchronized (tsL.class) {
                if (EYQ == null) {
                    EYQ = new tsL(context);
                }
            }
        }
        return EYQ;
    }

    private tsL(Context context) {
        this.mZx = context == null ? hu.EYQ() : context.getApplicationContext();
        mZx();
    }

    public void EYQ(AdSlot adSlot) {
        if (adSlot == null || TextUtils.isEmpty(adSlot.getCodeId()) || MxO.EYQ(this.mZx).mZx(adSlot.getCodeId()) != null) {
            return;
        }
        mZx(adSlot);
    }

    public void EYQ() {
        try {
            MxO.EYQ(this.mZx).EYQ();
        } catch (Throwable unused) {
        }
    }

    public void EYQ(AdSlot adSlot, com.bytedance.sdk.openadsdk.common.Td td) {
        mZx(adSlot, td);
    }

    public void mZx(AdSlot adSlot) {
        if (adSlot == null || TextUtils.isEmpty(adSlot.getBidAdm())) {
            EYQ(adSlot, true, null);
        }
    }

    private void mZx(AdSlot adSlot, com.bytedance.sdk.openadsdk.common.Td td) {
        com.bytedance.sdk.openadsdk.core.model.EYQ eyqMZx;
        if (TextUtils.isEmpty(adSlot.getBidAdm()) && (eyqMZx = MxO.EYQ(this.mZx).mZx(adSlot.getCodeId())) != null && eyqMZx.Pm()) {
            KO ko = new KO(this.mZx, eyqMZx, adSlot);
            if (!eyqMZx.IPb() && !zF.MxO(eyqMZx.Kbd())) {
                ko.mZx();
            }
            if (td != null) {
                if (!eyqMZx.IPb() && (td instanceof PAGRewardedAdLoadListener) && hu.Pm().zF() == 0) {
                    ((PAGRewardedAdLoadListener) td).onAdLoaded(ko.EYQ());
                }
                EYQ eyq = new EYQ(td, eyqMZx);
                for (int i = 0; i < eyqMZx.Td().size(); i++) {
                    EYQ(eyqMZx.Td().get(i), adSlot, eyq, ko, eyqMZx.IPb());
                }
            }
            for (int i2 = 0; i2 < eyqMZx.Td().size(); i2++) {
                com.bytedance.sdk.openadsdk.core.video.mZx.EYQ.EYQ().EYQ(eyqMZx.Td().get(i2), new EYQ.InterfaceC0128EYQ() { // from class: com.bytedance.sdk.openadsdk.component.reward.tsL.1
                });
            }
            return;
        }
        EYQ(adSlot, false, td);
    }

    private void EYQ(UB ub, AdSlot adSlot, final EYQ eyq, final KO ko, final boolean z) {
        boolean z2 = true;
        boolean z3 = false;
        if (eyq == null || (!z && hu.Pm().zF() != 1)) {
            z2 = false;
        }
        if (zF.MxO(ub) || Build.VERSION.SDK_INT < 23) {
            z3 = z2;
        } else {
            com.bytedance.sdk.openadsdk.core.video.EYQ.mZx mzxEYQ = UB.EYQ(CacheDirFactory.getICacheDir(ub.Cia()).EYQ(), ub);
            mzxEYQ.EYQ("material_meta", ub);
            mzxEYQ.EYQ("ad_slot", adSlot);
            com.bytedance.sdk.openadsdk.core.video.Pm.EYQ.EYQ(mzxEYQ, new com.bykv.vk.openvk.component.video.api.Kbd.mZx() { // from class: com.bytedance.sdk.openadsdk.component.reward.tsL.2
                @Override // com.bykv.vk.openvk.component.video.api.Kbd.EYQ.InterfaceC0064EYQ
                public void EYQ(com.bykv.vk.openvk.component.video.api.Td.Td td, int i) {
                    Log.d("RewardVideoLoadManager", "onVideoPreloadSuccess: ");
                    if (eyq != null) {
                        if (z || hu.Pm().zF() == 1) {
                            eyq.onAdLoaded(ko.EYQ());
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
            eyq.onAdLoaded(ko.EYQ());
        }
    }

    private void EYQ(final AdSlot adSlot, final boolean z, final com.bytedance.sdk.openadsdk.common.Td td) {
        if (com.bytedance.sdk.component.utils.pi.Pm()) {
            com.bykv.vk.openvk.component.video.api.IPb.mZx.EYQ(adSlot.getBidAdm());
        }
        final long jCurrentTimeMillis = System.currentTimeMillis();
        hYh hyh = new hYh();
        hyh.mZx = z ? 2 : 1;
        if (hu.Pm().MxO(adSlot.getCodeId()) || adSlot.getExpressViewAcceptedWidth() > 0.0f || adSlot.isExpressAd()) {
            hyh.IPb = 2;
        }
        hu.Td().EYQ(adSlot, hyh, 7, new UB.EYQ() { // from class: com.bytedance.sdk.openadsdk.component.reward.tsL.3
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
                    KO ko = new KO(tsL.this.mZx, eyq, adSlot);
                    if (!z) {
                        if (!TextUtils.isEmpty(adSlot.getBidAdm())) {
                            com.bytedance.sdk.openadsdk.tp.Td.EYQ(eyq.Kbd(), System.currentTimeMillis() - jCurrentTimeMillis);
                        }
                        if (!eyq.IPb() && (td instanceof PAGRewardedAdLoadListener) && hu.Pm().zF() == 0) {
                            ((PAGRewardedAdLoadListener) td).onAdLoaded(ko.EYQ());
                        }
                    }
                    EYQ eyq2 = new EYQ(td, eyq);
                    for (int i = 0; i < eyq.Td().size(); i++) {
                        tsL.this.EYQ(eyq, eyq.Td().get(i), ko, adSlot, z, eyq2, eyq.IPb());
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
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void EYQ(final com.bytedance.sdk.openadsdk.core.model.EYQ r15, com.bytedance.sdk.openadsdk.core.model.UB r16, final com.bytedance.sdk.openadsdk.component.reward.KO r17, final com.bytedance.sdk.openadsdk.AdSlot r18, final boolean r19, final com.bytedance.sdk.openadsdk.component.reward.tsL.EYQ r20, final boolean r21) {
        /*
            r14 = this;
            r8 = r14
            r7 = r15
            r9 = r16
            r6 = r18
            r10 = r20
            com.bytedance.sdk.openadsdk.core.video.mZx.EYQ r0 = com.bytedance.sdk.openadsdk.core.video.mZx.EYQ.EYQ()
            com.bytedance.sdk.openadsdk.component.reward.tsL$4 r1 = new com.bytedance.sdk.openadsdk.component.reward.tsL$4
            r1.<init>()
            r0.EYQ(r9, r1)
            r0 = 1
            if (r19 == 0) goto L3e
            boolean r1 = com.bytedance.sdk.openadsdk.core.model.zF.MxO(r16)
            if (r1 != 0) goto L3e
            com.bytedance.sdk.openadsdk.core.settings.Kbd r1 = com.bytedance.sdk.openadsdk.core.hu.Pm()
            java.lang.String r2 = r18.getCodeId()
            com.bytedance.sdk.openadsdk.core.settings.EYQ r1 = r1.rfB(r2)
            int r1 = r1.Pm
            if (r1 != r0) goto L3e
            android.content.Context r1 = r8.mZx
            boolean r1 = com.bytedance.sdk.component.utils.hu.Pm(r1)
            if (r1 != 0) goto L3e
            com.bytedance.sdk.openadsdk.component.reward.tsL$mZx r0 = new com.bytedance.sdk.openadsdk.component.reward.tsL$mZx
            r0.<init>(r9, r6, r15)
            r14.EYQ(r0)
            return
        L3e:
            r11 = 0
            if (r10 == 0) goto L4e
            if (r21 != 0) goto L4f
            com.bytedance.sdk.openadsdk.core.settings.Kbd r1 = com.bytedance.sdk.openadsdk.core.hu.Pm()
            int r1 = r1.zF()
            if (r1 != r0) goto L4e
            goto L4f
        L4e:
            r0 = r11
        L4f:
            boolean r1 = com.bytedance.sdk.openadsdk.core.model.zF.MxO(r16)
            if (r1 != 0) goto Lad
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 23
            if (r1 < r2) goto L91
            com.bykv.vk.openvk.component.video.api.Td.mZx r1 = r16.mN()
            if (r1 == 0) goto Lb6
            int r0 = r16.Cia()
            com.bykv.vk.openvk.component.video.api.EYQ.mZx r0 = com.bytedance.sdk.openadsdk.CacheDirFactory.getICacheDir(r0)
            java.lang.String r0 = r0.EYQ()
            com.bytedance.sdk.openadsdk.core.video.EYQ.mZx r12 = com.bytedance.sdk.openadsdk.core.model.UB.EYQ(r0, r9)
            java.lang.String r0 = "material_meta"
            r12.EYQ(r0, r9)
            java.lang.String r0 = "ad_slot"
            r12.EYQ(r0, r6)
            com.bytedance.sdk.openadsdk.component.reward.tsL$5 r9 = new com.bytedance.sdk.openadsdk.component.reward.tsL$5
            r0 = r9
            r1 = r14
            r2 = r17
            r3 = r19
            r4 = r20
            r5 = r21
            r6 = r18
            r7 = r15
            r0.<init>()
            com.bytedance.sdk.openadsdk.core.video.Pm.EYQ.EYQ(r12, r9)
            goto Lb7
        L91:
            android.content.Context r0 = r8.mZx
            com.bytedance.sdk.openadsdk.component.reward.MxO r12 = com.bytedance.sdk.openadsdk.component.reward.MxO.EYQ(r0)
            com.bytedance.sdk.openadsdk.component.reward.tsL$6 r13 = new com.bytedance.sdk.openadsdk.component.reward.tsL$6
            r0 = r13
            r1 = r14
            r2 = r19
            r3 = r17
            r4 = r20
            r5 = r21
            r6 = r18
            r7 = r15
            r0.<init>()
            r12.EYQ(r9, r13)
            goto Lb7
        Lad:
            android.content.Context r1 = r8.mZx
            com.bytedance.sdk.openadsdk.component.reward.MxO r1 = com.bytedance.sdk.openadsdk.component.reward.MxO.EYQ(r1)
            r1.EYQ(r6, r15)
        Lb6:
            r11 = r0
        Lb7:
            if (r11 == 0) goto Lc0
            com.bytedance.sdk.openadsdk.component.reward.QQ r0 = r17.EYQ()
            r10.onAdLoaded(r0)
        Lc0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.component.reward.tsL.EYQ(com.bytedance.sdk.openadsdk.core.model.EYQ, com.bytedance.sdk.openadsdk.core.model.UB, com.bytedance.sdk.openadsdk.component.reward.KO, com.bytedance.sdk.openadsdk.AdSlot, boolean, com.bytedance.sdk.openadsdk.component.reward.tsL$EYQ, boolean):void");
    }

    public void EYQ(String str) {
        MxO.EYQ(this.mZx).EYQ(str);
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

    /* compiled from: RewardVideoLoadManager.java */
    public static class mZx extends com.bytedance.sdk.component.VwS.QQ {
        com.bytedance.sdk.openadsdk.core.model.UB EYQ;
        com.bytedance.sdk.openadsdk.core.model.EYQ Td;
        AdSlot mZx;

        mZx(com.bytedance.sdk.openadsdk.core.model.UB ub, AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.EYQ eyq) {
            super("Reward Task");
            this.EYQ = ub;
            this.mZx = adSlot;
            this.Td = eyq;
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
                    com.bytedance.sdk.openadsdk.core.video.Pm.EYQ.EYQ(mzxEYQ, new com.bykv.vk.openvk.component.video.api.Kbd.mZx() { // from class: com.bytedance.sdk.openadsdk.component.reward.tsL.mZx.1
                        @Override // com.bykv.vk.openvk.component.video.api.Kbd.EYQ.InterfaceC0064EYQ
                        public void EYQ(com.bykv.vk.openvk.component.video.api.Td.Td td, int i, String str) {
                        }

                        @Override // com.bykv.vk.openvk.component.video.api.Kbd.EYQ.InterfaceC0064EYQ
                        public void EYQ(com.bykv.vk.openvk.component.video.api.Td.Td td, int i) {
                            MxO.EYQ(hu.EYQ()).EYQ(mZx.this.mZx, mZx.this.Td);
                        }
                    });
                    return;
                }
                return;
            }
            MxO.EYQ(hu.EYQ()).EYQ(this.EYQ, new MxO.EYQ<Object>() { // from class: com.bytedance.sdk.openadsdk.component.reward.tsL.mZx.2
                @Override // com.bytedance.sdk.openadsdk.component.reward.MxO.EYQ
                public void EYQ(boolean z, Object obj) {
                    if (z) {
                        MxO.EYQ(hu.EYQ()).EYQ(mZx.this.mZx, mZx.this.Td);
                    }
                }
            });
        }
    }

    /* compiled from: RewardVideoLoadManager.java */
    private static class EYQ implements PAGRewardedAdLoadListener {
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
            if (this.Td.decrementAndGet() <= 0 && (this.EYQ instanceof PAGRewardedAdLoadListener) && this.mZx.compareAndSet(false, true)) {
                this.EYQ.onError(i, str);
                com.bytedance.sdk.openadsdk.tp.Td.EYQ("choose_ad_load_error", false, new com.bytedance.sdk.openadsdk.tp.mZx() { // from class: com.bytedance.sdk.openadsdk.component.reward.tsL.EYQ.1
                    @Override // com.bytedance.sdk.openadsdk.tp.mZx
                    public com.bytedance.sdk.openadsdk.tp.EYQ.mZx getLogStats() throws Exception {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("req_id", EYQ.this.Pm.EYQ());
                        return com.bytedance.sdk.openadsdk.tp.EYQ.Td.mZx().EYQ("choose_ad_load_error").mZx(jSONObject.toString());
                    }
                });
            }
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
        /* renamed from: EYQ, reason: merged with bridge method [inline-methods] */
        public void onAdLoaded(PAGRewardedAd pAGRewardedAd) {
            this.Td.decrementAndGet();
            if ((this.EYQ instanceof PAGRewardedAdLoadListener) && this.mZx.compareAndSet(false, true)) {
                ((PAGRewardedAdLoadListener) this.EYQ).onAdLoaded(pAGRewardedAd);
            }
        }
    }
}
