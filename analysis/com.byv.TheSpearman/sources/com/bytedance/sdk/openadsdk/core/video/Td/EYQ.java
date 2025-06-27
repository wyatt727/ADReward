package com.bytedance.sdk.openadsdk.core.video.Td;

import android.content.Context;
import android.text.TextUtils;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.webkit.ProxyConfig;
import com.bytedance.sdk.component.utils.pi;
import com.bytedance.sdk.openadsdk.core.QQ;
import com.bytedance.sdk.openadsdk.core.VwS.IPb;
import com.bytedance.sdk.openadsdk.core.hu;
import com.bytedance.sdk.openadsdk.core.model.KO;
import com.bytedance.sdk.openadsdk.core.model.UB;
import com.bytedance.sdk.openadsdk.core.video.Td.Pm;
import com.bytedance.sdk.openadsdk.layout.TTVideoPlayLayoutForLiveLayout;
import com.bytedance.sdk.openadsdk.mZx.VwS;
import com.bytedance.sdk.openadsdk.nWX.EYQ.Kbd;
import com.bytedance.sdk.openadsdk.utils.tp;
import com.bytedance.sdk.openadsdk.utils.tr;
import com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose;
import java.util.Objects;

/* compiled from: BaseVideoController.java */
/* loaded from: classes2.dex */
public class EYQ extends com.bytedance.sdk.openadsdk.core.video.EYQ.EYQ {
    protected long FH;
    final Pm.mZx FtN;
    private boolean Kbc;
    private final VwS PI;
    private final int Pf;
    IPb Tnp;
    private long kf;
    private long mN;
    protected boolean tr;
    private final Runnable vD;

    protected void Uc() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.EYQ.EYQ
    public boolean tPj() {
        return true;
    }

    public void Tnp() {
        this.FtN.EYQ((com.bykv.vk.openvk.component.video.api.EYQ) null, 0, 0);
    }

    protected void VwS(boolean z) {
        try {
            Objects.toString(this.VwS.Nvm());
            if (!XPd() || z) {
                float fPm = this.Kbd.Pm();
                float fKbd = this.Kbd.Kbd();
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams((int) fPm, (int) fKbd);
                layoutParams.addRule(13);
                if (PI() != null) {
                    if (PI() instanceof TextureView) {
                        ((TextureView) PI()).setLayoutParams(layoutParams);
                    } else if (PI() instanceof SurfaceView) {
                        ((SurfaceView) PI()).setLayoutParams(layoutParams);
                    }
                    ViewGroup.LayoutParams layoutParams2 = this.tPj.getLayoutParams();
                    if (this.tPj.getHeight() > 0) {
                        float fMin = Math.min(this.tPj.getWidth() / fPm, this.tPj.getHeight() / fKbd);
                        if (layoutParams2 != null) {
                            layoutParams.width = (int) (fPm * fMin);
                            layoutParams.height = (int) (fKbd * fMin);
                            if (PI() instanceof TextureView) {
                                ((TextureView) PI()).setLayoutParams(layoutParams);
                            } else if (PI() instanceof SurfaceView) {
                                ((SurfaceView) PI()).setLayoutParams(layoutParams);
                            }
                            if (this.XN.Kbd == 4) {
                                layoutParams2.width = layoutParams.width;
                                layoutParams2.height = layoutParams.height;
                                this.tPj.setLayoutParams(layoutParams2);
                            }
                        }
                    }
                }
            }
        } catch (Throwable th) {
            pi.EYQ(this.EYQ, "changeSize error", th);
        }
    }

