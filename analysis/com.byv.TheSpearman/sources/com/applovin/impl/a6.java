package com.applovin.impl;

import android.net.Uri;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class a6 implements m8 {
    private static final int[] n = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 14};
    private static final Constructor o;
    private boolean b;
    private boolean c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;
    private int l;
    private int k = 1;
    private int m = TsExtractor.DEFAULT_TIMESTAMP_SEARCH_BYTES;

    static {
        Constructor constructor = null;
        try {
            if (Boolean.TRUE.equals(Class.forName("com.applovin.exoplayer2.ext.flac.FlacLibrary").getMethod("isAvailable", new Class[0]).invoke(null, new Object[0]))) {
                constructor = Class.forName("com.applovin.exoplayer2.ext.flac.FlacExtractor").asSubclass(i8.class).getConstructor(Integer.TYPE);
            }
        } catch (ClassNotFoundException unused) {
        } catch (Exception e) {
            throw new RuntimeException("Error instantiating FLAC extension", e);
        }
        o = constructor;
    }

    private void a(int i, List list) {
        switch (i) {
            case 0:
                list.add(new i());
                return;
            case 1:
                list.add(new l());
                return;
            case 2:
                list.add(new j0((this.c ? 2 : 0) | this.d | (this.b ? 1 : 0)));
                return;
            case 3:
                list.add(new q0((this.c ? 2 : 0) | this.e | (this.b ? 1 : 0)));
                return;
            case 4:
                Constructor constructor = o;
                if (constructor != null) {
                    try {
                        list.add((i8) constructor.newInstance(Integer.valueOf(this.f)));
                        return;
                    } catch (Exception e) {
                        throw new IllegalStateException("Unexpected error creating FLAC extractor", e);
                    }
                }
                list.add(new t8(this.f));
                return;
            case 5:
                list.add(new c9());
                return;
            case 6:
                list.add(new tc(this.g));
                return;
            case 7:
                list.add(new jf((this.c ? 2 : 0) | this.j | (this.b ? 1 : 0)));
                return;
            case 8:
                list.add(new h9(this.i));
                list.add(new kf(this.h));
                return;
            case 9:
                list.add(new dg());
                return;
            case 10:
                list.add(new ei());
                return;
            case 11:
                list.add(new dp(this.k, this.l, this.m));
                return;
            case 12:
                list.add(new mr());
                return;
            case 13:
            default:
                return;
            case 14:
                list.add(new tb());
                return;
        }
    }

    @Override // com.applovin.impl.m8
    public synchronized i8[] a() {
        return a(Uri.EMPTY, new HashMap());
    }

    @Override // com.applovin.impl.m8
    public synchronized i8[] a(Uri uri, Map map) {
        ArrayList arrayList;
        arrayList = new ArrayList(14);
        int iA = o8.a(map);
        if (iA != -1) {
            a(iA, arrayList);
        }
        int iA2 = o8.a(uri);
        if (iA2 != -1 && iA2 != iA) {
            a(iA2, arrayList);
        }
        for (int i : n) {
            if (i != iA && i != iA2) {
                a(i, arrayList);
            }
        }
        return (i8[]) arrayList.toArray(new i8[arrayList.size()]);
    }
}
