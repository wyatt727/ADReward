package com.bytedance.sdk.openadsdk.component.reward.EYQ;

import android.R;
import android.app.Activity;
import android.os.Build;
import android.util.Log;
import android.view.View;
import com.bytedance.sdk.component.utils.wBa;
import com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity;
import com.bytedance.sdk.openadsdk.core.hu;
import com.bytedance.sdk.openadsdk.utils.tr;

/* compiled from: RewardFullScreenManager.java */
/* loaded from: classes2.dex */
public class HX {
    protected int EYQ;
    private EYQ Pm;
    private boolean Td = true;
    private final com.bytedance.sdk.openadsdk.component.reward.EYQ.EYQ mZx;

    public HX(com.bytedance.sdk.openadsdk.component.reward.EYQ.EYQ eyq) {
        this.EYQ = 0;
        this.mZx = eyq;
        Td();
        try {
            this.EYQ = tr.Td(eyq.TZn, tr.EYQ());
            eyq.TZn.requestWindowFeature(1);
            eyq.TZn.getWindow().addFlags(16777344);
            if (eyq.tp == 2 || !tr.Td((Activity) eyq.TZn)) {
                eyq.TZn.getWindow().addFlags(1024);
            }
        } catch (Throwable th) {
            Log.e("TTAD.RFSM", "init: ", th);
        }
    }

