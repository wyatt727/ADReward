package com.apm.insight.runtime.a;

import android.content.Context;
import com.apm.insight.CrashType;
import com.apm.insight.entity.Header;
import com.apm.insight.l.s;
import org.json.JSONException;

/* loaded from: classes.dex */
class k extends c {
    k(Context context, b bVar, d dVar) {
        super(CrashType.LAUNCH, context, bVar, dVar);
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
            try {
                aVarA.i().f().put("launch_did", com.apm.insight.i.a.a(this.b));
            } catch (Throwable unused) {
            }
        } else if (i == 5) {
            Header.b(aVarA.i());
        }
        return aVarA;
    }
}
