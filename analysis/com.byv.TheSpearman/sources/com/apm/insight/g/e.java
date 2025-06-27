package com.apm.insight.g;

import com.apm.insight.i;
import com.apm.insight.l.r;

/* loaded from: classes.dex */
public class e {
    public static boolean a(long j) {
        if (r.a(2)) {
            return true;
        }
        if (r.a(1024)) {
            return false;
        }
        return (com.apm.insight.runtime.a.b.c() == -1 || j - com.apm.insight.runtime.a.b.c() <= i.i().getLaunchCrashInterval()) && !(i.m() && i.p() == 0);
    }
}
