package com.bytedance.sdk.component.utils;

import android.content.Context;
import android.text.TextUtils;
import com.json.p2;

/* compiled from: NetworkUtils.java */
/* loaded from: classes2.dex */
public class hu {
    public static boolean EYQ(Context context) {
        return Td(context) != 0;
    }

    public static int mZx(Context context) {
        int iTd = Td(context);
        if (iTd == 1) {
            return 0;
        }
        if (iTd == 4) {
            return 1;
        }
        if (iTd == 5) {
            return 4;
        }
        if (iTd != 6) {
            return iTd;
        }
        return 6;
    }

    public static int Td(Context context) {
        return NZ.EYQ(context, 60000L);
    }

    public static boolean Pm(Context context) {
        return Td(context) == 4;
    }

    public static boolean Kbd(Context context) {
        return Td(context) == 5;
    }

    public static boolean IPb(Context context) {
        return Td(context) == 6;
    }

    public static String VwS(Context context) {
        int iTd = Td(context);
        return iTd != 2 ? iTd != 3 ? iTd != 4 ? iTd != 5 ? iTd != 6 ? "mobile" : "5g" : "4g" : p2.b : p2.f2055a : "2g";
    }

    public static boolean EYQ(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith("http://") || str.startsWith("https://");
    }

    public static boolean QQ(Context context) {
        if (context == null) {
            return false;
        }
        int iTd = Td(context);
        char c = 5;
        if (iTd == 2) {
            c = 2;
        } else if (iTd == 3) {
            c = 3;
        } else if (iTd == 4) {
            c = 1;
        } else if (iTd == 5) {
            c = 4;
        } else if (iTd != 6) {
            c = 0;
        }
        return c != 0;
    }
}
