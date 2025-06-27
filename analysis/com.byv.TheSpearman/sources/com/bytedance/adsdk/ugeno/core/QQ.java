package com.bytedance.adsdk.ugeno.core;

import android.animation.AnimatorSet;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: UGenAnimation.java */
/* loaded from: classes2.dex */
public class QQ {
    Paint EYQ;
    private int IPb;
    private int Kbd;
    private View Pm;
    private AnimatorSet Td = new AnimatorSet();
    private String VwS;
    private EYQ mZx;

    public QQ(View view, EYQ eyq) {
        this.Pm = view;
        this.mZx = eyq;
        Paint paint = new Paint();
        this.EYQ = paint;
        paint.setAntiAlias(true);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0152  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void EYQ() {
        /*
            Method dump skipped, instructions count: 538
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.ugeno.core.QQ.EYQ():void");
    }

    public void mZx() {
        AnimatorSet animatorSet = this.Td;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    public void EYQ(Canvas canvas, IAnimation iAnimation) {
        try {
            if (iAnimation.getRipple() == 0.0f || TextUtils.isEmpty(this.VwS)) {
                return;
            }
            this.EYQ.setColor(com.bytedance.adsdk.ugeno.mZx.EYQ.EYQ(this.VwS));
            this.EYQ.setAlpha(90);
            ViewGroup viewGroup = (ViewGroup) this.Pm.getParent();
            viewGroup.setClipChildren(true);
            canvas.drawCircle(this.Kbd, this.IPb, Math.min(r0, r2) * 2 * iAnimation.getRipple(), this.EYQ);
        } catch (Throwable th) {
            Log.d("UGenAnimation", "ripple animation error " + th.getMessage());
        }
    }

    public void EYQ(int i, int i2) {
        this.Kbd = i / 2;
        this.IPb = i2 / 2;
    }
}
