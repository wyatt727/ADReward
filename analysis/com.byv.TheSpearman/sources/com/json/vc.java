package com.json;

/* loaded from: classes4.dex */
public class vc extends f<a> {

    public interface a {
        void a();
    }

    public vc(long j) {
        super(j);
    }

    public void a(a aVar) {
        a((vc) aVar);
    }

    @Override // com.json.f
    protected void b() {
        T t = this.c;
        if (t != 0) {
            ((a) t).a();
        }
    }

    public void e() {
        c();
    }
}
