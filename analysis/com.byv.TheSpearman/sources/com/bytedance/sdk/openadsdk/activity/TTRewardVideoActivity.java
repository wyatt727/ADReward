package com.bytedance.sdk.openadsdk.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.bykv.vk.openvk.component.video.api.Pm.Td;
import com.bytedance.sdk.component.VwS.QQ;
import com.bytedance.sdk.component.utils.pi;
import com.bytedance.sdk.component.utils.zF;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.apiImpl.Pm.EYQ;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.component.reward.view.FullRewardExpressView;
import com.bytedance.sdk.openadsdk.core.UB;
import com.bytedance.sdk.openadsdk.core.Uc;
import com.bytedance.sdk.openadsdk.core.hu;
import com.bytedance.sdk.openadsdk.core.model.KO;
import com.bytedance.sdk.openadsdk.core.widget.EYQ;
import com.bytedance.sdk.openadsdk.core.widget.mZx;
import com.bytedance.sdk.openadsdk.mZx.VwS;
import com.bytedance.sdk.openadsdk.utils.FH;
import com.bytedance.sdk.openadsdk.utils.UB;
import com.bytedance.sdk.openadsdk.utils.hYh;
import com.bytedance.sdk.openadsdk.utils.xt;
import com.google.android.gms.nearby.messages.Strategy;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class TTRewardVideoActivity extends TTBaseVideoActivity {
    private static String KO;
    private static String UB;
    private static String Uc;
    private static EYQ XN;
    private static String hYh;
    private static String hu;
    private String WU;
    protected EYQ nWX;
    protected int pi;
    protected int tsL;
    private boolean wBa;
    private String zF;
    private final AtomicBoolean NZ = new AtomicBoolean(false);
    private int tPj = -1;

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public boolean KO() {
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        XN = this.nWX;
        if (this.NZ.get() && this.mZx != null) {
            this.mZx.EYQ.Db();
        }
        super.onSaveInstanceState(bundle);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            if (KO == null) {
                KO = zF.EYQ(this, "tt_reward_msg");
                hu = zF.EYQ(this, "tt_msgPlayable");
                UB = zF.EYQ(this, "tt_negtiveBtnBtnText");
                Uc = zF.EYQ(this, "tt_postiveBtnText");
                hYh = zF.EYQ(this, "tt_postiveBtnTextPlayable");
            }
        } catch (Throwable th) {
            pi.EYQ("TTAD.RVA", th.getMessage());
        }
        if (bundle == null || this.mZx == null || !this.mZx.EYQ.Zv()) {
            return;
        }
        this.NZ.set(true);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    protected void onResume() throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException {
        FullRewardExpressView fullRewardExpressViewEYQ;
        super.onResume();
        if (this.mZx == null || (fullRewardExpressViewEYQ = this.mZx.mN.EYQ()) == null) {
            return;
        }
        fullRewardExpressViewEYQ.setJsbLandingPageOpenListener(new mZx() { // from class: com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.1
            @Override // com.bytedance.sdk.openadsdk.core.widget.mZx
            public void EYQ() {
                TTRewardVideoActivity.this.XN();
            }
        });
    }

    protected void EYQ(String str) {
        EYQ(str, false, 0, "", 0, "");
    }

    protected void finalize() throws Throwable {
        super.finalize();
        XN = null;
    }

    private void EYQ(final String str, final boolean z, final int i, final String str2, final int i2, final String str3) {
        xt.Td(new QQ("Reward_executeMultiProcessCallback") { // from class: com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    TTRewardVideoActivity.this.EYQ(0).executeRewardVideoCallback(TTRewardVideoActivity.this.mZx.Td, str, z, i, str2, i2, str3);
                } catch (Throwable th) {
                    pi.EYQ("TTAD.RVA", "rewarded_video", "executeRewardVideoCallback execute throw Exception : ", th);
                }
            }
        }, 5);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.core.video.Td.mZx
    public void EYQ(Bundle bundle) {
        if (!com.bytedance.sdk.openadsdk.multipro.mZx.Td()) {
            this.nWX = com.bytedance.sdk.openadsdk.core.zF.EYQ().Td();
        }
        if (this.nWX != null || bundle == null) {
            return;
        }
        this.nWX = XN;
        XN = null;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    protected void EYQ() {
        this.mZx.KR.EYQ(null, TTAdDislikeToast.getSkipText());
        this.mZx.KR.Kbd(true);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    protected void nWX() {
        View viewTp = this.mZx.TQF.tp();
        if (viewTp != null) {
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.3
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (TTRewardVideoActivity.this.mZx.wJ.NZ() && TTRewardVideoActivity.this.mZx.WU.get()) {
                        TTRewardVideoActivity.this.mZx.wJ.FtN();
                        TTRewardVideoActivity.this.mZx.TQF.IPb(8);
                        TTRewardVideoActivity.this.mZx.Nuq.sendEmptyMessageDelayed(600, 5000L);
                        return;
                    }
                    boolean zKbd = false;
                    if (TTRewardVideoActivity.this.mZx.EYQ.baW()) {
                        if (TTRewardVideoActivity.this.mZx.EYQ.oIw()) {
                            if (TTRewardVideoActivity.this.mZx.na != null) {
                                TTRewardVideoActivity.this.mZx.EYQ.tr(2);
                                zKbd = TTRewardVideoActivity.this.mZx.na.Kbd();
                            }
                        } else if (TTRewardVideoActivity.this.mZx.EYQ.CE() == 0 && !TTRewardVideoActivity.this.mZx.wJ.KO()) {
                            TTRewardVideoActivity.this.mZx.EYQ.tr(11);
                            if (TTRewardVideoActivity.this.mZx.wJ.Pm()) {
                                TTRewardVideoActivity.this.mZx.EYQ.tr(12);
                            }
                            try {
                                TTRewardVideoActivity.this.mZx.TQF.UB();
                                zKbd = true;
                            } catch (Exception unused) {
                            }
                        }
                    }
                    if (zKbd) {
                        return;
                    }
                    TTRewardVideoActivity.this.mZx.wJ.tPj();
                    TTRewardVideoActivity.this.mZx.wa.HX();
                    TTRewardVideoActivity.this.mZx.Pf.IPb();
                    if (com.bytedance.sdk.openadsdk.core.model.zF.MxO(TTRewardVideoActivity.this.mZx.EYQ) && !com.bytedance.sdk.openadsdk.core.model.zF.Td(TTRewardVideoActivity.this.mZx.EYQ)) {
                        TTRewardVideoActivity.this.EYQ(true, true);
                    } else {
                        TTRewardVideoActivity.this.finish();
                    }
                }
            };
            viewTp.setOnClickListener(onClickListener);
            viewTp.setTag(viewTp.getId(), onClickListener);
        }
        this.mZx.KR.EYQ(new com.bytedance.sdk.openadsdk.component.reward.top.mZx() { // from class: com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.4
            @Override // com.bytedance.sdk.openadsdk.component.reward.top.mZx
            public void EYQ(View view) {
                if (TTRewardVideoActivity.this.mZx.EYQ.oy()) {
                    if (TTRewardVideoActivity.this.mZx.TQF.MxO() != null) {
                        TTRewardVideoActivity.this.mZx.EYQ.tr(2);
                        TTRewardVideoActivity.this.mZx.TQF.UB();
                        return;
                    }
                    return;
                }
                if (!TTRewardVideoActivity.this.mZx.mZx && TTRewardVideoActivity.this.mZx.EYQ.baW() && !TTRewardVideoActivity.this.mZx.EYQ.oIw()) {
                    TTRewardVideoActivity.this.mZx.EYQ.tr(13);
                    try {
                        TTRewardVideoActivity.this.mZx.TQF.UB();
                        return;
                    } catch (Exception unused) {
                    }
                }
                TTRewardVideoActivity tTRewardVideoActivity = TTRewardVideoActivity.this;
                tTRewardVideoActivity.EYQ(com.bytedance.sdk.openadsdk.core.model.zF.MxO(tTRewardVideoActivity.mZx.EYQ), false);
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.mZx
            public void mZx(View view) {
                if (TTRewardVideoActivity.this.Td != null && TTRewardVideoActivity.this.Td.Pm() != null) {
                    TTRewardVideoActivity.this.Td.Pm().EYQ(TTRewardVideoActivity.this.mZx.Pm);
                }
                TTRewardVideoActivity.this.mZx.Pm = !TTRewardVideoActivity.this.mZx.Pm;
                boolean z = TTRewardVideoActivity.this.mZx.Pm;
                TTRewardVideoActivity.this.mZx.XPd.EYQ();
                TTRewardVideoActivity.this.mZx.FtN.mZx(TTRewardVideoActivity.this.mZx.Pm);
                if (!com.bytedance.sdk.openadsdk.core.model.zF.tsL(TTRewardVideoActivity.this.mZx.EYQ) || TTRewardVideoActivity.this.mZx.WU.get()) {
                    if (com.bytedance.sdk.openadsdk.core.model.zF.mZx(TTRewardVideoActivity.this.mZx.EYQ)) {
                        TTRewardVideoActivity.this.mZx.XPd.EYQ(TTRewardVideoActivity.this.mZx.Pm, true);
                    }
                    TTRewardVideoActivity.this.mZx.wJ.Pm(TTRewardVideoActivity.this.mZx.Pm);
                    if (TTRewardVideoActivity.this.mZx.EYQ == null || TTRewardVideoActivity.this.mZx.EYQ.zzY() == null || TTRewardVideoActivity.this.mZx.EYQ.zzY().EYQ() == null || TTRewardVideoActivity.this.mZx.FtN == null) {
                        return;
                    }
                    if (TTRewardVideoActivity.this.mZx.Pm) {
                        TTRewardVideoActivity.this.mZx.EYQ.zzY().EYQ().QQ(TTRewardVideoActivity.this.mZx.FtN.VwS());
                    } else {
                        TTRewardVideoActivity.this.mZx.EYQ.zzY().EYQ().HX(TTRewardVideoActivity.this.mZx.FtN.VwS());
                    }
                }
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.mZx
            public void Td(View view) {
                TTRewardVideoActivity.this.mZx.lRN.EYQ(TTRewardVideoActivity.this.Td);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void EYQ(final boolean z, boolean z2) {
        if (!z2 && this.wBa && com.bytedance.sdk.openadsdk.core.model.zF.Td(this.mZx.EYQ)) {
            this.mZx.wJ.VwS();
            return;
        }
        if (!hu.Pm().QQ(String.valueOf(this.mZx.KO))) {
            if (!z2 && this.mZx.WU.get() && com.bytedance.sdk.openadsdk.core.model.zF.Td(this.mZx.EYQ)) {
                this.mZx.wJ.VwS();
                return;
            } else if (z) {
                finish();
                return;
            } else {
                WU();
                return;
            }
        }
        if (this.NZ.get()) {
            if (com.bytedance.sdk.openadsdk.core.model.zF.Td(this.mZx.EYQ)) {
                this.mZx.wJ.VwS();
                return;
            } else if (z) {
                finish();
                return;
            } else {
                WU();
                return;
            }
        }
        if (com.bytedance.sdk.openadsdk.core.model.zF.Td(this.mZx.EYQ) && this.mZx.wJ.HX().getVisibility() == 0) {
            this.mZx.wJ.VwS();
            return;
        }
        this.mZx.tr.set(true);
        this.mZx.FtN.KO();
        if (z) {
            this.mZx.kf.KO();
        }
        final com.bytedance.sdk.openadsdk.core.widget.EYQ eyq = new com.bytedance.sdk.openadsdk.core.widget.EYQ(this);
        this.Td.pi = eyq;
        if (z) {
            this.Td.pi.EYQ(hu).mZx(hYh).Td(UB);
        } else {
            this.Td.pi.EYQ(KO).mZx(Uc).Td(UB);
        }
        this.Td.pi.EYQ(new EYQ.InterfaceC0130EYQ() { // from class: com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.5
            @Override // com.bytedance.sdk.openadsdk.core.widget.EYQ.InterfaceC0130EYQ
            public void EYQ() {
                TTRewardVideoActivity.this.mZx.FtN.nWX();
                if (z) {
                    TTRewardVideoActivity.this.mZx.kf.EYQ(1000L);
                }
                eyq.dismiss();
                TTRewardVideoActivity.this.mZx.tr.set(false);
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.EYQ.InterfaceC0130EYQ
            public void mZx() {
                eyq.dismiss();
                TTRewardVideoActivity.this.wBa = true;
                TTRewardVideoActivity.this.mZx.tr.set(false);
                TTRewardVideoActivity.this.mZx.kf.IPb(Integer.MAX_VALUE);
                if (!z) {
                    TTRewardVideoActivity.this.WU();
                    return;
                }
                if (com.bytedance.sdk.openadsdk.core.model.zF.Td(TTRewardVideoActivity.this.mZx.EYQ)) {
                    if (TTRewardVideoActivity.this.mZx.kf.hYh()) {
                        TTRewardVideoActivity.this.mZx.kf.mZx(5);
                        return;
                    } else {
                        TTRewardVideoActivity.this.mZx.wJ.VwS();
                        return;
                    }
                }
                TTRewardVideoActivity.this.mZx.Pf.IPb();
                if (TTRewardVideoActivity.this.mZx.kf.hYh()) {
                    TTRewardVideoActivity.this.mZx.kf.mZx(4);
                }
                TTRewardVideoActivity.this.finish();
            }
        }).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void WU() {
        /*
            r3 = this;
            com.bytedance.sdk.openadsdk.mZx.Pm.mZx.KO$EYQ r0 = new com.bytedance.sdk.openadsdk.mZx.Pm.mZx.KO$EYQ
            r0.<init>()
            com.bytedance.sdk.openadsdk.component.reward.EYQ.EYQ r1 = r3.mZx
            com.bytedance.sdk.openadsdk.component.reward.EYQ.pi r1 = r1.FtN
            long r1 = r1.VwS()
            r0.EYQ(r1)
            com.bytedance.sdk.openadsdk.component.reward.EYQ.EYQ r1 = r3.mZx
            com.bytedance.sdk.openadsdk.component.reward.EYQ.pi r1 = r1.FtN
            long r1 = r1.hYh()
            r0.Td(r1)
            com.bytedance.sdk.openadsdk.component.reward.EYQ.EYQ r1 = r3.mZx
            com.bytedance.sdk.openadsdk.component.reward.EYQ.pi r1 = r1.FtN
            long r1 = r1.MxO()
            r0.mZx(r1)
            r1 = 3
            r0.Td(r1)
            com.bytedance.sdk.openadsdk.component.reward.EYQ.EYQ r1 = r3.mZx
            com.bytedance.sdk.openadsdk.component.reward.EYQ.pi r1 = r1.FtN
            int r1 = r1.Uc()
            r0.Pm(r1)
            com.bytedance.sdk.openadsdk.component.reward.EYQ.EYQ r1 = r3.mZx
            com.bytedance.sdk.openadsdk.component.reward.EYQ.pi r1 = r1.FtN
            com.bykv.vk.openvk.component.video.api.mZx.EYQ r1 = r1.Td()
            com.bytedance.sdk.openadsdk.component.reward.EYQ.EYQ r2 = r3.mZx
            com.bytedance.sdk.openadsdk.component.reward.EYQ.pi r2 = r2.FtN
            com.bytedance.sdk.openadsdk.mZx.VwS r2 = r2.EYQ()
            com.bytedance.sdk.openadsdk.mZx.Pm.EYQ.EYQ.EYQ(r1, r0, r2)
            com.bytedance.sdk.openadsdk.component.reward.EYQ.EYQ r0 = r3.mZx
            int r0 = r0.KO
            com.bytedance.sdk.openadsdk.core.hYh.Td(r0)
            com.bytedance.sdk.openadsdk.component.reward.EYQ.EYQ r0 = r3.mZx
            com.bytedance.sdk.openadsdk.component.reward.EYQ.pi r0 = r0.FtN
            java.lang.String r1 = "skip"
            r0.EYQ(r1)
            com.bytedance.sdk.openadsdk.component.reward.EYQ.EYQ r0 = r3.mZx
            boolean r0 = r0.mZx
            if (r0 == 0) goto L77
            r0 = 1
            r1 = 4
            r3.EYQ(r0, r1)
            com.bytedance.sdk.openadsdk.component.reward.EYQ.EYQ r0 = r3.mZx
            com.bytedance.sdk.openadsdk.core.model.UB r0 = r0.EYQ
            boolean r0 = com.bytedance.sdk.openadsdk.core.model.KO.EYQ(r0)
            if (r0 == 0) goto L7a
            com.bytedance.sdk.openadsdk.component.reward.EYQ.EYQ r0 = r3.mZx
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.lEs
            boolean r0 = r0.get()
            if (r0 != 0) goto L7a
        L77:
            r3.finish()
        L7a:
            com.bytedance.sdk.openadsdk.component.reward.EYQ.EYQ r0 = r3.mZx
            com.bytedance.sdk.openadsdk.core.model.UB r0 = r0.EYQ
            com.bytedance.sdk.openadsdk.core.VwS.EYQ r0 = r0.zzY()
            if (r0 == 0) goto L96
            com.bytedance.sdk.openadsdk.core.VwS.Pm r0 = r0.EYQ()
            com.bytedance.sdk.openadsdk.component.reward.EYQ.EYQ r1 = r3.mZx
            com.bytedance.sdk.openadsdk.component.reward.EYQ.pi r1 = r1.FtN
            long r1 = r1.VwS()
            r0.IPb(r1)
            r0.Kbd(r1)
        L96:
            com.bytedance.sdk.openadsdk.component.reward.EYQ.EYQ r0 = r3.mZx
            com.bytedance.sdk.openadsdk.core.model.UB r0 = r0.EYQ
            r1 = 5
            com.bytedance.sdk.openadsdk.nWX.EYQ.Kbd.EYQ(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.WU():void");
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    protected void EYQ(Intent intent) {
        super.EYQ(intent);
        this.zF = intent.getStringExtra("media_extra");
        this.WU = intent.getStringExtra("user_id");
    }

    public boolean EYQ(long j, boolean z) {
        VwS vwS = new VwS();
        vwS.EYQ(System.currentTimeMillis(), 1.0f);
        this.mZx.FtN.EYQ(this.mZx.TQF.IPb(), vwS);
        Td.EYQ eyq = new Td.EYQ() { // from class: com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.6
            boolean EYQ;

            @Override // com.bykv.vk.openvk.component.video.api.Pm.Td.EYQ
            public void EYQ(long j2, int i) {
                if (this.EYQ) {
                    return;
                }
                this.EYQ = true;
                TTRewardVideoActivity.this.Pm.removeMessages(Strategy.TTL_SECONDS_DEFAULT);
                TTRewardVideoActivity.this.pi();
                TTRewardVideoActivity.this.zF();
                TTRewardVideoActivity.this.mZx.FH.set(true);
                if (TTRewardVideoActivity.this.mZx.EYQ.jv()) {
                    TTRewardVideoActivity.this.mZx.EYQ.tr(1);
                    TTRewardVideoActivity.this.mZx.TQF.UB();
                }
                if (TTRewardVideoActivity.this.mZx.EYQ.nWX() == 21 && !TTRewardVideoActivity.this.mZx.EYQ.Td()) {
                    TTRewardVideoActivity.this.mZx.EYQ.mZx(true);
                    TTRewardVideoActivity.this.mZx.TQF.UB();
                }
                TTRewardVideoActivity.this.pi = (int) (System.currentTimeMillis() / 1000);
                if (KO.Td(TTRewardVideoActivity.this.mZx.EYQ) || KO.mZx(TTRewardVideoActivity.this.mZx.EYQ)) {
                    TTRewardVideoActivity.this.EYQ(false, 5);
                    return;
                }
                if (KO.EYQ(TTRewardVideoActivity.this.mZx.EYQ) && !TTRewardVideoActivity.this.mZx.lEs.get()) {
                    TTRewardVideoActivity.this.mZx.EYQ(true);
                    TTRewardVideoActivity.this.mZx.KR.Kbd(true);
                } else if (TTRewardVideoActivity.this.mZx.mZx) {
                    TTRewardVideoActivity.this.EYQ(false, 5);
                } else {
                    TTRewardVideoActivity.this.finish();
                }
            }

            @Override // com.bykv.vk.openvk.component.video.api.Pm.Td.EYQ
            public void mZx(long j2, int i) {
                TTRewardVideoActivity.this.Pm.removeMessages(Strategy.TTL_SECONDS_DEFAULT);
                if (TTRewardVideoActivity.this.mZx.FtN.mZx()) {
                    TTRewardVideoActivity.this.tsL();
                    return;
                }
                TTRewardVideoActivity.this.mZx.FtN.pi();
                TTRewardVideoActivity.this.zF();
                if (TTRewardVideoActivity.this.mZx.mZx) {
                    TTRewardVideoActivity.this.EYQ(false, true, 3);
                } else {
                    TTRewardVideoActivity.this.finish();
                }
                TTRewardVideoActivity.this.mZx.FtN.EYQ(1 ^ (TTRewardVideoActivity.this.mZx.FtN.rfB() ? 1 : 0), 2);
            }

            @Override // com.bykv.vk.openvk.component.video.api.Pm.Td.EYQ
            public void EYQ() {
                TTRewardVideoActivity.this.Pm.removeMessages(Strategy.TTL_SECONDS_DEFAULT);
                TTRewardVideoActivity.this.pi();
                TTRewardVideoActivity.this.zF();
                if (TTRewardVideoActivity.this.mZx.mZx) {
                    TTRewardVideoActivity.this.EYQ(false, true, 6);
                } else {
                    TTRewardVideoActivity.this.finish();
                }
                TTRewardVideoActivity.this.mZx.FtN.EYQ(!TTRewardVideoActivity.this.mZx.FtN.rfB() ? 1 : 0, 1 ^ (TTRewardVideoActivity.this.mZx.FtN.rfB() ? 1 : 0));
                TTRewardVideoActivity.this.mZx.FtN.pi();
            }

            @Override // com.bykv.vk.openvk.component.video.api.Pm.Td.EYQ
            public void EYQ(long j2, long j3) {
                if (!TTRewardVideoActivity.this.mZx.Kbd && TTRewardVideoActivity.this.mZx.FtN.mZx()) {
                    TTRewardVideoActivity.this.mZx.FtN.KO();
                }
                if (TTRewardVideoActivity.this.mZx.WU.get()) {
                    return;
                }
                TTRewardVideoActivity.this.Pm.removeMessages(Strategy.TTL_SECONDS_DEFAULT);
                if (j2 != TTRewardVideoActivity.this.mZx.FtN.QQ()) {
                    TTRewardVideoActivity.this.pi();
                }
                TTRewardVideoActivity.this.mZx.FtN.EYQ(j2, j3);
                TTRewardVideoActivity tTRewardVideoActivity = TTRewardVideoActivity.this;
                long j4 = j2 / 1000;
                double d = j4;
                tTRewardVideoActivity.IPb = (int) (tTRewardVideoActivity.mZx.FtN.lEs() - d);
                if (TTRewardVideoActivity.this.IPb >= 0) {
                    TTRewardVideoActivity.this.mZx.KR.EYQ(String.valueOf(TTRewardVideoActivity.this.IPb), null);
                }
                TTRewardVideoActivity tTRewardVideoActivity2 = TTRewardVideoActivity.this;
                tTRewardVideoActivity2.IPb = (int) (tTRewardVideoActivity2.mZx.FtN.lEs() - d);
                int i = (int) j4;
                int iTp = hu.Pm().tp(String.valueOf(TTRewardVideoActivity.this.mZx.KO));
                boolean z2 = iTp >= 0;
                if ((TTRewardVideoActivity.this.mZx.tr.get() || TTRewardVideoActivity.this.mZx.XN.get()) && TTRewardVideoActivity.this.mZx.FtN.mZx()) {
                    TTRewardVideoActivity.this.mZx.FtN.KO();
                }
                TTRewardVideoActivity.this.mZx.TQF.Kbd(i);
                TTRewardVideoActivity.this.EYQ(j2, j3);
                if (TTRewardVideoActivity.this.IPb > 0) {
                    TTRewardVideoActivity.this.mZx.KR.Pm(true);
                    if (z2 && i >= iTp) {
                        TTRewardVideoActivity.this.mZx.EYQ(true);
                        TTRewardVideoActivity.this.mZx.KR.EYQ(String.valueOf(TTRewardVideoActivity.this.IPb), TTAdDislikeToast.getSkipText());
                        TTRewardVideoActivity.this.mZx.KR.Kbd(true);
                        return;
                    }
                    TTRewardVideoActivity.this.mZx.KR.EYQ(String.valueOf(TTRewardVideoActivity.this.IPb), null);
                }
            }
        };
        this.mZx.FtN.EYQ(eyq);
        if (this.mZx.TQF.KO != null) {
            this.mZx.TQF.KO.EYQ(eyq);
        }
        boolean zEYQ = this.mZx.FtN.EYQ(j, z, null, this.Td);
        if (zEYQ && !z) {
            this.tsL = (int) (System.currentTimeMillis() / 1000);
        }
        return zEYQ;
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.Td.mZx
    public void Uc() {
        XN();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void XN() {
        UB.EYQ("BVA", "invoke callback onAdClicked, ".concat(String.valueOf(this)));
        if (com.bytedance.sdk.openadsdk.multipro.mZx.Td()) {
            EYQ("onAdVideoBarClick");
            return;
        }
        com.bytedance.sdk.openadsdk.apiImpl.Pm.EYQ eyq = this.nWX;
        if (eyq != null) {
            eyq.onAdClicked();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void EYQ(final boolean z, final int i, final String str, final int i2, final String str2) {
        UB.EYQ("BVA", "invoke callback onRewardVerify: " + z + ", " + i + ", " + str + ", " + i2 + ", " + str2 + "; " + this);
        if (com.bytedance.sdk.openadsdk.multipro.mZx.Td()) {
            EYQ("onRewardVerify", z, i, str, i2, str2);
        } else {
            this.Pm.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.7
                @Override // java.lang.Runnable
                public void run() {
                    if (TTRewardVideoActivity.this.nWX != null) {
                        TTRewardVideoActivity.this.nWX.EYQ(z, i, str, i2, str2);
                    }
                }
            });
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    protected void QQ() {
        if (com.bytedance.sdk.openadsdk.multipro.mZx.Td()) {
            EYQ("onAdShow");
        } else {
            com.bytedance.sdk.openadsdk.apiImpl.Pm.EYQ eyq = this.nWX;
            if (eyq != null) {
                eyq.EYQ();
            }
        }
        if (hu()) {
            this.mZx.mN.tp();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.core.video.Td.Td
    public void HX() {
        zF();
    }

    protected void zF() {
        if (this.NZ.get()) {
            return;
        }
        this.NZ.set(true);
        if (hu.Pm().KO(String.valueOf(this.mZx.KO))) {
            EYQ(true, this.mZx.EYQ.hYh(), this.mZx.EYQ.Uc(), 0, "");
        } else {
            hu.Td().EYQ(NZ(), new UB.mZx() { // from class: com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.8
                @Override // com.bytedance.sdk.openadsdk.core.UB.mZx
                public void EYQ(int i, String str) {
                    TTRewardVideoActivity.this.EYQ(false, 0, "", i, str);
                }

                @Override // com.bytedance.sdk.openadsdk.core.UB.mZx
                public void EYQ(Uc.mZx mzx) {
                    boolean z = mzx.mZx;
                    TTRewardVideoActivity.this.EYQ(mzx.mZx, mzx.Td.EYQ(), mzx.Td.mZx(), 0, "");
                }
            });
        }
    }

    private JSONObject NZ() {
        JSONObject jSONObject = new JSONObject();
        int iZF = (int) this.mZx.FtN.zF();
        try {
            jSONObject.put("oversea_version_type", 1);
            jSONObject.put("reward_name", this.mZx.EYQ.Uc());
            jSONObject.put("reward_amount", this.mZx.EYQ.hYh());
            jSONObject.put("network", com.bytedance.sdk.component.utils.hu.Td(getApplicationContext()));
            jSONObject.put("sdk_version", BuildConfig.VERSION_NAME);
            int iFtN = this.mZx.EYQ.FtN();
            String strTd = "unKnow";
            if (iFtN == 2) {
                strTd = FH.mZx();
            } else if (iFtN == 1) {
                strTd = FH.Td();
            }
            jSONObject.put("user_agent", strTd);
            jSONObject.put("extra", this.mZx.EYQ.Jy());
            jSONObject.put("media_extra", this.zF);
            jSONObject.put("video_duration", this.mZx.EYQ.mN().IPb());
            jSONObject.put("play_start_ts", this.tsL);
            jSONObject.put("play_end_ts", this.pi);
            jSONObject.put("duration", iZF);
            jSONObject.put("user_id", this.WU);
            jSONObject.put("trans_id", hYh.EYQ().replace("-", ""));
            return jSONObject;
        } catch (Throwable th) {
            pi.EYQ("TTAD.RVA", "", th);
            return null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.Td.mZx
    public void hYh() {
        XN();
        this.mZx.EYQ.WD();
        this.mZx.EYQ.EYQ(true);
        if (com.bytedance.sdk.openadsdk.core.model.UB.Kbd(this.mZx.EYQ)) {
            com.bytedance.sdk.openadsdk.mZx.Td.mZx(this.mZx.EYQ, this.mZx.VwS, this.mZx.EYQ.Qh());
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.Td.mZx
    public void Td(int i) {
        if (i == 10000) {
            zF();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        tPj();
        if (com.bytedance.sdk.openadsdk.multipro.mZx.Td()) {
            EYQ("recycleRes");
        }
        this.nWX = null;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void finish() {
        tPj();
        super.finish();
    }

    private void tPj() {
        if (this.QQ) {
            return;
        }
        this.QQ = true;
        com.bytedance.sdk.openadsdk.utils.UB.EYQ("BVA", "invoke callback onAdClose, ".concat(String.valueOf(this)));
        if (com.bytedance.sdk.openadsdk.multipro.mZx.Td()) {
            EYQ("onAdClose");
            return;
        }
        com.bytedance.sdk.openadsdk.apiImpl.Pm.EYQ eyq = this.nWX;
        if (eyq != null) {
            eyq.mZx();
        }
    }

    protected void EYQ(long j, long j2) {
        long j3 = j + (this.mZx.QQ * 1000);
        if (this.tPj == -1) {
            this.tPj = hu.Pm().rfB(String.valueOf(this.mZx.KO)).IPb;
        }
        if (j2 <= 0) {
            return;
        }
        if (j2 >= 30000 && j3 >= 27000) {
            zF();
        } else if ((j3 * 100) / j2 >= this.tPj) {
            zF();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0035  */
    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void tp() {
        /*
            r12 = this;
            com.bytedance.sdk.openadsdk.core.settings.Kbd r0 = com.bytedance.sdk.openadsdk.core.hu.Pm()
            com.bytedance.sdk.openadsdk.component.reward.EYQ.EYQ r1 = r12.mZx
            int r1 = r1.KO
            java.lang.String r1 = java.lang.String.valueOf(r1)
            com.bytedance.sdk.openadsdk.core.settings.EYQ r0 = r0.rfB(r1)
            int r0 = r0.IPb
            com.bytedance.sdk.openadsdk.component.reward.EYQ.EYQ r1 = r12.mZx
            com.bytedance.sdk.openadsdk.core.model.UB r1 = r1.EYQ
            boolean r1 = com.bytedance.sdk.openadsdk.core.model.zF.tsL(r1)
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L37
            com.bytedance.sdk.openadsdk.component.reward.EYQ.EYQ r1 = r12.mZx
            com.bytedance.sdk.openadsdk.component.reward.EYQ.pi r1 = r1.FtN
            double r4 = r1.lEs()
            r6 = 4636737291354636288(0x4059000000000000, double:100.0)
            r8 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r1 = r12.IPb
            double r10 = (double) r1
            double r10 = r10 / r4
            double r8 = r8 - r10
            double r8 = r8 * r6
            double r0 = (double) r0
            int r0 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r0 < 0) goto L89
        L35:
            r2 = r3
            goto L89
        L37:
            com.bytedance.sdk.openadsdk.component.reward.EYQ.EYQ r1 = r12.mZx
            com.bytedance.sdk.openadsdk.core.model.UB r1 = r1.EYQ
            int r1 = r1.eVP()
            r4 = 1120403456(0x42c80000, float:100.0)
            r5 = 1065353216(0x3f800000, float:1.0)
            com.bytedance.sdk.openadsdk.component.reward.EYQ.EYQ r6 = r12.mZx
            com.bytedance.sdk.openadsdk.component.reward.EYQ.VwS r6 = r6.kf
            int r6 = r6.tsL()
            float r6 = (float) r6
            float r1 = (float) r1
            float r6 = r6 / r1
            float r5 = r5 - r6
            float r5 = r5 * r4
            float r0 = (float) r0
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 < 0) goto L57
            r0 = r3
            goto L58
        L57:
            r0 = r2
        L58:
            com.bytedance.sdk.openadsdk.core.settings.Kbd r1 = com.bytedance.sdk.openadsdk.core.hu.Pm()
            com.bytedance.sdk.openadsdk.component.reward.EYQ.EYQ r4 = r12.mZx
            int r4 = r4.KO
            java.lang.String r4 = java.lang.String.valueOf(r4)
            int r1 = r1.EYQ(r4)
            if (r1 != 0) goto L86
            com.bytedance.sdk.openadsdk.component.reward.EYQ.EYQ r1 = r12.mZx
            com.bytedance.sdk.openadsdk.component.reward.EYQ.nWX r1 = r1.wJ
            com.bytedance.sdk.openadsdk.core.wBa r1 = r1.tp()
            boolean r1 = r1.Kbd()
            com.bytedance.sdk.openadsdk.component.reward.EYQ.EYQ r4 = r12.mZx
            com.bytedance.sdk.openadsdk.component.reward.EYQ.VwS r4 = r4.kf
            boolean r4 = r4.Uc()
            if (r4 == 0) goto L81
            r1 = r3
        L81:
            if (r0 == 0) goto L89
            if (r1 == 0) goto L89
            goto L35
        L86:
            if (r1 != r3) goto L89
            r2 = r0
        L89:
            if (r2 == 0) goto L8e
            r12.zF()
        L8e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.tp():void");
    }
}
