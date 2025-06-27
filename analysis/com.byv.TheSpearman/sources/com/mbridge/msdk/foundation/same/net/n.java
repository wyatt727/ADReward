package com.mbridge.msdk.foundation.same.net;

import android.content.Context;

/* compiled from: VolleyManager.java */
/* loaded from: classes4.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    private static n f2906a;
    private j b;
    private com.mbridge.msdk.foundation.same.net.e.b c;
    private j d;

    private n() {
    }

    public static void a(i iVar) {
        b().a(iVar);
    }

    private static j b() {
        n nVar = f2906a;
        if (nVar != null) {
            j jVar = nVar.d;
            if (jVar != null) {
                return jVar;
            }
            nVar.d = new j(com.mbridge.msdk.foundation.controller.c.m().c());
            return f2906a.d;
        }
        n nVar2 = new n();
        f2906a = nVar2;
        if (nVar2.d == null) {
            nVar2.d = new j(com.mbridge.msdk.foundation.controller.c.m().c());
        }
        return f2906a.d;
    }

    public static com.mbridge.msdk.foundation.same.net.e.b a() {
        n nVar = f2906a;
        if (nVar != null) {
            com.mbridge.msdk.foundation.same.net.e.b bVar = nVar.c;
            if (bVar != null) {
                return bVar;
            }
            nVar.c = new com.mbridge.msdk.foundation.same.net.e.b(b(), 3);
            return f2906a.c;
        }
        n nVar2 = new n();
        f2906a = nVar2;
        if (nVar2.c == null) {
            nVar2.c = new com.mbridge.msdk.foundation.same.net.e.b(b(), 3);
        }
        return f2906a.c;
    }

    public static void a(Context context) {
        if (f2906a == null) {
            n nVar = new n();
            f2906a = nVar;
            nVar.d = new j(context.getApplicationContext());
            f2906a.c = new com.mbridge.msdk.foundation.same.net.e.b(b(), 3);
        }
    }

    public static void b(i iVar) {
        n nVar = f2906a;
        if (nVar != null) {
            if (nVar.b == null) {
                nVar.b = new j(com.mbridge.msdk.foundation.controller.c.m().c(), null);
            }
        } else {
            n nVar2 = new n();
            f2906a = nVar2;
            if (nVar2.b == null) {
                nVar2.b = new j(com.mbridge.msdk.foundation.controller.c.m().c(), null);
            }
        }
        f2906a.b.a(iVar);
    }
}
