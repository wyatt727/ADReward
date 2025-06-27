package com.applovin.impl;

import android.content.Context;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.applovin.impl.sn;
import com.applovin.sdk.R;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class on extends ne {

    /* renamed from: a, reason: collision with root package name */
    private com.applovin.impl.sdk.k f763a;
    private zb b;

    private enum b {
        TC_NETWORKS,
        AC_NETWORKS
    }

    private yb a(String str, String str2) {
        return yb.a().d(str).c(str2).a();
    }

    public void initialize(com.applovin.impl.sdk.k kVar) {
        this.f763a = kVar;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        String strA = y3.b().a(this);
        boolean zB = kVar.m0().b();
        if (!zB) {
            arrayList2.add(a("Has User Consent", strA));
        }
        for (sn snVar : kVar.m0().i()) {
            Boolean boolA = snVar.a();
            if (boolA != null) {
                if (snVar.f() == sn.a.TCF_VENDOR) {
                    arrayList.add(a(snVar.b(), String.valueOf(boolA)));
                } else if (snVar.f() == sn.a.ATP_NETWORK) {
                    arrayList2.add(a(snVar.b(), String.valueOf(boolA)));
                }
            } else if (zB && snVar.f() == sn.a.ATP_NETWORK) {
                arrayList2.add(a(snVar.b(), strA));
            }
        }
        a aVar = new a(this, arrayList, arrayList2, zB);
        this.b = aVar;
        aVar.notifyDataSetChanged();
    }

    class a extends zb {
        final /* synthetic */ ArrayList f;
        final /* synthetic */ ArrayList g;
        final /* synthetic */ boolean h;

        @Override // com.applovin.impl.zb
        protected int b() {
            return b.values().length;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Context context, ArrayList arrayList, ArrayList arrayList2, boolean z) {
            super(context);
            this.f = arrayList;
            this.g = arrayList2;
            this.h = z;
        }

        @Override // com.applovin.impl.zb
        protected int d(int i) {
            if (i == b.TC_NETWORKS.ordinal()) {
                return this.f.size();
            }
            return this.g.size();
        }

        @Override // com.applovin.impl.zb
        protected yb e(int i) {
            if (i == b.TC_NETWORKS.ordinal()) {
                return new bj("TCF VENDORS (TC STRING)");
            }
            return new bj(this.h ? "ATP NETWORKS (AC STRING)" : "APPLOVIN PRIVACY SETTING");
        }

        @Override // com.applovin.impl.zb
        protected List c(int i) {
            if (i == b.TC_NETWORKS.ordinal()) {
                return this.f;
            }
            return this.g;
        }
    }

    @Override // com.applovin.impl.ne
    protected com.applovin.impl.sdk.k getSdk() {
        return this.f763a;
    }

    @Override // com.applovin.impl.ne, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mediation_debugger_list_view);
        setTitle("Network Consent Statuses");
        ((ListView) findViewById(R.id.listView)).setAdapter((ListAdapter) this.b);
    }
}
