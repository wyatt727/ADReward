package com.mbridge.msdk.e;

import android.util.Log;

/* compiled from: ProcessorWrapper.java */
/* loaded from: classes4.dex */
final class p implements l {

    /* renamed from: a, reason: collision with root package name */
    private final g f2734a;

    public p(g gVar) {
        this.f2734a = gVar;
    }

    @Override // com.mbridge.msdk.e.l
    public final void a(e eVar) {
        if (y.a(this.f2734a)) {
            return;
        }
        this.f2734a.a(eVar);
    }

    @Override // com.mbridge.msdk.e.l
    public final void b(e eVar) {
        if (y.a(this.f2734a)) {
            return;
        }
        try {
            h hVarI = eVar.i();
            if (y.b(hVarI)) {
                eVar.a(hVarI.a(eVar));
            }
            this.f2734a.b(eVar);
        } catch (Exception e) {
            if (a.f2688a) {
                Log.e("TrackManager", "process event error", e);
            }
        }
    }

    @Override // com.mbridge.msdk.e.l
    public final long[] a() {
        return y.a(this.f2734a) ? new long[]{0, 0} : this.f2734a.a();
    }
}
