package com.apm.insight.runtime;

import com.vungle.ads.internal.signals.SignalManager;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private static long f130a = -30000;
    private static File b;

    public static String a(long j, String str) {
        try {
            return com.apm.insight.l.i.c(new File(com.apm.insight.l.o.j(com.apm.insight.i.g()), "apminsight/TrackInfo/" + ((j - (j % SignalManager.TWENTY_FOUR_HOURS_MILLIS)) / SignalManager.TWENTY_FOUR_HOURS_MILLIS) + "/" + str));
        } catch (Throwable th) {
            return th.getMessage();
        }
    }

    public static void a() {
        File file = new File(com.apm.insight.l.o.j(com.apm.insight.i.g()), "apminsight/TrackInfo/");
        String[] list = file.list();
        if (list != null && list.length > 5) {
            Arrays.sort(list);
            for (int i = 0; i < list.length - 5; i++) {
                com.apm.insight.l.i.a(new File(file, list[i]));
            }
        }
    }

    public static void a(long j) throws Throwable {
        if (j - f130a < 30000) {
            return;
        }
        f130a = j;
        try {
            com.apm.insight.l.i.a(b(), String.valueOf(System.currentTimeMillis()), false);
        } catch (IOException unused) {
        }
    }

    private static File b() {
        if (b == null) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            b = new File(com.apm.insight.l.o.j(com.apm.insight.i.g()), "apminsight/TrackInfo/" + ((jCurrentTimeMillis - (jCurrentTimeMillis % SignalManager.TWENTY_FOUR_HOURS_MILLIS)) / SignalManager.TWENTY_FOUR_HOURS_MILLIS) + "/" + com.apm.insight.i.f());
        }
        return b;
    }
}
