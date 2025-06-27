package com.mbridge.msdk.foundation.same.net.f;

import com.mbridge.msdk.foundation.same.net.g;
import com.mbridge.msdk.foundation.same.net.i;
import com.mbridge.msdk.foundation.same.net.l;

/* compiled from: BasicNetwork.java */
/* loaded from: classes4.dex */
public class a implements g {

    /* renamed from: a, reason: collision with root package name */
    private static final String f2884a = "a";
    private final com.mbridge.msdk.foundation.same.net.c b;
    private final com.mbridge.msdk.foundation.same.net.stack.b c;

    public a(com.mbridge.msdk.foundation.same.net.stack.b bVar, com.mbridge.msdk.foundation.same.net.c cVar) {
        this.c = bVar;
        this.b = cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01c2  */
    @Override // com.mbridge.msdk.foundation.same.net.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.mbridge.msdk.foundation.same.net.f.c a(com.mbridge.msdk.foundation.same.net.i<?> r17) throws com.mbridge.msdk.foundation.same.net.b.a, java.io.IOException {
        /*
            Method dump skipped, instructions count: 722
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.same.net.f.a.a(com.mbridge.msdk.foundation.same.net.i):com.mbridge.msdk.foundation.same.net.f.c");
    }

    private void a(i<?> iVar, com.mbridge.msdk.foundation.same.net.b.a aVar, long j) throws com.mbridge.msdk.foundation.same.net.b.a {
        if (iVar == null || aVar == null) {
            throw new com.mbridge.msdk.foundation.same.net.b.a(4, null);
        }
        boolean z = false;
        try {
            l lVarN = iVar.n();
            if (lVarN != null) {
                long jF = lVarN.f();
                if (lVarN.a(aVar) && j < jF) {
                    z = true;
                }
            }
        } catch (Exception unused) {
        }
        if (z) {
            this.b.e(iVar);
            return;
        }
        throw aVar;
    }
}
