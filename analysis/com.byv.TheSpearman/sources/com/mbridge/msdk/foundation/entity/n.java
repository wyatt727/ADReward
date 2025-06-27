package com.mbridge.msdk.foundation.entity;

import android.content.Context;
import android.text.TextUtils;
import com.json.m4;
import com.json.t2;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.foundation.tools.z;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: VideoReportData.java */
/* loaded from: classes4.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public static int f2819a = 1;
    public static int b;
    private String A;
    private String B;
    private String C;
    private String D;
    private int E;
    private String F;
    private String G;
    private String I;
    private String J;
    private String K;
    private int L;
    private long M;
    private String N;
    private int O;
    private String d;
    private int e;
    private int g;
    private String h;
    private String i;
    private String j;
    private String k;
    private String l;
    private String m;
    private String n;
    private String o;
    private String p;
    private String q;
    private int r;
    private String s;
    private String t;
    private String u;
    private int w;
    private String x;
    private String y;
    private String z;
    private Map<String, String> c = null;
    private int f = 0;
    private int v = 0;
    private int H = 0;

    public n(String str, int i, int i2, int i3, int i4, String str2, String str3, int i5, String str4, int i6, String str5) {
        this.s = str;
        this.w = i;
        this.x = str5;
        this.r = i2;
        this.O = i3;
        this.L = i4;
        try {
            if (!TextUtils.isEmpty(str2)) {
                this.y = URLEncoder.encode(str2, m4.M);
            }
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        this.z = str3;
        this.E = i5;
        this.k = str4;
        this.M = i6;
    }

    public n() {
    }

    public n(String str, int i, String str2, String str3, String str4) {
        this.s = str;
        this.x = str4;
        this.w = i;
        if (!TextUtils.isEmpty(str2)) {
            try {
                this.y = URLEncoder.encode(str2, m4.M);
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
        this.z = str3;
    }

    public n(String str, int i, int i2, String str2, int i3, String str3, int i4, String str4) {
        this.s = str;
        this.w = i;
        this.x = str4;
        this.L = i2;
        if (!TextUtils.isEmpty(str2)) {
            try {
                this.y = URLEncoder.encode(str2, m4.M);
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
        this.E = i3;
        this.k = str3;
        this.M = i4;
    }

    public n(Context context, CampaignEx campaignEx, int i, String str, long j, int i2) {
        if (i2 == 1 || i2 == 287 || i2 == 94) {
            this.s = "m_download_end";
        } else if (i2 == 95) {
            this.s = "2000025";
        }
        int iL = z.l(context);
        this.w = iL;
        this.x = z.a(context, iL);
        this.L = campaignEx.getVideoLength();
        this.A = campaignEx.getRequestId();
        this.B = campaignEx.getRequestIdNotice();
        if (!TextUtils.isEmpty(this.y)) {
            try {
                this.y = URLEncoder.encode(campaignEx.getNoticeUrl() == null ? campaignEx.getClickURL() : campaignEx.getNoticeUrl(), m4.M);
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
        this.E = i;
        this.k = str;
        this.M = j == 0 ? campaignEx.getVideoSize() : j;
    }

    public n(String str, String str2, String str3, String str4, String str5, String str6, int i, String str7) {
        this.s = str;
        this.o = str2;
        this.J = str3;
        this.t = str4;
        this.K = str5;
        this.h = str6;
        this.w = i;
        this.x = str7;
    }

    public n(String str) {
        this.p = str;
    }

    public n(String str, int i, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.s = str;
        this.E = i;
        this.k = str2;
        try {
            if (!TextUtils.isEmpty(str3)) {
                this.m = URLEncoder.encode(str3, m4.M);
            }
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        this.h = str4;
        this.K = str5;
        this.z = str6;
        this.l = str7;
        if (Integer.valueOf(str2).intValue() > com.mbridge.msdk.foundation.same.a.K) {
            this.E = 2;
        }
    }

    public n(String str, String str2, String str3, String str4, String str5, int i) {
        this.s = str;
        this.h = str2;
        this.A = str3;
        this.B = str4;
        this.K = str5;
        this.w = i;
    }

    public n(String str, String str2, String str3, String str4, String str5, int i, int i2, String str6) {
        this.s = str;
        this.h = str2;
        this.A = str3;
        this.B = str4;
        this.K = str5;
        this.w = i;
        this.z = str6;
        this.g = i2;
    }

    public static String a(List<n> list) {
        if (list == null || list.size() <= 0) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        Iterator<n> it = list.iterator();
        while (it.hasNext()) {
            n next = it.next();
            if (next.C != null) {
                stringBuffer.append("resource_type=" + next.C + t2.i.c);
            }
            if (next.i != null) {
                stringBuffer.append("creative=" + next.i + t2.i.c);
            }
            Iterator<n> it2 = it;
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                stringBuffer.append("key=" + next.s + t2.i.c);
                stringBuffer.append("network_type=" + next.w + t2.i.c);
                stringBuffer.append("network_str=" + next.x + t2.i.c);
                stringBuffer.append("result=" + next.E + t2.i.c);
                stringBuffer.append("duration=" + next.k + t2.i.c);
                stringBuffer.append("video_size=" + next.M + t2.i.c);
                stringBuffer.append("video_length=" + next.L + t2.i.c);
                stringBuffer.append("reason=" + next.h() + t2.i.c);
                stringBuffer.append("cid=" + next.h + t2.i.c);
                stringBuffer.append("video_url=" + next.N + t2.i.c);
                stringBuffer.append("rid=" + next.A + t2.i.c);
                stringBuffer.append("rid_n=" + next.B + t2.i.c);
                stringBuffer.append("unit_id=" + next.K + t2.i.c);
                StringBuilder sb = new StringBuilder();
                sb.append("offer_url=");
                sb.append(next.y);
                stringBuffer.append(sb.toString());
                stringBuffer.append("\n");
            } else {
                stringBuffer.append("key=" + next.s + t2.i.c);
                stringBuffer.append("result=" + next.E + t2.i.c);
                stringBuffer.append("duration=" + next.k + t2.i.c);
                stringBuffer.append("video_size=" + next.M + t2.i.c);
                stringBuffer.append("video_length=" + next.L + t2.i.c);
                stringBuffer.append("reason=" + next.h() + t2.i.c);
                stringBuffer.append("cid=" + next.h + t2.i.c);
                stringBuffer.append("video_url=" + next.N + t2.i.c);
                stringBuffer.append("rid=" + next.A + t2.i.c);
                stringBuffer.append("rid_n=" + next.B + t2.i.c);
                stringBuffer.append("unit_id=" + next.K + t2.i.c);
                StringBuilder sb2 = new StringBuilder();
                sb2.append("offer_url=");
                sb2.append(next.y);
                stringBuffer.append(sb2.toString());
                stringBuffer.append("\n");
            }
            it = it2;
        }
        return stringBuffer.toString();
    }

    public static String b(List<n> list) {
        if (list == null || list.size() <= 0) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (n nVar : list) {
            stringBuffer.append("key=" + nVar.s + t2.i.c);
            stringBuffer.append("result=" + nVar.E + t2.i.c);
            stringBuffer.append("duration=" + nVar.k + t2.i.c);
            stringBuffer.append("endcard_url=" + nVar.m + t2.i.c);
            stringBuffer.append("cid=" + nVar.h + t2.i.c);
            stringBuffer.append("unit_id=" + nVar.K + t2.i.c);
            stringBuffer.append("reason=" + nVar.h() + t2.i.c);
            stringBuffer.append("ad_type=" + nVar.d + t2.i.c);
            stringBuffer.append("rid=" + nVar.A + t2.i.c);
            stringBuffer.append("rid_n=" + nVar.B + t2.i.c);
            stringBuffer.append("type=" + nVar.l + t2.i.c);
            StringBuilder sb = new StringBuilder();
            sb.append("adspace_t=");
            sb.append(nVar.e);
            stringBuffer.append(sb.toString());
            stringBuffer.append("\n");
        }
        return stringBuffer.toString();
    }

    public static String a(n nVar) {
        if (nVar == null) {
            return null;
        }
        try {
            StringBuffer stringBuffer = new StringBuffer();
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                stringBuffer.append("key=" + nVar.s + t2.i.c);
                stringBuffer.append("event=" + ai.a(nVar.o) + t2.i.c);
                stringBuffer.append("template=" + ai.a(nVar.J) + t2.i.c);
                stringBuffer.append("layout=" + ai.a(nVar.t) + t2.i.c);
                stringBuffer.append("unit_id=" + ai.a(nVar.K) + t2.i.c);
                stringBuffer.append("cid=" + ai.a(nVar.h) + t2.i.c);
                stringBuffer.append("network_str=" + nVar.x + t2.i.c);
                StringBuilder sb = new StringBuilder();
                sb.append("network_type=");
                sb.append(nVar.w);
                stringBuffer.append(sb.toString());
            } else {
                stringBuffer.append("key=" + nVar.s + t2.i.c);
                stringBuffer.append("event=" + ai.a(nVar.o) + t2.i.c);
                stringBuffer.append("template=" + ai.a(nVar.J) + t2.i.c);
                stringBuffer.append("layout=" + ai.a(nVar.t) + t2.i.c);
                stringBuffer.append("unit_id=" + ai.a(nVar.K) + t2.i.c);
                stringBuffer.append("cid=" + ai.a(nVar.h) + t2.i.c);
            }
            return stringBuffer.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String c(List<n> list) {
        if (list == null) {
            return null;
        }
        try {
            if (list.size() <= 0) {
                return null;
            }
            StringBuffer stringBuffer = new StringBuffer();
            Iterator<n> it = list.iterator();
            while (it.hasNext()) {
                stringBuffer.append(it.next().p);
                stringBuffer.append("\n");
            }
            return stringBuffer.toString();
        } catch (Throwable th) {
            ad.a("VideoReportData", th.getMessage(), th);
            return null;
        }
    }

    public static String d(List<n> list) {
        if (list == null || list.size() <= 0) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (n nVar : list) {
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                stringBuffer.append("key=" + nVar.s + t2.i.c);
                stringBuffer.append("network_type=" + nVar.w + t2.i.c);
                stringBuffer.append("cid=" + nVar.h + t2.i.c);
                stringBuffer.append("image_url=" + nVar.q + t2.i.c);
                stringBuffer.append("reason=" + nVar.h() + t2.i.c);
                stringBuffer.append("rid=" + nVar.A + t2.i.c);
                stringBuffer.append("rid_n=" + nVar.B + t2.i.c);
                stringBuffer.append("unit_id=" + nVar.K + t2.i.c);
                stringBuffer.append("\n");
            } else {
                stringBuffer.append("key=" + nVar.s + t2.i.c);
                stringBuffer.append("cid=" + nVar.h + t2.i.c);
                stringBuffer.append("image_url=" + nVar.q + t2.i.c);
                stringBuffer.append("reason=" + nVar.h() + t2.i.c);
                stringBuffer.append("rid=" + nVar.A + t2.i.c);
                stringBuffer.append("rid_n=" + nVar.B + t2.i.c);
                stringBuffer.append("unit_id=" + nVar.K + t2.i.c);
                stringBuffer.append("\n");
            }
        }
        return stringBuffer.toString();
    }

    public static String e(List<n> list) {
        if (list == null || list.size() <= 0) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (n nVar : list) {
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                stringBuffer.append("key=" + nVar.s + t2.i.c);
                stringBuffer.append("network_type=" + nVar.w + t2.i.c);
                stringBuffer.append("network_str=" + nVar.x + t2.i.c);
                stringBuffer.append("reason=" + nVar.h() + t2.i.c);
                stringBuffer.append("cid=" + nVar.h + t2.i.c);
                stringBuffer.append("video_url=" + nVar.N + t2.i.c);
                stringBuffer.append("rid=" + nVar.A + t2.i.c);
                stringBuffer.append("rid_n=" + nVar.B + t2.i.c);
                stringBuffer.append("unit_id=" + nVar.K + t2.i.c);
                StringBuilder sb = new StringBuilder();
                sb.append("offer_url=");
                sb.append(nVar.y);
                stringBuffer.append(sb.toString());
                stringBuffer.append("\n");
            } else {
                stringBuffer.append("key=" + nVar.s + t2.i.c);
                stringBuffer.append("reason=" + nVar.h() + t2.i.c);
                stringBuffer.append("cid=" + nVar.h + t2.i.c);
                stringBuffer.append("video_url=" + nVar.N + t2.i.c);
                stringBuffer.append("rid=" + nVar.A + t2.i.c);
                stringBuffer.append("rid_n=" + nVar.B + t2.i.c);
                stringBuffer.append("unit_id=" + nVar.K + t2.i.c);
                StringBuilder sb2 = new StringBuilder();
                sb2.append("offer_url=");
                sb2.append(nVar.y);
                stringBuffer.append(sb2.toString());
                stringBuffer.append("\n");
            }
        }
        return stringBuffer.toString();
    }

    public static String b(n nVar) {
        if (nVar == null) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("key=" + nVar.s + t2.i.c);
        stringBuffer.append("cid=" + nVar.h + t2.i.c);
        stringBuffer.append("rid=" + nVar.A + t2.i.c);
        stringBuffer.append("rid_n=" + nVar.B + t2.i.c);
        stringBuffer.append("unit_id=" + nVar.K + t2.i.c);
        stringBuffer.append("network_type=" + nVar.w + t2.i.c);
        stringBuffer.append("mraid_type=" + nVar.v + t2.i.c);
        stringBuffer.append("platform=1");
        return stringBuffer.toString();
    }

    public static String c(n nVar) {
        if (nVar == null) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("key=" + nVar.s + t2.i.c);
        stringBuffer.append("cid=" + nVar.h + t2.i.c);
        stringBuffer.append("rid=" + nVar.A + t2.i.c);
        stringBuffer.append("rid_n=" + nVar.B + t2.i.c);
        stringBuffer.append("unit_id=" + nVar.K + t2.i.c);
        stringBuffer.append("reason=" + nVar.h() + t2.i.c);
        stringBuffer.append("case=" + nVar.g + t2.i.c);
        StringBuilder sb = new StringBuilder();
        sb.append("network_type=");
        sb.append(nVar.w);
        stringBuffer.append(sb.toString());
        return stringBuffer.toString();
    }

    public static String d(n nVar) {
        if (nVar == null) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("key=" + nVar.s + t2.i.c);
        stringBuffer.append("cid=" + nVar.h + t2.i.c);
        stringBuffer.append("unit_id=" + nVar.K + t2.i.c);
        stringBuffer.append("network_type=" + nVar.w + t2.i.c);
        stringBuffer.append("rid=" + nVar.A + t2.i.c);
        stringBuffer.append("rid_n=" + nVar.B + t2.i.c);
        StringBuilder sb = new StringBuilder();
        sb.append("reason=");
        sb.append(nVar.h());
        stringBuffer.append(sb.toString());
        stringBuffer.append("\n");
        return stringBuffer.toString();
    }

    public static String e(n nVar) {
        if (nVar == null) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("key=" + nVar.s + t2.i.c);
        stringBuffer.append("result=" + nVar.E + t2.i.c);
        stringBuffer.append("duration=" + nVar.k + t2.i.c);
        stringBuffer.append("cid=" + nVar.h + t2.i.c);
        stringBuffer.append("unit_id=" + nVar.K + t2.i.c);
        stringBuffer.append("reason=" + nVar.h() + t2.i.c);
        stringBuffer.append("ad_type=" + nVar.d + t2.i.c);
        stringBuffer.append("rid=" + nVar.A + t2.i.c);
        stringBuffer.append("rid_n=" + nVar.B + t2.i.c);
        stringBuffer.append("network_type=" + nVar.w + t2.i.c);
        stringBuffer.append("mraid_type=" + nVar.v + t2.i.c);
        stringBuffer.append("devid=" + nVar.j + t2.i.c);
        if (nVar.C != null) {
            stringBuffer.append("resource_type=" + nVar.C + t2.i.c);
        }
        if (!TextUtils.isEmpty(nVar.m)) {
            stringBuffer.append("endcard_url=" + nVar.m + t2.i.c);
        }
        stringBuffer.append("type=" + nVar.l);
        return stringBuffer.toString();
    }

    public static String f(n nVar) {
        if (nVar == null) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("key=" + nVar.s + t2.i.c);
        stringBuffer.append("cid=" + nVar.h + t2.i.c);
        stringBuffer.append("unit_id=" + nVar.K + t2.i.c);
        stringBuffer.append("network_type=" + nVar.w + t2.i.c);
        stringBuffer.append("mraid_type=" + nVar.v + t2.i.c);
        stringBuffer.append("rid_n=" + nVar.B + t2.i.c);
        StringBuilder sb = new StringBuilder();
        sb.append("rid=");
        sb.append(nVar.A);
        stringBuffer.append(sb.toString());
        return stringBuffer.toString();
    }

    public static String g(n nVar) {
        if (nVar == null) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("key=" + nVar.s + t2.i.c);
        stringBuffer.append("result=" + nVar.E + t2.i.c);
        stringBuffer.append("duration=" + nVar.k + t2.i.c);
        stringBuffer.append("cid=" + nVar.h + t2.i.c);
        stringBuffer.append("reason=" + nVar.h() + t2.i.c);
        stringBuffer.append("ad_type=" + nVar.d + t2.i.c);
        stringBuffer.append("unit_id=" + nVar.K + t2.i.c);
        stringBuffer.append("devid=" + nVar.j + t2.i.c);
        stringBuffer.append("mraid_type=" + nVar.v + t2.i.c);
        stringBuffer.append("network_type=" + nVar.w + t2.i.c);
        if (!TextUtils.isEmpty(nVar.m)) {
            stringBuffer.append("endcard_url=" + nVar.m + t2.i.c);
        }
        if (!TextUtils.isEmpty(nVar.l)) {
            stringBuffer.append("type=" + nVar.l + t2.i.c);
        }
        if (nVar.C != null) {
            stringBuffer.append("resource_type=" + nVar.C + t2.i.c);
        }
        stringBuffer.append("rid_n=" + nVar.B + t2.i.c);
        StringBuilder sb = new StringBuilder();
        sb.append("rid=");
        sb.append(nVar.A);
        stringBuffer.append(sb.toString());
        stringBuffer.append("\n");
        return stringBuffer.toString();
    }

    public static String f(List<n> list) {
        if (list == null || list.size() <= 0) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (n nVar : list) {
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                stringBuffer.append("key=" + nVar.s + t2.i.c);
                stringBuffer.append("network_type=" + nVar.w + t2.i.c);
                stringBuffer.append("result=" + nVar.E + t2.i.c);
                stringBuffer.append("cid=" + nVar.h + t2.i.c);
                stringBuffer.append("template_url=" + nVar.I + t2.i.c);
                stringBuffer.append("reason=" + nVar.h() + t2.i.c);
                stringBuffer.append("rid=" + nVar.A + t2.i.c);
                stringBuffer.append("rid_n=" + nVar.B + t2.i.c);
                stringBuffer.append("unit_id=" + nVar.K + t2.i.c);
                stringBuffer.append("\n");
            } else {
                stringBuffer.append("key=" + nVar.s + t2.i.c);
                stringBuffer.append("result=" + nVar.E + t2.i.c);
                stringBuffer.append("cid=" + nVar.h + t2.i.c);
                stringBuffer.append("template_url=" + nVar.I + t2.i.c);
                stringBuffer.append("reason=" + nVar.h() + t2.i.c);
                stringBuffer.append("rid=" + nVar.A + t2.i.c);
                stringBuffer.append("rid_n=" + nVar.B + t2.i.c);
                stringBuffer.append("unit_id=" + nVar.K + t2.i.c);
                stringBuffer.append("\n");
            }
        }
        return stringBuffer.toString();
    }

    public static String h(n nVar) {
        if (nVar == null) {
            return null;
        }
        try {
            StringBuffer stringBuffer = new StringBuffer();
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                stringBuffer.append("key=" + nVar.s + t2.i.c);
                stringBuffer.append("error=" + ai.a(nVar.n) + t2.i.c);
                stringBuffer.append("template_url=" + ai.a(nVar.I) + t2.i.c);
                stringBuffer.append("unit_id=" + ai.a(nVar.K) + t2.i.c);
                stringBuffer.append("cid=" + ai.a(nVar.h) + t2.i.c);
                stringBuffer.append("network_str=" + nVar.x + t2.i.c);
                StringBuilder sb = new StringBuilder();
                sb.append("network_type=");
                sb.append(nVar.w);
                stringBuffer.append(sb.toString());
            } else {
                stringBuffer.append("key=" + nVar.s + t2.i.c);
                stringBuffer.append("error=" + ai.a(nVar.n) + t2.i.c);
                stringBuffer.append("template_url=" + ai.a(nVar.I) + t2.i.c);
                stringBuffer.append("unit_id=" + ai.a(nVar.K) + t2.i.c);
                stringBuffer.append("cid=" + ai.a(nVar.h) + t2.i.c);
            }
            return stringBuffer.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public final String a() {
        return this.s;
    }

    public final void a(String str) {
        this.s = str;
    }

    public final String b() {
        return this.C;
    }

    public final void b(String str) {
        this.C = str;
    }

    public final String c() {
        return this.K;
    }

    public final void c(String str) {
        this.K = str;
    }

    public final String d() {
        return this.d;
    }

    public final void d(String str) {
        this.d = str;
    }

    public final String e() {
        return this.h;
    }

    public final void e(String str) {
        this.h = str;
    }

    public final String f() {
        return this.A;
    }

    public final void f(String str) {
        this.A = str;
    }

    public final String g() {
        return this.B;
    }

    public final void g(String str) {
        this.B = str;
    }

    public final String h() {
        return TextUtils.isEmpty(this.z) ? "" : this.z;
    }

    public final void h(String str) {
        this.z = str;
    }

    public final String i() {
        return this.i;
    }

    public final void i(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.i = URLEncoder.encode(str);
    }

    public final String j() {
        return this.j;
    }

    public final void j(String str) {
        this.j = str;
    }

    public final int k() {
        return this.w;
    }

    public final void a(int i) {
        this.w = i;
    }

    public final String l() {
        return this.x;
    }

    public final void k(String str) {
        this.x = str;
    }

    public final int m() {
        return this.E;
    }

    public final void b(int i) {
        this.E = i;
    }

    public final String n() {
        return this.k;
    }

    public final void l(String str) {
        this.k = str;
    }

    public final long o() {
        return this.M;
    }

    public final int p() {
        return this.L;
    }

    public final String q() {
        return this.N;
    }

    public final void m(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.N = URLEncoder.encode(str, m4.M);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final String r() {
        return this.y;
    }

    public final String s() {
        return this.m;
    }

    public final void n(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.m = URLEncoder.encode(str, m4.M);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final String t() {
        return this.l;
    }

    public final void o(String str) {
        this.l = str;
    }

    public final int u() {
        return this.e;
    }

    public final void c(int i) {
        this.e = i;
    }

    public final String v() {
        return this.q;
    }

    public final void p(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.q = URLEncoder.encode(str, m4.M);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final int w() {
        return this.r;
    }

    public final int x() {
        return this.O;
    }

    public final int y() {
        return this.v;
    }

    public final void d(int i) {
        this.v = i;
    }

    public final String z() {
        return this.I;
    }

    public final void q(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.I = URLEncoder.encode(str, m4.M);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }

    public final void r(String str) {
        this.n = str;
    }

    public final void s(String str) {
        this.u = str;
    }

    public final void t(String str) {
        this.D = str;
    }

    public final void u(String str) {
        this.F = str;
    }

    public final void v(String str) {
        this.G = str;
    }

    public final int A() {
        return this.H;
    }

    public final void e(int i) {
        this.H = i;
    }

    public final String toString() {
        return "RewardReportData [key=" + this.s + ", networkType=" + this.w + ", isCompleteView=" + this.r + ", watchedMillis=" + this.O + ", videoLength=" + this.L + ", offerUrl=" + this.y + ", reason=" + this.z + ", result=" + this.E + ", duration=" + this.k + ", videoSize=" + this.M + t2.i.e;
    }

    public final void a(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        if (this.c == null) {
            this.c = new HashMap();
        }
        try {
            this.c.put(str, str2);
        } catch (Exception unused) {
        }
    }

    public final String b(String str, String str2) {
        Map<String, String> map;
        if (TextUtils.isEmpty(str) || (map = this.c) == null) {
            return str2;
        }
        try {
            String str3 = map.get(str);
            return TextUtils.isEmpty(str3) ? str2 : str3;
        } catch (Exception unused) {
            return str2;
        }
    }
}
