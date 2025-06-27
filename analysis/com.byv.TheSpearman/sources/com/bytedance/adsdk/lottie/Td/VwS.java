package com.bytedance.adsdk.lottie.Td;

import android.util.Pair;

/* compiled from: MutablePair.java */
/* loaded from: classes2.dex */
public class VwS<T> {
    T EYQ;
    T mZx;

    public void EYQ(T t, T t2) {
        this.EYQ = t;
        this.mZx = t2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Pair)) {
            return false;
        }
        Pair pair = (Pair) obj;
        return mZx(pair.first, this.EYQ) && mZx(pair.second, this.mZx);
    }

    private static boolean mZx(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public int hashCode() {
        T t = this.EYQ;
        int iHashCode = t == null ? 0 : t.hashCode();
        T t2 = this.mZx;
        return iHashCode ^ (t2 != null ? t2.hashCode() : 0);
    }

    public String toString() {
        return "Pair{" + this.EYQ + " " + this.mZx + "}";
    }
}
