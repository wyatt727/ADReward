package com.mbridge.msdk.video.signal;

import android.app.Activity;
import com.iab.omid.library.mmadbridge.adsession.AdEvents;
import com.iab.omid.library.mmadbridge.adsession.AdSession;
import com.iab.omid.library.mmadbridge.adsession.media.MediaEvents;
import com.mbridge.msdk.out.NativeListener;

/* compiled from: BaseIJSCommon.java */
/* loaded from: classes4.dex */
public interface a extends e {

    /* compiled from: BaseIJSCommon.java */
    /* renamed from: com.mbridge.msdk.video.signal.a$a, reason: collision with other inner class name */
    public interface InterfaceC0308a extends NativeListener.NativeTrackingListener {
        void a();

        void a(int i, String str);

        void a(boolean z);

        void b();
    }

    int a();

    void a(int i);

    void a(int i, String str);

    void a(Activity activity);

    void a(AdEvents adEvents);

    void a(AdSession adSession);

    void a(MediaEvents mediaEvents);

    void a(InterfaceC0308a interfaceC0308a);

    void a(com.mbridge.msdk.videocommon.d.c cVar);

    void a(String str);

    void a(boolean z);

    void b(int i);

    void b(String str);

    void b(boolean z);

    boolean b();

    String c();

    void c(int i);

    void d();

    void d(int i);

    void e();

    void e(int i);

    void f();

    void f(int i);

    int g();

    String g(int i);

    int h();

    void h(int i);

    String i();
}
