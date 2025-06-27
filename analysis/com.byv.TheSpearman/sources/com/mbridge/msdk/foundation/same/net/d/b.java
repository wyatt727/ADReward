package com.mbridge.msdk.foundation.same.net.d;

import android.text.TextUtils;
import com.json.t2;

/* compiled from: Header.java */
/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final String f2880a;
    private final String b;

    public b(String str, String str2) {
        this.f2880a = str;
        this.b = str2;
    }

    public final String a() {
        return this.f2880a;
    }

    public final String b() {
        return this.b;
    }

    public final int hashCode() {
        return (this.f2880a.hashCode() * 31) + this.b.hashCode();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return TextUtils.equals(this.f2880a, bVar.f2880a) && TextUtils.equals(this.b, bVar.b);
    }

    public final String toString() {
        return "Header[name=" + this.f2880a + ",value=" + this.b + t2.i.e;
    }
}
