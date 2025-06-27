package com.mbridge.msdk.e.a;

import android.net.Uri;
import android.text.TextUtils;
import com.mbridge.msdk.e.a.aa;
import com.mbridge.msdk.e.a.b;
import com.mbridge.msdk.e.a.r;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Collections;
import java.util.Map;
import kotlin.text.Typography;

/* compiled from: Request.java */
/* loaded from: classes4.dex */
public abstract class p<T> implements Comparable<p<T>> {

    /* renamed from: a, reason: collision with root package name */
    private d f2710a;
    private String b;
    private s c;
    private final aa.a d;
    private int e;
    private final String f;
    private final int g;
    private final int h;
    private final Object i;
    private r.a j;
    private Integer k;
    private q l;
    private boolean m;
    private boolean n;
    private boolean o;
    private boolean p;
    private boolean q;
    private v r;
    private b.a s;
    private a t;

    /* compiled from: Request.java */
    interface a {
        void a(p<?> pVar);

        void a(p<?> pVar, r<?> rVar);
    }

    /* compiled from: Request.java */
    public enum b {
        LOW,
        NORMAL,
        HIGH,
        IMMEDIATE
    }

    protected abstract r<T> a(m mVar);

    protected Map<String, String> a() {
        return null;
    }

    protected abstract void a(T t);

    @Override // java.lang.Comparable
    public /* synthetic */ int compareTo(Object obj) {
        p pVar = (p) obj;
        b bVarE = e();
        b bVarE2 = pVar.e();
        return bVarE == bVarE2 ? this.k.intValue() - pVar.k.intValue() : bVarE2.ordinal() - bVarE.ordinal();
    }

    public p(int i, String str) {
        this(i, str, 0);
    }

    public p(int i, String str, int i2) {
        Uri uri;
        String host;
        this.d = null;
        this.i = new Object();
        int iHashCode = 0;
        this.m = false;
        this.n = false;
        this.o = false;
        this.p = false;
        this.q = false;
        this.s = null;
        this.e = i;
        this.f = str;
        this.g = i2;
        this.r = new f();
        if (!TextUtils.isEmpty(str) && (uri = Uri.parse(str)) != null && (host = uri.getHost()) != null) {
            iHashCode = host.hashCode();
        }
        this.h = iHashCode;
    }

    public final void a(r.a aVar) {
        this.j = aVar;
    }

    public final int f() {
        return this.g;
    }

    public final int g() {
        return this.e;
    }

    public final void a(int i) {
        this.e = i;
    }

    public final int h() {
        return this.h;
    }

    final void c(String str) {
        q qVar = this.l;
        if (qVar != null) {
            qVar.b(this);
        }
    }

    final void b(int i) {
        q qVar = this.l;
        if (qVar != null) {
            qVar.a(this, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final p<?> a(q qVar) {
        this.l = qVar;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final p<?> c(int i) {
        this.k = Integer.valueOf(i);
        return this;
    }

    public final String i() {
        return this.f;
    }

    public final String j() {
        if (!TextUtils.isEmpty(this.b)) {
            return this.b;
        }
        if (this.f2710a == null) {
            this.f2710a = new com.mbridge.msdk.e.a.a.d();
        }
        String strA = this.f2710a.a(this);
        this.b = strA;
        return strA;
    }

    public final s k() {
        return this.c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final p<?> a(b.a aVar) {
        this.s = aVar;
        return this;
    }

    public final b.a l() {
        return this.s;
    }

    public void c() {
        synchronized (this.i) {
            this.n = true;
            this.j = null;
        }
    }

    public final boolean m() {
        boolean z;
        synchronized (this.i) {
            z = this.n;
        }
        return z;
    }

    public Map<String, String> d() {
        return Collections.emptyMap();
    }

    public final String n() {
        return "application/x-www-form-urlencoded; charset=" + C.UTF8_NAME;
    }

    public final byte[] o() {
        Map<String, String> mapA = a();
        if (mapA == null || mapA.size() <= 0) {
            return null;
        }
        return a(mapA, C.UTF8_NAME);
    }

    private byte[] a(Map<String, String> map, String str) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        try {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                i++;
                if (entry.getKey() != null) {
                    sb.append(URLEncoder.encode(entry.getKey(), str));
                    sb.append('=');
                    sb.append(URLEncoder.encode(entry.getValue() == null ? "" : entry.getValue(), str));
                    if (i <= map.size() - 1) {
                        sb.append(Typography.amp);
                    }
                }
            }
            return sb.toString().getBytes(str);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("Encoding not supported: " + str, e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final p<?> a(boolean z) {
        this.m = z;
        return this;
    }

    public final boolean p() {
        return this.m;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final p<?> b(boolean z) {
        this.p = z;
        return this;
    }

    public final boolean q() {
        return this.p;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final p<?> c(boolean z) {
        this.q = z;
        return this;
    }

    public final boolean r() {
        return this.q;
    }

    public b e() {
        return b.NORMAL;
    }

    public final int s() {
        return b().a();
    }

    public v b() {
        return this.r;
    }

    public final void t() {
        synchronized (this.i) {
            this.o = true;
        }
    }

    public final boolean u() {
        boolean z;
        synchronized (this.i) {
            z = this.o;
        }
        return z;
    }

    public final void b(z zVar) {
        r.a aVar;
        synchronized (this.i) {
            aVar = this.j;
        }
        if (aVar != null) {
            aVar.a(zVar);
        }
    }

    final void a(a aVar) {
        synchronized (this.i) {
            this.t = aVar;
        }
    }

    final void a(r<?> rVar) {
        a aVar;
        synchronized (this.i) {
            aVar = this.t;
        }
        if (aVar != null) {
            aVar.a(this, rVar);
        }
    }

    final void v() {
        a aVar;
        synchronized (this.i) {
            aVar = this.t;
        }
        if (aVar != null) {
            aVar.a(this);
        }
    }

    public String toString() {
        String str = "0x" + Integer.toHexString(this.h);
        StringBuilder sb = new StringBuilder();
        sb.append(m() ? "[X] " : "[ ] ");
        sb.append(this.f);
        sb.append(" ");
        sb.append(str);
        sb.append(" ");
        sb.append(e());
        sb.append(" ");
        sb.append(this.k);
        return sb.toString();
    }
}
