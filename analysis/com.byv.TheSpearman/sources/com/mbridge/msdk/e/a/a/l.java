package com.mbridge.msdk.e.a.a;

import android.os.Handler;
import android.os.Looper;
import com.mbridge.msdk.e.a.q;
import com.mbridge.msdk.e.a.t;

/* compiled from: Volley.java */
/* loaded from: classes4.dex */
public final class l {
    public static q a(com.mbridge.msdk.e.a.j jVar, t tVar, int i, com.mbridge.msdk.e.a.b bVar) {
        if (jVar == null) {
            jVar = new b(new g());
        }
        if (tVar == null) {
            tVar = new com.mbridge.msdk.e.a.h(new Handler(Looper.getMainLooper()));
        }
        if (i <= 0) {
            i = 4;
        }
        if (bVar == null) {
            bVar = new i();
        }
        return new q(jVar, tVar, i, bVar);
    }
}
