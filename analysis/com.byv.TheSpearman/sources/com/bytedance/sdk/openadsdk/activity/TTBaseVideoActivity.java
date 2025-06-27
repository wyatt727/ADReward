package com.bytedance.sdk.openadsdk.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.sdk.component.utils.wBa;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.HX.Pm;
import com.bytedance.sdk.openadsdk.IListenerManager;
import com.bytedance.sdk.openadsdk.component.reward.EYQ.EYQ;
import com.bytedance.sdk.openadsdk.component.reward.mZx.IPb;
import com.bytedance.sdk.openadsdk.component.reward.mZx.Kbd;
import com.bytedance.sdk.openadsdk.core.hu;
import com.bytedance.sdk.openadsdk.core.model.zF;
import com.bytedance.sdk.openadsdk.core.pi;
import com.bytedance.sdk.openadsdk.core.video.Td.Td;
import com.bytedance.sdk.openadsdk.core.video.Td.mZx;
import com.bytedance.sdk.openadsdk.mZx.mZx;
import com.bytedance.sdk.openadsdk.utils.UB;
import com.bytedance.sdk.openadsdk.utils.WU;
import com.bytedance.sdk.openadsdk.utils.tr;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public abstract class TTBaseVideoActivity extends TTBaseActivity implements wBa.EYQ, Td, mZx {
    public final String EYQ;
    int HX;
    int IPb;
    protected IListenerManager Kbd;
    protected Pm MxO;
    final wBa Pm;
    boolean QQ;
    protected com.bytedance.sdk.openadsdk.component.reward.mZx.mZx Td;
    EYQ mZx;
    private final AtomicBoolean nWX;
    private int pi;
    public boolean tp;
    private boolean tsL;

    protected abstract void EYQ();

    protected void EYQ(Intent intent) {
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.Td.mZx
    public void EYQ(Bundle bundle) {
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.Td.Td
    public void HX() {
    }

    public abstract boolean KO();

    protected abstract void QQ();

    public boolean UB() {
        return false;
    }

    public boolean hu() {
        return false;
    }

    protected abstract void nWX();

    public void tp() {
    }

    public TTBaseVideoActivity() {
        this.EYQ = KO() ? "rewarded_video" : "fullscreen_interstitial_ad";
        this.Pm = new wBa(Looper.getMainLooper(), this);
        this.tsL = false;
        this.pi = 0;
        this.HX = 1;
        this.tp = true;
        this.nWX = new AtomicBoolean(false);
        this.MxO = new Pm() { // from class: com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.1
            @Override // com.bytedance.sdk.openadsdk.HX.Pm
            public void EYQ() {
                TTBaseVideoActivity.this.tp();
            }
        };
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        EYQ eyq;
        super.onCreate(bundle);
        UB.EYQ("BVA", "onCreate ".concat(String.valueOf(this)));
        hu.EYQ(getApplicationContext());
        if (!pi.Kbd()) {
            finish();
            return;
        }
        com.bytedance.sdk.openadsdk.core.model.UB ubEYQ = com.bytedance.sdk.openadsdk.component.reward.EYQ.mZx.EYQ(getIntent(), bundle, this);
        if (ubEYQ == null) {
            finish();
            return;
        }
        com.bytedance.sdk.openadsdk.utils.mZx.EYQ(ubEYQ);
        this.HX = ubEYQ.TZE();
        EYQ(ubEYQ, bundle);
        if (bundle != null) {
            if (ubEYQ.yZ()) {
                this.nWX.set(true);
            }
            if (ubEYQ.rcC() && (eyq = this.mZx) != null) {
                eyq.tPj.set(true);
            }
            EYQ eyq2 = this.mZx;
            if (eyq2 != null) {
                eyq2.Pf.VwS();
            }
        }
        try {
            zF();
            WU();
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.pi.EYQ("TTAD.BVA", "onCreate: ", th);
            this.tp = false;
            com.bytedance.sdk.openadsdk.mZx.Td.mZx();
            finish();
        }
    }

    private void EYQ(com.bytedance.sdk.openadsdk.core.model.UB ub, Bundle bundle) {
        EYQ eyq = new EYQ(this, this.Pm, ub);
        this.mZx = eyq;
        com.bytedance.sdk.openadsdk.component.reward.EYQ.mZx.EYQ(eyq, getIntent(), bundle);
        Intent intent = getIntent();
        if (intent != null) {
            EYQ(intent);
            ub.EYQ(intent.getLongExtra("start_show_time", 0L));
        }
        if (bundle != null && this.mZx.hu) {
            EYQ();
        }
        com.bytedance.sdk.openadsdk.component.reward.mZx.mZx mzxEYQ = IPb.EYQ(this.mZx);
        this.Td = mzxEYQ;
        this.mZx.xh = mzxEYQ;
        Objects.toString(this.Td);
    }

    private void zF() {
        setContentView(this.mZx.OtA);
        this.mZx.OtA.EYQ(this.Td);
        this.Td.EYQ(this, this.Pm);
        this.Td.tsL();
    }

    @Override // android.app.Activity
    protected void onRestart() {
        super.onRestart();
        EYQ eyq = this.mZx;
        if (eyq == null || eyq.EYQ == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.model.UB ub = this.mZx.EYQ;
        if (this.VwS && !ub.XT() && !TextUtils.isEmpty(com.bytedance.sdk.openadsdk.core.model.UB.EYQ(this, ub))) {
            finish();
        }
        if (ub.XT()) {
            ub.Kbd(false);
        }
    }

    private void WU() {
        this.Td.EYQ(this.MxO);
        this.IPb = (int) this.mZx.FtN.lEs();
        nWX();
        IPb();
        if (this.mZx.EYQ.zzY() == null || this.mZx.EYQ.zzY().EYQ() == null) {
            return;
        }
        this.mZx.EYQ.zzY().EYQ().EYQ(0L);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        EYQ eyq = this.mZx;
        if (eyq != null && eyq.Pf != null) {
            this.mZx.Pf.mZx(z);
            this.mZx.Pf.Td(z);
        }
        EYQ eyq2 = this.mZx;
        if (eyq2 == null || !(eyq2.xh instanceof Kbd)) {
            return;
        }
        ((Kbd) this.mZx.xh).mZx(z);
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.Td.Td
    public void mZx() {
        if (!this.mZx.wBa.getAndSet(true) || zF.MxO(this.mZx.EYQ)) {
            this.mZx.Pf.EYQ();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.Td.Td
    public void Td() {
        com.bytedance.sdk.openadsdk.component.reward.mZx.mZx mzx = this.Td;
        if (mzx == null) {
            return;
        }
        mzx.nWX();
    }

    public void EYQ(boolean z, int i) {
        EYQ(z, false, i);
    }

    public void EYQ(boolean z, boolean z2, int i) {
        com.bytedance.sdk.openadsdk.component.reward.mZx.mZx mzx = this.Td;
        if (mzx == null) {
            return;
        }
        mzx.EYQ(z, z2, false, i);
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.Td.Td
    public void Pm() {
        this.mZx.FtN.xt();
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.Td.Td
    public View Kbd() {
        return this.mZx.FtN.Nvm();
    }

    protected void IPb() {
        if (zF.MxO(this.mZx.EYQ)) {
            EYQ(false, mZx.C0133mZx.Td);
            return;
        }
        com.bytedance.sdk.openadsdk.component.reward.mZx.mZx mzx = this.Td;
        if (mzx != null) {
            mzx.EYQ(this.mZx.TQF.IPb());
            this.Td.lEs();
        }
    }

    @Override // android.app.Activity
    protected void onStart() {
        super.onStart();
        UB.EYQ("BVA", "onStart ".concat(String.valueOf(this)));
        EYQ eyq = this.mZx;
        if (eyq == null) {
            return;
        }
        eyq.wJ.Nvm();
        com.bytedance.sdk.openadsdk.utils.Td.EYQ(this, this.mZx.EYQ);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    protected void onResume() throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException {
        com.bytedance.sdk.openadsdk.component.reward.mZx.mZx mzx;
        super.onResume();
        UB.EYQ("BVA", "onResume ".concat(String.valueOf(this)));
        if (this.mZx == null || (mzx = this.Td) == null) {
            return;
        }
        mzx.Uc();
        this.mZx.Kbd = true;
        this.mZx.Kbc.mZx(this.Pm);
        if (XN()) {
            this.mZx.KR.EYQ(this.mZx.EYQ.BQ());
        }
        this.mZx.TQF.KO();
        this.mZx.wJ.hYh();
        this.mZx.kf.pi();
        if (this.Td.mZx()) {
            this.mZx.FtN.EYQ(this.Td);
            this.mZx.FtN.EYQ(false, this, this.pi != 0);
        }
        this.pi++;
        MxO();
        if (this.mZx.mN != null) {
            this.mZx.mN.VwS();
        }
        this.mZx.Kbc.EYQ(this.Pm);
        this.Td.zF();
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        UB.EYQ("BVA", "onPause ".concat(String.valueOf(this)));
        com.bytedance.sdk.openadsdk.component.reward.mZx.mZx mzx = this.Td;
        if (mzx == null) {
            return;
        }
        mzx.WU();
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        UB.EYQ("BVA", "onStop ".concat(String.valueOf(this)));
        com.bytedance.sdk.openadsdk.component.reward.mZx.mZx mzx = this.Td;
        if (mzx == null) {
            return;
        }
        mzx.XN();
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        UB.EYQ("BVA", "onDestroy ".concat(String.valueOf(this)));
        EYQ eyq = this.mZx;
        if (eyq == null || this.Td == null) {
            return;
        }
        if (eyq.Uc > 0 && this.mZx.tPj.get()) {
            com.bytedance.sdk.openadsdk.mZx.Td.EYQ(String.valueOf(SystemClock.elapsedRealtime() - this.mZx.Uc), this.mZx.EYQ, this.EYQ, this.mZx.FtN.EYQ());
            this.mZx.Uc = 0L;
        }
        this.mZx.lRN.mZx();
        this.Pm.removeCallbacksAndMessages(null);
        this.Td.NZ();
        com.bytedance.sdk.openadsdk.nWX.EYQ.Kbd.EYQ(this.mZx.EYQ);
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        EYQ eyq = this.mZx;
        if (eyq == null) {
            super.onSaveInstanceState(bundle);
            return;
        }
        if (eyq.tPj.get()) {
            this.mZx.EYQ.hCt();
        }
        if (this.nWX.get()) {
            this.mZx.EYQ.xBe();
        }
        com.bytedance.sdk.openadsdk.component.reward.EYQ.mZx.EYQ(this.mZx, bundle);
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        com.bytedance.sdk.openadsdk.component.reward.mZx.mZx mzx;
        if (this.mZx == null || (mzx = this.Td) == null) {
            super.onBackPressed();
        } else {
            mzx.tPj();
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        EYQ eyq = this.mZx;
        if (eyq == null) {
            return;
        }
        eyq.Kbc.EYQ();
    }

    @Override // com.bytedance.sdk.component.utils.wBa.EYQ
    public void EYQ(Message message) {
        com.bytedance.sdk.openadsdk.component.reward.mZx.mZx mzx = this.Td;
        if (mzx == null) {
            return;
        }
        mzx.EYQ(message);
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.Td.mZx
    public final void VwS() {
        if (this.nWX.compareAndSet(false, true)) {
            UB.EYQ("BVA", "invoke callback onShow, ".concat(String.valueOf(this)));
            QQ();
        }
    }

    protected IListenerManager EYQ(int i) {
        if (this.Kbd == null) {
            this.Kbd = com.bytedance.sdk.openadsdk.multipro.aidl.EYQ.EYQ.asInterface(com.bytedance.sdk.openadsdk.multipro.aidl.EYQ.EYQ().EYQ(i));
        }
        return this.Kbd;
    }

    protected void MxO() {
        if (hu() && !this.tsL) {
            this.tsL = true;
            getWindow().getDecorView().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.2
                @Override // java.lang.Runnable
                public void run() {
                    com.bytedance.sdk.openadsdk.component.reward.EYQ.IPb iPb = TTBaseVideoActivity.this.mZx.vD;
                    float[] fArrEYQ = TTBaseVideoActivity.this.mZx.Kbc.EYQ(TTBaseVideoActivity.this.HX);
                    TTBaseVideoActivity tTBaseVideoActivity = TTBaseVideoActivity.this;
                    iPb.EYQ(fArrEYQ, tTBaseVideoActivity, tTBaseVideoActivity.Td);
                }
            });
        }
    }

    protected void tsL() {
        Message message = new Message();
        message.what = 400;
        if (KO()) {
            Td(10000);
        }
        this.Pm.sendMessageDelayed(message, 2000L);
    }

    protected void pi() {
        this.Pm.removeMessages(400);
    }

    private boolean XN() {
        if (this.mZx.WU.get() && this.mZx.hYh) {
            return false;
        }
        if ((this instanceof TTFullScreenExpressVideoActivity) || (this instanceof TTRewardExpressVideoActivity)) {
            return this.mZx.WU.get();
        }
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void finish() {
        super.finish();
        if (this.mZx == null) {
            return;
        }
        if (WU.Kbd()) {
            tr.mZx((Activity) this);
        }
        if (!zF.mZx(this.mZx.EYQ) || this.mZx.WU.get()) {
            return;
        }
        ApmHelper.reportCustomError("invalid finish", "playable", new RuntimeException());
    }
}
