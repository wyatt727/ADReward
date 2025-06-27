package com.mbridge.msdk.c;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.ads.mediation.pangle.PangleConstants;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: BaseUnitSetting.java */
/* loaded from: classes4.dex */
public class c {
    private String A;
    private int D;
    private int E;
    private int I;
    private String K;
    private int N;
    private List<Integer> b;
    private List<Integer> c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private long k;
    private long l;
    private int m;
    private int n;
    private int o;
    private long p;
    private long q;
    private int r;
    private String s;
    private int t;
    private int u;
    private String z;

    /* renamed from: a, reason: collision with root package name */
    private String f2504a = "";
    private int j = 0;
    private int v = 30;
    private int w = 1;
    private int x = 10;
    private int y = 60;
    private int B = 1;
    private String C = "";
    private int F = 100;
    private int G = 60;
    private int H = 5000;
    private int J = 1;
    private String L = "";
    private String M = "";

    public static k a(JSONObject jSONObject) {
        k kVar;
        k kVar2 = null;
        if (jSONObject == null) {
            return null;
        }
        try {
            kVar = new k();
        } catch (Exception e) {
            e = e;
        }
        try {
            ((c) kVar).K = jSONObject.optString(CampaignEx.JSON_KEY_CAMPAIGN_UNITID);
            String strOptString = jSONObject.optString("ab_id");
            ((c) kVar).f2504a = strOptString;
            com.mbridge.msdk.foundation.controller.c.b.put(((c) kVar).K, strOptString);
            ((c) kVar).L = jSONObject.optString("rid");
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("adSourceList");
            if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    arrayList.add(Integer.valueOf(jSONArrayOptJSONArray.optInt(i)));
                }
                ((c) kVar).b = arrayList;
            }
            JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("ad_source_timeout");
            if (jSONArrayOptJSONArray2 != null && jSONArrayOptJSONArray2.length() > 0) {
                ArrayList arrayList2 = new ArrayList();
                for (int i2 = 0; i2 < jSONArrayOptJSONArray2.length(); i2++) {
                    arrayList2.add(Integer.valueOf(jSONArrayOptJSONArray2.optInt(i2)));
                }
                ((c) kVar).c = arrayList2;
            }
            ((c) kVar).I = jSONObject.optInt("tpqn");
            ((c) kVar).f = jSONObject.optInt("aqn");
            ((c) kVar).e = jSONObject.optInt("acn");
            ((c) kVar).N = jSONObject.optInt("wt");
            int i3 = 1;
            ((c) kVar).w = jSONObject.optInt("iscasf", 1);
            ((c) kVar).H = jSONObject.optInt("spmxrt", 5000);
            ((c) kVar).p = jSONObject.optLong("current_time");
            ((c) kVar).B = jSONObject.optInt(TypedValues.CycleType.S_WAVE_OFFSET);
            ((c) kVar).q = jSONObject.optLong("dlct", 3600L);
            ((c) kVar).g = jSONObject.optInt("autoplay", 0);
            ((c) kVar).r = jSONObject.optInt("dlnet", 2);
            ((c) kVar).A = jSONObject.optString("no_offer");
            ((c) kVar).i = jSONObject.optInt("cb_type");
            ((c) kVar).l = jSONObject.optLong("clct", 86400L);
            ((c) kVar).k = jSONObject.optLong("clcq", 300L);
            ((c) kVar).F = jSONObject.optInt(CampaignEx.JSON_KEY_READY_RATE, 100);
            ((c) kVar).j = jSONObject.optInt("cd_rate", 0);
            ((c) kVar).n = jSONObject.optInt("content", 1);
            ((c) kVar).u = jSONObject.optInt("impt", 0);
            ((c) kVar).t = jSONObject.optInt("icon_type", 1);
            ((c) kVar).z = jSONObject.optString("no_ads_url", "");
            ((c) kVar).E = jSONObject.optInt("playclosebtn_tm", -1);
            ((c) kVar).D = jSONObject.optInt("play_ctdown", 0);
            ((c) kVar).m = jSONObject.optInt("close_alert", 0);
            ((c) kVar).v = jSONObject.optInt("intershowlimit", 30);
            ((c) kVar).G = jSONObject.optInt("refreshFq", 60);
            ((c) kVar).h = jSONObject.optInt("closeBtn", 0);
            int iOptInt = jSONObject.optInt("tmorl", 1);
            if (iOptInt <= 2 && iOptInt > 0) {
                i3 = iOptInt;
            }
            ((c) kVar).J = i3;
            ((c) kVar).C = jSONObject.optString(PangleConstants.PLACEMENT_ID, "");
            ((c) kVar).x = jSONObject.optInt("ltafemty", 10);
            ((c) kVar).y = jSONObject.optInt("ltorwc", 60);
            ((c) kVar).M = jSONObject.optString("vtag", "");
            return kVar;
        } catch (Exception e2) {
            e = e2;
            kVar2 = kVar;
            e.printStackTrace();
            return kVar2;
        }
    }

    public final void a(int i) {
        this.g = i;
    }

    public final String a() {
        return this.f2504a;
    }

    public final List<Integer> b() {
        return this.b;
    }

    public final void a(List<Integer> list) {
        this.b = list;
    }

    public final List<Integer> c() {
        return this.c;
    }

    public final void b(List<Integer> list) {
        this.c = list;
    }

    public final void b(int i) {
        this.d = i;
    }

    public final int d() {
        return this.e;
    }

    public final void c(int i) {
        this.e = i;
    }

    public final int e() {
        return this.f;
    }

    public final void d(int i) {
        this.f = i;
    }

    public final int f() {
        return this.h;
    }

    public final int g() {
        return this.j;
    }

    public final void e(int i) {
        this.j = i;
    }

    public final int h() {
        return this.n;
    }

    public final void f(int i) {
        this.n = i;
    }

    public final void g(int i) {
        this.o = i;
    }

    public final long i() {
        return this.p;
    }

    public final long j() {
        return this.q;
    }

    public final void a(long j) {
        this.q = j;
    }

    public final int k() {
        return this.r;
    }

    public final void h(int i) {
        this.r = i;
    }

    public final int l() {
        return this.u;
    }

    public final void i(int i) {
        this.u = i;
    }

    public final int m() {
        return this.w;
    }

    public final int n() {
        return this.x;
    }

    public final void j(int i) {
        this.x = i;
    }

    public final int o() {
        return this.y;
    }

    public final void k(int i) {
        this.y = i;
    }

    public final void a(String str) {
        this.C = str;
    }

    public final int p() {
        return this.F;
    }

    public final void l(int i) {
        this.F = i;
    }

    public final int q() {
        return this.G;
    }

    public final void m(int i) {
        this.G = i;
    }

    public final int r() {
        return this.H;
    }

    public final void n(int i) {
        this.I = i;
    }

    public final void b(String str) {
        this.K = str;
    }

    public final String s() {
        return this.L;
    }

    public final String t() {
        return this.M;
    }

    public final int u() {
        return this.N;
    }

    public final void o(int i) {
        this.N = i;
    }

    public final int v() {
        return this.g;
    }

    public String toString() {
        List<Integer> list = this.b;
        String str = "";
        if (list != null && list.size() > 0) {
            Iterator<Integer> it = this.b.iterator();
            while (it.hasNext()) {
                str = str + it.next() + ",";
            }
        }
        return "offset = " + this.B + " unitId = " + this.K + " fbPlacementId = " + this.s + str;
    }

    public final int w() {
        return this.B;
    }

    public final void p(int i) {
        this.B = i;
    }

    public final JSONObject x() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            List<Integer> list = this.b;
            if (list != null && list.size() > 0) {
                int size = list.size();
                JSONArray jSONArray = new JSONArray();
                for (int i = 0; i < size; i++) {
                    jSONArray.put(list.get(i));
                }
                jSONObject.put("adSourceList", jSONArray);
            }
            List<Integer> list2 = this.c;
            if (list2 != null && list2.size() > 0) {
                int size2 = list2.size();
                JSONArray jSONArray2 = new JSONArray();
                for (int i2 = 0; i2 < size2; i2++) {
                    jSONArray2.put(list2.get(i2));
                }
                jSONObject.put("ad_source_timeout", jSONArray2);
            }
            jSONObject.put("tpqn", this.I);
            jSONObject.put("aqn", this.f);
            jSONObject.put("acn", this.e);
            jSONObject.put("wt", this.N);
            jSONObject.put("current_time", this.p);
            jSONObject.put(TypedValues.CycleType.S_WAVE_OFFSET, this.B);
            jSONObject.put("dlct", this.q);
            jSONObject.put("autoplay", this.g);
            jSONObject.put("dlnet", this.r);
            jSONObject.put("no_offer", this.A);
            jSONObject.put("cb_type", this.i);
            jSONObject.put("clct", this.l);
            jSONObject.put("clcq", this.k);
            jSONObject.put(CampaignEx.JSON_KEY_READY_RATE, this.F);
            jSONObject.put("content", this.n);
            jSONObject.put("impt", this.u);
            jSONObject.put("icon_type", this.t);
            jSONObject.put("no_ads_url", this.z);
            jSONObject.put("playclosebtn_tm", this.E);
            jSONObject.put("play_ctdown", this.D);
            jSONObject.put("close_alert", this.m);
            jSONObject.put("closeBtn", this.h);
            jSONObject.put("refreshFq", this.G);
            jSONObject.put("countdown", this.o);
            jSONObject.put("allowSkip", this.d);
            jSONObject.put("tmorl", this.J);
            jSONObject.put(CampaignEx.JSON_KEY_CAMPAIGN_UNITID, this.K);
            jSONObject.put(PangleConstants.PLACEMENT_ID, this.C);
            jSONObject.put("ltafemty", this.x);
            jSONObject.put("ltorwc", this.y);
            jSONObject.put("vtag", this.M);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return jSONObject;
    }
}
