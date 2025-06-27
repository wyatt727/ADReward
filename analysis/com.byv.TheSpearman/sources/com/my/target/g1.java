package com.my.target;

import java.util.ArrayList;

/* loaded from: classes4.dex */
public abstract class g1 extends x9 {
    public final long d;
    public long e;

    public g1(j2 j2Var, ArrayList<u9> arrayList, long j) {
        super(j2Var, arrayList);
        this.e = 0L;
        this.d = j;
    }

    public final boolean a(boolean z) {
        if (!z) {
            this.e = 0L;
            return false;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (this.e == 0) {
            this.e = jCurrentTimeMillis;
        }
        if (jCurrentTimeMillis - this.e < this.d) {
            ba.b("ViewabilityTracker: ContinuousVisibilityBaseTracker", "view continuous visibility < " + this.d + " millis");
            return false;
        }
        ba.b("ViewabilityTracker: ContinuousVisibilityBaseTracker", "view continuous visible for " + this.d + " millis");
        return true;
    }
}
