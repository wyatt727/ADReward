package com.json;

import com.json.mediationsdk.IronSource;
import com.json.x7;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
class tc implements x7, x7.a {
    private static final int c = 1;

    /* renamed from: a, reason: collision with root package name */
    private final Map<IronSource.AD_UNIT, Integer> f2311a = new HashMap();
    private final d9 b = new d9();

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f2312a;

        static {
            int[] iArr = new int[IronSource.AD_UNIT.values().length];
            f2312a = iArr;
            try {
                iArr[IronSource.AD_UNIT.REWARDED_VIDEO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2312a[IronSource.AD_UNIT.INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2312a[IronSource.AD_UNIT.BANNER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2312a[IronSource.AD_UNIT.NATIVE_AD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    tc() {
        for (IronSource.AD_UNIT ad_unit : IronSource.AD_UNIT.values()) {
            a(ad_unit, 1);
        }
    }

    private void a(IronSource.AD_UNIT ad_unit, int i) {
        this.f2311a.put(ad_unit, Integer.valueOf(i));
        int i2 = a.f2312a[ad_unit.ordinal()];
        if (i2 == 1) {
            this.b.d(i);
            return;
        }
        if (i2 == 2) {
            this.b.b(i);
        } else if (i2 == 3) {
            this.b.a(i);
        } else {
            if (i2 != 4) {
                return;
            }
            this.b.c(i);
        }
    }

    @Override // com.json.x7
    public synchronized int a(IronSource.AD_UNIT ad_unit) {
        int iIntValue = -1;
        if (ad_unit == null) {
            return -1;
        }
        Integer num = this.f2311a.get(ad_unit);
        if (num != null) {
            iIntValue = num.intValue();
        }
        return iIntValue;
    }

    @Override // com.ironsource.x7.a
    public synchronized void b(IronSource.AD_UNIT ad_unit) {
        if (ad_unit == null) {
            return;
        }
        a(ad_unit, this.f2311a.get(ad_unit).intValue() + 1);
    }
}
