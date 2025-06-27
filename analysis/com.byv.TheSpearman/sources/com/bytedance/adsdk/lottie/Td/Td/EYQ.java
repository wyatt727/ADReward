package com.bytedance.adsdk.lottie.Td.Td;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import androidx.core.view.ViewCompat;
import com.bytedance.adsdk.lottie.EYQ.mZx.EYQ;
import com.bytedance.adsdk.lottie.EYQ.mZx.hu;
import com.bytedance.adsdk.lottie.Kbd.tp;
import com.bytedance.adsdk.lottie.Td.Td.Pm;
import com.bytedance.adsdk.lottie.Td.mZx.QQ;
import com.bytedance.adsdk.lottie.Td.mZx.nWX;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* compiled from: BaseLayer.java */
/* loaded from: classes2.dex */
public abstract class EYQ implements com.bytedance.adsdk.lottie.EYQ.EYQ.Kbd, EYQ.InterfaceC0072EYQ {
    final Matrix EYQ;
    BlurMaskFilter IPb;
    private final RectF KO;
    float Kbd;
    private EYQ NZ;
    private Paint Nvm;
    final hu Pm;
    final Pm Td;
    private final RectF UB;
    private final RectF Uc;
    private com.bytedance.adsdk.lottie.EYQ.mZx.QQ WU;
    private com.bytedance.adsdk.lottie.EYQ.mZx.Pm XN;
    private final RectF hYh;
    private final RectF hu;
    private boolean lEs;
    final com.bytedance.adsdk.lottie.QQ mZx;
    private final Paint nWX;
    private final Paint pi;
    private final List<com.bytedance.adsdk.lottie.EYQ.mZx.EYQ<?, ?>> rfB;
    private EYQ tPj;
    private List<EYQ> wBa;
    private boolean xt;
    private final String zF;
    private final Path VwS = new Path();
    private final Matrix QQ = new Matrix();
    private final Matrix HX = new Matrix();
    private final Paint tp = new com.bytedance.adsdk.lottie.EYQ.EYQ(1);
    private final Paint MxO = new com.bytedance.adsdk.lottie.EYQ.EYQ(1, PorterDuff.Mode.DST_IN);
    private final Paint tsL = new com.bytedance.adsdk.lottie.EYQ.EYQ(1, PorterDuff.Mode.DST_OUT);

    @Override // com.bytedance.adsdk.lottie.EYQ.EYQ.Td
    public void EYQ(List<com.bytedance.adsdk.lottie.EYQ.EYQ.Td> list, List<com.bytedance.adsdk.lottie.EYQ.EYQ.Td> list2) {
    }

    abstract void mZx(Canvas canvas, Matrix matrix, int i);

    static EYQ EYQ(mZx mzx, Pm pm, com.bytedance.adsdk.lottie.QQ qq, com.bytedance.adsdk.lottie.IPb iPb) {
        switch (AnonymousClass2.EYQ[pm.MxO().ordinal()]) {
            case 1:
                return new IPb(qq, pm, mzx, iPb);
            case 2:
                return new mZx(qq, pm, iPb.mZx(pm.VwS()), iPb);
            case 3:
                return new VwS(qq, pm);
            case 4:
                return new Td(qq, pm);
            case 5:
                return new Kbd(qq, pm);
            case 6:
                return new QQ(qq, pm);
            default:
                Objects.toString(pm.MxO());
                return null;
        }
    }

