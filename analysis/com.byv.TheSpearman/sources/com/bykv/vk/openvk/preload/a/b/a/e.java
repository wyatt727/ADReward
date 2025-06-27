package com.bykv.vk.openvk.preload.a.b.a;

import com.bykv.vk.openvk.preload.a.p;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: JsonTreeReader.java */
/* loaded from: classes.dex */
public final class e extends com.bykv.vk.openvk.preload.a.d.a {
    private static final Reader c = new Reader() { // from class: com.bykv.vk.openvk.preload.a.b.a.e.1
        @Override // java.io.Reader
        public final int read(char[] cArr, int i, int i2) throws IOException {
            throw new AssertionError();
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            throw new AssertionError();
        }
    };
    private static final Object d = new Object();
    private Object[] e;
    private int f;
    private String[] g;
    private int[] h;

    @Override // com.bykv.vk.openvk.preload.a.d.a
    public final void a() throws IOException {
        a(com.bykv.vk.openvk.preload.a.d.b.BEGIN_ARRAY);
        a(((com.bykv.vk.openvk.preload.a.i) g()).iterator());
        this.h[this.f - 1] = 0;
    }

    @Override // com.bykv.vk.openvk.preload.a.d.a
    public final void b() throws IOException {
        a(com.bykv.vk.openvk.preload.a.d.b.END_ARRAY);
        s();
        s();
        int i = this.f;
        if (i > 0) {
            int[] iArr = this.h;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    @Override // com.bykv.vk.openvk.preload.a.d.a
    public final void c() throws IOException {
        a(com.bykv.vk.openvk.preload.a.d.b.BEGIN_OBJECT);
        a(((com.bykv.vk.openvk.preload.a.n) g()).f1369a.entrySet().iterator());
    }

    @Override // com.bykv.vk.openvk.preload.a.d.a
    public final void d() throws IOException {
        a(com.bykv.vk.openvk.preload.a.d.b.END_OBJECT);
        s();
        s();
        int i = this.f;
        if (i > 0) {
            int[] iArr = this.h;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    @Override // com.bykv.vk.openvk.preload.a.d.a
    public final boolean e() throws IOException {
        com.bykv.vk.openvk.preload.a.d.b bVarF = f();
        return (bVarF == com.bykv.vk.openvk.preload.a.d.b.END_OBJECT || bVarF == com.bykv.vk.openvk.preload.a.d.b.END_ARRAY) ? false : true;
    }

    @Override // com.bykv.vk.openvk.preload.a.d.a
    public final com.bykv.vk.openvk.preload.a.d.b f() throws IOException {
        while (this.f != 0) {
            Object objG = g();
            if (objG instanceof Iterator) {
                boolean z = this.e[this.f - 2] instanceof com.bykv.vk.openvk.preload.a.n;
                Iterator it = (Iterator) objG;
                if (!it.hasNext()) {
                    return z ? com.bykv.vk.openvk.preload.a.d.b.END_OBJECT : com.bykv.vk.openvk.preload.a.d.b.END_ARRAY;
                }
                if (z) {
                    return com.bykv.vk.openvk.preload.a.d.b.NAME;
                }
                a(it.next());
            } else {
                if (objG instanceof com.bykv.vk.openvk.preload.a.n) {
                    return com.bykv.vk.openvk.preload.a.d.b.BEGIN_OBJECT;
                }
                if (objG instanceof com.bykv.vk.openvk.preload.a.i) {
                    return com.bykv.vk.openvk.preload.a.d.b.BEGIN_ARRAY;
                }
                if (objG instanceof p) {
                    p pVar = (p) objG;
                    if (pVar.f1370a instanceof String) {
                        return com.bykv.vk.openvk.preload.a.d.b.STRING;
                    }
                    if (pVar.f1370a instanceof Boolean) {
                        return com.bykv.vk.openvk.preload.a.d.b.BOOLEAN;
                    }
                    if (pVar.f1370a instanceof Number) {
                        return com.bykv.vk.openvk.preload.a.d.b.NUMBER;
                    }
                    throw new AssertionError();
                }
                if (objG instanceof com.bykv.vk.openvk.preload.a.m) {
                    return com.bykv.vk.openvk.preload.a.d.b.NULL;
                }
                if (objG == d) {
                    throw new IllegalStateException("JsonReader is closed");
                }
                throw new AssertionError();
            }
        }
        return com.bykv.vk.openvk.preload.a.d.b.END_DOCUMENT;
    }

    public final Object g() {
        return this.e[this.f - 1];
    }

    private Object s() {
        Object[] objArr = this.e;
        int i = this.f - 1;
        this.f = i;
        Object obj = objArr[i];
        objArr[i] = null;
        return obj;
    }

    public final void a(com.bykv.vk.openvk.preload.a.d.b bVar) throws IOException {
        if (f() == bVar) {
            return;
        }
        throw new IllegalStateException("Expected " + bVar + " but was " + f() + t());
    }

    @Override // com.bykv.vk.openvk.preload.a.d.a
    public final String h() throws IOException {
        a(com.bykv.vk.openvk.preload.a.d.b.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) g()).next();
        String str = (String) entry.getKey();
        this.g[this.f - 1] = str;
        a(entry.getValue());
        return str;
    }

    @Override // com.bykv.vk.openvk.preload.a.d.a
    public final String i() throws IOException {
        com.bykv.vk.openvk.preload.a.d.b bVarF = f();
        if (bVarF != com.bykv.vk.openvk.preload.a.d.b.STRING && bVarF != com.bykv.vk.openvk.preload.a.d.b.NUMBER) {
            throw new IllegalStateException("Expected " + com.bykv.vk.openvk.preload.a.d.b.STRING + " but was " + bVarF + t());
        }
        String strB = ((p) s()).b();
        int i = this.f;
        if (i > 0) {
            int[] iArr = this.h;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return strB;
    }

    @Override // com.bykv.vk.openvk.preload.a.d.a
    public final boolean j() throws IOException {
        a(com.bykv.vk.openvk.preload.a.d.b.BOOLEAN);
        boolean zF = ((p) s()).f();
        int i = this.f;
        if (i > 0) {
            int[] iArr = this.h;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return zF;
    }

    @Override // com.bykv.vk.openvk.preload.a.d.a
    public final void k() throws IOException {
        a(com.bykv.vk.openvk.preload.a.d.b.NULL);
        s();
        int i = this.f;
        if (i > 0) {
            int[] iArr = this.h;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    @Override // com.bykv.vk.openvk.preload.a.d.a
    public final double l() throws IOException {
        com.bykv.vk.openvk.preload.a.d.b bVarF = f();
        if (bVarF != com.bykv.vk.openvk.preload.a.d.b.NUMBER && bVarF != com.bykv.vk.openvk.preload.a.d.b.STRING) {
            throw new IllegalStateException("Expected " + com.bykv.vk.openvk.preload.a.d.b.NUMBER + " but was " + bVarF + t());
        }
        double dC = ((p) g()).c();
        if (!this.f1357a && (Double.isNaN(dC) || Double.isInfinite(dC))) {
            throw new NumberFormatException("JSON forbids NaN and infinities: ".concat(String.valueOf(dC)));
        }
        s();
        int i = this.f;
        if (i > 0) {
            int[] iArr = this.h;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return dC;
    }

    @Override // com.bykv.vk.openvk.preload.a.d.a
    public final long m() throws IOException {
        com.bykv.vk.openvk.preload.a.d.b bVarF = f();
        if (bVarF != com.bykv.vk.openvk.preload.a.d.b.NUMBER && bVarF != com.bykv.vk.openvk.preload.a.d.b.STRING) {
            throw new IllegalStateException("Expected " + com.bykv.vk.openvk.preload.a.d.b.NUMBER + " but was " + bVarF + t());
        }
        long jD = ((p) g()).d();
        s();
        int i = this.f;
        if (i > 0) {
            int[] iArr = this.h;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return jD;
    }

    @Override // com.bykv.vk.openvk.preload.a.d.a
    public final int n() throws IOException {
        com.bykv.vk.openvk.preload.a.d.b bVarF = f();
        if (bVarF != com.bykv.vk.openvk.preload.a.d.b.NUMBER && bVarF != com.bykv.vk.openvk.preload.a.d.b.STRING) {
            throw new IllegalStateException("Expected " + com.bykv.vk.openvk.preload.a.d.b.NUMBER + " but was " + bVarF + t());
        }
        int iE = ((p) g()).e();
        s();
        int i = this.f;
        if (i > 0) {
            int[] iArr = this.h;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return iE;
    }

    @Override // com.bykv.vk.openvk.preload.a.d.a, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.e = new Object[]{d};
        this.f = 1;
    }

    @Override // com.bykv.vk.openvk.preload.a.d.a
    public final void o() throws IOException {
        if (f() == com.bykv.vk.openvk.preload.a.d.b.NAME) {
            h();
            this.g[this.f - 2] = AbstractJsonLexerKt.NULL;
        } else {
            s();
            int i = this.f;
            if (i > 0) {
                this.g[i - 1] = AbstractJsonLexerKt.NULL;
            }
        }
        int i2 = this.f;
        if (i2 > 0) {
            int[] iArr = this.h;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
    }

    @Override // com.bykv.vk.openvk.preload.a.d.a
    public final String toString() {
        return getClass().getSimpleName();
    }

    public final void a(Object obj) {
        int i = this.f;
        Object[] objArr = this.e;
        if (i == objArr.length) {
            int i2 = i * 2;
            this.e = Arrays.copyOf(objArr, i2);
            this.h = Arrays.copyOf(this.h, i2);
            this.g = (String[]) Arrays.copyOf(this.g, i2);
        }
        Object[] objArr2 = this.e;
        int i3 = this.f;
        this.f = i3 + 1;
        objArr2[i3] = obj;
    }

    @Override // com.bykv.vk.openvk.preload.a.d.a
    public final String p() {
        StringBuilder sb = new StringBuilder("$");
        int i = 0;
        while (i < this.f) {
            Object[] objArr = this.e;
            if (objArr[i] instanceof com.bykv.vk.openvk.preload.a.i) {
                i++;
                if (objArr[i] instanceof Iterator) {
                    sb.append(AbstractJsonLexerKt.BEGIN_LIST);
                    sb.append(this.h[i]);
                    sb.append(AbstractJsonLexerKt.END_LIST);
                }
            } else if (objArr[i] instanceof com.bykv.vk.openvk.preload.a.n) {
                i++;
                if (objArr[i] instanceof Iterator) {
                    sb.append('.');
                    String[] strArr = this.g;
                    if (strArr[i] != null) {
                        sb.append(strArr[i]);
                    }
                }
            }
            i++;
        }
        return sb.toString();
    }

    private String t() {
        return " at path " + p();
    }
}
