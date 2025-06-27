package com.my.tracker.obfuscated;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdClient;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.OnSuccessListener;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes4.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    final AtomicReference<String> f4220a = new AtomicReference<>();
    final AtomicReference<Integer> b = new AtomicReference<>(-1);
    boolean c = false;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final boolean f4221a;

        static {
            boolean z = false;
            try {
                if (AppSet.class.equals(Class.forName("com.google.android.gms.appset.AppSet")) && AppSetIdClient.class.equals(Class.forName("com.google.android.gms.appset.AppSetIdClient"))) {
                    if (AppSetIdInfo.class.equals(Class.forName("com.google.android.gms.appset.AppSetIdInfo"))) {
                        z = true;
                    }
                }
            } catch (Throwable th) {
                z0.a("AppSetIdProvider: error occurred while working with App Set library classes", th);
            }
            f4221a = z;
        }
    }

    e() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(r0 r0Var, AppSetIdInfo appSetIdInfo) {
        int scope = appSetIdInfo.getScope();
        if (scope != this.b.getAndSet(Integer.valueOf(scope)).intValue()) {
            r0Var.a(scope);
        }
        String id = appSetIdInfo.getId();
        if (!id.equals(this.f4220a.getAndSet(id))) {
            r0Var.f(id);
            z0.a("AppSetIdProvider: new id value has been received: " + id);
        }
        synchronized (this.f4220a) {
            this.f4220a.notify();
        }
    }

    void a() {
        try {
            String str = this.f4220a.get();
            if (TextUtils.isEmpty(str)) {
                synchronized (this.f4220a) {
                    this.f4220a.wait(300L);
                }
                z0.a("AppSetIdProvider: timeout for collecting id has exceeded");
                return;
            }
            z0.a("AppSetIdProvider: app set id has been collected, value: " + str);
        } catch (Throwable th) {
            z0.a("AppSetIdProvider: attempt to block thread retrieving app set id finished unsuccessfully", th);
        }
    }

    public void a(Context context) {
        if (this.c) {
            return;
        }
        b(context);
        this.c = true;
    }

    public void a(s0 s0Var, Context context) {
        StringBuilder sb;
        String str;
        if (TextUtils.isEmpty(this.f4220a.get()) || this.b.get().intValue() == -1) {
            sb = new StringBuilder();
            sb.append("AppSetIdProvider: App Set ID ");
            sb.append(this.f4220a.get());
            sb.append(" and Scope ");
            sb.append(this.b.get());
            str = " were not sent due to its values";
        } else {
            s0Var.a(this.f4220a.get(), this.b.get().intValue());
            sb = new StringBuilder();
            sb.append("AppSetIdProvider: App Set ID ");
            sb.append(this.f4220a.get());
            sb.append(" and Scope ");
            sb.append(this.b.get());
            str = " set to proto builder successfully";
        }
        sb.append(str);
        z0.a(sb.toString());
    }

    void b(Context context) {
        final r0 r0VarA = r0.a(context);
        this.f4220a.set(r0VarA.d());
        if (!a.f4221a) {
            z0.a("AppSetIdProvider: app set library is not available");
            return;
        }
        try {
            AppSet.getClient(context).getAppSetIdInfo().addOnSuccessListener(g.c, new OnSuccessListener() { // from class: com.my.tracker.obfuscated.e$$ExternalSyntheticLambda0
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final void onSuccess(Object obj) {
                    this.f$0.a(r0VarA, (AppSetIdInfo) obj);
                }
            });
        } catch (Throwable th) {
            z0.a("AppSetIdProvider: error occurred while trying to access app set id info", th);
        }
        a();
    }

    public void c(Context context) {
    }
}
