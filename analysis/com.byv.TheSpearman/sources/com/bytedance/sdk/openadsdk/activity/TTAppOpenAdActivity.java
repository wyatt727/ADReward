package com.bytedance.sdk.openadsdk.activity;

import android.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.VwS.QQ;
import com.bytedance.sdk.component.utils.wBa;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.IListenerManager;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.apiImpl.Td.mZx;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.component.IPb;
import com.bytedance.sdk.openadsdk.component.QQ.EYQ;
import com.bytedance.sdk.openadsdk.component.Td;
import com.bytedance.sdk.openadsdk.core.VwS.Pm;
import com.bytedance.sdk.openadsdk.core.hYh;
import com.bytedance.sdk.openadsdk.core.hu;
import com.bytedance.sdk.openadsdk.core.model.UB;
import com.bytedance.sdk.openadsdk.core.pi;
import com.bytedance.sdk.openadsdk.core.settings.KO;
import com.bytedance.sdk.openadsdk.core.zF;
import com.bytedance.sdk.openadsdk.mZx.VwS;
import com.bytedance.sdk.openadsdk.nWX.EYQ.Kbd;
import com.bytedance.sdk.openadsdk.utils.Nvm;
import com.bytedance.sdk.openadsdk.utils.tr;
import com.bytedance.sdk.openadsdk.utils.xt;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.json.id;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class TTAppOpenAdActivity extends TTBaseActivity implements wBa.EYQ {
    private static mZx QQ;
    private AdSlot FH;
    private VwS KO;
    private TTAdDislikeDialog MxO;
    private mZx NZ;
    private Td Nvm;
    private float UB;
    private boolean Uc;
    private UB WU;
    private IListenerManager XN;
    private int hYh;
    private float hu;
    private FrameLayout lEs;
    private int rfB;
    private com.bytedance.sdk.openadsdk.component.IPb.mZx tp;
    private TTAdDislikeToast tsL;
    private int wBa;
    private boolean xt;
    private String zF;
    protected final AtomicBoolean EYQ = new AtomicBoolean(false);
    protected final wBa mZx = new wBa(Looper.getMainLooper(), this);
    final AtomicBoolean Td = new AtomicBoolean(false);
    final AtomicBoolean Pm = new AtomicBoolean(false);
    private final EYQ HX = new EYQ();
    protected boolean Kbd = false;
    private final AtomicBoolean pi = new AtomicBoolean(false);
    private Nvm nWX = Nvm.mZx();
    private final AtomicBoolean tPj = new AtomicBoolean(false);
    long IPb = 0;
    private final com.bytedance.sdk.openadsdk.component.EYQ tr = new com.bytedance.sdk.openadsdk.component.EYQ() { // from class: com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.1
        @Override // com.bytedance.sdk.openadsdk.component.EYQ, com.bykv.vk.openvk.component.video.api.Pm.Td.EYQ
        public void mZx(long j, int i) {
            TTAppOpenAdActivity.this.hYh();
            TTAppOpenAdActivity.this.finish();
        }

        @Override // com.bytedance.sdk.openadsdk.component.EYQ, com.bykv.vk.openvk.component.video.api.Pm.Td.EYQ
        public void EYQ() {
            TTAppOpenAdActivity.this.hYh();
            TTAppOpenAdActivity.this.finish();
        }

        @Override // com.bytedance.sdk.openadsdk.component.EYQ, com.bykv.vk.openvk.component.video.api.Pm.Td.EYQ
        public void EYQ(long j, long j2) {
            TTAppOpenAdActivity.this.HX.EYQ(j);
            if (!TTAppOpenAdActivity.this.Kbd && TTAppOpenAdActivity.this.Nvm != null && TTAppOpenAdActivity.this.Nvm.Kbd() != null && TTAppOpenAdActivity.this.Nvm.Kbd().mZx()) {
                TTAppOpenAdActivity.this.Nvm.Kbd().Pm();
            }
            TTAppOpenAdActivity.this.tsL();
        }

        @Override // com.bytedance.sdk.openadsdk.component.EYQ, com.bytedance.sdk.openadsdk.component.IPb.EYQ
        public void EYQ(View view) throws JSONException {
            TTAppOpenAdActivity.this.zF();
        }

        @Override // com.bytedance.sdk.openadsdk.component.EYQ, com.bytedance.sdk.openadsdk.component.IPb.EYQ
        public void mZx(View view) {
            TTAppOpenAdActivity.this.EYQ();
        }

        @Override // com.bytedance.sdk.openadsdk.component.EYQ, com.bytedance.sdk.openadsdk.component.IPb.EYQ
        public void mZx() {
            if (com.bytedance.sdk.openadsdk.multipro.mZx.Td()) {
                TTAppOpenAdActivity.this.EYQ("onAdTimeOver");
            } else if (TTAppOpenAdActivity.this.NZ != null) {
                TTAppOpenAdActivity.this.NZ.Td();
            }
            TTAppOpenAdActivity.this.finish();
        }

        @Override // com.bytedance.sdk.openadsdk.component.EYQ, com.bytedance.sdk.openadsdk.component.IPb.EYQ
        public void EYQ(int i, int i2, boolean z) {
            if (TTAppOpenAdActivity.this.Nvm != null) {
                TTAppOpenAdActivity.this.Nvm.EYQ(i, i2, z);
            }
        }

        @Override // com.bytedance.sdk.openadsdk.component.EYQ
        public void Td() {
            TTAppOpenAdActivity.this.IPb();
            TTAppOpenAdActivity.this.nWX.Pm();
            TTAppOpenAdActivity.this.hu();
            if (TTAppOpenAdActivity.this.Uc) {
                TTAppOpenAdActivity.this.MxO();
            }
        }

        @Override // com.bytedance.sdk.openadsdk.component.EYQ
        public void Pm() {
            TTAppOpenAdActivity.this.finish();
        }

        @Override // com.bytedance.sdk.openadsdk.component.EYQ
        public void Kbd() {
            TTAppOpenAdActivity.this.Uc();
        }

        @Override // com.bytedance.sdk.openadsdk.component.EYQ
        public void EYQ(int i) {
            TTAppOpenAdActivity.this.WU.WU(i);
            TTAppOpenAdActivity.this.VwS();
        }
    };
    private final Runnable Tnp = new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.4
        @Override // java.lang.Runnable
        public void run() throws JSONException {
            if (TTAppOpenAdActivity.this.pi.get()) {
                return;
            }
            if (TTAppOpenAdActivity.this.WU != null && TTAppOpenAdActivity.this.WU.oIw() && TTAppOpenAdActivity.this.WU.zzY() != null && TTAppOpenAdActivity.this.WU.zzY().EYQ() != null) {
                TTAppOpenAdActivity.this.WU.zzY().EYQ().EYQ(0L);
            }
            TTAppOpenAdActivity.this.KO = new VwS();
            TTAppOpenAdActivity.this.KO.EYQ(System.currentTimeMillis(), 1.0f);
            TTAppOpenAdActivity.this.nWX.Pm();
            if (TTAppOpenAdActivity.this.tp != null) {
                TTAppOpenAdActivity.this.tp.mZx();
            }
            TTAppOpenAdActivity.this.UB();
            View viewFindViewById = TTAppOpenAdActivity.this.findViewById(R.id.content);
            JSONObject jSONObject = new JSONObject();
            if (viewFindViewById != null) {
                try {
                    jSONObject.put("width", viewFindViewById.getWidth());
                    jSONObject.put("height", viewFindViewById.getHeight());
                    jSONObject.put("alpha", viewFindViewById.getAlpha());
                } catch (JSONException e) {
                    Log.e("TTAppOpenAdActivity", "run: ", e);
                    TTAppOpenAdActivity.this.finish();
                    return;
                }
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("root_view", jSONObject.toString());
            jSONObject2.put("ad_root", TTAppOpenAdActivity.this.wBa);
            jSONObject2.put("openad_creative_type", TTAppOpenAdActivity.this.Uc ? "video_normal_ad" : "image_normal_ad");
            if (com.bytedance.sdk.openadsdk.component.view.EYQ.Td() == null) {
                jSONObject2.put("appicon_acquirefail", "1");
            }
            if (TTAppOpenAdActivity.this.xt || TTAppOpenAdActivity.this.WU.oB()) {
                jSONObject2.put("dynamic_show_type", TTAppOpenAdActivity.this.KO());
                TTAppOpenAdActivity.this.EYQ(jSONObject2);
            }
            jSONObject2.put("is_icon_only", TTAppOpenAdActivity.this.WU.BEC() ? 1 : 0);
            com.bytedance.sdk.openadsdk.mZx.Td.EYQ(TTAppOpenAdActivity.this.WU, "open_ad", jSONObject2);
            Kbd.EYQ(TTAppOpenAdActivity.this.findViewById(R.id.content), TTAppOpenAdActivity.this.WU, TTAppOpenAdActivity.this.KO());
            TTAppOpenAdActivity.this.pi.set(true);
        }
    };

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        hu.EYQ(getApplicationContext());
        if (!mZx(bundle)) {
            finish();
            return;
        }
        if (!pi.Kbd()) {
            finish();
            return;
        }
        if (bundle != null) {
            com.bytedance.sdk.openadsdk.mZx.Td.Td(this.WU, "open_ad", null);
        }
        boolean zKbd = UB.Kbd(this.WU);
        this.Uc = zKbd;
        if (zKbd) {
            this.HX.EYQ((float) this.WU.mN().IPb());
        } else {
            this.HX.EYQ(hu.Pm().WU(String.valueOf(this.hYh)));
        }
        com.bytedance.sdk.openadsdk.component.IPb.mZx mzx = new com.bytedance.sdk.openadsdk.component.IPb.mZx(this.HX);
        this.tp = mzx;
        mzx.EYQ(this.tr);
        VwS();
        FrameLayout frameLayout = new FrameLayout(this);
        this.lEs = frameLayout;
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        try {
            setContentView(this.lEs);
            this.lEs.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.2
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        int iNZ = TTAppOpenAdActivity.this.WU.NZ();
                        TTAppOpenAdActivity tTAppOpenAdActivity = TTAppOpenAdActivity.this;
                        tTAppOpenAdActivity.xt = tTAppOpenAdActivity.WU != null && TTAppOpenAdActivity.this.WU.zF() == 2 && (iNZ == 3 || iNZ == 7);
                        if (TTAppOpenAdActivity.this.xt) {
                            TTAppOpenAdActivity tTAppOpenAdActivity2 = TTAppOpenAdActivity.this;
                            TTAppOpenAdActivity tTAppOpenAdActivity3 = TTAppOpenAdActivity.this;
                            tTAppOpenAdActivity2.Nvm = new com.bytedance.sdk.openadsdk.component.mZx(tTAppOpenAdActivity3, tTAppOpenAdActivity3.WU, TTAppOpenAdActivity.this.lEs, TTAppOpenAdActivity.this.tr, TTAppOpenAdActivity.this.rfB, TTAppOpenAdActivity.this.Uc, TTAppOpenAdActivity.this.HX);
                        } else {
                            TTAppOpenAdActivity tTAppOpenAdActivity4 = TTAppOpenAdActivity.this;
                            TTAppOpenAdActivity tTAppOpenAdActivity5 = TTAppOpenAdActivity.this;
                            tTAppOpenAdActivity4.Nvm = new Td(tTAppOpenAdActivity5, tTAppOpenAdActivity5.WU, TTAppOpenAdActivity.this.lEs, TTAppOpenAdActivity.this.tr, TTAppOpenAdActivity.this.rfB, TTAppOpenAdActivity.this.Uc, TTAppOpenAdActivity.this.HX);
                            TTAppOpenAdActivity.this.Nvm.EYQ(TTAppOpenAdActivity.this.UB, TTAppOpenAdActivity.this.hu);
                        }
                        TTAppOpenAdActivity.this.Nvm.EYQ((ViewGroup) TTAppOpenAdActivity.this.lEs);
                        TTAppOpenAdActivity.this.Nvm.EYQ();
                        TTAppOpenAdActivity.this.Nvm.mZx();
                    } catch (Throwable th) {
                        TTAppOpenAdActivity.this.finish();
                        com.bytedance.sdk.component.utils.pi.EYQ("TTAppOpenAdActivity", th.getMessage());
                    }
                }
            });
        } catch (Throwable unused) {
            com.bytedance.sdk.openadsdk.mZx.Td.mZx();
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void IPb() {
        Log.d("TTAppOpenAdActivity", "startCountDownTimer() called");
        this.tp.mZx(hu.Pm().zF(String.valueOf(this.hYh)));
        this.tp.EYQ(this.HX.EYQ());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void VwS() {
        if (26 == Build.VERSION.SDK_INT) {
            if (getResources().getConfiguration().orientation == 1) {
                this.rfB = 1;
            } else {
                this.rfB = 2;
            }
        } else {
            this.rfB = this.WU.TZE();
        }
        QQ();
    }

    private void QQ() {
        int iMin;
        int iMax;
        if (Build.VERSION.SDK_INT != 26) {
            if (Build.VERSION.SDK_INT == 27) {
                try {
                    HX();
                } catch (Throwable th) {
                    com.bytedance.sdk.component.utils.pi.EYQ("TTAppOpenAdActivity", th.getMessage());
                    return;
                }
            } else {
                HX();
            }
        }
        Pair<Integer, Integer> pairQQ = tr.QQ(getApplicationContext());
        if (this.rfB == 2) {
            iMin = Math.max(((Integer) pairQQ.first).intValue(), ((Integer) pairQQ.second).intValue());
            iMax = Math.min(((Integer) pairQQ.first).intValue(), ((Integer) pairQQ.second).intValue());
        } else {
            iMin = Math.min(((Integer) pairQQ.first).intValue(), ((Integer) pairQQ.second).intValue());
            iMax = Math.max(((Integer) pairQQ.first).intValue(), ((Integer) pairQQ.second).intValue());
        }
        this.hu = iMax;
        this.UB = iMin;
        float fEYQ = tr.EYQ();
        if (tr.Td((Activity) this)) {
            int i = this.rfB;
            if (i == 1) {
                this.hu -= fEYQ;
            } else if (i == 2) {
                this.UB -= fEYQ;
            }
        }
        Td td = this.Nvm;
        if (td != null) {
            td.EYQ(this.UB, this.hu);
        }
    }

    private void HX() {
        if (this.rfB == 2) {
            if (Kbd()) {
                setRequestedOrientation(8);
            } else {
                setRequestedOrientation(0);
            }
        } else {
            setRequestedOrientation(1);
        }
        if (this.rfB == 2 || !tr.Td((Activity) this)) {
            getWindow().addFlags(1024);
        }
    }

    protected void EYQ() {
        if (isFinishing()) {
            return;
        }
        if (this.Pm.get()) {
            pi();
            return;
        }
        if (this.MxO == null) {
            try {
                tp();
            } catch (Throwable th) {
                ApmHelper.reportCustomError("initDislike error", "TTAppOpenAdActivity", th);
            }
        }
        TTAdDislikeDialog tTAdDislikeDialog = this.MxO;
        if (tTAdDislikeDialog != null) {
            tTAdDislikeDialog.EYQ();
        }
    }

    private void tp() {
        if (this.MxO == null) {
            TTAdDislikeDialog tTAdDislikeDialog = new TTAdDislikeDialog(this, this.WU);
            this.MxO = tTAdDislikeDialog;
            tTAdDislikeDialog.setCallback(new TTAdDislikeDialog.EYQ() { // from class: com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.3
                @Override // com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog.EYQ
                public void EYQ(View view) {
                    TTAppOpenAdActivity.this.Td.set(true);
                    TTAppOpenAdActivity.this.Td();
                }

                @Override // com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog.EYQ
                public void mZx(View view) {
                    TTAppOpenAdActivity.this.Td.set(false);
                    TTAppOpenAdActivity.this.mZx();
                }

                @Override // com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog.EYQ
                public void EYQ(int i, FilterWord filterWord) {
                    if (TTAppOpenAdActivity.this.Pm.get() || filterWord == null || filterWord.hasSecondOptions()) {
                        return;
                    }
                    TTAppOpenAdActivity.this.Pm.set(true);
                    TTAppOpenAdActivity.this.nWX();
                }
            });
        }
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.content);
        frameLayout.addView(this.MxO);
        if (this.tsL == null) {
            TTAdDislikeToast tTAdDislikeToast = new TTAdDislikeToast(this);
            this.tsL = tTAdDislikeToast;
            frameLayout.addView(tTAdDislikeToast);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void MxO() {
        if (!this.Uc || this.WU.BEC()) {
            return;
        }
        this.mZx.sendEmptyMessageDelayed(100, 5000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void tsL() {
        if (!this.Uc || this.WU.BEC()) {
            return;
        }
        this.mZx.removeMessages(100);
    }

    private void pi() {
        this.tsL.EYQ(TTAdDislikeToast.getDislikeTip());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void nWX() {
        this.tsL.EYQ(TTAdDislikeToast.getDislikeSendTip());
    }

    @Override // android.app.Activity
    public void onBackPressed() throws JSONException {
        if (hu.Pm().hYh(String.valueOf(this.hYh)) == 1) {
            if (this.HX.mZx() >= hu.Pm().zF(String.valueOf(this.hYh)) * 1000) {
                zF();
            }
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            if (!this.xt) {
                this.nWX.Pm();
            }
            UB ub = this.WU;
            if (ub != null && ub.lv() && !this.WU.zAe()) {
                this.WU.VwS(true);
                UB ub2 = this.WU;
                com.bytedance.sdk.openadsdk.mZx.Td.EYQ(ub2, "open_ad", ub2.Hrh());
            }
        } else if (this.pi.get()) {
            if (this.nWX.Kbd()) {
                com.bytedance.sdk.openadsdk.mZx.Td.EYQ(String.valueOf(this.nWX.Td()), this.WU, "open_ad", this.KO);
            }
            this.nWX = Nvm.mZx();
        }
        Kbd.EYQ(this.WU, z ? 4 : 8);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    protected void onResume() throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException {
        Td td;
        super.onResume();
        this.Kbd = true;
        if (this.EYQ.getAndSet(true)) {
            if (this.tPj.get()) {
                hYh();
                if (this.Uc && (td = this.Nvm) != null && td.Kbd() != null) {
                    this.Nvm.Kbd().EYQ(3);
                }
                finish();
                return;
            }
            mZx();
        }
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        this.Kbd = false;
        Td();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    @Override // android.app.Activity
    protected void onDestroy() throws JSONException {
        super.onDestroy();
        this.mZx.removeCallbacksAndMessages(null);
        com.bytedance.sdk.openadsdk.component.IPb.mZx mzx = this.tp;
        if (mzx != null) {
            mzx.Kbd();
        }
        Kbd.EYQ(this.WU);
        if (this.Uc) {
            com.bytedance.sdk.openadsdk.component.Pm.EYQ.EYQ(this.WU, this.HX.mZx(), this.HX.EYQ(), true);
        } else {
            com.bytedance.sdk.openadsdk.component.Pm.EYQ.EYQ(this.WU, -1L, this.HX.EYQ(), false);
        }
        if (this.nWX.Kbd() && this.pi.get()) {
            com.bytedance.sdk.openadsdk.mZx.Td.EYQ(String.valueOf(this.nWX.Td()), this.WU, "open_ad", this.KO);
            this.nWX = Nvm.mZx();
        }
        Td td = this.Nvm;
        if (td != null) {
            td.Td();
        }
        if (com.bytedance.sdk.openadsdk.multipro.mZx.Td()) {
            EYQ("recycleRes");
        }
        QQ = null;
        this.NZ = null;
        TTAdDislikeDialog tTAdDislikeDialog = this.MxO;
        if (tTAdDislikeDialog != null) {
            tTAdDislikeDialog.setCallback(null);
        }
        if (KO.Jpu().tPj(String.valueOf(this.hYh)) == 1) {
            IPb.EYQ(hu.EYQ()).EYQ(this.FH);
        }
    }

    void mZx() {
        if (this.Td.get()) {
            return;
        }
        if (this.Uc) {
            Td td = this.Nvm;
            if (td != null && td.Kbd() != null && this.Nvm.Kbd().Td()) {
                this.Nvm.Kbd().Kbd();
            }
            MxO();
        }
        com.bytedance.sdk.openadsdk.component.IPb.mZx mzx = this.tp;
        if (mzx != null) {
            mzx.Td();
        }
    }

    void Td() {
        if (this.Uc) {
            Td td = this.Nvm;
            if (td != null && td.Kbd() != null && this.Nvm.Kbd().mZx()) {
                this.Nvm.Kbd().Pm();
            }
            tsL();
        }
        com.bytedance.sdk.openadsdk.component.IPb.mZx mzx = this.tp;
        if (mzx != null) {
            mzx.Pm();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int KO() {
        if (this.WU.oB()) {
            return 5;
        }
        if (this.xt) {
            return this.Nvm.Pm();
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public JSONObject EYQ(JSONObject jSONObject) {
        if (KO() == 0) {
            return this.Nvm.EYQ(jSONObject);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hu() {
        if (this.pi.get()) {
            return;
        }
        try {
            getWindow().getDecorView().post(this.Tnp);
        } catch (Throwable unused) {
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void UB() {
        if (com.bytedance.sdk.openadsdk.multipro.mZx.Td()) {
            EYQ("onAdShow");
            return;
        }
        mZx mzx = this.NZ;
        if (mzx != null) {
            mzx.EYQ();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Uc() {
        if (com.bytedance.sdk.openadsdk.multipro.mZx.Td()) {
            EYQ(id.f);
        } else {
            mZx mzx = this.NZ;
            if (mzx != null) {
                mzx.onAdClicked();
            }
        }
        if (KO.Jpu().NZ(String.valueOf(this.hYh))) {
            this.tPj.set(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hYh() {
        if (com.bytedance.sdk.openadsdk.multipro.mZx.Td()) {
            EYQ("onAdSkip");
            return;
        }
        mZx mzx = this.NZ;
        if (mzx != null) {
            mzx.mZx();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zF() throws JSONException {
        Td td;
        hYh.Td(this.hYh);
        hYh();
        if (this.Uc && (td = this.Nvm) != null && td.Kbd() != null) {
            this.Nvm.Kbd().EYQ(4);
        }
        com.bytedance.sdk.openadsdk.component.Pm.EYQ.EYQ(this.WU, (int) this.HX.mZx(), this.tp.EYQ(), this.HX.EYQ());
        UB ub = this.WU;
        if (ub != null && ub.oIw() && this.WU.zzY() != null && this.WU.zzY().EYQ() != null) {
            Pm pmEYQ = this.WU.zzY().EYQ();
            long jVwS = 0;
            Td td2 = this.Nvm;
            if (td2 != null && td2.Kbd() != null) {
                jVwS = this.Nvm.Kbd().VwS();
            }
            pmEYQ.IPb(jVwS);
            pmEYQ.Kbd(jVwS);
        }
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void EYQ(final String str) {
        xt.Td(new QQ("AppOpenAd_executeMultiProcessCallback") { // from class: com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.5
            @Override // java.lang.Runnable
            public void run() {
                try {
                    TTAppOpenAdActivity.this.Pm().executeAppOpenAdCallback(TTAppOpenAdActivity.this.zF, str);
                } catch (Throwable th) {
                    com.bytedance.sdk.component.utils.pi.EYQ("TTAppOpenAdActivity", "open_ad", "executeAppOpenAdCallback execute throw Exception : ", th);
                }
            }
        }, 5);
    }

    protected IListenerManager Pm() {
        if (this.XN == null) {
            this.XN = com.bytedance.sdk.openadsdk.multipro.aidl.EYQ.EYQ.asInterface(com.bytedance.sdk.openadsdk.multipro.aidl.EYQ.EYQ().EYQ(7));
        }
        return this.XN;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        tr.EYQ((Activity) this);
        getWindow().getDecorView().setOnSystemUiVisibilityChangeListener(new View.OnSystemUiVisibilityChangeListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.6
            @Override // android.view.View.OnSystemUiVisibilityChangeListener
            public void onSystemUiVisibilityChange(int i) {
                if (i == 0) {
                    try {
                        if (TTAppOpenAdActivity.this.isFinishing()) {
                            return;
                        }
                        TTAppOpenAdActivity.this.getWindow().getDecorView().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.6.1
                            @Override // java.lang.Runnable
                            public void run() {
                                tr.EYQ((Activity) TTAppOpenAdActivity.this);
                            }
                        }, 2500L);
                    } catch (Exception e) {
                        com.bytedance.sdk.component.utils.pi.EYQ("TTAppOpenAdActivity", e.getMessage());
                    }
                }
            }
        });
    }

    private boolean mZx(Bundle bundle) {
        if (com.bytedance.sdk.openadsdk.multipro.mZx.Td()) {
            Intent intent = getIntent();
            if (intent != null) {
                String stringExtra = intent.getStringExtra(TTAdConstant.MULTI_PROCESS_MATERIALMETA);
                if (stringExtra != null) {
                    try {
                        this.WU = com.bytedance.sdk.openadsdk.core.mZx.EYQ(new JSONObject(stringExtra));
                    } catch (Exception e) {
                        com.bytedance.sdk.component.utils.pi.EYQ("TTAppOpenAdActivity", "open_ad", "initData MultiGlobalInfo throws ", e);
                    }
                }
                this.zF = intent.getStringExtra(TTAdConstant.MULTI_PROCESS_META_MD5);
            }
        } else {
            this.WU = zF.EYQ().mZx();
            this.NZ = zF.EYQ().Kbd();
            zF.EYQ().IPb();
        }
        EYQ(getIntent());
        EYQ(bundle);
        UB ub = this.WU;
        if (ub == null) {
            finish();
            return false;
        }
        this.FH = ub.Nvm();
        this.WU.EYQ(this.IPb);
        this.hYh = this.WU.yK();
        com.bytedance.sdk.openadsdk.utils.mZx.EYQ(this.WU);
        return true;
    }

    protected void EYQ(Intent intent) {
        if (intent != null) {
            this.wBa = intent.getIntExtra(FirebaseAnalytics.Param.AD_SOURCE, 0);
            this.IPb = intent.getLongExtra("start_show_time", 0L);
        }
    }

    protected void EYQ(Bundle bundle) {
        if (bundle != null) {
            if (this.NZ == null) {
                this.NZ = QQ;
                QQ = null;
            }
            try {
                String string = bundle.getString("material_meta");
                this.zF = bundle.getString(TTAdConstant.MULTI_PROCESS_META_MD5);
                this.wBa = bundle.getInt(FirebaseAnalytics.Param.AD_SOURCE, 0);
                this.IPb = bundle.getLong("start_show_time", 0L);
                this.WU = com.bytedance.sdk.openadsdk.core.mZx.EYQ(new JSONObject(string));
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.pi.EYQ("TTAppOpenAdActivity", th.getMessage());
            }
        }
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        try {
            UB ub = this.WU;
            bundle.putString("material_meta", ub != null ? ub.aEX().toString() : null);
            bundle.putString(TTAdConstant.MULTI_PROCESS_META_MD5, this.zF);
            bundle.putInt(FirebaseAnalytics.Param.AD_SOURCE, this.wBa);
            bundle.putLong("start_show_time", this.IPb);
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.pi.EYQ("TTAppOpenAdActivity", th.getMessage());
        }
        QQ = this.NZ;
        super.onSaveInstanceState(bundle);
    }

    @Override // com.bytedance.sdk.component.utils.wBa.EYQ
    public void EYQ(Message message) {
        Td td;
        if (message.what == 100) {
            if (this.Uc && (td = this.Nvm) != null && td.Kbd() != null) {
                this.Nvm.Kbd().EYQ(1);
            }
            hYh();
            finish();
        }
    }

    protected boolean Kbd() {
        try {
            return getIntent().getIntExtra("orientation_angle", 0) == 3;
        } catch (Exception e) {
            com.bytedance.sdk.component.utils.pi.EYQ("TTAppOpenAdActivity", e.getMessage());
            return false;
        }
    }

    @Override // android.app.Activity
    protected void onStart() {
        super.onStart();
        com.bytedance.sdk.openadsdk.utils.Td.EYQ(this, this.WU);
    }
}
