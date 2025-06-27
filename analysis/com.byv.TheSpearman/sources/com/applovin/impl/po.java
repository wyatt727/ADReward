package com.applovin.impl;

import android.os.Bundle;
import com.applovin.impl.m2;
import com.json.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class po implements m2 {
    public static final m2.a d = new m2.a() { // from class: com.applovin.impl.po$$ExternalSyntheticLambda0
        @Override // com.applovin.impl.m2.a
        public final m2 a(Bundle bundle) {
            return po.a(bundle);
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public final int f785a;
    private final d9[] b;
    private int c;

    private static int c(int i) {
        return i | 16384;
    }

    public po(d9... d9VarArr) {
        a1.a(d9VarArr.length > 0);
        this.b = d9VarArr;
        this.f785a = d9VarArr.length;
        a();
    }

    public d9 a(int i) {
        return this.b[i];
    }

    public int hashCode() {
        if (this.c == 0) {
            this.c = Arrays.hashCode(this.b) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE;
        }
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || po.class != obj.getClass()) {
            return false;
        }
        po poVar = (po) obj;
        return this.f785a == poVar.f785a && Arrays.equals(this.b, poVar.b);
    }

    private static String b(int i) {
        return Integer.toString(i, 36);
    }

    public int a(d9 d9Var) {
        int i = 0;
        while (true) {
            d9[] d9VarArr = this.b;
            if (i >= d9VarArr.length) {
                return -1;
            }
            if (d9Var == d9VarArr[i]) {
                return i;
            }
            i++;
        }
    }

    private static String a(String str) {
        return (str == null || str.equals("und")) ? "" : str;
    }

    private void a() {
        String strA = a(this.b[0].c);
        int iC = c(this.b[0].f);
        int i = 1;
        while (true) {
            d9[] d9VarArr = this.b;
            if (i >= d9VarArr.length) {
                return;
            }
            if (!strA.equals(a(d9VarArr[i].c))) {
                d9[] d9VarArr2 = this.b;
                a("languages", d9VarArr2[0].c, d9VarArr2[i].c, i);
                return;
            } else {
                if (iC != c(this.b[i].f)) {
                    a("role flags", Integer.toBinaryString(this.b[0].f), Integer.toBinaryString(this.b[i].f), i);
                    return;
                }
                i++;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ po a(Bundle bundle) {
        return new po((d9[]) n2.a(d9.I, bundle.getParcelableArrayList(b(0)), ab.h()).toArray(new d9[0]));
    }

    private static void a(String str, String str2, String str3, int i) {
        kc.a("TrackGroup", "", new IllegalStateException("Different " + str + " combined in one TrackGroup: '" + str2 + "' (track 0) and '" + str3 + "' (track " + i + ")"));
    }
}
