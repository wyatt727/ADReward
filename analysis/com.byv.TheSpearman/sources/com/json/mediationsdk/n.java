package com.json.mediationsdk;

import com.json.environment.thread.IronSourceThreadManager;
import com.json.k1;
import com.json.mediationsdk.IronSource;
import com.json.mediationsdk.logger.IronLog;
import com.json.mediationsdk.logger.IronSourceError;
import com.json.v6;
import com.json.wb;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public class n {
    private static final n f = new n();

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, Long> f1975a = new HashMap();
    private final Map<String, Boolean> b = new HashMap();
    private int c;
    private int d;
    private int e;

    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ IronSource.AD_UNIT f1976a;
        final /* synthetic */ IronSourceError b;
        final /* synthetic */ boolean c;
        final /* synthetic */ String d;

        a(IronSource.AD_UNIT ad_unit, IronSourceError ironSourceError, boolean z, String str) {
            this.f1976a = ad_unit;
            this.b = ironSourceError;
            this.c = z;
            this.d = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IronLog.INTERNAL.verbose("onAdLoadFailed - invokeCallback after delaying");
            n.this.a(this.f1976a, this.b, this.c);
            n.this.b.put(this.d, Boolean.FALSE);
        }
    }

    private n() {
    }

    private int a(IronSource.AD_UNIT ad_unit) {
        if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
            return this.d;
        }
        if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
            return this.c;
        }
        if (ad_unit == IronSource.AD_UNIT.BANNER) {
            return this.e;
        }
        IronLog.INTERNAL.warning("ad unit not supported - " + ad_unit);
        return 0;
    }

    public static synchronized n a() {
        return f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(IronSource.AD_UNIT ad_unit, IronSourceError ironSourceError, boolean z) {
        this.f1975a.put(ad_unit.toString(), Long.valueOf(System.currentTimeMillis()));
        if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
            wb.a().a(ironSourceError);
            return;
        }
        if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
            v6.a().a(ironSourceError);
            return;
        }
        if (ad_unit == IronSource.AD_UNIT.BANNER) {
            k1.a().a(ironSourceError, z);
            return;
        }
        IronLog.INTERNAL.warning("ad unit not supported - " + ad_unit);
    }

    public void a(IronSource.AD_UNIT ad_unit, int i) {
        if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
            this.d = i;
            return;
        }
        if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
            this.c = i;
            return;
        }
        if (ad_unit == IronSource.AD_UNIT.BANNER) {
            this.e = i;
            return;
        }
        IronLog.INTERNAL.warning("ad unit not supported - " + ad_unit);
    }

    public synchronized void a(IronSource.AD_UNIT ad_unit, IronSourceError ironSourceError) {
        b(ad_unit, ironSourceError, false);
    }

    public synchronized void b(IronSource.AD_UNIT ad_unit, IronSourceError ironSourceError, boolean z) {
        if (b(ad_unit)) {
            return;
        }
        String string = ad_unit.toString();
        if (!this.f1975a.containsKey(string)) {
            a(ad_unit, ironSourceError, z);
            return;
        }
        long jA = a(ad_unit) * 1000;
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f1975a.get(string).longValue();
        if (jCurrentTimeMillis > jA) {
            a(ad_unit, ironSourceError, z);
            return;
        }
        this.b.put(string, Boolean.TRUE);
        long j = jA - jCurrentTimeMillis;
        IronLog.INTERNAL.verbose("delaying callback by " + j);
        IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new a(ad_unit, ironSourceError, z, string), j);
    }

    public synchronized boolean b(IronSource.AD_UNIT ad_unit) {
        if (!this.b.containsKey(ad_unit.toString())) {
            return false;
        }
        return this.b.get(ad_unit.toString()).booleanValue();
    }
}
