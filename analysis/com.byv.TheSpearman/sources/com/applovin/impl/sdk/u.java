package com.applovin.impl.sdk;

import com.applovin.impl.be;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class u {

    /* renamed from: a, reason: collision with root package name */
    private final t f983a;
    private final Map b = new HashMap(4);
    private final Object c = new Object();

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final String f984a;
        private final String b;
        private final String c;
        private String d;
        private String e;

        public a(String str, String str2, String str3) {
            this.f984a = str;
            this.b = str2;
            this.c = str3;
        }

        protected boolean a(Object obj) {
            return obj instanceof a;
        }

        public String c() {
            return this.c;
        }

        public String d() {
            return this.d;
        }

        public String e() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (!aVar.a(this)) {
                return false;
            }
            String strB = b();
            String strB2 = aVar.b();
            if (strB != null ? !strB.equals(strB2) : strB2 != null) {
                return false;
            }
            String strA = a();
            String strA2 = aVar.a();
            if (strA != null ? !strA.equals(strA2) : strA2 != null) {
                return false;
            }
            String strC = c();
            String strC2 = aVar.c();
            if (strC != null ? !strC.equals(strC2) : strC2 != null) {
                return false;
            }
            String strD = d();
            String strD2 = aVar.d();
            if (strD != null ? !strD.equals(strD2) : strD2 != null) {
                return false;
            }
            String strE = e();
            String strE2 = aVar.e();
            return strE != null ? strE.equals(strE2) : strE2 == null;
        }

        public int hashCode() {
            String strB = b();
            int iHashCode = strB == null ? 43 : strB.hashCode();
            String strA = a();
            int iHashCode2 = ((iHashCode + 59) * 59) + (strA == null ? 43 : strA.hashCode());
            String strC = c();
            int iHashCode3 = (iHashCode2 * 59) + (strC == null ? 43 : strC.hashCode());
            String strD = d();
            int iHashCode4 = (iHashCode3 * 59) + (strD == null ? 43 : strD.hashCode());
            String strE = e();
            return (iHashCode4 * 59) + (strE != null ? strE.hashCode() : 43);
        }

        public String toString() {
            return "MediationWaterfallWinnerTracker.WinningAd(bCode=" + b() + ", adapterName=" + a() + ", networkName=" + c() + ", secondWinnerAdapterName=" + d() + ", secondWinnerNetworkName=" + e() + ")";
        }

        public String b() {
            return this.f984a;
        }

        public String a() {
            return this.b;
        }
    }

    u(k kVar) {
        this.f983a = kVar.L();
    }

    public void b(be beVar) {
        a(beVar, null);
    }

    public void a(be beVar) {
        synchronized (this.c) {
            String adUnitId = beVar.getAdUnitId();
            a aVar = (a) this.b.get(adUnitId);
            if (aVar == null) {
                if (t.a()) {
                    this.f983a.a("MediationWaterfallWinnerTracker", "No previous winner to clear.");
                }
                return;
            }
            if (beVar.A().equals(aVar.b())) {
                if (t.a()) {
                    this.f983a.a("MediationWaterfallWinnerTracker", "Clearing previous winning ad: " + aVar);
                }
                this.b.remove(adUnitId);
            } else if (t.a()) {
                this.f983a.a("MediationWaterfallWinnerTracker", "Previous winner not cleared for ad: " + beVar + " , since it could have already been updated with a new ad: " + aVar);
            }
        }
    }

    public void a(be beVar, be beVar2) {
        synchronized (this.c) {
            if (t.a()) {
                this.f983a.a("MediationWaterfallWinnerTracker", "Tracking winning ad: " + beVar);
            }
            a aVar = new a(beVar.A(), beVar.c(), beVar.getNetworkName());
            if (beVar2 != null) {
                aVar.d = beVar2.c();
                aVar.e = beVar2.getNetworkName();
            }
            this.b.put(beVar.getAdUnitId(), aVar);
        }
    }

    public a a(String str) {
        a aVar;
        synchronized (this.c) {
            aVar = (a) this.b.get(str);
        }
        return aVar;
    }
}
