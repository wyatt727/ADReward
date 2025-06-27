package com.mbridge.msdk.e.a;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: Cache.java */
/* loaded from: classes4.dex */
public interface b {
    a a(String str);

    void a();

    void a(String str, a aVar);

    void a(String str, boolean z);

    /* compiled from: Cache.java */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public byte[] f2700a;
        public String b;
        public long c;
        public long d;
        public long e;
        public long f;
        public Map<String, String> g = Collections.emptyMap();
        public List<i> h;

        final boolean a(long j) {
            return this.e < j;
        }
    }
}
