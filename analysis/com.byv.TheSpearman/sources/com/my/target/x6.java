package com.my.target;

import android.content.Context;
import com.my.target.l;
import com.my.target.o5;
import java.util.Map;

/* loaded from: classes4.dex */
public final class x6 extends l<a7> {

    public static class a implements l.a<a7> {
        @Override // com.my.target.l.a
        public boolean a() {
            return false;
        }

        @Override // com.my.target.l.a
        public t b() {
            return t.a();
        }

        @Override // com.my.target.l.a
        public p<a7> c() {
            return z6.a();
        }

        @Override // com.my.target.l.a
        public o<a7> d() {
            return y6.a();
        }
    }

    public interface b extends l.b<a7> {
    }

    public x6(j jVar, o5.a aVar) {
        super(new a(), jVar, aVar);
    }

    public static l<a7> a(j jVar, o5.a aVar) {
        return new x6(jVar, aVar);
    }

    @Override // com.my.target.l
    public u<b2<String>, String> a(s sVar, x1 x1Var, Map<String, String> map, Context context) {
        if (this.b.getCachePeriod() > 0) {
            ba.a("NativeAppwallAdFactory: Check cached data");
            l1 l1VarA = l1.a(context);
            String strA = l1VarA != null ? l1VarA.a(this.b.getSlotId(), this.b.getCachePeriod()) : null;
            if (strA != null) {
                ba.a("NativeAppwallAdFactory: Cached data loaded successfully");
                sVar.a(true);
                return new u<>(null, strA);
            }
            ba.a("NativeAppwallAdFactory: No cached data");
        }
        return super.a(sVar, x1Var, map, context);
    }
}
