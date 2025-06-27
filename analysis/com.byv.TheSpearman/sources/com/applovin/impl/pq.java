package com.applovin.impl;

import android.net.Uri;
import android.webkit.URLUtil;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.Locale;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes.dex */
public class pq {

    /* renamed from: a, reason: collision with root package name */
    private Uri f791a;
    private Uri b;
    private a c;
    private String d;
    private int e;
    private int f;
    private long g;

    public enum a {
        Progressive,
        Streaming
    }

    private pq() {
    }

    public String toString() {
        return "VastVideoFile{sourceVideoUri=" + this.f791a + ", videoUri=" + this.b + ", deliveryType=" + this.c + ", fileType='" + this.d + "', width=" + this.e + ", height=" + this.f + ", bitrate=" + this.g + AbstractJsonLexerKt.END_OBJ;
    }

    public static pq a(fs fsVar, com.applovin.impl.sdk.k kVar) {
        if (fsVar == null) {
            throw new IllegalArgumentException("No node specified.");
        }
        if (kVar != null) {
            try {
                String strD = fsVar.d();
                if (URLUtil.isValidUrl(strD)) {
                    Uri uri = Uri.parse(strD);
                    pq pqVar = new pq();
                    pqVar.f791a = uri;
                    pqVar.b = uri;
                    pqVar.g = a(fsVar);
                    pqVar.c = a((String) fsVar.a().get("delivery"));
                    pqVar.f = StringUtils.parseInt((String) fsVar.a().get("height"));
                    pqVar.e = StringUtils.parseInt((String) fsVar.a().get("width"));
                    pqVar.d = ((String) fsVar.a().get("type")).toLowerCase(Locale.ENGLISH);
                    return pqVar;
                }
                kVar.L();
                if (!com.applovin.impl.sdk.t.a()) {
                    return null;
                }
                kVar.L().b("VastVideoFile", "Unable to create video file. Could not find URL.");
                return null;
            } catch (Throwable th) {
                kVar.L();
                if (com.applovin.impl.sdk.t.a()) {
                    kVar.L().a("VastVideoFile", "Error occurred while initializing", th);
                }
                kVar.B().a("VastVideoFile", th);
                return null;
            }
        }
        throw new IllegalArgumentException("No sdk specified.");
    }

    public Uri c() {
        return this.f791a;
    }

    public Uri d() {
        return this.b;
    }

    public String b() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pq)) {
            return false;
        }
        pq pqVar = (pq) obj;
        if (this.e != pqVar.e || this.f != pqVar.f || this.g != pqVar.g) {
            return false;
        }
        Uri uri = this.f791a;
        if (uri == null ? pqVar.f791a != null : !uri.equals(pqVar.f791a)) {
            return false;
        }
        Uri uri2 = this.b;
        if (uri2 == null ? pqVar.b != null : !uri2.equals(pqVar.b)) {
            return false;
        }
        if (this.c != pqVar.c) {
            return false;
        }
        String str = this.d;
        String str2 = pqVar.d;
        return str != null ? str.equals(str2) : str2 == null;
    }

    public int hashCode() {
        Uri uri = this.f791a;
        int iHashCode = (uri != null ? uri.hashCode() : 0) * 31;
        Uri uri2 = this.b;
        int iHashCode2 = (iHashCode + (uri2 != null ? uri2.hashCode() : 0)) * 31;
        a aVar = this.c;
        int iHashCode3 = (iHashCode2 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        String str = this.d;
        return ((((((iHashCode3 + (str != null ? str.hashCode() : 0)) * 31) + this.e) * 31) + this.f) * 31) + Long.valueOf(this.g).hashCode();
    }

    public long a() {
        return this.g;
    }

    private static long a(fs fsVar) {
        Map mapA = fsVar.a();
        long j = StringUtils.parseLong((String) mapA.get("bitrate"), 0L);
        return j != 0 ? j : (StringUtils.parseLong((String) mapA.get("minBitrate"), 0L) + StringUtils.parseLong((String) mapA.get("maxBitrate"), 0L)) / 2;
    }

    private static a a(String str) {
        if (StringUtils.isValidString(str)) {
            if ("progressive".equalsIgnoreCase(str)) {
                return a.Progressive;
            }
            if ("streaming".equalsIgnoreCase(str)) {
                return a.Streaming;
            }
        }
        return a.Progressive;
    }

    public void a(Uri uri) {
        this.b = uri;
    }
}
