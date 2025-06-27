package com.mbridge.msdk.foundation.controller;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.ad;

/* compiled from: TCStringManager.java */
/* loaded from: classes4.dex */
public final class e implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: a, reason: collision with root package name */
    private String f2771a;
    private int e;
    private boolean g;
    private boolean h;
    private boolean i;
    private boolean j;
    private boolean k;
    private a l;
    private final SharedPreferences m;
    private String b = "";
    private String c = "";
    private String d = "";
    private boolean f = false;

    /* compiled from: TCStringManager.java */
    public interface a {
        void a();
    }

    public e(Context context) {
        this.f2771a = "";
        this.e = 0;
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context.getApplicationContext());
        this.m = defaultSharedPreferences;
        if (defaultSharedPreferences != null) {
            defaultSharedPreferences.registerOnSharedPreferenceChangeListener(this);
        }
        if (defaultSharedPreferences != null) {
            this.f2771a = defaultSharedPreferences.getString("IABTCF_TCString", "");
            this.e = defaultSharedPreferences.getInt("IABTCF_gdprApplies", 0);
            a(defaultSharedPreferences.getString("IABTCF_PurposeConsents", ""));
            b(defaultSharedPreferences.getString("IABTCF_VendorConsents", ""));
            c(defaultSharedPreferences.getString("IABTCF_AddtlConsent", ""));
        }
    }

    public final void a(a aVar) {
        if (aVar != null) {
            this.l = aVar;
        }
    }

    public final String a() {
        return this.f2771a;
    }

    private void a(String str) {
        this.g = a(str, 1);
        this.h = a(str, 2);
        this.b = str;
    }

    private void b(String str) {
        this.i = a(str, 867);
        this.c = str;
    }

    private void c(String str) {
        this.d = str;
        if (TextUtils.isEmpty(str)) {
            this.j = true;
            return;
        }
        if (MBridgeConstans.GOOGLE_ATP_ID == -1) {
            this.k = false;
            return;
        }
        this.k = true;
        try {
            String[] strArrSplit = str.split("~");
            if (strArrSplit.length > 1) {
                if (TextUtils.isEmpty(strArrSplit[1])) {
                    this.j = false;
                } else {
                    this.j = str.contains(String.valueOf(MBridgeConstans.GOOGLE_ATP_ID));
                }
            }
        } catch (Throwable th) {
            ad.b("TCStringManager", th.getMessage());
        }
    }

    public final boolean b() {
        if (this.e != 0) {
            if (d(this.b) && d(this.c)) {
                if (!MBridgeConstans.VERIFY_ATP_CONSENT) {
                    if (!this.i || !this.g || !this.h) {
                        z = false;
                    }
                    this.f = z;
                } else {
                    this.f = (this.i || (this.k && this.j)) && this.g && this.h;
                }
            } else {
                this.f = z;
            }
            return this.f;
        }
        this.f = true;
        return true;
    }

    private boolean d(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.matches("[01]+");
    }

    private boolean a(String str, int i) {
        return d(str) && i <= str.length() && i >= 1 && '1' == str.charAt(i - 1);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            char c = 65535;
            switch (str.hashCode()) {
                case -2004976699:
                    if (str.equals("IABTCF_PurposeConsents")) {
                        c = 2;
                        break;
                    }
                    break;
                case 83641339:
                    if (str.equals("IABTCF_gdprApplies")) {
                        c = 1;
                        break;
                    }
                    break;
                case 1218895378:
                    if (str.equals("IABTCF_TCString")) {
                        c = 0;
                        break;
                    }
                    break;
                case 1342914771:
                    if (str.equals("IABTCF_AddtlConsent")) {
                        c = 4;
                        break;
                    }
                    break;
                case 1450203731:
                    if (str.equals("IABTCF_VendorConsents")) {
                        c = 3;
                        break;
                    }
                    break;
            }
            if (c == 0) {
                this.f2771a = sharedPreferences.getString("IABTCF_TCString", "");
            } else if (c == 1) {
                this.e = sharedPreferences.getInt("IABTCF_gdprApplies", 0);
            } else if (c == 2) {
                a(sharedPreferences.getString("IABTCF_PurposeConsents", ""));
            } else if (c == 3) {
                b(sharedPreferences.getString("IABTCF_VendorConsents", ""));
            } else if (c == 4) {
                c(sharedPreferences.getString("IABTCF_AddtlConsent", ""));
            }
            a aVar = this.l;
            if (aVar != null) {
                aVar.a();
            }
        } catch (Throwable th) {
            ad.b("TCStringManager", th.getMessage());
        }
    }
}
