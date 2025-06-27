package com.apm.insight.runtime.a;

import android.content.Context;
import com.apm.insight.CrashType;
import com.apm.insight.entity.Header;
import com.apm.insight.runtime.a.c;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    private static volatile f f128a;
    private Context b;
    private Map<CrashType, c> c = new HashMap();
    private b d;
    private d e;

    /* renamed from: com.apm.insight.runtime.a.f$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f129a;

        static {
            int[] iArr = new int[CrashType.values().length];
            f129a = iArr;
            try {
                iArr[CrashType.JAVA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f129a[CrashType.LAUNCH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f129a[CrashType.NATIVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f129a[CrashType.ANR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f129a[CrashType.DART.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f129a[CrashType.CUSTOM_JAVA.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f129a[CrashType.BLOCK.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f129a[CrashType.ENSURE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    private f(Context context) {
        this.b = context;
        try {
            this.d = b.d();
            this.e = new d(this.b);
        } catch (Throwable th) {
            com.apm.insight.c.a().a("NPTH_CATCH", th);
        }
    }

    private c a(CrashType crashType) {
        c jVar = this.c.get(crashType);
        if (jVar != null) {
            return jVar;
        }
        switch (AnonymousClass1.f129a[crashType.ordinal()]) {
            case 1:
                jVar = new j(this.b, this.d, this.e);
                break;
            case 2:
                jVar = new k(this.b, this.d, this.e);
                break;
            case 3:
                jVar = new l(this.b, this.d, this.e);
                break;
            case 4:
                jVar = new a(this.b, this.d, this.e);
                break;
            case 5:
                jVar = new h(this.b, this.d, this.e);
                break;
            case 6:
                jVar = new g(this.b, this.d, this.e);
                break;
            case 7:
                jVar = new e(this.b, this.d, this.e);
                break;
            case 8:
                jVar = new i(this.b, this.d, this.e);
                break;
        }
        if (jVar != null) {
            this.c.put(crashType, jVar);
        }
        return jVar;
    }

    public static f a() {
        if (f128a == null) {
            Context contextG = com.apm.insight.i.g();
            if (contextG == null) {
                throw new IllegalArgumentException("NpthBus not init");
            }
            f128a = new f(contextG);
        }
        return f128a;
    }

    public com.apm.insight.entity.a a(CrashType crashType, com.apm.insight.entity.a aVar) {
        c cVarA;
        return (crashType == null || (cVarA = a(crashType)) == null) ? aVar : cVarA.a(aVar, null, false);
    }

    public com.apm.insight.entity.a a(CrashType crashType, com.apm.insight.entity.a aVar, c.a aVar2, boolean z) {
        c cVarA;
        return (crashType == null || (cVarA = a(crashType)) == null) ? aVar : cVarA.a(aVar, aVar2, z);
    }

    public com.apm.insight.entity.a a(List<com.apm.insight.entity.a> list, JSONArray jSONArray) throws JSONException {
        if (list == null || list.isEmpty()) {
            return null;
        }
        com.apm.insight.entity.a aVar = new com.apm.insight.entity.a();
        JSONArray jSONArray2 = new JSONArray();
        Iterator<com.apm.insight.entity.a> it = list.iterator();
        while (it.hasNext()) {
            jSONArray2.put(it.next().h());
        }
        aVar.a("data", (Object) jSONArray2);
        aVar.a("all_data", (Object) jSONArray);
        Header headerA = Header.a(this.b);
        Header.a(headerA);
        headerA.c();
        headerA.d();
        headerA.e();
        Header.b(headerA);
        aVar.a(headerA);
        return aVar;
    }
}
