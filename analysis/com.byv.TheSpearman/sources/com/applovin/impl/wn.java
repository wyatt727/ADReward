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
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class wn extends ne {

    /* renamed from: a, reason: collision with root package name */
    private com.applovin.impl.sdk.k f1137a;
    private List b;
    private zb c;
    private List d;
    private ListView f;

    public wn() {
        this.communicatorTopics.add("network_sdk_version_updated");
    }

    public void initialize(List<fe> list, com.applovin.impl.sdk.k kVar) {
        this.f1137a = kVar;
        this.b = list;
        this.d = a(list);
        a aVar = new a(this, list);
        this.c = aVar;
        aVar.a(new b(list, kVar));
        this.c.notifyDataSetChanged();
    }

    class a extends zb {
        final /* synthetic */ List f;

        @Override // com.applovin.impl.zb
        protected yb a() {
            return new yb.b(yb.c.SECTION_CENTERED).d("Select a network to load test ads using your MAX ad unit configuration. Once enabled, this functionality will reset on the next app session.").a();
        }

        @Override // com.applovin.impl.zb
        protected int b() {
            return 1;
        }

        @Override // com.applovin.impl.zb
        protected yb e(int i) {
            return new bj("TEST MODE NETWORKS");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Context context, List list) {
            super(context);
            this.f = list;
        }

        @Override // com.applovin.impl.zb
        protected int d(int i) {
            return this.f.size();
        }

        @Override // com.applovin.impl.zb
        protected List c(int i) {
            return wn.this.d;
        }
    }

    class b implements zb.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f1138a;
        final /* synthetic */ com.applovin.impl.sdk.k b;

        b(List list, com.applovin.impl.sdk.k kVar) {
            this.f1138a = list;
            this.b = kVar;
        }

        @Override // com.applovin.impl.zb.a
        public void a(hb hbVar, yb ybVar) {
            List listSingletonList = Collections.singletonList(((fe) this.f1138a.get(hbVar.a())).m());
            if (listSingletonList.equals(this.b.n0().b())) {
                this.b.n0().a((List) null);
            } else {
                this.b.n0().a(listSingletonList);
            }
            wn.this.c.notifyDataSetChanged();
        }
    }

    class c extends xf {
        final /* synthetic */ fe p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(fe feVar, Context context, fe feVar2) {
            super(feVar, context);
            this.p = feVar2;
        }

        @Override // com.applovin.impl.yb
        public SpannedString k() {
            return StringUtils.createSpannedString(this.p.g(), o() ? ViewCompat.MEASURED_STATE_MASK : -7829368, 18, 1);
        }

        @Override // com.applovin.impl.xf, com.applovin.impl.yb
        public int d() {
            if (Collections.singletonList(this.p.m()).equals(wn.this.f1137a.n0().b())) {
                return R.drawable.applovin_ic_check_mark_borderless;
            }
            return 0;
        }

        @Override // com.applovin.impl.xf, com.applovin.impl.yb
        public int e() {
            if (Collections.singletonList(this.p.m()).equals(wn.this.f1137a.n0().b())) {
                return -16776961;
            }
            return super.e();
        }
    }

    private List a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            fe feVar = (fe) it.next();
            arrayList.add(new c(feVar, this, feVar));
        }
        return arrayList;
    }

    @Override // com.applovin.impl.ne, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle("Select Test Mode Network");
        setContentView(R.layout.mediation_debugger_list_view);
        ListView listView = (ListView) findViewById(R.id.listView);
        this.f = listView;
        listView.setAdapter((ListAdapter) this.c);
    }

    @Override // com.applovin.impl.ne
    protected com.applovin.impl.sdk.k getSdk() {
        return this.f1137a;
    }

    @Override // com.applovin.impl.ne, com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        this.d = a(this.b);
        this.c.notifyDataSetChanged();
    }
}
