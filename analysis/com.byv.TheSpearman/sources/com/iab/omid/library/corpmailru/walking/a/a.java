package com.iab.omid.library.corpmailru.walking.a;

import com.iab.omid.library.corpmailru.walking.a.b;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public abstract class a extends b {

    /* renamed from: a, reason: collision with root package name */
    protected final HashSet<String> f1541a;
    protected final JSONObject b;
    protected final long c;

    public a(b.InterfaceC0217b interfaceC0217b, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(interfaceC0217b);
        this.f1541a = new HashSet<>(hashSet);
        this.b = jSONObject;
        this.c = j;
    }
}
