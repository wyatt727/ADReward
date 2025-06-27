package com.mbridge.msdk.foundation.same.net;

import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.zip.GZIPInputStream;

/* compiled from: Request.java */
/* loaded from: classes4.dex */
public abstract class i<T> implements Comparable<i<T>> {
    private static final String c = "i";

    /* renamed from: a, reason: collision with root package name */
    protected ConcurrentHashMap<String, String> f2897a;
    protected e<T> b;
    private final int d;
    private final String e;
    private final boolean f;
    private boolean g;
    private j h;
    private l i;
    private Integer j;
    private int k;

    protected abstract k<T> a(com.mbridge.msdk.foundation.same.net.f.c cVar);

    public byte[] h() {
        return null;
    }

    @Override // java.lang.Comparable
    public /* synthetic */ int compareTo(Object obj) {
        i iVar = (i) obj;
        int iB = b();
        int iB2 = iVar.b();
        return iB == iB2 ? this.j.intValue() - iVar.j.intValue() : iB2 - iB;
    }

    public i(int i, String str, e<T> eVar) {
        this.f2897a = new ConcurrentHashMap<>();
        this.b = null;
        this.g = false;
        this.k = 2;
        this.e = str;
        this.d = i;
        this.b = eVar;
        this.f = false;
        this.i = new b();
    }

    public i(int i, String str, e<T> eVar, boolean z) {
        this.f2897a = new ConcurrentHashMap<>();
        this.b = null;
        this.g = false;
        this.k = 2;
        this.e = str;
        this.d = i;
        this.b = eVar;
        this.f = z;
        this.i = new b();
    }

    public i(int i, String str) {
        this.f2897a = new ConcurrentHashMap<>();
        this.b = null;
        this.g = false;
        this.k = 2;
        this.e = str;
        this.d = i;
        this.f = false;
        this.i = new b();
    }

    public final void a() {
        this.g = true;
    }

    public int b() {
        return this.k;
    }

    public final void a(int i) {
        if (i < 1 || i > 4) {
            return;
        }
        this.k = i;
    }

    public final void c() {
        e<T> eVar = this.b;
        if (eVar != null) {
            eVar.onCancel();
        }
    }

    public final void a(long j, long j2) {
        e<T> eVar = this.b;
        if (eVar != null) {
            eVar.onProgressChange(j, j2);
        }
    }

    public final void a(com.mbridge.msdk.foundation.same.net.b.a aVar) {
        e<T> eVar = this.b;
        if (eVar != null) {
            eVar.onError(aVar);
        }
    }

    public final void d() {
        e<T> eVar = this.b;
        if (eVar != null) {
            eVar.onFinish();
        }
    }

    public final void e() {
        e<T> eVar = this.b;
        if (eVar != null) {
            eVar.onNetworking();
        }
    }

    public final void f() {
        e<T> eVar = this.b;
        if (eVar != null) {
            eVar.onPreExecute();
        }
    }

    public final void g() {
        e<T> eVar = this.b;
        if (eVar != null) {
            eVar.onRetry();
        }
    }

    public final void a(k<T> kVar) {
        e<T> eVar = this.b;
        if (eVar != null) {
            eVar.onSuccess(kVar);
        }
    }

    public final void a(String str) {
        j jVar = this.h;
        if (jVar != null) {
            jVar.b(this);
        }
    }

    public final int i() {
        try {
            return this.i.f();
        } catch (Exception unused) {
            return 0;
        }
    }

    public final int j() {
        try {
            return this.i.c();
        } catch (Exception unused) {
            return 10;
        }
    }

    public final Map<String, String> k() {
        return this.f2897a;
    }

    public final int l() {
        return this.d;
    }

    public final int m() {
        try {
            return this.i.d();
        } catch (Exception unused) {
            return 10;
        }
    }

    public final l n() {
        return this.i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final i<?> a(l lVar) {
        this.i = lVar;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final i<?> b(int i) {
        this.j = Integer.valueOf(i);
        return this;
    }

    public final int o() {
        try {
            return this.i.a();
        } catch (Exception unused) {
            return 10;
        }
    }

    public final int p() {
        try {
            return this.i.e();
        } catch (Exception unused) {
            return 10;
        }
    }

    public byte[] a(com.mbridge.msdk.foundation.same.net.f.b bVar, c cVar) throws com.mbridge.msdk.foundation.same.net.b.a, IOException {
        return bVar.a() != null ? a(bVar) : new byte[0];
    }

    private byte[] a(com.mbridge.msdk.foundation.same.net.f.b bVar) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream;
        InputStream inputStream;
        InputStream inputStream2 = null;
        try {
            InputStream inputStreamA = bVar.a();
            try {
                if (com.mbridge.msdk.foundation.same.net.g.b.b(bVar.b()) && !(inputStreamA instanceof GZIPInputStream)) {
                    inputStreamA = new GZIPInputStream(inputStreamA);
                }
                if (inputStreamA == null) {
                    throw new com.mbridge.msdk.foundation.same.net.b.a(7, null);
                }
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int i = inputStreamA.read(bArr);
                        if (i == -1) {
                            break;
                        }
                        byteArrayOutputStream2.write(bArr, 0, i);
                    }
                    byte[] byteArray = byteArrayOutputStream2.toByteArray();
                    if (inputStreamA != null) {
                        try {
                            inputStreamA.close();
                        } catch (IOException e) {
                            ad.b(c, e.getMessage());
                        }
                    }
                    byteArrayOutputStream2.close();
                    return byteArray;
                } catch (Throwable th) {
                    inputStream = inputStreamA;
                    byteArrayOutputStream = byteArrayOutputStream2;
                    th = th;
                    inputStream2 = inputStream;
                    if (inputStream2 != null) {
                        try {
                            inputStream2.close();
                        } catch (IOException e2) {
                            ad.b(c, e2.getMessage());
                            throw th;
                        }
                    }
                    if (byteArrayOutputStream != null) {
                        byteArrayOutputStream.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                inputStream = inputStreamA;
                byteArrayOutputStream = null;
            }
        } catch (Throwable th3) {
            th = th3;
            byteArrayOutputStream = null;
        }
    }

    public final boolean q() {
        return this.g;
    }

    public final void r() {
        a("Charset", C.UTF8_NAME);
        if (this.f) {
            a("Connection", "keep-alive");
        } else {
            a("Connection", "close");
        }
    }

    public final void a(e<T> eVar) {
        this.b = eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final i<?> a(j jVar) {
        this.h = jVar;
        return this;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.g ? "[X] " : "[ ] ");
        sb.append(this.e);
        sb.append(" ");
        sb.append(b());
        sb.append(" ");
        sb.append(this.j);
        return sb.toString();
    }

    public final String s() {
        return this.e;
    }

    public final void a(String str, String str2) {
        this.f2897a.remove(str);
        this.f2897a.put(str, str2);
    }
}
