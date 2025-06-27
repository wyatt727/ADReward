package com.json;

import com.json.mediationsdk.adunit.adapter.utility.AdData;
import com.json.mediationsdk.bidding.BiddingDataCallback;
import com.json.mediationsdk.model.NetworkSettings;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;

/* loaded from: classes4.dex */
public class c2 implements Callable<g2> {

    /* renamed from: a, reason: collision with root package name */
    private final int f1714a;
    private final String b;
    private final AdData c;
    private final e2 d;
    private final d2 e;
    private final NetworkSettings f;

    class a implements BiddingDataCallback {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ e4 f1715a;
        final /* synthetic */ BlockingQueue b;

        a(e4 e4Var, BlockingQueue blockingQueue) {
            this.f1715a = e4Var;
            this.b = blockingQueue;
        }

        @Override // com.json.mediationsdk.bidding.BiddingDataCallback
        public void onFailure(String str) {
            this.b.add(new g2(c2.this.d(), c2.this.c(), null, e4.a(this.f1715a), str));
        }

        @Override // com.json.mediationsdk.bidding.BiddingDataCallback
        public void onSuccess(Map<String, Object> map) {
            this.b.add(new g2(c2.this.d(), c2.this.c(), map, e4.a(this.f1715a), null));
        }
    }

    public c2(int i, String str, AdData adData, e2 e2Var, d2 d2Var, NetworkSettings networkSettings) {
        this.f1714a = i;
        this.b = str;
        this.c = adData;
        this.d = e2Var;
        this.e = d2Var;
        this.f = networkSettings;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0073 A[PHI: r0 r2
      0x0073: PHI (r0v4 java.lang.String) = (r0v3 java.lang.String), (r0v7 java.lang.String) binds: [B:7:0x0051, B:11:0x0071] A[DONT_GENERATE, DONT_INLINE]
      0x0073: PHI (r2v7 com.ironsource.d2) = (r2v6 com.ironsource.d2), (r2v10 com.ironsource.d2) binds: [B:7:0x0051, B:11:0x0071] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // java.util.concurrent.Callable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.json.g2 call() throws java.lang.Exception {
        /*
            r4 = this;
            com.ironsource.e4 r0 = new com.ironsource.e4
            r0.<init>()
            com.ironsource.mediationsdk.logger.IronLog r1 = com.json.mediationsdk.logger.IronLog.INTERNAL
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = r4.c()
            r2.append(r3)
            java.lang.String r3 = " fetching bidding data"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.verbose(r2)
            java.util.concurrent.ArrayBlockingQueue r1 = new java.util.concurrent.ArrayBlockingQueue
            r2 = 1
            r1.<init>(r2)
            com.ironsource.c2$a r2 = new com.ironsource.c2$a
            r2.<init>(r0, r1)
            com.ironsource.e2 r0 = r4.b()     // Catch: java.lang.NoClassDefFoundError -> L34 java.lang.Exception -> L54
            com.ironsource.mediationsdk.adunit.adapter.utility.AdData r3 = r4.c     // Catch: java.lang.NoClassDefFoundError -> L34 java.lang.Exception -> L54
            r0.a(r3, r2)     // Catch: java.lang.NoClassDefFoundError -> L34 java.lang.Exception -> L54
            goto L76
        L34:
            r0 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Error while calling collectBiddingData - "
            r2.append(r3)
            java.lang.String r0 = r0.getMessage()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.ironsource.mediationsdk.logger.IronLog r2 = com.json.mediationsdk.logger.IronLog.INTERNAL
            r2.error(r0)
            com.ironsource.d2 r2 = r4.e
            if (r2 == 0) goto L76
            goto L73
        L54:
            r0 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Exception while calling collectBiddingData - "
            r2.append(r3)
            java.lang.String r0 = r0.getMessage()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.ironsource.mediationsdk.logger.IronLog r2 = com.json.mediationsdk.logger.IronLog.INTERNAL
            r2.error(r0)
            com.ironsource.d2 r2 = r4.e
            if (r2 == 0) goto L76
        L73:
            r2.a(r0)
        L76:
            com.ironsource.d2 r0 = r4.e
            if (r0 == 0) goto L7f
            com.ironsource.mediationsdk.model.NetworkSettings r2 = r4.f
            r0.a(r2)
        L7f:
            java.lang.Object r0 = r1.take()
            com.ironsource.g2 r0 = (com.json.g2) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.json.c2.call():com.ironsource.g2");
    }

    public e2 b() {
        return this.d;
    }

    public String c() {
        return this.b;
    }

    public int d() {
        return this.f1714a;
    }
}
