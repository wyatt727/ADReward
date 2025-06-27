package com.bytedance.sdk.component.EYQ;

/* compiled from: BaseStatefulMethod.java */
/* loaded from: classes2.dex */
public abstract class Pm<P, R> extends com.bytedance.sdk.component.EYQ.mZx<P, R> {
    private boolean EYQ = true;
    private IPb Td;
    private EYQ mZx;

    /* compiled from: BaseStatefulMethod.java */
    interface EYQ {
        void EYQ(Throwable th);
    }

    /* compiled from: BaseStatefulMethod.java */
    public interface mZx {
        Pm EYQ();
    }

    protected abstract void EYQ(P p, IPb iPb) throws Exception;

    @Override // com.bytedance.sdk.component.EYQ.mZx
    public /* bridge */ /* synthetic */ String EYQ() {
        return super.EYQ();
    }

    protected final void EYQ(Throwable th) {
        if (IPb()) {
            this.mZx.EYQ(th);
            Pm();
        }
    }

    protected final void Td() {
        EYQ((Throwable) null);
    }

    protected void Pm() {
        this.EYQ = false;
        this.Td = null;
    }

    void EYQ(P p, IPb iPb, EYQ eyq) throws Exception {
        this.Td = iPb;
        this.mZx = eyq;
        EYQ(p, iPb);
    }

    void Kbd() {
        Pm();
    }

    private boolean IPb() {
        if (this.EYQ) {
            return true;
        }
        HX.EYQ(new IllegalStateException("Jsb async call already finished: " + EYQ() + ", hashcode: " + hashCode()));
        return false;
    }
}
