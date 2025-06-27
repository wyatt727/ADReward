package com.bykv.vk.openvk.preload.a.b;

import com.bykv.vk.openvk.preload.a.b.a.n;
import com.bykv.vk.openvk.preload.a.m;
import com.bykv.vk.openvk.preload.a.o;
import com.bykv.vk.openvk.preload.a.r;
import java.io.EOFException;
import java.io.IOException;
import java.io.Writer;

/* compiled from: Streams.java */
/* loaded from: classes.dex */
public final class k {
    public static com.bykv.vk.openvk.preload.a.k a(com.bykv.vk.openvk.preload.a.d.a aVar) throws o {
        boolean z;
        try {
            try {
                aVar.f();
                z = false;
            } catch (EOFException e) {
                e = e;
                z = true;
            }
            try {
                return n.X.a(aVar);
            } catch (EOFException e2) {
                e = e2;
                if (z) {
                    return m.f1368a;
                }
                throw new r(e);
            }
        } catch (com.bykv.vk.openvk.preload.a.d.d e3) {
            throw new r(e3);
        } catch (IOException e4) {
            throw new com.bykv.vk.openvk.preload.a.l(e4);
        } catch (NumberFormatException e5) {
            throw new r(e5);
        }
    }

    public static void a(com.bykv.vk.openvk.preload.a.k kVar, com.bykv.vk.openvk.preload.a.d.c cVar) throws IOException {
        n.X.a(cVar, kVar);
    }

    public static Writer a(Appendable appendable) {
        return appendable instanceof Writer ? (Writer) appendable : new a(appendable);
    }

    /* compiled from: Streams.java */
    static final class a extends Writer {

        /* renamed from: a, reason: collision with root package name */
        private final Appendable f1350a;
        private final C0067a b = new C0067a();

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
        }

        @Override // java.io.Writer, java.io.Flushable
        public final void flush() {
        }

        a(Appendable appendable) {
            this.f1350a = appendable;
        }

        @Override // java.io.Writer
        public final void write(char[] cArr, int i, int i2) throws IOException {
            this.b.f1351a = cArr;
            this.f1350a.append(this.b, i, i2 + i);
        }

        @Override // java.io.Writer
        public final void write(int i) throws IOException {
            this.f1350a.append((char) i);
        }

        /* compiled from: Streams.java */
        /* renamed from: com.bykv.vk.openvk.preload.a.b.k$a$a, reason: collision with other inner class name */
        static class C0067a implements CharSequence {

            /* renamed from: a, reason: collision with root package name */
            char[] f1351a;

            C0067a() {
            }

            @Override // java.lang.CharSequence
            public final int length() {
                return this.f1351a.length;
            }

            @Override // java.lang.CharSequence
            public final char charAt(int i) {
                return this.f1351a[i];
            }

            @Override // java.lang.CharSequence
            public final CharSequence subSequence(int i, int i2) {
                return new String(this.f1351a, i, i2 - i);
            }
        }
    }
}
