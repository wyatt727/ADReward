package com.bytedance.sdk.openadsdk.tsL;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.Base64;

/* compiled from: PlayableHub.java */
/* loaded from: classes2.dex */
public class Kbd {
    protected static String EYQ = "images";
    public static int HX = 4;
    public static int IPb = 0;
    protected static long Kbd = 15360;
    public static int MxO = 16;
    protected static int Pm = 30;
    public static int QQ = 2;
    protected static int Td = 1;
    public static int VwS = 1;
    protected static String mZx = null;
    public static int tp = 8;
    public static int tsL = 32;

    protected static boolean EYQ(Context context, String str) {
        return false;
    }

    protected static Bitmap EYQ(String str) {
        byte[] bArrDecode = Base64.decode(str, 2);
        return BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
    }

    public static boolean EYQ(Context context, int i) {
        boolean zEYQ;
        boolean zEYQ2;
        if (IPb == 0) {
            if (Build.VERSION.SDK_INT >= 33) {
                zEYQ = EYQ(context, "android.permission.READ_MEDIA_IMAGES");
                zEYQ2 = true;
            } else {
                zEYQ = EYQ(context, "android.permission.READ_EXTERNAL_STORAGE");
                zEYQ2 = EYQ(context, "android.permission.WRITE_EXTERNAL_STORAGE");
            }
            boolean zEYQ3 = EYQ(context, "android.permission.CAMERA");
            boolean zEYQ4 = EYQ(context, "android.permission.RECORD_AUDIO");
            PackageManager packageManager = context.getPackageManager();
            if (zEYQ && zEYQ2) {
                IPb |= VwS;
            }
            if (zEYQ3 && packageManager.hasSystemFeature("android.hardware.camera")) {
                IPb |= QQ;
            }
            if (packageManager.hasSystemFeature("android.hardware.sensor.gyroscope")) {
                IPb |= HX;
            }
            if (packageManager.hasSystemFeature("android.hardware.sensor.accelerometer")) {
                IPb |= tp;
            }
            if (packageManager.hasSystemFeature("android.hardware.sensor.compass")) {
                IPb |= MxO;
            }
            if (zEYQ4 && packageManager.hasSystemFeature("android.hardware.microphone")) {
                IPb |= tsL;
            }
        }
        return (IPb & i) != 0;
    }

    public static boolean EYQ(Context context) {
        boolean z;
        boolean z2;
        if (Build.VERSION.SDK_INT >= 33) {
            z = context.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") == 0;
        } else {
            z = context.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") == 0;
            if (context.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                z2 = false;
            }
            return !z2 && z;
        }
        z2 = true;
        if (z2) {
        }
    }

    public static boolean mZx(Context context, String str) {
        return context.checkSelfPermission(str) == 0;
    }
}
