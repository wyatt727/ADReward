package com.mbridge.msdk.e.a;

import android.text.TextUtils;
import com.json.t2;

/* compiled from: Header.java */
/* loaded from: classes4.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    private final String f2707a;
    private final String b;

    public i(String str, String str2) {
        this.f2707a = str;
        this.b = str2;
    }

    public final String a() {
        return this.f2707a;
    }

    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        i iVar = (i) obj;
        return TextUtils.equals(this.f2707a, iVar.f2707a) && TextUtils.equals(this.b, iVar.b);
    }

    public final int hashCode() {
        return (this.f2707a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "Header[name=" + this.f2707a + ",value=" + this.b + t2.i.e;
    }
}
