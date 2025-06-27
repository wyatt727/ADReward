package com.applovin.impl;

import android.content.Context;
import android.text.TextUtils;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.fe;
import com.applovin.impl.g4;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.x0;
import com.applovin.impl.yb;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkConfiguration;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class oe extends zb implements AppLovinCommunicatorSubscriber, x0.a {
    private List A;
    private List B;
    private List C;
    private List D;
    private com.applovin.impl.sdk.k f;
    private List g;
    private List h;
    private List i;
    private String j;
    private String k;
    private String l;
    private Boolean m;
    private boolean n;
    private final StringBuilder o;
    private final AtomicBoolean p;
    private boolean q;
    private List r;
    private List s;
    private List t;
    private List u;
    private List v;
    private List w;
    private List x;
    private List y;
    private List z;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f751a;

        static {
            int[] iArr = new int[x0.b.values().length];
            f751a = iArr;
            try {
                iArr[x0.b.DEVELOPER_URI_NOT_FOUND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f751a[x0.b.APPADSTXT_NOT_FOUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f751a[x0.b.MISSING_APPLOVIN_ENTRIES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f751a[x0.b.MISSING_NON_APPLOVIN_ENTRIES.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public enum b {
        AD_UNITS,
        SELECT_LIVE_NETWORKS,
        SELECT_TEST_MODE_NETWORKS,
        INITIALIZATION_AD_UNITS,
        COUNT
    }

    private enum c {
        SUCCESS,
        WARNING,
        ERROR
    }

    public enum d {
        SDK_VERSION,
        PLUGIN_VERSION,
        AD_REVIEW_VERSION,
        CONSENT_FLOW,
        GOOGLE_UMP_SDK,
        PRIVACY_POLICY_URL,
        TERMS_OF_SERVICE_URL,
        APP_ADS_TXT
    }

    public enum e {
        CMP,
        NETWORK_CONSENT_STATUSES,
        IS_AGE_RESTRICTED_USER,
        DO_NOT_SELL,
        COUNT
    }

    public enum f {
        APP_INFO,
        MAX,
        PRIVACY,
        ADS,
        INCOMPLETE_NETWORKS,
        COMPLETED_NETWORKS,
        MISSING_NETWORKS,
        COUNT
    }

    private yb q() {
        return yb.a().d("Network Consent Statuses").a(this.f1235a).a(true).a();
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return "MediationDebuggerListAdapter";
    }

    public String toString() {
        return "MediationDebuggerListAdapter{isInitialized=" + this.p.get() + "}";
    }

    public oe(Context context) {
        super(context);
        this.o = new StringBuilder("");
        this.p = new AtomicBoolean();
        this.q = false;
        this.r = new ArrayList();
        this.s = new ArrayList();
        this.t = new ArrayList();
        this.u = new ArrayList();
        this.v = new ArrayList();
        this.w = new ArrayList();
        this.x = new ArrayList();
        this.y = new ArrayList();
        this.z = new ArrayList();
        this.A = new ArrayList();
        this.B = new ArrayList();
        this.C = new ArrayList();
        this.D = new ArrayList();
    }

    public boolean x() {
        return this.p.get();
    }

    public boolean d() {
        return this.q;
    }

    public com.applovin.impl.sdk.k t() {
        return this.f;
    }

    public List e() {
        return this.g;
    }

    public List n() {
        return this.h;
    }

    public String h() {
        return this.j;
    }

    public String g() {
        return this.k;
    }

    public List j() {
        return this.u;
    }

    public List w() {
        return this.v;
    }

    public List v() {
        return this.w;
    }

    public String o() {
        return this.o.toString();
    }

    @Override // com.applovin.impl.zb
    protected List c(int i) {
        if (i == f.APP_INFO.ordinal()) {
            return this.x;
        }
        if (i == f.MAX.ordinal()) {
            return this.y;
        }
        if (i == f.PRIVACY.ordinal()) {
            return this.z;
        }
        if (i == f.ADS.ordinal()) {
            return this.A;
        }
        if (i == f.INCOMPLETE_NETWORKS.ordinal()) {
            return this.B;
        }
        if (i == f.COMPLETED_NETWORKS.ordinal()) {
            return this.C;
        }
        return this.D;
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        if ("privacy_setting_updated".equals(appLovinCommunicatorMessage.getTopic())) {
            this.z = s();
            c();
            return;
        }
        if ("network_sdk_version_updated".equals(appLovinCommunicatorMessage.getTopic())) {
            this.B = a(this.r);
            this.C = a(this.s);
            c();
        } else if ("live_networks_updated".equals(appLovinCommunicatorMessage.getTopic())) {
            this.A = a(a((List) appLovinCommunicatorMessage.getMessageData().getStringArrayList("live_networks"), true), (String) null);
            c();
        } else if ("test_mode_networks_updated".equals(appLovinCommunicatorMessage.getTopic())) {
            this.A = a((String) null, a((List) appLovinCommunicatorMessage.getMessageData().getStringArrayList("test_mode_networks"), false));
            c();
        }
    }

    @Override // com.applovin.impl.zb
    protected int d(int i) {
        if (i == f.APP_INFO.ordinal()) {
            return this.x.size();
        }
        if (i == f.MAX.ordinal()) {
            return this.y.size();
        }
        if (i == f.PRIVACY.ordinal()) {
            return this.z.size();
        }
        if (i == f.ADS.ordinal()) {
            return this.A.size();
        }
        if (i == f.INCOMPLETE_NETWORKS.ordinal()) {
            return this.B.size();
        }
        if (i == f.COMPLETED_NETWORKS.ordinal()) {
            return this.C.size();
        }
        return this.D.size();
    }

    private void y() {
        Map mapA;
        StringBuilder sb = new StringBuilder("\n========== MEDIATION DEBUGGER ==========");
        sb.append("\n========== APP INFO ==========");
        sb.append("\nDev Build - " + zp.c(this.f));
        StringBuilder sb2 = new StringBuilder();
        sb2.append("\nTest Mode - ");
        sb2.append(this.f.n0().c() ? com.json.m4.r : "disabled");
        sb.append(sb2.toString());
        if (this.f.y() != null) {
            sb.append("\nTarget SDK - " + this.f.z().g().g());
        } else {
            sb.append("\nTarget SDK - " + this.f.x().A().get("target_sdk"));
        }
        sb.append("\n========== MAX ==========");
        String str = AppLovinSdk.VERSION;
        String str2 = (String) this.f.a(oj.U3);
        String strB = v.b();
        sb.append("\nSDK Version - " + str);
        StringBuilder sb3 = new StringBuilder();
        sb3.append("\nPlugin Version - ");
        if (!StringUtils.isValidString(str2)) {
            str2 = "None";
        }
        sb3.append(str2);
        sb.append(sb3.toString());
        StringBuilder sb4 = new StringBuilder();
        sb4.append("\nAd Review Version - ");
        if (!StringUtils.isValidString(strB)) {
            strB = "Disabled";
        }
        sb4.append(strB);
        sb.append(sb4.toString());
        if (this.f.E0() && (mapA = zp.a(this.f.g0())) != null) {
            String str3 = (String) mapA.get("UnityVersion");
            StringBuilder sb5 = new StringBuilder();
            sb5.append("\nUnity Version - ");
            sb5.append(StringUtils.isValidString(str3) ? str3 : "None");
            sb.append(sb5.toString());
        }
        sb.append("\n========== PRIVACY ==========");
        sb.append(y3.a(this.f1235a));
        sb.append(this.f.t().g());
        sb.append("\n========== CMP (CONSENT MANAGEMENT PLATFORM) ==========");
        sb.append(this.f.m0().j());
        sb.append("\n========== NETWORK CONSENT STATUSES ==========");
        Iterator it = this.f.m0().i().iterator();
        while (it.hasNext()) {
            sb.append(((sn) it.next()).e());
        }
        sb.append("\n========== NETWORKS ==========");
        Iterator it2 = this.s.iterator();
        while (it2.hasNext()) {
            a(sb, ((fe) it2.next()).j());
        }
        Iterator it3 = this.r.iterator();
        while (it3.hasNext()) {
            a(sb, ((fe) it3.next()).j());
        }
        sb.append("\n========== AD UNITS ==========");
        Iterator it4 = this.g.iterator();
        while (it4.hasNext()) {
            a(sb, ((z) it4.next()).e());
        }
        sb.append("\n========== END ==========");
        com.applovin.impl.sdk.t.g("MediationDebuggerListAdapter", sb.toString());
        this.o.append(sb.toString());
    }

    @Override // com.applovin.impl.zb
    protected yb e(int i) {
        if (i == f.APP_INFO.ordinal()) {
            return new bj("APP INFO");
        }
        if (i == f.MAX.ordinal()) {
            return new bj("MAX");
        }
        if (i == f.PRIVACY.ordinal()) {
            return new bj("PRIVACY");
        }
        if (i == f.ADS.ordinal()) {
            return new bj("ADS");
        }
        if (i == f.INCOMPLETE_NETWORKS.ordinal()) {
            return new bj("INCOMPLETE SDK INTEGRATIONS");
        }
        if (i == f.COMPLETED_NETWORKS.ordinal()) {
            return new bj("COMPLETED SDK INTEGRATIONS");
        }
        return new bj("MISSING SDK INTEGRATIONS");
    }

    private void a(StringBuilder sb, String str) {
        String string = sb.toString();
        if (string.length() + str.length() >= ((Integer) this.f.a(oj.x)).intValue()) {
            com.applovin.impl.sdk.t.g("MediationDebuggerListAdapter", string);
            this.o.append(string);
            sb.setLength(1);
        }
        sb.append(str);
    }

    private List i() {
        String str;
        ArrayList arrayList = new ArrayList(7);
        try {
            str = this.f1235a.getPackageManager().getPackageInfo(this.f1235a.getPackageName(), 0).versionName;
        } catch (Throwable unused) {
            str = null;
        }
        arrayList.add(yb.a().d("Package Name").c(this.f1235a.getPackageName()).a());
        yb.b bVarD = yb.a().d("App Version");
        if (!StringUtils.isValidString(str)) {
            str = "None";
        }
        arrayList.add(bVarD.c(str).a());
        arrayList.add(yb.a().d("OS").c(zp.d()).a());
        arrayList.add(yb.a().d("Account").c(StringUtils.isValidString(this.l) ? this.l : "None").a());
        arrayList.add(yb.a().d("Mediation Provider").c(StringUtils.isValidString(this.f.Q()) ? this.f.Q() : "None").a());
        arrayList.add(yb.a().d("OM SDK Version").c(this.f.Y().c()).a());
        arrayList.add(a(com.applovin.impl.sdk.k.B0()));
        if (this.m != null) {
            arrayList.add(yb.a().d("Google Families Policy").c(String.valueOf(this.m)).a());
        }
        return arrayList;
    }

    private List p() {
        Map mapA;
        ArrayList arrayList = new ArrayList(7);
        arrayList.add(yb.a().d("SDK Version").c(AppLovinSdk.VERSION).a());
        String str = (String) this.f.a(oj.U3);
        yb.b bVarD = yb.a().d("Plugin Version");
        if (!StringUtils.isValidString(str)) {
            str = "None";
        }
        arrayList.add(bVarD.c(str).a());
        yb.b bVarD2 = yb.a().d("Ad Review Version");
        String strB = v.b();
        if (StringUtils.isValidString(strB)) {
            String strA = v.a();
            if (!StringUtils.isValidString(strA) || strA.equals(this.f.d0())) {
                bVarD2.c(strB);
            } else {
                StringBuilder sb = new StringBuilder("MAX Ad Review integrated with wrong SDK key. Please check that your ");
                sb.append(this.f.E0() ? "SDK key is downloaded" : "Gradle plugin snippet is integrated");
                sb.append(" from the correct account.");
                a(bVarD2, sb.toString());
            }
        } else {
            a(bVarD2, "Integrating MAX Ad review is OPTIONAL. This feature gives developers unprecedented transparency into the creatives the users see in their apps.");
        }
        arrayList.add(bVarD2.a());
        if (this.f.E0() && (mapA = zp.a(this.f.g0())) != null) {
            String str2 = (String) mapA.get("UnityVersion");
            arrayList.add(b("Unity Version", StringUtils.isValidString(str2) ? str2 : "None"));
        }
        if (this.f.t().k()) {
            arrayList.add(l());
            if (this.f.t().e() == g4.a.UNIFIED) {
                arrayList.add(m());
            } else {
                arrayList.add(r());
                arrayList.add(u());
            }
        }
        return arrayList;
    }

    private List s() {
        ArrayList arrayList = new ArrayList(e.COUNT.ordinal());
        arrayList.add(k());
        if (StringUtils.isValidString(this.f.m0().k())) {
            arrayList.add(q());
        } else {
            arrayList.add(new uh(y3.b(), false, this.f1235a));
        }
        arrayList.add(new uh(y3.c(), true, this.f1235a));
        arrayList.add(new uh(y3.a(), true, this.f1235a));
        return arrayList;
    }

    private List f() {
        boolean zC = this.f.n0().c();
        List listB = this.f.n0().b();
        if (zC) {
            return a((String) null, a(listB, false));
        }
        return a(a(listB, true), (String) null);
    }

    private yb b(String str, String str2) {
        yb.b bVarD = yb.a().d(str);
        if (StringUtils.isValidString(str2)) {
            bVarD.c(str2);
        } else {
            bVarD.a(R.drawable.applovin_ic_x_mark);
            bVarD.b(r3.a(R.color.applovin_sdk_xmarkColor, this.f1235a));
        }
        return bVarD.a();
    }

    private yb l() {
        if (this.f.t().e() == g4.a.UNIFIED) {
            return yb.a().d("MAX Terms and Privacy Policy Flow").a(this.f1235a).a(true).a();
        }
        return yb.a().d("MAX Terms Flow").a(R.drawable.applovin_ic_x_mark).b(r3.a(R.color.applovin_sdk_xmarkColor, this.f1235a)).b("MAX Terms Flow").a("MAX Terms Flow is deprecated and will be removed in a future SDK version.\n\nFor more details, see:\nhttps://developers.applovin.com/en/android/overview/terms-and-privacy-policy-flow").a(true).a();
    }

    private yb m() {
        boolean zHasSupportedCmp = this.f.n().hasSupportedCmp();
        return yb.a().d("Google UMP SDK").a(zHasSupportedCmp ? R.drawable.applovin_ic_check_mark_bordered : R.drawable.applovin_ic_x_mark).b(r3.a(zHasSupportedCmp ? R.color.applovin_sdk_checkmarkColor : R.color.applovin_sdk_xmarkColor, this.f1235a)).b("Google UMP SDK").a("In order to use MAX Terms and Privacy Policy Flow, you must add the Google User Messaging Platform SDK as a dependency.\n\nFor more details, see:\nhttps://developers.applovin.com/en/android/overview/terms-and-privacy-policy-flow").a(!zHasSupportedCmp).a();
    }

    private yb r() {
        boolean z = this.f.t().h() != null;
        return yb.a().d("Privacy Policy URL").a(z ? R.drawable.applovin_ic_check_mark_bordered : R.drawable.applovin_ic_x_mark).b(r3.a(z ? R.color.applovin_sdk_checkmarkColor : R.color.applovin_sdk_xmarkColor, this.f1235a)).a(true).a();
    }

    private yb u() {
        yb.b bVarD = yb.a().d("Terms of Service URL");
        if (this.f.t().i() != null) {
            bVarD.a(R.drawable.applovin_ic_check_mark_bordered);
            bVarD.b(r3.a(R.color.applovin_sdk_checkmarkColor, this.f1235a));
            bVarD.a(true);
        } else {
            bVarD.c("None");
            bVarD.a(false);
        }
        return bVarD.a();
    }

    private void c(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            fe feVar = (fe) it.next();
            if (!feVar.E()) {
                if (feVar.q() != fe.a.INCOMPLETE_INTEGRATION && feVar.q() != fe.a.INVALID_INTEGRATION) {
                    if (feVar.q() == fe.a.COMPLETE) {
                        this.s.add(feVar);
                    } else if (feVar.q() == fe.a.MISSING) {
                        this.t.add(feVar);
                    }
                } else {
                    this.r.add(feVar);
                }
            }
        }
    }

    private yb k() {
        String strD = this.f.m0().d();
        boolean zIsValidString = StringUtils.isValidString(strD);
        boolean zIsValidString2 = StringUtils.isValidString(this.f.m0().k());
        yb.b bVarD = yb.a(yb.c.DETAIL).d("CMP (Consent Management Platform)");
        if (!zIsValidString) {
            strD = zIsValidString2 ? "Unknown" : "None";
        }
        yb.b bVarC = bVarD.c(strD);
        if (this.n) {
            bVarC.a(true);
            if (zIsValidString2) {
                bVarC.a(this.f1235a);
            } else {
                bVarC.b("TC Data Not Found");
                bVarC.a("By January 16, 2024, if you use Google AdMob or Google Ad Manager, you must also use a Google-certified CMP. Test your app in EEA and UK regions to ensure that this warning doesn't appear in those regions.\n\nFor more details, see:\nhttps://support.google.com/admob/answer/13554116");
                boolean z = this.f.q().getConsentFlowUserGeography() == AppLovinSdkConfiguration.ConsentFlowUserGeography.GDPR;
                bVarC.a(z ? R.drawable.applovin_ic_x_mark : R.drawable.applovin_ic_warning);
                bVarC.b(r3.a(z ? R.color.applovin_sdk_xmarkColor : R.color.applovin_sdk_warningColor, this.f1235a));
            }
        }
        return bVarC.a();
    }

    private void d(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            fe feVar = (fe) it.next();
            if (feVar.x() == fe.b.READY) {
                this.w.add(feVar);
            }
        }
    }

    private List a(String str, String str2) {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(yb.a().d("View Ad Units (" + this.g.size() + ")").a(this.f1235a).a(true).a());
        arrayList.add(a(str));
        arrayList.add(b(str2));
        if (!this.h.isEmpty()) {
            arrayList.add(yb.a().d("Selective Init Ad Units (" + this.h.size() + ")").a(this.f1235a).a(true).a());
        }
        arrayList.add(yb.a().d("Test Mode Enabled").c(String.valueOf(this.f.n0().c())).a());
        return arrayList;
    }

    private yb b(String str) {
        yb.b bVarA = yb.a();
        if (this.f.n0().c()) {
            bVarA.a(this.f1235a);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(StringUtils.isValidString(str) ? "" : "Select ");
        sb.append("Test Mode Network");
        yb.b bVarD = bVarA.d(sb.toString());
        if (!this.f.n0().c()) {
            str = "Enable";
        }
        return bVarD.c(str).c(-16776961).a("Please re-launch the app to enable test mode. This will allow the selection of test mode networks.").a(true).a();
    }

    private void b(List list) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            a0 a0VarF = ((z) it.next()).f();
            Iterator it2 = a0VarF.a().iterator();
            while (it2.hasNext()) {
                hashSet.add(((kr) it2.next()).b());
            }
            Iterator it3 = a0VarF.e().iterator();
            while (it3.hasNext()) {
                hashSet2.add(((kr) it3.next()).b());
            }
        }
        this.u = new ArrayList(hashSet);
        this.v = new ArrayList(hashSet2);
        Collections.sort(this.u);
        Collections.sort(this.v);
    }

    private String a(x0.b bVar, String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            str = "app-ads.txt URL";
        }
        int i = a.f751a[bVar.ordinal()];
        if (i == 1) {
            return "Could not retrieve developer website from the Play Store for this package name. Check back once this app has been published on the Play Store.";
        }
        if (i == 2) {
            return "Unable to find app-ads.txt file or parse entries of the file at " + str + ".\n\nFor more information, please visit Account -> App-Ads.txt Info at:\nhttps://dash.applovin.com/o/account?r=2#app_ads_txt";
        }
        if (i != 3) {
            if (i != 4) {
                return "";
            }
            return "Text file at " + str + " is missing some of the suggested lines.\n\nFor more information, please visit Account -> App-Ads.txt Info at:\nhttps://dash.applovin.com/o/account?r=2#app_ads_txt";
        }
        return "Text file at " + str + " is missing the required AppLovin line:\n\n" + str2 + "\n\nFor more information, please visit Account -> App-Ads.txt Info at:\nhttps://dash.applovin.com/o/account?r=2#app_ads_txt";
    }

    public void b(boolean z) {
        this.q = z;
    }

    @Override // com.applovin.impl.zb
    protected int b() {
        return f.COUNT.ordinal();
    }

    private yb a(String str, c cVar) {
        int i;
        int iA;
        if (cVar == c.SUCCESS) {
            i = R.drawable.applovin_ic_check_mark_bordered;
            iA = r3.a(R.color.applovin_sdk_checkmarkColor, this.f1235a);
        } else if (cVar == c.WARNING) {
            i = R.drawable.applovin_ic_warning;
            iA = r3.a(R.color.applovin_sdk_warningColor, this.f1235a);
        } else {
            i = R.drawable.applovin_ic_x_mark;
            iA = r3.a(R.color.applovin_sdk_xmarkColor, this.f1235a);
        }
        return yb.a().d("app-ads.txt").a(i).b(iA).b("app-ads.txt").a(str).a(true).a();
    }

    private yb a(boolean z) {
        return yb.a().d("Java 8").a(z ? R.drawable.applovin_ic_check_mark_bordered : R.drawable.applovin_ic_x_mark).b(r3.a(z ? R.color.applovin_sdk_checkmarkColor : R.color.applovin_sdk_xmarkColor, this.f1235a)).b("Upgrade to Java 8").a("For optimal performance, please enable Java 8 support. This will be required in a future SDK release. See: https://developers.applovin.com/en/android/overview/integration").a(!z).a();
    }

    private String a(List list, boolean z) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        if (z) {
            for (ec ecVar : this.u) {
                if (list.equals(ecVar.b())) {
                    return ecVar.a();
                }
            }
            for (ec ecVar2 : this.v) {
                if (list.equals(ecVar2.b())) {
                    return ecVar2.a();
                }
            }
        } else {
            for (fe feVar : this.w) {
                if (list.equals(Collections.singletonList(feVar.m()))) {
                    return feVar.g();
                }
            }
        }
        return b0$$ExternalSyntheticBackport0.m(",", list);
    }

    private List a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new xf((fe) it.next(), this.f1235a));
        }
        return arrayList;
    }

    private yb a(String str) {
        yb.b bVarA = yb.a();
        if (!this.f.n0().c()) {
            bVarA.a(this.f1235a);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(StringUtils.isValidString(str) ? "" : "Select ");
        sb.append("Live Network");
        yb.b bVarD = bVarA.d(sb.toString());
        if (this.f.n0().c()) {
            str = "Enable";
        }
        return bVarD.c(str).c(-16776961).a("Ad loads are not supported while Test Mode is enabled. Please restart the app and make sure your GAID has not been enabled for test mode and that you are not on an emulator.").a(true).a();
    }

    public void a(List list, List list2, List list3, List list4, String str, String str2, String str3, Boolean bool, boolean z, com.applovin.impl.sdk.k kVar) {
        this.f = kVar;
        this.g = list2;
        this.h = list3;
        this.i = list4;
        this.j = str;
        this.k = str2;
        this.l = str3;
        this.m = bool;
        this.n = z;
        if (list != null && this.p.compareAndSet(false, true)) {
            kVar.L();
            if (com.applovin.impl.sdk.t.a()) {
                kVar.L().a("MediationDebuggerListAdapter", "Populating networks...");
            }
            kVar.m0().a(list);
            c(list);
            b(list2);
            d(this.s);
            this.x.addAll(i());
            this.y.addAll(p());
            this.z.addAll(s());
            this.A.addAll(f());
            this.B = a(this.r);
            this.C = a(this.s);
            this.D = a(this.t);
            ArrayList arrayList = new ArrayList(3);
            arrayList.add("privacy_setting_updated");
            arrayList.add("network_sdk_version_updated");
            arrayList.add("live_networks_updated");
            arrayList.add("test_mode_networks_updated");
            AppLovinCommunicator.getInstance(this.f1235a).subscribe(this, arrayList);
            y();
        }
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.oe$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.notifyDataSetChanged();
            }
        });
    }

    @Override // com.applovin.impl.x0.a
    public void a(x0.b bVar, String str) {
        if (bVar == x0.b.DEVELOPER_URI_NOT_FOUND) {
            this.f.L();
            if (com.applovin.impl.sdk.t.a()) {
                this.f.L().a("MediationDebuggerListAdapter", "Developer URI was not found; app-ads.txt row will not show on the mediation debugger");
                return;
            }
            return;
        }
        this.y.add(a(a(bVar, str, null), a(bVar)));
        c();
    }

    @Override // com.applovin.impl.x0.a
    public void a(v0 v0Var, String str) {
        w0 w0Var;
        String strA;
        c cVarA;
        c cVar;
        String str2;
        ArrayList arrayList = new ArrayList();
        for (w0 w0Var2 : this.i) {
            List list = (List) v0Var.a().get(w0Var2.b());
            if (list == null || !list.contains(w0Var2)) {
                this.f.L();
                if (com.applovin.impl.sdk.t.a()) {
                    this.f.L().b("MediationDebuggerListAdapter", str + " is missing a required entry: " + w0Var2.d());
                }
                arrayList.add(w0Var2);
            }
        }
        if (arrayList.isEmpty()) {
            str2 = "All required entries found at " + str + ".";
            cVar = c.SUCCESS;
        } else {
            Iterator it = arrayList.iterator();
            while (true) {
                if (it.hasNext()) {
                    w0Var = (w0) it.next();
                    if (w0Var.g()) {
                        break;
                    }
                } else {
                    w0Var = null;
                    break;
                }
            }
            if (w0Var != null) {
                x0.b bVar = x0.b.MISSING_APPLOVIN_ENTRIES;
                strA = a(bVar, str, w0Var.d());
                cVarA = a(bVar);
            } else {
                x0.b bVar2 = x0.b.MISSING_NON_APPLOVIN_ENTRIES;
                strA = a(bVar2, str, null);
                cVarA = a(bVar2);
            }
            String str3 = strA;
            cVar = cVarA;
            str2 = str3;
        }
        this.y.add(a(str2, cVar));
        c();
    }

    private void a(yb.b bVar, String str) {
        bVar.b("MAX Ad Review").a(str).a(R.drawable.applovin_ic_x_mark).b(r3.a(R.color.applovin_sdk_xmarkColor, this.f1235a)).a(true);
    }

    private c a(x0.b bVar) {
        int i = a.f751a[bVar.ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            return c.ERROR;
        }
        if (i != 4) {
            return c.ERROR;
        }
        return c.WARNING;
    }
}
