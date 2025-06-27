package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Splitter;
import com.applovin.impl.gk;
import com.google.android.gms.nearby.messages.NearbyMessagesStatusCodes;
import java.util.ArrayList;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes.dex */
final class ij {
    private static final Splitter d = Splitter.on(AbstractJsonLexerKt.COLON);
    private static final Splitter e = Splitter.on('*');

    /* renamed from: a, reason: collision with root package name */
    private final List f537a = new ArrayList();
    private int b = 0;
    private int c;

    private void a(j8 j8Var, qh qhVar) {
        yg ygVar = new yg(8);
        j8Var.d(ygVar.c(), 0, 8);
        this.c = ygVar.m() + 8;
        if (ygVar.j() != 1397048916) {
            qhVar.f835a = 0L;
        } else {
            qhVar.f835a = j8Var.f() - (this.c - 12);
            this.b = 2;
        }
    }

    private void b(j8 j8Var, qh qhVar) {
        long jA = j8Var.a();
        int i = this.c - 20;
        yg ygVar = new yg(i);
        j8Var.d(ygVar.c(), 0, i);
        for (int i2 = 0; i2 < i / 12; i2++) {
            ygVar.g(2);
            short sO = ygVar.o();
            if (sO != 2192 && sO != 2816 && sO != 2817 && sO != 2819 && sO != 2820) {
                ygVar.g(8);
            } else {
                this.f537a.add(new a(sO, (jA - this.c) - ygVar.m(), ygVar.m()));
            }
        }
        if (this.f537a.isEmpty()) {
            qhVar.f835a = 0L;
        } else {
            this.b = 3;
            qhVar.f835a = ((a) this.f537a.get(0)).b;
        }
    }

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f538a;
        public final long b;
        public final int c;

        public a(int i, long j, int i2) {
            this.f538a = i;
            this.b = j;
            this.c = i2;
        }
    }

    private static int a(String str) throws ah {
        str.hashCode();
        str.hashCode();
        switch (str) {
            case "SlowMotion_Data":
                return 2192;
            case "Super_SlowMotion_Edit_Data":
                return 2819;
            case "Super_SlowMotion_Data":
                return 2816;
            case "Super_SlowMotion_Deflickering_On":
                return NearbyMessagesStatusCodes.BLUETOOTH_OFF;
            case "Super_SlowMotion_BGM":
                return 2817;
            default:
                throw ah.a("Invalid SEF name", null);
        }
    }

    public int a(j8 j8Var, qh qhVar, List list) throws ah {
        int i = this.b;
        long j = 0;
        if (i == 0) {
            long jA = j8Var.a();
            if (jA != -1 && jA >= 8) {
                j = jA - 8;
            }
            qhVar.f835a = j;
            this.b = 1;
        } else if (i == 1) {
            a(j8Var, qhVar);
        } else if (i == 2) {
            b(j8Var, qhVar);
        } else {
            if (i != 3) {
                throw new IllegalStateException();
            }
            a(j8Var, list);
            qhVar.f835a = 0L;
        }
        return 1;
    }

    private void a(j8 j8Var, List list) throws ah {
        long jF = j8Var.f();
        int iA = (int) ((j8Var.a() - j8Var.f()) - this.c);
        yg ygVar = new yg(iA);
        j8Var.d(ygVar.c(), 0, iA);
        for (int i = 0; i < this.f537a.size(); i++) {
            a aVar = (a) this.f537a.get(i);
            ygVar.f((int) (aVar.b - jF));
            ygVar.g(4);
            int iM = ygVar.m();
            int iA2 = a(ygVar.c(iM));
            int i2 = aVar.c - (iM + 8);
            if (iA2 == 2192) {
                list.add(a(ygVar, i2));
            } else if (iA2 != 2816 && iA2 != 2817 && iA2 != 2819 && iA2 != 2820) {
                throw new IllegalStateException();
            }
        }
    }

    private static gk a(yg ygVar, int i) throws ah {
        ArrayList arrayList = new ArrayList();
        List<String> listSplitToList = e.splitToList(ygVar.c(i));
        for (int i2 = 0; i2 < listSplitToList.size(); i2++) {
            List<String> listSplitToList2 = d.splitToList(listSplitToList.get(i2));
            if (listSplitToList2.size() == 3) {
                try {
                    arrayList.add(new gk.b(Long.parseLong(listSplitToList2.get(0)), Long.parseLong(listSplitToList2.get(1)), 1 << (Integer.parseInt(listSplitToList2.get(2)) - 1)));
                } catch (NumberFormatException e2) {
                    throw ah.a(null, e2);
                }
            } else {
                throw ah.a(null, null);
            }
        }
        return new gk(arrayList);
    }

    public void a() {
        this.f537a.clear();
        this.b = 0;
    }
}
