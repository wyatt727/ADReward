package com.bytedance.adsdk.ugeno.mZx;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* compiled from: ResourceHelp.java */
/* loaded from: classes2.dex */
public final class Pm {
    private static String EYQ;
    private static Context Td;
    private static Resources mZx;

    private static String EYQ(Context context) {
        if (EYQ == null) {
            EYQ = context.getPackageName();
        }
        return EYQ;
    }

    private static int EYQ(Context context, String str, String str2) {
        if (mZx == null) {
            mZx = context.getResources();
        }
        return mZx.getIdentifier(str, str2, EYQ(context));
    }

    public static Drawable EYQ(Context context, String str) {
        return context.getResources().getDrawable(mZx(context, str));
    }

    public static int mZx(Context context, String str) {
        return EYQ(context, str, "drawable");
    }
}
