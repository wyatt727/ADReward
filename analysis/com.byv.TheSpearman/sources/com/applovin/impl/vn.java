package com.applovin.impl;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannedString;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.core.view.ViewCompat;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.yb;
import com.applovin.impl.zb;
import com.applovin.sdk.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class vn extends ne {

    /* renamed from: a, reason: collision with root package name */
    private com.applovin.impl.sdk.k f1102a;
    private List b;
    private List c;
    private zb d;
    private List f;
    private List g;
    private ListView h;

    enum c {
        BIDDERS,
        WATERFALL,
        COUNT
    }

    public vn() {
        this.communicatorTopics.add("network_sdk_version_updated");
    }

    public void initialize(List<ec> list, List<ec> list2, final com.applovin.impl.sdk.k kVar) {
        this.f1102a = kVar;
        this.b = list;
        this.c = list2;
        this.f = a(list);
        this.g = a(list2);
        a aVar = new a(this);
        this.d = aVar;
        aVar.a(new zb.a() { // from class: com.applovin.impl.vn$$ExternalSyntheticLambda0
            @Override // com.applovin.impl.zb.a
            public final void a(hb hbVar, yb ybVar) {
                this.f$0.a(kVar, hbVar, ybVar);
            }
        });
        this.d.notifyDataSetChanged();
    }

    class a extends zb {
        @Override // com.applovin.impl.zb
        protected yb a() {
            return new yb.b(yb.c.SECTION_CENTERED).d("Select a network to load ads using your MAX ad unit configuration. Once enabled, this functionality will reset on the next app session.").a();
        }

        @Override // com.applovin.impl.zb
        protected int b() {
            return c.COUNT.ordinal();
        }

        a(Context context) {
            super(context);
        }

        @Override // com.applovin.impl.zb
        protected int d(int i) {
            return i == c.BIDDERS.ordinal() ? vn.this.f.size() : vn.this.g.size();
        }

        @Override // com.applovin.impl.zb
        protected yb e(int i) {
            if (i == c.BIDDERS.ordinal()) {
                return new bj("BIDDERS");
            }
            return new bj("WATERFALL");
        }

        @Override // com.applovin.impl.zb
        protected List c(int i) {
            return i == c.BIDDERS.ordinal() ? vn.this.f : vn.this.g;
        }
    }

    class b extends xf {
        final /* synthetic */ ec p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(fe feVar, Context context, ec ecVar) {
            super(feVar, context);
            this.p = ecVar;
        }

        @Override // com.applovin.impl.yb
        public SpannedString k() {
            return StringUtils.createSpannedString(this.p.a(), o() ? ViewCompat.MEASURED_STATE_MASK : -7829368, 18, 1);
        }

        @Override // com.applovin.impl.xf, com.applovin.impl.yb
        public int d() {
            if (vn.this.f1102a.n0().b() == null || !vn.this.f1102a.n0().b().equals(this.p.b())) {
                return 0;
            }
            return R.drawable.applovin_ic_check_mark_borderless;
        }

        @Override // com.applovin.impl.xf, com.applovin.impl.yb
        public int e() {
            if (vn.this.f1102a.n0().b() == null || !vn.this.f1102a.n0().b().equals(this.p.b())) {
                return super.e();
            }
            return -16776961;
        }
    }

    private List a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ec ecVar = (ec) it.next();
            arrayList.add(new b(ecVar.d(), this, ecVar));
        }
        return arrayList;
    }

    @Override // com.applovin.impl.ne, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle("Select Live Network");
        setContentView(R.layout.mediation_debugger_list_view);
        ListView listView = (ListView) findViewById(R.id.listView);
        this.h = listView;
        listView.setAdapter((ListAdapter) this.d);
    }

    @Override // com.applovin.impl.ne
    protected com.applovin.impl.sdk.k getSdk() {
        return this.f1102a;
    }

    @Override // com.applovin.impl.ne, com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        this.f = a(this.b);
        this.g = a(this.c);
        this.d.c();
    }

    private ec a(hb hbVar) {
        if (hbVar.b() == c.BIDDERS.ordinal()) {
            return (ec) this.b.get(hbVar.a());
        }
        return (ec) this.c.get(hbVar.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(com.applovin.impl.sdk.k kVar, hb hbVar, yb ybVar) {
        List listB = a(hbVar).b();
        if (listB.equals(kVar.n0().b())) {
            kVar.n0().a((List) null);
        } else {
            kVar.n0().a(listB);
        }
        this.d.notifyDataSetChanged();
    }
}
