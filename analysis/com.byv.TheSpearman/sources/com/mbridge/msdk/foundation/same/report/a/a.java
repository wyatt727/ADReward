package com.mbridge.msdk.foundation.same.report.a;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.db.l;
import com.mbridge.msdk.foundation.entity.h;
import com.mbridge.msdk.foundation.tools.z;

/* compiled from: BaseCampaignRequestTimeUtil.java */
/* loaded from: classes4.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    protected Context f2915a;
    protected h b;
    private com.mbridge.msdk.foundation.db.h c;

    public a(h hVar) {
        Context context;
        this.c = null;
        this.b = hVar;
        Context contextC = c.m().c();
        this.f2915a = contextC;
        this.c = com.mbridge.msdk.foundation.db.h.a(contextC);
        if (this.b == null || (context = this.f2915a) == null) {
            return;
        }
        int iL = z.l(context);
        this.b.d(iL);
        this.b.c(z.a(this.f2915a, iL));
    }

    public final void a() {
        if (this.b != null) {
            l.a(this.c).a(this.b);
        }
    }

    public final void a(int i) {
        h hVar = this.b;
        if (hVar != null) {
            hVar.b(i);
        }
    }

    public final void b(int i) {
        h hVar = this.b;
        if (hVar != null) {
            hVar.a(i);
        }
    }

    public final void c(int i) {
        h hVar = this.b;
        if (hVar != null) {
            hVar.c(i);
        }
    }

    public final void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.b.a(str);
    }

    public final void b(String str) {
        h hVar = this.b;
        if (hVar != null) {
            hVar.b(str);
        }
    }
}
