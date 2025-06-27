package com.bytedance.sdk.component.adexpress.dynamic.EYQ;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.VwS.IPb;
import com.bytedance.sdk.component.adexpress.Td;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicRootView;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.Kbd;
import com.bytedance.sdk.component.adexpress.mZx.MxO;
import com.bytedance.sdk.component.adexpress.mZx.Pm;
import com.bytedance.sdk.component.adexpress.mZx.QQ;
import com.bytedance.sdk.component.adexpress.mZx.VwS;
import com.bytedance.sdk.component.adexpress.mZx.nWX;
import com.bytedance.sdk.component.adexpress.mZx.pi;
import com.bytedance.sdk.component.adexpress.theme.ThemeStatusBroadcastReceiver;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* compiled from: DynamicRender.java */
/* loaded from: classes2.dex */
public class EYQ implements MxO, Pm<DynamicRootView> {
    private DynamicRootView EYQ;
    private pi IPb;
    private QQ Kbd;
    private VwS Pm;
    private AtomicBoolean QQ = new AtomicBoolean(false);
    private Context Td;
    private ScheduledFuture<?> VwS;
    private com.bytedance.sdk.component.adexpress.dynamic.Pm.QQ mZx;

    public EYQ(Context context, ThemeStatusBroadcastReceiver themeStatusBroadcastReceiver, boolean z, com.bytedance.sdk.component.adexpress.dynamic.Pm.QQ qq, pi piVar, com.bytedance.sdk.component.adexpress.dynamic.Kbd.EYQ eyq) {
        this.Td = context;
        DynamicRootView dynamicRootView = new DynamicRootView(context, themeStatusBroadcastReceiver, z, piVar, eyq);
        this.EYQ = dynamicRootView;
        this.mZx = qq;
        this.IPb = piVar;
        dynamicRootView.setRenderListener(this);
        this.IPb = piVar;
    }

