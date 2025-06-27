package com.applovin.impl;

import com.json.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class uo {

    /* renamed from: a, reason: collision with root package name */
    public final int f1073a;
    private final to[] b;
    private int c;

    public uo(to... toVarArr) {
        this.b = toVarArr;
        this.f1073a = toVarArr.length;
    }

    public to a(int i) {
        return this.b[i];
    }

    public int hashCode() {
        if (this.c == 0) {
            this.c = Arrays.hashCode(this.b) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE;
        }
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || uo.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.b, ((uo) obj).b);
    }
}
