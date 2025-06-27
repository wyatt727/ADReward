package com.applovin.impl;

import android.content.Context;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.applovin.impl.yb;
import com.applovin.sdk.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class jr extends ne {

    /* renamed from: a, reason: collision with root package name */
    private String f578a;
    private com.applovin.impl.sdk.k b;
    private zb c;

    public void initialize(String str, List<String> list, com.applovin.impl.sdk.k kVar) {
        this.f578a = str;
        this.b = kVar;
        a aVar = new a(this, a(list));
        this.c = aVar;
        aVar.notifyDataSetChanged();
    }

    class a extends zb {
        final /* synthetic */ List f;

        @Override // com.applovin.impl.zb
        protected int b() {
            return 1;
        }

        @Override // com.applovin.impl.zb
        protected yb e(int i) {
            return new bj("KEYWORDS");
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
            return this.f;
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
        setTitle(this.f578a);
        ListView listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter((ListAdapter) this.c);
        listView.setDividerHeight(0);
    }

    private List a(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(yb.a(yb.c.DETAIL).d(((String) it.next()).replace("1:", "+").replace("0:", "-")).a());
        }
        return arrayList;
    }
}