    @Override // com.bytedance.sdk.component.adexpress.mZx.Pm
    public void EYQ(VwS vwS) {
        this.Pm = vwS;
        int iIPb = this.IPb.IPb();
        if (iIPb < 0) {
            this.EYQ.EYQ(this.mZx instanceof com.bytedance.sdk.component.adexpress.dynamic.Pm.VwS ? 127 : 117, "time is ".concat(String.valueOf(iIPb)));
            return;
        }
        this.VwS = IPb.IPb().schedule(new RunnableC0091EYQ(2), iIPb, TimeUnit.MILLISECONDS);
        if (Looper.getMainLooper() == Looper.myLooper() && this.IPb.HX() <= 0) {
            IPb();
        } else {
            com.bytedance.sdk.component.utils.QQ.mZx().postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.EYQ.EYQ.1
                @Override // java.lang.Runnable
                public void run() {
                    EYQ.this.IPb();
                }
            }, this.IPb.HX());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void IPb() {
        this.IPb.Kbd().mZx(Td());
        JSONObject jSONObjectTd = this.IPb.Td();
        if (!com.bytedance.sdk.component.adexpress.EYQ.mZx.mZx.EYQ(jSONObjectTd)) {
            int i = this.mZx instanceof com.bytedance.sdk.component.adexpress.dynamic.Pm.VwS ? 123 : 113;
            DynamicRootView dynamicRootView = this.EYQ;
            StringBuilder sb = new StringBuilder("data null is ");
            sb.append(jSONObjectTd == null);
            dynamicRootView.EYQ(i, sb.toString());
            return;
        }
        this.mZx.EYQ(new com.bytedance.sdk.component.adexpress.dynamic.Kbd.mZx() { // from class: com.bytedance.sdk.component.adexpress.dynamic.EYQ.EYQ.2
            @Override // com.bytedance.sdk.component.adexpress.dynamic.Kbd.mZx
            public void EYQ(final com.bytedance.sdk.component.adexpress.dynamic.Td.QQ qq) {
                EYQ.this.QQ();
                EYQ.this.IPb.Kbd().Td(EYQ.this.Td());
                EYQ.this.EYQ(qq);
                EYQ.this.mZx(qq);
                if (Looper.getMainLooper() == Looper.myLooper()) {
                    EYQ.this.Td(qq);
                } else {
                    new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.EYQ.EYQ.2.1
                        @Override // java.lang.Runnable
                        public void run() {
                            EYQ.this.Td(qq);
                        }
                    });
                }
                if (EYQ.this.EYQ == null || qq == null) {
                    return;
                }
                EYQ.this.EYQ.setBgColor(qq.EYQ());
                EYQ.this.EYQ.setBgMaterialCenterCalcColor(qq.mZx());
            }
        });
        this.mZx.EYQ(this.IPb);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void EYQ(com.bytedance.sdk.component.adexpress.dynamic.Td.QQ qq) {
        List<com.bytedance.sdk.component.adexpress.dynamic.Td.QQ> listMxO;
        if (qq == null || (listMxO = qq.MxO()) == null || listMxO.size() <= 0) {
            return;
        }
        Collections.sort(listMxO, new Comparator<com.bytedance.sdk.component.adexpress.dynamic.Td.QQ>() { // from class: com.bytedance.sdk.component.adexpress.dynamic.EYQ.EYQ.3
            @Override // java.util.Comparator
            /* renamed from: EYQ, reason: merged with bridge method [inline-methods] */
            public int compare(com.bytedance.sdk.component.adexpress.dynamic.Td.QQ qq2, com.bytedance.sdk.component.adexpress.dynamic.Td.QQ qq3) {
                com.bytedance.sdk.component.adexpress.dynamic.Td.IPb iPbKbd = qq2.tp().Kbd();
                com.bytedance.sdk.component.adexpress.dynamic.Td.IPb iPbKbd2 = qq3.tp().Kbd();
                if (iPbKbd == null || iPbKbd2 == null) {
                    return 0;
                }
                return iPbKbd.eVP() >= iPbKbd2.eVP() ? 1 : -1;
            }
        });
        for (com.bytedance.sdk.component.adexpress.dynamic.Td.QQ qq2 : listMxO) {
            if (qq2 != null) {
                EYQ(qq2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mZx(com.bytedance.sdk.component.adexpress.dynamic.Td.QQ qq) {
        float fVwS;
        float fIPb;
        List<com.bytedance.sdk.component.adexpress.dynamic.Td.QQ> listMxO;
        if (qq == null) {
            return;
        }
        List<com.bytedance.sdk.component.adexpress.dynamic.Td.QQ> listMxO2 = qq.MxO();
        if (listMxO2 == null || listMxO2.size() <= 0) {
            fVwS = 0.0f;
        } else {
            fVwS = 0.0f;
            for (com.bytedance.sdk.component.adexpress.dynamic.Td.QQ qq2 : listMxO2) {
                if (qq2.VwS() > qq.VwS() - qq2.HX() || (listMxO = qq2.MxO()) == null || listMxO.size() <= 0) {
                    fIPb = 0.0f;
                } else {
                    fIPb = 0.0f;
                    for (com.bytedance.sdk.component.adexpress.dynamic.Td.QQ qq3 : listMxO) {
                        if (qq3.tp().mZx().equals("logo-union")) {
                            fIPb = qq3.tp().IPb();
                            fVwS = (((-fIPb) + qq.VwS()) - qq2.VwS()) + qq2.tp().Kbd().lJ();
                        }
                    }
                }
                mZx(qq2);
                if (fIPb <= -15.0f) {
                    qq2.IPb(qq2.HX() - fIPb);
                    qq2.Pm(qq2.VwS() + fIPb);
                    for (com.bytedance.sdk.component.adexpress.dynamic.Td.QQ qq4 : qq2.MxO()) {
                        qq4.Pm(qq4.VwS() - fIPb);
                    }
                }
            }
        }
        com.bytedance.sdk.component.adexpress.dynamic.Td.QQ qqTsL = qq.tsL();
        if (qqTsL == null) {
            return;
        }
        float fIPb2 = qq.IPb() - qqTsL.IPb();
        float fVwS2 = qq.VwS() - qqTsL.VwS();
        qq.Td(fIPb2);
        qq.Pm(fVwS2);
        if (fVwS > 0.0f) {
            qq.Pm(qq.VwS() - fVwS);
            qq.IPb(qq.HX() + fVwS);
            for (com.bytedance.sdk.component.adexpress.dynamic.Td.QQ qq5 : qq.MxO()) {
                qq5.Pm(qq5.VwS() + fVwS);
            }
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.mZx.Pm
    /* renamed from: EYQ, reason: merged with bridge method [inline-methods] */
    public DynamicRootView Kbd() {
        return Pm();
    }

    public void mZx() {
        EYQ(Kbd());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void EYQ(View view) {
        if (view == 0) {
            return;
        }
        if (view instanceof ViewGroup) {
            int i = 0;
            while (true) {
                ViewGroup viewGroup = (ViewGroup) view;
                if (i >= viewGroup.getChildCount()) {
                    break;
                }
                EYQ(viewGroup.getChildAt(i));
                i++;
            }
        }
        if (view instanceof Kbd) {
            ((Kbd) view).mZx();
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.mZx.Pm
    public int Td() {
        return this.mZx instanceof com.bytedance.sdk.component.adexpress.dynamic.Pm.VwS ? 3 : 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Td(com.bytedance.sdk.component.adexpress.dynamic.Td.QQ qq) {
        if (qq == null) {
            this.EYQ.EYQ(this.mZx instanceof com.bytedance.sdk.component.adexpress.dynamic.Pm.VwS ? 123 : 113, "layoutUnit is null");
            return;
        }
        this.IPb.Kbd().Pm(Td());
        try {
            this.EYQ.EYQ(qq, Td());
        } catch (Exception e) {
            int i = this.mZx instanceof com.bytedance.sdk.component.adexpress.dynamic.Pm.VwS ? 128 : 118;
            this.EYQ.EYQ(i, "exception is " + e.getMessage());
        }
    }

    public DynamicRootView Pm() {
        return this.EYQ;
    }

    public void EYQ(QQ qq) {
        this.Kbd = qq;
    }

    private boolean VwS() {
        DynamicRootView dynamicRootView = this.EYQ;
        return (dynamicRootView == null || dynamicRootView.getChildCount() == 0) ? false : true;
    }

    @Override // com.bytedance.sdk.component.adexpress.mZx.MxO
    public void EYQ(nWX nwx) {
        if (this.QQ.get()) {
            return;
        }
        this.QQ.set(true);
        if (nwx.Td() && VwS()) {
            this.EYQ.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            this.Pm.EYQ(Kbd(), nwx);
            return;
        }
        this.Pm.EYQ(nwx.MxO(), nwx.tp());
    }

    @Override // com.bytedance.sdk.component.adexpress.mZx.MxO
    public void EYQ(View view, int i, Td td) {
        QQ qq = this.Kbd;
        if (qq != null) {
            qq.EYQ(view, i, td);
        }
    }

    /* compiled from: DynamicRender.java */
    /* renamed from: com.bytedance.sdk.component.adexpress.dynamic.EYQ.EYQ$EYQ, reason: collision with other inner class name */
    private class RunnableC0091EYQ implements Runnable {
        private int mZx;

        public RunnableC0091EYQ(int i) {
            this.mZx = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.mZx == 2) {
                EYQ.this.EYQ.EYQ(EYQ.this.mZx instanceof com.bytedance.sdk.component.adexpress.dynamic.Pm.VwS ? 127 : 117, (String) null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void QQ() {
        try {
            ScheduledFuture<?> scheduledFuture = this.VwS;
            if (scheduledFuture == null || scheduledFuture.isCancelled()) {
                return;
            }
            this.VwS.cancel(false);
            this.VwS = null;
        } catch (Throwable unused) {
        }
    }
}
