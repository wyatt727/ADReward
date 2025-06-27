package com.applovin.impl;

import android.os.Looper;
import com.applovin.impl.x6;
import com.applovin.impl.y6;
import com.applovin.impl.z6;

/* loaded from: classes.dex */
public interface z6 {

    /* renamed from: a, reason: collision with root package name */
    public static final z6 f1229a;
    public static final z6 b;

    /* renamed from: com.applovin.impl.z6$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static void $default$a(z6 _this) {
        }

        public static void $default$b(z6 _this) {
        }

        public static b $default$b(z6 _this, Looper looper, y6.a aVar, d9 d9Var) {
            return b.f1230a;
        }
    }

    public interface b {

        /* renamed from: a, reason: collision with root package name */
        public static final b f1230a = new b() { // from class: com.applovin.impl.z6$b$$ExternalSyntheticLambda0
            @Override // com.applovin.impl.z6.b
            public final void a() {
                z6.b.CC.b();
            }
        };

        /* renamed from: com.applovin.impl.z6$b$-CC, reason: invalid class name */
        public final /* synthetic */ class CC {
            static {
                b bVar = b.f1230a;
            }

            public static /* synthetic */ void b() {
            }
        }

        void a();
    }

    static {
        a aVar = new a();
        f1229a = aVar;
        b = aVar;
    }

    int a(d9 d9Var);

    x6 a(Looper looper, y6.a aVar, d9 d9Var);

    void a();

    b b(Looper looper, y6.a aVar, d9 d9Var);

    void b();

    class a implements z6 {
        a() {
        }

        @Override // com.applovin.impl.z6
        public /* synthetic */ void a() {
            CC.$default$a(this);
        }

        @Override // com.applovin.impl.z6
        public /* synthetic */ b b(Looper looper, y6.a aVar, d9 d9Var) {
            return CC.$default$b(this, looper, aVar, d9Var);
        }

        @Override // com.applovin.impl.z6
        public /* synthetic */ void b() {
            CC.$default$b(this);
        }

        @Override // com.applovin.impl.z6
        public x6 a(Looper looper, y6.a aVar, d9 d9Var) {
            if (d9Var.p == null) {
                return null;
            }
            return new s7(new x6.a(new tp(1), 6001));
        }

        @Override // com.applovin.impl.z6
        public int a(d9 d9Var) {
            return d9Var.p != null ? 1 : 0;
        }
    }
}
