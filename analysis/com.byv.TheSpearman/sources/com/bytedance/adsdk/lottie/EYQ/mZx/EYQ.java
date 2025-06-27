package com.bytedance.adsdk.lottie.EYQ.mZx;

import java.util.ArrayList;
import java.util.List;

/* compiled from: BaseKeyframeAnimation.java */
/* loaded from: classes2.dex */
public abstract class EYQ<K, A> {
    private final Td<K> Kbd;
    protected com.bytedance.adsdk.lottie.VwS.mZx<A> Td;
    final List<InterfaceC0072EYQ> EYQ = new ArrayList(1);
    private boolean Pm = false;
    protected float mZx = 0.0f;
    private A IPb = null;
    private float VwS = -1.0f;
    private float QQ = -1.0f;

    /* compiled from: BaseKeyframeAnimation.java */
    /* renamed from: com.bytedance.adsdk.lottie.EYQ.mZx.EYQ$EYQ, reason: collision with other inner class name */
    public interface InterfaceC0072EYQ {
        void EYQ();
    }

    /* compiled from: BaseKeyframeAnimation.java */
    private interface Td<T> {
        boolean EYQ();

        boolean EYQ(float f);

        float Pm();

        float Td();

        com.bytedance.adsdk.lottie.VwS.EYQ<T> mZx();

        boolean mZx(float f);
    }

    abstract A EYQ(com.bytedance.adsdk.lottie.VwS.EYQ<K> eyq, float f);

    EYQ(List<? extends com.bytedance.adsdk.lottie.VwS.EYQ<K>> list) {
        this.Kbd = EYQ(list);
    }

    public void EYQ() {
        this.Pm = true;
    }

    public void EYQ(InterfaceC0072EYQ interfaceC0072EYQ) {
        this.EYQ.add(interfaceC0072EYQ);
    }

    public void EYQ(float f) {
        if (this.Kbd.EYQ()) {
            return;
        }
        if (f < HX()) {
            f = HX();
        } else if (f > IPb()) {
            f = IPb();
        }
        if (f == this.mZx) {
            return;
        }
        this.mZx = f;
        if (this.Kbd.EYQ(f)) {
            mZx();
        }
    }

    public void mZx() {
        for (int i = 0; i < this.EYQ.size(); i++) {
            this.EYQ.get(i).EYQ();
        }
    }

    protected com.bytedance.adsdk.lottie.VwS.EYQ<K> Td() {
        com.bytedance.adsdk.lottie.Kbd.EYQ("BaseKeyframeAnimation#getCurrentKeyframe");
        com.bytedance.adsdk.lottie.VwS.EYQ<K> eyqMZx = this.Kbd.mZx();
        com.bytedance.adsdk.lottie.Kbd.mZx("BaseKeyframeAnimation#getCurrentKeyframe");
        return eyqMZx;
    }

    float Pm() {
        if (this.Pm) {
            return 0.0f;
        }
        com.bytedance.adsdk.lottie.VwS.EYQ<K> eyqTd = Td();
        if (eyqTd.Kbd()) {
            return 0.0f;
        }
        return (this.mZx - eyqTd.Td()) / (eyqTd.Pm() - eyqTd.Td());
    }

    protected float Kbd() {
        com.bytedance.adsdk.lottie.VwS.EYQ<K> eyqTd = Td();
        if (eyqTd == null || eyqTd.Kbd()) {
            return 0.0f;
        }
        return eyqTd.Td.getInterpolation(Pm());
    }

    private float HX() {
        if (this.VwS == -1.0f) {
            this.VwS = this.Kbd.Td();
        }
        return this.VwS;
    }

    float IPb() {
        if (this.QQ == -1.0f) {
            this.QQ = this.Kbd.Pm();
        }
        return this.QQ;
    }

    public A VwS() {
        A aEYQ;
        float fPm = Pm();
        if (this.Td == null && this.Kbd.mZx(fPm)) {
            return this.IPb;
        }
        com.bytedance.adsdk.lottie.VwS.EYQ<K> eyqTd = Td();
        if (eyqTd.Pm != null && eyqTd.Kbd != null) {
            aEYQ = EYQ(eyqTd, fPm, eyqTd.Pm.getInterpolation(fPm), eyqTd.Kbd.getInterpolation(fPm));
        } else {
            aEYQ = EYQ(eyqTd, Kbd());
        }
        this.IPb = aEYQ;
        return aEYQ;
    }

    public float QQ() {
        return this.mZx;
    }

    protected A EYQ(com.bytedance.adsdk.lottie.VwS.EYQ<K> eyq, float f, float f2, float f3) {
        throw new UnsupportedOperationException("This animation does not support split dimensions!");
    }

    private static <T> Td<T> EYQ(List<? extends com.bytedance.adsdk.lottie.VwS.EYQ<T>> list) {
        if (list.isEmpty()) {
            return new mZx();
        }
        if (list.size() == 1) {
            return new Kbd(list);
        }
        return new Pm(list);
    }

    /* compiled from: BaseKeyframeAnimation.java */
    private static final class mZx<T> implements Td<T> {
        @Override // com.bytedance.adsdk.lottie.EYQ.mZx.EYQ.Td
        public boolean EYQ() {
            return true;
        }

