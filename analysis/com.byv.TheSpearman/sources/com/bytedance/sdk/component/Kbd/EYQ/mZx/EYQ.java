package com.bytedance.sdk.component.Kbd.EYQ.mZx;

import android.content.Context;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import com.bytedance.sdk.component.Kbd.EYQ.EYQ.Kbd;
import com.bytedance.sdk.component.Kbd.EYQ.QQ;

/* compiled from: DBEventUtils.java */
/* loaded from: classes2.dex */
public class EYQ {
    public static long EYQ(int i, Context context) {
        return mZx(i, context);
    }

    private static long mZx(int i, Context context) {
        if (context == null) {
            return i;
        }
        Runtime runtime = Runtime.getRuntime();
        long jFreeMemory = runtime.freeMemory() / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
        long jMaxMemory = (runtime.maxMemory() / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) - (runtime.totalMemory() / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED);
        if (jMaxMemory <= 0) {
            if (jFreeMemory <= 2) {
                return 1L;
            }
            if (jFreeMemory <= 10) {
                return Math.min(i, 10);
            }
            return Math.min((jFreeMemory / 2) * 10, i);
        }
        long j = ((jFreeMemory + jMaxMemory) - 10) / 2;
        if (j <= 2) {
            return 1L;
        }
        if (j <= 10) {
            return Math.min(i, 10);
        }
        return Math.min(j * 10, i);
    }

    public static boolean EYQ() {
        Kbd kbdPm = QQ.VwS().Pm();
        return (kbdPm == null || TextUtils.isEmpty(kbdPm.EYQ())) ? false : true;
    }

    public static boolean mZx() {
        Kbd kbdPm = QQ.VwS().Pm();
        return (kbdPm == null || TextUtils.isEmpty(kbdPm.mZx())) ? false : true;
    }

    public static boolean Td() {
        Kbd kbdPm = QQ.VwS().Pm();
        return (kbdPm == null || TextUtils.isEmpty(kbdPm.Pm())) ? false : true;
    }

    public static boolean Pm() {
        Kbd kbdPm = QQ.VwS().Pm();
        return (kbdPm == null || TextUtils.isEmpty(kbdPm.Kbd())) ? false : true;
    }

    public static boolean Kbd() {
        Kbd kbdPm = QQ.VwS().Pm();
        return (kbdPm == null || TextUtils.isEmpty(kbdPm.Td())) ? false : true;
    }

    public static boolean IPb() {
        Kbd kbdPm = QQ.VwS().Pm();
        return (kbdPm == null || TextUtils.isEmpty(kbdPm.IPb())) ? false : true;
    }
}
