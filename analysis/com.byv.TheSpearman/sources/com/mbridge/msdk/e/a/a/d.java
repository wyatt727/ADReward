package com.mbridge.msdk.e.a.a;

import com.mbridge.msdk.e.a.p;
import org.objectweb.asm.signature.SignatureVisitor;

/* compiled from: DefaultCacheKeyGenerator.java */
/* loaded from: classes4.dex */
public final class d implements com.mbridge.msdk.e.a.d {
    @Override // com.mbridge.msdk.e.a.d
    public final String a(p<?> pVar) {
        String strI = pVar.i();
        int iG = pVar.g();
        if (iG == 0) {
            return strI;
        }
        return Integer.toString(iG) + SignatureVisitor.SUPER + strI;
    }
}
