package com.my.tracker.obfuscated;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.my.tracker.obfuscated.r;

/* loaded from: classes4.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    boolean f4251a = false;
    String b;

    class a implements c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ r0 f4252a;

        a(r0 r0Var) {
            this.f4252a = r0Var;
        }

        @Override // com.my.tracker.obfuscated.r.c
        public void a() {
            z0.a("FirebaseAppInstanceIdProvider: retrieving firebase app instance id finished unsuccessfully");
        }

        @Override // com.my.tracker.obfuscated.r.c
        public void a(String str) {
            r.this.b = str;
            this.f4252a.j(str);
            z0.a("FirebaseAppInstanceIdProvider: retrieved firebase app instance id %" + r.this.b);
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public static final boolean f4253a;

        static {
            boolean zEquals;
            try {
                zEquals = FirebaseAnalytics.class.equals(Class.forName("com.google.firebase.analytics.FirebaseAnalytics"));
            } catch (Throwable th) {
                z0.a("FirebaseHelper: error occurred while working with FirebaseAnalytics", th);
                zEquals = false;
            }
            f4253a = zEquals;
        }

        static void a(Context context, final c cVar) {
            try {
                z0.a("FirebaseHelper: retrieving firebase app instance id");
                FirebaseAnalytics.getInstance(context).getAppInstanceId().addOnCompleteListener(g.b, new OnCompleteListener() { // from class: com.my.tracker.obfuscated.r$b$$ExternalSyntheticLambda0
                    @Override // com.google.android.gms.tasks.OnCompleteListener
                    public final void onComplete(Task task) {
                        r.b.a(cVar, task);
                    }
                });
            } catch (Throwable th) {
                z0.a("FirebaseHelper: retrieving firebase app instance id error", th);
                cVar.a();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void a(c cVar, Task task) {
            if (task.isComplete() && task.isSuccessful()) {
                cVar.a((String) task.getResult());
            } else {
                cVar.a();
            }
        }
    }

    public interface c {
        void a();

        void a(String str);
    }

    r() {
    }

    public void a(Context context) {
        if (this.f4251a) {
            return;
        }
        r0 r0VarA = r0.a(context);
        String strH = r0VarA.h();
        this.b = strH;
        if (!TextUtils.isEmpty(strH)) {
            z0.a("FirebaseAppInstanceIdProvider: retrieved cached firebase app instance id " + this.b);
        }
        if (!b.f4253a) {
            z0.a("FirebaseAppInstanceIdProvider: firebase analytics is not available");
        } else {
            b.a(context, new a(r0VarA));
            this.f4251a = true;
        }
    }

    public void a(s0 s0Var, Context context) {
        if (TextUtils.isEmpty(this.b)) {
            return;
        }
        s0Var.i(this.b);
    }

    public void b(Context context) {
    }
}
