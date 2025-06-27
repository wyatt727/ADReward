package com.applovin.impl;

/* loaded from: classes.dex */
public final class ni {
    public static final ni b = new ni(false);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f722a;

    public ni(boolean z) {
        this.f722a = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && ni.class == obj.getClass() && this.f722a == ((ni) obj).f722a;
    }

    public int hashCode() {
        return !this.f722a ? 1 : 0;
    }
}
