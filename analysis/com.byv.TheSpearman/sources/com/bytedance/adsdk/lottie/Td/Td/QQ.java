package com.bytedance.adsdk.lottie.Td.Td;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.util.LongSparseArray;
import com.bytedance.adsdk.lottie.EYQ.mZx.KO;
import com.bytedance.adsdk.lottie.Td.EYQ.MxO;
import com.bytedance.adsdk.lottie.Td.mZx;
import com.bytedance.adsdk.lottie.Td.mZx.hu;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: TextLayer.java */
/* loaded from: classes2.dex */
public class QQ extends com.bytedance.adsdk.lottie.Td.Td.EYQ {
    private final Matrix HX;
    private final KO KO;
    private final Paint MxO;
    private com.bytedance.adsdk.lottie.EYQ.mZx.EYQ<Float, Float> NZ;
    private final RectF QQ;
    private final com.bytedance.adsdk.lottie.IPb UB;
    private com.bytedance.adsdk.lottie.EYQ.mZx.EYQ<Integer, Integer> Uc;
    private final StringBuilder VwS;
    private com.bytedance.adsdk.lottie.EYQ.mZx.EYQ<Integer, Integer> WU;
    private com.bytedance.adsdk.lottie.EYQ.mZx.EYQ<Float, Float> XN;
    private com.bytedance.adsdk.lottie.EYQ.mZx.EYQ<Integer, Integer> hYh;
    private final com.bytedance.adsdk.lottie.QQ hu;
    private com.bytedance.adsdk.lottie.EYQ.mZx.EYQ<Typeface, Typeface> lEs;
    private final List<EYQ> nWX;
    private final LongSparseArray<String> pi;
    private com.bytedance.adsdk.lottie.EYQ.mZx.EYQ<Float, Float> rfB;
    private com.bytedance.adsdk.lottie.EYQ.mZx.EYQ<Float, Float> tPj;
    private final Paint tp;
    private final Map<com.bytedance.adsdk.lottie.Td.Pm, List<com.bytedance.adsdk.lottie.EYQ.EYQ.Pm>> tsL;
    private com.bytedance.adsdk.lottie.EYQ.mZx.EYQ<Float, Float> wBa;
    private com.bytedance.adsdk.lottie.EYQ.mZx.EYQ<Integer, Integer> zF;

    QQ(com.bytedance.adsdk.lottie.QQ qq, Pm pm) {
        super(qq, pm);
        this.VwS = new StringBuilder(2);
        this.QQ = new RectF();
        this.HX = new Matrix();
        int i = 1;
        this.tp = new Paint(i) { // from class: com.bytedance.adsdk.lottie.Td.Td.QQ.1
            {
                setStyle(Paint.Style.FILL);
            }
        };
        this.MxO = new Paint(i) { // from class: com.bytedance.adsdk.lottie.Td.Td.QQ.2
            {
                setStyle(Paint.Style.STROKE);
            }
        };
        this.tsL = new HashMap();
        this.pi = new LongSparseArray<>();
        this.nWX = new ArrayList();
        this.hu = qq;
        this.UB = pm.EYQ();
        KO koEYQ = pm.hYh().EYQ();
        this.KO = koEYQ;
        koEYQ.EYQ(this);
        EYQ(koEYQ);
        MxO mxOZF = pm.zF();
        if (mxOZF != null && mxOZF.EYQ != null) {
            com.bytedance.adsdk.lottie.EYQ.mZx.EYQ<Integer, Integer> EYQ2 = mxOZF.EYQ.EYQ();
            this.Uc = EYQ2;
            EYQ2.EYQ(this);
            EYQ(this.Uc);
        }
        if (mxOZF != null && mxOZF.mZx != null) {
            com.bytedance.adsdk.lottie.EYQ.mZx.EYQ<Integer, Integer> EYQ3 = mxOZF.mZx.EYQ();
            this.zF = EYQ3;
            EYQ3.EYQ(this);
            EYQ(this.zF);
        }
        if (mxOZF != null && mxOZF.Td != null) {
            com.bytedance.adsdk.lottie.EYQ.mZx.EYQ<Float, Float> EYQ4 = mxOZF.Td.EYQ();
            this.XN = EYQ4;
            EYQ4.EYQ(this);
            EYQ(this.XN);
        }
        if (mxOZF == null || mxOZF.Pm == null) {
            return;
        }
        com.bytedance.adsdk.lottie.EYQ.mZx.EYQ<Float, Float> EYQ5 = mxOZF.Pm.EYQ();
        this.tPj = EYQ5;
        EYQ5.EYQ(this);
        EYQ(this.tPj);
    }

