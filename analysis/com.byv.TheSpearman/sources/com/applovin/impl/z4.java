package com.applovin.impl;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.Layout;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import androidx.core.view.ViewCompat;
import com.applovin.exoplayer2.common.base.Objects;
import com.applovin.impl.m2;

/* loaded from: classes.dex */
public final class z4 implements m2 {
    public static final z4 s = new b().a("").a();
    public static final m2.a t = new m2.a() { // from class: com.applovin.impl.z4$$ExternalSyntheticLambda0
        @Override // com.applovin.impl.m2.a
        public final m2 a(Bundle bundle) {
            return z4.a(bundle);
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f1226a;
    public final Layout.Alignment b;
    public final Layout.Alignment c;
    public final Bitmap d;
    public final float f;
    public final int g;
    public final int h;
    public final float i;
    public final int j;
    public final float k;
    public final float l;
    public final boolean m;
    public final int n;
    public final int o;
    public final float p;
    public final int q;
    public final float r;

    private z4(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f, int i, int i2, float f2, int i3, int i4, float f3, float f4, float f5, boolean z, int i5, int i6, float f6) {
        if (charSequence == null) {
            a1.a(bitmap);
        } else {
            a1.a(bitmap == null);
        }
        if (charSequence instanceof Spanned) {
            this.f1226a = SpannedString.valueOf(charSequence);
        } else if (charSequence != null) {
            this.f1226a = charSequence.toString();
        } else {
            this.f1226a = null;
        }
        this.b = alignment;
        this.c = alignment2;
        this.d = bitmap;
        this.f = f;
        this.g = i;
        this.h = i2;
        this.i = f2;
        this.j = i3;
        this.k = f4;
        this.l = f5;
        this.m = z;
        this.n = i5;
        this.o = i4;
        this.p = f3;
        this.q = i6;
        this.r = f6;
    }

    public boolean equals(Object obj) {
        Bitmap bitmap;
        Bitmap bitmap2;
        if (this == obj) {
            return true;
        }
        if (obj == null || z4.class != obj.getClass()) {
            return false;
        }
        z4 z4Var = (z4) obj;
        return TextUtils.equals(this.f1226a, z4Var.f1226a) && this.b == z4Var.b && this.c == z4Var.c && ((bitmap = this.d) != null ? !((bitmap2 = z4Var.d) == null || !bitmap.sameAs(bitmap2)) : z4Var.d == null) && this.f == z4Var.f && this.g == z4Var.g && this.h == z4Var.h && this.i == z4Var.i && this.j == z4Var.j && this.k == z4Var.k && this.l == z4Var.l && this.m == z4Var.m && this.n == z4Var.n && this.o == z4Var.o && this.p == z4Var.p && this.q == z4Var.q && this.r == z4Var.r;
    }

    public int hashCode() {
        return Objects.hashCode(this.f1226a, this.b, this.c, this.d, Float.valueOf(this.f), Integer.valueOf(this.g), Integer.valueOf(this.h), Float.valueOf(this.i), Integer.valueOf(this.j), Float.valueOf(this.k), Float.valueOf(this.l), Boolean.valueOf(this.m), Integer.valueOf(this.n), Integer.valueOf(this.o), Float.valueOf(this.p), Integer.valueOf(this.q), Float.valueOf(this.r));
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private CharSequence f1227a;
        private Bitmap b;
        private Layout.Alignment c;
        private Layout.Alignment d;
        private float e;
        private int f;
        private int g;
        private float h;
        private int i;
        private int j;
        private float k;
        private float l;
        private float m;
        private boolean n;
        private int o;
        private int p;
        private float q;

        public b() {
            this.f1227a = null;
            this.b = null;
            this.c = null;
            this.d = null;
            this.e = -3.4028235E38f;
            this.f = Integer.MIN_VALUE;
            this.g = Integer.MIN_VALUE;
            this.h = -3.4028235E38f;
            this.i = Integer.MIN_VALUE;
            this.j = Integer.MIN_VALUE;
            this.k = -3.4028235E38f;
            this.l = -3.4028235E38f;
            this.m = -3.4028235E38f;
            this.n = false;
            this.o = ViewCompat.MEASURED_STATE_MASK;
            this.p = Integer.MIN_VALUE;
        }

        public CharSequence e() {
            return this.f1227a;
        }

        public b a(Bitmap bitmap) {
            this.b = bitmap;
            return this;
        }

        public int c() {
            return this.g;
        }

        public int d() {
            return this.i;
        }

        public b b() {
            this.n = false;
            return this;
        }

        private b(z4 z4Var) {
            this.f1227a = z4Var.f1226a;
            this.b = z4Var.d;
            this.c = z4Var.b;
            this.d = z4Var.c;
            this.e = z4Var.f;
            this.f = z4Var.g;
            this.g = z4Var.h;
            this.h = z4Var.i;
            this.i = z4Var.j;
            this.j = z4Var.o;
            this.k = z4Var.p;
            this.l = z4Var.k;
            this.m = z4Var.l;
            this.n = z4Var.m;
            this.o = z4Var.n;
            this.p = z4Var.q;
            this.q = z4Var.r;
        }

        public b a(float f) {
            this.m = f;
            return this;
        }

        public b d(float f) {
            this.l = f;
            return this;
        }

        public b b(float f) {
            this.h = f;
            return this;
        }

        public b c(float f) {
            this.q = f;
            return this;
        }

        public b a(float f, int i) {
            this.e = f;
            this.f = i;
            return this;
        }

        public b b(int i) {
            this.i = i;
            return this;
        }

        public b d(int i) {
            this.o = i;
            this.n = true;
            return this;
        }

        public b c(int i) {
            this.p = i;
            return this;
        }

        public b a(int i) {
            this.g = i;
            return this;
        }

        public b b(Layout.Alignment alignment) {
            this.c = alignment;
            return this;
        }

        public b a(Layout.Alignment alignment) {
            this.d = alignment;
            return this;
        }

        public b b(float f, int i) {
            this.k = f;
            this.j = i;
            return this;
        }

        public b a(CharSequence charSequence) {
            this.f1227a = charSequence;
            return this;
        }

        public z4 a() {
            return new z4(this.f1227a, this.c, this.d, this.b, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q);
        }
    }

    private static String a(int i) {
        return Integer.toString(i, 36);
    }

    public b a() {
        return new b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final z4 a(Bundle bundle) {
        b bVar = new b();
        CharSequence charSequence = bundle.getCharSequence(a(0));
        if (charSequence != null) {
            bVar.a(charSequence);
        }
        Layout.Alignment alignment = (Layout.Alignment) bundle.getSerializable(a(1));
        if (alignment != null) {
            bVar.b(alignment);
        }
        Layout.Alignment alignment2 = (Layout.Alignment) bundle.getSerializable(a(2));
        if (alignment2 != null) {
            bVar.a(alignment2);
        }
        Bitmap bitmap = (Bitmap) bundle.getParcelable(a(3));
        if (bitmap != null) {
            bVar.a(bitmap);
        }
        if (bundle.containsKey(a(4)) && bundle.containsKey(a(5))) {
            bVar.a(bundle.getFloat(a(4)), bundle.getInt(a(5)));
        }
        if (bundle.containsKey(a(6))) {
            bVar.a(bundle.getInt(a(6)));
        }
        if (bundle.containsKey(a(7))) {
            bVar.b(bundle.getFloat(a(7)));
        }
        if (bundle.containsKey(a(8))) {
            bVar.b(bundle.getInt(a(8)));
        }
        if (bundle.containsKey(a(10)) && bundle.containsKey(a(9))) {
            bVar.b(bundle.getFloat(a(10)), bundle.getInt(a(9)));
        }
        if (bundle.containsKey(a(11))) {
            bVar.d(bundle.getFloat(a(11)));
        }
        if (bundle.containsKey(a(12))) {
            bVar.a(bundle.getFloat(a(12)));
        }
        if (bundle.containsKey(a(13))) {
            bVar.d(bundle.getInt(a(13)));
        }
        if (!bundle.getBoolean(a(14), false)) {
            bVar.b();
        }
        if (bundle.containsKey(a(15))) {
            bVar.c(bundle.getInt(a(15)));
        }
        if (bundle.containsKey(a(16))) {
            bVar.c(bundle.getFloat(a(16)));
        }
        return bVar.a();
    }
}
