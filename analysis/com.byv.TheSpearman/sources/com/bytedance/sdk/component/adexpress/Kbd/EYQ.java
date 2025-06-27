package com.bytedance.sdk.component.adexpress.Kbd;

import android.app.Activity;
import android.content.Context;
import android.content.MutableContextWrapper;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.Pm.IPb;
import com.bytedance.sdk.component.adexpress.mZx.MxO;
import com.bytedance.sdk.component.adexpress.mZx.QQ;
import com.bytedance.sdk.component.adexpress.mZx.VwS;
import com.bytedance.sdk.component.adexpress.mZx.nWX;
import com.bytedance.sdk.component.adexpress.mZx.pi;
import com.bytedance.sdk.component.adexpress.theme.ThemeStatusBroadcastReceiver;
import com.bytedance.sdk.component.utils.tsL;
import com.bytedance.sdk.component.widget.SSWebView;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* compiled from: BaseWebViewRender.java */
/* loaded from: classes2.dex */
public abstract class EYQ implements com.bytedance.sdk.component.adexpress.EYQ, MxO, com.bytedance.sdk.component.adexpress.mZx.Pm<SSWebView>, com.bytedance.sdk.component.adexpress.theme.EYQ {
    protected JSONObject EYQ;
    private String HX;
    private int KO;
    protected com.bytedance.sdk.component.adexpress.EYQ.Td.mZx Kbd;
    private boolean MxO;
    private String QQ;
    protected SSWebView Td;
    private Context VwS;
    protected boolean mZx;
    private boolean nWX;
    private pi pi;
    private volatile VwS tp;
    private QQ tsL;
    protected int Pm = 8;
    protected AtomicBoolean IPb = new AtomicBoolean(false);
    private boolean hu = false;

    protected void HX() {
    }

    @Override // com.bytedance.sdk.component.adexpress.mZx.Pm
    public int Td() {
        return 0;
    }

    public abstract void VwS();

    public abstract void mZx(int i);

    protected void tp() {
    }

    public EYQ(Context context, pi piVar, ThemeStatusBroadcastReceiver themeStatusBroadcastReceiver) {
        this.MxO = false;
        this.VwS = context;
        this.pi = piVar;
        this.QQ = piVar.Pm();
        themeStatusBroadcastReceiver.EYQ(this);
        if (com.bytedance.sdk.component.adexpress.Pm.mZx()) {
            tsL();
            return;
        }
        SSWebView sSWebViewPi = pi();
        this.Td = sSWebViewPi;
        if (sSWebViewPi == null) {
            Log.d("WebViewRender", "initWebView: create WebView");
            if (com.bytedance.sdk.component.adexpress.Pm.EYQ() != null) {
                this.Td = new SSWebView(com.bytedance.sdk.component.adexpress.Pm.EYQ());
                return;
            }
            return;
        }
        this.MxO = true;
        Log.d("WebViewRender", "initWebView: reuse WebView");
    }

    private void tsL() {
        if (this.VwS == null && com.bytedance.sdk.component.adexpress.Pm.EYQ() != null) {
            this.VwS = com.bytedance.sdk.component.adexpress.Pm.EYQ();
        }
        if (this.VwS != null) {
            SSWebView sSWebViewPi = pi();
            this.Td = sSWebViewPi;
            if (sSWebViewPi == null) {
                Log.d("WebViewRender", "initWebView: create WebView by act");
                this.Td = new SSWebView(new MutableContextWrapper(this.VwS.getApplicationContext()));
            } else {
                this.MxO = true;
                Log.d("WebViewRender", "initWebView: reuse WebView");
            }
        }
    }

    private SSWebView pi() {
        if (this.pi.WU()) {
            return Kbd.EYQ().EYQ(this.VwS, this.QQ);
        }
        return Kbd.EYQ().mZx(this.VwS, this.QQ);
    }

    private void nWX() {
        if (this.pi.WU()) {
            Kbd.EYQ().mZx(this.Td);
        } else {
            Kbd.EYQ().Td(this.Td);
        }
    }

    public void EYQ(String str) {
        this.HX = str;
    }

    public SSWebView EYQ() {
        return this.Td;
    }

    public void EYQ(QQ qq) {
        this.tsL = qq;
    }

