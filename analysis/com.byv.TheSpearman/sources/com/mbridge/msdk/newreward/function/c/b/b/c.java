package com.mbridge.msdk.newreward.function.c.b.b;

/* compiled from: LoadControllerRetryStrategy.java */
/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private com.mbridge.msdk.newreward.function.c.a.a f3330a;
    private com.mbridge.msdk.newreward.function.c.b.b.a b;
    private b c;
    private d d;
    private boolean e = false;
    private boolean f = false;

    public c(com.mbridge.msdk.newreward.function.c.a.a aVar) {
        this.f3330a = aVar;
    }

    public final void a(e eVar, final com.mbridge.msdk.newreward.a.b.b bVar) {
        int iC = eVar.c();
        if (iC == 1) {
            if (this.b == null) {
                a();
            }
            this.b.a(eVar, new a(this, bVar));
        } else if (iC == 2) {
            if (this.d == null) {
                this.d = new d();
            }
            this.d.a(eVar, new com.mbridge.msdk.newreward.a.b.b() { // from class: com.mbridge.msdk.newreward.function.c.b.b.c.1
                @Override // com.mbridge.msdk.newreward.a.b.b
                public final void a(Object obj) {
                    com.mbridge.msdk.newreward.a.b.b bVar2 = bVar;
                    if (bVar2 != null) {
                        bVar2.a(obj);
                    }
                }

                @Override // com.mbridge.msdk.newreward.a.b.b
                public final void a(com.mbridge.msdk.foundation.c.b bVar2) {
                    com.mbridge.msdk.newreward.a.b.b bVar3 = bVar;
                    if (bVar3 != null) {
                        bVar3.a(bVar2);
                    }
                }
            });
        } else {
            if (iC != 3) {
                return;
            }
            if (this.c == null) {
                this.c = new b(this.f3330a);
            }
            this.c.a(eVar, new a(this, bVar));
        }
    }

    private void a() {
        this.b = new com.mbridge.msdk.newreward.function.c.b.b.a(this.f3330a);
    }

    public final boolean a(e eVar) {
        if (eVar.c() == 1) {
            if (this.b == null) {
                a();
            }
            com.mbridge.msdk.newreward.function.c.b.b.a aVar = this.b;
            if (eVar == null) {
                return false;
            }
            return aVar.a(eVar.a(), eVar, eVar.b());
        }
        if (eVar.c() == 2) {
            if (this.d == null) {
                this.d = new d();
            }
            return this.d.a(eVar);
        }
        if (eVar.c() != 3) {
            return false;
        }
        if (this.c == null) {
            this.c = new b(this.f3330a);
        }
        return true;
    }

    /* compiled from: LoadControllerRetryStrategy.java */
    private class a implements com.mbridge.msdk.newreward.a.b.b {
        private final c b;
        private final com.mbridge.msdk.newreward.a.b.b c;

        public a(c cVar, com.mbridge.msdk.newreward.a.b.b bVar) {
            this.b = cVar;
            this.c = bVar;
        }

        @Override // com.mbridge.msdk.newreward.a.b.b
        public final void a(Object obj) {
            if (this.b.e) {
                return;
            }
            this.b.e = true;
            this.c.a(obj);
        }

        @Override // com.mbridge.msdk.newreward.a.b.b
        public final void a(com.mbridge.msdk.foundation.c.b bVar) {
            if (bVar.a() == 1) {
                if (!c.this.b.a() || !c.this.c.a() || this.b.f) {
                    return;
                } else {
                    this.b.f = true;
                }
            }
            this.c.a(bVar);
        }
    }
}
