package com.my.target;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import android.text.TextUtils;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.my.target.common.MyTargetConfig;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public class v1 extends p1 {

    /* renamed from: a, reason: collision with root package name */
    public Map<String, String> f4157a;

    public static boolean a(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        return !str.matches("^[0]+(-[0]+)+$");
    }

    public synchronized Map<String, String> a(MyTargetConfig myTargetConfig, Context context) {
        if (c0.a()) {
            ba.a("GoogleAIdDataProvider: You must not call collectData method from main thread");
            return new HashMap();
        }
        if (this.f4157a == null) {
            HashMap map = new HashMap();
            this.f4157a = map;
            b(map, context);
        }
        return new HashMap(this.f4157a);
    }

    public final void a(Map<String, String> map, Context context) {
        ContentResolver contentResolver = context.getContentResolver();
        if (contentResolver == null) {
            return;
        }
        String string = Settings.Secure.getString(contentResolver, "android_id");
        if (TextUtils.isEmpty(string)) {
            return;
        }
        map.put("android_id", string);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(Map<String, String> map, Context context) {
        ba.a("GoogleAIdDataProvider: Send google AId");
        String id = null;
        try {
            id = AdvertisingIdClient.getAdvertisingIdInfo(context).getId();
            ba.a("GoogleAIdDataProvider: Google AId - " + id);
            int i = !AdvertisingIdClient.getAdvertisingIdInfo(context).isLimitAdTrackingEnabled() ? 1 : 0;
            ba.a("GoogleAIdDataProvider: Ad tracking enabled - " + (i ^ 1));
            map.put("advertising_id", id);
            map.put("advertising_tracking_enabled", i + "");
        } catch (Throwable th) {
            ba.a("GoogleAIdDataProvider: Failed to send google AId - " + th.getMessage());
        }
        if (a(id)) {
            return;
        }
        a(map, context);
    }
}
