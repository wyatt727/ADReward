package com.applovin.impl;

import android.text.TextUtils;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.adapter.MaxAdViewAdapter;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.mediation.adapter.MaxAppOpenAdapter;
import com.applovin.mediation.adapter.MaxInterstitialAdapter;
import com.applovin.mediation.adapter.MaxNativeAdAdapter;
import com.applovin.mediation.adapter.MaxRewardedAdapter;
import com.applovin.mediation.adapter.MaxRewardedInterstitialAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class fe implements Comparable, AppLovinCommunicatorSubscriber {
    private final List A;
    private final List B;
    private final List C;
    private final Map D;
    private final boolean E;
    private final sn F;
    private final boolean G;
    private final String H;
    private final Map I;

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f426a;
    private final a b;
    private int c;
    private final boolean d;
    private final boolean f;
    private final boolean g;
    private final boolean h;
    private final boolean i;
    private final boolean j;
    private final boolean k;
    private final boolean l;
    private final boolean m;
    private final boolean n;
    private final boolean o;
    private final String p;
    private final String q;
    private String r;
    private String s;
    private final String t;
    private final String u;
    private final String v;
    private final String w;
    private final int x;
    private final List y;
    private final List z;

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return "MediatedNetwork";
    }

    public String toString() {
        return "MediatedNetwork{name=" + this.p + ", displayName=" + this.q + ", sdkAvailable=" + this.d + ", sdkVersion=" + this.s + ", adapterAvailable=" + this.f + ", adapterVersion=" + this.t + "}";
    }

    public enum a {
        MISSING("MISSING"),
        INCOMPLETE_INTEGRATION("INCOMPLETE INTEGRATION"),
        INVALID_INTEGRATION("INVALID INTEGRATION"),
        COMPLETE("COMPLETE");


        /* renamed from: a, reason: collision with root package name */
        private final String f427a;

        a(String str) {
            this.f427a = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public String b() {
            return this.f427a;
        }
    }

    public enum b {
        NOT_SUPPORTED("Not Supported", -65536, "This network does not support test mode."),
        INVALID_INTEGRATION("Invalid Integration", -65536, "Please address all the integration issue(s) marked in red above."),
        NOT_INITIALIZED("Not Initialized", -65536, "Please configure this network in your MAX dashboard."),
        DISABLED("Enable", -16776961, "Please re-launch the app to enable test ads."),
        READY("", -16776961, "");


        /* renamed from: a, reason: collision with root package name */
        private final String f428a;
        private final int b;
        private final String c;

        b(String str, int i, String str2) {
            this.f428a = str;
            this.b = i;
            this.c = str2;
        }

        public String c() {
            return this.f428a;
        }

        public int d() {
            return this.b;
        }

        public String b() {
            return this.c;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0225 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public fe(org.json.JSONObject r21, com.applovin.impl.sdk.k r22) {
        /*
            Method dump skipped, instructions count: 773
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.fe.<init>(org.json.JSONObject, com.applovin.impl.sdk.k):void");
    }

    public a q() {
        return this.b;
    }

    public int i() {
        return this.c;
    }

    public b x() {
        if (!this.i) {
            return b.NOT_SUPPORTED;
        }
        a aVar = this.b;
        if (aVar != a.COMPLETE && (aVar != a.INCOMPLETE_INTEGRATION || !C() || !y())) {
            return b.INVALID_INTEGRATION;
        }
        if (!this.f426a.n0().c()) {
            return b.DISABLED;
        }
        if (this.j && (this.c == MaxAdapter.InitializationStatus.INITIALIZED_FAILURE.getCode() || this.c == MaxAdapter.InitializationStatus.INITIALIZING.getCode())) {
            return b.NOT_INITIALIZED;
        }
        return b.READY;
    }

    public boolean C() {
        return this.d;
    }

    public boolean y() {
        return this.f;
    }

    public boolean z() {
        return this.g;
    }

    public boolean E() {
        return this.b == a.MISSING && this.k;
    }

    public String m() {
        return this.p;
    }

    public String g() {
        return this.q;
    }

    public String p() {
        return this.s;
    }

    public String c() {
        return this.t;
    }

    public String k() {
        return this.u;
    }

    public String b() {
        return this.r;
    }

    public String v() {
        return this.w;
    }

    public List l() {
        return this.C;
    }

    public List s() {
        return this.B;
    }

    public int h() {
        return this.x;
    }

    public List r() {
        return this.y;
    }

    public boolean G() {
        return this.l;
    }

    public boolean H() {
        return this.m;
    }

    public List n() {
        return this.z;
    }

    public List f() {
        return this.A;
    }

    public boolean B() {
        return this.o;
    }

    public boolean F() {
        return this.E;
    }

    public Map w() {
        return this.D;
    }

    public String u() {
        return this.v;
    }

    public boolean D() {
        return this.n;
    }

    public sn t() {
        return this.F;
    }

    public final com.applovin.impl.sdk.k o() {
        return this.f426a;
    }

    public final String j() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n---------- ");
        sb.append(this.p);
        sb.append(" ----------");
        sb.append("\nStatus  - ");
        sb.append(this.b.b());
        sb.append("\nSDK     - ");
        String str = "UNAVAILABLE";
        sb.append((!this.d || TextUtils.isEmpty(this.s)) ? "UNAVAILABLE" : this.s);
        sb.append("\nAdapter - ");
        if (this.f && !TextUtils.isEmpty(this.t)) {
            str = this.t;
        }
        sb.append(str);
        for (eh ehVar : n()) {
            if (!ehVar.c()) {
                sb.append("\n* MISSING ");
                sb.append(ehVar.b());
                sb.append(": ");
                sb.append(ehVar.a());
            }
        }
        for (n6 n6Var : f()) {
            if (!n6Var.c()) {
                sb.append("\n* MISSING ");
                sb.append(n6Var.b());
                sb.append(": ");
                sb.append(n6Var.a());
            }
        }
        return sb.toString();
    }

    public boolean A() {
        return this.G;
    }

    public String e() {
        return this.H;
    }

    public Map d() {
        return this.I;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(fe feVar) {
        return this.q.compareToIgnoreCase(feVar.q);
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        String string = appLovinCommunicatorMessage.getMessageData().getString("adapter_class", "");
        if (this.r.equals(string)) {
            this.c = appLovinCommunicatorMessage.getMessageData().getInt("init_status", 0);
            MaxAdapter maxAdapterA = ve.a(string, this.f426a);
            if (maxAdapterA != null) {
                String strA = ve.a(maxAdapterA);
                if (this.s.equals(strA)) {
                    return;
                }
                this.s = strA;
                this.f426a.o().a(this.s, string);
            }
        }
    }

    private a a() {
        a aVar;
        if (this.d) {
            if (this.f) {
                aVar = a.COMPLETE;
            } else if (this.h) {
                aVar = a.MISSING;
            } else {
                aVar = a.INCOMPLETE_INTEGRATION;
            }
        } else if (this.f) {
            aVar = a.INCOMPLETE_INTEGRATION;
        } else {
            aVar = a.MISSING;
        }
        if (aVar == a.MISSING) {
            return aVar;
        }
        Iterator it = this.z.iterator();
        while (it.hasNext()) {
            if (!((eh) it.next()).c()) {
                return a.INVALID_INTEGRATION;
            }
        }
        Iterator it2 = this.A.iterator();
        while (it2.hasNext()) {
            if (!((n6) it2.next()).c()) {
                return a.INVALID_INTEGRATION;
            }
        }
        return (!this.o || com.applovin.impl.sdk.k.B0()) ? aVar : a.INVALID_INTEGRATION;
    }

    private List a(JSONObject jSONObject, String str, com.applovin.impl.sdk.k kVar) {
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "dependencies", new JSONArray());
        JSONArray jSONArray2 = JsonUtils.getJSONArray(jSONObject, "dependencies_v2", new JSONArray());
        ArrayList arrayList = new ArrayList(jSONArray.length() + jSONArray2.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONArray, i, (JSONObject) null);
            if (jSONObject2 != null) {
                arrayList.add(new n6(jSONObject2, kVar));
            }
        }
        for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
            JSONObject jSONObject3 = JsonUtils.getJSONObject(jSONArray2, i2, (JSONObject) null);
            if (jSONObject3 != null && n6.a(str, JsonUtils.getString(jSONObject3, "min_adapter_version", null), JsonUtils.getString(jSONObject3, "max_adapter_version", null))) {
                arrayList.add(new n6(jSONObject3, kVar));
            }
        }
        return arrayList;
    }

    private List a(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        ArrayList arrayList = new ArrayList();
        if (this.r.equals("com.applovin.mediation.adapters.AppLovinMediationAdapter")) {
            eh ehVar = new eh("com.google.android.gms.permission.AD_ID", "Please add\n<uses-permission android:name=\"com.google.android.gms.permission.AD_ID\" />\nto your AndroidManifest.xml", com.applovin.impl.sdk.k.k());
            if (ehVar.c()) {
                arrayList.add(ehVar);
            }
        }
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "permissions", new JSONObject());
        Iterator<String> itKeys = jSONObject2.keys();
        while (itKeys.hasNext()) {
            try {
                String next = itKeys.next();
                arrayList.add(new eh(next, jSONObject2.getString(next), com.applovin.impl.sdk.k.k()));
            } catch (JSONException unused) {
            }
        }
        return arrayList;
    }

    private List a(MaxAdapter maxAdapter, boolean z) {
        ArrayList arrayList = new ArrayList(5);
        if (maxAdapter instanceof MaxInterstitialAdapter) {
            arrayList.add(MaxAdFormat.INTERSTITIAL);
        }
        if (maxAdapter instanceof MaxAppOpenAdapter) {
            arrayList.add(MaxAdFormat.APP_OPEN);
        }
        if (maxAdapter instanceof MaxRewardedAdapter) {
            arrayList.add(MaxAdFormat.REWARDED);
        }
        if (maxAdapter instanceof MaxRewardedInterstitialAdapter) {
            arrayList.add(MaxAdFormat.REWARDED_INTERSTITIAL);
        }
        if (maxAdapter instanceof MaxAdViewAdapter) {
            arrayList.add(MaxAdFormat.BANNER);
            arrayList.add(MaxAdFormat.LEADER);
            if (z) {
                arrayList.add(MaxAdFormat.MREC);
            }
        }
        if (maxAdapter instanceof MaxNativeAdAdapter) {
            arrayList.add(MaxAdFormat.NATIVE);
        }
        return arrayList;
    }

    private List a(JSONObject jSONObject) {
        return JsonUtils.optList(JsonUtils.getJSONArray(jSONObject, "supported_regions", null), null);
    }
}
