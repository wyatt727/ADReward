package com.apm.insight.runtime.a;

import android.content.Context;
import com.apm.insight.CrashType;
import com.apm.insight.entity.Header;
import com.apm.insight.l.s;
import org.json.JSONException;

/* loaded from: classes.dex */
class l extends c {
    l(Context context, b bVar, d dVar) {
        super(CrashType.NATIVE, context, bVar, dVar);
    }

    @Override // com.apm.insight.runtime.a.c
    public com.apm.insight.entity.a a(int i, com.apm.insight.entity.a aVar) throws JSONException {
        com.apm.insight.entity.a aVarA = super.a(i, aVar);
        if (i == 0) {
            Header headerA = Header.a(this.b);
            headerA.c();
            aVarA.a(headerA);
            s.a(aVarA, headerA, this.f124a);
        } else if (i == 1) {
            Header headerI = aVarA.i();
            headerI.d();
            headerI.e();
        } else if (i == 2) {
            Header.a(aVarA.i());
        }
        return aVarA;
    }

    @Override // com.apm.insight.runtime.a.c
    protected boolean a() {
        return false;
    }

    @Override // com.apm.insight.runtime.a.c
    public int b() {
        return com.apm.insight.nativecrash.b.a();
    }

    @Override // com.apm.insight.runtime.a.c
    protected boolean d() {
        return false;
    }

    @Override // com.apm.insight.runtime.a.c
    protected void h(com.apm.insight.entity.a aVar) {
    }
}