    EYQ(com.bytedance.adsdk.lottie.QQ qq, Pm pm) {
        com.bytedance.adsdk.lottie.EYQ.EYQ eyq = new com.bytedance.adsdk.lottie.EYQ.EYQ(1);
        this.pi = eyq;
        this.nWX = new com.bytedance.adsdk.lottie.EYQ.EYQ(PorterDuff.Mode.CLEAR);
        this.KO = new RectF();
        this.hu = new RectF();
        this.UB = new RectF();
        this.Uc = new RectF();
        this.hYh = new RectF();
        this.EYQ = new Matrix();
        this.rfB = new ArrayList();
        this.lEs = true;
        this.Kbd = 0.0f;
        this.mZx = qq;
        this.Td = pm;
        this.zF = pm.IPb() + "#draw";
        if (pm.tsL() == Pm.mZx.INVERT) {
            eyq.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        } else {
            eyq.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        }
        hu huVarTp = pm.KO().tp();
        this.Pm = huVarTp;
        huVarTp.EYQ((EYQ.InterfaceC0072EYQ) this);
        if (pm.tp() != null && !pm.tp().isEmpty()) {
            com.bytedance.adsdk.lottie.EYQ.mZx.QQ qq2 = new com.bytedance.adsdk.lottie.EYQ.mZx.QQ(pm.tp());
            this.WU = qq2;
            Iterator<com.bytedance.adsdk.lottie.EYQ.mZx.EYQ<nWX, Path>> it = qq2.mZx().iterator();
            while (it.hasNext()) {
                it.next().EYQ(this);
            }
            for (com.bytedance.adsdk.lottie.EYQ.mZx.EYQ<Integer, Integer> eyq2 : this.WU.Td()) {
                EYQ(eyq2);
                eyq2.EYQ(this);
            }
        }
        QQ();
    }

    void EYQ(boolean z) {
        if (z && this.Nvm == null) {
            this.Nvm = new com.bytedance.adsdk.lottie.EYQ.EYQ();
        }
        this.xt = z;
    }

    @Override // com.bytedance.adsdk.lottie.EYQ.mZx.EYQ.InterfaceC0072EYQ
    public void EYQ() {
        HX();
    }

    Pm mZx() {
        return this.Td;
    }

    void EYQ(EYQ eyq) {
        this.NZ = eyq;
    }

    boolean Td() {
        return this.NZ != null;
    }

    void mZx(EYQ eyq) {
        this.tPj = eyq;
    }

    private void QQ() {
        if (!this.Td.Pm().isEmpty()) {
            com.bytedance.adsdk.lottie.EYQ.mZx.Pm pm = new com.bytedance.adsdk.lottie.EYQ.mZx.Pm(this.Td.Pm());
            this.XN = pm;
            pm.EYQ();
            this.XN.EYQ(new EYQ.InterfaceC0072EYQ() { // from class: com.bytedance.adsdk.lottie.Td.Td.EYQ.1
                @Override // com.bytedance.adsdk.lottie.EYQ.mZx.EYQ.InterfaceC0072EYQ
                public void EYQ() {
                    EYQ eyq = EYQ.this;
                    eyq.mZx(eyq.XN.HX() == 1.0f);
                }
            });
            mZx(this.XN.VwS().floatValue() == 1.0f);
            EYQ(this.XN);
            return;
        }
        mZx(true);
    }

    private void HX() {
        this.mZx.invalidateSelf();
    }

    public void EYQ(com.bytedance.adsdk.lottie.EYQ.mZx.EYQ<?, ?> eyq) {
        if (eyq == null) {
            return;
        }
        this.rfB.add(eyq);
    }

