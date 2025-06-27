package com.pgl.ssdk;

import android.content.Context;
import android.os.Build;
import android.os.LocaleList;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Locale;

/* loaded from: classes4.dex */
public class I extends L {
    private Context n;

    public I(Context context, String str) {
        super(context, null);
        this.n = null;
        this.n = context;
        this.b = J.a() + b();
    }

    @Override // com.pgl.ssdk.L
    public boolean a(int i, byte[] bArr) {
        if (i != 200 || bArr == null) {
            return true;
        }
        try {
            if (bArr.length <= 0) {
                return true;
            }
            ((Integer) com.pgl.ssdk.ces.a.meta(Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE, null, bArr)).intValue();
            return true;
        } catch (Throwable unused) {
            return true;
        }
    }

    public String b() {
        String str = "?os=0&ver=5.9.0.0.overseas-rc.8&mode=1&app_ver=" + String.valueOf(AbstractC1403d.a(this.n));
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("&region=");
        sb.append((Build.VERSION.SDK_INT >= 24 ? LocaleList.getDefault().get(0) : Locale.getDefault()).getLanguage());
        return (sb.toString() + "&did=" + com.pgl.ssdk.ces.f.c()) + "&aid=" + com.pgl.ssdk.ces.f.b();
    }
}
