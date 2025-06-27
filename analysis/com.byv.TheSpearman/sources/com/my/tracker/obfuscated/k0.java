package com.my.tracker.obfuscated;

import android.content.Context;
import android.text.TextUtils;
import com.my.tracker.MyTracker;
import com.my.tracker.ads.AdEvent;
import com.my.tracker.miniapps.MiniAppEvent;
import com.my.tracker.obfuscated.i0;
import com.my.tracker.obfuscated.q0;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class k0 {
    static final DecimalFormat n;

    /* renamed from: a, reason: collision with root package name */
    final Context f4237a;
    final i0 b;
    final a1 c;
    final q d;
    final int e;
    final int f;
    final int g;
    final int h;
    ByteArrayOutputStream i = new ByteArrayOutputStream(65536);
    ByteArrayOutputStream j = new ByteArrayOutputStream(16384);
    ByteArrayOutputStream k = new ByteArrayOutputStream(4096);
    long l;
    long m;

    static {
        DecimalFormat decimalFormat = new DecimalFormat("0.0#####");
        n = decimalFormat;
        decimalFormat.setDecimalFormatSymbols(DecimalFormatSymbols.getInstance(Locale.ROOT));
    }

    private k0(i0 i0Var, a1 a1Var, int i, int i2, int i3, int i4, Context context) {
        this.f4237a = context.getApplicationContext();
        this.d = q.a(a1Var);
        this.b = i0Var;
        this.c = a1Var;
        this.e = i;
        this.f = i2;
        this.g = i3;
        this.h = i4;
        Long lB = i0Var.b("timestamp_base");
        this.l = lB == null ? 0L : lB.longValue();
        this.m = i0Var.k();
    }

    static int a(i0 i0Var, ByteArrayOutputStream byteArrayOutputStream, ByteArrayOutputStream byteArrayOutputStream2, OutputStream outputStream) {
        i0.f fVarA;
        i0.g gVarG;
        i0.g gVar = null;
        int i = 0;
        try {
            fVarA = i0Var.a("default_session");
            while (fVarA.a()) {
                try {
                    byteArrayOutputStream.reset();
                    long jB = fVarA.b();
                    String strC = fVarA.c();
                    try {
                        gVarG = i0Var.g(jB);
                        while (gVarG.a()) {
                            try {
                                byteArrayOutputStream2.reset();
                                u0.a(1, gVarG.c(), (OutputStream) byteArrayOutputStream2);
                                if (!gVarG.d()) {
                                    u0.a(2, gVarG.b(), (OutputStream) byteArrayOutputStream2);
                                }
                                u0.a(1, byteArrayOutputStream2, byteArrayOutputStream);
                            } catch (Throwable th) {
                                th = th;
                                throw th;
                            }
                        }
                        try {
                            gVarG.close();
                            if (byteArrayOutputStream.size() != 0) {
                                long jE = fVarA.e();
                                if (jE > 0) {
                                    u0.a(2, jE, (OutputStream) byteArrayOutputStream);
                                }
                                u0.a(42, byteArrayOutputStream, outputStream);
                                i++;
                            }
                        } catch (Throwable th2) {
                            z0.b("MyTrackerRepository error: failed to read session " + strC + ": ", th2);
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        gVarG = null;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    gVar = fVarA;
                    try {
                        z0.b("MyTrackerRepository error: failed to read sessions: ", th);
                        if (gVar != null) {
                            fVarA = gVar;
                            fVarA.close();
                        }
                        z0.a("MyTrackerRepository: " + i + " sessions are prepared to sending");
                        return i;
                    } finally {
                        if (gVar != null) {
                            gVar.close();
                        }
                    }
                }
            }
        } catch (Throwable th5) {
            th = th5;
        }
        fVarA.close();
        z0.a("MyTrackerRepository: " + i + " sessions are prepared to sending");
        return i;
    }

    static int a(i0 i0Var, ByteArrayOutputStream byteArrayOutputStream, OutputStream outputStream) {
        i0.c cVarH;
        int i;
        i0.d dVarD;
        int i2;
        i0.d dVar = null;
        int i3 = 0;
        try {
            cVarH = i0Var.h();
            i = 0;
            while (cVarH.a()) {
                try {
                    byteArrayOutputStream.reset();
                    int iE = (int) cVarH.e();
                    long jC = cVarH.c();
                    byte[] bArrB = cVarH.b();
                    try {
                        dVarD = i0Var.d(jC);
                        int i4 = 0;
                        while (dVarD.a()) {
                            try {
                                u0.a(2, dVarD.b(), (OutputStream) byteArrayOutputStream);
                                i4++;
                            } catch (Throwable th) {
                                th = th;
                                throw th;
                            }
                        }
                        if (i4 == 0) {
                            z0.b("MyTrackerRepository error: no timestamps for event " + iE + ", event ignored");
                            try {
                                dVarD.close();
                            } catch (Throwable th2) {
                                z0.b("MyTrackerRepository error: failed to read event " + iE, th2);
                            }
                        } else {
                            dVarD.close();
                            u0.b(1, iE, byteArrayOutputStream);
                            long jD = cVarH.d();
                            if (jD > 0) {
                                u0.a(3, jD, (OutputStream) byteArrayOutputStream);
                            }
                            if (bArrB.length > 0) {
                                switch (iE) {
                                    case 1:
                                        i2 = 12;
                                        break;
                                    case 2:
                                        i2 = 13;
                                        break;
                                    case 3:
                                        i2 = 11;
                                        break;
                                    case 4:
                                    case 11:
                                    case 12:
                                    case 16:
                                    case 30:
                                    default:
                                        z0.b("MyTrackerRepository error: unrecognized eventType " + iE);
                                        continue;
                                    case 5:
                                        i2 = 17;
                                        break;
                                    case 6:
                                        i2 = 22;
                                        break;
                                    case 7:
                                        i2 = 18;
                                        break;
                                    case 8:
                                        i2 = 19;
                                        break;
                                    case 9:
                                        i2 = 20;
                                        break;
                                    case 10:
                                        i2 = 23;
                                        break;
                                    case 13:
                                        i2 = 21;
                                        break;
                                    case 14:
                                        i2 = 14;
                                        break;
                                    case 15:
                                        i2 = 16;
                                        break;
                                    case 17:
                                        i2 = 25;
                                        break;
                                    case 18:
                                        i2 = 26;
                                        break;
                                    case 19:
                                        i2 = 27;
                                        break;
                                    case 20:
                                        i2 = 28;
                                        break;
                                    case 21:
                                        i2 = 29;
                                        break;
                                    case 22:
                                        i2 = 30;
                                        break;
                                    case 23:
                                        i2 = 31;
                                        break;
                                    case 24:
                                        i2 = 32;
                                        break;
                                    case 25:
                                        i2 = 33;
                                        break;
                                    case 26:
                                        i2 = 34;
                                        break;
                                    case 27:
                                        i2 = 35;
                                        break;
                                    case 28:
                                        i2 = 36;
                                        break;
                                    case 29:
                                        i2 = 37;
                                        break;
                                    case 31:
                                        i2 = 39;
                                        break;
                                    case 32:
                                        i2 = 40;
                                        break;
                                    case 33:
                                        i2 = 41;
                                        break;
                                }
                                u0.a(i2, bArrB, byteArrayOutputStream);
                            }
                            u0.a(41, byteArrayOutputStream, outputStream);
                            i++;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        dVarD = null;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    dVar = cVarH;
                    i3 = i;
                    try {
                        z0.b("MyTrackerRepository error: failed to read events: ", th);
                        if (dVar != null) {
                            cVarH = dVar;
                            i = i3;
                            cVarH.close();
                            i3 = i;
                        }
                        z0.a("MyTrackerRepository: " + i3 + " events are prepared to sending");
                        return i3;
                    } finally {
                        if (dVar != null) {
                            dVar.close();
                        }
                    }
                }
            }
        } catch (Throwable th5) {
            th = th5;
        }
        cVarH.close();
        i3 = i;
        z0.a("MyTrackerRepository: " + i3 + " events are prepared to sending");
        return i3;
    }

    static k0 a(a1 a1Var, int i, int i2, int i3, int i4, Context context) {
        i0 i0VarA = i0.a(a1Var.g(), context);
        if (i0VarA == null) {
            z0.b("MyTrackerRepository error: database is null");
            return null;
        }
        try {
            return new k0(i0VarA, a1Var, i, i2, i3, i4, context);
        } catch (Throwable th) {
            z0.b("MyTrackerRepository error: failed to create MyTrackerRepository instance", th);
            return null;
        }
    }

    public static k0 a(a1 a1Var, Context context) {
        return a(a1Var, 1000, 500, 500, 100, context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a3 A[Catch: all -> 0x0129, TryCatch #3 {all -> 0x0129, blocks: (B:6:0x0015, B:8:0x0046, B:10:0x004f, B:16:0x006b, B:18:0x00a3, B:19:0x00aa, B:14:0x0065, B:12:0x0060), top: B:54:0x0015, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00c9 A[Catch: all -> 0x0126, TRY_LEAVE, TryCatch #2 {all -> 0x0126, blocks: (B:20:0x00c3, B:22:0x00c9, B:27:0x010c, B:30:0x0116, B:31:0x0119, B:32:0x011c, B:33:0x011d, B:23:0x00f7, B:25:0x0105, B:26:0x0109), top: B:53:0x00c3, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x011d A[Catch: all -> 0x0126, TRY_LEAVE, TryCatch #2 {all -> 0x0126, blocks: (B:20:0x00c3, B:22:0x00c9, B:27:0x010c, B:30:0x0116, B:31:0x0119, B:32:0x011c, B:33:0x011d, B:23:0x00f7, B:25:0x0105, B:26:0x0109), top: B:53:0x00c3, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x015f  */
    /* JADX WARN: Type inference failed for: r1v10, types: [com.my.tracker.obfuscated.z$b] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [com.my.tracker.obfuscated.z$b<java.lang.String>] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.my.tracker.obfuscated.z.b<java.lang.String> a(com.my.tracker.MyTracker.FlushListener r10) {
        /*
            Method dump skipped, instructions count: 359
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.my.tracker.obfuscated.k0.a(com.my.tracker.MyTracker$FlushListener):com.my.tracker.obfuscated.z$b");
    }

    public List<d> a() {
        ArrayList arrayList = new ArrayList();
        i0.b bVarG = null;
        try {
            bVarG = this.b.g();
            while (bVarG.a()) {
                d dVarA = d.a(bVarG.b(), bVarG.d(), bVarG.e(), bVarG.f(), bVarG.g());
                if (dVarA != null) {
                    arrayList.add(dVarA.a(bVarG.c()));
                }
            }
        } catch (Throwable th) {
            try {
                z0.b("MyTrackerRepository error: error while reading purchases", th);
            } finally {
                if (bVarG != null) {
                    bVarG.close();
                }
            }
        }
        return arrayList;
    }

    public void a(d dVar) {
        String string = dVar.e().toString();
        String strA = dVar.a();
        String strF = dVar.f();
        int iG = dVar.g();
        try {
            if (this.b.f() >= this.h) {
                z0.a("MyTrackerRepository: max count of raw purchases is reached");
                z0.a("MyTrackerRepository: appgalleery raw purchase with data: " + string + ", signature " + strA + " isn't inserted");
                return;
            }
            long jA = this.b.a(string, strA, strF, iG, dVar.h());
            if (jA >= 0) {
                z0.a("MyTrackerRepository: appgallery raw purchase was inserted; id: " + jA + ", data: " + string + ", signature: " + strA);
                dVar.a(jA);
            }
        } catch (Throwable th) {
            z0.b("MyTrackerRepository error: can't insert appgallery raw purchase with data: " + string + ", signature " + strA, th);
        }
    }

    public void a(v vVar) {
        String string = vVar.d().toString();
        String strA = vVar.a();
        try {
            if (this.b.i() >= this.h) {
                z0.a("MyTrackerRepository: max count of raw purchases is reached");
                z0.a("MyTrackerRepository: raw purchase with data: " + string + ", signature " + strA + " isn't inserted");
                return;
            }
            long jA = this.b.a(string, strA, vVar.f());
            if (jA >= 0) {
                z0.a("MyTrackerRepository: raw purchase was inserted; id: " + jA + ", data: " + string + ", signature: " + strA);
                vVar.a(jA);
            }
        } catch (Throwable th) {
            z0.b("MyTrackerRepository error: can't insert raw purchase with data: " + string + ", signature " + strA, th);
        }
    }

    boolean a(int i, String str, String str2, Map<String, String> map, long j) {
        try {
            this.i.reset();
            for (int i2 : t0.g) {
                if (i2 == 1) {
                    e0.a(i2, map, this.j, this.i);
                } else if (i2 == 2) {
                    u0.a(i2, str, this.i);
                } else if (i2 == 3) {
                    u0.a(i2, str2, this.i);
                }
            }
            return a(i, this.i.toByteArray(), j);
        } catch (Throwable th) {
            z0.b("MyTrackerRepository error: event serialization failed, type: " + i, th);
            return false;
        }
    }

    public boolean a(int i, Map<String, String> map, long j) {
        try {
            this.i.reset();
            for (int i2 : t0.b) {
                if (i2 == 1) {
                    e0.a(i2, map, this.j, this.i);
                } else if (i2 == 2) {
                    u0.b(i2, i, this.i);
                }
            }
            return a(13, this.i.toByteArray(), j);
        } catch (Throwable th) {
            z0.b("MyTrackerRepository error: event serialization failed, type: 13", th);
            return false;
        }
    }

    boolean a(int i, byte[] bArr, long j) {
        try {
            return a(i, bArr, false, true, j);
        } catch (Throwable th) {
            z0.b("MyTrackerRepository error: event serialization failed, type: " + i, th);
            return false;
        }
    }

    public boolean a(int i, byte[] bArr, boolean z, boolean z2, long j) {
        long jD;
        try {
            long jA = i0.x;
            if (z2) {
                i0.c cVarB = null;
                try {
                    cVarB = this.b.b(i, bArr);
                    if (cVarB.a()) {
                        jA = cVarB.c();
                        jD = cVarB.d();
                    } else {
                        jD = 0;
                    }
                    cVarB.close();
                } catch (Throwable th) {
                    if (cVarB != null) {
                        cVarB.close();
                    }
                    throw th;
                }
            } else {
                jD = 0;
            }
            if (jA == i0.x) {
                z0.a("MyTrackerRepository: insert " + i + " event");
                jA = this.b.a(i, bArr, z);
                if (jA != i0.x && z) {
                    this.m++;
                }
            } else {
                z0.a("MyTrackerRepository: aggregate " + i + " event");
            }
            if (jA == i0.x) {
                z0.b("MyTrackerRepository error: event insertion failed, type: " + i);
                return false;
            }
            if (this.l == 0) {
                b(j);
            }
            this.b.c(jA, j - this.l);
            long jC = this.b.c(jA);
            z0.a("MyTrackerRepository: event timestamps count: " + jC);
            long j2 = (long) this.e;
            if (jC <= j2) {
                return true;
            }
            long jA2 = this.b.a(jA, jC - j2);
            this.b.d(jA, jD + jA2);
            z0.a("MyTrackerRepository: maximum count of event timestamps is exceeded, remove oldest timestamps, count: " + jA2);
            return true;
        } catch (Throwable th2) {
            z0.b("MyTrackerRepository error: event insertion failed, type: " + i, th2);
            return false;
        }
    }

    public boolean a(long j) {
        return a(3, new byte[0], j);
    }

    public boolean a(long j, long j2) {
        try {
            this.i.reset();
            for (int i : t0.s) {
                if (i == 2) {
                    u0.a(i, j, (OutputStream) this.i);
                }
            }
            return a(25, this.i.toByteArray(), false, true, j2);
        } catch (Throwable th) {
            z0.b("MyTrackerRepository error: event serialization failed, type: 25", th);
            return false;
        }
    }

    public boolean a(long j, long j2, long j3, long j4) {
        try {
            this.i.reset();
            for (int i : t0.u) {
                if (i == 2) {
                    u0.a(i, j, (OutputStream) this.i);
                } else if (i == 3) {
                    u0.a(i, j2, (OutputStream) this.i);
                } else if (i == 4) {
                    u0.a(i, j3, (OutputStream) this.i);
                }
            }
            return a(27, this.i.toByteArray(), false, true, j4);
        } catch (Throwable th) {
            z0.b("MyTrackerRepository error: event serialization failed, type: 27", th);
            return false;
        }
    }

    public boolean a(long j, String str, q0.a aVar, long j2) {
        String str2;
        try {
            this.i.reset();
            for (int i : t0.c) {
                if (i == 1) {
                    u0.a(i, j, (OutputStream) this.i);
                } else if (i == 2) {
                    this.j.reset();
                    for (int i2 : t0.d) {
                        if (i2 == 1) {
                            if (!TextUtils.isEmpty(str)) {
                                u0.a(i2, str, this.j);
                            }
                        } else if (i2 != 2) {
                            if (i2 != 3) {
                                if (i2 == 4 && aVar != null) {
                                    str2 = aVar.c;
                                    u0.a(i2, str2, this.j);
                                }
                            } else if (aVar != null) {
                                str2 = aVar.b;
                                u0.a(i2, str2, this.j);
                            }
                        } else if (aVar != null) {
                            u0.b(i2, aVar.f4250a, this.j);
                        }
                    }
                    if (this.j.size() > 0) {
                        u0.a(i, this.j, this.i);
                    }
                }
            }
            return a(1, this.i.toByteArray(), true, false, j2);
        } catch (Throwable th) {
            z0.b("MyTrackerRepository error: event serialization failed, type: 1", th);
            return false;
        }
    }

    public boolean a(AdEvent adEvent, long j) {
        String str;
        try {
            this.i.reset();
            for (int i : t0.m) {
                switch (i) {
                    case 1:
                        u0.b(i, adEvent.network, this.i);
                        continue;
                    case 2:
                        if (adEvent.eventType == 19) {
                            str = n.format(adEvent.revenue);
                            break;
                        }
                    case 3:
                        if (adEvent.eventType == 19) {
                            str = adEvent.currency;
                            break;
                        }
                    case 4:
                        str = adEvent.source;
                        break;
                    case 5:
                        str = adEvent.placementId;
                        break;
                    case 6:
                        str = adEvent.adId;
                        break;
                    case 7:
                        str = adEvent.adFormat;
                        break;
                    default:
                        continue;
                }
                u0.a(i, str, this.i);
            }
            return a(adEvent.eventType, this.i.toByteArray(), true, true, j);
        } catch (Throwable th) {
            z0.b("MyTrackerRepository error: event serialization failed, type: " + adEvent.eventType, th);
            return false;
        }
    }

    public boolean a(MiniAppEvent miniAppEvent, long j) {
        String str;
        int i = miniAppEvent.eventType;
        try {
            this.i.reset();
            boolean z = i == 20 || i == 21;
            for (int i2 : t0.r) {
                switch (i2) {
                    case 1:
                        if (i == 24) {
                            e0.a(i2, miniAppEvent.eventParams, this.j, this.i);
                            continue;
                        }
                    case 2:
                        str = miniAppEvent.miniAppId;
                        break;
                    case 3:
                        str = miniAppEvent.platformUserId;
                        break;
                    case 4:
                        if (i == 20) {
                            str = miniAppEvent.query;
                            break;
                        }
                    case 5:
                        if (i == 24 || i == 22 || i == 23) {
                            str = miniAppEvent.customUserId;
                            break;
                        }
                        break;
                    case 6:
                        if (i == 24) {
                            str = miniAppEvent.name;
                            break;
                        }
                    default:
                        continue;
                }
                u0.a(i2, str, this.i);
            }
            byte[] byteArray = this.i.toByteArray();
            if (i == 24) {
                long j2 = i;
                if (this.b.e(j2) >= this.f && this.b.a(j2, byteArray) == 0) {
                    z0.a("MyTrackerRepository: maximum count of mini-app custom events is exceeded, event has been skipped");
                    return false;
                }
            }
            return a(i, byteArray, z, true, j);
        } catch (Throwable th) {
            z0.b("MyTrackerRepository error: event serialization failed, type: " + i, th);
            return false;
        }
    }

    public boolean a(d dVar, Map<String, String> map) {
        String string;
        String strOptString;
        String strA;
        try {
            this.i.reset();
            JSONObject jSONObjectD = dVar.d();
            String strValueOf = null;
            if (jSONObjectD != null) {
                try {
                    string = jSONObjectD.toString();
                } catch (Throwable th) {
                    z0.a("MyTrackerRepository error: can't convert productInfo json to string", th);
                    string = null;
                }
                try {
                    strValueOf = String.valueOf(jSONObjectD.optDouble("microsPrice") / 1000000.0d);
                } catch (Throwable th2) {
                    z0.a("MyTrackerRepository error: wrong price in micros in sku details: ", th2);
                }
                strOptString = jSONObjectD.optString("currency");
            } else {
                strOptString = null;
                string = null;
            }
            for (int i : t0.p) {
                switch (i) {
                    case 1:
                        e0.a(i, map, this.j, this.i);
                    case 2:
                        try {
                            u0.a(i, dVar.e().toString(), this.i);
                        } catch (Throwable th3) {
                            z0.b("MyTrackerRepository error: can't convert purchaseData json to string", th3);
                        }
                    case 3:
                        u0.a(i, string, this.i);
                    case 4:
                        strA = dVar.a();
                        u0.a(i, strA, this.i);
                    case 5:
                        u0.a(i, strValueOf, this.i);
                    case 6:
                        u0.a(i, strOptString, this.i);
                    case 7:
                        strA = dVar.f();
                        u0.a(i, strA, this.i);
                    case 8:
                        u0.b(i, dVar.g(), this.i);
                    default:
                }
            }
            return a(32, this.i.toByteArray(), true, false, dVar.h());
        } catch (Throwable th4) {
            z0.b("MyTrackerRepository error: event serialization failed, type: 32", th4);
            return false;
        }
    }

    public boolean a(v vVar, Map<String, String> map) {
        String string;
        String strOptString;
        try {
            this.i.reset();
            JSONObject jSONObjectE = vVar.e();
            String str = null;
            if (jSONObjectE != null) {
                try {
                    string = jSONObjectE.toString();
                } catch (Throwable th) {
                    z0.a("MyTrackerRepository error: can't convert skuDetails json to string", th);
                    string = null;
                }
                try {
                    str = n.format(Double.parseDouble(jSONObjectE.optString("price_amount_micros")) / 1000000.0d);
                } catch (Throwable th2) {
                    z0.a("MyTrackerRepository error: wrong price in micros in sku details: ", th2);
                }
                strOptString = jSONObjectE.optString("price_currency_code");
            } else {
                strOptString = null;
                string = null;
            }
            for (int i : t0.o) {
                int i2 = 1;
                if (i == 1) {
                    e0.a(i, map, this.j, this.i);
                } else if (i == 2) {
                    this.j.reset();
                    int[] iArr = t0.q;
                    int length = iArr.length;
                    int i3 = 0;
                    while (i3 < length) {
                        int i4 = iArr[i3];
                        if (i4 == i2) {
                            try {
                                u0.a(i4, vVar.d().toString(), this.j);
                            } catch (Throwable th3) {
                                z0.b("MyTrackerRepository error: can't convert purchaseData json to string", th3);
                            }
                        } else if (i4 == 2) {
                            u0.a(i4, vVar.a(), this.j);
                        } else if (i4 == 3) {
                            u0.a(i4, string, this.j);
                        }
                        i3++;
                        i2 = 1;
                    }
                    if (this.j.size() > 0) {
                        u0.a(i, this.j, this.i);
                    }
                } else if (i == 4) {
                    u0.a(i, str, this.i);
                } else if (i == 5) {
                    u0.a(i, strOptString, this.i);
                }
            }
            return a(10, this.i.toByteArray(), true, false, vVar.f());
        } catch (Throwable th4) {
            z0.b("MyTrackerRepository error: event serialization failed, type: 10", th4);
            return false;
        }
    }

    public boolean a(String str, long j) {
        try {
            this.i.reset();
            for (int i : t0.k) {
                if (i == 1) {
                    u0.a(i, str, this.i);
                }
            }
            return a(33, this.i.toByteArray(), true, false, j);
        } catch (Throwable th) {
            z0.b("MyTrackerRepository error: event serialization failed, type: 33", th);
            return false;
        }
    }

    public boolean a(String str, String str2, long j) {
        try {
            this.i.reset();
            for (int i : t0.n) {
                if (i == 1) {
                    u0.a(i, str, this.i);
                } else if (i == 2 && !TextUtils.isEmpty(str2)) {
                    u0.a(i, str2, this.i);
                }
            }
            return a(15, this.i.toByteArray(), true, true, j);
        } catch (Throwable th) {
            z0.b("MyTrackerRepository error: event serialization failed, type: 15", th);
            return false;
        }
    }

    public boolean a(String str, String str2, long j, long j2, long j3) {
        try {
            this.i.reset();
            for (int i : t0.i) {
                if (i == 1) {
                    u0.a(i, str, this.i);
                } else if (i != 2) {
                    if (i == 3) {
                        u0.a(i, j2, (OutputStream) this.i);
                    } else if (i == 4) {
                        u0.a(i, j, (OutputStream) this.i);
                    }
                } else if (!TextUtils.isEmpty(str2)) {
                    u0.a(i, str2, this.i);
                }
            }
            return a(14, this.i.toByteArray(), true, false, j3);
        } catch (Throwable th) {
            z0.b("MyTrackerRepository error: event serialization failed, type: 14", th);
            return false;
        }
    }

    public boolean a(String str, String str2, String str3, String str4, String str5, long j) {
        try {
            this.i.reset();
            for (int i : t0.e) {
                if (i == 1) {
                    u0.a(i, str3, this.i);
                } else if (i == 2) {
                    u0.a(i, str4, this.i);
                } else if (i == 3) {
                    u0.a(i, str, this.i);
                } else if (i == 4) {
                    u0.a(i, str2, this.i);
                } else if (i == 5) {
                    this.j.reset();
                    for (int i2 : t0.f) {
                        if (i2 == 1 && !TextUtils.isEmpty(str5)) {
                            u0.a(i2, str5, this.j);
                        }
                    }
                    if (this.j.size() > 0) {
                        u0.a(i, this.j, this.i);
                    }
                }
            }
            return a(5, this.i.toByteArray(), true, false, j);
        } catch (Throwable th) {
            z0.b("MyTrackerRepository error: event serialization failed, type: 5", th);
            return false;
        }
    }

    public boolean a(String str, String str2, Map<String, String> map, long j) {
        return a(7, str, str2, map, j);
    }

    public boolean a(String str, Map<String, String> map, long j) {
        byte[] byteArray;
        try {
            this.i.reset();
            for (int i : t0.l) {
                if (i == 1) {
                    e0.a(i, map, this.j, this.i);
                } else if (i == 2) {
                    u0.a(i, str, this.i);
                }
            }
            byteArray = this.i.toByteArray();
        } catch (Throwable th) {
            z0.b("MyTrackerRepository error: event serialization failed, type: 6", th);
        }
        if (this.b.e(6L) >= this.f) {
            long jLongValue = 0;
            if (this.b.a(6L, byteArray) == 0) {
                z0.a("MyTrackerRepository: maximum count of custom events is exceeded, event has been skipped");
                Long lB = this.b.b("custom_events_skipped_count");
                if (lB != null) {
                    jLongValue = lB.longValue();
                }
                long j2 = jLongValue + 1;
                z0.a("MyTrackerRepository: skipped custom events count: " + j2);
                this.b.a("custom_events_skipped_count", Long.valueOf(j2));
                return false;
            }
        }
        return a(6, byteArray, false, true, j);
    }

    public boolean a(Map<String, String> map, long j) {
        try {
            this.i.reset();
            for (int i : t0.f4262a) {
                if (i == 1) {
                    e0.a(i, map, this.j, this.i);
                }
            }
            return a(9, this.i.toByteArray(), j);
        } catch (Throwable th) {
            z0.b("MyTrackerRepository error: event serialization failed, type: 9", th);
            return false;
        }
    }

    public List<v> b() {
        ArrayList arrayList = new ArrayList();
        i0.e eVarJ = null;
        try {
            eVarJ = this.b.j();
            while (eVarJ.a()) {
                v vVarA = v.a(eVarJ.b(), eVarJ.d(), eVarJ.e());
                if (vVarA != null) {
                    arrayList.add(vVarA.a(eVarJ.c()));
                }
            }
        } catch (Throwable th) {
            try {
                z0.b("MyTrackerRepository error: error while reading purchases", th);
            } finally {
                if (eVarJ != null) {
                    eVarJ.close();
                }
            }
        }
        return arrayList;
    }

    void b(long j) {
        try {
            this.b.a("timestamp_base", Long.valueOf(j));
            this.l = j;
        } catch (Throwable th) {
            z0.b("MyTrackerRepository error: ", th);
        }
    }

    void b(final MyTracker.FlushListener flushListener, final boolean z) {
        if (flushListener == null) {
            return;
        }
        g.c(new Runnable() { // from class: com.my.tracker.obfuscated.k0$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                flushListener.onResult(z);
            }
        });
    }

    public void b(d dVar) {
        Long lB = dVar.b();
        if (lB != null) {
            try {
                this.b.a(lB.longValue());
            } catch (Throwable th) {
                z0.b("MyTrackerRepository error: error while removing raw appgallery purchase with id " + lB, th);
            }
        }
    }

    public void b(v vVar) {
        Long lB = vVar.b();
        if (lB != null) {
            try {
                this.b.b(lB.longValue());
            } catch (Throwable th) {
                z0.b("MyTrackerRepository error: error while removing raw purchase with id " + lB, th);
            }
        }
    }

    public boolean b(long j, long j2) {
        try {
            this.i.reset();
            for (int i : t0.v) {
                if (i == 2) {
                    u0.a(i, j, (OutputStream) this.i);
                }
            }
            return a(28, this.i.toByteArray(), false, true, j2);
        } catch (Throwable th) {
            z0.b("MyTrackerRepository error: event serialization failed, type: 28", th);
            return false;
        }
    }

    public boolean b(long j, long j2, long j3, long j4) {
        try {
            this.i.reset();
            for (int i : t0.t) {
                if (i == 2) {
                    u0.a(i, j, (OutputStream) this.i);
                } else if (i == 3) {
                    u0.a(i, j2, (OutputStream) this.i);
                } else if (i == 4) {
                    u0.a(i, j3, (OutputStream) this.i);
                }
            }
            return a(26, this.i.toByteArray(), false, true, j4);
        } catch (Throwable th) {
            z0.b("MyTrackerRepository error: event serialization failed, type: 26", th);
            return false;
        }
    }

    public boolean b(String str, String str2, long j) {
        try {
            this.i.reset();
            for (int i : t0.h) {
                if (i == 1) {
                    u0.a(i, str, this.i);
                } else if (i == 2 && !TextUtils.isEmpty(str2)) {
                    u0.a(i, str2, this.i);
                }
            }
            return a(2, this.i.toByteArray(), true, false, j);
        } catch (Throwable th) {
            z0.b("MyTrackerRepository error: event serialization failed, type: 2", th);
            return false;
        }
    }

    public boolean b(String str, String str2, long j, long j2, long j3) {
        try {
            this.i.reset();
            for (int i : t0.j) {
                if (i == 1) {
                    u0.a(i, str, this.i);
                } else if (i != 2) {
                    if (i == 3) {
                        u0.a(i, j2, (OutputStream) this.i);
                    } else if (i == 4) {
                        u0.a(i, j, (OutputStream) this.i);
                    }
                } else if (!TextUtils.isEmpty(str2)) {
                    u0.a(i, str2, this.i);
                }
            }
            return a(31, this.i.toByteArray(), true, false, j3);
        } catch (Throwable th) {
            z0.b("MyTrackerRepository error: event serialization failed, type: 31", th);
            return false;
        }
    }

    public boolean b(String str, String str2, Map<String, String> map, long j) {
        return a(8, str, str2, map, j);
    }

    public boolean b(Map<String, String> map, long j) {
        try {
            this.i.reset();
            for (int i : t0.b) {
                if (i == 1) {
                    e0.a(i, map, this.j, this.i);
                }
            }
            return a(13, this.i.toByteArray(), j);
        } catch (Throwable th) {
            z0.b("MyTrackerRepository error: event serialization failed, type: 13", th);
            return false;
        }
    }

    public long c() {
        return this.m;
    }

    public boolean c(long j, long j2) {
        try {
            this.i.reset();
            for (int i : t0.w) {
                if (i == 2) {
                    u0.a(i, j, (OutputStream) this.i);
                }
            }
            return a(29, this.i.toByteArray(), false, true, j2);
        } catch (Throwable th) {
            z0.b("MyTrackerRepository error: event serialization failed, type: 29", th);
            return false;
        }
    }

    public boolean d(long j, long j2) {
        long j3;
        AutoCloseable autoCloseable = null;
        try {
            i0.f fVarA = this.b.a("default_session");
            long jB = 0;
            if (fVarA.a()) {
                long jB2 = fVarA.b();
                long jD = fVarA.d();
                long jE = fVarA.e();
                if (this.l == 0) {
                    b(jD);
                }
                z0.a("MyTrackerRepository: finish previous session");
                if (j2 == 0) {
                    j3 = jB2;
                    this.b.a(jB2, jD - this.l, true, 0L);
                } else {
                    j3 = jB2;
                    i0 i0Var = this.b;
                    long j4 = this.l;
                    i0Var.a(j3, jD - j4, false, j2 - j4);
                }
                long j5 = j3;
                long jF = this.b.f(j5);
                z0.a("MyTrackerRepository: session timestamps count: " + jF);
                long j6 = (long) this.g;
                if (jF > j6) {
                    jB = this.b.b(j5, jF - j6);
                    z0.a("MyTrackerRepository: maximum count of session timestamps is exceeded, remove oldest timestamps, count: " + jB);
                }
                z0.a("MyTrackerRepository: start new session");
                this.b.a(j5, j, jE + jB);
            } else {
                z0.a("MyTrackerRepository: insert session");
                if (this.b.a("default_session", j) == i0.x) {
                    z0.b("MyTrackerRepository error: session insertion failed ");
                    fVarA.close();
                    return false;
                }
                if (this.l == 0) {
                    b(j);
                }
            }
            fVarA.close();
            return true;
        } catch (Throwable th) {
            try {
                z0.b("MyTrackerRepository error: session insertion failed ", th);
                if (0 != 0) {
                    autoCloseable.close();
                }
                return false;
            } finally {
            }
        }
    }
}
