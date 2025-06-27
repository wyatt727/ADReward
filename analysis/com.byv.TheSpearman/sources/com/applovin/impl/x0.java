package com.applovin.impl;

import com.applovin.impl.hm;
import com.applovin.impl.jm;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public class x0 implements jm.b, hm.b {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f1148a;
    private final a b;
    private v0 c;
    private String d;

    public interface a {
        void a(v0 v0Var, String str);

        void a(b bVar, String str);
    }

    public enum b {
        DEVELOPER_URI_NOT_FOUND,
        APPADSTXT_NOT_FOUND,
        MISSING_APPLOVIN_ENTRIES,
        MISSING_NON_APPLOVIN_ENTRIES
    }

    public x0(com.applovin.impl.sdk.k kVar, a aVar) {
        this.f1148a = kVar;
        this.b = aVar;
    }

    @Override // com.applovin.impl.hm.b
    public void a(b bVar, String str) {
        this.b.a(bVar, str);
    }

    @Override // com.applovin.impl.hm.b
    public void a(String str, String str2) {
        HashMap map = new HashMap();
        ArrayList arrayList = new ArrayList();
        String[] strArrSplit = str.split("\n");
        int length = strArrSplit.length;
        int i = 1;
        int i2 = 0;
        while (i2 < length) {
            int i3 = i + 1;
            w0 w0Var = new w0(strArrSplit[i2], i);
            if (w0Var.h()) {
                String strB = w0Var.b();
                List arrayList2 = map.containsKey(strB) ? (List) map.get(strB) : new ArrayList();
                if (arrayList2 != null) {
                    arrayList2.add(w0Var);
                    map.put(strB, arrayList2);
                }
            } else {
                arrayList.add(w0Var);
            }
            i2++;
            i = i3;
        }
        this.c = new v0(map, arrayList);
        this.d = str2;
        this.f1148a.L();
        if (com.applovin.impl.sdk.t.a()) {
            this.f1148a.L().a("AppAdsTxtService", "app-ads.txt fetched: " + this.c);
        }
        this.b.a(this.c, str2);
    }

    @Override // com.applovin.impl.jm.b
    public void a(b bVar) {
        this.b.a(bVar, (String) null);
    }

    @Override // com.applovin.impl.jm.b
    public void a(String str) {
        this.f1148a.l0().a(new hm(this.f1148a, str, this));
    }

    public void a() {
        v0 v0Var = this.c;
        if (v0Var != null) {
            this.b.a(v0Var, this.d);
        } else {
            this.f1148a.l0().a(new jm(this.f1148a, this));
        }
    }
}
