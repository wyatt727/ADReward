package com.my.target;

import android.content.Context;
import java.net.CookieHandler;
import java.net.CookieManager;
import java.net.URI;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public final class x5 {
    public static volatile x5 b;

    /* renamed from: a, reason: collision with root package name */
    public final CookieHandler f4182a;

    public x5(CookieManager cookieManager) {
        this.f4182a = cookieManager;
    }

    public static x5 a(Context context) {
        x5 x5Var = b;
        if (x5Var == null) {
            synchronized (x5.class) {
                x5Var = b;
                if (x5Var == null) {
                    x5Var = new x5(new CookieManager(new y5(context.getApplicationContext()), null));
                    b = x5Var;
                }
            }
        }
        return x5Var;
    }

    public void a(URLConnection uRLConnection) {
        try {
            this.f4182a.put(URI.create(uRLConnection.getURL().toString()), uRLConnection.getHeaderFields());
        } catch (Throwable th) {
            ba.a("MyTargetCookieManager: Unable to set cookies from urlconnection - " + th.getMessage());
        }
    }

    public final void a(URLConnection uRLConnection, Map<String, List<String>> map) {
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            String key = entry.getKey();
            Iterator<String> it = entry.getValue().iterator();
            while (it.hasNext()) {
                uRLConnection.addRequestProperty(key, it.next());
            }
        }
    }

    public void b(URLConnection uRLConnection) {
        try {
            a(uRLConnection, this.f4182a.get(URI.create(uRLConnection.getURL().toString()), new HashMap()));
        } catch (Throwable th) {
            ba.a("MyTargetCookieManager: Unable to set cookies to urlconnection - " + th.getMessage());
        }
    }
}
