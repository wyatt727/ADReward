package com.applovin.impl;

import android.content.Context;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sm;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class xl implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    protected final com.applovin.impl.sdk.k f1179a;
    protected final String b;
    protected final com.applovin.impl.sdk.t c;
    private final Context d;
    private String f;
    private boolean g;

    public com.applovin.impl.sdk.k b() {
        return this.f1179a;
    }

    public String c() {
        return this.b;
    }

    public Context a() {
        return this.d;
    }

    public boolean d() {
        return this.g;
    }

    public xl(String str, com.applovin.impl.sdk.k kVar) {
        this(str, kVar, false, null);
    }

    public xl(String str, com.applovin.impl.sdk.k kVar, String str2) {
        this(str, kVar, false, str2);
    }

    public ScheduledFuture b(final Thread thread, final long j) {
        if (j <= 0) {
            return null;
        }
        return this.f1179a.l0().b(new kn(this.f1179a, "timeout:" + this.b, new Runnable() { // from class: com.applovin.impl.xl$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.a(thread, j);
            }
        }), sm.b.TIMEOUT, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Thread thread, long j) {
        HashMap<String, String> mapHashMap = CollectionUtils.hashMap("name", thread.getState().name());
        if (StringUtils.isValidString(this.f)) {
            mapHashMap.put("details", this.f);
        }
        this.f1179a.B().a(o.b.TASK_LATENCY_ALERT, this.b, (Map) mapHashMap);
        if (com.applovin.impl.sdk.t.a()) {
            this.c.k(this.b, "Task has been executing for over " + TimeUnit.MILLISECONDS.toSeconds(j) + " seconds");
        }
    }

    public xl(String str, com.applovin.impl.sdk.k kVar, boolean z) {
        this(str, kVar, z, null);
    }

    public void a(String str) {
        this.f = str;
    }

    public void a(boolean z) {
        this.g = z;
    }

    public xl(String str, com.applovin.impl.sdk.k kVar, boolean z, String str2) {
        this.b = str;
        this.f1179a = kVar;
        this.c = kVar.L();
        this.d = com.applovin.impl.sdk.k.k();
        this.g = z;
        this.f = str2;
    }

    public void a(Throwable th) {
        Map map = CollectionUtils.map(FirebaseAnalytics.Param.SOURCE, this.b);
        map.put("top_main_method", th.toString());
        map.put("details", StringUtils.emptyIfNull(this.f));
        this.f1179a.B().a(o.b.TASK_EXCEPTION, map);
    }
}
