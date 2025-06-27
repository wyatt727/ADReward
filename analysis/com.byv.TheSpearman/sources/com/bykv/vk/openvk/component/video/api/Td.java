package com.bykv.vk.openvk.component.video.api;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.component.mZx.EYQ.MxO;
import java.io.File;
import java.util.concurrent.TimeUnit;

/* compiled from: VideoConfig.java */
/* loaded from: classes.dex */
public class Td {
    public static boolean EYQ = false;
    private static int IPb = 1;
    private static MxO Kbd = null;
    private static boolean Pm = false;
    private static String Td;
    private static Context mZx;

    public static Context EYQ() {
        return mZx;
    }

    public static String mZx() {
        if (TextUtils.isEmpty(Td)) {
            try {
                File file = new File(EYQ().getFilesDir(), "ttad_dir");
                if (!file.exists()) {
                    file.mkdirs();
                }
                Td = file.getAbsolutePath();
            } catch (Throwable unused) {
            }
        }
        return Td;
    }

    public static void EYQ(Context context, String str) {
        mZx = context;
        Td = str;
    }

    public static boolean Td() {
        return Pm;
    }

    public static void EYQ(boolean z) {
        Pm = z;
    }

    public static MxO Pm() {
        if (Kbd == null) {
            Kbd = new MxO.EYQ("v_config").EYQ(10000L, TimeUnit.MILLISECONDS).mZx(10000L, TimeUnit.MILLISECONDS).Td(10000L, TimeUnit.MILLISECONDS).EYQ();
        }
        return Kbd;
    }

    public static void EYQ(MxO mxO) {
        Kbd = mxO;
    }

    public static boolean Kbd() {
        return EYQ;
    }

    public static void EYQ(int i) {
        IPb = i;
    }

    public static int IPb() {
        return IPb;
    }
}
