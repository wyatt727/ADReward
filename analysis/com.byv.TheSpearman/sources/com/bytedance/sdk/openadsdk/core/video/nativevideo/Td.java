package com.bytedance.sdk.openadsdk.core.video.nativevideo;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.bykv.vk.openvk.component.video.api.EYQ;
import com.bykv.vk.openvk.component.video.api.Pm.Td;
import com.bytedance.sdk.component.utils.NZ;
import com.bytedance.sdk.component.utils.QQ;
import com.bytedance.sdk.component.utils.hu;
import com.bytedance.sdk.component.utils.pi;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.core.VwS.IPb;
import com.bytedance.sdk.openadsdk.core.model.UB;
import com.bytedance.sdk.openadsdk.core.video.nativevideo.NativeVideoTsView;
import com.bytedance.sdk.openadsdk.layout.TTVideoDetailLayout;
import com.bytedance.sdk.openadsdk.layout.TTVideoPlayLayoutForLiveLayout;
import com.bytedance.sdk.openadsdk.mZx.Pm.mZx.KO;
import com.bytedance.sdk.openadsdk.mZx.VwS;
import com.bytedance.sdk.openadsdk.utils.xt;
import com.google.android.exoplayer2.source.rtsp.RtspMediaSource;
import com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Objects;

/* compiled from: NativeVideoController.java */
/* loaded from: classes2.dex */
public class Td extends com.bytedance.sdk.openadsdk.core.video.EYQ.EYQ {
    private mZx Dal;
    private long FH;
    private final String FtN;
    private final Runnable KR;
    private WeakReference<Td.Pm> Kbc;
    private boolean OtA;
    private final boolean PI;
    private WeakReference<EYQ> Pf;
    private int TQF;
    private final boolean Tnp;
    private VwS XPd;
    private final boolean kf;
    private int lRN;
    private boolean mN;
    private final NZ.EYQ na;
    private long tr;
    private int vD;
    private final EYQ.InterfaceC0063EYQ wJ;
    private int wa;

    /* compiled from: NativeVideoController.java */
    public interface EYQ {
        void EYQ(int i);

        void IPb();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean Td(int i, int i2) {
        boolean z = i == -1010 || i == -1007 || i == -1004 || i == -110 || i == 100 || i == 200;
        if (i2 == 1 || i2 == 700 || i2 == 800) {
            return true;
        }
        return z;
    }

    public void VwS(boolean z) {
        this.mN = z;
    }

    public void EYQ(final NativeVideoTsView.EYQ eyq) {
        if (!this.nWX || this.IPb == null) {
            return;
        }
        this.IPb.EYQ(new NativeVideoTsView.EYQ() { // from class: com.bytedance.sdk.openadsdk.core.video.nativevideo.Td.2
            @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.NativeVideoTsView.EYQ
            public void EYQ(View view, int i) {
                NativeVideoTsView.EYQ eyq2 = eyq;
                if (eyq2 != null) {
                    eyq2.EYQ(view, i);
                }
            }
        });
    }

    public void EYQ(PAGNativeAd pAGNativeAd) {
        if (!this.nWX || this.IPb == null) {
            return;
        }
        this.IPb.EYQ(pAGNativeAd);
    }

    public void EYQ(int i, int i2) {
        if (i == 0 || i2 == 0) {
            return;
        }
        this.vD = i;
        this.lRN = i2;
    }

    public void EYQ(mZx mzx) {
        this.Dal = mzx;
    }

    private void EYQ(Context context) {
        ViewGroup tTVideoDetailLayout;
        if (this.nWX) {
            tTVideoDetailLayout = new TTVideoPlayLayoutForLiveLayout(context);
        } else {
            tTVideoDetailLayout = new TTVideoDetailLayout(context);
        }
        ViewGroup viewGroup = tTVideoDetailLayout;
        if (this.nWX) {
            this.IPb = new Kbd(context, viewGroup, true, 17, this.VwS, this, NZ());
        } else {
            this.IPb = new Pm(context, viewGroup, true, 17, this.VwS, this, false);
        }
        this.IPb.EYQ(this);
    }

