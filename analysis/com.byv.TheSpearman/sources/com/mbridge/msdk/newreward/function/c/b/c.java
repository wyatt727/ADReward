package com.mbridge.msdk.newreward.function.c.b;

import com.mbridge.msdk.newreward.function.c.b.a.g;
import com.mbridge.msdk.newreward.function.c.b.a.h;
import com.mbridge.msdk.newreward.function.c.b.a.j;
import com.mbridge.msdk.newreward.function.c.b.a.k;
import com.mbridge.msdk.newreward.function.c.b.a.l;
import com.mbridge.msdk.newreward.function.c.e;
import java.util.HashMap;
import java.util.Map;

/* compiled from: ReceiverFactory.java */
/* loaded from: classes4.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private static volatile c f3337a;
    private Map<e, Object> b;

    private c() {
    }

    public static c a() {
        if (f3337a == null) {
            synchronized (c.class) {
                if (f3337a == null) {
                    f3337a = new c();
                }
            }
        }
        return f3337a;
    }

    public final <T extends a> T a(e eVar) {
        int i = AnonymousClass1.f3338a[eVar.ordinal()];
        if (i == 1) {
            return new h();
        }
        if (i == 2) {
            return new j();
        }
        if (i == 3) {
            return new com.mbridge.msdk.newreward.function.c.b.a.d();
        }
        if (i == 4) {
            return new com.mbridge.msdk.newreward.function.c.b.a.e();
        }
        if (i != 5) {
            return null;
        }
        return new k();
    }

    public final <T extends d> T b(e eVar) {
        switch (eVar) {
            case CHECK_IS_REQUEST_CONTROL:
                return new g();
            case UPDATE_CAM_TOKEN_RULE:
                return new l();
            case START_LOAD_CHECK:
                return new com.mbridge.msdk.newreward.function.c.b.a.c();
            case CANDIDATE_LOAD_ACTION:
                if (this.b == null) {
                    this.b = new HashMap();
                }
                T t = this.b.containsKey(e.CANDIDATE_LOAD_ACTION) ? (T) this.b.get(e.CANDIDATE_LOAD_ACTION) : null;
                if (t != null) {
                    return t;
                }
                com.mbridge.msdk.newreward.function.c.b.a.a aVar = new com.mbridge.msdk.newreward.function.c.b.a.a();
                this.b.put(e.CANDIDATE_LOAD_ACTION, aVar);
                return aVar;
            default:
                return null;
        }
    }
}