    public void EYQ(wBa wba) {
        if (wba != null && Build.VERSION.SDK_INT >= 21) {
            wba.postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.EYQ.HX.1
                @Override // java.lang.Runnable
                public void run() {
                    View viewFindViewById;
                    try {
                        View decorView = HX.this.mZx.TZn.getWindow().getDecorView();
                        if (decorView == null || (viewFindViewById = decorView.findViewById(R.id.statusBarBackground)) == null) {
                            return;
                        }
                        viewFindViewById.setVisibility(8);
                    } catch (Exception unused) {
                    }
                }
            }, 300L);
        }
    }

    private void Td() {
        com.bytedance.sdk.openadsdk.component.reward.EYQ.EYQ eyq = this.mZx;
        eyq.MxO = eyq.EYQ.CsQ();
        if (26 == Build.VERSION.SDK_INT) {
            if (this.mZx.TZn.getResources().getConfiguration().orientation == 1) {
                this.mZx.tp = 1;
                return;
            } else {
                this.mZx.tp = 2;
                return;
            }
        }
        com.bytedance.sdk.openadsdk.component.reward.EYQ.EYQ eyq2 = this.mZx;
        eyq2.tp = eyq2.EYQ.TZE();
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void EYQ(boolean r11) {
        /*
            Method dump skipped, instructions count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.component.reward.EYQ.HX.EYQ(boolean):void");
    }

    public void mZx(wBa wba) {
        try {
            final boolean z = true;
            final boolean z2 = this.Td && hu.Pm().Kbc() == 1;
            if (!this.Td || !tr.Td((Activity) this.mZx.TZn) || Build.VERSION.SDK_INT < 19) {
                z = false;
            }
            if (z || z2) {
                if (this.Pm == null) {
                    this.Pm = new EYQ() { // from class: com.bytedance.sdk.openadsdk.component.reward.EYQ.HX.2
                        boolean EYQ;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super();
                        }

                        /* JADX WARN: Removed duplicated region for block: B:33:0x0102 A[Catch: all -> 0x0112, TryCatch #0 {all -> 0x0112, blocks: (B:2:0x0000, B:4:0x000b, B:6:0x001f, B:8:0x006a, B:10:0x0088, B:12:0x0097, B:14:0x00ab, B:15:0x00af, B:26:0x00e3, B:28:0x00e9, B:30:0x00ef, B:31:0x00f4, B:33:0x0102, B:16:0x00b2, B:18:0x00bc, B:20:0x00d0, B:22:0x00d4, B:23:0x00da, B:25:0x00de, B:35:0x0108, B:37:0x010c, B:7:0x0045), top: B:40:0x0000 }] */
                        /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
                        @Override // com.bytedance.sdk.openadsdk.component.reward.EYQ.HX.EYQ
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        void EYQ(int r7, int r8) {
                            /*
                                Method dump skipped, instructions count: 275
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.component.reward.EYQ.HX.AnonymousClass2.EYQ(int, int):void");
                        }
                    };
                }
                this.mZx.TZn.getWindow().getDecorView().addOnLayoutChangeListener(this.Pm);
            }
            this.Td = false;
        } catch (Exception unused) {
        }
    }

    public float[] EYQ(int i) {
        TTBaseVideoActivity tTBaseVideoActivity = this.mZx.TZn;
        View decorView = tTBaseVideoActivity.getWindow().getDecorView();
        float[] fArrMZx = {decorView.getWidth() - (decorView.getPaddingLeft() * 2), decorView.getHeight() - (decorView.getPaddingTop() * 2)};
        fArrMZx[0] = tr.Td(tTBaseVideoActivity, fArrMZx[0]);
        fArrMZx[1] = tr.Td(tTBaseVideoActivity, fArrMZx[1]);
        if (fArrMZx[0] < 10.0f || fArrMZx[1] < 10.0f) {
            fArrMZx = mZx(this.EYQ);
        }
        if (Build.VERSION.SDK_INT != 26 && Build.VERSION.SDK_INT != 27 && tTBaseVideoActivity.getResources() != null && tTBaseVideoActivity.getResources().getConfiguration() != null) {
            if ((tTBaseVideoActivity.getResources().getConfiguration().orientation == 2 ? 2 : 1) != i) {
                if (i == 2) {
                    if (fArrMZx[0] < fArrMZx[1]) {
                        float f = fArrMZx[1];
                        fArrMZx[1] = fArrMZx[0];
                        fArrMZx[0] = f;
                    }
                } else if (fArrMZx[0] > fArrMZx[1]) {
                    float f2 = fArrMZx[1];
                    fArrMZx[1] = fArrMZx[0];
                    fArrMZx[0] = f2;
                }
            }
        }
        return fArrMZx;
    }

    public void EYQ() {
        tr.EYQ((Activity) this.mZx.TZn);
        this.mZx.TZn.getWindow().getDecorView().setOnSystemUiVisibilityChangeListener(new View.OnSystemUiVisibilityChangeListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.EYQ.HX.3
            @Override // android.view.View.OnSystemUiVisibilityChangeListener
            public void onSystemUiVisibilityChange(int i) {
                if (i == 0) {
                    try {
                        if (HX.this.mZx.TZn.isFinishing()) {
                            return;
                        }
                        HX.this.mZx.TZn.getWindow().getDecorView().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.EYQ.HX.3.1
                            @Override // java.lang.Runnable
                            public void run() {
                                tr.EYQ((Activity) HX.this.mZx.TZn);
                            }
                        }, 2500L);
                    } catch (Exception e) {
                        com.bytedance.sdk.component.utils.pi.EYQ("TTAD.RFSM", e.getMessage());
                    }
                }
            }
        });
    }

    private float[] mZx(int i) {
        float fIPb = IPb();
        float fKbd = Kbd();
        if ((this.mZx.tp == 1) != (fIPb > fKbd)) {
            float f = fIPb + fKbd;
            fKbd = f - fKbd;
            fIPb = f - fKbd;
        }
        if (this.mZx.tp == 1) {
            fIPb -= i;
        } else {
            fKbd -= i;
        }
        return new float[]{fKbd, fIPb};
    }

    private void Pm() {
        if (this.mZx.tp == 2) {
            if (this.mZx.nWX) {
                this.mZx.TZn.setRequestedOrientation(8);
                return;
            } else {
                this.mZx.TZn.setRequestedOrientation(0);
                return;
            }
        }
        this.mZx.TZn.setRequestedOrientation(1);
    }

    private float Kbd() {
        return tr.Td(this.mZx.TZn, tr.tp(this.mZx.TZn));
    }

    private float IPb() {
        return tr.Td(this.mZx.TZn, tr.HX(this.mZx.TZn));
    }

    public void mZx() {
        if (this.Pm != null) {
            this.mZx.TZn.getWindow().getDecorView().removeOnLayoutChangeListener(this.Pm);
            this.Pm = null;
        }
    }

    /* compiled from: RewardFullScreenManager.java */
    private static abstract class EYQ implements View.OnLayoutChangeListener {
        private int EYQ;
        private int mZx;

        abstract void EYQ(int i, int i2);

        private EYQ() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            int i9 = i3 - i;
            int i10 = i4 - i2;
            if (i9 == this.EYQ && i10 == this.mZx) {
                return;
            }
            this.EYQ = i9;
            this.mZx = i10;
            EYQ(i9, i10);
        }
    }
}
