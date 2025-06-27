package com.applovin.impl;

import android.util.SparseArray;
import com.applovin.impl.d9;
import com.applovin.impl.ep;
import com.google.android.exoplayer2.util.MimeTypes;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class l6 implements ep.c {

    /* renamed from: a, reason: collision with root package name */
    private final int f628a;
    private final List b;

    private wp b(ep.b bVar) {
        return new wp(c(bVar));
    }

    public l6(int i) {
        this(i, ab.h());
    }

    private List c(ep.b bVar) {
        String str;
        int i;
        if (a(32)) {
            return this.b;
        }
        yg ygVar = new yg(bVar.d);
        List arrayList = this.b;
        while (ygVar.a() > 0) {
            int iW = ygVar.w();
            int iD = ygVar.d() + ygVar.w();
            if (iW == 134) {
                arrayList = new ArrayList();
                int iW2 = ygVar.w() & 31;
                for (int i2 = 0; i2 < iW2; i2++) {
                    String strC = ygVar.c(3);
                    int iW3 = ygVar.w();
                    boolean z = (iW3 & 128) != 0;
                    if (z) {
                        i = iW3 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i = 1;
                    }
                    byte bW = (byte) ygVar.w();
                    ygVar.g(1);
                    List listA = null;
                    if (z) {
                        listA = m3.a((bW & 64) != 0);
                    }
                    arrayList.add(new d9.b().f(str).e(strC).a(i).a(listA).a());
                }
            }
            ygVar.f(iD);
        }
        return arrayList;
    }

    public l6(int i, List list) {
        this.f628a = i;
        this.b = list;
    }

    @Override // com.applovin.impl.ep.c
    public ep a(int i, ep.b bVar) {
        if (i == 2) {
            return new fh(new da(b(bVar)));
        }
        if (i == 3 || i == 4) {
            return new fh(new nf(bVar.b));
        }
        if (i == 21) {
            return new fh(new wa());
        }
        if (i == 27) {
            if (a(4)) {
                return null;
            }
            return new fh(new fa(a(bVar), a(1), a(8)));
        }
        if (i == 36) {
            return new fh(new ga(a(bVar)));
        }
        if (i != 89) {
            if (i != 138) {
                if (i == 172) {
                    return new fh(new m(bVar.b));
                }
                if (i == 257) {
                    return new dj(new bh(MimeTypes.APPLICATION_AIT));
                }
                if (i != 129) {
                    if (i != 130) {
                        if (i == 134) {
                            if (a(16)) {
                                return null;
                            }
                            return new dj(new bh("application/x-scte35"));
                        }
                        if (i != 135) {
                            switch (i) {
                                case 15:
                                    if (a(2)) {
                                        return null;
                                    }
                                    return new fh(new k0(false, bVar.b));
                                case 16:
                                    return new fh(new ea(b(bVar)));
                                case 17:
                                    if (a(2)) {
                                        return null;
                                    }
                                    return new fh(new wb(bVar.b));
                                default:
                                    return null;
                            }
                        }
                    } else if (!a(64)) {
                        return null;
                    }
                }
                return new fh(new j(bVar.b));
            }
            return new fh(new c7(bVar.b));
        }
        return new fh(new k7(bVar.c));
    }

    private boolean a(int i) {
        return (i & this.f628a) != 0;
    }

    @Override // com.applovin.impl.ep.c
    public SparseArray a() {
        return new SparseArray();
    }

    private jj a(ep.b bVar) {
        return new jj(c(bVar));
    }
}
