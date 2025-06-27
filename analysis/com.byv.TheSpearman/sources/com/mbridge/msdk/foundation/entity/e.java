package com.mbridge.msdk.foundation.entity;

import android.text.TextUtils;
import com.json.t2;
import com.mbridge.msdk.MBridgeConstans;
import java.util.Iterator;
import java.util.List;

/* compiled from: ClickTime.java */
/* loaded from: classes4.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private String f2810a;
    private String b;
    private String c;
    private int d;
    private int e;
    private String f;
    private String g;
    private String h;
    private int i;
    private String j;
    private int k;
    private int l;
    private String m;
    private int n;
    private String o;
    private String p;
    private int q;
    private String r;

    public e() {
    }

    public e(String str, String str2, String str3, String str4, String str5, int i, String str6, String str7, String str8, int i2, int i3, String str9, int i4, int i5, String str10, int i6, int i7, String str11) {
        this.o = str;
        this.p = str2;
        this.f2810a = str3;
        this.b = str4;
        this.j = str5;
        this.e = i;
        this.g = str6;
        this.h = str7;
        this.f = str8;
        this.q = i2;
        this.d = i3;
        this.r = str9;
        this.i = i4;
        this.k = i5;
        this.c = str10;
        this.n = i6;
        this.m = str11;
        this.l = i7;
    }

    public static String a(List<e> list) {
        if (list == null || list.size() <= 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        Iterator<e> it = list.iterator();
        while (it.hasNext()) {
            e next = it.next();
            String str = next.r;
            if (!TextUtils.isEmpty(str)) {
                String str2 = com.mbridge.msdk.foundation.controller.c.b.get(str);
                StringBuilder sb2 = new StringBuilder();
                sb2.append("u_stid=");
                if (str2 == null) {
                    str2 = "";
                }
                sb2.append(str2);
                sb2.append(t2.i.c);
                sb.append(sb2.toString());
            }
            Iterator<e> it2 = it;
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                sb.append("rid=" + next.o);
                sb.append("&rid_n=" + next.p);
                sb.append("&network_type=" + next.n);
                sb.append("&network_str=" + next.m);
                sb.append("&cid=" + next.f2810a);
                sb.append("&click_type=" + next.d);
                sb.append("&type=" + next.q);
                sb.append("&click_duration=" + next.b);
                sb.append("&key=2000013");
                sb.append("&unit_id=" + next.r);
                sb.append("&last_url=" + next.j);
                sb.append("&content=" + next.f);
                sb.append("&code=" + next.e);
                sb.append("&exception=" + next.g);
                sb.append("&header=" + next.h);
                sb.append("&landing_type=" + next.i);
                sb.append("&link_type=" + next.k);
                sb.append("&click_time=" + next.c + "\n");
            } else {
                sb.append("rid=" + next.o);
                sb.append("&rid_n=" + next.p);
                sb.append("&cid=" + next.f2810a);
                sb.append("&click_type=" + next.d);
                sb.append("&type=" + next.q);
                sb.append("&click_duration=" + next.b);
                sb.append("&key=2000013");
                sb.append("&unit_id=" + next.r);
                sb.append("&last_url=" + next.j);
                sb.append("&content=" + next.f);
                sb.append("&code=" + next.e);
                sb.append("&exception=" + next.g);
                sb.append("&header=" + next.h);
                sb.append("&landing_type=" + next.i);
                sb.append("&link_type=" + next.k);
                sb.append("&click_time=" + next.c + "\n");
            }
            it = it2;
        }
        return sb.toString();
    }

    public final void a(String str) {
        this.r = str;
    }

    public final void b(String str) {
        this.o = str;
    }

    public final void a(int i) {
        this.n = i;
    }

    public final void c(String str) {
        this.m = str;
    }

    public final void b(int i) {
        this.d = i;
    }

    public final void c(int i) {
        this.q = i;
    }

    public final void d(String str) {
        this.g = str;
    }

    public final void d(int i) {
        this.i = i;
    }

    public final void e(int i) {
        this.k = i;
    }

    public final void e(String str) {
        this.c = str;
    }

    public final void f(String str) {
        this.h = str;
    }

    public final void f(int i) {
        this.e = i;
    }

    public final void g(String str) {
        this.f = str;
    }

    public final void h(String str) {
        this.j = str;
    }

    public final void i(String str) {
        this.b = str;
    }

    public final void j(String str) {
        this.f2810a = str;
    }

    public final void k(String str) {
        this.p = str;
    }

    public static String a(e eVar) {
        if (eVar == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        String str = eVar.j;
        if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
            sb.append("rid=" + eVar.o);
            sb.append("&rid_n=" + eVar.p);
            sb.append("&network_type=" + eVar.n);
            sb.append("&network_str=" + eVar.m);
            sb.append("&click_type=" + eVar.d);
            sb.append("&type=" + eVar.q);
            sb.append("&cid=" + eVar.f2810a);
            sb.append("&click_duration=" + eVar.b);
            sb.append("&key=2000012");
            sb.append("&unit_id=" + eVar.r);
            sb.append("&last_url=" + str);
            sb.append("&code=" + eVar.e);
            sb.append("&exception=" + eVar.g);
            sb.append("&landing_type=" + eVar.i);
            sb.append("&link_type=" + eVar.k);
            sb.append("&click_time=" + eVar.c + "\n");
        } else {
            sb.append("rid=" + eVar.o);
            sb.append("&rid_n=" + eVar.p);
            sb.append("&click_type=" + eVar.d);
            sb.append("&type=" + eVar.q);
            sb.append("&cid=" + eVar.f2810a);
            sb.append("&click_duration=" + eVar.b);
            sb.append("&key=2000012");
            sb.append("&unit_id=" + eVar.r);
            sb.append("&last_url=" + str);
            sb.append("&code=" + eVar.e);
            sb.append("&exception=" + eVar.g);
            sb.append("&landing_type=" + eVar.i);
            sb.append("&link_type=" + eVar.k);
            sb.append("&click_time=" + eVar.c + "\n");
        }
        return sb.toString();
    }

    public final String toString() {
        return "ClickTime [campaignId=" + this.f2810a + ", click_duration=" + this.b + ", lastUrl=" + this.j + ", code=" + this.e + ", excepiton=" + this.g + ", header=" + this.h + ", content=" + this.f + ", type=" + this.q + ", click_type=" + this.d + t2.i.e;
    }
}
