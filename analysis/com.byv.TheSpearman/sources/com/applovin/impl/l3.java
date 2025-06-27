package com.applovin.impl;

import android.content.Context;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.core.view.ViewCompat;
import com.applovin.impl.sn;
import com.applovin.impl.yb;
import com.applovin.impl.zb;
import com.applovin.sdk.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class l3 extends ne {

    /* renamed from: a, reason: collision with root package name */
    private com.applovin.impl.sdk.k f616a;
    private zb b;

    private enum c {
        MISSING_TC_NETWORKS,
        MISSING_AC_NETWORKS,
        LISTED_TC_NETWORKS,
        LISTED_AC_NETWORKS,
        OTHER_NETWORKS
    }

    public void initialize(List<sn> list, List<sn> list2, List<sn> list3, List<sn> list4, List<sn> list5, com.applovin.impl.sdk.k kVar) {
        this.f616a = kVar;
        a aVar = new a(this, list, list2, list3, list4, list5);
        this.b = aVar;
        aVar.a(new b());
        this.b.notifyDataSetChanged();
    }

    class a extends zb {
        final /* synthetic */ List f;
        final /* synthetic */ List g;
        final /* synthetic */ List h;
        final /* synthetic */ List i;
        final /* synthetic */ List j;

        @Override // com.applovin.impl.zb
        protected int b() {
            return c.values().length;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Context context, List list, List list2, List list3, List list4, List list5) {
            super(context);
            this.f = list;
            this.g = list2;
            this.h = list3;
            this.i = list4;
            this.j = list5;
        }

        @Override // com.applovin.impl.zb
        protected int d(int i) {
            if (i == c.MISSING_TC_NETWORKS.ordinal()) {
                return this.f.size();
            }
            if (i == c.MISSING_AC_NETWORKS.ordinal()) {
                return this.g.size();
            }
            if (i == c.LISTED_TC_NETWORKS.ordinal()) {
                return this.h.size();
            }
            if (i == c.LISTED_AC_NETWORKS.ordinal()) {
                return this.i.size();
            }
            return this.j.size();
        }

        @Override // com.applovin.impl.zb
        protected yb e(int i) {
            if (i == c.MISSING_TC_NETWORKS.ordinal()) {
                return new bj("MISSING TCF VENDORS (TC STRING)");
            }
            if (i == c.MISSING_AC_NETWORKS.ordinal()) {
                return new bj("MISSING ATP NETWORKS (AC STRING)");
            }
            if (i == c.LISTED_TC_NETWORKS.ordinal()) {
                return new bj("LISTED TCF VENDORS (TC STRING)");
            }
            if (i == c.LISTED_AC_NETWORKS.ordinal()) {
                return new bj("LISTED ATP NETWORKS (AC STRING)");
            }
            return new bj("NON-CONFIGURABLE NETWORKS");
        }

        @Override // com.applovin.impl.zb
        protected List c(int i) {
            List list;
            boolean z = true;
            if (i == c.MISSING_TC_NETWORKS.ordinal()) {
                list = this.f;
            } else if (i == c.MISSING_AC_NETWORKS.ordinal()) {
                list = this.g;
            } else {
                if (i == c.LISTED_TC_NETWORKS.ordinal()) {
                    list = this.h;
                } else if (i == c.LISTED_AC_NETWORKS.ordinal()) {
                    list = this.i;
                } else {
                    list = this.j;
                }
                z = false;
            }
            ArrayList arrayList = new ArrayList(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(l3.this.a((sn) it.next(), z));
            }
            return arrayList;
        }
    }

    class b implements zb.a {
        b() {
        }

        @Override // com.applovin.impl.zb.a
        public void a(hb hbVar, yb ybVar) {
            zp.a(ybVar.c(), ybVar.b(), l3.this);
        }
    }

    @Override // com.applovin.impl.ne
    protected com.applovin.impl.sdk.k getSdk() {
        return this.f616a;
    }

    @Override // com.applovin.impl.ne, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mediation_debugger_list_view);
        setTitle("Configured CMP Networks");
        ((ListView) findViewById(R.id.listView)).setAdapter((ListAdapter) this.b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public yb a(sn snVar, boolean z) {
        yb.b bVarA = yb.a();
        boolean zB = this.f616a.m0().b();
        sn.a aVarF = snVar.f();
        sn.a aVar = sn.a.TCF_VENDOR;
        if (aVarF != aVar && (snVar.f() != sn.a.ATP_NETWORK || !zB)) {
            bVarA.d(snVar.b());
        } else {
            String strC = snVar.c();
            String str = snVar.f() == aVar ? "IAB Vendor ID: " : "Google ATP ID: ";
            bVarA.d(strC).d(z ? -65536 : ViewCompat.MEASURED_STATE_MASK).b(strC).a(str + snVar.d()).a(true);
        }
        return bVarA.a();
    }
}
