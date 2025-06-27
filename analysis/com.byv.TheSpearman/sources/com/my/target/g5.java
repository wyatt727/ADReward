package com.my.target;

import android.content.Context;
import com.my.target.common.MyTargetPrivacy;
import com.my.target.mediation.AdNetworkConfig;
import com.my.target.mediation.MediationAdConfig;
import com.my.target.mediation.MediationAdapter;
import com.my.target.o5;
import java.lang.ref.WeakReference;
import java.util.Map;

/* loaded from: classes4.dex */
public abstract class g5<T extends MediationAdapter> {

    /* renamed from: a, reason: collision with root package name */
    public final j f3982a;
    public final o5.a b;
    public final e5 c;
    public T d;
    public WeakReference<Context> e;
    public q8 f;
    public g5<T>.b g;
    public String h;
    public o5 i;
    public float j;

    public static class a implements MediationAdConfig {

        /* renamed from: a, reason: collision with root package name */
        public final String f3983a;
        public final String b;
        public final int c;
        public final int d;
        public final Map<String, String> e;
        public final MyTargetPrivacy f;
        public final AdNetworkConfig g;

        public a(String str, String str2, Map<String, String> map, int i, int i2, MyTargetPrivacy myTargetPrivacy, AdNetworkConfig adNetworkConfig) {
            this.f3983a = str;
            this.b = str2;
            this.e = map;
            this.d = i;
            this.c = i2;
            this.f = myTargetPrivacy;
            this.g = adNetworkConfig;
        }

        public static a a(String str, String str2, Map<String, String> map, int i, int i2, MyTargetPrivacy myTargetPrivacy, AdNetworkConfig adNetworkConfig) {
            return new a(str, str2, map, i, i2, myTargetPrivacy, adNetworkConfig);
        }

        @Override // com.my.target.mediation.MediationAdConfig
        public AdNetworkConfig getAdNetworkConfig() {
            return this.g;
        }

        @Override // com.my.target.mediation.MediationAdConfig
        public int getAge() {
            return this.d;
        }

        @Override // com.my.target.mediation.MediationAdConfig
        public int getGender() {
            return this.c;
        }

        @Override // com.my.target.mediation.MediationAdConfig
        public String getPayload() {
            return this.b;
        }

        @Override // com.my.target.mediation.MediationAdConfig
        public String getPlacementId() {
            return this.f3983a;
        }

        @Override // com.my.target.mediation.MediationAdConfig
        public MyTargetPrivacy getPrivacy() {
            return this.f;
        }

        @Override // com.my.target.mediation.MediationAdConfig
        public Map<String, String> getServerParams() {
            return this.e;
        }

        @Override // com.my.target.mediation.MediationAdConfig
        public boolean isUserAgeRestricted() {
            return this.f.userAgeRestricted;
        }

        @Override // com.my.target.mediation.MediationAdConfig
        public boolean isUserConsent() {
            Boolean bool = this.f.userConsent;
            if (bool != null) {
                return bool.booleanValue();
            }
            return true;
        }

        @Override // com.my.target.mediation.MediationAdConfig
        public boolean isUserConsentSpecified() {
            return this.f.userConsent != null;
        }
    }

    public final class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final f5 f3984a;

        public b(f5 f5Var) {
            this.f3984a = f5Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            ba.a("MediationEngine: Timeout for " + this.f3984a.b() + " ad network");
            Context contextH = g5.this.h();
            if (contextH != null) {
                g5.this.a(this.f3984a, "networkTimeout", contextH);
            }
            g5.this.a(this.f3984a, false);
        }
    }

    public g5(e5 e5Var, j jVar, o5.a aVar) {
        this.c = e5Var;
        this.f3982a = jVar;
        this.b = aVar;
    }

    public final T a(f5 f5Var) {
        return "myTarget".equals(f5Var.b()) ? (T) g() : (T) a(f5Var.a());
    }

    public final T a(String str) {
        try {
            return (T) Class.forName(str).getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Throwable th) {
            ba.b("MediationEngine: Error – " + th.toString());
            return null;
        }
    }

    public void a(f5 f5Var, String str, Context context) {
        w9.a(f5Var.h().b(str), context);
    }

    public void a(f5 f5Var, boolean z) {
        g5<T>.b bVar = this.g;
        if (bVar == null || bVar.f3984a != f5Var) {
            return;
        }
        Context contextH = h();
        o5 o5Var = this.i;
        if (o5Var != null && contextH != null) {
            o5Var.b();
            this.i.b(contextH);
        }
        q8 q8Var = this.f;
        if (q8Var != null) {
            q8Var.b(this.g);
            this.f.close();
            this.f = null;
        }
        this.g = null;
        if (!z) {
            i();
            return;
        }
        this.h = f5Var.b();
        this.j = f5Var.f();
        if (contextH != null) {
            a(f5Var, "networkFilled", contextH);
        }
    }

    public abstract void a(T t, f5 f5Var, Context context);

    public abstract boolean a(MediationAdapter mediationAdapter);

    public String b() {
        return this.h;
    }

    public void b(Context context) {
        this.e = new WeakReference<>(context);
        i();
    }

    public float c() {
        return this.j;
    }

    public abstract void f();

    public abstract T g();

    public Context h() {
        WeakReference<Context> weakReference = this.e;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public final void i() {
        T t = this.d;
        if (t != null) {
            try {
                t.destroy();
            } catch (Throwable th) {
                ba.b("MediationEngine: Error - " + th.toString());
            }
            this.d = null;
        }
        Context contextH = h();
        if (contextH == null) {
            ba.b("MediationEngine: Can't configure next ad network, context is null");
            return;
        }
        f5 f5VarD = this.c.d();
        if (f5VarD == null) {
            ba.a("MediationEngine: No ad networks available");
            f();
            return;
        }
        ba.a("MediationEngine: Prepare adapter for " + f5VarD.b() + " ad network");
        T t2 = (T) a(f5VarD);
        this.d = t2;
        if (t2 == null || !a(t2)) {
            ba.b("MediationEngine: Can't create adapter, class " + f5VarD.a() + " not found or invalid");
            a(f5VarD, "networkAdapterInvalid", contextH);
            i();
            return;
        }
        ba.a("MediationEngine: Adapter created");
        this.i = this.b.a(f5VarD.b(), f5VarD.f());
        q8 q8Var = this.f;
        if (q8Var != null) {
            q8Var.close();
        }
        int i = f5VarD.i();
        if (i > 0) {
            this.g = new b(f5VarD);
            q8 q8VarA = q8.a(i);
            this.f = q8VarA;
            q8VarA.a(this.g);
        } else {
            this.g = null;
        }
        a(f5VarD, "networkRequested", contextH);
        a((g5<T>) this.d, f5VarD, contextH);
    }
}
