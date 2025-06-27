package com.applovin.impl;

import android.net.Uri;
import android.text.TextUtils;
import com.applovin.impl.j5;
import com.applovin.impl.ma;
import com.applovin.impl.x7;
import java.io.Closeable;
import java.io.InputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes.dex */
public final class na implements ld {

    /* renamed from: a, reason: collision with root package name */
    private final ma.b f715a;
    private final String b;
    private final boolean c;
    private final Map d;

    public na(String str, boolean z, ma.b bVar) {
        a1.a((z && TextUtils.isEmpty(str)) ? false : true);
        this.f715a = bVar;
        this.b = str;
        this.c = z;
        this.d = new HashMap();
    }

    @Override // com.applovin.impl.ld
    public byte[] a(UUID uuid, x7.a aVar) throws md {
        String str;
        String strB = aVar.b();
        if (this.c || TextUtils.isEmpty(strB)) {
            strB = this.b;
        }
        if (!TextUtils.isEmpty(strB)) {
            HashMap map = new HashMap();
            UUID uuid2 = r2.e;
            if (uuid2.equals(uuid)) {
                str = "text/xml";
            } else {
                str = r2.c.equals(uuid) ? com.json.m4.K : "application/octet-stream";
            }
            map.put("Content-Type", str);
            if (uuid2.equals(uuid)) {
                map.put("SOAPAction", "http://schemas.microsoft.com/DRM/2007/03/protocols/AcquireLicense");
            }
            synchronized (this.d) {
                map.putAll(this.d);
            }
            return a(this.f715a, strB, aVar.a(), map);
        }
        j5.b bVar = new j5.b();
        Uri uri = Uri.EMPTY;
        throw new md(bVar.a(uri).a(), uri, cb.h(), 0L, new IllegalStateException("No license URL"));
    }

    @Override // com.applovin.impl.ld
    public byte[] a(UUID uuid, x7.d dVar) {
        return a(this.f715a, dVar.b() + "&signedRequest=" + yp.a(dVar.a()), null, Collections.emptyMap());
    }

    private static String a(ma.e eVar, int i) {
        Map map;
        List list;
        int i2 = eVar.d;
        if ((i2 != 307 && i2 != 308) || i >= 5 || (map = eVar.g) == null || (list = (List) map.get("Location")) == null || list.isEmpty()) {
            return null;
        }
        return (String) list.get(0);
    }

    public void a(String str, String str2) {
        a1.a((Object) str);
        a1.a((Object) str2);
        synchronized (this.d) {
            this.d.put(str, str2);
        }
    }

    private static byte[] a(ma.b bVar, String str, byte[] bArr, Map map) throws md {
        cl clVar = new cl(bVar.a());
        j5 j5VarA = new j5.b().b(str).a(map).b(2).a(bArr).a(1).a();
        int i = 0;
        j5 j5VarA2 = j5VarA;
        while (true) {
            try {
                i5 i5Var = new i5(clVar, j5VarA2);
                try {
                    return yp.a((InputStream) i5Var);
                } catch (ma.e e) {
                    String strA = a(e, i);
                    if (strA != null) {
                        i++;
                        j5VarA2 = j5VarA2.a().b(strA).a();
                    } else {
                        throw e;
                    }
                } finally {
                    yp.a((Closeable) i5Var);
                }
            } catch (Exception e2) {
                throw new md(j5VarA, (Uri) a1.a(clVar.h()), clVar.e(), clVar.g(), e2);
            }
        }
    }
}