        @Override // com.bytedance.adsdk.lottie.EYQ.mZx.EYQ.Td
        public boolean EYQ(float f) {
            return false;
        }

        @Override // com.bytedance.adsdk.lottie.EYQ.mZx.EYQ.Td
        public float Pm() {
            return 1.0f;
        }

        @Override // com.bytedance.adsdk.lottie.EYQ.mZx.EYQ.Td
        public float Td() {
            return 0.0f;
        }

        private mZx() {
        }

        @Override // com.bytedance.adsdk.lottie.EYQ.mZx.EYQ.Td
        public com.bytedance.adsdk.lottie.VwS.EYQ<T> mZx() {
            throw new IllegalStateException("not implemented");
        }

        @Override // com.bytedance.adsdk.lottie.EYQ.mZx.EYQ.Td
        public boolean mZx(float f) {
            throw new IllegalStateException("not implemented");
        }
    }

    /* compiled from: BaseKeyframeAnimation.java */
    private static final class Kbd<T> implements Td<T> {
        private final com.bytedance.adsdk.lottie.VwS.EYQ<T> EYQ;
        private float mZx = -1.0f;

        @Override // com.bytedance.adsdk.lottie.EYQ.mZx.EYQ.Td
        public boolean EYQ() {
            return false;
        }

        Kbd(List<? extends com.bytedance.adsdk.lottie.VwS.EYQ<T>> list) {
            this.EYQ = list.get(0);
        }

        @Override // com.bytedance.adsdk.lottie.EYQ.mZx.EYQ.Td
        public boolean EYQ(float f) {
            return !this.EYQ.Kbd();
        }

        @Override // com.bytedance.adsdk.lottie.EYQ.mZx.EYQ.Td
        public com.bytedance.adsdk.lottie.VwS.EYQ<T> mZx() {
            return this.EYQ;
        }

        @Override // com.bytedance.adsdk.lottie.EYQ.mZx.EYQ.Td
        public float Td() {
            return this.EYQ.Td();
        }

        @Override // com.bytedance.adsdk.lottie.EYQ.mZx.EYQ.Td
        public float Pm() {
            return this.EYQ.Pm();
        }

        @Override // com.bytedance.adsdk.lottie.EYQ.mZx.EYQ.Td
        public boolean mZx(float f) {
            if (this.mZx == f) {
                return true;
            }
            this.mZx = f;
            return false;
        }
    }

    /* compiled from: BaseKeyframeAnimation.java */
    private static final class Pm<T> implements Td<T> {
        private final List<? extends com.bytedance.adsdk.lottie.VwS.EYQ<T>> EYQ;
        private com.bytedance.adsdk.lottie.VwS.EYQ<T> Td = null;
        private float Pm = -1.0f;
        private com.bytedance.adsdk.lottie.VwS.EYQ<T> mZx = Td(0.0f);

        @Override // com.bytedance.adsdk.lottie.EYQ.mZx.EYQ.Td
        public boolean EYQ() {
            return false;
        }

        Pm(List<? extends com.bytedance.adsdk.lottie.VwS.EYQ<T>> list) {
            this.EYQ = list;
        }

        @Override // com.bytedance.adsdk.lottie.EYQ.mZx.EYQ.Td
        public boolean EYQ(float f) {
            if (this.mZx.EYQ(f)) {
                return !this.mZx.Kbd();
            }
            this.mZx = Td(f);
            return true;
        }

        private com.bytedance.adsdk.lottie.VwS.EYQ<T> Td(float f) {
            com.bytedance.adsdk.lottie.VwS.EYQ<T> eyq = this.EYQ.get(r0.size() - 1);
            if (f >= eyq.Td()) {
                return eyq;
            }
            for (int size = this.EYQ.size() - 2; size > 0; size--) {
                com.bytedance.adsdk.lottie.VwS.EYQ<T> eyq2 = this.EYQ.get(size);
                if (this.mZx != eyq2 && eyq2.EYQ(f)) {
                    return eyq2;
                }
            }
            return this.EYQ.get(0);
        }

        @Override // com.bytedance.adsdk.lottie.EYQ.mZx.EYQ.Td
        public com.bytedance.adsdk.lottie.VwS.EYQ<T> mZx() {
            return this.mZx;
        }

        @Override // com.bytedance.adsdk.lottie.EYQ.mZx.EYQ.Td
        public float Td() {
            return this.EYQ.get(0).Td();
        }

        @Override // com.bytedance.adsdk.lottie.EYQ.mZx.EYQ.Td
        public float Pm() {
            return this.EYQ.get(r0.size() - 1).Pm();
        }

        @Override // com.bytedance.adsdk.lottie.EYQ.mZx.EYQ.Td
        public boolean mZx(float f) {
            com.bytedance.adsdk.lottie.VwS.EYQ<T> eyq = this.Td;
            com.bytedance.adsdk.lottie.VwS.EYQ<T> eyq2 = this.mZx;
            if (eyq == eyq2 && this.Pm == f) {
                return true;
            }
            this.Td = eyq2;
            this.Pm = f;
            return false;
        }
    }
}
