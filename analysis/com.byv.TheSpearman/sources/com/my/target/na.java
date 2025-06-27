package com.my.target;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;

/* loaded from: classes4.dex */
public final class na extends g1 {
    public boolean f;
    public float g;
    public Context h;

    public na(j2 j2Var, ArrayList<u9> arrayList, long j) {
        super(j2Var, arrayList, j);
        this.f = false;
        this.g = 0.0f;
    }

    public static na a(j2 j2Var, ArrayList<u9> arrayList, long j) {
        return new na(j2Var, arrayList, j);
    }

    public final void a(float f, long j) {
        b(f, j);
        ba.b("ViewabilityTracker: ViewabilityDurationStatTracker", "ViewabilityDuration tracked, kill self");
        b();
    }

    @Override // com.my.target.x9
    public void a(View view) {
        this.h = view.getContext().getApplicationContext();
    }

    public final void a(boolean z, float f) {
        this.g = Math.max(this.g, f);
        long jD = d();
        if (!z || jD >= 60000) {
            a(this.g, jD);
            return;
        }
        ba.b("ViewabilityTracker: ViewabilityDurationStatTracker", "No need to send ViewabilityDurationStat (isVisible = true, currentDurationMillis = " + jD + ")");
    }

    @Override // com.my.target.x9
    public void a(boolean z, float f, View view) {
        if (this.f) {
            a(z, f);
        } else if (a(z)) {
            this.f = true;
            this.g = f;
            ba.b("ViewabilityTracker: ViewabilityDurationStatTracker", "Start tracking viewability");
        }
    }

    public final void b(float f, long j) {
        String strValueOf = String.valueOf((int) f);
        String str = String.format(Locale.getDefault(), "%.1f", Float.valueOf(Math.min(j, 60000L) / 1000.0f));
        HashMap map = new HashMap();
        map.put("viewability_percent", strValueOf);
        map.put("viewability_duration", str);
        ba.b("ViewabilityTracker: ViewabilityDurationStatTracker", "Sending ViewabilityDuration stat (max visible percent = " + strValueOf + ", duration = " + str + " sec)");
        w9.c(this.f4184a, map, this.h);
    }

    @Override // com.my.target.x9
    public void c() {
        if (this.f) {
            a(this.g, d());
        } else {
            this.e = 0L;
        }
        this.h = null;
    }

    public final long d() {
        return System.currentTimeMillis() - this.e;
    }
}
