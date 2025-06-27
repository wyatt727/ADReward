package com.mbridge.msdk.foundation.c;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.out.MBridgeIds;
import java.io.Serializable;
import java.util.HashMap;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: MBFailureReason.java */
/* loaded from: classes4.dex */
public final class b implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private int f2756a;
    private int b;
    private String c;
    private Throwable d;
    private CampaignEx e;
    private MBridgeIds f;
    private String g;
    private String h;
    private boolean i;
    private int j = -1;
    private String k;
    private HashMap<Object, Object> l;
    private int m;
    private String n;
    private String o;
    private String p;
    private boolean q;

    public b(int i) {
        this.f2756a = i;
        this.b = a.b(i);
    }

    public b(int i, String str) {
        this.f2756a = i;
        if (!TextUtils.isEmpty(str)) {
            a("his_reason", str);
        }
        this.c = str;
        this.b = a.b(i);
    }

    public b(int i, int i2, String str) {
        if (!TextUtils.isEmpty(str)) {
            a("his_reason", str);
            this.c = str;
        } else {
            this.c = a.a(i2);
        }
        this.m = i;
        this.b = a.b(i2);
    }

    public final int a() {
        return this.f2756a;
    }

    public final String b() {
        int i;
        String strA = !TextUtils.isEmpty(this.c) ? this.c : "";
        if (TextUtils.isEmpty(strA) && (i = this.f2756a) != -1) {
            strA = a.a(i);
        }
        Throwable th = this.d;
        if (th == null) {
            return strA;
        }
        String message = th.getMessage();
        if (TextUtils.isEmpty(message)) {
            return strA;
        }
        return strA + " # " + message;
    }

    public final void a(String str) {
        this.c = str;
    }

    public final void a(Throwable th) {
        this.d = th;
    }

    public final CampaignEx c() {
        return this.e;
    }

    public final void a(CampaignEx campaignEx) {
        this.e = campaignEx;
    }

    public final MBridgeIds d() {
        if (this.f == null) {
            this.f = new MBridgeIds();
        }
        return this.f;
    }

    public final void a(MBridgeIds mBridgeIds) {
        this.f = mBridgeIds;
    }

    public final boolean e() {
        return this.i;
    }

    public final void a(boolean z) {
        this.i = z;
    }

    public final int f() {
        return this.b;
    }

    public final void a(int i) {
        this.b = i;
    }

    public final void a(Object obj, Object obj2) {
        if (this.l == null) {
            this.l = new HashMap<>();
        }
        this.l.put(obj, obj2);
    }

    public final Object a(Object obj) {
        HashMap<Object, Object> map = this.l;
        if (map != null && map.containsKey(obj)) {
            return this.l.get(obj);
        }
        return null;
    }

    public final int g() {
        return this.j;
    }

    public final void b(int i) {
        this.j = i;
    }

    public final String h() {
        return this.k;
    }

    public final void b(String str) {
        this.k = str;
    }

    public final int i() {
        return this.m;
    }

    public final String j() {
        return this.n;
    }

    public final void c(String str) {
        this.n = str;
    }

    public final String k() {
        return this.o;
    }

    public final void d(String str) {
        this.o = str;
    }

    public final String l() {
        return this.p;
    }

    public final void e(String str) {
        this.p = str;
    }

    public final boolean m() {
        return this.q;
    }

    public final void b(boolean z) {
        this.q = z;
    }

    public final String toString() {
        return "MBFailureReason{errorCode=" + this.f2756a + ", errorSubType=" + this.b + ", message='" + this.c + "', cause=" + this.d + ", campaign=" + this.e + ", ids=" + this.f + ", requestId='" + this.g + "', localRequestId='" + this.h + "', isHeaderBidding=" + this.i + ", typeD=" + this.j + ", reasonD='" + this.k + "', extraMap=" + this.l + ", serverErrorCode=" + this.m + ", errorUrl='" + this.n + "', serverErrorResponse='" + this.o + '\'' + AbstractJsonLexerKt.END_OBJ;
    }
}
