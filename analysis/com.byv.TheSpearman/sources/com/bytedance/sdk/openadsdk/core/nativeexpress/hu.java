package com.bytedance.sdk.openadsdk.core.nativeexpress;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.model.HX;
import com.bytedance.sdk.openadsdk.utils.tr;

/* compiled from: ViewGestureDetector.java */
/* loaded from: classes2.dex */
public class hu extends GestureDetector {
    private final EYQ EYQ;
    private final com.bytedance.sdk.openadsdk.core.mZx.IPb mZx;

    public hu(Context context) {
        this(context, new EYQ());
    }

    public hu(Context context, EYQ eyq) {
        super(context, eyq);
        this.EYQ = eyq;
        this.mZx = new com.bytedance.sdk.openadsdk.core.mZx.IPb();
        setIsLongpressEnabled(false);
    }

    void EYQ() {
        this.EYQ.EYQ();
    }

    public boolean mZx() {
        return this.EYQ.mZx();
    }

    public com.bytedance.sdk.openadsdk.core.model.HX EYQ(Context context, View view, View view2) {
        if (this.mZx == null) {
            return new HX.EYQ().EYQ();
        }
        return new HX.EYQ().IPb(this.mZx.EYQ).Kbd(this.mZx.mZx).Pm(this.mZx.Td).Td(this.mZx.Pm).mZx(this.mZx.Kbd).EYQ(this.mZx.IPb).mZx(tr.EYQ(view)).EYQ(tr.EYQ(view2)).Td(tr.Td(view)).Pm(tr.Td(view2)).Pm(this.mZx.VwS).Kbd(this.mZx.QQ).IPb(this.mZx.HX).EYQ(this.mZx.tsL).mZx(com.bytedance.sdk.openadsdk.core.QQ.mZx().EYQ() ? 1 : 2).EYQ("vessel").EYQ(tr.Kbd(context)).Td(tr.VwS(context)).mZx(tr.IPb(context)).EYQ();
    }

    @Override // android.view.GestureDetector
    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.mZx.EYQ(motionEvent);
        return super.onTouchEvent(motionEvent);
    }

    /* compiled from: ViewGestureDetector.java */
    static class EYQ extends GestureDetector.SimpleOnGestureListener {
        boolean EYQ = false;

        EYQ() {
        }

        void EYQ() {
            this.EYQ = false;
        }

        boolean mZx() {
            return this.EYQ;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            this.EYQ = true;
            return super.onSingleTapUp(motionEvent);
        }
    }
}
