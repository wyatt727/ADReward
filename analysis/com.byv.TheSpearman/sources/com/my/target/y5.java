package com.my.target;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.webkit.ProxyConfig;
import java.net.CookieStore;
import java.net.HttpCookie;
import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes4.dex */
public class y5 implements CookieStore {

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f4192a;
    public final Map<URI, Set<HttpCookie>> b = new HashMap();

    public y5(Context context) {
        this.f4192a = context.getSharedPreferences("mytarget_httpcookie_prefs", 0);
        a();
    }

    public static URI a(URI uri, HttpCookie httpCookie) {
        if (httpCookie.getDomain() == null) {
            return uri;
        }
        String domain = httpCookie.getDomain();
        if (domain.charAt(0) == '.') {
            domain = domain.substring(1);
        }
        try {
            return new URI(uri.getScheme() == null ? ProxyConfig.MATCH_HTTP : uri.getScheme(), domain, httpCookie.getPath() == null ? "/" : httpCookie.getPath(), null);
        } catch (Throwable th) {
            ba.a("MyTargetCookieStore: Error - " + th.getMessage());
            return uri;
        }
    }

    public final List<HttpCookie> a(URI uri) {
        HashSet hashSet = new HashSet();
        for (Map.Entry<URI, Set<HttpCookie>> entry : this.b.entrySet()) {
            URI key = entry.getKey();
            if (a(key.getHost(), uri.getHost()) && b(key.getPath(), uri.getPath())) {
                hashSet.addAll(entry.getValue());
            }
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            HttpCookie httpCookie = (HttpCookie) it.next();
            if (httpCookie.hasExpired()) {
                arrayList.add(httpCookie);
                it.remove();
            }
        }
        if (!arrayList.isEmpty()) {
            a(uri, arrayList);
        }
        return new ArrayList(hashSet);
    }

    public final void a() {
        for (Map.Entry<String, ?> entry : this.f4192a.getAll().entrySet()) {
            try {
                URI uri = new URI(entry.getKey().split("\\|", 2)[0]);
                HttpCookie httpCookieA = new z5().a((String) entry.getValue());
                Set<HttpCookie> hashSet = this.b.get(uri);
                if (hashSet == null) {
                    hashSet = new HashSet<>();
                    this.b.put(uri, hashSet);
                }
                hashSet.add(httpCookieA);
            } catch (Throwable th) {
                ba.a("MyTargetCookieStore: Error - " + th.getMessage());
            }
        }
    }

    public final void a(URI uri, List<HttpCookie> list) {
        SharedPreferences.Editor editorEdit = this.f4192a.edit();
        Iterator<HttpCookie> it = list.iterator();
        while (it.hasNext()) {
            editorEdit.remove(uri.toString() + "|" + it.next().getName());
        }
        editorEdit.apply();
    }

    public final boolean a(String str, String str2) {
        if (!str2.equals(str)) {
            if (!str2.endsWith("." + str)) {
                return false;
            }
        }
        return true;
    }

    @Override // java.net.CookieStore
    public synchronized void add(URI uri, HttpCookie httpCookie) {
        URI uriA = a(uri, httpCookie);
        Set<HttpCookie> hashSet = this.b.get(uriA);
        if (hashSet == null) {
            hashSet = new HashSet<>();
            this.b.put(uriA, hashSet);
        }
        hashSet.remove(httpCookie);
        hashSet.add(httpCookie);
        c(uriA, httpCookie);
    }

    public final void b() {
        this.f4192a.edit().clear().apply();
    }

    public final void b(URI uri, HttpCookie httpCookie) {
        SharedPreferences.Editor editorEdit = this.f4192a.edit();
        editorEdit.remove(uri.toString() + "|" + httpCookie.getName());
        editorEdit.apply();
    }

    public final boolean b(String str, String str2) {
        return str2.equals(str) || (str2.startsWith(str) && str.charAt(str.length() - 1) == '/') || (str2.startsWith(str) && str2.substring(str.length()).charAt(0) == '/');
    }

    public final void c(URI uri, HttpCookie httpCookie) {
        SharedPreferences.Editor editorEdit = this.f4192a.edit();
        editorEdit.putString(uri.toString() + "|" + httpCookie.getName(), new z5().a(httpCookie));
        editorEdit.apply();
    }

    @Override // java.net.CookieStore
    public synchronized List<HttpCookie> get(URI uri) {
        return a(uri);
    }

    @Override // java.net.CookieStore
    public synchronized List<HttpCookie> getCookies() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator<URI> it = this.b.keySet().iterator();
        while (it.hasNext()) {
            arrayList.addAll(a(it.next()));
        }
        return arrayList;
    }

    @Override // java.net.CookieStore
    public synchronized List<URI> getURIs() {
        return new ArrayList(this.b.keySet());
    }

    @Override // java.net.CookieStore
    public synchronized boolean remove(URI uri, HttpCookie httpCookie) {
        boolean z;
        Set<HttpCookie> set = this.b.get(uri);
        z = set != null && set.remove(httpCookie);
        if (z) {
            b(uri, httpCookie);
        }
        return z;
    }

    @Override // java.net.CookieStore
    public synchronized boolean removeAll() {
        this.b.clear();
        b();
        return true;
    }
}
