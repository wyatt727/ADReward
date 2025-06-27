package com.unity3d.player;

import android.os.Build;

/* loaded from: classes4.dex */
public class PlatformSupport {
    static final boolean MARSHMALLOW_SUPPORT;
    static final boolean NOUGAT_SUPPORT;
    static final boolean PIE_SUPPORT;

    static {
        int i = Build.VERSION.SDK_INT;
        MARSHMALLOW_SUPPORT = i >= 23;
        NOUGAT_SUPPORT = i >= 24;
        PIE_SUPPORT = i >= 28;
    }
}
