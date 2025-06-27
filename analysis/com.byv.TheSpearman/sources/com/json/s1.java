package com.json;

/* loaded from: classes4.dex */
public class s1 extends f<a> {

    public interface a {
        void a();
    }

    public s1(long j) {
        super(j);
    }

    public void a(a aVar) {
        a((s1) aVar);
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
