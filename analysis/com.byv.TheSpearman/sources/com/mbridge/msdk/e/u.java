package com.mbridge.msdk.e;

import androidx.browser.trusted.sharing.ShareTarget;
import com.mbridge.msdk.e.a.p;
import com.mbridge.msdk.e.a.r;
import java.util.HashMap;
import java.util.Map;

/* compiled from: ReportRequest.java */
/* loaded from: classes4.dex */
public final class u<T> extends com.mbridge.msdk.e.a.p<T> {

    /* renamed from: a, reason: collision with root package name */
    private Map<String, String> f2741a;
    private p.b b;
    private r.b<T> c;
    private v d;
    private com.mbridge.msdk.e.a.f e;

    public u(String str, int i) {
        super(i, str);
    }

    public u(String str, int i, int i2) {
        super(i, str, i2);
    }

    public final void a(v vVar) {
        this.d = vVar;
    }

    public final void a(p.b bVar) {
        this.b = bVar;
    }

    public final void a(Map<String, String> map) {
        this.f2741a = map;
    }

    public final void a(r.b<T> bVar) {
        this.c = bVar;
    }

    @Override // com.mbridge.msdk.e.a.p
    public final com.mbridge.msdk.e.a.v b() {
        if (y.a(this.e)) {
            this.e = new com.mbridge.msdk.e.a.f(30000, 5, 1.0f);
        }
        return this.e;
    }

    @Override // com.mbridge.msdk.e.a.p
    protected final com.mbridge.msdk.e.a.r<T> a(com.mbridge.msdk.e.a.m mVar) {
        return this.d.a(mVar);
    }

    @Override // com.mbridge.msdk.e.a.p
    protected final Map<String, String> a() {
        return this.f2741a;
    }

    @Override // com.mbridge.msdk.e.a.p
    public final Map<String, String> d() {
        HashMap map = new HashMap();
        map.put("Content-Type", ShareTarget.ENCODING_TYPE_URL_ENCODED);
        return map;
    }

    @Override // com.mbridge.msdk.e.a.p
    public final p.b e() {
        return this.b;
    }

    @Override // com.mbridge.msdk.e.a.p
    protected final void a(T t) {
        r.b<T> bVar = this.c;
        this.c = bVar;
        if (bVar != null) {
            bVar.a(t);
        }
    }
}
