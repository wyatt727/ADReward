package com.applovin.impl;

import android.content.Context;
import android.content.Intent;
import android.database.DataSetObserver;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.webkit.internal.AssetHelper;
import com.applovin.impl.g4;
import com.applovin.impl.oe;
import com.applovin.impl.r;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.zb;
import com.applovin.mediation.MaxDebuggerAdUnitsListActivity;
import com.applovin.mediation.MaxDebuggerDetailActivity;
import com.applovin.mediation.MaxDebuggerTcfConsentStatusesListActivity;
import com.applovin.mediation.MaxDebuggerTcfInfoListActivity;
import com.applovin.mediation.MaxDebuggerTestLiveNetworkActivity;
import com.applovin.mediation.MaxDebuggerTestModeNetworkActivity;
import com.applovin.mediation.MaxDebuggerUnifiedFlowActivity;
import com.applovin.sdk.R;

/* loaded from: classes.dex */
public abstract class me extends ne {

    /* renamed from: a, reason: collision with root package name */
    private oe f644a;
    private DataSetObserver b;
    private FrameLayout c;
    private ListView d;
    private o f;

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (R.id.action_share != menuItem.getItemId()) {
            return super.onOptionsItemSelected(menuItem);
        }
        b();
        return true;
    }

    @Override // com.applovin.impl.ne
    protected com.applovin.impl.sdk.k getSdk() {
        oe oeVar = this.f644a;
        if (oeVar != null) {
            return oeVar.t();
        }
        return null;
    }

    @Override // com.applovin.impl.ne, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle("MAX Mediation Debugger");
        setContentView(R.layout.mediation_debugger_list_view);
        this.c = (FrameLayout) findViewById(android.R.id.content);
        ListView listView = (ListView) findViewById(R.id.listView);
        this.d = listView;
        listView.setAdapter((ListAdapter) this.f644a);
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.mediation_debugger_activity_menu, menu);
        return true;
    }

    @Override // android.app.Activity
    protected void onStart() {
        super.onStart();
        oe oeVar = this.f644a;
        if (oeVar == null || oeVar.x()) {
            return;
        }
        c();
    }

    @Override // com.applovin.impl.ne, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        oe oeVar = this.f644a;
        if (oeVar != null) {
            oeVar.unregisterDataSetObserver(this.b);
            this.f644a.a((zb.a) null);
        }
    }

    public void setListAdapter(oe oeVar, q qVar) {
        DataSetObserver dataSetObserver;
        oe oeVar2 = this.f644a;
        if (oeVar2 != null && (dataSetObserver = this.b) != null) {
            oeVar2.unregisterDataSetObserver(dataSetObserver);
        }
        this.f644a = oeVar;
        this.b = new a();
        b((Context) this);
        this.f644a.registerDataSetObserver(this.b);
        this.f644a.a(new b(qVar));
    }

    class a extends DataSetObserver {
        a() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            me.this.a();
            me meVar = me.this;
            meVar.b((Context) meVar);
        }
    }

    class b implements zb.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ q f646a;

        b(q qVar) {
            this.f646a = qVar;
        }

        @Override // com.applovin.impl.zb.a
        public void a(hb hbVar, yb ybVar) {
            int iB = hbVar.b();
            if (iB == oe.f.APP_INFO.ordinal()) {
                zp.a(ybVar.c(), ybVar.b(), me.this);
                return;
            }
            if (iB == oe.f.MAX.ordinal()) {
                com.applovin.impl.sdk.k kVarT = me.this.f644a.t();
                if (kVarT.t().k()) {
                    int iA = hbVar.a();
                    if (kVarT.t().e() == g4.a.UNIFIED) {
                        if (iA == oe.d.CONSENT_FLOW.ordinal()) {
                            r.a(me.this, MaxDebuggerUnifiedFlowActivity.class, this.f646a, new a(kVarT));
                            return;
                        }
                    } else {
                        int i = iA + 1;
                        if (i == oe.d.PRIVACY_POLICY_URL.ordinal()) {
                            if (kVarT.t().h() != null) {
                                up.a(kVarT.t().h(), com.applovin.impl.sdk.k.k(), kVarT);
                                return;
                            } else {
                                zp.a("Missing Privacy Policy URL", "You cannot use the AppLovin SDK's consent flow without defining a Privacy Policy URL", me.this);
                                return;
                            }
                        }
                        if (i == oe.d.TERMS_OF_SERVICE_URL.ordinal()) {
                            if (kVarT.t().i() != null) {
                                up.a(kVarT.t().i(), com.applovin.impl.sdk.k.k(), kVarT);
                                return;
                            }
                            return;
                        }
                    }
                }
                zp.a(ybVar.c(), ybVar.b(), me.this);
                return;
            }
            if (iB == oe.f.PRIVACY.ordinal()) {
                if (hbVar.a() == oe.e.CMP.ordinal()) {
                    if (StringUtils.isValidString(me.this.f644a.t().m0().k())) {
                        r.a(me.this, MaxDebuggerTcfInfoListActivity.class, this.f646a, new C0030b());
                        return;
                    } else {
                        zp.a(ybVar.c(), ybVar.b(), me.this);
                        return;
                    }
                }
                if (hbVar.a() == oe.e.NETWORK_CONSENT_STATUSES.ordinal()) {
                    r.a(me.this, MaxDebuggerTcfConsentStatusesListActivity.class, this.f646a, new c());
                    return;
                }
                return;
            }
            if (iB == oe.f.ADS.ordinal()) {
                if (hbVar.a() == oe.b.AD_UNITS.ordinal()) {
                    if (me.this.f644a.e().size() > 0) {
                        r.a(me.this, MaxDebuggerAdUnitsListActivity.class, this.f646a, new d());
                        return;
                    } else {
                        zp.a("No live ad units", "Please setup or enable your MAX ad units on https://applovin.com.", me.this);
                        return;
                    }
                }
                if (hbVar.a() == oe.b.SELECT_LIVE_NETWORKS.ordinal()) {
                    if (me.this.f644a.j().size() > 0 || me.this.f644a.w().size() > 0) {
                        if (me.this.f644a.t().n0().c()) {
                            zp.a("Restart Required", ybVar.b(), me.this);
                            return;
                        } else {
                            r.a(me.this, MaxDebuggerTestLiveNetworkActivity.class, this.f646a, new e());
                            return;
                        }
                    }
                    zp.a("Complete Integrations", "Please complete integrations in order to access this.", me.this);
                    return;
                }
                if (hbVar.a() == oe.b.SELECT_TEST_MODE_NETWORKS.ordinal()) {
                    if (me.this.f644a.t().n0().c()) {
                        if (me.this.f644a.v().size() > 0) {
                            r.a(me.this, MaxDebuggerTestModeNetworkActivity.class, this.f646a, new f());
                            return;
                        } else {
                            zp.a("Complete Integrations", "Please complete integrations in order to access this.", me.this);
                            return;
                        }
                    }
                    me.this.getSdk().n0().a();
                    zp.a("Restart Required", ybVar.b(), me.this);
                    return;
                }
                if (hbVar.a() == oe.b.INITIALIZATION_AD_UNITS.ordinal()) {
                    r.a(me.this, MaxDebuggerAdUnitsListActivity.class, this.f646a, new g());
                    return;
                }
                return;
            }
            if ((iB == oe.f.INCOMPLETE_NETWORKS.ordinal() || iB == oe.f.COMPLETED_NETWORKS.ordinal()) && (ybVar instanceof xf)) {
                r.a(me.this, MaxDebuggerDetailActivity.class, this.f646a, new h(ybVar));
            }
        }

        class a implements r.b {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ com.applovin.impl.sdk.k f647a;

            a(com.applovin.impl.sdk.k kVar) {
                this.f647a = kVar;
            }

            @Override // com.applovin.impl.r.b
            public void a(MaxDebuggerUnifiedFlowActivity maxDebuggerUnifiedFlowActivity) {
                maxDebuggerUnifiedFlowActivity.initialize(this.f647a);
            }
        }

        /* renamed from: com.applovin.impl.me$b$b, reason: collision with other inner class name */
        class C0030b implements r.b {
            C0030b() {
            }

            @Override // com.applovin.impl.r.b
            public void a(MaxDebuggerTcfInfoListActivity maxDebuggerTcfInfoListActivity) {
                maxDebuggerTcfInfoListActivity.initialize(me.this.f644a.t());
            }
        }

        class c implements r.b {
            c() {
            }

            @Override // com.applovin.impl.r.b
            public void a(MaxDebuggerTcfConsentStatusesListActivity maxDebuggerTcfConsentStatusesListActivity) {
                maxDebuggerTcfConsentStatusesListActivity.initialize(me.this.f644a.t());
            }
        }

        class d implements r.b {
            d() {
            }

            @Override // com.applovin.impl.r.b
            public void a(MaxDebuggerAdUnitsListActivity maxDebuggerAdUnitsListActivity) {
                maxDebuggerAdUnitsListActivity.initialize(me.this.f644a.e(), false, me.this.f644a.t());
            }
        }

        class e implements r.b {
            e() {
            }

            @Override // com.applovin.impl.r.b
            public void a(MaxDebuggerTestLiveNetworkActivity maxDebuggerTestLiveNetworkActivity) {
                maxDebuggerTestLiveNetworkActivity.initialize(me.this.f644a.j(), me.this.f644a.w(), me.this.f644a.t());
            }
        }

        class f implements r.b {
            f() {
            }

            @Override // com.applovin.impl.r.b
            public void a(MaxDebuggerTestModeNetworkActivity maxDebuggerTestModeNetworkActivity) {
                maxDebuggerTestModeNetworkActivity.initialize(me.this.f644a.v(), me.this.f644a.t());
            }
        }

        class g implements r.b {
            g() {
            }

            @Override // com.applovin.impl.r.b
            public void a(MaxDebuggerAdUnitsListActivity maxDebuggerAdUnitsListActivity) {
                maxDebuggerAdUnitsListActivity.initialize(me.this.f644a.n(), true, me.this.f644a.t());
            }
        }

        class h implements r.b {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ yb f654a;

            h(yb ybVar) {
                this.f654a = ybVar;
            }

            @Override // com.applovin.impl.r.b
            public void a(MaxDebuggerDetailActivity maxDebuggerDetailActivity) {
                maxDebuggerDetailActivity.initialize(((xf) this.f654a).r());
            }
        }
    }

    private void c() {
        a();
        o oVar = new o(this, 50, android.R.attr.progressBarStyleLarge);
        this.f = oVar;
        oVar.setColor(-3355444);
        this.c.addView(this.f, new FrameLayout.LayoutParams(-1, -1, 17));
        this.c.bringChildToFront(this.f);
        this.f.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(final Context context) {
        if (!StringUtils.isValidString(this.f644a.g()) || this.f644a.d()) {
            return;
        }
        this.f644a.b(true);
        runOnUiThread(new Runnable() { // from class: com.applovin.impl.me$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.a(context);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Context context) {
        zp.a(this.f644a.h(), this.f644a.g(), context);
    }

    private void b() {
        String strO = this.f644a.o();
        if (TextUtils.isEmpty(strO)) {
            return;
        }
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType(AssetHelper.DEFAULT_MIME_TYPE);
        intent.putExtra("android.intent.extra.TEXT", strO);
        intent.putExtra("android.intent.extra.TITLE", "Mediation Debugger logs");
        intent.putExtra("android.intent.extra.SUBJECT", "MAX Mediation Debugger logs");
        startActivity(Intent.createChooser(intent, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        o oVar = this.f;
        if (oVar != null) {
            oVar.b();
            this.c.removeView(this.f);
            this.f = null;
        }
    }
}
