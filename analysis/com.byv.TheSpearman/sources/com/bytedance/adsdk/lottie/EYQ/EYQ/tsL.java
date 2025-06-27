package com.bytedance.adsdk.lottie.EYQ.EYQ;

import android.graphics.Path;
import android.os.Build;
import com.bytedance.adsdk.lottie.Td.mZx.HX;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/* compiled from: MergePathsContent.java */
/* loaded from: classes2.dex */
public class tsL implements pi, tp {
    private final com.bytedance.adsdk.lottie.Td.mZx.HX IPb;
    private final String Pm;
    private final Path EYQ = new Path();
    private final Path mZx = new Path();
    private final Path Td = new Path();
    private final List<pi> Kbd = new ArrayList();

    public tsL(com.bytedance.adsdk.lottie.Td.mZx.HX hx) {
        if (Build.VERSION.SDK_INT < 19) {
            throw new IllegalStateException("Merge paths are not supported pre-KitKat.");
        }
        this.Pm = hx.EYQ();
        this.IPb = hx;
    }

    @Override // com.bytedance.adsdk.lottie.EYQ.EYQ.tp
    public void EYQ(ListIterator<Td> listIterator) {
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        while (listIterator.hasPrevious()) {
            Td tdPrevious = listIterator.previous();
            if (tdPrevious instanceof pi) {
                this.Kbd.add((pi) tdPrevious);
                listIterator.remove();
            }
        }
    }

    @Override // com.bytedance.adsdk.lottie.EYQ.EYQ.Td
    public void EYQ(List<Td> list, List<Td> list2) {
        for (int i = 0; i < this.Kbd.size(); i++) {
            this.Kbd.get(i).EYQ(list, list2);
        }
    }

    @Override // com.bytedance.adsdk.lottie.EYQ.EYQ.pi
    public Path Pm() {
        this.Td.reset();
        if (this.IPb.Td()) {
            return this.Td;
        }
        int i = AnonymousClass1.EYQ[this.IPb.mZx().ordinal()];
        if (i == 1) {
            EYQ();
        } else if (i == 2) {
            EYQ(Path.Op.UNION);
        } else if (i == 3) {
            EYQ(Path.Op.REVERSE_DIFFERENCE);
        } else if (i == 4) {
            EYQ(Path.Op.INTERSECT);
        } else if (i == 5) {
            EYQ(Path.Op.XOR);
        }
        return this.Td;
    }

    /* compiled from: MergePathsContent.java */
    /* renamed from: com.bytedance.adsdk.lottie.EYQ.EYQ.tsL$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] EYQ;

        static {
            int[] iArr = new int[HX.EYQ.values().length];
            EYQ = iArr;
            try {
                iArr[HX.EYQ.MERGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                EYQ[HX.EYQ.ADD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                EYQ[HX.EYQ.SUBTRACT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                EYQ[HX.EYQ.INTERSECT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                EYQ[HX.EYQ.EXCLUDE_INTERSECTIONS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    private void EYQ() {
        for (int i = 0; i < this.Kbd.size(); i++) {
            this.Td.addPath(this.Kbd.get(i).Pm());
        }
    }

    private void EYQ(Path.Op op) {
        this.mZx.reset();
        this.EYQ.reset();
        for (int size = this.Kbd.size() - 1; size > 0; size--) {
            pi piVar = this.Kbd.get(size);
            if (piVar instanceof Pm) {
                Pm pm = (Pm) piVar;
                List<pi> listMZx = pm.mZx();
                for (int size2 = listMZx.size() - 1; size2 >= 0; size2--) {
                    Path pathPm = listMZx.get(size2).Pm();
                    pathPm.transform(pm.Td());
                    this.mZx.addPath(pathPm);
                }
            } else {
                this.mZx.addPath(piVar.Pm());
            }
        }
        pi piVar2 = this.Kbd.get(0);
        if (piVar2 instanceof Pm) {
            Pm pm2 = (Pm) piVar2;
            List<pi> listMZx2 = pm2.mZx();
            for (int i = 0; i < listMZx2.size(); i++) {
                Path pathPm2 = listMZx2.get(i).Pm();
                pathPm2.transform(pm2.Td());
                this.EYQ.addPath(pathPm2);
            }
        } else {
            this.EYQ.set(piVar2.Pm());
        }
        this.Td.op(this.EYQ, this.mZx, op);
    }
}
