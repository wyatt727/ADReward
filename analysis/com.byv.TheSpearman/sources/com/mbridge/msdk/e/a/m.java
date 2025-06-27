package com.mbridge.msdk.e.a;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: NetworkResponse.java */
/* loaded from: classes4.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final int f2709a;
    public final byte[] b;
    public final Map<String, String> c;
    public final List<i> d;
    public final boolean e;
    public final long f;

    public m(int i, byte[] bArr, boolean z, long j, List<i> list) {
        this(i, bArr, a(list), list, z, j);
    }

    private m(int i, byte[] bArr, Map<String, String> map, List<i> list, boolean z, long j) {
        this.f2709a = i;
        this.b = bArr;
        this.c = map;
        if (list == null) {
            this.d = null;
        } else {
            this.d = Collections.unmodifiableList(list);
        }
        this.e = z;
        this.f = j;
    }

    private static Map<String, String> a(List<i> list) {
        if (list == null) {
            return null;
        }
        if (list.isEmpty()) {
            return Collections.emptyMap();
        }
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (i iVar : list) {
            treeMap.put(iVar.a(), iVar.b());
        }
        return treeMap;
    }
}
