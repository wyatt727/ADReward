package com.my.tracker.obfuscated;

import android.content.Context;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingClientStateListener;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.PurchasesUpdatedListener;
import com.android.billingclient.api.SkuDetails;
import com.android.billingclient.api.SkuDetailsParams;
import com.android.billingclient.api.SkuDetailsResponseListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class t {
    public static final Boolean g;
    private static final Set<t> h;
    private final List<String> b;
    private final String c;
    private final b e;
    private final BillingClient f;

    /* renamed from: a, reason: collision with root package name */
    private final AtomicBoolean f4260a = new AtomicBoolean();
    final BillingClientStateListener d = new a();

    class a implements BillingClientStateListener {

        /* renamed from: a, reason: collision with root package name */
        final AtomicInteger f4261a = new AtomicInteger(0);

        a() {
        }

        @Override // com.android.billingclient.api.BillingClientStateListener
        public void onBillingServiceDisconnected() {
            if (this.f4261a.incrementAndGet() >= 3 || !t.this.c()) {
                z0.a("GooglePlayProductHelper: exceeded numbers of billing client connection attempts");
                t.this.e.a(1, Collections.EMPTY_MAP);
                t.this.a();
            }
        }

        @Override // com.android.billingclient.api.BillingClientStateListener
        public void onBillingSetupFinished(BillingResult billingResult) {
            if (billingResult == null || billingResult.getResponseCode() != 0) {
                z0.a("GooglePlayProductHelper: error while connecting with billing client");
                onBillingServiceDisconnected();
            } else {
                z0.a("GooglePlayProductHelper: connection with billing client has been established");
                this.f4261a.set(0);
                t.this.b();
            }
        }
    }

    public interface b {
        void a(int i, Map<String, JSONObject> map);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    static {
        /*
            java.lang.Class<com.android.billingclient.api.Purchase> r0 = com.android.billingclient.api.Purchase.class
            java.lang.String r1 = "com.android.billingclient.api.Purchase"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L1e
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Throwable -> L1e
            if (r0 == 0) goto L1e
            java.lang.Class<com.android.billingclient.api.BillingClient> r0 = com.android.billingclient.api.BillingClient.class
            java.lang.String r1 = "com.android.billingclient.api.BillingClient"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L1e
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Throwable -> L1e
            if (r0 == 0) goto L1e
            r0 = 1
            goto L1f
        L1e:
            r0 = 0
        L1f:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            com.my.tracker.obfuscated.t.g = r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L31
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            goto L33
        L31:
            java.util.Set r0 = java.util.Collections.EMPTY_SET
        L33:
            com.my.tracker.obfuscated.t.h = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.my.tracker.obfuscated.t.<clinit>():void");
    }

    private t(List<String> list, String str, b bVar, Context context) {
        this.b = list;
        this.e = bVar;
        this.f = BillingClient.newBuilder(context).setListener(new PurchasesUpdatedListener() { // from class: com.my.tracker.obfuscated.t$$ExternalSyntheticLambda0
            @Override // com.android.billingclient.api.PurchasesUpdatedListener
            public final void onPurchasesUpdated(BillingResult billingResult, List list2) {
                t.a(billingResult, list2);
            }
        }).enablePendingPurchases().build();
        this.c = str;
    }

    public static v a(Object obj) {
        if (!g.booleanValue()) {
            z0.b("GooglePlayProductHelper: purchase helper is disabled");
            return null;
        }
        try {
            if (obj instanceof Purchase) {
                Purchase purchase = (Purchase) obj;
                return v.a(purchase.getOriginalJson(), purchase.getSignature(), y0.a());
            }
        } catch (Throwable th) {
            z0.b("GooglePlayProductHelper error: exception occurred while processing uncasted object", th);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(BillingResult billingResult, List list) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(List list, String str, b bVar, Context context) {
        t tVar;
        try {
            tVar = new t(list, str, bVar, context);
        } catch (Throwable th) {
            z0.b("GooglePlayProductHelper error: error while creating ProductHelper", th);
        }
        if (tVar.c()) {
            return;
        }
        tVar.a();
        bVar.a(1, Collections.EMPTY_MAP);
    }

    public static void a(List<v> list, boolean z, final b bVar, final Context context) {
        if (list.isEmpty()) {
            z0.a("GooglePlayProductHelper: empty purchases list");
            bVar.a(0, Collections.EMPTY_MAP);
            return;
        }
        final String str = z ? "subs" : "inapp";
        final ArrayList arrayList = new ArrayList();
        Iterator<v> it = list.iterator();
        while (it.hasNext()) {
            String strC = it.next().c();
            if (!arrayList.contains(strC)) {
                arrayList.add(strC);
            }
        }
        g.c(new Runnable() { // from class: com.my.tracker.obfuscated.t$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                t.a(arrayList, str, bVar, context);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(final BillingResult billingResult, final List list) {
        g.a(new Runnable() { // from class: com.my.tracker.obfuscated.t$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.b(billingResult, list);
            }
        });
        a();
    }

    void a() {
        try {
            z0.a("GooglePlayProductHelper: end connection with billing client");
            h.remove(this);
            this.f.endConnection();
        } catch (Throwable th) {
            z0.b("GooglePlayProductHelper error: exception while end connection:", th);
        }
    }

    void b() {
        try {
            z0.a("GooglePlayProductHelper: querying for " + this.c);
            this.f.querySkuDetailsAsync(SkuDetailsParams.newBuilder().setSkusList(this.b).setType(this.c).build(), new SkuDetailsResponseListener() { // from class: com.my.tracker.obfuscated.t$$ExternalSyntheticLambda1
                @Override // com.android.billingclient.api.SkuDetailsResponseListener
                public final void onSkuDetailsResponse(BillingResult billingResult, List list) {
                    this.f$0.c(billingResult, list);
                }
            });
        } catch (Throwable th) {
            z0.b("GooglePlayProductHelper error: exception while querying details for " + this.c, th);
            a();
        }
    }

    boolean c() {
        try {
            z0.a("GooglePlayProductHelper: start connection with billing client");
            this.f.startConnection(this.d);
            h.add(this);
            return true;
        } catch (Throwable th) {
            z0.b("GooglePlayProductHelper error: exception while start connection:", th);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public void b(BillingResult billingResult, List<SkuDetails> list) {
        if (!this.f4260a.compareAndSet(false, true)) {
            z0.a("GooglePlayProductHelper: skuDetails has already been received");
            return;
        }
        int responseCode = billingResult != null ? billingResult.getResponseCode() : 6;
        if (responseCode != 0) {
            z0.a("GooglePlayProductHelper: getSkuDetails completed with errorCode: " + responseCode + ", message: " + (billingResult != null ? billingResult.getDebugMessage() : "{empty message}"));
            this.e.a(1, Collections.EMPTY_MAP);
            return;
        }
        if (list == null || list.isEmpty()) {
            z0.a("GooglePlayProductHelper: null list of skuDetail has been received");
            this.e.a(0, Collections.EMPTY_MAP);
            return;
        }
        HashMap map = new HashMap();
        z0.a("GooglePlayProductHelper: populating map of skuDetails data");
        for (SkuDetails skuDetails : list) {
            try {
                map.put(skuDetails.getSku(), new JSONObject(skuDetails.getOriginalJson()));
            } catch (Throwable th) {
                z0.b("GooglePlayProductHelper error: exception while parsing skuData", th);
            }
        }
        this.e.a(0, map);
    }
}
