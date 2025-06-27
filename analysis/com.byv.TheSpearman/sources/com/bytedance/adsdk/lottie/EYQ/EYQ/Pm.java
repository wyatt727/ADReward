package com.bytedance.adsdk.lottie.EYQ.EYQ;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.bytedance.adsdk.lottie.EYQ.mZx.EYQ;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ContentGroup.java */
/* loaded from: classes2.dex */
public class Pm implements Kbd, pi, EYQ.InterfaceC0072EYQ {
    private final Paint EYQ;
    private final com.bytedance.adsdk.lottie.QQ HX;
    private final String IPb;
    private final RectF Kbd;
    private com.bytedance.adsdk.lottie.EYQ.mZx.hu MxO;
    private final Path Pm;
    private final List<Td> QQ;
    private final Matrix Td;
    private final boolean VwS;
    private final RectF mZx;
    private List<pi> tp;

    private static List<Td> EYQ(com.bytedance.adsdk.lottie.QQ qq, com.bytedance.adsdk.lottie.IPb iPb, com.bytedance.adsdk.lottie.Td.Td.EYQ eyq, List<com.bytedance.adsdk.lottie.Td.mZx.Td> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            Td tdEYQ = list.get(i).EYQ(qq, iPb, eyq);
            if (tdEYQ != null) {
                arrayList.add(tdEYQ);
            }
        }
        return arrayList;
    }

    static com.bytedance.adsdk.lottie.Td.EYQ.tsL EYQ(List<com.bytedance.adsdk.lottie.Td.mZx.Td> list) {
        for (int i = 0; i < list.size(); i++) {
            com.bytedance.adsdk.lottie.Td.mZx.Td td = list.get(i);
            if (td instanceof com.bytedance.adsdk.lottie.Td.EYQ.tsL) {
                return (com.bytedance.adsdk.lottie.Td.EYQ.tsL) td;
            }
        }
        return null;
    }

    public Pm(com.bytedance.adsdk.lottie.QQ qq, com.bytedance.adsdk.lottie.Td.Td.EYQ eyq, com.bytedance.adsdk.lottie.Td.mZx.hu huVar, com.bytedance.adsdk.lottie.IPb iPb) {
        this(qq, eyq, huVar.EYQ(), huVar.Td(), EYQ(qq, iPb, eyq, huVar.mZx()), EYQ(huVar.mZx()));
    }

    Pm(com.bytedance.adsdk.lottie.QQ qq, com.bytedance.adsdk.lottie.Td.Td.EYQ eyq, String str, boolean z, List<Td> list, com.bytedance.adsdk.lottie.Td.EYQ.tsL tsl) {
        this.EYQ = new com.bytedance.adsdk.lottie.EYQ.EYQ();
        this.mZx = new RectF();
        this.Td = new Matrix();
        this.Pm = new Path();
        this.Kbd = new RectF();
        this.IPb = str;
        this.HX = qq;
        this.VwS = z;
        this.QQ = list;
        if (tsl != null) {
            com.bytedance.adsdk.lottie.EYQ.mZx.hu huVarTp = tsl.tp();
            this.MxO = huVarTp;
            huVarTp.EYQ(eyq);
            this.MxO.EYQ(this);
        }
        ArrayList arrayList = new ArrayList();
        for (int size = list.size() - 1; size >= 0; size--) {
            Td td = list.get(size);
            if (td instanceof tp) {
                arrayList.add((tp) td);
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            ((tp) arrayList.get(size2)).EYQ(list.listIterator(list.size()));
        }
    }

    @Override // com.bytedance.adsdk.lottie.EYQ.mZx.EYQ.InterfaceC0072EYQ
    public void EYQ() {
        this.HX.invalidateSelf();
    }

    @Override // com.bytedance.adsdk.lottie.EYQ.EYQ.Td
    public void EYQ(List<Td> list, List<Td> list2) {
        ArrayList arrayList = new ArrayList(list.size() + this.QQ.size());
        arrayList.addAll(list);
        for (int size = this.QQ.size() - 1; size >= 0; size--) {
            Td td = this.QQ.get(size);
            td.EYQ(arrayList, this.QQ.subList(0, size));
            arrayList.add(td);
        }
    }

    List<pi> mZx() {
        if (this.tp == null) {
            this.tp = new ArrayList();
            for (int i = 0; i < this.QQ.size(); i++) {
                Td td = this.QQ.get(i);
                if (td instanceof pi) {
                    this.tp.add((pi) td);
                }
            }
        }
        return this.tp;
    }

    Matrix Td() {
        com.bytedance.adsdk.lottie.EYQ.mZx.hu huVar = this.MxO;
        if (huVar != null) {
            return huVar.Pm();
        }
        this.Td.reset();
        return this.Td;
    }

    @Override // com.bytedance.adsdk.lottie.EYQ.EYQ.pi
    public Path Pm() {
        this.Td.reset();
        com.bytedance.adsdk.lottie.EYQ.mZx.hu huVar = this.MxO;
        if (huVar != null) {
            this.Td.set(huVar.Pm());
        }
        this.Pm.reset();
        if (this.VwS) {
            return this.Pm;
        }
        for (int size = this.QQ.size() - 1; size >= 0; size--) {
            Td td = this.QQ.get(size);
            if (td instanceof pi) {
                this.Pm.addPath(((pi) td).Pm(), this.Td);
            }
        }
        return this.Pm;
    }

    @Override // com.bytedance.adsdk.lottie.EYQ.EYQ.Kbd
    public void EYQ(Canvas canvas, Matrix matrix, int i) {
        if (this.VwS) {
            return;
        }
        this.Td.set(matrix);
        com.bytedance.adsdk.lottie.EYQ.mZx.hu huVar = this.MxO;
        if (huVar != null) {
            this.Td.preConcat(huVar.Pm());
            i = (int) (((((this.MxO.EYQ() == null ? 100 : this.MxO.EYQ().VwS().intValue()) / 100.0f) * i) / 255.0f) * 255.0f);
        }
        boolean z = this.HX.VwS() && Kbd() && i != 255;
        if (z) {
            this.mZx.set(0.0f, 0.0f, 0.0f, 0.0f);
            EYQ(this.mZx, this.Td, true);
            this.EYQ.setAlpha(i);
            com.bytedance.adsdk.lottie.IPb.IPb.EYQ(canvas, this.mZx, this.EYQ);
        }
        if (z) {
            i = 255;
        }
        for (int size = this.QQ.size() - 1; size >= 0; size--) {
            Td td = this.QQ.get(size);
            if (td instanceof Kbd) {
                ((Kbd) td).EYQ(canvas, this.Td, i);
            }
        }
        if (z) {
            canvas.restore();
        }
    }

    private boolean Kbd() {
        int i = 0;
        for (int i2 = 0; i2 < this.QQ.size(); i2++) {
            if ((this.QQ.get(i2) instanceof Kbd) && (i = i + 1) >= 2) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bytedance.adsdk.lottie.EYQ.EYQ.Kbd
    public void EYQ(RectF rectF, Matrix matrix, boolean z) {
        this.Td.set(matrix);
        com.bytedance.adsdk.lottie.EYQ.mZx.hu huVar = this.MxO;
        if (huVar != null) {
            this.Td.preConcat(huVar.Pm());
        }
        this.Kbd.set(0.0f, 0.0f, 0.0f, 0.0f);
        for (int size = this.QQ.size() - 1; size >= 0; size--) {
            Td td = this.QQ.get(size);
            if (td instanceof Kbd) {
                ((Kbd) td).EYQ(this.Kbd, this.Td, z);
                rectF.union(this.Kbd);
            }
        }
    }
}
