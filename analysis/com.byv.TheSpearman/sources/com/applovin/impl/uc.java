package com.applovin.impl;

import com.applovin.mediation.MaxAd;
import com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacerSettings;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;

/* loaded from: classes.dex */
public class uc {

    /* renamed from: a, reason: collision with root package name */
    private final sg f1061a = new sg();
    private final TreeSet b = new TreeSet();
    private final Map c = new HashMap();
    private int d;
    private int e;

    public Collection e(int i) {
        return new TreeSet((SortedSet) this.b.tailSet(Integer.valueOf(i), false));
    }

    public uc(MaxAdPlacerSettings maxAdPlacerSettings) {
        a(maxAdPlacerSettings);
    }

    public boolean g(int i) {
        return this.f1061a.contains(Integer.valueOf(i));
    }

    public boolean h(int i) {
        return this.b.contains(Integer.valueOf(i));
    }

    public void a() {
        this.c.clear();
        this.b.clear();
    }

    public int b(int i) {
        if (i == 0) {
            return 0;
        }
        return i + a(i - 1, false);
    }

    public int c(int i) {
        return i + a(i, false);
    }

    public int d(int i) {
        if (g(i)) {
            return -1;
        }
        return i - a(i, true);
    }

    public void f(int i) {
        int iB = this.f1061a.b(Integer.valueOf(i));
        for (int size = this.f1061a.size() - 1; size >= iB; size--) {
            Integer num = (Integer) this.f1061a.a(size);
            int iIntValue = num.intValue() + 1;
            a(num.intValue(), iIntValue);
            this.f1061a.a(size, Integer.valueOf(iIntValue));
        }
    }

    public void i(int i) {
        int iB = this.f1061a.b(Integer.valueOf(i));
        if (g(i)) {
            this.c.remove(Integer.valueOf(i));
            this.b.remove(Integer.valueOf(i));
            this.f1061a.b(iB);
        }
        while (iB < this.f1061a.size()) {
            Integer num = (Integer) this.f1061a.a(iB);
            int iIntValue = num.intValue() - 1;
            a(num.intValue(), iIntValue);
            this.f1061a.a(iB, Integer.valueOf(iIntValue));
            iB++;
        }
    }

    public int c() {
        int i = this.d;
        if (i != -1 && this.e != -1) {
            while (i <= this.e) {
                if (g(i) && !h(i)) {
                    return i;
                }
                i++;
            }
        }
        return -1;
    }

    public void a(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            this.c.remove(num);
            this.b.remove(num);
        }
    }

    public MaxAd a(int i) {
        return (MaxAd) this.c.get(Integer.valueOf(i));
    }

    public void b(int i, int i2) {
        i(i);
        f(i2);
    }

    public Collection b() {
        return new TreeSet((SortedSet) this.b);
    }

    public void c(int i, int i2) {
        this.d = i;
        this.e = i2;
    }

    private int a(int i, boolean z) {
        int iC = this.f1061a.c(Integer.valueOf(i));
        if (!z) {
            int i2 = i + iC;
            while (iC < this.f1061a.size() && i2 >= ((Integer) this.f1061a.a(iC)).intValue()) {
                i2++;
                iC++;
            }
        }
        return iC;
    }

    private void a(MaxAdPlacerSettings maxAdPlacerSettings) {
        if (!maxAdPlacerSettings.hasValidPositioning()) {
            com.applovin.impl.sdk.t.h("MaxAdPlacerData", "No positioning info was provided with ad placer settings. You must set at least (1) one or more fixed positions or (2) a repeating interval greater than or equal to 2 for the ad placer to determine where to position ads.");
            return;
        }
        this.f1061a.addAll(maxAdPlacerSettings.getFixedPositions());
        if (!maxAdPlacerSettings.isRepeatingEnabled()) {
            return;
        }
        int repeatingInterval = maxAdPlacerSettings.getRepeatingInterval();
        if (this.f1061a.isEmpty()) {
            this.f1061a.add(Integer.valueOf(repeatingInterval - 1));
        }
        int iIntValue = ((Integer) this.f1061a.a()).intValue();
        while (true) {
            iIntValue += repeatingInterval;
            if (this.f1061a.size() >= maxAdPlacerSettings.getMaxAdCount()) {
                return;
            } else {
                this.f1061a.add(Integer.valueOf(iIntValue));
            }
        }
    }

    public void a(MaxAd maxAd, int i) {
        this.c.put(Integer.valueOf(i), maxAd);
        this.b.add(Integer.valueOf(i));
    }

    private void a(int i, int i2) {
        if (this.c.containsKey(Integer.valueOf(i))) {
            this.c.put(Integer.valueOf(i2), (MaxAd) this.c.get(Integer.valueOf(i)));
            this.b.add(Integer.valueOf(i2));
            this.c.remove(Integer.valueOf(i));
            this.b.remove(Integer.valueOf(i));
        }
    }
}
