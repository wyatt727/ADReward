package com.mbridge.msdk.foundation.same.net.a;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.same.b.e;
import com.mbridge.msdk.foundation.tools.ad;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.chromium.net.CronetEngine;

/* compiled from: CronetEngineManager.java */
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final ExecutorService f2863a;
    private final ArrayList<String> b;
    private CronetEngine.Builder c;
    private CronetEngine d;

    private a() {
        this.f2863a = Executors.newCachedThreadPool();
        this.b = new ArrayList<>();
        if (this.c == null) {
            this.c = d();
        }
        this.d = this.c.build();
    }

    private CronetEngine.Builder d() {
        if (this.c == null) {
            this.c = new CronetEngine.Builder(com.mbridge.msdk.foundation.controller.c.m().c());
            this.c.setStoragePath(e.a(com.mbridge.msdk.foundation.same.b.c.MBRIDGE_OTHER)).enableHttpCache(2, 5242880L).enableHttp2(true).enableQuic(true);
        }
        return this.c;
    }

    public static a a() {
        return C0270a.f2864a;
    }

    public final void a(String str) {
        try {
            if (TextUtils.isEmpty(str) || this.b.contains(str)) {
                return;
            }
            this.b.add(str);
            if (this.c == null) {
                this.c = d();
            }
            CronetEngine.Builder builder = this.c;
            if (builder != null) {
                builder.addQuicHint(str, 443, 443);
            }
        } catch (Throwable th) {
            ad.b("CronetEngineManager", th.getMessage());
        }
    }

    public final ExecutorService b() {
        return this.f2863a;
    }

    public final CronetEngine c() {
        if (com.mbridge.msdk.foundation.controller.c.m().c() == null) {
            return null;
        }
        CronetEngine cronetEngine = this.d;
        if (cronetEngine != null) {
            return cronetEngine;
        }
        if (this.c == null) {
            this.c = d();
        }
        CronetEngine cronetEngineBuild = this.c.build();
        this.d = cronetEngineBuild;
        return cronetEngineBuild;
    }

    /* compiled from: CronetEngineManager.java */
    /* renamed from: com.mbridge.msdk.foundation.same.net.a.a$a, reason: collision with other inner class name */
    private static final class C0270a {

        /* renamed from: a, reason: collision with root package name */
        private static final a f2864a = new a();
    }
}
