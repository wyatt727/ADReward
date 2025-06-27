package com.pgl.ssdk;

import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;

/* loaded from: classes4.dex */
public class E {

    /* renamed from: a, reason: collision with root package name */
    public static int f4288a;
    public static int b;
    public static int c;

    private static void a(Context context) {
        int i;
        try {
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            if (Build.VERSION.SDK_INT >= 17) {
                defaultDisplay.getRealSize(point);
                i = point.x;
            } else {
                defaultDisplay.getSize(point);
                i = point.x;
            }
            f4288a = i;
            b = point.y;
        } catch (Throwable unused) {
        }
    }

    public static String b(Context context) {
        try {
            a(context);
            if (context != null) {
                try {
                    new DisplayMetrics();
                    DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                    float f = displayMetrics.density;
                    c = displayMetrics.densityDpi;
                } catch (Throwable unused) {
                }
            }
            new DisplayMetrics();
            float f2 = context.getResources().getDisplayMetrics().xdpi;
        } catch (Throwable unused2) {
        }
        return c + "[<!>]" + f4288a + "," + b + "[<!>]";
    }
}
