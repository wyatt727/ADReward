package com.json;

import com.json.mediationsdk.logger.IronSourceLogger;
import com.json.mediationsdk.logger.IronSourceLoggerManager;

/* loaded from: classes4.dex */
class p4 {

    /* renamed from: a, reason: collision with root package name */
    static final String f2058a = "ironbeast";
    static final String b = "outcome";
    static final int c = 3;
    static final int d = 2;
    static final int e = 0;

    p4() {
    }

    static e a(String str, int i) {
        if (f2058a.equals(str)) {
            return new h9(i);
        }
        if (b.equals(str)) {
            return new ib(i);
        }
        if (i == 2) {
            return new h9(i);
        }
        if (i == 3) {
            return new ib(i);
        }
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.NATIVE, "EventsFormatterFactory failed to instantiate a formatter (type: " + str + ", adUnit: " + i + ")", 2);
        return null;
    }
}
