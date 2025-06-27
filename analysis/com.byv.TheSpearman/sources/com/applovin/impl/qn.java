package com.applovin.impl;

import android.content.Context;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.core.view.ViewCompat;
import com.applovin.impl.r;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sn;
import com.applovin.impl.yb;
import com.applovin.impl.zb;
import com.applovin.mediation.MaxDebuggerCmpNetworksListActivity;
import com.applovin.mediation.MaxDebuggerTcfStringActivity;
import com.applovin.sdk.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class qn extends ne {

    /* renamed from: a, reason: collision with root package name */
    private com.applovin.impl.sdk.k f841a;
    private zb b;
    private final List c = new ArrayList();
    private final List d = new ArrayList();
    private final List f = new ArrayList();
    private final List g = new ArrayList();
    private final List h = new ArrayList();

    private enum c {
        CMP_SDK_ID,
        CMP_SDK_VERSION,
        INSTRUCTIONS,
        CONFIGURED_NETWORKS
    }

    private enum d {
        GDPR_APPLIES,
        TC_STRING,
        AC_STRING
    }

    private enum e {
        IAB_TCF_PARAMETERS,
        CMP_CONFIGURATION
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List c() {
        ArrayList arrayList = new ArrayList(d.values().length);
        Integer numG = this.f841a.m0().g();
        String strK = this.f841a.m0().k();
        String strC = this.f841a.m0().c();
        arrayList.add(a(qj.r.a(), numG));
        arrayList.add(a(qj.s.a(), strK, !un.b(strK)));
        arrayList.add(a(qj.t.a(), strC, false));
        return arrayList;
    }

    public void initialize(com.applovin.impl.sdk.k kVar) {
        this.f841a = kVar;
        rn rnVarM0 = kVar.m0();
        a(rnVarM0.i());
        a aVar = new a(this);
        this.b = aVar;
        aVar.a(new b(rnVarM0, kVar));
        this.b.notifyDataSetChanged();
    }

    class a extends zb {
        @Override // com.applovin.impl.zb
        protected int b() {
            return e.values().length;
        }

        a(Context context) {
            super(context);
        }

        @Override // com.applovin.impl.zb
        protected int d(int i) {
            if (i == e.IAB_TCF_PARAMETERS.ordinal()) {
                return d.values().length;
            }
            return c.values().length;
        }

        @Override // com.applovin.impl.zb
        protected yb e(int i) {
            if (i == e.IAB_TCF_PARAMETERS.ordinal()) {
                return new bj("IAB TCF Parameters");
            }
            return new bj("CMP CONFIGURATION");
        }

        @Override // com.applovin.impl.zb
        protected List c(int i) {
            return i == e.IAB_TCF_PARAMETERS.ordinal() ? qn.this.c() : qn.this.a();
        }
    }

    class b implements zb.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ rn f842a;
        final /* synthetic */ com.applovin.impl.sdk.k b;

        b(rn rnVar, com.applovin.impl.sdk.k kVar) {
            this.f842a = rnVar;
            this.b = kVar;
        }

        @Override // com.applovin.impl.zb.a
        public void a(hb hbVar, yb ybVar) {
            String strA;
            String strC;
            if (hbVar.b() == e.IAB_TCF_PARAMETERS.ordinal()) {
                if (hbVar.a() == d.TC_STRING.ordinal()) {
                    strA = qj.s.a();
                    strC = this.f842a.k();
                } else {
                    strA = qj.t.a();
                    strC = this.f842a.c();
                }
                r.a(qn.this, MaxDebuggerTcfStringActivity.class, this.b.e(), new a(strA, strC));
                return;
            }
            if (hbVar.a() == c.CONFIGURED_NETWORKS.ordinal()) {
                r.a(qn.this, MaxDebuggerCmpNetworksListActivity.class, this.b.e(), new C0041b());
            } else {
                zp.a(ybVar.c(), ybVar.b(), qn.this);
            }
        }

        class a implements r.b {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f843a;
            final /* synthetic */ String b;

            a(String str, String str2) {
                this.f843a = str;
                this.b = str2;
            }

            @Override // com.applovin.impl.r.b
            public void a(MaxDebuggerTcfStringActivity maxDebuggerTcfStringActivity) {
                maxDebuggerTcfStringActivity.initialize(this.f843a, this.b, b.this.b);
            }
        }

        /* renamed from: com.applovin.impl.qn$b$b, reason: collision with other inner class name */
        class C0041b implements r.b {
            C0041b() {
            }

            @Override // com.applovin.impl.r.b
            public void a(MaxDebuggerCmpNetworksListActivity maxDebuggerCmpNetworksListActivity) {
                maxDebuggerCmpNetworksListActivity.initialize(qn.this.f, qn.this.g, qn.this.c, qn.this.d, qn.this.h, b.this.b);
            }
        }
    }

    @Override // com.applovin.impl.ne
    protected com.applovin.impl.sdk.k getSdk() {
        return this.f841a;
    }

    @Override // com.applovin.impl.ne, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mediation_debugger_list_view);
        setTitle("CMP (Consent Management Platform)");
        ((ListView) findViewById(R.id.listView)).setAdapter((ListAdapter) this.b);
    }

    @Override // com.applovin.impl.ne, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        zb zbVar = this.b;
        if (zbVar != null) {
            zbVar.a((zb.a) null);
        }
    }

    private void a(sn snVar, List list) {
        if (snVar.d() != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (snVar.d().equals(((sn) it.next()).d())) {
                    return;
                }
            }
        }
        list.add(snVar);
    }

    private yb b() {
        yb.b bVarA;
        String strA = qj.p.a();
        Integer numE = this.f841a.m0().e();
        if (StringUtils.isValidString(this.f841a.m0().d())) {
            bVarA = yb.a(yb.c.RIGHT_DETAIL);
        } else {
            yb.b bVarB = yb.a(yb.c.DETAIL).b("Unknown CMP SDK ID");
            bVarA = bVarB.a("Your integrated CMP might not be Google-certified. " + ("SharedPreferences value for key " + strA + " is " + numE + ".") + "\n\nIf you use Google AdMob or Google Ad Manager, make sure that the integrated CMP is included in the list of Google-certified CMPs at: https://support.google.com/admob/answer/13554116").a(R.drawable.applovin_ic_warning).b(r3.a(R.color.applovin_sdk_warningColor, this)).a(true);
        }
        bVarA.d(strA);
        bVarA.c(numE != null ? numE.toString() : "No value set");
        bVarA.c(numE != null ? ViewCompat.MEASURED_STATE_MASK : -65536);
        return bVarA.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List a() {
        String str;
        ArrayList arrayList = new ArrayList(c.values().length);
        int size = this.f.size() + this.g.size();
        arrayList.add(b());
        arrayList.add(a(qj.q.a(), this.f841a.m0().f()));
        arrayList.add(yb.a(yb.c.DETAIL).d("To check which networks are missing from your CMP, first make sure that you have granted consent to all networks through your CMP flow. Then add the following networks to your CMP network list.").a());
        yb.b bVarD = yb.a(yb.c.RIGHT_DETAIL).d("Configured CMP Networks");
        if (size > 0) {
            str = "Missing " + size + " network(s)";
        } else {
            str = "";
        }
        arrayList.add(bVarD.c(str).c(size > 0 ? -65536 : ViewCompat.MEASURED_STATE_MASK).a(this).a(true).a());
        return arrayList;
    }

    private yb a(String str, String str2, boolean z) {
        boolean zIsValidString = StringUtils.isValidString(str2);
        if (zIsValidString && str2.length() > 35) {
            str2 = str2.substring(0, 35) + "...";
        }
        yb.b bVarD = yb.a(yb.c.DETAIL).d(str);
        if (!zIsValidString) {
            str2 = "No value set";
        }
        yb.b bVarA = bVarD.c(str2).c(z ? -65536 : ViewCompat.MEASURED_STATE_MASK).a(zIsValidString);
        if (zIsValidString) {
            bVarA.a(this);
        }
        return bVarA.a();
    }

    private yb a(String str, Integer num) {
        return yb.a(yb.c.RIGHT_DETAIL).d(str).c(num != null ? num.toString() : "No value set").c(num != null ? ViewCompat.MEASURED_STATE_MASK : -65536).a();
    }

    private void a(List list) {
        boolean zB = this.f841a.m0().b();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            sn snVar = (sn) it.next();
            if (snVar.f() == sn.a.TCF_VENDOR) {
                if (Boolean.TRUE.equals(snVar.a())) {
                    a(snVar, this.c);
                } else {
                    a(snVar, this.f);
                }
            } else if (snVar.f() != sn.a.ATP_NETWORK) {
                this.h.add(snVar);
            } else if (zB) {
                if (Boolean.TRUE.equals(snVar.a())) {
                    a(snVar, this.d);
                } else {
                    a(snVar, this.g);
                }
            } else {
                this.h.add(snVar);
            }
        }
    }
}
