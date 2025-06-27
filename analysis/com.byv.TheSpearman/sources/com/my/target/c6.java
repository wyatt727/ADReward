package com.my.target;

import android.app.Application;
import android.content.Context;
import com.my.tracker.MyTracker;

/* loaded from: classes4.dex */
public final class c6 {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f3936a;

    public static void a(Context context) {
        if (f3936a) {
            return;
        }
        try {
            String str = (String) context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.get("com.my.target.myTrackerSdkKey");
            if (str != null) {
                MyTracker.initTracker(str, (Application) context.getApplicationContext());
            } else {
                ba.a("MyTrackerUtils: myTracker SDK key is not provided");
            }
        } catch (Throwable th) {
            ba.a("MyTrackerUtils: Unable to initialize myTracker - " + th.getMessage());
        }
        f3936a = true;
    }
}
