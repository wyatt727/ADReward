package com.bytedance.sdk.component.adexpress.dynamic.Td;

import java.util.Arrays;

/* compiled from: DynamicPoint.java */
/* loaded from: classes2.dex */
public class HX {
    public float EYQ;
    public float mZx;

    public HX(float f, float f2) {
        this.EYQ = f;
        this.mZx = f2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            HX hx = (HX) obj;
            if (Float.compare(hx.EYQ, this.EYQ) == 0 && Float.compare(hx.mZx, this.mZx) == 0) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.EYQ), Float.valueOf(this.mZx)});
    }
}
