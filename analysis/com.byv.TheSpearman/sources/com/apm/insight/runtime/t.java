package com.apm.insight.runtime;

import android.content.Context;
import android.text.TextUtils;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    private String f156a = null;
    private int b = -1;

    public t(Context context) {
    }

    public String a() {
        if (!TextUtils.isEmpty(this.f156a) && !"0".equals(this.f156a)) {
            return this.f156a;
        }
        String strD = com.apm.insight.i.a().d();
        this.f156a = strD;
        if (!TextUtils.isEmpty(strD) && !"0".equals(this.f156a)) {
            return this.f156a;
        }
        String strB = s.a().b();
        this.f156a = strB;
        return strB;
    }

    public void a(String str) {
        this.f156a = str;
        s.a().b(str);
    }

    public boolean b() {
        return this.f156a != null;
    }
}
