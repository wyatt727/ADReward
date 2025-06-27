package com.bytedance.sdk.openadsdk.core.mZx;

import android.graphics.Point;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.core.hu;
import com.bytedance.sdk.openadsdk.core.settings.MxO;

/* compiled from: InteractionListener.java */
/* loaded from: classes2.dex */
public abstract class Td implements View.OnClickListener, View.OnTouchListener {
    private static float EYQ = 0.0f;
    private static long Kbd = 0;
    protected static int Nvm = 8;
    private static float Pm;
    private static float Td;
    private static float mZx;
    protected View tr;
    protected float zF = -1.0f;
    protected float WU = -1.0f;
    protected float XN = -1.0f;
    protected float NZ = -1.0f;
    protected long tPj = -1;
    protected long wBa = -1;
    protected int rfB = -1;
    protected int lEs = -1024;
    protected int xt = -1;
    protected boolean FH = true;
    public SparseArray<EYQ> Tnp = new SparseArray<>();
    private int IPb = 0;
    private int VwS = 0;

    protected abstract void EYQ(View view, float f, float f2, float f3, float f4, SparseArray<EYQ> sparseArray, boolean z);

    static {
        if (hu.EYQ() != null) {
            Nvm = hu.mZx();
        }
        EYQ = 0.0f;
        mZx = 0.0f;
        Td = 0.0f;
        Pm = 0.0f;
        Kbd = 0L;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (MxO.EYQ()) {
            EYQ(view, this.zF, this.WU, this.XN, this.NZ, this.Tnp, this.FH);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0073  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouch(android.view.View r13, android.view.MotionEvent r14) {
        /*
            Method dump skipped, instructions count: 349
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.mZx.Td.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    private boolean EYQ(View view, Point point) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                View childAt = viewGroup.getChildAt(i);
                if (mZx.Td(childAt)) {
                    int[] iArr = new int[2];
                    childAt.getLocationOnScreen(iArr);
                    return view.isShown() && point.x >= iArr[0] && point.x <= iArr[0] + childAt.getWidth() && point.y >= iArr[1] && point.y <= iArr[1] + childAt.getHeight();
                }
                if (EYQ(childAt, point)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* compiled from: InteractionListener.java */
    public static class EYQ {
        public int EYQ;
        public long Pm;
        public double Td;
        public double mZx;

        public EYQ(int i, double d, double d2, long j) {
            this.EYQ = -1;
            this.mZx = -1.0d;
            this.Td = -1.0d;
            this.Pm = -1L;
            this.EYQ = i;
            this.mZx = d;
            this.Td = d2;
            this.Pm = j;
        }
    }

    public boolean VwS() {
        return this.FH;
    }
}
