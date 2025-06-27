package com.bytedance.sdk.openadsdk.activity;

import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.View;
import com.bykv.vk.openvk.component.video.api.Pm.Td;
import com.bytedance.sdk.component.VwS.QQ;
import com.bytedance.sdk.component.utils.pi;
import com.bytedance.sdk.openadsdk.apiImpl.mZx.mZx;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.component.reward.view.FullRewardExpressView;
import com.bytedance.sdk.openadsdk.core.hYh;
import com.bytedance.sdk.openadsdk.core.hu;
import com.bytedance.sdk.openadsdk.core.model.KO;
import com.bytedance.sdk.openadsdk.core.model.UB;
import com.bytedance.sdk.openadsdk.core.zF;
import com.bytedance.sdk.openadsdk.mZx.Pm.EYQ.EYQ;
import com.bytedance.sdk.openadsdk.mZx.Pm.mZx.KO;
import com.bytedance.sdk.openadsdk.mZx.VwS;
import com.bytedance.sdk.openadsdk.nWX.EYQ.Kbd;
import com.bytedance.sdk.openadsdk.utils.xt;
import com.google.android.gms.nearby.messages.Strategy;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;

/* loaded from: classes2.dex */
public class TTFullScreenVideoActivity extends TTBaseVideoActivity {
    private static mZx pi;
    private boolean nWX;
    private mZx tsL;

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public boolean KO() {
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.Td.mZx
    public void Td(int i) {
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        pi = this.tsL;
        super.onSaveInstanceState(bundle);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    protected void onResume() throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException {
        FullRewardExpressView fullRewardExpressViewEYQ;
        super.onResume();
        if (this.mZx == null || (fullRewardExpressViewEYQ = this.mZx.mN.EYQ()) == null) {
            return;
        }
        fullRewardExpressViewEYQ.setJsbLandingPageOpenListener(new com.bytedance.sdk.openadsdk.core.widget.mZx() { // from class: com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.1
            @Override // com.bytedance.sdk.openadsdk.core.widget.mZx
            public void EYQ() {
                TTFullScreenVideoActivity.this.zF();
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (this.mZx == null || UB.Kbd(this.mZx.EYQ)) {
            return;
        }
        com.bykv.vk.openvk.component.video.api.Td.mZx mzxMN = this.mZx.EYQ.mN();
        if (mzxMN == null) {
            com.bykv.vk.openvk.component.video.api.Td.mZx mzx = new com.bykv.vk.openvk.component.video.api.Td.mZx();
            mzx.EYQ(10.0d);
            this.mZx.EYQ.EYQ(mzx);
        } else if (mzxMN.IPb() <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            mzxMN.EYQ(10.0d);
        }
    }

    private void EYQ(final String str) {
        xt.Td(new QQ("FullScreen_executeMultiProcessCallback") { // from class: com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    TTFullScreenVideoActivity.this.EYQ(1).executeFullVideoCallback(TTFullScreenVideoActivity.this.mZx.Td, str);
                } catch (Throwable th) {
                    pi.EYQ("TTAD.FSVA", "fullscreen_interstitial_ad", "executeFullVideoCallback execute throw Exception : ", th);
                }
            }
        }, 5);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    protected void EYQ(Intent intent) {
        super.EYQ(intent);
        this.mZx.UB = intent.getBooleanExtra("is_verity_playable", false);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.core.video.Td.mZx
    public void EYQ(Bundle bundle) {
        if (!com.bytedance.sdk.openadsdk.multipro.mZx.Td()) {
            this.tsL = zF.EYQ().Pm();
        }
        if (this.tsL != null || bundle == null) {
            return;
        }
        this.tsL = pi;
        pi = null;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    protected void nWX() {
        View viewTp = this.mZx.TQF.tp();
        if (viewTp != null) {
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.3
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (TTFullScreenVideoActivity.this.mZx.wJ.NZ() && TTFullScreenVideoActivity.this.mZx.WU.get()) {
                        TTFullScreenVideoActivity.this.mZx.wJ.FtN();
                        TTFullScreenVideoActivity.this.mZx.TQF.IPb(8);
                        TTFullScreenVideoActivity.this.mZx.Nuq.sendEmptyMessageDelayed(600, 5000L);
                        return;
                    }
                    boolean zKbd = false;
                    if (TTFullScreenVideoActivity.this.mZx.EYQ.baW()) {
                        if (TTFullScreenVideoActivity.this.mZx.EYQ.oIw()) {
                            if (TTFullScreenVideoActivity.this.mZx.na != null) {
                                TTFullScreenVideoActivity.this.mZx.EYQ.tr(2);
                                zKbd = TTFullScreenVideoActivity.this.mZx.na.Kbd();
                            }
                        } else if (TTFullScreenVideoActivity.this.mZx.EYQ.CE() == 0 && !TTFullScreenVideoActivity.this.mZx.wJ.KO()) {
                            TTFullScreenVideoActivity.this.mZx.EYQ.tr(11);
                            if (TTFullScreenVideoActivity.this.mZx.wJ.Pm()) {
                                TTFullScreenVideoActivity.this.mZx.EYQ.tr(12);
                            }
                            try {
                                TTFullScreenVideoActivity.this.mZx.TQF.UB();
                                zKbd = true;
                            } catch (Exception unused) {
                            }
                        }
                    }
                    if (zKbd) {
                        return;
                    }
                    TTFullScreenVideoActivity.this.mZx.wJ.tPj();
                    TTFullScreenVideoActivity.this.mZx.wa.HX();
                    TTFullScreenVideoActivity.this.mZx.Pf.IPb();
                    TTFullScreenVideoActivity.this.finish();
                }
            };
            viewTp.setOnClickListener(onClickListener);
            viewTp.setTag(viewTp.getId(), onClickListener);
        }
        this.mZx.KR.EYQ(new com.bytedance.sdk.openadsdk.component.reward.top.mZx() { // from class: com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.4
            @Override // com.bytedance.sdk.openadsdk.component.reward.top.mZx
            public void EYQ(View view) {
                if (com.bytedance.sdk.openadsdk.core.model.zF.Td(TTFullScreenVideoActivity.this.mZx.EYQ) && (com.bytedance.sdk.openadsdk.core.model.zF.MxO(TTFullScreenVideoActivity.this.mZx.EYQ) || TTFullScreenVideoActivity.this.mZx.WU.get())) {
                    if (TTFullScreenVideoActivity.this.mZx.kf.hYh()) {
                        TTFullScreenVideoActivity.this.mZx.kf.mZx(5);
                        return;
                    } else {
                        TTFullScreenVideoActivity.this.mZx.wJ.VwS();
                        return;
                    }
                }
                if (com.bytedance.sdk.openadsdk.core.model.zF.MxO(TTFullScreenVideoActivity.this.mZx.EYQ) || (KO.EYQ(TTFullScreenVideoActivity.this.mZx.EYQ) && !TTFullScreenVideoActivity.this.mZx.lEs.get())) {
                    if (!com.bytedance.sdk.openadsdk.core.model.zF.Td(TTFullScreenVideoActivity.this.mZx.EYQ) && TTFullScreenVideoActivity.this.mZx.kf.hYh()) {
                        TTFullScreenVideoActivity.this.mZx.kf.mZx(4);
                    }
                    TTFullScreenVideoActivity.this.finish();
                    return;
                }
                if (TTFullScreenVideoActivity.this.mZx.EYQ.oy()) {
                    if (TTFullScreenVideoActivity.this.mZx.TQF.MxO() != null) {
                        TTFullScreenVideoActivity.this.mZx.EYQ.tr(2);
                        TTFullScreenVideoActivity.this.mZx.TQF.UB();
                        return;
                    }
                    return;
                }
                if (!TTFullScreenVideoActivity.this.mZx.mZx && TTFullScreenVideoActivity.this.mZx.EYQ.baW() && !TTFullScreenVideoActivity.this.mZx.EYQ.oIw()) {
                    TTFullScreenVideoActivity.this.mZx.EYQ.tr(13);
                    try {
                        TTFullScreenVideoActivity.this.mZx.TQF.UB();
                        return;
                    } catch (Exception unused) {
                    }
                }
                KO.EYQ eyq = new KO.EYQ();
                eyq.EYQ(TTFullScreenVideoActivity.this.mZx.FtN.VwS());
                eyq.Td(TTFullScreenVideoActivity.this.mZx.FtN.hYh());
                eyq.mZx(TTFullScreenVideoActivity.this.mZx.FtN.MxO());
                eyq.Td(3);
                eyq.Pm(TTFullScreenVideoActivity.this.mZx.FtN.Uc());
                EYQ.EYQ(TTFullScreenVideoActivity.this.mZx.FtN.Td(), eyq, TTFullScreenVideoActivity.this.mZx.FtN.EYQ());
                hYh.Td(TTFullScreenVideoActivity.this.mZx.KO);
                TTFullScreenVideoActivity.this.mZx.FtN.EYQ("skip");
                TTFullScreenVideoActivity.this.mZx.KR.Pm(false);
                if (TTFullScreenVideoActivity.this.mZx.mZx) {
                    TTFullScreenVideoActivity.this.EYQ(true, 4);
                } else {
                    TTFullScreenVideoActivity.this.finish();
                }
                if (TTFullScreenVideoActivity.this.mZx.EYQ != null && TTFullScreenVideoActivity.this.mZx.EYQ.zzY() != null && TTFullScreenVideoActivity.this.mZx.FtN != null) {
                    TTFullScreenVideoActivity.this.mZx.EYQ.zzY().EYQ().IPb(TTFullScreenVideoActivity.this.mZx.FtN.VwS());
                    TTFullScreenVideoActivity.this.mZx.EYQ.zzY().EYQ().Kbd(TTFullScreenVideoActivity.this.mZx.FtN.VwS());
                }
                Kbd.EYQ(TTFullScreenVideoActivity.this.mZx.EYQ, 5);
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.mZx
            public void mZx(View view) {
                TTFullScreenVideoActivity.this.mZx.Pm = !TTFullScreenVideoActivity.this.mZx.Pm;
                if (TTFullScreenVideoActivity.this.Td != null && TTFullScreenVideoActivity.this.Td.Pm() != null) {
                    TTFullScreenVideoActivity.this.Td.Pm().EYQ(TTFullScreenVideoActivity.this.mZx.Pm);
                }
                TTFullScreenVideoActivity.this.mZx.FtN.mZx(TTFullScreenVideoActivity.this.mZx.Pm);
                if (!com.bytedance.sdk.openadsdk.core.model.zF.tsL(TTFullScreenVideoActivity.this.mZx.EYQ) || TTFullScreenVideoActivity.this.mZx.WU.get()) {
                    if (com.bytedance.sdk.openadsdk.core.model.zF.mZx(TTFullScreenVideoActivity.this.mZx.EYQ)) {
                        TTFullScreenVideoActivity.this.mZx.XPd.EYQ(TTFullScreenVideoActivity.this.mZx.Pm, true);
                    }
                    TTFullScreenVideoActivity.this.mZx.wJ.Pm(TTFullScreenVideoActivity.this.mZx.Pm);
                    if (TTFullScreenVideoActivity.this.mZx.EYQ == null || TTFullScreenVideoActivity.this.mZx.EYQ.zzY() == null || TTFullScreenVideoActivity.this.mZx.EYQ.zzY().EYQ() == null || TTFullScreenVideoActivity.this.mZx.FtN == null) {
                        return;
                    }
                    if (TTFullScreenVideoActivity.this.mZx.Pm) {
                        TTFullScreenVideoActivity.this.mZx.EYQ.zzY().EYQ().QQ(TTFullScreenVideoActivity.this.mZx.FtN.VwS());
                    } else {
                        TTFullScreenVideoActivity.this.mZx.EYQ.zzY().EYQ().HX(TTFullScreenVideoActivity.this.mZx.FtN.VwS());
                    }
                }
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.mZx
            public void Td(View view) {
                TTFullScreenVideoActivity.this.mZx.lRN.EYQ(TTFullScreenVideoActivity.this.Td);
            }
        });
    }

    public boolean EYQ(long j, boolean z) {
        VwS vwS = new VwS();
        vwS.EYQ(System.currentTimeMillis(), 1.0f);
        if (this.Td != null && (this.Td instanceof com.bytedance.sdk.openadsdk.component.reward.mZx.QQ)) {
            this.mZx.FtN.EYQ(((com.bytedance.sdk.openadsdk.component.reward.mZx.QQ) this.Td).FH(), vwS);
        } else {
            this.mZx.FtN.EYQ(this.mZx.TQF.IPb(), vwS);
        }
        Td.EYQ eyq = new Td.EYQ() { // from class: com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity.5
            boolean EYQ;

            @Override // com.bykv.vk.openvk.component.video.api.Pm.Td.EYQ
            public void EYQ(long j2, int i) {
                if (this.EYQ) {
                    return;
                }
                this.EYQ = true;
                TTFullScreenVideoActivity.this.Pm.removeMessages(Strategy.TTL_SECONDS_DEFAULT);
                TTFullScreenVideoActivity.this.pi();
                TTFullScreenVideoActivity.this.mZx.FH.set(true);
                if (TTFullScreenVideoActivity.this.mZx.EYQ.jv()) {
                    TTFullScreenVideoActivity.this.mZx.EYQ.tr(1);
                    TTFullScreenVideoActivity.this.mZx.TQF.UB();
                }
                if (TTFullScreenVideoActivity.this.mZx.EYQ.nWX() == 21 && !TTFullScreenVideoActivity.this.mZx.EYQ.Td()) {
                    TTFullScreenVideoActivity.this.mZx.EYQ.mZx(true);
                    TTFullScreenVideoActivity.this.mZx.TQF.UB();
                }
                if (TTFullScreenVideoActivity.this.mZx.mZx) {
                    TTFullScreenVideoActivity.this.EYQ(false, 5);
                } else {
                    TTFullScreenVideoActivity.this.finish();
                }
            }

            @Override // com.bykv.vk.openvk.component.video.api.Pm.Td.EYQ
            public void mZx(long j2, int i) {
                TTFullScreenVideoActivity.this.Pm.removeMessages(Strategy.TTL_SECONDS_DEFAULT);
                if (TTFullScreenVideoActivity.this.mZx.FtN.mZx()) {
                    TTFullScreenVideoActivity.this.tsL();
                    return;
                }
                TTFullScreenVideoActivity.this.mZx.FtN.pi();
                pi.EYQ("TTAD.FSVA", "fullscreen_interstitial_ad", "onError、、、、、、、、");
                if (TTFullScreenVideoActivity.this.mZx.mZx) {
                    TTFullScreenVideoActivity.this.EYQ(false, true, 3);
                    TTFullScreenVideoActivity.this.mZx.FtN.EYQ(!TTFullScreenVideoActivity.this.mZx.FtN.rfB() ? 1 : 0, 2);
                } else {
                    TTFullScreenVideoActivity.this.finish();
                }
            }

            @Override // com.bykv.vk.openvk.component.video.api.Pm.Td.EYQ
            public void EYQ() {
                TTFullScreenVideoActivity.this.Pm.removeMessages(Strategy.TTL_SECONDS_DEFAULT);
                TTFullScreenVideoActivity.this.pi();
                if (TTFullScreenVideoActivity.this.mZx.mZx) {
                    TTFullScreenVideoActivity.this.EYQ(false, true, 6);
                } else {
                    TTFullScreenVideoActivity.this.finish();
                }
                TTFullScreenVideoActivity.this.mZx.FtN.EYQ(!TTFullScreenVideoActivity.this.mZx.FtN.rfB() ? 1 : 0, 1 ^ (TTFullScreenVideoActivity.this.mZx.FtN.rfB() ? 1 : 0));
                TTFullScreenVideoActivity.this.mZx.FtN.pi();
            }

            @Override // com.bykv.vk.openvk.component.video.api.Pm.Td.EYQ
            public void EYQ(long j2, long j3) {
                if (!TTFullScreenVideoActivity.this.mZx.Kbd && TTFullScreenVideoActivity.this.mZx.FtN.mZx()) {
                    TTFullScreenVideoActivity.this.mZx.FtN.KO();
                }
                if (TTFullScreenVideoActivity.this.mZx.WU.get()) {
                    return;
                }
                TTFullScreenVideoActivity.this.Pm.removeMessages(Strategy.TTL_SECONDS_DEFAULT);
                if (j2 != TTFullScreenVideoActivity.this.mZx.FtN.QQ()) {
                    TTFullScreenVideoActivity.this.pi();
                }
                TTFullScreenVideoActivity.this.mZx.FtN.EYQ(j2, j3);
                TTFullScreenVideoActivity tTFullScreenVideoActivity = TTFullScreenVideoActivity.this;
                long j4 = j2 / 1000;
                tTFullScreenVideoActivity.IPb = (int) (tTFullScreenVideoActivity.mZx.FtN.lEs() - j4);
                int i = (int) j4;
                if ((TTFullScreenVideoActivity.this.mZx.tr.get() || TTFullScreenVideoActivity.this.mZx.XN.get()) && TTFullScreenVideoActivity.this.mZx.FtN.mZx()) {
                    TTFullScreenVideoActivity.this.mZx.FtN.KO();
                }
                TTFullScreenVideoActivity.this.mZx(i);
                if (TTFullScreenVideoActivity.this.IPb >= 0) {
                    TTFullScreenVideoActivity.this.mZx.KR.EYQ(String.valueOf(TTFullScreenVideoActivity.this.IPb), null);
                }
            }
        };
        this.mZx.FtN.EYQ(eyq);
        if (this.mZx.TQF.KO != null) {
            this.mZx.TQF.KO.EYQ(eyq);
        }
        return this.mZx.FtN.EYQ(j, z, null, this.Td);
    }

    protected void mZx(int i) {
        int iUB = hu.Pm().UB(String.valueOf(this.mZx.KO));
        if (iUB < 0) {
            iUB = 5;
        }
        if (!hu.Pm().IPb(String.valueOf(this.mZx.KO)) || (!UB.Kbd(this.mZx.EYQ) && !this.mZx.mZx)) {
            if (i >= iUB) {
                if (!this.mZx.hu) {
                    this.mZx.EYQ(true);
                }
                EYQ();
                return;
            }
            return;
        }
        if (!this.mZx.hu) {
            this.mZx.EYQ(true);
        }
        if (i <= iUB) {
            Pm(iUB - i);
            this.mZx.KR.Kbd(false);
        } else {
            EYQ();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    protected void EYQ() {
        if (!UB.Kbd(this.mZx.EYQ) && !this.mZx.mZx) {
            this.mZx.KR.EYQ(null, "X");
        } else {
            this.mZx.KR.EYQ(null, TTAdDislikeToast.getSkipText());
        }
        this.mZx.KR.Kbd(true);
    }

    private void Pm(int i) {
        this.mZx.KR.EYQ(null, new SpannableStringBuilder(String.format(com.bytedance.sdk.component.utils.zF.EYQ(hu.EYQ(), "tt_skip_ad_time_text"), Integer.valueOf(i))));
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.Td.mZx
    public void Uc() {
        if (this.mZx.EYQ.CsQ() != 100.0f) {
            this.nWX = true;
        }
        zF();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    protected void QQ() {
        if (com.bytedance.sdk.openadsdk.multipro.mZx.Td()) {
            EYQ("onAdShow");
        } else {
            mZx mzx = this.tsL;
            if (mzx != null) {
                mzx.EYQ();
            }
        }
        if (hu()) {
            this.mZx.mN.tp();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.Td.mZx
    public void hYh() {
        zF();
        this.mZx.EYQ.WD();
        this.mZx.EYQ.EYQ(true);
        if (UB.Kbd(this.mZx.EYQ)) {
            com.bytedance.sdk.openadsdk.mZx.Td.mZx(this.mZx.EYQ, this.mZx.VwS, this.mZx.EYQ.Qh());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zF() {
        com.bytedance.sdk.openadsdk.utils.UB.EYQ("BVA", "invoke callback onAdClicked, ".concat(String.valueOf(this)));
        if (com.bytedance.sdk.openadsdk.multipro.mZx.Td()) {
            EYQ("onAdVideoBarClick");
            return;
        }
        mZx mzx = this.tsL;
        if (mzx != null) {
            mzx.onAdClicked();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void finish() {
        if (this.mZx != null) {
            this.mZx.kf.mZx(this.mZx.UB);
        }
        try {
            WU();
        } catch (Exception unused) {
        }
        super.finish();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        WU();
        if (com.bytedance.sdk.openadsdk.multipro.mZx.Td()) {
            EYQ("recycleRes");
        }
        this.tsL = null;
    }

    protected void finalize() throws Throwable {
        super.finalize();
        pi = null;
    }

    private void WU() {
        if (this.QQ) {
            return;
        }
        this.QQ = true;
        com.bytedance.sdk.openadsdk.utils.UB.EYQ("BVA", "invoke callback onAdClose, ".concat(String.valueOf(this)));
        if (com.bytedance.sdk.openadsdk.multipro.mZx.Td()) {
            EYQ("onAdClose");
            return;
        }
        mZx mzx = this.tsL;
        if (mzx != null) {
            mzx.mZx();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, android.app.Activity
    protected void onStop() {
        super.onStop();
        if (this.mZx == null || !mZx(this.mZx.EYQ) || EYQ(this.mZx.EYQ)) {
            return;
        }
        if (this.nWX) {
            this.nWX = false;
            finish();
        } else if (this.mZx.wJ.FH()) {
            finish();
        }
    }

    private boolean EYQ(UB ub) {
        return ub == null || ub.CsQ() == 100.0f;
    }

    private boolean mZx(UB ub) {
        if (ub == null) {
            return false;
        }
        return hu.Pm().Uc(String.valueOf(this.mZx.KO));
    }
}
