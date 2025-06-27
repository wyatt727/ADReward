package com.mbridge.msdk.foundation.same.net.f;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: NetworkResponse.java */
/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f2886a;
    public final List<com.mbridge.msdk.foundation.same.net.d.b> b;
    public final Map<String, String> c;
    public final int d;

    public c(int i, byte[] bArr, List<com.mbridge.msdk.foundation.same.net.d.b> list) {
        this(i, bArr, a(list), list);
    }

    private c(int i, byte[] bArr, Map<String, String> map, List<com.mbridge.msdk.foundation.same.net.d.b> list) {
        this.d = i;
        this.f2886a = bArr;
        this.c = map;
        if (list == null) {
            this.b = null;
        } else {
            this.b = Collections.unmodifiableList(list);
        }
    }

    private static Map<String, String> a(List<com.mbridge.msdk.foundation.same.net.d.b> list) {
        if (list == null) {
            return null;
        }
        if (list.isEmpty()) {
            return Collections.emptyMap();
        }
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (com.mbridge.msdk.foundation.same.net.d.b bVar : list) {
            treeMap.put(bVar.a(), bVar.b());
        }
        return treeMap;
    }
}
