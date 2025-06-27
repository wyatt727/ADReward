package com.applovin.impl;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
final class aj extends wl {
    private long b;
    private long[] c;
    private long[] d;

    private static HashMap f(yg ygVar) {
        HashMap map = new HashMap();
        while (true) {
            String strH = h(ygVar);
            int i = i(ygVar);
            if (i == 9) {
                return map;
            }
            Object objA = a(ygVar, i);
            if (objA != null) {
                map.put(strH, objA);
            }
        }
    }

    @Override // com.applovin.impl.wl
    protected boolean a(yg ygVar) {
        return true;
    }

    public aj() {
        super(new g7());
        this.b = -9223372036854775807L;
        this.c = new long[0];
        this.d = new long[0];
    }

    public long a() {
        return this.b;
    }

    public long[] c() {
        return this.c;
    }

    private static Date c(yg ygVar) {
        Date date = new Date((long) d(ygVar).doubleValue());
        ygVar.g(2);
        return date;
    }

    public long[] b() {
        return this.d;
    }

    private static int i(yg ygVar) {
        return ygVar.w();
    }

    @Override // com.applovin.impl.wl
    protected boolean b(yg ygVar, long j) {
        if (i(ygVar) != 2 || !"onMetaData".equals(h(ygVar)) || i(ygVar) != 8) {
            return false;
        }
        HashMap mapE = e(ygVar);
        Object obj = mapE.get("duration");
        if (obj instanceof Double) {
            double dDoubleValue = ((Double) obj).doubleValue();
            if (dDoubleValue > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                this.b = (long) (dDoubleValue * 1000000.0d);
            }
        }
        Object obj2 = mapE.get("keyframes");
        if (obj2 instanceof Map) {
            Map map = (Map) obj2;
            Object obj3 = map.get("filepositions");
            Object obj4 = map.get("times");
            if ((obj3 instanceof List) && (obj4 instanceof List)) {
                List list = (List) obj3;
                List list2 = (List) obj4;
                int size = list2.size();
                this.c = new long[size];
                this.d = new long[size];
                for (int i = 0; i < size; i++) {
                    Object obj5 = list.get(i);
                    Object obj6 = list2.get(i);
                    if ((obj6 instanceof Double) && (obj5 instanceof Double)) {
                        this.c[i] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                        this.d[i] = ((Double) obj5).longValue();
                    } else {
                        this.c = new long[0];
                        this.d = new long[0];
                        break;
                    }
                }
            }
        }
        return false;
    }

    private static Double d(yg ygVar) {
        return Double.valueOf(Double.longBitsToDouble(ygVar.s()));
    }

    private static String h(yg ygVar) {
        int iC = ygVar.C();
        int iD = ygVar.d();
        ygVar.g(iC);
        return new String(ygVar.c(), iD, iC);
    }

    private static ArrayList g(yg ygVar) {
        int iA = ygVar.A();
        ArrayList arrayList = new ArrayList(iA);
        for (int i = 0; i < iA; i++) {
            Object objA = a(ygVar, i(ygVar));
            if (objA != null) {
                arrayList.add(objA);
            }
        }
        return arrayList;
    }

    private static HashMap e(yg ygVar) {
        int iA = ygVar.A();
        HashMap map = new HashMap(iA);
        for (int i = 0; i < iA; i++) {
            String strH = h(ygVar);
            Object objA = a(ygVar, i(ygVar));
            if (objA != null) {
                map.put(strH, objA);
            }
        }
        return map;
    }

    private static Object a(yg ygVar, int i) {
        if (i == 8) {
            return e(ygVar);
        }
        if (i == 10) {
            return g(ygVar);
        }
        if (i == 11) {
            return c(ygVar);
        }
        if (i == 0) {
            return d(ygVar);
        }
        if (i == 1) {
            return b(ygVar);
        }
        if (i == 2) {
            return h(ygVar);
        }
        if (i != 3) {
            return null;
        }
        return f(ygVar);
    }

    private static Boolean b(yg ygVar) {
        return Boolean.valueOf(ygVar.w() == 1);
    }
}
