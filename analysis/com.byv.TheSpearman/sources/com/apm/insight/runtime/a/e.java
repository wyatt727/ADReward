package com.apm.insight.runtime.a;

import android.content.Context;
import com.apm.insight.CrashType;
import com.apm.insight.entity.Header;
import com.apm.insight.l.s;
import org.json.JSONException;

/* loaded from: classes.dex */
public class e extends c {
    e(Context context, b bVar, d dVar) {
        super(CrashType.BLOCK, context, bVar, dVar);
    }

    @Override // com.apm.insight.runtime.a.c
    public com.apm.insight.entity.a a(com.apm.insight.entity.a aVar) throws JSONException {
        com.apm.insight.entity.a aVarA = super.a(aVar);
        g(aVarA);
        s.a(aVarA, (Header) null, this.f124a);
        return aVarA;
    }

    @Override // com.apm.insight.runtime.a.c
    protected boolean a() {
        return false;
    }

    @Override // com.apm.insight.runtime.a.c
    protected boolean c() {
        return true;
    }

    @Override // com.apm.insight.runtime.a.c
    protected boolean d() {
        return false;
    }
}
