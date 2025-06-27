package com.applovin.impl;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import com.applovin.impl.rl;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public interface cd {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final fd f328a;
        public final MediaFormat b;
        public final d9 c;
        public final Surface d;
        public final MediaCrypto e;
        public final int f;
        public final boolean g;

        public static a a(fd fdVar, MediaFormat mediaFormat, d9 d9Var, MediaCrypto mediaCrypto) {
            return new a(fdVar, mediaFormat, d9Var, null, mediaCrypto, 0, false);
        }

        public static a a(fd fdVar, MediaFormat mediaFormat, d9 d9Var, Surface surface, MediaCrypto mediaCrypto) {
            return new a(fdVar, mediaFormat, d9Var, surface, mediaCrypto, 0, false);
        }

        private a(fd fdVar, MediaFormat mediaFormat, d9 d9Var, Surface surface, MediaCrypto mediaCrypto, int i, boolean z) {
            this.f328a = fdVar;
            this.b = mediaFormat;
            this.c = d9Var;
            this.d = surface;
            this.e = mediaCrypto;
            this.f = i;
            this.g = z;
        }
    }

    public interface b {

        /* renamed from: a, reason: collision with root package name */
        public static final b f329a = new rl.c();

        cd a(a aVar);
    }

    public interface c {
        void a(cd cdVar, long j, long j2);
    }

    int a(MediaCodec.BufferInfo bufferInfo);

    ByteBuffer a(int i);

    void a();

    void a(int i, int i2, int i3, long j, int i4);

    void a(int i, int i2, y4 y4Var, long j, int i3);

    void a(int i, long j);

    void a(int i, boolean z);

    void a(Bundle bundle);

    void a(Surface surface);

    void a(c cVar, Handler handler);

    ByteBuffer b(int i);

    void b();

    void c(int i);

    boolean c();

    int d();

    MediaFormat e();
}
