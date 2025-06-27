package com.applovin.impl;

import android.os.Handler;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes.dex */
public final class t4 {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.t f1012a;
    private final Handler b;
    private final Set c = new HashSet();
    private final AtomicInteger d = new AtomicInteger();

    public interface b {
        void a();

        boolean b();
    }

    public void c() {
        if (com.applovin.impl.sdk.t.a()) {
            this.f1012a.a("CountdownManager", "Stopping countdowns...");
        }
        this.d.incrementAndGet();
        this.b.removeCallbacksAndMessages(null);
    }

    public t4(Handler handler, com.applovin.impl.sdk.k kVar) {
        if (handler == null) {
            throw new IllegalArgumentException("No handler specified.");
        }
        if (kVar != null) {
            this.b = handler;
            this.f1012a = kVar.L();
            return;
        }
        throw new IllegalArgumentException("No sdk specified.");
    }

    public void a(String str, long j, b bVar) {
        if (j > 0) {
            if (this.b != null) {
                if (com.applovin.impl.sdk.t.a()) {
                    this.f1012a.a("CountdownManager", "Adding countdown: " + str);
                }
                this.c.add(new c(str, j, bVar));
                return;
            }
            throw new IllegalArgumentException("No handler specified.");
        }
        throw new IllegalArgumentException("Invalid step specified.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(c cVar, int i) {
        b bVarA = cVar.a();
        if (bVarA.b()) {
            if (this.d.get() == i) {
                try {
                    bVarA.a();
                    a(cVar, i);
                    return;
                } catch (Throwable th) {
                    if (com.applovin.impl.sdk.t.a()) {
                        this.f1012a.a("CountdownManager", "Encountered error on countdown step for: " + cVar.c(), th);
                    }
                    a();
                    return;
                }
            }
            if (com.applovin.impl.sdk.t.a()) {
                this.f1012a.k("CountdownManager", "Killing duplicate countdown from previous generation: " + cVar.c());
                return;
            }
            return;
        }
        if (com.applovin.impl.sdk.t.a()) {
            this.f1012a.a("CountdownManager", "Ending countdown for " + cVar.c());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class c {

        /* renamed from: a, reason: collision with root package name */
        private final String f1013a;
        private final b b;
        private final long c;

        public String toString() {
            return "CountdownProxy{identifier='" + this.f1013a + "', countdownStepMillis=" + this.c + AbstractJsonLexerKt.END_OBJ;
        }

        private c(String str, long j, b bVar) {
            this.f1013a = str;
            this.c = j;
            this.b = bVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            String str = this.f1013a;
            String str2 = ((c) obj).f1013a;
            return str != null ? str.equalsIgnoreCase(str2) : str2 == null;
        }

        public int hashCode() {
            String str = this.f1013a;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public String c() {
            return this.f1013a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long b() {
            return this.c;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public b a() {
            return this.b;
        }
    }

    public void b() {
        HashSet<c> hashSet = new HashSet(this.c);
        if (com.applovin.impl.sdk.t.a()) {
            this.f1012a.a("CountdownManager", "Starting " + hashSet.size() + " countdowns...");
        }
        int iIncrementAndGet = this.d.incrementAndGet();
        for (c cVar : hashSet) {
            if (com.applovin.impl.sdk.t.a()) {
                this.f1012a.a("CountdownManager", "Starting countdown: " + cVar.c() + " for generation " + iIncrementAndGet + "...");
            }
            a(cVar, iIncrementAndGet);
        }
    }

    private void a(final c cVar, final int i) {
        this.b.postDelayed(new Runnable() { // from class: com.applovin.impl.t4$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.b(cVar, i);
            }
        }, cVar.b());
    }

    public void a() {
        if (com.applovin.impl.sdk.t.a()) {
            this.f1012a.a("CountdownManager", "Removing all countdowns...");
        }
        c();
        this.c.clear();
    }
}
