package com.my.target;

import android.content.Context;
import android.text.TextUtils;
import com.my.target.common.MyTargetConfig;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public class e2 extends p1 {

    /* renamed from: a, reason: collision with root package name */
    public Map<String, String> f3956a;

    public synchronized Map<String, String> a(MyTargetConfig myTargetConfig, final Context context) {
        if (c0.a()) {
            ba.a("HuaweiOAIdDataProvider: You must not call collectData method from main thread");
            return new HashMap();
        }
        if (this.f3956a != null) {
            return new HashMap(this.f3956a);
        }
        this.f3956a = new HashMap();
        s7 s7VarA = s7.a(context);
        try {
            Class.forName("com.huawei.hms.ads.identifier.AdvertisingIdClient");
            String strE = s7VarA.e();
            String strD = s7VarA.d();
            if (TextUtils.isEmpty(strE)) {
                a(context);
            } else {
                this.f3956a.put("oaid", strE);
                this.f3956a.put("oaid_tracking_enabled", strD);
                c0.c(new Runnable() { // from class: com.my.target.e2$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.a(context);
                    }
                });
            }
            return new HashMap(this.f3956a);
        } catch (Throwable unused) {
            s7VarA.d(null);
            s7VarA.e(null);
            return new HashMap();
        }
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final void a(Context context) {
        String str;
        Method method;
        Object objInvoke;
        String str2;
        String str3 = null;
        try {
            Class<?> cls = Class.forName("com.huawei.hms.ads.identifier.AdvertisingIdClient");
            ba.a("HuaweiOAIdDataProvider: Send huawei AId");
            method = cls.getMethod("getAdvertisingIdInfo", Context.class);
        } catch (Throwable unused) {
        }
        if (method == null || (objInvoke = method.invoke(null, context)) == null) {
            str = null;
        } else {
            Method method2 = objInvoke.getClass().getMethod("getId", new Class[0]);
            if (method2 != null) {
                str2 = (String) method2.invoke(objInvoke, new Object[0]);
                try {
                    ba.a("HuaweiOAIdDataProvider: Huawei AId - " + str2);
                } catch (Throwable unused2) {
                }
            } else {
                str2 = null;
            }
            Method method3 = objInvoke.getClass().getMethod("isLimitAdTrackingEnabled", new Class[0]);
            if (method3 != null) {
                str3 = (!((Boolean) method3.invoke(objInvoke, new Object[0])).booleanValue() ? 1 : 0) + "";
                StringBuilder sb = new StringBuilder();
                sb.append("HuaweiOAIdDataProvider: Huawei ad tracking enabled - ");
                sb.append(!r1.booleanValue());
                ba.a(sb.toString());
            }
            str = str3;
            str3 = str2;
        }
        synchronized (this) {
            if (str3 == null) {
                this.f3956a.remove("oaid");
            } else {
                this.f3956a.put("oaid", str3);
            }
            if (str == null) {
                this.f3956a.remove("oaid_tracking_enabled");
            } else {
                this.f3956a.put("oaid_tracking_enabled", str);
            }
        }
        s7.a(context).d(str3);
        s7.a(context).e(str);
    }
}
