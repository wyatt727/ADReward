package com.mbridge.msdk.foundation.controller.authoritycontroller;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.e;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.out.OnCompletionListener;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: BaseSDKAuthorityController.java */
/* loaded from: classes4.dex */
public abstract class b {
    private static boolean c = true;
    private static boolean d = true;
    protected AuthorityInfoBean b;
    private e g;

    /* renamed from: a, reason: collision with root package name */
    public ArrayList<String> f2759a = new ArrayList<>();
    private int e = 3;
    private String f = "";

    protected abstract int b(String str);

    protected b() {
        c();
    }

    public static boolean a() {
        return c;
    }

    public static void a(boolean z) {
        c = z;
    }

    public static boolean b() {
        return d;
    }

    public static void b(boolean z) {
        d = z;
    }

    protected final void c() {
        this.b = new AuthorityInfoBean();
        try {
            if (com.mbridge.msdk.foundation.a.a.a.a().a(MBridgeConstans.AUTHORITY_GENERAL_DATA).equals("")) {
                this.b.authGenDataStatus(1);
            }
            if (com.mbridge.msdk.foundation.a.a.a.a().a(MBridgeConstans.AUTHORITY_DEVICE_ID).equals("")) {
                this.b.authDeviceIdStatus(1);
            }
            if (com.mbridge.msdk.foundation.a.a.a.a().a(MBridgeConstans.AUTHORITY_SERIAL_ID).equals("")) {
                this.b.authSerialIdStatus(1);
            }
            if (com.mbridge.msdk.foundation.a.a.a.a().a(MBridgeConstans.AUTHORITY_OTHER).equals("")) {
                this.b.authOther(1);
            }
            this.f2759a.add(MBridgeConstans.AUTHORITY_GENERAL_DATA);
            this.f2759a.add(MBridgeConstans.AUTHORITY_DEVICE_ID);
            this.f2759a.add(MBridgeConstans.AUTHORITY_SERIAL_ID);
            this.f2759a.add(MBridgeConstans.AUTHORITY_OTHER);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final AuthorityInfoBean d() {
        AuthorityInfoBean authorityInfoBean = this.b;
        if (authorityInfoBean != null) {
            return authorityInfoBean;
        }
        AuthorityInfoBean authorityInfoBean2 = new AuthorityInfoBean();
        authorityInfoBean2.a(1);
        return authorityInfoBean2;
    }

    public final boolean e() {
        int i = this.e;
        return i == 1 || i == 3;
    }

    public final void a(int i) {
        if (this.b != null) {
            c(i);
        }
    }

    public final void a(final Context context, final OnCompletionListener onCompletionListener) {
        if (onCompletionListener != null) {
            com.mbridge.msdk.foundation.same.f.b.b().execute(new Runnable() { // from class: com.mbridge.msdk.foundation.controller.authoritycontroller.b.1
                @Override // java.lang.Runnable
                public final void run() {
                    b.this.a(context);
                    onCompletionListener.onCompletion();
                }
            });
        } else {
            a(context);
        }
    }

    public final int f() {
        return com.mbridge.msdk.foundation.a.a.a.a().a(MBridgeConstans.AUTHORITY_COPPA, 0);
    }

    public final void b(int i) {
        com.mbridge.msdk.foundation.a.a.a.a().b(MBridgeConstans.AUTHORITY_DNT, i);
    }

    public final int g() {
        return this.e;
    }

    private void c(int i) {
        this.e = i != 1 ? 2 : 1;
    }

    public final String h() throws JSONException {
        JSONArray jSONArray = new JSONArray();
        for (int i = 0; i < this.f2759a.size(); i++) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("keyname", String.valueOf(this.f2759a.get(i)));
                jSONObject.put("client_status", a(this.f2759a.get(i)));
                jSONObject.put("server_status", b(this.f2759a.get(i)));
                jSONArray.put(jSONObject);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return jSONArray.toString();
    }

    protected final int a(String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                String strA = com.mbridge.msdk.foundation.a.a.a.a().a(str);
                if (TextUtils.isEmpty(strA)) {
                    return 0;
                }
                return Integer.parseInt(strA);
            }
        } catch (Exception e) {
            ad.b("SDKAuthorityController", e.getMessage());
        }
        return 0;
    }

    public final void a(String str, int i) {
        if (this.b != null) {
            if (str.equals(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                this.b.authGenDataStatus(i);
                return;
            }
            if (str.equals(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
                this.b.authDeviceIdStatus(i);
                return;
            }
            if (str.equals(MBridgeConstans.AUTHORITY_ALL_INFO)) {
                this.b.a(i);
            } else if (str.equals(MBridgeConstans.AUTHORITY_SERIAL_ID)) {
                this.b.authSerialIdStatus(i);
            } else if (str.equals(MBridgeConstans.AUTHORITY_OTHER)) {
                this.b.authOther(i);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Context context) {
        try {
            if (this.g == null) {
                e eVar = new e(context);
                this.g = eVar;
                eVar.a(new e.a() { // from class: com.mbridge.msdk.foundation.controller.authoritycontroller.b.2
                    @Override // com.mbridge.msdk.foundation.controller.e.a
                    public final void a() {
                        b.this.j();
                    }
                });
            }
            j();
        } catch (Throwable th) {
            ad.b("SDKAuthorityController", th.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        boolean zB = this.g.b();
        c(this.g.a());
        c(zB ? 1 : 2);
        this.b.authDeviceIdStatus(zB ? 1 : 0);
    }

    private void c(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f = str;
    }

    public final String i() {
        return this.f;
    }
}
