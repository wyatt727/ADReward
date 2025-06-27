package com.applovin.impl;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;

/* loaded from: classes.dex */
public class pg {

    /* renamed from: a, reason: collision with root package name */
    private final String f782a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final int f;
    private final int g;
    private final String h;
    private final JSONArray i;
    private final List j;
    private final List k;

    /* JADX INFO: Access modifiers changed from: private */
    public static String a() {
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String b() {
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static JSONArray c() {
        return new JSONArray();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static List d() {
        return new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static List e() {
        return new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String f() {
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String g() {
        return "";
    }

    public static a o() {
        return new a();
    }

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private boolean f783a;
        private String b;
        private boolean c;
        private String d;
        private boolean e;
        private String f;
        private boolean g;
        private String h;
        private String i;
        private int j;
        private int k;
        private String l;
        private boolean m;
        private JSONArray n;
        private boolean o;
        private List p;
        private boolean q;
        private List r;

        a() {
        }

        public String toString() {
            return "OpenRtbAdConfiguration.Builder(version$value=" + this.b + ", title$value=" + this.d + ", advertiser$value=" + this.f + ", body$value=" + this.h + ", mainImageUrl=" + this.i + ", mainImageWidth=" + this.j + ", mainImageHeight=" + this.k + ", clickDestinationUrl=" + this.l + ", clickTrackingUrls$value=" + this.n + ", jsTrackers$value=" + this.p + ", impressionUrls$value=" + this.r + ")";
        }

        public a a(String str) {
            this.f = str;
            this.e = true;
            return this;
        }

        public a b(String str) {
            this.h = str;
            this.g = true;
            return this;
        }

        public a c(String str) {
            this.l = str;
            return this;
        }

        public a d(String str) {
            this.i = str;
            return this;
        }

        public a e(String str) {
            this.d = str;
            this.c = true;
            return this;
        }

        public a f(String str) {
            this.b = str;
            this.f783a = true;
            return this;
        }

        public pg a() {
            String strG = this.b;
            if (!this.f783a) {
                strG = pg.g();
            }
            String str = strG;
            String strF = this.d;
            if (!this.c) {
                strF = pg.f();
            }
            String str2 = strF;
            String strA = this.f;
            if (!this.e) {
                strA = pg.a();
            }
            String str3 = strA;
            String strB = this.h;
            if (!this.g) {
                strB = pg.b();
            }
            String str4 = strB;
            JSONArray jSONArrayC = this.n;
            if (!this.m) {
                jSONArrayC = pg.c();
            }
            JSONArray jSONArray = jSONArrayC;
            List listE = this.p;
            if (!this.o) {
                listE = pg.e();
            }
            List list = listE;
            List listD = this.r;
            if (!this.q) {
                listD = pg.d();
            }
            return new pg(str, str2, str3, str4, this.i, this.j, this.k, this.l, jSONArray, list, listD);
        }

        public a b(List list) {
            this.p = list;
            this.o = true;
            return this;
        }

        public a a(JSONArray jSONArray) {
            this.n = jSONArray;
            this.m = true;
            return this;
        }

        public a b(int i) {
            this.j = i;
            return this;
        }

        public a a(List list) {
            this.r = list;
            this.q = true;
            return this;
        }

        public a a(int i) {
            this.k = i;
            return this;
        }
    }

    pg(String str, String str2, String str3, String str4, String str5, int i, int i2, String str6, JSONArray jSONArray, List list, List list2) {
        this.f782a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = i;
        this.g = i2;
        this.h = str6;
        this.i = jSONArray;
        this.j = list;
        this.k = list2;
    }

    public String z() {
        return this.f782a;
    }

    public String y() {
        return this.b;
    }

    public String p() {
        return this.c;
    }

    public String q() {
        return this.d;
    }

    public String w() {
        return this.e;
    }

    public int x() {
        return this.f;
    }

    public int v() {
        return this.g;
    }

    public String r() {
        return this.h;
    }

    public JSONArray s() {
        return this.i;
    }

    public List u() {
        return this.j;
    }

    public List t() {
        return this.k;
    }
}
