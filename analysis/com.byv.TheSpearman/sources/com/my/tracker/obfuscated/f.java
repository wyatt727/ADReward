package com.my.tracker.obfuscated;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class f {
    private List<PackageInfo> b;
    private String c;

    /* renamed from: a, reason: collision with root package name */
    private List<a> f4222a = Collections.EMPTY_LIST;
    private boolean d = false;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f4223a;
        public final long b;

        a(String str, long j) {
            this.f4223a = str;
            this.b = j;
        }
    }

    f() {
    }

    private static String a(List<a> list) {
        StringBuilder sb = new StringBuilder();
        boolean z = false;
        for (a aVar : list) {
            if (z) {
                sb.append(",");
            } else {
                z = true;
            }
            sb.append(aVar.f4223a);
        }
        return sb.toString();
    }

    private static List<a> b(List<PackageInfo> list) {
        ArrayList arrayList = new ArrayList();
        for (PackageInfo packageInfo : list) {
            ApplicationInfo applicationInfo = packageInfo.applicationInfo;
            if ((applicationInfo.flags & 1) == 0) {
                arrayList.add(new a(applicationInfo.packageName, y0.b(packageInfo.firstInstallTime)));
            }
        }
        return arrayList;
    }

    public void a(Context context) {
        String str;
        this.d = false;
        List<PackageInfo> list = this.b;
        if (list == null || list.isEmpty()) {
            return;
        }
        List<a> listB = b(this.b);
        this.f4222a = listB;
        String strA = a(listB);
        if (TextUtils.isEmpty(strA)) {
            return;
        }
        String strF = r0.a(context).f();
        String strA2 = n.a(strA);
        this.c = strA2;
        if (strF.equals(strA2)) {
            str = "Apps hash did not changed";
        } else {
            this.d = true;
            str = "Apps hash changed";
        }
        z0.a(str);
    }

    public void a(s0 s0Var, Context context) {
        if (!this.d || this.f4222a.isEmpty()) {
            return;
        }
        s0Var.a(this.f4222a);
    }

    public void b(Context context) {
        if (this.d) {
            r0.a(context).h(this.c);
            this.d = false;
        }
    }

    public void c(List<PackageInfo> list) {
        this.b = list;
    }
}
