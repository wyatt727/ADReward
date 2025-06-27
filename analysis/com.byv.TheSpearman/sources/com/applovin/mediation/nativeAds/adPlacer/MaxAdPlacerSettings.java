package com.applovin.mediation.nativeAds.adPlacer;

import com.applovin.impl.sdk.t;
import java.util.Set;
import java.util.TreeSet;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes.dex */
public class MaxAdPlacerSettings {
    public static final int MIN_REPEATING_INTERVAL = 2;

    /* renamed from: a, reason: collision with root package name */
    private final String f1269a;
    private String b;
    private final Set c = new TreeSet();
    private int d = 0;
    private int e = 256;
    private int f = 4;

    public MaxAdPlacerSettings(String str) {
        this.f1269a = str;
    }

    public void addFixedPosition(int i) {
        this.c.add(Integer.valueOf(i));
    }

    public String getAdUnitId() {
        return this.f1269a;
    }

    public Set<Integer> getFixedPositions() {
        return this.c;
    }

    public int getMaxAdCount() {
        return this.e;
    }

    public int getMaxPreloadedAdCount() {
        return this.f;
    }

    public String getPlacement() {
        return this.b;
    }

    public int getRepeatingInterval() {
        return this.d;
    }

    public boolean hasValidPositioning() {
        return !this.c.isEmpty() || isRepeatingEnabled();
    }

    public boolean isRepeatingEnabled() {
        return this.d >= 2;
    }

    public void resetFixedPositions() {
        this.c.clear();
    }

    public void setMaxAdCount(int i) {
        this.e = i;
    }

    public void setMaxPreloadedAdCount(int i) {
        this.f = i;
    }

    public void setPlacement(String str) {
        this.b = str;
    }

    public void setRepeatingInterval(int i) {
        if (i >= 2) {
            this.d = i;
            t.g("MaxAdPlacerSettings", "Repeating interval set to " + i);
            return;
        }
        this.d = 0;
        t.j("MaxAdPlacerSettings", "Repeating interval has been disabled, since it has been set to " + i + ", which is less than minimum value of 2");
    }

    public String toString() {
        return "MaxAdPlacerSettings{adUnitId='" + this.f1269a + "', fixedPositions=" + this.c + ", repeatingInterval=" + this.d + ", maxAdCount=" + this.e + ", maxPreloadedAdCount=" + this.f + AbstractJsonLexerKt.END_OBJ;
    }
}