    @Override // com.bytedance.sdk.component.adexpress.mZx.Pm
    public void EYQ(VwS vwS) {
        this.tp = vwS;
        if (EYQ() == null || EYQ().getWebView() == null) {
            VwS vwS2 = this.tp;
            StringBuilder sb = new StringBuilder("SSWebview null is ");
            sb.append(EYQ() == null);
            sb.append(" or Webview is null");
            vwS2.EYQ(102, sb.toString());
            return;
        }
        if (TextUtils.isEmpty(this.HX)) {
            this.tp.EYQ(102, "url is empty");
            return;
        }
        if (!this.hu && !com.bytedance.sdk.component.adexpress.EYQ.mZx.mZx.EYQ(this.EYQ)) {
            VwS vwS3 = this.tp;
            StringBuilder sb2 = new StringBuilder("data null is ");
            sb2.append(this.EYQ == null);
            vwS3.EYQ(103, sb2.toString());
            return;
        }
        if (this.hu && !com.bytedance.sdk.component.adexpress.EYQ.mZx.mZx.mZx(this.EYQ)) {
            VwS vwS4 = this.tp;
            StringBuilder sb3 = new StringBuilder("choice ad data null is ");
            sb3.append(this.EYQ == null);
            vwS4.EYQ(103, sb3.toString());
            return;
        }
        this.pi.Kbd().EYQ(this.MxO);
        if (this.MxO) {
            try {
                this.Td.pi();
                this.pi.Kbd();
                tsL.EYQ(this.Td.getWebView(), "javascript:window.SDK_RESET_RENDER();window.SDK_TRIGGER_RENDER();");
                return;
            } catch (Exception e) {
                Kbd.EYQ().Kbd(this.Td);
                this.tp.EYQ(102, "load exception is " + e.getMessage());
                return;
            }
        }
        SSWebView sSWebViewEYQ = EYQ();
        sSWebViewEYQ.pi();
        this.pi.Kbd();
        sSWebViewEYQ.a_(this.HX);
    }

    @Override // com.bytedance.sdk.component.adexpress.mZx.Pm
    /* renamed from: mZx, reason: merged with bridge method [inline-methods] */
    public SSWebView Kbd() {
        return EYQ();
    }

    public void Pm() {
        if (this.IPb.get()) {
            return;
        }
        this.IPb.set(true);
        VwS();
        if (this.Td.getParent() != null) {
            ((ViewGroup) this.Td.getParent()).removeView(this.Td);
        }
        if (this.mZx) {
            nWX();
        } else {
            Kbd.EYQ().Kbd(this.Td);
        }
    }

    public void IPb() {
        if (EYQ() == null) {
            return;
        }
        try {
            EYQ().getWebView().resumeTimers();
        } catch (Exception unused) {
        }
    }

    public void EYQ(boolean z) {
        this.nWX = z;
    }

    @Override // com.bytedance.sdk.component.adexpress.mZx.MxO
    public void EYQ(final nWX nwx) {
        if (nwx == null) {
            if (this.tp != null) {
                this.tp.EYQ(105, "renderResult is null");
                return;
            }
            return;
        }
        boolean zTd = nwx.Td();
        final float fPm = (float) nwx.Pm();
        final float fKbd = (float) nwx.Kbd();
        if (fPm <= 0.0f || fKbd <= 0.0f) {
            if (this.tp != null) {
                this.tp.EYQ(105, "width is " + fPm + "height is " + fKbd);
                return;
            }
            return;
        }
        this.mZx = zTd;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            EYQ(nwx, fPm, fKbd);
        } else {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.Kbd.EYQ.1
                @Override // java.lang.Runnable
                public void run() {
                    EYQ.this.EYQ(nwx, fPm, fKbd);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void EYQ(nWX nwx, float f, float f2) {
        nwx.MxO();
        boolean z = this.mZx;
        if (!z || this.nWX) {
            if (!z) {
                Kbd.EYQ().Kbd(this.Td);
                return;
            } else {
                EYQ(nwx.MxO(), nwx.tp());
                return;
            }
        }
        EYQ(f, f2);
        mZx(this.Pm);
        if (this.tp != null) {
            this.tp.EYQ(EYQ(), nwx);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.mZx.MxO
    public void EYQ(View view, int i, com.bytedance.sdk.component.adexpress.Td td) {
        QQ qq = this.tsL;
        if (qq != null) {
            qq.EYQ(view, i, td);
        }
    }

    private void EYQ(float f, float f2) {
        this.pi.Kbd().Kbd();
        int iEYQ = (int) IPb.EYQ(this.VwS, f);
        int iEYQ2 = (int) IPb.EYQ(this.VwS, f2);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) EYQ().getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new FrameLayout.LayoutParams(iEYQ, iEYQ2);
        }
        layoutParams.width = iEYQ;
        layoutParams.height = iEYQ2;
        EYQ().setLayoutParams(layoutParams);
    }

    private void EYQ(int i, String str) {
        if (this.tp != null) {
            this.tp.EYQ(i, str);
        }
    }

    private int mZx(Activity activity) {
        return activity.hashCode();
    }

    public void QQ() {
        HX();
        Activity activityEYQ = com.bytedance.sdk.component.utils.mZx.EYQ(this.Td);
        if (activityEYQ != null) {
            this.KO = mZx(activityEYQ);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.EYQ
    public void EYQ(Activity activity) {
        if (this.KO == 0 || activity == null || activity.hashCode() != this.KO) {
            return;
        }
        Pm();
        tp();
    }

    public void EYQ(JSONObject jSONObject) {
        this.EYQ = jSONObject;
    }

    public pi MxO() {
        return this.pi;
    }

    public void mZx(boolean z) {
        this.hu = z;
    }
}