    @Override // com.bytedance.adsdk.lottie.EYQ.EYQ.Kbd
    public void EYQ(RectF rectF, Matrix matrix, boolean z) {
        this.KO.set(0.0f, 0.0f, 0.0f, 0.0f);
        MxO();
        this.EYQ.set(matrix);
        if (z) {
            List<EYQ> list = this.wBa;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.EYQ.preConcat(this.wBa.get(size).Pm.Pm());
                }
            } else {
                EYQ eyq = this.tPj;
                if (eyq != null) {
                    this.EYQ.preConcat(eyq.Pm.Pm());
                }
            }
        }
        this.EYQ.preConcat(this.Pm.Pm());
    }

    @Override // com.bytedance.adsdk.lottie.EYQ.EYQ.Kbd
    public void EYQ(Canvas canvas, Matrix matrix, int i) {
        Paint paint;
        Integer numVwS;
        com.bytedance.adsdk.lottie.Kbd.EYQ(this.zF);
        if (!this.lEs || this.Td.XN()) {
            com.bytedance.adsdk.lottie.Kbd.mZx(this.zF);
            return;
        }
        MxO();
        com.bytedance.adsdk.lottie.Kbd.EYQ("Layer#parentMatrix");
        this.QQ.reset();
        this.QQ.set(matrix);
        for (int size = this.wBa.size() - 1; size >= 0; size--) {
            this.QQ.preConcat(this.wBa.get(size).Pm.Pm());
        }
        com.bytedance.adsdk.lottie.Kbd.mZx("Layer#parentMatrix");
        int iIntValue = 100;
        com.bytedance.adsdk.lottie.EYQ.mZx.EYQ<?, Integer> EYQ = this.Pm.EYQ();
        if (EYQ != null && (numVwS = EYQ.VwS()) != null) {
            iIntValue = numVwS.intValue();
        }
        int i2 = (int) ((((i / 255.0f) * iIntValue) / 100.0f) * 255.0f);
        if (!Td() && !Pm()) {
            this.QQ.preConcat(this.Pm.Pm());
            com.bytedance.adsdk.lottie.Kbd.EYQ("Layer#drawLayer");
            mZx(canvas, this.QQ, i2);
            com.bytedance.adsdk.lottie.Kbd.mZx("Layer#drawLayer");
            Td(com.bytedance.adsdk.lottie.Kbd.mZx(this.zF));
            return;
        }
        com.bytedance.adsdk.lottie.Kbd.EYQ("Layer#computeBounds");
        EYQ(this.KO, this.QQ, false);
        mZx(this.KO, matrix);
        this.QQ.preConcat(this.Pm.Pm());
        EYQ(this.KO, this.QQ);
        this.hu.set(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight());
        canvas.getMatrix(this.HX);
        if (!this.HX.isIdentity()) {
            Matrix matrix2 = this.HX;
            matrix2.invert(matrix2);
            this.HX.mapRect(this.hu);
        }
        if (!this.KO.intersect(this.hu)) {
            this.KO.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
        com.bytedance.adsdk.lottie.Kbd.mZx("Layer#computeBounds");
        if (this.KO.width() >= 1.0f && this.KO.height() >= 1.0f) {
            com.bytedance.adsdk.lottie.Kbd.EYQ("Layer#saveLayer");
            this.tp.setAlpha(255);
            com.bytedance.adsdk.lottie.IPb.IPb.EYQ(canvas, this.KO, this.tp);
            com.bytedance.adsdk.lottie.Kbd.mZx("Layer#saveLayer");
            EYQ(canvas);
            com.bytedance.adsdk.lottie.Kbd.EYQ("Layer#drawLayer");
            mZx(canvas, this.QQ, i2);
            com.bytedance.adsdk.lottie.Kbd.mZx("Layer#drawLayer");
            if (Pm()) {
                EYQ(canvas, this.QQ);
            }
            if (Td()) {
                com.bytedance.adsdk.lottie.Kbd.EYQ("Layer#drawMatte");
                com.bytedance.adsdk.lottie.Kbd.EYQ("Layer#saveLayer");
                com.bytedance.adsdk.lottie.IPb.IPb.EYQ(canvas, this.KO, this.pi, 19);
                com.bytedance.adsdk.lottie.Kbd.mZx("Layer#saveLayer");
                EYQ(canvas);
                this.NZ.EYQ(canvas, matrix, i2);
                com.bytedance.adsdk.lottie.Kbd.EYQ("Layer#restoreLayer");
                canvas.restore();
                com.bytedance.adsdk.lottie.Kbd.mZx("Layer#restoreLayer");
                com.bytedance.adsdk.lottie.Kbd.mZx("Layer#drawMatte");
            }
            com.bytedance.adsdk.lottie.Kbd.EYQ("Layer#restoreLayer");
            canvas.restore();
            com.bytedance.adsdk.lottie.Kbd.mZx("Layer#restoreLayer");
        }
        if (this.xt && (paint = this.Nvm) != null) {
            paint.setStyle(Paint.Style.STROKE);
            this.Nvm.setColor(-251901);
            this.Nvm.setStrokeWidth(4.0f);
            canvas.drawRect(this.KO, this.Nvm);
            this.Nvm.setStyle(Paint.Style.FILL);
            this.Nvm.setColor(1357638635);
            canvas.drawRect(this.KO, this.Nvm);
        }
        Td(com.bytedance.adsdk.lottie.Kbd.mZx(this.zF));
    }

    private void Td(float f) {
        this.mZx.XN().Td().EYQ(this.Td.IPb(), f);
    }

    private void EYQ(Canvas canvas) {
        com.bytedance.adsdk.lottie.Kbd.EYQ("Layer#clearLayer");
        canvas.drawRect(this.KO.left - 1.0f, this.KO.top - 1.0f, this.KO.right + 1.0f, this.KO.bottom + 1.0f, this.nWX);
        com.bytedance.adsdk.lottie.Kbd.mZx("Layer#clearLayer");
    }

    private void EYQ(RectF rectF, Matrix matrix) {
        this.UB.set(0.0f, 0.0f, 0.0f, 0.0f);
        if (Pm()) {
            int size = this.WU.EYQ().size();
            for (int i = 0; i < size; i++) {
                com.bytedance.adsdk.lottie.Td.mZx.QQ qq = this.WU.EYQ().get(i);
                Path pathVwS = this.WU.mZx().get(i).VwS();
                if (pathVwS != null) {
                    this.VwS.set(pathVwS);
                    this.VwS.transform(matrix);
                    int i2 = AnonymousClass2.mZx[qq.EYQ().ordinal()];
                    if (i2 == 1 || i2 == 2) {
                        return;
                    }
                    if ((i2 == 3 || i2 == 4) && qq.Pm()) {
                        return;
                    }
                    this.VwS.computeBounds(this.hYh, false);
                    if (i == 0) {
                        this.UB.set(this.hYh);
                    } else {
                        RectF rectF2 = this.UB;
                        rectF2.set(Math.min(rectF2.left, this.hYh.left), Math.min(this.UB.top, this.hYh.top), Math.max(this.UB.right, this.hYh.right), Math.max(this.UB.bottom, this.hYh.bottom));
                    }
                }
            }
            if (rectF.intersect(this.UB)) {
                return;
            }
            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
    }

    /* compiled from: BaseLayer.java */
    /* renamed from: com.bytedance.adsdk.lottie.Td.Td.EYQ$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] EYQ;
        static final /* synthetic */ int[] mZx;

        static {
            int[] iArr = new int[QQ.EYQ.values().length];
            mZx = iArr;
            try {
                iArr[QQ.EYQ.MASK_MODE_NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                mZx[QQ.EYQ.MASK_MODE_SUBTRACT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                mZx[QQ.EYQ.MASK_MODE_INTERSECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                mZx[QQ.EYQ.MASK_MODE_ADD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[Pm.EYQ.values().length];
            EYQ = iArr2;
            try {
                iArr2[Pm.EYQ.SHAPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                EYQ[Pm.EYQ.PRE_COMP.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                EYQ[Pm.EYQ.SOLID.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                EYQ[Pm.EYQ.IMAGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                EYQ[Pm.EYQ.NULL.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                EYQ[Pm.EYQ.TEXT.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                EYQ[Pm.EYQ.UNKNOWN.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    private void mZx(RectF rectF, Matrix matrix) {
        if (Td() && this.Td.tsL() != Pm.mZx.INVERT) {
            this.Uc.set(0.0f, 0.0f, 0.0f, 0.0f);
            this.NZ.EYQ(this.Uc, matrix, true);
            if (rectF.intersect(this.Uc)) {
                return;
            }
            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
    }

    private void EYQ(Canvas canvas, Matrix matrix) {
        com.bytedance.adsdk.lottie.Kbd.EYQ("Layer#saveLayer");
        com.bytedance.adsdk.lottie.IPb.IPb.EYQ(canvas, this.KO, this.MxO, 19);
        if (Build.VERSION.SDK_INT < 28) {
            EYQ(canvas);
        }
        com.bytedance.adsdk.lottie.Kbd.mZx("Layer#saveLayer");
        for (int i = 0; i < this.WU.EYQ().size(); i++) {
            com.bytedance.adsdk.lottie.Td.mZx.QQ qq = this.WU.EYQ().get(i);
            com.bytedance.adsdk.lottie.EYQ.mZx.EYQ<nWX, Path> eyq = this.WU.mZx().get(i);
            com.bytedance.adsdk.lottie.EYQ.mZx.EYQ<Integer, Integer> eyq2 = this.WU.Td().get(i);
            int i2 = AnonymousClass2.mZx[qq.EYQ().ordinal()];
            if (i2 != 1) {
                if (i2 == 2) {
                    if (i == 0) {
                        this.tp.setColor(ViewCompat.MEASURED_STATE_MASK);
                        this.tp.setAlpha(255);
                        canvas.drawRect(this.KO, this.tp);
                    }
                    if (qq.Pm()) {
                        Td(canvas, matrix, eyq, eyq2);
                    } else {
                        EYQ(canvas, matrix, eyq);
                    }
                } else if (i2 != 3) {
                    if (i2 == 4) {
                        if (qq.Pm()) {
                            mZx(canvas, matrix, eyq, eyq2);
                        } else {
                            EYQ(canvas, matrix, eyq, eyq2);
                        }
                    }
                } else if (qq.Pm()) {
                    Kbd(canvas, matrix, eyq, eyq2);
                } else {
                    Pm(canvas, matrix, eyq, eyq2);
                }
            } else if (tp()) {
                this.tp.setAlpha(255);
                canvas.drawRect(this.KO, this.tp);
            }
        }
        com.bytedance.adsdk.lottie.Kbd.EYQ("Layer#restoreLayer");
        canvas.restore();
        com.bytedance.adsdk.lottie.Kbd.mZx("Layer#restoreLayer");
    }

    private boolean tp() {
        if (this.WU.mZx().isEmpty()) {
            return false;
        }
        for (int i = 0; i < this.WU.EYQ().size(); i++) {
            if (this.WU.EYQ().get(i).EYQ() != QQ.EYQ.MASK_MODE_NONE) {
                return false;
            }
        }
        return true;
    }

    private void EYQ(Canvas canvas, Matrix matrix, com.bytedance.adsdk.lottie.EYQ.mZx.EYQ<nWX, Path> eyq, com.bytedance.adsdk.lottie.EYQ.mZx.EYQ<Integer, Integer> eyq2) {
        this.VwS.set(eyq.VwS());
        this.VwS.transform(matrix);
        this.tp.setAlpha((int) (eyq2.VwS().intValue() * 2.55f));
        canvas.drawPath(this.VwS, this.tp);
    }

    private void mZx(Canvas canvas, Matrix matrix, com.bytedance.adsdk.lottie.EYQ.mZx.EYQ<nWX, Path> eyq, com.bytedance.adsdk.lottie.EYQ.mZx.EYQ<Integer, Integer> eyq2) {
        com.bytedance.adsdk.lottie.IPb.IPb.EYQ(canvas, this.KO, this.tp);
        canvas.drawRect(this.KO, this.tp);
        this.VwS.set(eyq.VwS());
        this.VwS.transform(matrix);
        this.tp.setAlpha((int) (eyq2.VwS().intValue() * 2.55f));
        canvas.drawPath(this.VwS, this.tsL);
        canvas.restore();
    }

    private void EYQ(Canvas canvas, Matrix matrix, com.bytedance.adsdk.lottie.EYQ.mZx.EYQ<nWX, Path> eyq) {
        this.VwS.set(eyq.VwS());
        this.VwS.transform(matrix);
        canvas.drawPath(this.VwS, this.tsL);
    }

    private void Td(Canvas canvas, Matrix matrix, com.bytedance.adsdk.lottie.EYQ.mZx.EYQ<nWX, Path> eyq, com.bytedance.adsdk.lottie.EYQ.mZx.EYQ<Integer, Integer> eyq2) {
        com.bytedance.adsdk.lottie.IPb.IPb.EYQ(canvas, this.KO, this.tsL);
        canvas.drawRect(this.KO, this.tp);
        this.tsL.setAlpha((int) (eyq2.VwS().intValue() * 2.55f));
        this.VwS.set(eyq.VwS());
        this.VwS.transform(matrix);
        canvas.drawPath(this.VwS, this.tsL);
        canvas.restore();
    }

    private void Pm(Canvas canvas, Matrix matrix, com.bytedance.adsdk.lottie.EYQ.mZx.EYQ<nWX, Path> eyq, com.bytedance.adsdk.lottie.EYQ.mZx.EYQ<Integer, Integer> eyq2) {
        com.bytedance.adsdk.lottie.IPb.IPb.EYQ(canvas, this.KO, this.MxO);
        this.VwS.set(eyq.VwS());
        this.VwS.transform(matrix);
        this.tp.setAlpha((int) (eyq2.VwS().intValue() * 2.55f));
        canvas.drawPath(this.VwS, this.tp);
        canvas.restore();
    }

    private void Kbd(Canvas canvas, Matrix matrix, com.bytedance.adsdk.lottie.EYQ.mZx.EYQ<nWX, Path> eyq, com.bytedance.adsdk.lottie.EYQ.mZx.EYQ<Integer, Integer> eyq2) {
        com.bytedance.adsdk.lottie.IPb.IPb.EYQ(canvas, this.KO, this.MxO);
        canvas.drawRect(this.KO, this.tp);
        this.tsL.setAlpha((int) (eyq2.VwS().intValue() * 2.55f));
        this.VwS.set(eyq.VwS());
        this.VwS.transform(matrix);
        canvas.drawPath(this.VwS, this.tsL);
        canvas.restore();
    }

    boolean Pm() {
        com.bytedance.adsdk.lottie.EYQ.mZx.QQ qq = this.WU;
        return (qq == null || qq.mZx().isEmpty()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mZx(boolean z) {
        if (z != this.lEs) {
            this.lEs = z;
            HX();
        }
    }

    void EYQ(float f) {
        this.Pm.EYQ(f);
        if (this.WU != null) {
            for (int i = 0; i < this.WU.mZx().size(); i++) {
                this.WU.mZx().get(i).EYQ(f);
            }
        }
        com.bytedance.adsdk.lottie.EYQ.mZx.Pm pm = this.XN;
        if (pm != null) {
            pm.EYQ(f);
        }
        EYQ eyq = this.NZ;
        if (eyq != null) {
            eyq.EYQ(f);
        }
        for (int i2 = 0; i2 < this.rfB.size(); i2++) {
            this.rfB.get(i2).EYQ(f);
        }
    }

    private void MxO() {
        if (this.wBa != null) {
            return;
        }
        if (this.tPj == null) {
            this.wBa = Collections.emptyList();
            return;
        }
        this.wBa = new ArrayList();
        for (EYQ eyq = this.tPj; eyq != null; eyq = eyq.tPj) {
            this.wBa.add(eyq);
        }
    }

    public String Kbd() {
        return this.Td.IPb();
    }

    public com.bytedance.adsdk.lottie.Td.mZx.EYQ IPb() {
        return this.Td.NZ();
    }

    public BlurMaskFilter mZx(float f) {
        if (this.Kbd == f) {
            return this.IPb;
        }
        BlurMaskFilter blurMaskFilter = new BlurMaskFilter(f / 2.0f, BlurMaskFilter.Blur.NORMAL);
        this.IPb = blurMaskFilter;
        this.Kbd = f;
        return blurMaskFilter;
    }

    public tp VwS() {
        return this.Td.tPj();
    }
}
