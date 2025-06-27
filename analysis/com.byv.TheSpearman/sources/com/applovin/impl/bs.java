package com.applovin.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes.dex */
final class bs implements kl {

    /* renamed from: a, reason: collision with root package name */
    private final List f305a;
    private final long[] b;
    private final long[] c;

    @Override // com.applovin.impl.kl
    public List b(long j) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < this.f305a.size(); i++) {
            long[] jArr = this.b;
            int i2 = i * 2;
            if (jArr[i2] <= j && j < jArr[i2 + 1]) {
                xr xrVar = (xr) this.f305a.get(i);
                z4 z4Var = xrVar.f1184a;
                if (z4Var.f == -3.4028235E38f) {
                    arrayList2.add(xrVar);
                } else {
                    arrayList.add(z4Var);
                }
            }
        }
        Collections.sort(arrayList2, new Comparator() { // from class: com.applovin.impl.bs$$ExternalSyntheticLambda0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return bs.a((xr) obj, (xr) obj2);
            }
        });
        for (int i3 = 0; i3 < arrayList2.size(); i3++) {
            arrayList.add(((xr) arrayList2.get(i3)).f1184a.a().a((-1) - i3, 1).a());
        }
        return arrayList;
    }

    public bs(List list) {
        this.f305a = Collections.unmodifiableList(new ArrayList(list));
        this.b = new long[list.size() * 2];
        for (int i = 0; i < list.size(); i++) {
            xr xrVar = (xr) list.get(i);
            int i2 = i * 2;
            long[] jArr = this.b;
            jArr[i2] = xrVar.b;
            jArr[i2 + 1] = xrVar.c;
        }
        long[] jArr2 = this.b;
        long[] jArrCopyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.c = jArrCopyOf;
        Arrays.sort(jArrCopyOf);
    }

    @Override // com.applovin.impl.kl
    public long a(int i) {
        a1.a(i >= 0);
        a1.a(i < this.c.length);
        return this.c[i];
    }

    @Override // com.applovin.impl.kl
    public int a() {
        return this.c.length;
    }

    @Override // com.applovin.impl.kl
    public int a(long j) {
        int iA = yp.a(this.c, j, false, false);
        if (iA < this.c.length) {
            return iA;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int a(xr xrVar, xr xrVar2) {
        return Long.compare(xrVar.b, xrVar2.b);
    }
}
