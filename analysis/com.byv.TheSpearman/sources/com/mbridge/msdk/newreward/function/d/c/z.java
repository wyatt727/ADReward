package com.mbridge.msdk.newreward.function.d.c;

/* compiled from: MbridgeH5ResourceDownloaderEmpty.java */
/* loaded from: classes4.dex */
public final class z extends q {

    /* renamed from: a, reason: collision with root package name */
    private final com.mbridge.msdk.newreward.function.d.a.b f3356a;
    private final com.mbridge.msdk.newreward.function.d.a.a b;
    private final c c;

    public z(com.mbridge.msdk.newreward.function.d.a.b bVar, com.mbridge.msdk.newreward.function.d.a.a aVar, c cVar) {
        this.f3356a = bVar;
        this.b = aVar;
        this.c = cVar;
        cVar.b(true);
        cVar.a(false);
    }

    @Override // com.mbridge.msdk.newreward.function.d.c.p
    public final void a(int i, x xVar) {
        if (xVar != null) {
            xVar.a(this.f3356a, this.b, this);
            xVar.b(this.f3356a, this.b, this);
        }
    }
}
