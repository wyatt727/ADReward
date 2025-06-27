package com.my.target;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public class w9 {

    /* renamed from: a, reason: collision with root package name */
    public static final w9 f4177a = new w9();

    public static void a(u9 u9Var, Context context) {
        f4177a.b(u9Var, (Map<String, String>) null, context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(u9 u9Var, Map map, Context context) {
        a(u9Var, map, null, context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str, Context context) {
        String strA = a(str);
        if (strA != null) {
            c2.a().a(strA, null, context);
        }
    }

    public static void a(List<u9> list, Context context) {
        f4177a.b(list, (Map<String, String>) null, context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(List list, Map map, Context context) {
        c2 c2VarA = c2.a();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            a((u9) it.next(), map, c2VarA, context);
        }
    }

    public static void c(String str, Context context) {
        f4177a.b(str, context);
    }

    public static void c(List<u9> list, Map<String, String> map, Context context) {
        f4177a.b(list, map, context);
    }

    public String a(String str) {
        return a(str, true);
    }

    public String a(String str, boolean z) {
        if (z) {
            str = da.a(str);
        }
        if (URLUtil.isNetworkUrl(str)) {
            return str;
        }
        ba.a("StatResolver: Invalid stat url: " + str);
        return null;
    }

    public final void a(u9 u9Var) {
        String str;
        if (u9Var instanceof t7) {
            str = "StatResolver: Tracking progress stat value - " + ((t7) u9Var).e() + ", url - " + u9Var.b();
        } else if (u9Var instanceof m7) {
            m7 m7Var = (m7) u9Var;
            str = "StatResolver: Tracking ovv stat percent - " + m7Var.d + ", value - " + m7Var.e() + ", ovv - " + m7Var.f() + ", url - " + u9Var.b();
        } else if (u9Var instanceof w5) {
            w5 w5Var = (w5) u9Var;
            str = "StatResolver: Tracking mrc stat percent - , percent - " + w5Var.d + ", duration - " + w5Var.e + ", url - " + u9Var.b();
        } else {
            str = "StatResolver: Tracking stat type - " + u9Var.a() + ", url - " + u9Var.b();
        }
        ba.a(str);
    }

    public final void a(u9 u9Var, Map<String, String> map, c2 c2Var, Context context) {
        a(u9Var);
        String strA = a(u9Var.b(), u9Var.c());
        if (strA == null) {
            return;
        }
        if (map != null && !map.isEmpty()) {
            Uri.Builder builder = new Uri.Builder();
            for (Map.Entry<String, String> entry : map.entrySet()) {
                builder.appendQueryParameter(entry.getKey(), entry.getValue());
            }
            strA = strA + builder.build().toString();
        }
        Context applicationContext = context.getApplicationContext();
        if (c2Var == null) {
            c2Var = c2.a();
        }
        c2Var.a(strA, null, applicationContext);
    }

    public void b(final u9 u9Var, final Map<String, String> map, final Context context) {
        if (u9Var == null) {
            return;
        }
        c0.c(new Runnable() { // from class: com.my.target.w9$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.a(u9Var, map, context);
            }
        });
    }

    public void b(final String str, Context context) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        final Context applicationContext = context.getApplicationContext();
        c0.c(new Runnable() { // from class: com.my.target.w9$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.a(str, applicationContext);
            }
        });
    }

    public void b(final List<u9> list, final Map<String, String> map, final Context context) {
        if (list == null || list.size() == 0) {
            ba.a("No stats here, nothing to send");
        } else {
            c0.c(new Runnable() { // from class: com.my.target.w9$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.a(list, map, context);
                }
            });
        }
    }
}
