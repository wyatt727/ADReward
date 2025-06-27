package com.bytedance.sdk.openadsdk.core;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.bytedance.sdk.component.utils.wBa;
import com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public class EmptyView extends View implements wBa.EYQ {
    private boolean EYQ;
    private final Handler HX;
    private List<View> IPb;
    private List<View> Kbd;
    private ViewTreeObserver.OnGlobalLayoutListener MxO;
    private View Pm;
    private int QQ;
    private EYQ Td;
    private boolean VwS;
    private boolean mZx;
    private final Runnable pi;
    private final AtomicBoolean tp;
    private boolean tsL;

    public interface EYQ {
        void EYQ();

        void EYQ(View view);

        void EYQ(boolean z);

        void mZx();
    }

    public EmptyView(Context context, View view) {
        super(hu.EYQ());
        this.HX = new com.bytedance.sdk.component.utils.wBa(pi.mZx().getLooper(), this);
        this.tp = new AtomicBoolean(true);
        this.tsL = false;
        this.pi = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.EmptyView.3
            @Override // java.lang.Runnable
            public void run() {
                if (EmptyView.this.Td != null) {
                    EmptyView.this.Td.EYQ(EmptyView.this.Pm);
                }
            }
        };
        this.Pm = view;
        setLayoutParams(new ViewGroup.LayoutParams(0, 0));
        this.MxO = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.bytedance.sdk.openadsdk.core.EmptyView.1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                if (EmptyView.this.tsL) {
                    return;
                }
                EmptyView.this.Kbd();
                EmptyView.this.Pm();
            }
        };
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        EYQ eyq = this.Td;
        if (eyq != null) {
            eyq.EYQ(z);
        }
    }

    @Override // android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.VwS = false;
        mZx();
        if (this.MxO != null) {
            getViewTreeObserver().addOnGlobalLayoutListener(this.MxO);
        }
    }

    @Override // android.view.View
    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        mZx();
    }

    private void mZx() {
        EYQ eyq;
        if (!this.tp.getAndSet(false) || (eyq = this.Td) == null) {
            return;
        }
        eyq.EYQ();
    }

    private void Td() {
        EYQ eyq;
        if (this.tp.getAndSet(true) || (eyq = this.Td) == null) {
            return;
        }
        eyq.mZx();
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Kbd();
        this.VwS = true;
        Td();
        EYQ(false);
    }

    @Override // android.view.View
    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        Td();
    }

    public void setRefClickViews(List<View> list) {
        this.Kbd = list;
    }

    public void setRefCreativeViews(List<View> list) {
        this.IPb = list;
    }

    public void EYQ() {
        EYQ(this.Kbd, (com.bytedance.sdk.openadsdk.core.mZx.Td) null);
        EYQ(this.IPb, (com.bytedance.sdk.openadsdk.core.mZx.Td) null);
    }

    public void EYQ(List<View> list, com.bytedance.sdk.openadsdk.core.mZx.Td td) {
        if (com.bytedance.sdk.component.utils.MxO.mZx(list)) {
            for (View view : list) {
                if (view != null) {
                    view.setOnClickListener(td);
                    view.setOnTouchListener(td);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Pm() {
        if (!this.mZx || this.EYQ) {
            return;
        }
        this.EYQ = true;
        this.HX.sendEmptyMessage(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Kbd() {
        if (this.EYQ) {
            this.HX.removeCallbacksAndMessages(null);
            this.EYQ = false;
        }
    }

    public void setNeedCheckingShow(boolean z) {
        this.mZx = z;
        if (!z && this.EYQ) {
            Kbd();
        } else {
            if (!z || this.EYQ) {
                return;
            }
            Pm();
        }
    }

    public void setCallback(EYQ eyq) {
        this.Td = eyq;
    }

    public void setAdType(int i) {
        this.QQ = i;
    }

    @Override // com.bytedance.sdk.component.utils.wBa.EYQ
    public void EYQ(Message message) {
        if (message.what == 1 && this.EYQ) {
            if (IPb() && rfB.EYQ(this.Pm, 20, this.QQ)) {
                Kbd();
                this.tsL = true;
                pi.Td().post(this.pi);
                EYQ(true);
                return;
            }
            this.HX.sendEmptyMessageDelayed(1, 1000L);
        }
    }

    private boolean IPb() {
        View view = this.Pm;
        if (view instanceof NativeExpressView) {
            return ((NativeExpressView) view).KO();
        }
        return true;
    }

    private void EYQ(final boolean z) {
        final ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        com.bytedance.sdk.component.utils.QQ.mZx().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.EmptyView.2
            @Override // java.lang.Runnable
            public void run() {
                ViewTreeObserver viewTreeObserver2;
                if (EmptyView.this.MxO != null && (viewTreeObserver2 = viewTreeObserver) != null) {
                    try {
                        viewTreeObserver2.removeOnGlobalLayoutListener(EmptyView.this.MxO);
                    } catch (Exception unused) {
                    }
                }
                if (z) {
                    EmptyView.this.MxO = null;
                }
            }
        });
    }
}
