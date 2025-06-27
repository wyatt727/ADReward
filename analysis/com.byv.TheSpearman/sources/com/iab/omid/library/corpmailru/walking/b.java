package com.iab.omid.library.corpmailru.walking;

import com.iab.omid.library.corpmailru.walking.a.b;
import com.iab.omid.library.corpmailru.walking.a.d;
import com.iab.omid.library.corpmailru.walking.a.e;
import com.iab.omid.library.corpmailru.walking.a.f;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class b implements b.InterfaceC0217b {

    /* renamed from: a, reason: collision with root package name */
    private JSONObject f1545a;
    private final com.iab.omid.library.corpmailru.walking.a.c b;

    public b(com.iab.omid.library.corpmailru.walking.a.c cVar) {
        this.b = cVar;
    }

    public void a() {
        this.b.b(new d(this));
    }

    @Override // com.iab.omid.library.corpmailru.walking.a.b.InterfaceC0217b
    public void a(JSONObject jSONObject) {
        this.f1545a = jSONObject;
    }

    public void a(JSONObject jSONObject, HashSet<String> hashSet, long j) {
        this.b.b(new f(this, hashSet, jSONObject, j));
    }

    @Override // com.iab.omid.library.corpmailru.walking.a.b.InterfaceC0217b
    public JSONObject b() {
        return this.f1545a;
    }

    public void b(JSONObject jSONObject, HashSet<String> hashSet, long j) {
        this.b.b(new e(this, hashSet, jSONObject, j));
    }
}