    public Td(Context context, ViewGroup viewGroup, UB ub, String str, boolean z, boolean z2, boolean z3, VwS vwS) {
        super(context, ub, viewGroup);
        this.FH = 0L;
        this.tr = 0L;
        this.mN = true;
        this.vD = 0;
        this.lRN = 0;
        this.wJ = new EYQ.InterfaceC0063EYQ() { // from class: com.bytedance.sdk.openadsdk.core.video.nativevideo.Td.1
            @Override // com.bykv.vk.openvk.component.video.api.EYQ.InterfaceC0063EYQ
            public void Td(com.bykv.vk.openvk.component.video.api.EYQ eyq) {
            }

            @Override // com.bykv.vk.openvk.component.video.api.EYQ.InterfaceC0063EYQ
            public void mZx(com.bykv.vk.openvk.component.video.api.EYQ eyq, int i) {
            }

            @Override // com.bykv.vk.openvk.component.video.api.EYQ.InterfaceC0063EYQ
            public void EYQ(com.bykv.vk.openvk.component.video.api.EYQ eyq) {
                Td.this.mZx.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.video.nativevideo.Td.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        Td.this.PI();
                        com.bytedance.sdk.openadsdk.nWX.EYQ.Kbd.EYQ(Td.this.VwS, 5);
                        if (Td.this.lEs != null) {
                            Td.this.lEs.EYQ(9);
                        }
                    }
                });
                if (Td.this.VwS.zzY() == null || Td.this.VwS.zzY().EYQ() == null) {
                    return;
                }
                Td.this.VwS.zzY().EYQ().Pm(Td.this.QQ);
            }