    public EYQ(Context context, ViewGroup viewGroup, UB ub, VwS vwS) {
        super(context, ub, viewGroup);
        this.kf = 0L;
        this.mN = 0L;
        this.Kbc = false;
        this.FH = 0L;
        this.tr = false;
        this.FtN = new Pm.mZx() { // from class: com.bytedance.sdk.openadsdk.core.video.Td.EYQ.1
            private boolean mZx = true;

            @Override // com.bykv.vk.openvk.component.video.api.EYQ.InterfaceC0063EYQ
            public void mZx(com.bykv.vk.openvk.component.video.api.EYQ eyq, int i) {
            }

            @Override // com.bykv.vk.openvk.component.video.api.EYQ.InterfaceC0063EYQ
            public void EYQ(com.bykv.vk.openvk.component.video.api.EYQ eyq) {
                String unused = EYQ.this.EYQ;
                EYQ.this.mZx.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.video.Td.EYQ.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        EYQ.this.Pf();
                    }
                });
                com.bytedance.sdk.openadsdk.core.VwS.EYQ eyqZzY = EYQ.this.VwS.zzY();
                if (eyqZzY != null && eyqZzY.EYQ() != null) {
                    long jKbd = EYQ.this.Kbd();
                    eyqZzY.EYQ().Pm(jKbd);
                    eyqZzY.EYQ().Kbd(jKbd);
                }
                Kbd.EYQ(EYQ.this.VwS, 5);
                if (EYQ.this.Tnp != null) {
                    EYQ.this.Tnp.EYQ(9);
                }
            }

            @Override // com.bykv.vk.openvk.component.video.api.EYQ.InterfaceC0063EYQ
            public void EYQ(com.bykv.vk.openvk.component.video.api.EYQ eyq, long j) {
                String unused = EYQ.this.EYQ;
                EYQ.this.NZ = false;
                EYQ.this.mZx.removeCallbacks(EYQ.this.vD);
                EYQ.this.mZx.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.video.Td.EYQ.1.2
                    @Override // java.lang.Runnable
                    public void run() {
                        if (EYQ.this.IPb != null) {
                            EYQ.this.IPb.mZx();
                        }
                    }
                });
                if (!EYQ.this.hYh.get()) {
                    EYQ.this.FH = j;
                    EYQ eyq2 = EYQ.this;
                    eyq2.EYQ(eyq2.PI);
                    EYQ.this.tr();
                }
                if (EYQ.this.Tnp != null) {
                    EYQ.this.Tnp.Td();
                }
                Kbd.EYQ(EYQ.this.VwS, 0);
            }

            @Override // com.bykv.vk.openvk.component.video.api.EYQ.InterfaceC0063EYQ
            public void mZx(com.bykv.vk.openvk.component.video.api.EYQ eyq) {
                String unused = EYQ.this.EYQ;
                EYQ.this.mZx.removeCallbacks(EYQ.this.vD);
                EYQ.this.mZx.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.video.Td.EYQ.1.3
                    @Override // java.lang.Runnable
                    public void run() {
                        if (EYQ.this.IPb != null) {
                            EYQ.this.IPb.mZx();
                        }
                    }
                });
                if (EYQ.this.Tnp != null) {
                    EYQ.this.Tnp.EYQ(EYQ.this.QQ(), EYQ.this.nWX());
                }
            }

            @Override // com.bykv.vk.openvk.component.video.api.EYQ.InterfaceC0063EYQ
            public void EYQ(com.bykv.vk.openvk.component.video.api.EYQ eyq, com.bykv.vk.openvk.component.video.api.Td.EYQ eyq2) {
                pi.EYQ(EYQ.this.EYQ, "onError: " + eyq2.EYQ() + "," + eyq2.mZx() + "," + eyq2.Td());
                EYQ.this.mZx.removeCallbacks(EYQ.this.vD);
                EYQ.this.mZx.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.video.Td.EYQ.1.4
                    @Override // java.lang.Runnable
                    public void run() {
                        if (EYQ.this.IPb != null) {
                            EYQ.this.IPb.mZx();
                        }
                        if (EYQ.this.rfB != null) {
                            EYQ.this.rfB.mZx(EYQ.this.mN, com.bykv.vk.openvk.component.video.EYQ.Kbd.EYQ.EYQ(EYQ.this.QQ, EYQ.this.xt));
                        }
                    }
                });
                EYQ.this.EYQ(eyq2);
                Kbd.EYQ(EYQ.this.VwS, 6);
                if (EYQ.this.Tnp != null) {
                    EYQ.this.Tnp.EYQ(14);
                }
            }

            @Override // com.bykv.vk.openvk.component.video.api.EYQ.InterfaceC0063EYQ
            public void EYQ(com.bykv.vk.openvk.component.video.api.EYQ eyq, boolean z) {
                String unused = EYQ.this.EYQ;
                EYQ.this.mZx.removeCallbacks(EYQ.this.vD);
                EYQ.this.mZx.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.video.Td.EYQ.1.5
                    @Override // java.lang.Runnable
                    public void run() {
                        if (EYQ.this.IPb != null) {
                            EYQ.this.IPb.mZx();
                        }
                    }
                });
            }

            @Override // com.bykv.vk.openvk.component.video.api.EYQ.InterfaceC0063EYQ
            public void Td(com.bykv.vk.openvk.component.video.api.EYQ eyq) {
                String unused = EYQ.this.EYQ;
            }

            @Override // com.bykv.vk.openvk.component.video.api.EYQ.InterfaceC0063EYQ
            public void EYQ(com.bykv.vk.openvk.component.video.api.EYQ eyq, int i, int i2) {
                String unused = EYQ.this.EYQ;
                EYQ.this.mZx.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.video.Td.EYQ.1.6
                    @Override // java.lang.Runnable
                    public void run() {
                        if (EYQ.this.vD()) {
                            if (!KO.mZx(EYQ.this.VwS) && EYQ.this.XN.Kbd != 4) {
                                if (EYQ.this.VwS.rfB() != 3) {
                                    if (EYQ.this.VwS.rfB() == 0) {
                                        EYQ.this.wJ();
                                        return;
                                    } else {
                                        EYQ.this.Dal();
                                        return;
                                    }
                                }
                                EYQ.this.VwS(true);
                                return;
                            }
                            EYQ.this.VwS(true);
                            return;
                        }
                        EYQ.this.lRN();
                    }
                });
            }

            @Override // com.bykv.vk.openvk.component.video.api.EYQ.InterfaceC0063EYQ
            public void EYQ(com.bykv.vk.openvk.component.video.api.EYQ eyq, int i, int i2, int i3) {
                String unused = EYQ.this.EYQ;
                EYQ.this.NZ = true;
                EYQ.this.Kbc();
                EYQ.this.mZx.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.video.Td.EYQ.1.7
                    @Override // java.lang.Runnable
                    public void run() {
                        if (EYQ.this.IPb != null) {
                            EYQ.this.IPb.UB();
                        }
                    }
                });
                Kbd.EYQ(EYQ.this.VwS, 3);
                if (EYQ.this.Tnp != null) {
                    EYQ.this.Tnp.EYQ(4);
                }
            }

            @Override // com.bykv.vk.openvk.component.video.api.EYQ.InterfaceC0063EYQ
            public void EYQ(com.bykv.vk.openvk.component.video.api.EYQ eyq, int i) {
                String unused = EYQ.this.EYQ;
                EYQ.this.NZ = false;
                EYQ.this.mZx.removeCallbacks(EYQ.this.vD);
                EYQ.this.mZx.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.video.Td.EYQ.1.8
                    @Override // java.lang.Runnable
                    public void run() {
                        if (EYQ.this.IPb != null) {
                            EYQ.this.IPb.mZx();
                        }
                    }
                });
                Kbd.EYQ(EYQ.this.VwS, 0);
                if (EYQ.this.Tnp != null) {
                    EYQ.this.Tnp.EYQ(5);
                }
            }

            @Override // com.bykv.vk.openvk.component.video.api.EYQ.InterfaceC0063EYQ
            public void EYQ(com.bykv.vk.openvk.component.video.api.EYQ eyq, long j, long j2) {
                if (Math.abs(j - EYQ.this.QQ) < 50) {
                    return;
                }
                EYQ eyq2 = EYQ.this;
                eyq2.EYQ(eyq2.PI);
                EYQ.this.EYQ(j, j2);
                com.bytedance.sdk.openadsdk.core.VwS.EYQ eyqZzY = EYQ.this.VwS.zzY();
                if (eyqZzY != null && eyqZzY.EYQ() != null) {
                    eyqZzY.EYQ().EYQ(j, j2, EYQ.this.Tnp);
                }
                if (!this.mZx || j2 - j >= 500) {
                    return;
                }
                this.mZx = false;
                EYQ(eyq);
            }

            @Override // com.bykv.vk.openvk.component.video.api.EYQ.InterfaceC0063EYQ
            public void Pm(com.bykv.vk.openvk.component.video.api.EYQ eyq) {
                com.bytedance.sdk.openadsdk.core.VwS.EYQ eyqZzY = EYQ.this.VwS.zzY();
                if (eyqZzY != null && eyqZzY.EYQ() != null) {
                    eyqZzY.EYQ().mZx(EYQ.this.QQ);
                }
                Kbd.EYQ(EYQ.this.VwS, 3);
                if (EYQ.this.Tnp != null) {
                    EYQ.this.Tnp.EYQ(0);
                }
            }

            @Override // com.bykv.vk.openvk.component.video.api.EYQ.InterfaceC0063EYQ
            public void Kbd(com.bykv.vk.openvk.component.video.api.EYQ eyq) {
                Kbd.EYQ(EYQ.this.VwS, 0);
                if (EYQ.this.Tnp != null) {
                    EYQ.this.Tnp.EYQ(1);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.video.Td.Pm.mZx
            public void EYQ(int i, int i2) {
                EYQ eyq = EYQ.this;
                eyq.mZx(eyq.PI);
                EYQ.this.XN.Pm = EYQ.this.Kbd.zF();
                EYQ.this.Nvm();
                EYQ.this.hYh.set(false);
                EYQ eyq2 = EYQ.this;
                eyq2.EYQ(eyq2.PI);
            }
        };
        this.vD = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.video.Td.EYQ.3
            @Override // java.lang.Runnable
            public void run() {
                if (EYQ.this.rfB != null) {
                    EYQ.this.Uc();
                    EYQ.this.rfB.EYQ();
                }
            }
        };
        this.PI = vwS;
        this.Pf = ub.yK();
        if (ub.oIw() && ub.zzY() != null && this.tPj != null) {
            if (this.Tnp == null) {
                this.Tnp = IPb.EYQ();
            }
            this.Tnp.EYQ(this.tPj, ub.zzY().nWX());
        }
        this.IPb = new com.bytedance.sdk.openadsdk.core.video.nativevideo.Kbd(context.getApplicationContext(), new TTVideoPlayLayoutForLiveLayout(context), true, 17, this.VwS, this);
        this.IPb.EYQ(this);
    }

    @Override // com.bykv.vk.openvk.component.video.api.Pm.Td
    public boolean EYQ(com.bykv.vk.openvk.component.video.api.Td.Td td) {
        int iUB;
        View view;
        if (this.Kbd != null) {
            pi.EYQ(this.EYQ, "playVideoUrl: already invoked");
            return false;
        }
        td.pi();
        if (TextUtils.isEmpty(td.pi())) {
            pi.EYQ(this.EYQ, "No video info");
            return false;
        }
        mZx(td);
        td.Td(1);
        this.tr = !td.pi().startsWith(ProxyConfig.MATCH_HTTP);
        if (this.Tnp != null) {
            if (this.XN.Kbd == 1) {
                iUB = hu.Pm().tp(String.valueOf(this.Pf));
            } else {
                iUB = hu.Pm().UB(String.valueOf(this.Pf));
            }
            if (this.tPj != null && (view = (View) this.tPj.getParent()) != null) {
                try {
                    View viewFindViewById = view.findViewById(tp.tsL);
                    View viewFindViewById2 = view.findViewById(520093757);
                    View viewFindViewById3 = view.findViewById(tp.OUK);
                    this.Tnp.EYQ(viewFindViewById, FriendlyObstructionPurpose.OTHER);
                    this.Tnp.EYQ(viewFindViewById3, FriendlyObstructionPurpose.OTHER);
                    this.Tnp.EYQ(viewFindViewById2, FriendlyObstructionPurpose.OTHER);
                } catch (Throwable unused) {
                }
            }
            this.Tnp.EYQ(iUB > 0, iUB / 1000.0f);
        }
        Nvm();
        if (td.VwS() > 0) {
            this.QQ = td.VwS();
            this.HX = Math.max(this.HX, this.QQ);
        }
        if (this.IPb != null) {
            this.IPb.EYQ();
            this.IPb.VwS();
            this.IPb.Td(td.Kbd(), td.IPb());
            this.IPb.Td(this.tPj);
        }
        this.Kbd = new Pm();
        this.Kbd.EYQ(this.FtN);
        hYh();
        this.mN = 0L;
        mN();
        return true;
    }

    private void mN() {
        this.Kbd.Td(FH());
        this.Kbd.EYQ(this.XN);
        this.kf = System.currentTimeMillis();
        this.IPb.Td(8);
        this.IPb.Td(0);
        EYQ(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.video.Td.EYQ.2
            @Override // java.lang.Runnable
            public void run() {
                if (EYQ.this.Kbd == null) {
                    return;
                }
                EYQ.this.kf = System.currentTimeMillis();
                EYQ.this.IPb.Pm(0);
                EYQ.this.Kbd.EYQ(true, EYQ.this.QQ, EYQ.this.KO);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Kbc() {
        int iXPd;
        int i = this.XN.Kbd;
        if (i == 2 || i == 1) {
            iXPd = hu.Pm().XPd() * 1000;
        } else {
            iXPd = i == 4 ? hu.Pm().HX(String.valueOf(this.Pf)) : 5000;
        }
        this.mZx.removeCallbacks(this.vD);
        this.mZx.postDelayed(this.vD, iXPd);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Pf() {
        if (this.IPb == null) {
            return;
        }
        this.mZx.removeCallbacks(this.vD);
        this.IPb.mZx();
        this.mN = System.currentTimeMillis() - this.kf;
        if (!this.Kbc) {
            this.Kbc = true;
            EYQ(this.xt, this.xt);
            long j = this.xt;
            this.QQ = j;
            this.HX = j;
            mZx(this.PI);
        }
        if (this.rfB != null) {
            this.rfB.EYQ(this.mN, com.bykv.vk.openvk.component.video.EYQ.Kbd.EYQ.EYQ(this.QQ, this.xt));
        }
        this.pi = true;
    }

    @Override // com.bykv.vk.openvk.component.video.api.Pm.Td
    public void mZx() {
        if (this.IPb != null) {
            this.IPb.EYQ();
            this.IPb.KO();
            this.IPb.Uc();
        }
        Boolean.valueOf(this.tsL);
        if (this.Kbd != null) {
            if (this.Kbd.VwS()) {
                if (this.tsL) {
                    if (QQ.XN()) {
                        this.Kbd.mZx(3);
                        this.Kbd.EYQ(false, this.Kbd.UB(), this.KO);
                    } else {
                        WU();
                    }
                } else {
                    mZx(this.Nvm);
                }
                Boolean.valueOf(this.tsL);
            } else {
                this.Kbd.EYQ(false, this.QQ, this.KO);
            }
        }
        if (this.Kbc || !this.hYh.get()) {
            return;
        }
        lEs();
        com.bytedance.sdk.openadsdk.core.VwS.EYQ eyqZzY = this.VwS.zzY();
        if (eyqZzY == null || eyqZzY.EYQ() == null) {
            return;
        }
        eyqZzY.EYQ().Td(Kbd());
    }

    public void FtN() {
        if (this.Kbc || !this.hYh.get()) {
            return;
        }
        lEs();
        com.bytedance.sdk.openadsdk.core.VwS.EYQ eyqZzY = this.VwS.zzY();
        if (eyqZzY == null || eyqZzY.EYQ() == null) {
            return;
        }
        eyqZzY.EYQ().Td(Kbd());
    }

    @Override // com.bykv.vk.openvk.component.video.api.Pm.Td
    public void Td() {
        if (this.Kbd == null) {
            return;
        }
        this.Kbd.tsL();
        this.Kbd = null;
        if (this.IPb != null) {
            this.IPb.HX();
        }
        this.mZx.removeCallbacks(this.vD);
        this.mZx.removeCallbacksAndMessages(null);
        IPb iPb = this.Tnp;
        if (iPb != null) {
            iPb.Pm();
        }
    }

    @Override // com.bykv.vk.openvk.component.video.api.Pm.Td
    public void EYQ(boolean z, int i) {
        Td();
    }

    @Override // com.bykv.vk.openvk.component.video.api.Pm.Td
    public void Pm() {
        Td();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean vD() {
        return this.VwS.CsQ() == 100.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lRN() {
        try {
            if (PI() != null && this.Kbd != null && this.tPj != null) {
                int width = this.tPj.getWidth();
                int height = this.tPj.getHeight();
                float fPm = this.Kbd.Pm();
                float fKbd = this.Kbd.Kbd();
                float f = width;
                float f2 = height;
                if (fPm / (f * 1.0f) <= fKbd / (1.0f * f2)) {
                    f = (f2 / fKbd) * fPm;
                } else {
                    f2 = (f / fPm) * fKbd;
                }
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams((int) f, (int) f2);
                layoutParams.addRule(13);
                if (PI() instanceof TextureView) {
                    ((TextureView) PI()).setLayoutParams(layoutParams);
                } else if (PI() instanceof SurfaceView) {
                    ((SurfaceView) PI()).setLayoutParams(layoutParams);
                }
            }
        } catch (Throwable th) {
            pi.EYQ(this.EYQ, "changeVideoSizeSupportInteraction error", th);
        }
    }

    private boolean XPd() {
        return PI() == null || this.Kbd == null || this.VwS.PI() != null || this.VwS.lEs() == 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Dal() {
        try {
            Objects.toString(this.VwS.Nvm());
            if (XPd()) {
                return;
            }
            int[] iArrMZx = tr.mZx(hu.EYQ());
            boolean z = false;
            boolean z2 = this.VwS.TZE() == 1;
            float f = iArrMZx[0];
            float f2 = iArrMZx[1];
            float fPm = this.Kbd.Pm();
            float fKbd = this.Kbd.Kbd();
            if (z2) {
                if (fPm > fKbd) {
                    EYQ(f, f2, fPm, fKbd, true);
                    return;
                }
            } else if (fPm < fKbd) {
                EYQ(f, f2, fPm, fKbd, false);
                return;
            }
            float f3 = fPm / fKbd;
            float f4 = f / f2;
            if (z2) {
                if (f4 < 0.5625f && f3 == 0.5625f) {
                    fPm = (9.0f * f2) / 16.0f;
                    z = true;
                    fKbd = f2;
                }
            } else if (f4 > 1.7777778f && f3 == 1.7777778f) {
                fKbd = (9.0f * f) / 16.0f;
                z = true;
                fPm = f;
            }
            if (z) {
                f = fPm;
                f2 = fKbd;
            }
            int i = (int) f;
            int i2 = (int) f2;
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i, i2);
            layoutParams.addRule(13);
            if (PI() != null) {
                if (PI() instanceof TextureView) {
                    ((TextureView) PI()).setLayoutParams(layoutParams);
                } else if (PI() instanceof SurfaceView) {
                    ((SurfaceView) PI()).setLayoutParams(layoutParams);
                }
                ViewGroup.LayoutParams layoutParams2 = this.tPj.getLayoutParams();
                if (layoutParams2 != null) {
                    layoutParams2.height = i2;
                    layoutParams2.width = i;
                    this.tPj.setLayoutParams(layoutParams2);
                }
            }
        } catch (Throwable th) {
            pi.EYQ(this.EYQ, "changeSize error", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void wJ() {
        try {
            if (PI() != null && this.Kbd != null) {
                boolean z = this.VwS.TZE() == 1;
                int[] iArrMZx = tr.mZx(hu.EYQ());
                EYQ(iArrMZx[0], iArrMZx[1], this.Kbd.Pm(), this.Kbd.Kbd(), z);
            }
        } catch (Throwable unused) {
        }
    }

    private void EYQ(float f, float f2, float f3, float f4, boolean z) {
        RelativeLayout.LayoutParams layoutParams;
        if (f3 <= 0.0f || f4 <= 0.0f) {
            try {
                f3 = this.VwS.mN().Td();
                f4 = this.VwS.mN().mZx();
            } catch (Throwable unused) {
                return;
            }
        }
        if (f4 > 0.0f && f3 > 0.0f) {
            if (z) {
                if (f3 < f4) {
                    return;
                }
                layoutParams = new RelativeLayout.LayoutParams((int) f, (int) ((f4 * f) / f3));
            } else if (f3 > f4) {
                return;
            } else {
                layoutParams = new RelativeLayout.LayoutParams((int) ((f3 * f2) / f4), (int) f2);
            }
            layoutParams.addRule(13);
            if (PI() != null) {
                if (PI() instanceof TextureView) {
                    ((TextureView) PI()).setLayoutParams(layoutParams);
                } else if (PI() instanceof SurfaceView) {
                    ((SurfaceView) PI()).setLayoutParams(layoutParams);
                }
                ViewGroup.LayoutParams layoutParams2 = this.tPj.getLayoutParams();
                if (!com.bytedance.sdk.component.adexpress.Pm.mZx.EYQ(hu.EYQ()) || this.tPj.getHeight() <= 0 || layoutParams2 == null) {
                    return;
                }
                layoutParams2.width = layoutParams.width;
                layoutParams2.height = layoutParams.height;
                this.tPj.setLayoutParams(layoutParams2);
            }
        }
    }

    @Override // com.bykv.vk.openvk.component.video.api.Pm.EYQ
    public void EYQ(com.bykv.vk.openvk.component.video.api.Pm.mZx mzx, View view) {
        if (this.Kbd == null) {
            return;
        }
        if (this.Kbd.IPb()) {
            EYQ();
            this.IPb.mZx(true, false);
            this.IPb.IPb();
        } else {
            if (!this.Kbd.VwS()) {
                if (this.IPb != null) {
                    this.IPb.Td(this.tPj);
                }
                Pm(this.QQ);
                if (this.IPb != null) {
                    this.IPb.mZx(false, false);
                    return;
                }
                return;
            }
            mZx();
            if (this.IPb != null) {
                this.IPb.mZx(false, false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void EYQ(final long j, final long j2) {
        this.VwS.Td(j);
        this.QQ = j;
        this.xt = j2;
        final int iEYQ = com.bykv.vk.openvk.component.video.EYQ.Kbd.EYQ.EYQ(j, j2);
        this.mZx.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.video.Td.EYQ.4
            @Override // java.lang.Runnable
            public void run() {
                EYQ.this.IPb.EYQ(j, j2);
                EYQ.this.IPb.EYQ(iEYQ);
                try {
                    if (EYQ.this.rfB != null) {
                        EYQ.this.rfB.EYQ(j, j2);
                    }
                } catch (Throwable th) {
                    pi.EYQ(EYQ.this.EYQ, "onProgressUpdate error: ", th);
                }
            }
        });
    }

    public com.bykv.vk.openvk.component.video.api.renderview.mZx PI() {
        if (this.IPb != null) {
            return this.IPb.pi();
        }
        return null;
    }

    public void kf() {
        IPb iPb = this.Tnp;
        if (iPb != null) {
            iPb.EYQ(2);
        }
    }
}
