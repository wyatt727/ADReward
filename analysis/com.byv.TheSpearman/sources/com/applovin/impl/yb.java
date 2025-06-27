package com.applovin.impl;

import android.content.Context;
import android.text.SpannedString;
import android.text.TextUtils;
import androidx.core.view.ViewCompat;
import com.applovin.sdk.R;

/* loaded from: classes.dex */
public class yb {

    /* renamed from: a, reason: collision with root package name */
    protected c f1200a;
    protected boolean b;
    protected SpannedString c;
    protected SpannedString d;
    protected String e;
    protected String f;
    protected int g;
    protected int h;
    protected int i;
    protected int j;
    protected int k;
    protected int l;
    protected boolean m;

    public static b a() {
        return a(c.RIGHT_DETAIL);
    }

    public static int n() {
        return c.COUNT.c();
    }

    public static b a(c cVar) {
        return new b(cVar);
    }

    public enum c {
        SECTION(0),
        SECTION_CENTERED(1),
        SIMPLE(2),
        DETAIL(3),
        RIGHT_DETAIL(4),
        COUNT(5);


        /* renamed from: a, reason: collision with root package name */
        private final int f1202a;

        c(int i2) {
            this.f1202a = i2;
        }

        public int c() {
            return this.f1202a;
        }

        public int b() {
            if (this == SECTION) {
                return R.layout.mediation_debugger_list_section;
            }
            if (this == SECTION_CENTERED) {
                return R.layout.mediation_debugger_list_section_centered;
            }
            if (this == SIMPLE) {
                return android.R.layout.simple_list_item_1;
            }
            if (this == DETAIL) {
                return R.layout.applovin_debugger_list_item_detail;
            }
            return R.layout.mediation_debugger_list_item_right_detail;
        }
    }

    private yb(b bVar) {
        this.g = 0;
        this.h = 0;
        this.i = ViewCompat.MEASURED_STATE_MASK;
        this.j = ViewCompat.MEASURED_STATE_MASK;
        this.k = 0;
        this.l = 0;
        this.f1200a = bVar.f1201a;
        this.b = bVar.b;
        this.c = bVar.c;
        this.d = bVar.d;
        this.e = bVar.e;
        this.f = bVar.f;
        this.g = bVar.g;
        this.h = bVar.h;
        this.i = bVar.i;
        this.j = bVar.j;
        this.k = bVar.k;
        this.l = bVar.l;
        this.m = bVar.m;
    }

    public int m() {
        return this.f1200a.c();
    }

    public int j() {
        return this.f1200a.b();
    }

    public boolean o() {
        return this.b;
    }

    public SpannedString k() {
        return this.c;
    }

    public SpannedString f() {
        return this.d;
    }

    public String c() {
        return this.e;
    }

    public String b() {
        return this.f;
    }

    public int h() {
        return this.g;
    }

    public int d() {
        return this.h;
    }

    public int l() {
        return this.i;
    }

    public int g() {
        return this.j;
    }

    public int i() {
        return this.k;
    }

    public int e() {
        return this.l;
    }

    public boolean p() {
        return this.m;
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        final c f1201a;
        boolean b;
        SpannedString c;
        SpannedString d;
        String e;
        String f;
        int g = 0;
        int h = 0;
        int i = ViewCompat.MEASURED_STATE_MASK;
        int j = ViewCompat.MEASURED_STATE_MASK;
        int k = 0;
        int l = 0;
        boolean m;

        public b(c cVar) {
            this.f1201a = cVar;
        }

        public b d(String str) {
            return b(!TextUtils.isEmpty(str) ? new SpannedString(str) : null);
        }

        public b c(String str) {
            return a(!TextUtils.isEmpty(str) ? new SpannedString(str) : null);
        }

        public b b(String str) {
            this.e = str;
            return this;
        }

        public b a(String str) {
            this.f = str;
            return this;
        }

        public b d(int i) {
            this.i = i;
            return this;
        }

        public b c(int i) {
            this.j = i;
            return this;
        }

        public b a(int i) {
            this.h = i;
            return this;
        }

        public b b(int i) {
            this.l = i;
            return this;
        }

        public b a(Context context) {
            this.h = R.drawable.applovin_ic_disclosure_arrow;
            this.l = r3.a(R.color.applovin_sdk_disclosureButtonColor, context);
            return this;
        }

        public b b(boolean z) {
            this.m = z;
            return this;
        }

        public b a(boolean z) {
            this.b = z;
            return this;
        }

        public b b(SpannedString spannedString) {
            this.c = spannedString;
            return this;
        }

        public b a(SpannedString spannedString) {
            this.d = spannedString;
            return this;
        }

        public yb a() {
            return new yb(this);
        }
    }

    protected yb(c cVar) {
        this.g = 0;
        this.h = 0;
        this.i = ViewCompat.MEASURED_STATE_MASK;
        this.j = ViewCompat.MEASURED_STATE_MASK;
        this.k = 0;
        this.l = 0;
        this.f1200a = cVar;
    }
}
