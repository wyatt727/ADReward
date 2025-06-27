package com.my.target;

import android.content.Context;
import android.net.Uri;

/* loaded from: classes4.dex */
public interface w {

    public interface a {
        void a(float f);

        void a(float f, float f2);

        void a(String str);

        void d();

        void e();

        void f();

        void h();

        void i();

        void n();

        void onVideoCompleted();
    }

    void a();

    void a(Uri uri, Context context);

    void a(Uri uri, x xVar);

    void a(a aVar);

    void a(x xVar);

    void b();

    boolean c();

    void d();

    void destroy();

    boolean e();

    void f();

    void g();

    float getDuration();

    long getPosition();

    Uri getUri();

    void h();

    boolean i();

    boolean isPlaying();

    void pause();

    void seekTo(long j);

    void setVolume(float f);

    void stop();
}