    @Override // com.bytedance.adsdk.lottie.Td.Td.EYQ, com.bytedance.adsdk.lottie.EYQ.EYQ.Kbd
    public void EYQ(RectF rectF, Matrix matrix, boolean z) {
        super.EYQ(rectF, matrix, z);
        rectF.set(0.0f, 0.0f, this.UB.Pm().width(), this.UB.Pm().height());
    }

    @Override // com.bytedance.adsdk.lottie.Td.Td.EYQ
    void mZx(Canvas canvas, Matrix matrix, int i) {
        com.bytedance.adsdk.lottie.Td.mZx mzxVwS = this.KO.VwS();
        com.bytedance.adsdk.lottie.Td.Td td = this.UB.MxO().get(mzxVwS.mZx);
        if (td == null) {
            return;
        }
        canvas.save();
        canvas.concat(matrix);
        EYQ(mzxVwS, matrix);
        if (this.hu.WU()) {
            EYQ(mzxVwS, matrix, td, canvas);
        } else {
            EYQ(mzxVwS, td, canvas);
        }
        canvas.restore();
    }

    private void EYQ(com.bytedance.adsdk.lottie.Td.mZx mzx, Matrix matrix) {
        com.bytedance.adsdk.lottie.EYQ.mZx.EYQ<Integer, Integer> eyq = this.hYh;
        if (eyq != null) {
            this.tp.setColor(eyq.VwS().intValue());
        } else {
            com.bytedance.adsdk.lottie.EYQ.mZx.EYQ<Integer, Integer> eyq2 = this.Uc;
            if (eyq2 != null) {
                this.tp.setColor(eyq2.VwS().intValue());
            } else {
                this.tp.setColor(mzx.QQ);
            }
        }
        com.bytedance.adsdk.lottie.EYQ.mZx.EYQ<Integer, Integer> eyq3 = this.WU;
        if (eyq3 != null) {
            this.MxO.setColor(eyq3.VwS().intValue());
        } else {
            com.bytedance.adsdk.lottie.EYQ.mZx.EYQ<Integer, Integer> eyq4 = this.zF;
            if (eyq4 != null) {
                this.MxO.setColor(eyq4.VwS().intValue());
            } else {
                this.MxO.setColor(mzx.HX);
            }
        }
        int iIntValue = ((this.Pm.EYQ() == null ? 100 : this.Pm.EYQ().VwS().intValue()) * 255) / 100;
        this.tp.setAlpha(iIntValue);
        this.MxO.setAlpha(iIntValue);
        com.bytedance.adsdk.lottie.EYQ.mZx.EYQ<Float, Float> eyq5 = this.NZ;
        if (eyq5 != null) {
            this.MxO.setStrokeWidth(eyq5.VwS().floatValue());
            return;
        }
        com.bytedance.adsdk.lottie.EYQ.mZx.EYQ<Float, Float> eyq6 = this.XN;
        if (eyq6 != null) {
            this.MxO.setStrokeWidth(eyq6.VwS().floatValue());
        } else {
            this.MxO.setStrokeWidth(mzx.tp * com.bytedance.adsdk.lottie.IPb.IPb.EYQ());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void EYQ(com.bytedance.adsdk.lottie.Td.mZx r21, android.graphics.Matrix r22, com.bytedance.adsdk.lottie.Td.Td r23, android.graphics.Canvas r24) {
        /*
            r20 = this;
            r8 = r20
            r9 = r21
            com.bytedance.adsdk.lottie.EYQ.mZx.EYQ<java.lang.Float, java.lang.Float> r0 = r8.rfB
            if (r0 == 0) goto L13
            java.lang.Object r0 = r0.VwS()
            java.lang.Float r0 = (java.lang.Float) r0
            float r0 = r0.floatValue()
            goto L15
        L13:
            float r0 = r9.Td
        L15:
            r1 = 1120403456(0x42c80000, float:100.0)
            float r10 = r0 / r1
            float r11 = com.bytedance.adsdk.lottie.IPb.IPb.EYQ(r22)
            java.lang.String r0 = r9.EYQ
            java.util.List r12 = r8.EYQ(r0)
            int r13 = r12.size()
            int r0 = r9.Kbd
            float r0 = (float) r0
            r1 = 1092616192(0x41200000, float:10.0)
            float r0 = r0 / r1
            com.bytedance.adsdk.lottie.EYQ.mZx.EYQ<java.lang.Float, java.lang.Float> r1 = r8.wBa
            if (r1 == 0) goto L3d
            java.lang.Object r1 = r1.VwS()
            java.lang.Float r1 = (java.lang.Float) r1
            float r1 = r1.floatValue()
        L3b:
            float r0 = r0 + r1
            goto L4c
        L3d:
            com.bytedance.adsdk.lottie.EYQ.mZx.EYQ<java.lang.Float, java.lang.Float> r1 = r8.tPj
            if (r1 == 0) goto L4c
            java.lang.Object r1 = r1.VwS()
            java.lang.Float r1 = (java.lang.Float) r1
            float r1 = r1.floatValue()
            goto L3b
        L4c:
            r14 = r0
            r0 = -1
            r15 = 0
            r7 = r0
            r6 = r15
        L51:
            if (r6 >= r13) goto Lb3
            java.lang.Object r0 = r12.get(r6)
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1
            android.graphics.PointF r0 = r9.pi
            if (r0 != 0) goto L60
            r0 = 0
            goto L64
        L60:
            android.graphics.PointF r0 = r9.pi
            float r0 = r0.x
        L64:
            r2 = r0
            r16 = 1
            r0 = r20
            r3 = r23
            r4 = r10
            r5 = r14
            r17 = r6
            r6 = r16
            java.util.List r6 = r0.EYQ(r1, r2, r3, r4, r5, r6)
            r5 = r15
        L76:
            int r0 = r6.size()
            if (r5 >= r0) goto Lb0
            java.lang.Object r0 = r6.get(r5)
            com.bytedance.adsdk.lottie.Td.Td.QQ$EYQ r0 = (com.bytedance.adsdk.lottie.Td.Td.QQ.EYQ) r0
            int r7 = r7 + 1
            r24.save()
            float r1 = com.bytedance.adsdk.lottie.Td.Td.QQ.EYQ.EYQ(r0)
            r4 = r24
            r8.EYQ(r4, r9, r7, r1)
            java.lang.String r1 = com.bytedance.adsdk.lottie.Td.Td.QQ.EYQ.mZx(r0)
            r0 = r20
            r2 = r21
            r3 = r23
            r16 = r5
            r5 = r11
            r18 = r6
            r6 = r10
            r19 = r7
            r7 = r14
            r0.EYQ(r1, r2, r3, r4, r5, r6, r7)
            r24.restore()
            int r5 = r16 + 1
            r6 = r18
            r7 = r19
            goto L76
        Lb0:
            int r6 = r17 + 1
            goto L51
        Lb3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.lottie.Td.Td.QQ.EYQ(com.bytedance.adsdk.lottie.Td.mZx, android.graphics.Matrix, com.bytedance.adsdk.lottie.Td.Td, android.graphics.Canvas):void");
    }

    private void EYQ(String str, com.bytedance.adsdk.lottie.Td.mZx mzx, com.bytedance.adsdk.lottie.Td.Td td, Canvas canvas, float f, float f2, float f3) {
        for (int i = 0; i < str.length(); i++) {
            com.bytedance.adsdk.lottie.Td.Pm pm = this.UB.tp().get(com.bytedance.adsdk.lottie.Td.Pm.EYQ(str.charAt(i), td.EYQ(), td.Td()));
            if (pm != null) {
                EYQ(pm, f2, mzx, canvas);
                canvas.translate((((float) pm.mZx()) * f2 * com.bytedance.adsdk.lottie.IPb.IPb.EYQ()) + f3, 0.0f);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void EYQ(com.bytedance.adsdk.lottie.Td.mZx r19, com.bytedance.adsdk.lottie.Td.Td r20, android.graphics.Canvas r21) {
        /*
            r18 = this;
            r7 = r18
            r8 = r19
            r9 = r20
            r10 = r21
            android.graphics.Typeface r0 = r7.EYQ(r9)
            if (r0 != 0) goto Lf
            return
        Lf:
            java.lang.String r1 = r8.EYQ
            com.bytedance.adsdk.lottie.QQ r2 = r7.hu
            com.bytedance.adsdk.lottie.hYh r2 = r2.zF()
            if (r2 == 0) goto L21
            java.lang.String r3 = r18.Kbd()
            java.lang.String r1 = r2.mZx(r3, r1)
        L21:
            android.graphics.Paint r2 = r7.tp
            r2.setTypeface(r0)
            com.bytedance.adsdk.lottie.EYQ.mZx.EYQ<java.lang.Float, java.lang.Float> r0 = r7.rfB
            if (r0 == 0) goto L35
            java.lang.Object r0 = r0.VwS()
            java.lang.Float r0 = (java.lang.Float) r0
            float r0 = r0.floatValue()
            goto L37
        L35:
            float r0 = r8.Td
        L37:
            android.graphics.Paint r2 = r7.tp
            float r3 = com.bytedance.adsdk.lottie.IPb.IPb.EYQ()
            float r3 = r3 * r0
            r2.setTextSize(r3)
            android.graphics.Paint r2 = r7.MxO
            android.graphics.Paint r3 = r7.tp
            android.graphics.Typeface r3 = r3.getTypeface()
            r2.setTypeface(r3)
            android.graphics.Paint r2 = r7.MxO
            android.graphics.Paint r3 = r7.tp
            float r3 = r3.getTextSize()
            r2.setTextSize(r3)
            int r2 = r8.Kbd
            float r2 = (float) r2
            r3 = 1092616192(0x41200000, float:10.0)
            float r2 = r2 / r3
            com.bytedance.adsdk.lottie.EYQ.mZx.EYQ<java.lang.Float, java.lang.Float> r3 = r7.wBa
            if (r3 == 0) goto L6d
            java.lang.Object r3 = r3.VwS()
            java.lang.Float r3 = (java.lang.Float) r3
            float r3 = r3.floatValue()
        L6b:
            float r2 = r2 + r3
            goto L7c
        L6d:
            com.bytedance.adsdk.lottie.EYQ.mZx.EYQ<java.lang.Float, java.lang.Float> r3 = r7.tPj
            if (r3 == 0) goto L7c
            java.lang.Object r3 = r3.VwS()
            java.lang.Float r3 = (java.lang.Float) r3
            float r3 = r3.floatValue()
            goto L6b
        L7c:
            float r3 = com.bytedance.adsdk.lottie.IPb.IPb.EYQ()
            float r2 = r2 * r3
            float r2 = r2 * r0
            r0 = 1120403456(0x42c80000, float:100.0)
            float r11 = r2 / r0
            java.util.List r12 = r7.EYQ(r1)
            int r13 = r12.size()
            r0 = -1
            r14 = 0
            r15 = r0
            r6 = r14
        L92:
            if (r6 >= r13) goto Ldf
            java.lang.Object r0 = r12.get(r6)
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1
            android.graphics.PointF r0 = r8.pi
            if (r0 != 0) goto La1
            r0 = 0
            goto La5
        La1:
            android.graphics.PointF r0 = r8.pi
            float r0 = r0.x
        La5:
            r2 = r0
            r4 = 0
            r16 = 0
            r0 = r18
            r3 = r20
            r5 = r11
            r17 = r6
            r6 = r16
            java.util.List r0 = r0.EYQ(r1, r2, r3, r4, r5, r6)
            r1 = r14
        Lb7:
            int r2 = r0.size()
            if (r1 >= r2) goto Ldc
            java.lang.Object r2 = r0.get(r1)
            com.bytedance.adsdk.lottie.Td.Td.QQ$EYQ r2 = (com.bytedance.adsdk.lottie.Td.Td.QQ.EYQ) r2
            int r15 = r15 + 1
            r21.save()
            float r3 = com.bytedance.adsdk.lottie.Td.Td.QQ.EYQ.EYQ(r2)
            r7.EYQ(r10, r8, r15, r3)
            java.lang.String r2 = com.bytedance.adsdk.lottie.Td.Td.QQ.EYQ.mZx(r2)
            r7.EYQ(r2, r8, r10, r11)
            r21.restore()
            int r1 = r1 + 1
            goto Lb7
        Ldc:
            int r6 = r17 + 1
            goto L92
        Ldf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.lottie.Td.Td.QQ.EYQ(com.bytedance.adsdk.lottie.Td.mZx, com.bytedance.adsdk.lottie.Td.Td, android.graphics.Canvas):void");
    }

    private void EYQ(Canvas canvas, com.bytedance.adsdk.lottie.Td.mZx mzx, int i, float f) {
        PointF pointF = mzx.tsL;
        PointF pointF2 = mzx.pi;
        float fEYQ = com.bytedance.adsdk.lottie.IPb.IPb.EYQ();
        float f2 = (i * mzx.IPb * fEYQ) + (pointF == null ? 0.0f : (mzx.IPb * 0.6f * fEYQ) + pointF.y);
        float f3 = pointF == null ? 0.0f : pointF.x;
        float f4 = pointF2 != null ? pointF2.x : 0.0f;
        int i2 = AnonymousClass3.EYQ[mzx.Pm.ordinal()];
        if (i2 == 1) {
            canvas.translate(f3, f2);
        } else if (i2 == 2) {
            canvas.translate((f3 + f4) - f, f2);
        } else {
            if (i2 != 3) {
                return;
            }
            canvas.translate((f3 + (f4 / 2.0f)) - (f / 2.0f), f2);
        }
    }

    /* compiled from: TextLayer.java */
    /* renamed from: com.bytedance.adsdk.lottie.Td.Td.QQ$3, reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] EYQ;

        static {
            int[] iArr = new int[mZx.EYQ.values().length];
            EYQ = iArr;
            try {
                iArr[mZx.EYQ.LEFT_ALIGN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                EYQ[mZx.EYQ.RIGHT_ALIGN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                EYQ[mZx.EYQ.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private Typeface EYQ(com.bytedance.adsdk.lottie.Td.Td td) {
        Typeface typefaceVwS;
        com.bytedance.adsdk.lottie.EYQ.mZx.EYQ<Typeface, Typeface> eyq = this.lEs;
        if (eyq != null && (typefaceVwS = eyq.VwS()) != null) {
            return typefaceVwS;
        }
        Typeface typefaceEYQ = this.hu.EYQ(td);
        return typefaceEYQ != null ? typefaceEYQ : td.Pm();
    }

    private List<String> EYQ(String str) {
        return Arrays.asList(str.replaceAll("\r\n", "\r").replaceAll("\u0003", "\r").replaceAll("\n", "\r").split("\r"));
    }

    private void EYQ(String str, com.bytedance.adsdk.lottie.Td.mZx mzx, Canvas canvas, float f) {
        int length = 0;
        while (length < str.length()) {
            String strEYQ = EYQ(str, length);
            length += strEYQ.length();
            EYQ(strEYQ, mzx, canvas);
            canvas.translate(this.tp.measureText(strEYQ) + f, 0.0f);
        }
    }

    private List<EYQ> EYQ(String str, float f, com.bytedance.adsdk.lottie.Td.Td td, float f2, float f3, boolean z) {
        float fMeasureText;
        float f4 = 0.0f;
        float f5 = 0.0f;
        float f6 = 0.0f;
        int i = 0;
        int i2 = 0;
        boolean z2 = false;
        int i3 = 0;
        for (int i4 = 0; i4 < str.length(); i4++) {
            char cCharAt = str.charAt(i4);
            if (z) {
                com.bytedance.adsdk.lottie.Td.Pm pm = this.UB.tp().get(com.bytedance.adsdk.lottie.Td.Pm.EYQ(cCharAt, td.EYQ(), td.Td()));
                if (pm != null) {
                    fMeasureText = ((float) pm.mZx()) * f2 * com.bytedance.adsdk.lottie.IPb.IPb.EYQ();
                }
            } else {
                fMeasureText = this.tp.measureText(str.substring(i4, i4 + 1));
            }
            float f7 = fMeasureText + f3;
            if (cCharAt == ' ') {
                z2 = true;
                f6 = f7;
            } else if (z2) {
                z2 = false;
                i3 = i4;
                f5 = f7;
            } else {
                f5 += f7;
            }
            f4 += f7;
            if (f > 0.0f && f4 >= f && cCharAt != ' ') {
                i++;
                EYQ EYQ2 = EYQ(i);
                if (i3 == i2) {
                    EYQ2.EYQ(str.substring(i2, i4).trim(), (f4 - f7) - ((r9.length() - r7.length()) * f6));
                    i2 = i4;
                    i3 = i2;
                    f4 = f7;
                    f5 = f4;
                } else {
                    EYQ2.EYQ(str.substring(i2, i3 - 1).trim(), ((f4 - f5) - ((r7.length() - r13.length()) * f6)) - f6);
                    f4 = f5;
                    i2 = i3;
                }
            }
        }
        if (f4 > 0.0f) {
            i++;
            EYQ(i).EYQ(str.substring(i2), f4);
        }
        return this.nWX.subList(0, i);
    }

    private EYQ EYQ(int i) {
        for (int size = this.nWX.size(); size < i; size++) {
            this.nWX.add(new EYQ());
        }
        return this.nWX.get(i - 1);
    }

    private void EYQ(com.bytedance.adsdk.lottie.Td.Pm pm, float f, com.bytedance.adsdk.lottie.Td.mZx mzx, Canvas canvas) {
        List<com.bytedance.adsdk.lottie.EYQ.EYQ.Pm> listEYQ = EYQ(pm);
        for (int i = 0; i < listEYQ.size(); i++) {
            Path pathPm = listEYQ.get(i).Pm();
            pathPm.computeBounds(this.QQ, false);
            this.HX.reset();
            this.HX.preTranslate(0.0f, (-mzx.VwS) * com.bytedance.adsdk.lottie.IPb.IPb.EYQ());
            this.HX.preScale(f, f);
            pathPm.transform(this.HX);
            if (mzx.MxO) {
                EYQ(pathPm, this.tp, canvas);
                EYQ(pathPm, this.MxO, canvas);
            } else {
                EYQ(pathPm, this.MxO, canvas);
                EYQ(pathPm, this.tp, canvas);
            }
        }
    }

    private void EYQ(Path path, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawPath(path, paint);
    }

    private void EYQ(String str, com.bytedance.adsdk.lottie.Td.mZx mzx, Canvas canvas) {
        if (mzx.MxO) {
            EYQ(str, this.tp, canvas);
            EYQ(str, this.MxO, canvas);
        } else {
            EYQ(str, this.MxO, canvas);
            EYQ(str, this.tp, canvas);
        }
    }

    private void EYQ(String str, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawText(str, 0, str.length(), 0.0f, 0.0f, paint);
    }

    private List<com.bytedance.adsdk.lottie.EYQ.EYQ.Pm> EYQ(com.bytedance.adsdk.lottie.Td.Pm pm) {
        if (this.tsL.containsKey(pm)) {
            return this.tsL.get(pm);
        }
        List<hu> listEYQ = pm.EYQ();
        int size = listEYQ.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList.add(new com.bytedance.adsdk.lottie.EYQ.EYQ.Pm(this.hu, this, listEYQ.get(i), this.UB));
        }
        this.tsL.put(pm, arrayList);
        return arrayList;
    }

    private String EYQ(String str, int i) {
        int iCodePointAt = str.codePointAt(i);
        int iCharCount = Character.charCount(iCodePointAt) + i;
        while (iCharCount < str.length()) {
            int iCodePointAt2 = str.codePointAt(iCharCount);
            if (!mZx(iCodePointAt2)) {
                break;
            }
            iCharCount += Character.charCount(iCodePointAt2);
            iCodePointAt = (iCodePointAt * 31) + iCodePointAt2;
        }
        long j = iCodePointAt;
        if (this.pi.indexOfKey(j) >= 0) {
            return this.pi.get(j);
        }
        this.VwS.setLength(0);
        while (i < iCharCount) {
            int iCodePointAt3 = str.codePointAt(i);
            this.VwS.appendCodePoint(iCodePointAt3);
            i += Character.charCount(iCodePointAt3);
        }
        String string = this.VwS.toString();
        this.pi.put(j, string);
        return string;
    }

    private boolean mZx(int i) {
        return Character.getType(i) == 16 || Character.getType(i) == 27 || Character.getType(i) == 6 || Character.getType(i) == 28 || Character.getType(i) == 8 || Character.getType(i) == 19;
    }

    /* compiled from: TextLayer.java */
    private static class EYQ {
        private String EYQ;
        private float mZx;

        private EYQ() {
            this.EYQ = "";
            this.mZx = 0.0f;
        }

        void EYQ(String str, float f) {
            this.EYQ = str;
            this.mZx = f;
        }
    }
}
