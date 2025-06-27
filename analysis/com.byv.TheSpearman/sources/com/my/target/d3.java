package com.my.target;

import com.my.target.l;
import com.my.target.o5;

/* loaded from: classes4.dex */
public class d3 extends l<f3> {

    public static class a implements l.a<f3> {

        /* renamed from: a, reason: collision with root package name */
        public final int f3945a;

        public a(int i) {
            this.f3945a = i;
        }

        @Override // com.my.target.l.a
        public boolean a() {
            return false;
        }

        @Override // com.my.target.l.a
        public t b() {
            return g3.a(this.f3945a);
        }

        @Override // com.my.target.l.a
        public p<f3> c() {
            return null;
        }

        @Override // com.my.target.l.a
        public o<f3> d() {
            return e3.a(this.f3945a);
        }
    }

    public interface b extends l.b<f3> {
    }

    public d3(j jVar, int i, o5.a aVar) {
        super(new a(i), jVar, aVar);
    }

    public static l<f3> a(j jVar, o5.a aVar, int i) {
        return new d3(jVar, i, aVar);
    }
}
