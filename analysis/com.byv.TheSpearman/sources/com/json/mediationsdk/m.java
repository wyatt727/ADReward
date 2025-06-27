package com.json.mediationsdk;

import com.json.i1;
import com.json.mediationsdk.IronSource;
import com.json.mediationsdk.adunit.adapter.utility.AdInfo;
import com.json.mediationsdk.impressionData.ImpressionData;
import com.json.mediationsdk.impressionData.ImpressionDataListener;
import com.json.mediationsdk.logger.IronLog;
import com.json.w;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    private HashSet<ImpressionDataListener> f1969a;
    protected w b;
    protected IronSourceSegment c;
    protected AdInfo d;

    public m(HashSet<ImpressionDataListener> hashSet, IronSourceSegment ironSourceSegment) {
        new HashSet();
        this.f1969a = hashSet;
        this.b = new w();
        this.c = ironSourceSegment;
    }

    protected void a(i1 i1Var, String str) throws JSONException {
        if (i1Var == null) {
            IronLog.INTERNAL.verbose("no auctionResponseItem or listener");
            return;
        }
        ImpressionData impressionDataA = i1Var.a(str);
        if (impressionDataA != null) {
            Iterator<ImpressionDataListener> it = this.f1969a.iterator();
            while (it.hasNext()) {
                ImpressionDataListener next = it.next();
                IronLog.CALLBACK.info("onImpressionSuccess " + next.getClass().getSimpleName() + ": " + impressionDataA);
                next.onImpressionSuccess(impressionDataA);
            }
        }
    }

    protected void a(IronSource.AD_UNIT ad_unit) {
        this.b.a(ad_unit, false);
    }

    public void a(IronSourceSegment ironSourceSegment) {
        this.c = ironSourceSegment;
    }

    public void a(ImpressionData impressionData) {
        if (impressionData != null) {
            this.d = new AdInfo(impressionData);
        }
    }

    public void a(ImpressionDataListener impressionDataListener) {
        synchronized (this) {
            this.f1969a.remove(impressionDataListener);
        }
    }

    protected void a(JSONObject jSONObject, IronSource.AD_UNIT ad_unit) {
        this.b.a(ad_unit, jSONObject != null ? jSONObject.optBoolean(d.f, false) : false);
    }

    public void b(ImpressionDataListener impressionDataListener) {
        synchronized (this) {
            this.f1969a.add(impressionDataListener);
        }
    }

    public void c() {
        synchronized (this) {
            this.f1969a.clear();
        }
    }

    protected String e() {
        return "fallback_" + System.currentTimeMillis();
    }

    public void f() {
        this.d = null;
    }
}
