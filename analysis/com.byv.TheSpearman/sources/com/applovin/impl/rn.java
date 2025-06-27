package com.applovin.impl;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sn;
import com.json.mediationsdk.utils.IronSourceConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class rn implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f866a;
    private final SharedPreferences b;
    private Integer c;
    private Integer d;
    private Integer e;
    private String f;
    private String g;
    private String h;
    private String i;
    private String j;
    private final List k;

    public String j() {
        return a("CMP Name", d()) + a("CMP SDK ID", this.c) + a("CMP SDK Version", this.d) + a(qj.r.a(), this.e) + a(qj.s.a(), this.f) + a(qj.t.a(), this.g);
    }

    public Integer e() {
        return this.c;
    }

    public Integer f() {
        return this.d;
    }

    public Integer g() {
        return this.e;
    }

    public String k() {
        return this.f;
    }

    public String c() {
        return this.g;
    }

    public List i() {
        return this.k;
    }

    public rn(com.applovin.impl.sdk.k kVar) {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(com.applovin.impl.sdk.k.k());
        this.b = defaultSharedPreferences;
        this.k = new ArrayList();
        this.f866a = kVar;
        defaultSharedPreferences.registerOnSharedPreferenceChangeListener(this);
        this.c = a(qj.p.a());
        this.d = a(qj.q.a());
        this.e = h();
        this.f = (String) sj.a(qj.s, (Object) null, defaultSharedPreferences, false);
        this.g = (String) sj.a(qj.t, (Object) null, defaultSharedPreferences, false);
        this.h = (String) sj.a(qj.u, (Object) null, defaultSharedPreferences, false);
        this.i = (String) sj.a(qj.w, (Object) null, defaultSharedPreferences, false);
        this.j = (String) sj.a(qj.y, (Object) null, defaultSharedPreferences, false);
        c(this.g);
    }

    public String d() {
        return pn.a(this.c);
    }

    public boolean b() {
        return un.a(this.g);
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if (str == null) {
            this.f866a.L();
            if (com.applovin.impl.sdk.t.a()) {
                this.f866a.L().a("TcfManager", "SharedPreferences are cleared - setting all stored TC data to null");
            }
            a();
            return;
        }
        if (str.equals(qj.p.a())) {
            this.c = a(str);
            this.f866a.L();
            if (com.applovin.impl.sdk.t.a()) {
                this.f866a.L().a("TcfManager", "SharedPreferences entry updated - key: " + str + ", value: " + this.c);
            }
            this.f866a.P0();
            return;
        }
        if (str.equals(qj.q.a())) {
            this.d = a(str);
            this.f866a.L();
            if (com.applovin.impl.sdk.t.a()) {
                this.f866a.L().a("TcfManager", "SharedPreferences entry updated - key: " + str + ", value: " + this.d);
                return;
            }
            return;
        }
        if (str.equals(qj.r.a())) {
            this.e = h();
            this.f866a.L();
            if (com.applovin.impl.sdk.t.a()) {
                this.f866a.L().a("TcfManager", "SharedPreferences entry updated - key: " + str + ", value: " + this.e);
                return;
            }
            return;
        }
        if (str.equals(qj.s.a())) {
            this.f = (String) sj.a(str, (Object) null, String.class, sharedPreferences);
            this.f866a.L();
            if (com.applovin.impl.sdk.t.a()) {
                this.f866a.L().a("TcfManager", "SharedPreferences entry updated - key: " + str + ", value: " + this.f);
            }
            this.f866a.P0();
            return;
        }
        if (str.equals(qj.t.a())) {
            this.g = (String) sj.a(str, (Object) null, String.class, sharedPreferences);
            this.f866a.L();
            if (com.applovin.impl.sdk.t.a()) {
                this.f866a.L().a("TcfManager", "SharedPreferences entry updated - key: " + str + ", value: " + this.g);
            }
            c(this.g);
            b(this.g);
            return;
        }
        if (str.equals(qj.u.a())) {
            this.h = (String) sj.a(str, (Object) null, String.class, sharedPreferences);
            this.f866a.L();
            if (com.applovin.impl.sdk.t.a()) {
                this.f866a.L().a("TcfManager", "SharedPreferences entry updated - key: " + str + ", value: " + this.h);
            }
            d(this.h);
            return;
        }
        if (str.equals(qj.v.a())) {
            String str2 = (String) sj.a(str, (Object) null, String.class, sharedPreferences);
            this.f866a.L();
            if (com.applovin.impl.sdk.t.a()) {
                this.f866a.L().a("TcfManager", "SharedPreferences entry updated - key: " + str + ", value: " + str2);
                return;
            }
            return;
        }
        if (str.equals(qj.w.a())) {
            this.i = (String) sj.a(str, (Object) null, String.class, sharedPreferences);
            this.f866a.L();
            if (com.applovin.impl.sdk.t.a()) {
                this.f866a.L().a("TcfManager", "SharedPreferences entry updated - key: " + str + ", value: " + this.i);
                return;
            }
            return;
        }
        if (str.equals(qj.x.a())) {
            String str3 = (String) sj.a(str, (Object) null, String.class, sharedPreferences);
            this.f866a.L();
            if (com.applovin.impl.sdk.t.a()) {
                this.f866a.L().a("TcfManager", "SharedPreferences entry updated - key: " + str + ", value: " + str3);
                return;
            }
            return;
        }
        if (str.equals(qj.y.a())) {
            this.j = (String) sj.a(str, (Object) null, String.class, sharedPreferences);
            this.f866a.L();
            if (com.applovin.impl.sdk.t.a()) {
                this.f866a.L().a("TcfManager", "SharedPreferences entry updated - key: " + str + ", value: " + this.j);
                return;
            }
            return;
        }
        if (str.contains("IABTCF_PublisherRestrictions")) {
            String str4 = (String) sj.a(str, (Object) null, String.class, sharedPreferences);
            this.f866a.L();
            if (com.applovin.impl.sdk.t.a()) {
                this.f866a.L().a("TcfManager", "SharedPreferences entry updated - key: " + str + ", value: " + str4);
            }
        }
    }

    public Boolean c(int i) {
        String str = this.j;
        if (str == null) {
            return null;
        }
        return Boolean.valueOf(un.a(str, i - 1));
    }

    public Boolean d(int i) {
        String str = this.h;
        if (str == null) {
            return null;
        }
        return Boolean.valueOf(un.a(str, i - 1));
    }

    public Boolean b(int i) {
        String str = this.i;
        if (str == null) {
            return null;
        }
        return Boolean.valueOf(un.a(str, i - 1));
    }

    private Integer h() {
        String strA = qj.r.a();
        if (this.b.contains(strA)) {
            Integer num = (Integer) sj.a(strA, null, Integer.class, this.b, false);
            if (num != null) {
                if (num.intValue() == 1 || num.intValue() == 0) {
                    return num;
                }
                this.f866a.L();
                if (com.applovin.impl.sdk.t.a()) {
                    this.f866a.L().b("TcfManager", "Integer value (" + num + ") for " + strA + " is invalid - setting GDPR Applies to null");
                }
                return null;
            }
            Long l = (Long) sj.a(strA, null, Long.class, this.b, false);
            if (l != null) {
                if (l.longValue() != 1 && l.longValue() != 0) {
                    this.f866a.L();
                    if (com.applovin.impl.sdk.t.a()) {
                        this.f866a.L().b("TcfManager", "Long value (" + l + ") for " + strA + " is invalid - setting GDPR Applies to null");
                    }
                    return null;
                }
                return Integer.valueOf(l.intValue());
            }
            Boolean bool = (Boolean) sj.a(strA, null, Boolean.class, this.b, false);
            if (bool != null) {
                return Integer.valueOf(bool.booleanValue() ? 1 : 0);
            }
            String str = (String) sj.a(strA, null, String.class, this.b, false);
            if (str != null) {
                if (!"1".equals(str) && !com.json.mediationsdk.metadata.a.g.equals(str)) {
                    if (!"0".equals(str) && !"false".equals(str)) {
                        this.f866a.L();
                        if (com.applovin.impl.sdk.t.a()) {
                            this.f866a.L().b("TcfManager", "String value (" + str + ") for " + strA + " is invalid - setting GDPR Applies to null");
                        }
                        return null;
                    }
                    return 0;
                }
                return 1;
            }
        }
        return null;
    }

    private void a() {
        this.c = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        Iterator it = this.k.iterator();
        while (it.hasNext()) {
            ((sn) it.next()).a(null);
        }
    }

    public Boolean a(int i) {
        return un.a(i, this.g);
    }

    private void c(String str) {
        this.f866a.L();
        if (com.applovin.impl.sdk.t.a()) {
            this.f866a.L().a("TcfManager", "Attempting to update consent from Additional Consent string: " + str);
        }
        Boolean boolA = un.a(IronSourceConstants.RV_AUCTION_FAILED, str);
        if (boolA != null) {
            if (boolA.booleanValue()) {
                this.f866a.L();
                if (com.applovin.impl.sdk.t.a()) {
                    this.f866a.L().a("TcfManager", "Found AppLovin ID in the list of consented ATP IDs - setting user consent to true");
                }
                y3.b(true, com.applovin.impl.sdk.k.k());
            } else {
                this.f866a.L();
                if (com.applovin.impl.sdk.t.a()) {
                    this.f866a.L().a("TcfManager", "Could not find AppLovin ID in the list of consented ATP IDs - setting user consent to false");
                }
                y3.b(false, com.applovin.impl.sdk.k.k());
            }
            this.f866a.P0();
            return;
        }
        this.f866a.L();
        if (com.applovin.impl.sdk.t.a()) {
            this.f866a.L().a("TcfManager", "AC string is not valid or AppLovin was not listed on the CMP flow - no consent update");
        }
    }

    private void d(String str) {
        if (str != null) {
            for (sn snVar : this.k) {
                if (snVar.f() == sn.a.TCF_VENDOR && snVar.d() != null) {
                    snVar.a(Boolean.valueOf(un.a(str, snVar.d().intValue() - 1)));
                }
            }
            return;
        }
        Iterator it = this.k.iterator();
        while (it.hasNext()) {
            ((sn) it.next()).a(null);
        }
    }

    private void b(String str) {
        for (sn snVar : this.k) {
            if (snVar.f() == sn.a.ATP_NETWORK && snVar.d() != null) {
                snVar.a(un.a(snVar.d().intValue(), str));
            }
        }
    }

    private String a(String str, Object obj) {
        StringBuilder sb = new StringBuilder();
        sb.append("\n");
        sb.append(str);
        sb.append(" - ");
        sb.append(obj != null ? obj.toString() : "No value set");
        return sb.toString();
    }

    private Integer a(String str) {
        if (this.b.contains(str)) {
            Integer num = (Integer) sj.a(str, null, Integer.class, this.b, false);
            if (num != null) {
                return num;
            }
            Long l = (Long) sj.a(str, null, Long.class, this.b, false);
            if (l != null && l.longValue() >= -2147483648L && l.longValue() <= 2147483647L) {
                return Integer.valueOf(l.intValue());
            }
            String str2 = (String) sj.a(str, null, String.class, this.b, false);
            if (str2 != null) {
                if (StringUtils.isNumeric(str2)) {
                    return Integer.valueOf(Integer.parseInt(str2));
                }
                this.f866a.L();
                if (com.applovin.impl.sdk.t.a()) {
                    this.f866a.L().b("TcfManager", "String value (" + str2 + ") for " + str + " is not numeric - storing value as null");
                }
            }
        }
        return null;
    }

    public void a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.k.add(((fe) it.next()).t());
        }
        d(this.h);
        b(this.g);
    }
}
