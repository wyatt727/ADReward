package com.applovin.impl;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.core.view.ViewCompat;
import com.applovin.impl.r;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.yb;
import com.applovin.impl.zb;
import com.applovin.mediation.MaxDebuggerAdUnitDetailActivity;
import com.applovin.mediation.MaxDebuggerWaterfallKeywordsActivity;
import com.applovin.sdk.R;
import com.google.common.net.HttpHeaders;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class b0 extends ne {

    /* renamed from: a, reason: collision with root package name */
    private z f281a;
    private com.applovin.impl.sdk.k b;
    private zb c;

    public enum b {
        TARGETED_WATERFALL,
        OTHER_WATERFALLS
    }

    /* JADX INFO: Access modifiers changed from: private */
    public yb c(String str) {
        return yb.a(yb.c.RIGHT_DETAIL).b(StringUtils.createSpannedString(str, ViewCompat.MEASURED_STATE_MASK, 18, 1)).a(this).a(true).a();
    }

    public void initialize(final z zVar, final com.applovin.impl.sdk.k kVar) {
        this.f281a = zVar;
        this.b = kVar;
        a aVar = new a(this, zVar);
        this.c = aVar;
        aVar.a(new zb.a() { // from class: com.applovin.impl.b0$$ExternalSyntheticLambda3
            @Override // com.applovin.impl.zb.a
            public final void a(hb hbVar, yb ybVar) {
                this.f$0.a(kVar, zVar, hbVar, ybVar);
            }
        });
        this.c.notifyDataSetChanged();
    }

    class a extends zb {
        final /* synthetic */ z f;

        @Override // com.applovin.impl.zb
        protected List c(int i) {
            ArrayList arrayList = new ArrayList();
            a0 a0Var = (a0) this.f.g().get(i);
            arrayList.add(b0.this.c(a0Var.c()));
            if (a0Var.b() != null) {
                arrayList.add(b0.this.a("AB Test Experiment Name", a0Var.b()));
            }
            lr lrVarD = a0Var.d();
            b0 b0Var = b0.this;
            arrayList.add(b0Var.a("Device ID Targeting", b0Var.a(lrVarD.a())));
            b0 b0Var2 = b0.this;
            arrayList.add(b0Var2.a("Device Type Targeting", b0Var2.b(lrVarD.b())));
            if (lrVarD.c() != null) {
                b0 b0Var3 = b0.this;
                arrayList.add(b0Var3.a("Gender", b0Var3.a(lrVarD.c())));
            }
            if (lrVarD.f() != null && lrVarD.e() != null) {
                arrayList.add(b0.this.a(HttpHeaders.AGE, lrVarD.f() + "-" + lrVarD.e()));
            }
            if (lrVarD.d() != null) {
                arrayList.add(b0.this.b(lrVarD.d()));
            }
            return arrayList;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Context context, z zVar) {
            super(context);
            this.f = zVar;
        }

        @Override // com.applovin.impl.zb
        protected int b() {
            return this.f.g().size();
        }

        @Override // com.applovin.impl.zb
        protected int d(int i) {
            a0 a0Var = (a0) this.f.g().get(i);
            int i2 = a0Var.b() != null ? 1 : 0;
            int i3 = 2;
            lr lrVarD = a0Var.d();
            if (lrVarD.f() != null && lrVarD.e() != null) {
                i3 = 3;
            }
            if (lrVarD.c() != null) {
                i3++;
            }
            if (lrVarD.d() != null) {
                i3++;
            }
            return i2 + 1 + i3;
        }

        @Override // com.applovin.impl.zb
        protected yb e(int i) {
            if (i == b.TARGETED_WATERFALL.ordinal()) {
                return new bj("TARGETED WATERFALL FOR CURRENT DEVICE");
            }
            if (i == b.OTHER_WATERFALLS.ordinal()) {
                return new bj("OTHER WATERFALLS");
            }
            return new bj("");
        }
    }

    @Override // com.applovin.impl.ne
    protected com.applovin.impl.sdk.k getSdk() {
        return this.b;
    }

    @Override // com.applovin.impl.ne, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mediation_debugger_list_view);
        setTitle(this.f281a.d());
        ListView listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter((ListAdapter) this.c);
        listView.setDividerHeight(0);
    }

    @Override // com.applovin.impl.ne, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        zb zbVar = this.c;
        if (zbVar != null) {
            zbVar.a((zb.a) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String b(String str) {
        return str.equals("phone") ? "Phones" : str.equals("tablet") ? "Tablets" : "All";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public yb b(List list) {
        return yb.a(yb.c.DETAIL).d("Keywords").a(StringUtils.createSpannedString(list.size() + " keyword group(s)", -7829368, 14)).a(this).a(true).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String a(String str) {
        return str.equals("idfa") ? "IDFA Only" : str.equals("dnt") ? "No IDFA Only" : "All";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String a(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (str.equals("m")) {
                arrayList.add("Male");
            } else if (str.equals("f")) {
                arrayList.add("Female");
            } else {
                arrayList.add("Unknown");
            }
        }
        return b0$$ExternalSyntheticBackport0.m(", ", arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(z zVar, hb hbVar, com.applovin.impl.sdk.k kVar, MaxDebuggerAdUnitDetailActivity maxDebuggerAdUnitDetailActivity) {
        maxDebuggerAdUnitDetailActivity.initialize(zVar, (a0) zVar.g().get(hbVar.b()), null, kVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(z zVar, hb hbVar, com.applovin.impl.sdk.k kVar, MaxDebuggerWaterfallKeywordsActivity maxDebuggerWaterfallKeywordsActivity) {
        a0 a0Var = (a0) zVar.g().get(hbVar.b());
        maxDebuggerWaterfallKeywordsActivity.initialize(a0Var.c(), a0Var.d().d(), kVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(final com.applovin.impl.sdk.k kVar, final z zVar, final hb hbVar, yb ybVar) {
        if (hbVar.a() == 0) {
            r.a(this, MaxDebuggerAdUnitDetailActivity.class, kVar.e(), new r.b() { // from class: com.applovin.impl.b0$$ExternalSyntheticLambda1
                @Override // com.applovin.impl.r.b
                public final void a(Activity activity) {
                    b0.a(zVar, hbVar, kVar, (MaxDebuggerAdUnitDetailActivity) activity);
                }
            });
        } else if (ybVar.k().toString().equals("Keywords")) {
            r.a(this, MaxDebuggerWaterfallKeywordsActivity.class, kVar.e(), new r.b() { // from class: com.applovin.impl.b0$$ExternalSyntheticLambda2
                @Override // com.applovin.impl.r.b
                public final void a(Activity activity) {
                    b0.a(zVar, hbVar, kVar, (MaxDebuggerWaterfallKeywordsActivity) activity);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public yb a(String str, String str2) {
        return yb.a(yb.c.RIGHT_DETAIL).d(str).c(str2).a();
    }
}
