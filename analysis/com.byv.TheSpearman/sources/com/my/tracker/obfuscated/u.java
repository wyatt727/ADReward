package com.my.tracker.obfuscated;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.my.tracker.obfuscated.p;
import com.my.tracker.obfuscated.t;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    final Context f4263a;
    final p b;
    final p.c c = new p.c() { // from class: com.my.tracker.obfuscated.u$$ExternalSyntheticLambda0
        @Override // com.my.tracker.obfuscated.p.c
        public final void a(List list) {
            this.f$0.b(list);
        }
    };

    final class a implements t.b {

        /* renamed from: a, reason: collision with root package name */
        private final List<v> f4264a;

        a(List<v> list) {
            this.f4264a = list;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(Map map) {
            for (v vVar : this.f4264a) {
                vVar.a((JSONObject) map.get(vVar.c()));
            }
            u.this.b.d(this.f4264a);
        }

        @Override // com.my.tracker.obfuscated.t.b
        public void a(int i, final Map<String, JSONObject> map) {
            if (i == 1) {
                z0.b("GooglePlayPurchaseHandler error: can't retrieve information about products");
            } else {
                g.a(new Runnable() { // from class: com.my.tracker.obfuscated.u$a$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.a(map);
                    }
                });
            }
        }
    }

    private u(p pVar, Context context) {
        this.b = pVar;
        this.f4263a = context.getApplicationContext();
    }

    public static u a(p pVar, Context context) {
        return new u(pVar, context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str, String str2) {
        v vVarA = v.a(str, str2, y0.a());
        if (vVarA == null) {
            return;
        }
        this.b.a(Collections.singletonList(vVarA), this.c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(List list) {
        z0.a("GooglePlayPurchaseHandler: iterating over unchecked list of objects");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            v vVarA = t.a(it.next());
            if (vVarA == null) {
                z0.a("GooglePlayPurchaseHandler: null purchase data after processing");
            } else {
                arrayList.add(vVarA);
            }
        }
        if (arrayList.isEmpty()) {
            z0.a("GooglePlayPurchaseHandler: skip empty purchases list");
        } else {
            this.b.a(arrayList, this.c);
        }
    }

    public void a() {
        this.b.a(this.c);
    }

    public void a(int i, Intent intent) {
        if (!t.g.booleanValue()) {
            z0.b("GooglePlayPurchaseHandler error: classes com.android.billingclient:billing aren't found");
            return;
        }
        if (i != -1) {
            z0.a("GooglePlayPurchaseHandler: result code isn't equal to RESULT_OK");
            return;
        }
        if (intent == null) {
            z0.a("GooglePlayPurchaseHandler: empty intent has been received");
            return;
        }
        final String stringExtra = intent.getStringExtra("INAPP_PURCHASE_DATA");
        if (TextUtils.isEmpty(stringExtra)) {
            z0.a("GooglePlayPurchaseHandler: empty purchase data in intent");
            return;
        }
        final String stringExtra2 = intent.getStringExtra("INAPP_DATA_SIGNATURE");
        if (stringExtra2 == null) {
            z0.a("GooglePlayPurchaseHandler: null data signature in intent");
        } else {
            g.a(new Runnable() { // from class: com.my.tracker.obfuscated.u$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.a(stringExtra, stringExtra2);
                }
            });
        }
    }

    public void a(int i, final List<Object> list) {
        if (i != 0) {
            z0.a("GooglePlayPurchaseHandler: response code isn't equal to BILLING_OK_RESPONSE_CODE");
            return;
        }
        if (list == null || list.isEmpty()) {
            z0.a("GooglePlayPurchaseHandler: null or empty purchases list has been received");
        } else if (t.g.booleanValue()) {
            g.a(new Runnable() { // from class: com.my.tracker.obfuscated.u$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.a(list);
                }
            });
        } else {
            z0.b("GooglePlayPurchaseHandler error: classes com.android.billingclient:billing aren't found");
        }
    }

    void a(List<v> list, boolean z) {
        if (list.isEmpty()) {
            z0.a(z ? "GooglePlayPurchaseHandler: empty inapp raw purchases list" : "GooglePlayPurchaseHandler: empty subs raw purchases list");
        } else {
            t.a(list, z, new a(list), this.f4263a);
        }
    }

    public void a(JSONObject jSONObject, JSONObject jSONObject2, String str, Map<String, String> map) {
        this.b.a(jSONObject, jSONObject2, str, map);
    }

    void b(List<v> list) {
        z0.a("GooglePlayPurchaseHandler: processing raw purchases");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (v vVar : list) {
            String strC = vVar.c();
            if (vVar.g()) {
                z0.a("GooglePlayPurchaseHandler: inapp raw purchase, product id: " + strC);
                arrayList2.add(vVar);
            } else {
                z0.a("GooglePlayPurchaseHandler: subs raw purchase, product id: " + strC);
                arrayList.add(vVar);
            }
        }
        a((List<v>) arrayList, false);
        a((List<v>) arrayList2, true);
    }
}
