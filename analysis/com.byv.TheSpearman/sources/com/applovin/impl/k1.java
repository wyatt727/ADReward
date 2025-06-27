package com.applovin.impl;

import android.media.AudioAttributes;
import android.os.Bundle;
import com.applovin.impl.m2;
import com.json.mediationsdk.logger.IronSourceError;

/* loaded from: classes.dex */
public final class k1 implements m2 {
    public static final k1 g = new b().a();
    public static final m2.a h = new m2.a() { // from class: com.applovin.impl.k1$$ExternalSyntheticLambda0
        @Override // com.applovin.impl.m2.a
        public final m2 a(Bundle bundle) {
            return k1.a(bundle);
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public final int f582a;
    public final int b;
    public final int c;
    public final int d;
    private AudioAttributes f;

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private int f583a = 0;
        private int b = 0;
        private int c = 1;
        private int d = 1;

        public b b(int i) {
            this.f583a = i;
            return this;
        }

        public b c(int i) {
            this.b = i;
            return this;
        }

        public b d(int i) {
            this.c = i;
            return this;
        }

        public b a(int i) {
            this.d = i;
            return this;
        }

        public k1 a() {
            return new k1(this.f583a, this.b, this.c, this.d);
        }
    }

    private k1(int i, int i2, int i3, int i4) {
        this.f582a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public AudioAttributes a() {
        if (this.f == null) {
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(this.f582a).setFlags(this.b).setUsage(this.c);
            if (yp.f1214a >= 29) {
                usage.setAllowedCapturePolicy(this.d);
            }
            this.f = usage.build();
        }
        return this.f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || k1.class != obj.getClass()) {
            return false;
        }
        k1 k1Var = (k1) obj;
        return this.f582a == k1Var.f582a && this.b == k1Var.b && this.c == k1Var.c && this.d == k1Var.d;
    }

    public int hashCode() {
        return ((((((this.f582a + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.b) * 31) + this.c) * 31) + this.d;
    }

    private static String a(int i) {
        return Integer.toString(i, 36);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ k1 a(Bundle bundle) {
        b bVar = new b();
        if (bundle.containsKey(a(0))) {
            bVar.b(bundle.getInt(a(0)));
        }
        if (bundle.containsKey(a(1))) {
            bVar.c(bundle.getInt(a(1)));
        }
        if (bundle.containsKey(a(2))) {
            bVar.d(bundle.getInt(a(2)));
        }
        if (bundle.containsKey(a(3))) {
            bVar.a(bundle.getInt(a(3)));
        }
        return bVar.a();
    }
}
