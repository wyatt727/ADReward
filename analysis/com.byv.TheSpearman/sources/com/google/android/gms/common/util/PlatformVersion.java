package com.google.android.gms.common.util;

import android.os.Build;
import androidx.core.os.BuildCompat;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
/* loaded from: classes2.dex */
public final class PlatformVersion {
    private PlatformVersion() {
    }

    public static boolean isAtLeastHoneycomb() {
        return true;
    }

    public static boolean isAtLeastHoneycombMR1() {
        return true;
    }

    public static boolean isAtLeastIceCreamSandwich() {
        return true;
    }

    public static boolean isAtLeastIceCreamSandwichMR1() {
        return Build.VERSION.SDK_INT >= 15;
    }

    public static boolean isAtLeastJellyBean() {
        return Build.VERSION.SDK_INT >= 16;
    }

    public static boolean isAtLeastJellyBeanMR1() {
        return Build.VERSION.SDK_INT >= 17;
    }

    public static boolean isAtLeastJellyBeanMR2() {
        return Build.VERSION.SDK_INT >= 18;
    }

    public static boolean isAtLeastKitKat() {
        return Build.VERSION.SDK_INT >= 19;
    }

    public static boolean isAtLeastKitKatWatch() {
        return Build.VERSION.SDK_INT >= 20;
    }

    public static boolean isAtLeastLollipop() {
        return Build.VERSION.SDK_INT >= 21;
    }

    public static boolean isAtLeastLollipopMR1() {
        return Build.VERSION.SDK_INT >= 22;
    }

    public static boolean isAtLeastM() {
        return Build.VERSION.SDK_INT >= 23;
    }

    public static boolean isAtLeastN() {
        return Build.VERSION.SDK_INT >= 24;
    }

    public static boolean isAtLeastO() {
        return Build.VERSION.SDK_INT >= 26;
    }

    public static boolean isAtLeastP() {
        return Build.VERSION.SDK_INT >= 28;
    }

    public static boolean isAtLeastQ() {
        return Build.VERSION.SDK_INT >= 29;
    }

    public static boolean isAtLeastR() {
        return Build.VERSION.SDK_INT >= 30;
    }

    public static boolean isAtLeastS() {
        return Build.VERSION.SDK_INT >= 31;
    }

    public static boolean isAtLeastSv2() {
        return Build.VERSION.SDK_INT >= 32;
    }

    public static boolean isAtLeastT() {
        return Build.VERSION.SDK_INT >= 33;
    }

    public static boolean isAtLeastU() {
        if (isAtLeastT()) {
            return BuildCompat.isAtLeastU();
        }
        return false;
    }

    public static boolean isAtLeastV() {
        if (isAtLeastU()) {
            return BuildCompat.isAtLeastV();
        }
        return false;
    }
}