            @Override // com.bykv.vk.openvk.component.video.api.EYQ.InterfaceC0063EYQ
            public void EYQ(com.bykv.vk.openvk.component.video.api.EYQ eyq, long j) {
                Td.this.NZ = false;
                Td.this.mZx.removeCallbacks(Td.this.KR);
                Td.this.mZx.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.video.nativevideo.Td.1.2
                    @Override // java.lang.Runnable
                    public void run() {
                        if (Td.this.IPb != null) {
                            Td.this.IPb.mZx();
                        }
                        if (!Td.this.nWX || Td.this.Pf == null || Td.this.Pf.get() == null) {
                            return;
                        }
                        ((EYQ) Td.this.Pf.get()).IPb();
                    }
                });
                Td.this.tr();
                com.bytedance.sdk.openadsdk.nWX.EYQ.Kbd.EYQ(Td.this.VwS, 0);
                if (Td.this.lEs != null) {
                    Td.this.lEs.Td();
                }
                Td td = Td.this;
                td.EYQ(td.XPd);
            }

            @Override // com.bykv.vk.openvk.component.video.api.EYQ.InterfaceC0063EYQ
            public void mZx(com.bykv.vk.openvk.component.video.api.EYQ eyq) {
                Td.this.mZx.removeCallbacks(Td.this.KR);
                Td.this.mZx.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.video.nativevideo.Td.1.3
                    @Override // java.lang.Runnable
                    public void run() {
                        if (Td.this.Kbc != null && Td.this.Kbc.get() != null) {
                            Td.this.Kbc.get();
                        }
                        if (Td.this.IPb != null) {
                            Td.this.IPb.mZx();
                        }
                    }
                });
                if (!Td.this.Tnp) {
                    Td td = Td.this;
                    td.EYQ(td.XPd);
                }
                if (Td.this.lEs != null) {
                    Td.this.lEs.EYQ(Td.this.QQ(), Td.this.nWX());
                }
            }

            @Override // com.bykv.vk.openvk.component.video.api.EYQ.InterfaceC0063EYQ
            public void EYQ(com.bykv.vk.openvk.component.video.api.EYQ eyq, final com.bykv.vk.openvk.component.video.api.Td.EYQ eyq2) {
                pi.EYQ(Td.this.EYQ, "onError: " + eyq2.EYQ() + ", " + eyq2.mZx() + ", " + eyq2.Td());
                Td.this.mZx.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.video.nativevideo.Td.1.4
                    @Override // java.lang.Runnable
                    public void run() {
                        int iEYQ = eyq2.EYQ();
                        int iMZx = eyq2.mZx();
                        if (!Td.this.rfB() || iMZx == -1004) {
                            if (Td.this.Td(iEYQ, iMZx)) {
                                pi.EYQ(Td.this.EYQ, "Play video error，show result page、、、、、、、");
                                Td.this.IPb.EYQ2(Td.this.VwS, (WeakReference<Context>) null, false);
                                Td.this.Td(true);
                                Td.this.Pm();
                            }
                            if (Td.this.IPb != null) {
                                Td.this.IPb.mZx();
                            }
                            if (Td.this.rfB != null) {
                                Td.this.rfB.mZx(Td.this.tr, com.bykv.vk.openvk.component.video.EYQ.Kbd.EYQ.EYQ(Td.this.QQ, Td.this.xt));
                            }
                            if (Td.this.Kbc == null || Td.this.Kbc.get() == null || Td.this.rfB()) {
                                return;
                            }
                            ((Td.Pm) Td.this.Kbc.get()).EYQ(iEYQ, iMZx);
                        }
                    }
                });
                Td.this.EYQ(eyq2);
                com.bytedance.sdk.openadsdk.core.VwS.EYQ eyqZzY = Td.this.VwS.zzY();
                if (eyqZzY != null && eyqZzY.EYQ() != null) {
                    eyqZzY.EYQ().EYQ(com.bytedance.sdk.openadsdk.core.VwS.EYQ.EYQ.GENERAL_LINEAR_AD_ERROR);
                }
                com.bytedance.sdk.openadsdk.nWX.EYQ.Kbd.EYQ(Td.this.VwS, 6);
                if (Td.this.lEs != null) {
                    Td.this.lEs.EYQ(14);
                }
            }

            @Override // com.bykv.vk.openvk.component.video.api.EYQ.InterfaceC0063EYQ
            public void EYQ(com.bykv.vk.openvk.component.video.api.EYQ eyq, boolean z4) {
                Td.this.mZx.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.video.nativevideo.Td.1.5
                    @Override // java.lang.Runnable
                    public void run() {
                        if (Td.this.IPb != null) {
                            Td.this.IPb.mZx();
                        }
                    }
                });
            }

            @Override // com.bykv.vk.openvk.component.video.api.EYQ.InterfaceC0063EYQ
            public void EYQ(com.bykv.vk.openvk.component.video.api.EYQ eyq, int i, int i2) {
                QQ.EYQ().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.video.nativevideo.Td.1.6
                    @Override // java.lang.Runnable
                    public void run() {
                        Td.this.mN();
                    }
                });
            }

            @Override // com.bykv.vk.openvk.component.video.api.EYQ.InterfaceC0063EYQ
            public void EYQ(com.bykv.vk.openvk.component.video.api.EYQ eyq, int i, int i2, int i3) {
                Td.this.NZ = true;
                Td.this.mZx.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.video.nativevideo.Td.1.7
                    @Override // java.lang.Runnable
                    public void run() {
                        if (Td.this.IPb != null) {
                            Td.this.IPb.UB();
                            Td.this.mZx.postDelayed(Td.this.KR, RtspMediaSource.DEFAULT_TIMEOUT_MS);
                        }
                    }
                });
                com.bytedance.sdk.openadsdk.nWX.EYQ.Kbd.EYQ(Td.this.VwS, 2);
                if (Td.this.lEs != null) {
                    Td.this.lEs.EYQ(4);
                }
            }

            @Override // com.bykv.vk.openvk.component.video.api.EYQ.InterfaceC0063EYQ
            public void EYQ(com.bykv.vk.openvk.component.video.api.EYQ eyq, int i) {
                Td.this.NZ = false;
                Td.this.mZx.removeCallbacks(Td.this.KR);
                Td.this.mZx.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.video.nativevideo.Td.1.8
                    @Override // java.lang.Runnable
                    public void run() {
                        Td.this.IPb.mZx();
                    }
                });
                com.bytedance.sdk.openadsdk.nWX.EYQ.Kbd.EYQ(Td.this.VwS, 0);
                if (Td.this.lEs != null) {
                    Td.this.lEs.EYQ(5);
                }
            }

            @Override // com.bykv.vk.openvk.component.video.api.EYQ.InterfaceC0063EYQ
            public void EYQ(com.bykv.vk.openvk.component.video.api.EYQ eyq, final long j, final long j2) {
                if (Math.abs(j - Td.this.QQ) < 50) {
                    return;
                }
                Td td = Td.this;
                td.EYQ(td.XPd);
                Td.this.mZx.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.video.nativevideo.Td.1.9
                    @Override // java.lang.Runnable
                    public void run() {
                        Td.this.EYQ(j, j2);
                    }
                });
            }

            @Override // com.bykv.vk.openvk.component.video.api.EYQ.InterfaceC0063EYQ
            public void Pm(com.bykv.vk.openvk.component.video.api.EYQ eyq) {
                com.bytedance.sdk.openadsdk.core.VwS.EYQ eyqZzY = Td.this.VwS.zzY();
                if (eyqZzY != null && eyqZzY.EYQ() != null) {
                    eyqZzY.EYQ().mZx(Td.this.QQ);
                }
                com.bytedance.sdk.openadsdk.nWX.EYQ.Kbd.EYQ(Td.this.VwS, 3);
                if (Td.this.lEs != null) {
                    Td.this.lEs.EYQ(0);
                }
            }

            @Override // com.bykv.vk.openvk.component.video.api.EYQ.InterfaceC0063EYQ
            public void Kbd(com.bykv.vk.openvk.component.video.api.EYQ eyq) {
                com.bytedance.sdk.openadsdk.core.VwS.EYQ eyqZzY = Td.this.VwS.zzY();
                if (eyqZzY != null && eyqZzY.EYQ() != null) {
                    eyqZzY.EYQ().Td(Td.this.QQ);
                }
                if (Td.this.lEs != null) {
                    Td.this.lEs.EYQ(1);
                }
            }
        };
        this.wa = 0;
        this.KR = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.video.nativevideo.Td.4
            @Override // java.lang.Runnable
            public void run() {
                if (Td.this.IPb != null) {
                    Td.this.IPb.EYQ2(Td.this.VwS, (WeakReference<Context>) null, false);
                    Td.this.IPb.mZx();
                    Td.this.Td(true);
                    pi.EYQ(Td.this.EYQ, "Show result page after error.......showAdCard");
                }
            }
        };
        this.na = new NZ.EYQ() { // from class: com.bytedance.sdk.openadsdk.core.video.nativevideo.Td.6
            @Override // com.bytedance.sdk.component.utils.NZ.EYQ
            public void EYQ(Context context2, Intent intent, boolean z4, final int i) {
                xt.EYQ(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.video.nativevideo.Td.6.1
                    @Override // java.lang.Runnable
                    public void run() {
                        Td.this.Kbd(i);
                    }
                });
            }
        };
        this.OtA = false;
        this.TQF = hu.Td(context);
        EYQ(z);
        this.FtN = str;
        try {
            this.vD = viewGroup.getWidth();
            this.lRN = viewGroup.getHeight();
        } catch (Throwable unused) {
        }
        EYQ(context);
        this.Tnp = Build.VERSION.SDK_INT >= 17;
        this.PI = z2;
        this.kf = z3;
        if (vwS != null) {
            this.XPd = vwS;
        }
    }

    public IPb EYQ(View view, List<Pair<View, FriendlyObstructionPurpose>> list) {
        if (!this.VwS.oIw()) {
            return null;
        }
        if (this.lEs == null) {
            this.lEs = IPb.EYQ();
        }
        this.lEs.EYQ(view, this.VwS.zzY().nWX());
        if (list != null && list.size() > 0) {
            for (Pair<View, FriendlyObstructionPurpose> pair : list) {
                if (pair != null) {
                    this.lEs.EYQ((View) pair.first, pair.second == null ? FriendlyObstructionPurpose.OTHER : (FriendlyObstructionPurpose) pair.second);
                }
            }
        }
        return this.lEs;
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.EYQ.EYQ, com.bykv.vk.openvk.component.video.api.Pm.Td
    public void EYQ(Td.Pm pm) {
        this.Kbc = new WeakReference<>(pm);
    }

    @Override // com.bykv.vk.openvk.component.video.api.Pm.Td
    public boolean EYQ(com.bykv.vk.openvk.component.video.api.Td.Td td) {
        if (this.Kbd != null) {
            ApmHelper.reportCustomError("", "twice playVideoUrl", new IllegalStateException());
            return true;
        }
        if (TextUtils.isEmpty(td.pi())) {
            pi.EYQ(this.EYQ, "[video] play video stop , because no video info");
            return false;
        }
        Td(false);
        td.pi();
        mZx(td);
        Nvm();
        if (this.lEs != null) {
            this.lEs.EYQ(false, 0.0f);
        }
        if (!com.bytedance.sdk.openadsdk.core.nativeexpress.UB.mZx(this.FtN) || this.QQ <= 0) {
            this.QQ = td.VwS();
        }
        if (td.VwS() <= 0) {
            this.zF = false;
            this.hYh.set(false);
        } else {
            this.QQ = td.VwS();
            this.HX = Math.max(this.HX, this.QQ);
        }
        if (this.IPb != null) {
            this.IPb.EYQ();
            if (this.wa == 0) {
                this.IPb.VwS();
            }
            this.IPb.Td(td.Kbd(), td.IPb());
            this.IPb.Td(this.tPj);
            this.IPb.EYQ(td.Kbd(), td.IPb());
        }
        if (this.Kbd == null) {
            this.Kbd = new com.bytedance.sdk.openadsdk.core.video.Td.Pm();
            this.Kbd.EYQ(this.wJ);
        }
        hYh();
        this.tr = 0L;
        try {
            Td(td);
            return true;
        } catch (Exception e) {
            pi.EYQ(this.EYQ, "[video] invoke NativeVideoController#playVideo cause exception :".concat(String.valueOf(e)));
            return false;
        }
    }

    private void Td(com.bykv.vk.openvk.component.video.api.Td.Td td) {
        td.Td(0);
        this.Kbd.EYQ(td);
        this.FH = System.currentTimeMillis();
        this.IPb.Td(8);
        this.IPb.Td(0);
        EYQ(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.video.nativevideo.Td.3
            @Override // java.lang.Runnable
            public void run() {
                if (Td.this.Kbd == null) {
                    return;
                }
                Td.this.FH = System.currentTimeMillis();
                Td.this.IPb.Pm(0);
                Td.this.Kbd.EYQ(true, Td.this.QQ, Td.this.KO);
            }
        });
        if (this.nWX) {
            Uc();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void PI() {
        this.wa++;
        if (this.IPb == null) {
            return;
        }
        this.IPb.mZx();
        if (this.rfB != null) {
            this.rfB.EYQ(this.tr, com.bykv.vk.openvk.component.video.EYQ.Kbd.EYQ.EYQ(this.QQ, this.xt));
        }
        this.tr = System.currentTimeMillis() - this.FH;
        if (this.mN) {
            this.IPb.EYQ2(this.VwS, (WeakReference<Context>) null, true);
        }
        if (!this.zF) {
            this.zF = true;
            EYQ(this.xt, this.xt);
            long j = this.xt;
            this.QQ = j;
            this.HX = j;
            mZx(this.XPd);
        }
        if (!this.nWX && this.Uc) {
            Kbd(this.IPb, null);
        }
        this.pi = true;
    }

    @Override // com.bykv.vk.openvk.component.video.api.Pm.Td
    public void mZx() {
        if (this.IPb != null) {
            this.IPb.EYQ();
        }
        if (this.IPb != null) {
            this.IPb.Uc();
        }
        kf();
    }

    public void QQ(boolean z) {
        if (this.IPb != null) {
            this.IPb.EYQ();
        }
        if (this.IPb != null && z) {
            this.IPb.Uc();
        }
        kf();
    }

    private void kf() {
        Boolean.valueOf(this.tsL);
        if (this.Kbd != null) {
            if (this.Kbd.VwS()) {
                if (this.tsL) {
                    WU();
                } else {
                    mZx(this.Nvm);
                }
                Boolean.valueOf(this.tsL);
            } else {
                this.Kbd.EYQ(false, this.QQ, this.KO);
            }
        }
        if (this.hYh.get()) {
            lEs();
        }
    }

    @Override // com.bykv.vk.openvk.component.video.api.Pm.Td
    public void Td() {
        EYQ(true, 3);
    }

    @Override // com.bykv.vk.openvk.component.video.api.Pm.Td
    public void EYQ(boolean z, int i) {
        if (!this.zF && this.hYh.get()) {
            if (z) {
                KO.EYQ eyq = new KO.EYQ();
                eyq.EYQ(Kbd());
                eyq.Td(QQ());
                eyq.mZx(IPb());
                eyq.Td(i);
                eyq.Pm(VwS());
                com.bytedance.sdk.openadsdk.mZx.Pm.EYQ.EYQ.EYQ(this.IPb, eyq, this.XPd);
                this.zF = false;
            } else {
                xt();
            }
        }
        Pm();
        if (this.lEs != null) {
            this.lEs.Pm();
        }
    }

    @Override // com.bykv.vk.openvk.component.video.api.Pm.Td
    public void Pm() {
        if (this.Kbd != null) {
            this.Kbd.tsL();
            this.Kbd = null;
        }
        if (this.mN) {
            if (!"embeded_ad".equals(this.FtN)) {
                this.IPb.EYQ2(this.VwS, (WeakReference<Context>) null, true);
            } else {
                this.IPb.zF();
            }
            this.mZx.removeCallbacksAndMessages(null);
            this.MxO.clear();
            if (this.nWX) {
                Tnp();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mN() {
        int i;
        int i2;
        try {
            if (Kbc() != null && this.Kbd != null && this.tPj != null) {
                int iPm = this.Kbd.Pm();
                int iKbd = this.Kbd.Kbd();
                final int width = this.tPj.getWidth();
                final int height = this.tPj.getHeight();
                if (width > 0 && height > 0 && iKbd > 0 && iPm > 0) {
                    if (iPm == iKbd) {
                        i2 = width > height ? height : width;
                        i = i2;
                    } else if (iPm > iKbd) {
                        i2 = (int) ((width * 1.0d) / ((iPm * 1.0f) / iKbd));
                        i = width;
                    } else {
                        i = (int) ((height * 1.0d) / ((iKbd * 1.0f) / iPm));
                        i2 = height;
                    }
                    if (i2 <= height && i2 > 0) {
                        height = i2;
                    }
                    if (i <= width && i > 0) {
                        width = i;
                    }
                    this.mZx.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.video.nativevideo.Td.5
                        @Override // java.lang.Runnable
                        public void run() {
                            try {
                                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(width, height);
                                layoutParams.addRule(13);
                                if (Td.this.Kbc() instanceof TextureView) {
                                    ((TextureView) Td.this.Kbc()).setLayoutParams(layoutParams);
                                    String unused = Td.this.EYQ;
                                } else if (Td.this.Kbc() instanceof SurfaceView) {
                                    ((SurfaceView) Td.this.Kbc()).setLayoutParams(layoutParams);
                                    String unused2 = Td.this.EYQ;
                                }
                            } catch (Throwable unused3) {
                                String unused4 = Td.this.EYQ;
                            }
                        }
                    });
                    return;
                }
                return;
            }
            Objects.toString(this.tp);
            Objects.toString(Kbc());
            com.bytedance.sdk.openadsdk.core.video.Td.Pm pm = this.Kbd;
            com.bytedance.sdk.openadsdk.core.video.Td.Pm pm2 = this.Kbd;
        } catch (Throwable th) {
            th.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.bykv.vk.openvk.component.video.api.renderview.mZx Kbc() {
        if (this.tp.getResources().getConfiguration().orientation != 1 || this.IPb == null) {
            return null;
        }
        return this.IPb.pi();
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
            QQ(false);
            if (this.IPb != null) {
                this.IPb.mZx(false, false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void EYQ(long j, long j2) {
        this.VwS.Td(j);
        this.QQ = j;
        this.xt = j2;
        this.IPb.EYQ(j, j2);
        this.IPb.EYQ(com.bykv.vk.openvk.component.video.EYQ.Kbd.EYQ.EYQ(j, j2));
        try {
            if (this.rfB != null) {
                this.rfB.EYQ(j, j2);
            }
        } catch (Throwable th) {
            pi.EYQ(this.EYQ, "onProgressUpdate error: ", th);
        }
        com.bytedance.sdk.openadsdk.core.VwS.EYQ eyqZzY = this.VwS.zzY();
        if (eyqZzY == null || eyqZzY.EYQ() == null) {
            return;
        }
        eyqZzY.EYQ().EYQ(j, j2, this.lEs);
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.EYQ.EYQ
    public void EYQ(com.bykv.vk.openvk.component.video.api.Pm.mZx mzx, View view, boolean z) {
        IPb(!this.Uc);
        if (this.tp instanceof Activity) {
            if (this.IPb != null) {
                this.IPb.mZx(this.tPj);
                this.IPb.Td(false);
            }
            EYQ(1);
            Td.mZx mzx2 = this.wBa != null ? this.wBa.get() : null;
            if (mzx2 != null) {
                mzx2.EYQ(this.Uc);
            }
        }
    }

    private boolean mZx(int i, int i2) {
        if (i2 == 0) {
            EYQ();
            this.hu = true;
            if (this.IPb != null) {
                this.IPb.EYQ2(this.VwS, (WeakReference<Context>) null, false);
            }
        }
        if (i2 != 4 && i2 != 0) {
            if (this.IPb != null) {
                this.IPb.EYQ();
            }
            EYQ();
            this.hu = true;
            this.UB = false;
            if (this.IPb != null) {
                return this.IPb.EYQ(i, this.VwS.mN(), this.kf);
            }
        } else if (i2 == 4) {
            this.hu = false;
            if (this.IPb != null) {
                this.IPb.KO();
            }
        }
        return true;
    }

    private void Pm(int i) {
        if (this.TQF == i) {
            return;
        }
        this.TQF = i;
        if (i != 4 && i != 0) {
            this.UB = false;
        }
        if (!this.UB && !KO() && this.PI) {
            mZx(2, i);
        }
        WeakReference<EYQ> weakReference = this.Pf;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.Pf.get().EYQ(this.TQF);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Kbd(int i) {
        Pm(i);
        if (i == 4) {
            this.hu = false;
        }
    }

    public void Td(int i) {
        Pm(i);
        if (i == 4) {
            this.hu = false;
            mZx();
        }
    }

    public void Uc() {
        if (this.OtA || !this.WU) {
            return;
        }
        Context applicationContext = com.bytedance.sdk.openadsdk.core.hu.EYQ().getApplicationContext();
        this.OtA = true;
        NZ.EYQ(this.na, applicationContext);
    }

    public void Tnp() {
        if (this.OtA && this.WU) {
            this.OtA = false;
            NZ.EYQ(this.na);
        }
    }

    public void EYQ(EYQ eyq) {
        this.Pf = new WeakReference<>(eyq);
    }

    public void FtN() {
        if (this.lEs != null) {
            this.lEs.EYQ(13);
        }
    }
}
