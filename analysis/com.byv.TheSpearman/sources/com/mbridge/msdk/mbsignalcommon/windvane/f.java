package com.mbridge.msdk.mbsignalcommon.windvane;

import android.content.Context;
import java.util.HashMap;

/* compiled from: WindVaneApiManager.java */
/* loaded from: classes4.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private static HashMap<String, Class> f3189a = new HashMap<>();
    private Context b;
    private Object c;
    private WindVaneWebView d;

    public f(Context context, WindVaneWebView windVaneWebView) {
        Class<?> cls;
        this.b = context;
        this.d = windVaneWebView;
        try {
            a(com.mbridge.msdk.mbsignalcommon.base.e.f3151a, Class.forName("com.mbridge.msdk.interstitial.signalcommon.interstitial"));
        } catch (ClassNotFoundException unused) {
        }
        try {
            a(com.mbridge.msdk.mbsignalcommon.base.e.b, Class.forName("com.mbridge.msdk.video.signal.communication.RewardSignal"));
        } catch (ClassNotFoundException unused2) {
        }
        try {
            a(com.mbridge.msdk.mbsignalcommon.base.e.c, Class.forName("com.mbridge.msdk.video.signal.communication.VideoCommunication"));
        } catch (ClassNotFoundException unused3) {
        }
        try {
            a(com.mbridge.msdk.mbsignalcommon.base.e.e, Class.forName("com.mbridge.msdk.mbsignalcommon.mraid.MraidSignalCommunication"));
        } catch (ClassNotFoundException unused4) {
        }
        try {
            a(com.mbridge.msdk.mbsignalcommon.base.e.f, Class.forName("com.mbridge.msdk.mbsignalcommon.communication.BannerSignalPlugin"));
        } catch (ClassNotFoundException unused5) {
        }
        try {
            a(com.mbridge.msdk.mbsignalcommon.base.e.g, Class.forName("com.mbridge.msdk.splash.signal.SplashSignal"));
        } catch (ClassNotFoundException unused6) {
        }
        try {
            a(com.mbridge.msdk.mbsignalcommon.base.e.h, Class.forName("com.mbridge.msdk.mbsignalcommon.webEnvCheck.WebGLCheckSignal"));
        } catch (ClassNotFoundException unused7) {
        }
        try {
            if (!com.mbridge.msdk.f.b.a() || (cls = Class.forName("com.mbridge.msdk.mbsignalcommon.confirmation.bridge.ConfirmationJsBridgePlugin")) == null) {
                return;
            }
            a(cls.getSimpleName(), cls);
        } catch (Exception unused8) {
        }
    }

    public final void a(Context context) {
        this.b = context;
    }

    public final void a(Object obj) {
        this.c = obj;
    }

    private Object a(String str, WindVaneWebView windVaneWebView, Context context) {
        Class cls = f3189a.get(str);
        if (cls == null) {
            return null;
        }
        try {
            if (!h.class.isAssignableFrom(cls)) {
                return null;
            }
            h hVar = (h) cls.newInstance();
            hVar.initialize(context, windVaneWebView);
            hVar.initialize(this.c, windVaneWebView);
            return hVar;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public final void a(String str, Class cls) {
        if (f3189a == null) {
            f3189a = new HashMap<>();
        }
        f3189a.put(str, cls);
    }

    public final Object a(String str) {
        if (f3189a == null) {
            f3189a = new HashMap<>();
        }
        return a(str, this.d, this.b);
    }
}
