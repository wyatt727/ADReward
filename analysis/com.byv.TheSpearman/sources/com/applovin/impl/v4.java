package com.applovin.impl;

import android.app.Activity;
import android.content.Context;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class v4 extends zb {
    private com.applovin.impl.sdk.k f;
    private List g;
    private final AtomicBoolean h;
    private List i;

    public enum a {
        RECENT_ADS,
        COUNT
    }

    @Override // com.applovin.impl.zb
    protected int b() {
        return a.COUNT.ordinal();
    }

    public String toString() {
        return "CreativeDebuggerListAdapter{isInitialized=" + this.h.get() + "}";
    }

    public v4(Context context) {
        super(context);
        this.h = new AtomicBoolean();
        this.i = new ArrayList();
    }

    public void g() {
        this.h.compareAndSet(true, false);
    }

    public boolean f() {
        return this.i.size() == 0;
    }

    public com.applovin.impl.sdk.k e() {
        return this.f;
    }

    @Override // com.applovin.impl.zb
    protected yb e(int i) {
        return new bj("RECENT ADS");
    }

    public List d() {
        return this.g;
    }

    @Override // com.applovin.impl.zb
    protected List c(int i) {
        return this.i;
    }

    private List a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new t6((u6) it.next(), this.f1235a));
        }
        return arrayList;
    }

    @Override // com.applovin.impl.zb
    protected int d(int i) {
        return this.i.size();
    }

    public void a(List list, com.applovin.impl.sdk.k kVar) {
        Activity activityP0;
        this.f = kVar;
        this.g = list;
        if (!(this.f1235a instanceof Activity) && (activityP0 = kVar.p0()) != null) {
            this.f1235a = activityP0;
        }
        if (list != null && this.h.compareAndSet(false, true)) {
            this.i = a(this.g);
        }
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.v4$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.notifyDataSetChanged();
            }
        });
    }
}
