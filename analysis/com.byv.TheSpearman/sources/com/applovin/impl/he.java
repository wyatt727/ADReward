package com.applovin.impl;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import com.applovin.impl.fe;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.yb;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.sdk.AppLovinPrivacySettings;
import com.applovin.sdk.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class he extends zb {
    private final fe f;
    private List g;
    private final List h;
    private final List i;
    private final List j;
    private final List k;
    private SpannedString l;

    public enum a {
        INTEGRATIONS,
        PERMISSIONS,
        CONFIGURATION,
        DEPENDENCIES,
        TEST_ADS,
        COUNT
    }

    private List g() {
        ArrayList arrayList = new ArrayList(3);
        CollectionUtils.addObjectIfExists(i(), arrayList);
        CollectionUtils.addObjectIfExists(d(), arrayList);
        CollectionUtils.addObjectIfExists(f(), arrayList);
        return arrayList;
    }

    public String toString() {
        return "MediatedNetworkListAdapter{}";
    }

    he(fe feVar, Context context) {
        super(context);
        this.f = feVar;
        if (feVar.q() == fe.a.INVALID_INTEGRATION) {
            SpannableString spannableString = new SpannableString("Tap for more information");
            spannableString.setSpan(new AbsoluteSizeSpan(12, true), 0, spannableString.length(), 33);
            this.l = new SpannedString(spannableString);
        } else {
            this.l = new SpannedString("");
        }
        this.g = g();
        this.h = b(feVar.n());
        this.i = e();
        this.j = a(feVar.f());
        this.k = j();
        notifyDataSetChanged();
    }

    public fe h() {
        return this.f;
    }

    public void k() {
        this.g = g();
    }

    private yb i() {
        yb.b bVarC = yb.a().d("SDK").c(this.f.p());
        if (TextUtils.isEmpty(this.f.p())) {
            bVarC.a(a(this.f.C())).b(b(this.f.C()));
        }
        return bVarC.a();
    }

    private yb d() {
        yb.b bVarC = yb.a().d("Adapter").c(this.f.c());
        if (TextUtils.isEmpty(this.f.c())) {
            bVarC.a(a(this.f.y())).b(b(this.f.y()));
        }
        return bVarC.a();
    }

    private yb f() {
        if (this.f.F()) {
            return null;
        }
        return yb.a().d("Initialization Status").c(f(this.f.i())).a(false).a();
    }

    private String f(int i) {
        return (MaxAdapter.InitializationStatus.INITIALIZED_SUCCESS.getCode() == i || MaxAdapter.InitializationStatus.INITIALIZED_UNKNOWN.getCode() == i || MaxAdapter.InitializationStatus.DOES_NOT_APPLY.getCode() == i) ? "Initialized" : MaxAdapter.InitializationStatus.INITIALIZED_FAILURE.getCode() == i ? "Failure" : MaxAdapter.InitializationStatus.INITIALIZING.getCode() == i ? "Initializing..." : "Not Initialized";
    }

    private List e() {
        ArrayList arrayList = new ArrayList(1);
        if (this.f.B()) {
            arrayList.add(a("Java 8", "For optimal performance, please enable Java 8 support. See: https://developers.applovin.com/en/android/overview/integration", com.applovin.impl.sdk.k.B0(), true));
        }
        return arrayList;
    }

    private List j() {
        ArrayList arrayList = new ArrayList(3);
        if (StringUtils.isValidString(this.f.u())) {
            arrayList.add(yb.a(yb.c.DETAIL).d(this.f.u()).a());
        }
        if (this.f.x() == fe.b.NOT_SUPPORTED) {
            return arrayList;
        }
        if (this.f.s() != null) {
            arrayList.add(c(this.f.s()));
        }
        if (this.f.D()) {
            arrayList.add(a("Not an Age Restricted User", "Test mode requires Age Restricted User (COPPA) to be set to false.", !AppLovinPrivacySettings.isAgeRestrictedUser(this.f1235a) && AppLovinPrivacySettings.isAgeRestrictedUserSet(this.f1235a), false));
        }
        arrayList.add(a(this.f.x()));
        return arrayList;
    }

    private yb a(String str, String str2, boolean z, boolean z2) {
        return yb.a(z ? yb.c.RIGHT_DETAIL : yb.c.DETAIL).d(str).a(z ? null : this.l).b("Instructions").a(str2).a(z ? R.drawable.applovin_ic_check_mark_bordered : c(z2)).b(z ? r3.a(R.color.applovin_sdk_checkmarkColor, this.f1235a) : d(z2)).a(!z).a();
    }

    private int c(boolean z) {
        return z ? R.drawable.applovin_ic_x_mark : R.drawable.applovin_ic_warning;
    }

    private int b(boolean z) {
        return r3.a(z ? R.color.applovin_sdk_checkmarkColor : R.color.applovin_sdk_xmarkColor, this.f1235a);
    }

    @Override // com.applovin.impl.zb
    protected yb e(int i) {
        if (i == a.INTEGRATIONS.ordinal()) {
            return new bj("INTEGRATIONS");
        }
        if (i == a.PERMISSIONS.ordinal()) {
            return new bj("PERMISSIONS");
        }
        if (i == a.CONFIGURATION.ordinal()) {
            return new bj("CONFIGURATION");
        }
        if (i == a.DEPENDENCIES.ordinal()) {
            return new bj("DEPENDENCIES");
        }
        return new bj("TEST ADS");
    }

    @Override // com.applovin.impl.zb
    protected List c(int i) {
        if (i == a.INTEGRATIONS.ordinal()) {
            return this.g;
        }
        if (i == a.PERMISSIONS.ordinal()) {
            return this.h;
        }
        if (i == a.CONFIGURATION.ordinal()) {
            return this.i;
        }
        if (i == a.DEPENDENCIES.ordinal()) {
            return this.j;
        }
        return this.k;
    }

    private yb c(List list) {
        return yb.a().d("Region/VPN Required").c(CollectionUtils.implode(list, ", ", list.size())).a();
    }

    private int d(boolean z) {
        return r3.a(z ? R.color.applovin_sdk_xmarkColor : R.color.applovin_sdk_warningColor, this.f1235a);
    }

    private List b(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        if (list.size() > 0) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                eh ehVar = (eh) it.next();
                arrayList.add(a(ehVar.b(), ehVar.a(), ehVar.c(), true));
            }
        }
        return arrayList;
    }

    @Override // com.applovin.impl.zb
    protected int b() {
        return a.COUNT.ordinal();
    }

    private List a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        if (list.size() > 0) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                n6 n6Var = (n6) it.next();
                arrayList.add(a(n6Var.b(), n6Var.a(), n6Var.c(), true));
            }
        }
        return arrayList;
    }

    @Override // com.applovin.impl.zb
    protected int d(int i) {
        if (i == a.INTEGRATIONS.ordinal()) {
            return this.g.size();
        }
        if (i == a.PERMISSIONS.ordinal()) {
            return this.h.size();
        }
        if (i == a.CONFIGURATION.ordinal()) {
            return this.i.size();
        }
        if (i == a.DEPENDENCIES.ordinal()) {
            return this.j.size();
        }
        return this.k.size();
    }

    private int a(boolean z) {
        return z ? R.drawable.applovin_ic_check_mark_bordered : R.drawable.applovin_ic_x_mark;
    }

    private yb a(fe.b bVar) {
        yb.b bVarA = yb.a();
        if (bVar == fe.b.READY) {
            bVarA.a(this.f1235a);
        }
        return bVarA.d("Test Mode").c(bVar.c()).c(bVar.d()).b("Restart Required").a(bVar.b()).a(true).a();
    }

    public boolean a(hb hbVar) {
        return hbVar.b() == a.TEST_ADS.ordinal() && hbVar.a() == this.k.size() - 1;
    }
}
