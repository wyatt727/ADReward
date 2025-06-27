package com.bytedance.sdk.component.adexpress.Pm;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;

/* compiled from: DeviceUtil.java */
/* loaded from: classes2.dex */
public class mZx {
    public static boolean EYQ(Context context) {
        if (context == null) {
            return false;
        }
        return (Build.VERSION.SDK_INT >= 17 && TextUtils.getLayoutDirectionFromLocale(context.getResources().getConfiguration().locale) == 1) && (context.getApplicationInfo().flags & 4194304) == 4194304;
    }
}
