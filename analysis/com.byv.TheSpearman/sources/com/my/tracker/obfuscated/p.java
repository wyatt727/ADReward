package com.my.tracker.obfuscated;

import android.content.Context;
import android.text.TextUtils;
import com.my.tracker.MyTracker;
import com.my.tracker.ads.AdEvent;
import com.my.tracker.miniapps.MiniAppEvent;
import com.my.tracker.obfuscated.q0;
import com.my.tracker.obfuscated.z;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class p {
    final a1 b;
    final Context c;
    final b d;
    k0 e;

    /* renamed from: a, reason: collision with root package name */
    final Map<Integer, Long> f4246a = new HashMap();
    long f = 0;

    public interface a {
        void a(List<d> list);
    }

    public interface b {
        void a();

        void a(String str);
    }

    public interface c {
        void a(List<v> list);
    }

    private p(a1 a1Var, b bVar, Context context) {
        this.b = a1Var;
        this.d = bVar;
        this.c = context.getApplicationContext();
    }

    public static p a(a1 a1Var, b bVar, Context context) {
        return new p(a1Var, bVar, context);
    }

    private static Map<String, String> a(Map<String, String> map) {
        if (map == null || map.isEmpty()) {
            return null;
        }
        return new HashMap(map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(int i, byte[] bArr, boolean z, boolean z2, long j, Runnable runnable) {
        if (!a(this.e) && this.e.a(i, bArr, z, z2, j)) {
            b();
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(long j) {
        if (a(this.e)) {
            return;
        }
        boolean zD = this.e.d(j, r0.a(this.c).m());
        if (this.e.a(j)) {
            zD = true;
        }
        if (zD) {
            b((MyTracker.FlushListener) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(long j, float f) {
        if (a(this.e) || a(25, j)) {
            return;
        }
        long j2 = (long) (f * 1000.0f);
        this.e.a(j2, y0.b(j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(long j, float f, float f2, float f3) {
        if (a(this.e) || a(27, j)) {
            return;
        }
        long jB = y0.b(j);
        this.e.a((long) (f * 1000.0f), (long) (f2 * 1000.0f), (long) (f3 * 1000.0f), jB);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(long j, String str, q0.a aVar, long j2) {
        if (!a(this.e) && this.e.a(j, str, aVar, j2)) {
            r0.a(this.c).c(j2);
            this.f = j2;
            b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(AdEvent adEvent, long j) {
        if (!a(this.e) && this.e.a(adEvent, j)) {
            b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(MiniAppEvent miniAppEvent, long j) {
        if (a(this.e) || a(miniAppEvent.name) || b(miniAppEvent.eventParams) || !this.e.a(miniAppEvent, j)) {
            return;
        }
        b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(a aVar, List list) {
        if (a(this.e)) {
            aVar.a(Collections.EMPTY_LIST);
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.e.a((d) it.next());
        }
        aVar.a(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(c cVar, List list) {
        if (a(this.e)) {
            cVar.a(Collections.EMPTY_LIST);
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.e.a((v) it.next());
        }
        cVar.a(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str, long j) {
        if (!a(this.e) && this.e.a(str, j)) {
            b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str, String str2, long j) {
        if (!a(this.e) && this.e.a(str, str2, j)) {
            b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str, String str2, long j, long j2, long j3) {
        if (!a(this.e) && this.e.a(str, str2, j, j2, j3)) {
            b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str, String str2, long j, Runnable runnable) {
        if (a(this.e)) {
            return;
        }
        if (this.e.b(str, str2, j)) {
            b();
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str, String str2, String str3, String str4, String str5, long j) {
        if (!a(this.e) && this.e.a(str, str2, str3, str4, str5, j)) {
            r0.a(this.c).c(j);
            this.f = j;
            b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(List list) {
        if (a(this.e)) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            this.e.a(dVar, (Map<String, String>) null);
            this.e.b(dVar);
        }
        b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Map map, int i, long j) {
        if (a(this.e) || b((Map<String, String>) map) || !this.e.a(i, (Map<String, String>) map, j)) {
            return;
        }
        b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Map map, long j) {
        if (a(this.e) || b((Map<String, String>) map) || !this.e.a((Map<String, String>) map, j)) {
            return;
        }
        b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Map map, String str, long j) {
        if (a(this.e) || b((Map<String, String>) map) || a(str) || !this.e.a(str, (Map<String, String>) map, j)) {
            return;
        }
        b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Map map, String str, String str2, long j) {
        if (a(this.e) || b((Map<String, String>) map) || !this.e.a(str, str2, (Map<String, String>) map, j)) {
            return;
        }
        b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Map map, String str, String str2, String str3, long j, JSONObject jSONObject, Map map2) {
        d dVarA;
        if (a(this.e) || b((Map<String, String>) map) || (dVarA = d.a(str, str2, str3, 0, j)) == null) {
            return;
        }
        dVarA.a(jSONObject);
        if (this.e.a(dVarA, (Map<String, String>) map2)) {
            b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Map map, JSONObject jSONObject, String str, long j, JSONObject jSONObject2, Map map2) {
        if (a(this.e) || b((Map<String, String>) map)) {
            return;
        }
        if (this.e.a(v.a(jSONObject, str, j).a(jSONObject2), (Map<String, String>) map2)) {
            b();
        }
    }

    private boolean a(int i, long j) {
        Long l = this.f4246a.get(Integer.valueOf(i));
        if (l == null || j - l.longValue() >= 800) {
            this.f4246a.put(Integer.valueOf(i), Long.valueOf(j));
            return false;
        }
        z0.a(String.format(Locale.ENGLISH, "EventTracker: event with type %d was throttled", Integer.valueOf(i)));
        return true;
    }

    static boolean a(k0 k0Var) {
        if (k0Var != null) {
            return false;
        }
        z0.b("EventTracker error: repository is null");
        return true;
    }

    static boolean a(String str) {
        if (str == null || str.length() <= 255) {
            return false;
        }
        z0.b("EventTracker error: length of the string " + str + " is more than 255, event ignored");
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(long j, float f) {
        if (a(this.e) || a(28, j)) {
            return;
        }
        long j2 = (long) (f * 1000.0f);
        this.e.b(j2, y0.b(j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(long j, float f, float f2, float f3) {
        if (a(this.e) || a(26, j)) {
            return;
        }
        long jB = y0.b(j);
        this.e.b((long) (f * 1000.0f), (long) (f2 * 1000.0f), (long) (f3 * 1000.0f), jB);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(a aVar) {
        aVar.a(a(this.e) ? Collections.EMPTY_LIST : this.e.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(c cVar) {
        cVar.a(a(this.e) ? Collections.EMPTY_LIST : this.e.b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(String str, String str2, long j, long j2, long j3) {
        if (!a(this.e) && this.e.b(str, str2, j, j2, j3)) {
            b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(List list) {
        if (a(this.e)) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            v vVar = (v) it.next();
            this.e.a(vVar, (Map<String, String>) null);
            this.e.b(vVar);
        }
        b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(Map map, long j) {
        if (a(this.e) || b((Map<String, String>) map) || !this.e.b((Map<String, String>) map, j)) {
            return;
        }
        b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(Map map, String str, String str2, long j) {
        if (a(this.e) || b((Map<String, String>) map) || !this.e.b(str, str2, (Map<String, String>) map, j)) {
            return;
        }
        b();
    }

    static boolean b(Map<String, String> map) {
        if (map == null) {
            return false;
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (a(entry.getKey()) || a(entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(long j, float f) {
        if (a(this.e) || a(29, j)) {
            return;
        }
        long j2 = (long) (f * 1000.0f);
        this.e.c(j2, y0.b(j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(MyTracker.FlushListener flushListener) {
        if (a(this.e)) {
            return;
        }
        b(flushListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d() {
        if (this.e != null) {
            z0.b("EventTracker error: tracker has already been initialized");
            return;
        }
        k0 k0VarA = k0.a(this.b, this.c);
        this.e = k0VarA;
        if (a(k0VarA)) {
            return;
        }
        this.f = r0.a(this.c).k();
        b();
    }

    public void a() {
        a((MyTracker.FlushListener) null);
    }

    public void a(final float f) {
        final long jCurrentTimeMillis = System.currentTimeMillis();
        g.a(new Runnable() { // from class: com.my.tracker.obfuscated.p$$ExternalSyntheticLambda25
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.a(jCurrentTimeMillis, f);
            }
        });
    }

    public void a(final float f, final float f2, final float f3) {
        final long jCurrentTimeMillis = System.currentTimeMillis();
        g.a(new Runnable() { // from class: com.my.tracker.obfuscated.p$$ExternalSyntheticLambda28
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.a(jCurrentTimeMillis, f, f2, f3);
            }
        });
    }

    public void a(final int i, Map<String, String> map) {
        final long jA = y0.a();
        final Map<String, String> mapA = a(map);
        g.a(new Runnable() { // from class: com.my.tracker.obfuscated.p$$ExternalSyntheticLambda16
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.a(mapA, i, jA);
            }
        });
    }

    public void a(final int i, final byte[] bArr, final boolean z, final boolean z2, final Runnable runnable) {
        final long jA = y0.a();
        g.a(new Runnable() { // from class: com.my.tracker.obfuscated.p$$ExternalSyntheticLambda11
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.a(i, bArr, z, z2, jA, runnable);
            }
        });
    }

    public void a(final long j, final String str, final q0.a aVar) {
        final long jA = y0.a();
        g.a(new Runnable() { // from class: com.my.tracker.obfuscated.p$$ExternalSyntheticLambda30
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.a(j, str, aVar, jA);
            }
        });
    }

    public void a(final MyTracker.FlushListener flushListener) {
        g.a(new Runnable() { // from class: com.my.tracker.obfuscated.p$$ExternalSyntheticLambda31
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.c(flushListener);
            }
        });
    }

    public void a(final AdEvent adEvent) {
        final long jA = y0.a();
        g.a(new Runnable() { // from class: com.my.tracker.obfuscated.p$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.a(adEvent, jA);
            }
        });
    }

    public void a(final MiniAppEvent miniAppEvent) {
        final long jA = y0.a();
        g.a(new Runnable() { // from class: com.my.tracker.obfuscated.p$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.a(miniAppEvent, jA);
            }
        });
    }

    public void a(final a aVar) {
        g.a(new Runnable() { // from class: com.my.tracker.obfuscated.p$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.b(aVar);
            }
        });
    }

    public void a(final c cVar) {
        g.a(new Runnable() { // from class: com.my.tracker.obfuscated.p$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.b(cVar);
            }
        });
    }

    public void a(final String str, final String str2) {
        final long jA = y0.a();
        g.a(new Runnable() { // from class: com.my.tracker.obfuscated.p$$ExternalSyntheticLambda8
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.a(str, str2, jA);
            }
        });
    }

    public void a(final String str, final String str2, final long j, final long j2) {
        final long jA = y0.a();
        g.a(new Runnable() { // from class: com.my.tracker.obfuscated.p$$ExternalSyntheticLambda9
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.a(str, str2, j, j2, jA);
            }
        });
    }

    public void a(final String str, final String str2, final Runnable runnable) {
        final long jA = y0.a();
        g.a(new Runnable() { // from class: com.my.tracker.obfuscated.p$$ExternalSyntheticLambda12
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.a(str, str2, jA, runnable);
            }
        });
    }

    public void a(final String str, final String str2, final String str3, final String str4, final String str5) {
        final long jA = y0.a();
        g.a(new Runnable() { // from class: com.my.tracker.obfuscated.p$$ExternalSyntheticLambda13
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.a(str, str2, str3, str4, str5, jA);
            }
        });
    }

    public void a(final String str, final String str2, Map<String, String> map) {
        final long jA = y0.a();
        final Map<String, String> mapA = a(map);
        g.a(new Runnable() { // from class: com.my.tracker.obfuscated.p$$ExternalSyntheticLambda21
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.a(mapA, str, str2, jA);
            }
        });
    }

    public void a(final String str, Map<String, String> map) {
        final long jA = y0.a();
        final Map<String, String> mapA = a(map);
        g.a(new Runnable() { // from class: com.my.tracker.obfuscated.p$$ExternalSyntheticLambda19
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.a(mapA, str, jA);
            }
        });
    }

    public void a(final List<d> list, final a aVar) {
        g.a(new Runnable() { // from class: com.my.tracker.obfuscated.p$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.a(aVar, list);
            }
        });
    }

    public void a(final List<v> list, final c cVar) {
        g.a(new Runnable() { // from class: com.my.tracker.obfuscated.p$$ExternalSyntheticLambda6
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.a(cVar, list);
            }
        });
    }

    public void a(final JSONObject jSONObject, final String str, final String str2, final String str3, final Map<String, String> map) {
        final long jA = y0.a();
        final Map<String, String> mapA = a(map);
        g.a(new Runnable() { // from class: com.my.tracker.obfuscated.p$$ExternalSyntheticLambda23
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.a(mapA, str, str2, str3, jA, jSONObject, map);
            }
        });
    }

    public void a(final JSONObject jSONObject, final JSONObject jSONObject2, final String str, final Map<String, String> map) {
        final long jA = y0.a();
        final Map<String, String> mapA = a(map);
        g.a(new Runnable() { // from class: com.my.tracker.obfuscated.p$$ExternalSyntheticLambda24
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.a(mapA, jSONObject2, str, jA, jSONObject, map);
            }
        });
    }

    void b() {
        int iF;
        k0 k0Var = this.e;
        if (k0Var == null) {
            return;
        }
        if (k0Var.c() != 0 || ((iF = this.b.f()) > 0 && y0.a() - this.f <= iF)) {
            b((MyTracker.FlushListener) null);
        }
    }

    public void b(final float f) {
        final long jCurrentTimeMillis = System.currentTimeMillis();
        g.a(new Runnable() { // from class: com.my.tracker.obfuscated.p$$ExternalSyntheticLambda27
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.b(jCurrentTimeMillis, f);
            }
        });
    }

    public void b(final float f, final float f2, final float f3) {
        final long jCurrentTimeMillis = System.currentTimeMillis();
        g.a(new Runnable() { // from class: com.my.tracker.obfuscated.p$$ExternalSyntheticLambda29
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.b(jCurrentTimeMillis, f, f2, f3);
            }
        });
    }

    void b(MyTracker.FlushListener flushListener) {
        if (this.e == null) {
            return;
        }
        this.d.a();
        z.b<String> bVarA = this.e.a(flushListener);
        if (bVarA == null) {
            return;
        }
        String strA = bVarA.a();
        if (TextUtils.isEmpty(strA)) {
            return;
        }
        this.d.a(strA);
    }

    public void b(final String str) {
        final long jA = y0.a();
        g.a(new Runnable() { // from class: com.my.tracker.obfuscated.p$$ExternalSyntheticLambda7
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.a(str, jA);
            }
        });
    }

    public void b(final String str, final String str2, final long j, final long j2) {
        final long jA = y0.a();
        g.a(new Runnable() { // from class: com.my.tracker.obfuscated.p$$ExternalSyntheticLambda10
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.b(str, str2, j, j2, jA);
            }
        });
    }

    public void b(final String str, final String str2, Map<String, String> map) {
        final long jA = y0.a();
        final Map<String, String> mapA = a(map);
        g.a(new Runnable() { // from class: com.my.tracker.obfuscated.p$$ExternalSyntheticLambda20
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.b(mapA, str, str2, jA);
            }
        });
    }

    public void c() {
        g.a(new Runnable() { // from class: com.my.tracker.obfuscated.p$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.d();
            }
        });
    }

    public void c(final float f) {
        final long jCurrentTimeMillis = System.currentTimeMillis();
        g.a(new Runnable() { // from class: com.my.tracker.obfuscated.p$$ExternalSyntheticLambda26
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.c(jCurrentTimeMillis, f);
            }
        });
    }

    public void c(final List<d> list) {
        g.a(new Runnable() { // from class: com.my.tracker.obfuscated.p$$ExternalSyntheticLambda15
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.a(list);
            }
        });
    }

    public void c(Map<String, String> map) {
        final long jA = y0.a();
        final Map<String, String> mapA = a(map);
        g.a(new Runnable() { // from class: com.my.tracker.obfuscated.p$$ExternalSyntheticLambda17
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.a(mapA, jA);
            }
        });
    }

    public void d(final List<v> list) {
        g.a(new Runnable() { // from class: com.my.tracker.obfuscated.p$$ExternalSyntheticLambda14
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.b(list);
            }
        });
    }

    public void d(Map<String, String> map) {
        final long jA = y0.a();
        final Map<String, String> mapA = a(map);
        g.a(new Runnable() { // from class: com.my.tracker.obfuscated.p$$ExternalSyntheticLambda18
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.b(mapA, jA);
            }
        });
    }

    public void e() {
        final long jA = y0.a();
        g.a(new Runnable() { // from class: com.my.tracker.obfuscated.p$$ExternalSyntheticLambda22
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.a(jA);
            }
        });
    }
}
