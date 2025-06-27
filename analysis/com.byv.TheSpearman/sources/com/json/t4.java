package com.json;

import android.util.Log;
import android.util.Pair;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes4.dex */
public class t4 {
    private static final String e = "EventsTracker";

    /* renamed from: a, reason: collision with root package name */
    private w5 f2298a;
    private o4 b;
    private h6 c;
    private ExecutorService d;

    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f2299a;

        a(String str) {
            this.f2299a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                xb xbVar = new xb();
                ArrayList<Pair<String, String>> arrayListD = t4.this.b.d();
                if ("POST".equals(t4.this.b.e())) {
                    xbVar = u6.b(t4.this.b.b(), this.f2299a, arrayListD);
                } else if ("GET".equals(t4.this.b.e())) {
                    xbVar = u6.a(t4.this.b.b(), this.f2299a, arrayListD);
                }
                t4.this.a("response status code: " + xbVar.f2441a);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public t4(o4 o4Var, w5 w5Var) {
        if (o4Var == null) {
            throw new InvalidParameterException("Null configuration not supported ");
        }
        if (o4Var.c() == null) {
            throw new InvalidParameterException("Null formatter not supported ");
        }
        this.b = o4Var;
        this.f2298a = w5Var;
        this.c = o4Var.c();
        this.d = Executors.newSingleThreadExecutor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        if (this.b.f()) {
            Log.d(e, str);
        }
    }

    private void a(Map<String, Object> map, Map<String, Object> map2) {
        try {
            map.putAll(map2);
        } catch (Exception unused) {
        }
    }

    private void b(String str) {
        this.d.submit(new a(str));
    }

    public void a(String str, Map<String, Object> map) {
        a(String.format(Locale.ENGLISH, "%s %s", str, map.toString()));
        if (this.b.a() && !str.isEmpty()) {
            HashMap map2 = new HashMap();
            map2.put("eventname", str);
            a(map2, this.f2298a.a());
            a(map2, map);
            b(this.c.a(map2));
        }
    }
}
