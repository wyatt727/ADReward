package com.applovin.impl;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes.dex */
public interface o1 {

    /* renamed from: a, reason: collision with root package name */
    public static final ByteBuffer f733a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    a a(a aVar);

    void a(ByteBuffer byteBuffer);

    void b();

    boolean c();

    ByteBuffer d();

    void e();

    boolean f();

    void reset();

    public static final class a {
        public static final a e = new a(-1, -1, -1);

        /* renamed from: a, reason: collision with root package name */
        public final int f734a;
        public final int b;
        public final int c;
        public final int d;

        public String toString() {
            return "AudioFormat[sampleRate=" + this.f734a + ", channelCount=" + this.b + ", encoding=" + this.c + AbstractJsonLexerKt.END_LIST;
        }

        public a(int i, int i2, int i3) {
            this.f734a = i;
            this.b = i2;
            this.c = i3;
            this.d = yp.g(i3) ? yp.b(i3, i2) : -1;
        }
    }

    public static final class b extends Exception {
        public b(a aVar) {
            super("Unhandled format: " + aVar);
        }
    }
}
