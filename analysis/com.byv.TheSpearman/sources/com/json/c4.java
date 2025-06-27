package com.json;

import android.os.Handler;
import com.json.sdk.utils.IronSourceStorageUtils;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class c4 implements c6 {
    private static final int e = 5;
    private static c4 f;

    /* renamed from: a, reason: collision with root package name */
    private b4 f1717a;
    private final JSONObject b;
    private Thread c;
    private final String d;

    private c4(String str, o6 o6Var, JSONObject jSONObject) {
        this.d = str;
        this.f1717a = new b4(o6Var.a());
        this.b = jSONObject;
        IronSourceStorageUtils.deleteFolder(b());
        IronSourceStorageUtils.makeDir(b());
    }

    public static synchronized c4 a(String str, o6 o6Var, JSONObject jSONObject) {
        if (f == null) {
            f = new c4(str, o6Var, jSONObject);
        }
        return f;
    }

    private Thread a(z3 z3Var, Handler handler) {
        return new Thread(new uc(z3Var, handler));
    }

    private String b() {
        return IronSourceStorageUtils.buildAbsolutePathToDirInCache(this.d, u2.D);
    }

    private Thread b(o7 o7Var, String str, int i, int i2, Handler handler) {
        if (i <= 0) {
            i = this.b.optInt("connectionTimeout", 5);
        }
        if (i2 <= 0) {
            i2 = this.b.optInt("readTimeout", 5);
        }
        TimeUnit timeUnit = TimeUnit.SECONDS;
        return a(new z3(o7Var, str, (int) timeUnit.toMillis(i), (int) timeUnit.toMillis(i2), b()), handler);
    }

    public String a() {
        return this.d;
    }

    @Override // com.json.c6
    public void a(db dbVar) {
        this.f1717a.a(dbVar);
    }

    @Override // com.json.c6
    public void a(o7 o7Var, String str) {
        int iOptInt = this.b.optInt("connectionTimeout", 5);
        int iOptInt2 = this.b.optInt("readTimeout", 5);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        Thread threadA = a(new z3(o7Var, str, (int) timeUnit.toMillis(iOptInt), (int) timeUnit.toMillis(iOptInt2), b()), this.f1717a);
        this.c = threadA;
        threadA.start();
    }

    @Override // com.json.c6
    public void a(o7 o7Var, String str, int i, int i2) {
        b(o7Var, str, i, i2, this.f1717a).start();
    }

    @Override // com.json.c6
    public void a(o7 o7Var, String str, int i, int i2, Handler handler) {
        b(o7Var, str, i, i2, handler).start();
    }

    public boolean c() {
        Thread thread = this.c;
        return thread != null && thread.isAlive();
    }

    public synchronized void d() {
        f = null;
        b4 b4Var = this.f1717a;
        if (b4Var != null) {
            b4Var.a();
            this.f1717a = null;
        }
    }
}
