package com.bytedance.sdk.component.mZx.EYQ;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: OkHttpClient.java */
/* loaded from: classes2.dex */
public abstract class MxO implements Cloneable {
    public List<QQ> EYQ;
    public long IPb;
    public TimeUnit Kbd;
    public long Pm;
    public TimeUnit Td;
    public TimeUnit VwS;
    public long mZx;

    public abstract Pm EYQ();

    public abstract mZx EYQ(pi piVar);

    public MxO(EYQ eyq) {
        this.mZx = eyq.mZx;
        this.Pm = eyq.Pm;
        this.IPb = eyq.IPb;
        this.EYQ = eyq.EYQ;
        this.Td = eyq.Td;
        this.Kbd = eyq.Kbd;
        this.VwS = eyq.VwS;
        this.EYQ = eyq.EYQ;
    }

    /* compiled from: OkHttpClient.java */
    public static final class EYQ {
        public final List<QQ> EYQ;
        public long IPb;
        public TimeUnit Kbd;
        public long Pm;
        public TimeUnit Td;
        public TimeUnit VwS;
        public long mZx;

        public EYQ() {
            this.EYQ = new ArrayList();
            this.mZx = 10000L;
            this.Td = TimeUnit.MILLISECONDS;
            this.Pm = 10000L;
            this.Kbd = TimeUnit.MILLISECONDS;
            this.IPb = 10000L;
            this.VwS = TimeUnit.MILLISECONDS;
        }

        public EYQ(String str) {
            this.EYQ = new ArrayList();
            this.mZx = 10000L;
            this.Td = TimeUnit.MILLISECONDS;
            this.Pm = 10000L;
            this.Kbd = TimeUnit.MILLISECONDS;
            this.IPb = 10000L;
            this.VwS = TimeUnit.MILLISECONDS;
        }

        public EYQ(MxO mxO) {
            this.EYQ = new ArrayList();
            this.mZx = 10000L;
            this.Td = TimeUnit.MILLISECONDS;
            this.Pm = 10000L;
            this.Kbd = TimeUnit.MILLISECONDS;
            this.IPb = 10000L;
            this.VwS = TimeUnit.MILLISECONDS;
            this.mZx = mxO.mZx;
            this.Td = mxO.Td;
            this.Pm = mxO.Pm;
            this.Kbd = mxO.Kbd;
            this.IPb = mxO.IPb;
            this.VwS = mxO.VwS;
        }

        public EYQ EYQ(long j, TimeUnit timeUnit) {
            this.mZx = j;
            this.Td = timeUnit;
            return this;
        }

        public EYQ mZx(long j, TimeUnit timeUnit) {
            this.Pm = j;
            this.Kbd = timeUnit;
            return this;
        }

        public EYQ Td(long j, TimeUnit timeUnit) {
            this.IPb = j;
            this.VwS = timeUnit;
            return this;
        }

        public EYQ EYQ(QQ qq) {
            this.EYQ.add(qq);
            return this;
        }

        public MxO EYQ() {
            return com.bytedance.sdk.component.mZx.EYQ.EYQ.EYQ.EYQ(this);
        }
    }

    public EYQ mZx() {
        return new EYQ(this);
    }
}
