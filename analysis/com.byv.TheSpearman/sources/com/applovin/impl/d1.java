package com.applovin.impl;

import android.net.Uri;
import android.text.TextUtils;
import com.applovin.impl.e1;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public class d1 extends c1 {
    private final String f;
    private final com.applovin.impl.sdk.ad.b g;
    private final List h;
    private final s2 i;
    private final c j;
    private StringBuffer k;
    private final Object l;
    private final ExecutorService m;
    private List n;

    public interface c {
        void a(String str, boolean z);
    }

    public d1(String str, com.applovin.impl.sdk.ad.b bVar, List list, s2 s2Var, ExecutorService executorService, com.applovin.impl.sdk.k kVar, c cVar) {
        super("AsyncTaskCacheHTMLResources", kVar);
        this.f = str;
        this.g = bVar;
        this.h = list;
        this.i = s2Var;
        this.m = executorService;
        this.j = cVar;
        this.k = new StringBuffer(str);
        this.l = new Object();
    }

    @Override // java.util.concurrent.Callable
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Boolean call() throws InterruptedException {
        HashSet hashSetD;
        if (this.e.get()) {
            return Boolean.FALSE;
        }
        if (TextUtils.isEmpty(this.f)) {
            a(this.f);
            return Boolean.FALSE;
        }
        if (!((Boolean) this.f308a.a(oj.Y0)).booleanValue()) {
            if (com.applovin.impl.sdk.t.a()) {
                this.c.a(this.b, "Resource caching is disabled, skipping cache...");
            }
            a(this.f);
            return Boolean.FALSE;
        }
        HashSet hashSet = new HashSet();
        HashSet hashSetC = c();
        if (hashSetC != null) {
            hashSet.addAll(hashSetC);
        }
        if (((Boolean) this.f308a.a(oj.g5)).booleanValue() && (hashSetD = d()) != null) {
            hashSet.addAll(hashSetD);
        }
        this.n = new ArrayList(hashSet);
        if (this.e.get()) {
            return Boolean.FALSE;
        }
        List list = this.n;
        if (list != null && !list.isEmpty()) {
            if (com.applovin.impl.sdk.t.a()) {
                this.c.a(this.b, "Executing " + this.n.size() + " caching operations...");
            }
            this.m.invokeAll(this.n);
            synchronized (this.l) {
                a(this.k.toString());
            }
            return Boolean.TRUE;
        }
        a(this.f);
        return Boolean.FALSE;
    }

    private void a(String str) {
        c cVar;
        if (this.e.get() || (cVar = this.j) == null) {
            return;
        }
        cVar.a(str, false);
    }

    class a implements e1.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f348a;

        a(String str) {
            this.f348a = str;
        }

        @Override // com.applovin.impl.e1.a
        public void a(Uri uri) {
            if (uri != null) {
                synchronized (d1.this.l) {
                    int iIndexOf = d1.this.k.indexOf(this.f348a);
                    d1.this.k.replace(iIndexOf, this.f348a.length() + iIndexOf, uri.toString());
                }
                d1.this.g.a(uri);
                d1.this.i.b();
                return;
            }
            com.applovin.impl.sdk.t tVar = d1.this.c;
            if (com.applovin.impl.sdk.t.a()) {
                d1 d1Var = d1.this;
                d1Var.c.a(d1Var.b, "Failed to cache JavaScript resource " + this.f348a);
            }
            if (d1.this.j != null) {
                d1.this.j.a(d1.this.f, true);
            }
            d1.this.i.a();
        }
    }

    private HashSet d() {
        HashSet hashSet = new HashSet();
        for (String str : StringUtils.getRegexMatches(StringUtils.match(this.f, (String) this.f308a.a(oj.h5)), 1)) {
            if (this.e.get()) {
                return null;
            }
            if (!StringUtils.isValidString(str)) {
                if (com.applovin.impl.sdk.t.a()) {
                    this.c.a(this.b, "Skip caching of non-resource " + str);
                }
            } else {
                hashSet.add(new e1(str, this.g, Collections.emptyList(), false, this.i, this.f308a, new a(str)));
            }
        }
        return hashSet;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0011, code lost:
    
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.util.HashSet c() {
        /*
            Method dump skipped, instructions count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.d1.c():java.util.HashSet");
    }

    class b implements e1.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f349a;
        final /* synthetic */ String b;
        final /* synthetic */ String c;

        b(String str, String str2, String str3) {
            this.f349a = str;
            this.b = str2;
            this.c = str3;
        }

        @Override // com.applovin.impl.e1.a
        public void a(Uri uri) {
            if (uri != null) {
                synchronized (d1.this.l) {
                    int iIndexOf = d1.this.k.indexOf(this.f349a);
                    d1.this.k.replace(iIndexOf, this.f349a.length() + iIndexOf, uri.toString());
                }
                d1.this.g.a(uri);
                d1.this.i.b();
                return;
            }
            if (d1.this.g.W().contains(this.b + this.c) && d1.this.j != null) {
                d1.this.j.a(d1.this.f, true);
            }
            d1.this.i.a();
        }
    }

    private Collection e() {
        HashSet hashSet = new HashSet();
        for (char c2 : ((String) this.f308a.a(oj.X0)).toCharArray()) {
            hashSet.add(Character.valueOf(c2));
        }
        hashSet.add('\"');
        return hashSet;
    }
}
