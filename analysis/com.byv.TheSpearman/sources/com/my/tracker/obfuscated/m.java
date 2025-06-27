package com.my.tracker.obfuscated;

import android.app.UiModeManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import com.json.t2;
import java.io.File;
import java.util.Locale;
import java.util.TimeZone;

/* loaded from: classes4.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    private boolean f4240a = false;
    private String b = "";
    private String c = "";
    private String d = "";
    private String e = "";
    private String f = "";
    private String g = "";
    private String h = "";
    private String i = "";
    private String j = "";
    private String k = "";
    private String l = "";
    private String m = "";
    private String n = "";
    private String o = "";
    private String p = "";
    private int q = -1;
    private int r = -1;
    private int s = -1;
    private float t = Float.NaN;
    private float u = Float.NaN;
    private float v = Float.NaN;
    private int w = -1;
    private long x = -1;
    private long y = -1;
    private int z = -1;
    private int A = -1;

    static final class a {

        /* renamed from: a, reason: collision with root package name */
        static final int f4241a = a() ? 1 : 0;

        /* JADX WARN: Code restructure failed: missing block: B:37:0x009b, code lost:
        
            r2 = new java.io.BufferedReader(new java.io.InputStreamReader(new java.io.FileInputStream(java.lang.String.format(java.util.Locale.US, "/proc/%d/mounts", java.lang.Integer.valueOf(android.os.Process.myPid())))));
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x00bf, code lost:
        
            r4 = new java.lang.String[]{"/sbin/.magisk/", "/sbin/.core/mirror", "/sbin/.core/img", "/sbin/.core/db-0/magisk.db"};
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x00cb, code lost:
        
            r5 = r2.readLine();
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x00cf, code lost:
        
            if (r5 == null) goto L103;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x00d1, code lost:
        
            r6 = 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x00d2, code lost:
        
            if (r6 >= 4) goto L106;
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x00da, code lost:
        
            if (r5.contains(r4[r6]) == false) goto L48;
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x00dc, code lost:
        
            r2.close();
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x00e0, code lost:
        
            r6 = r6 + 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x00e3, code lost:
        
            r2.close();
         */
        /* JADX WARN: Code restructure failed: missing block: B:51:0x00e7, code lost:
        
            r0 = th;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x00e8, code lost:
        
            r6 = r2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:53:0x00ea, code lost:
        
            r6 = r2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:55:0x00ed, code lost:
        
            if (r6 != null) goto L81;
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x00ef, code lost:
        
            r6.close();
         */
        /* JADX WARN: Code restructure failed: missing block: B:57:0x00f2, code lost:
        
            throw r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x00f3, code lost:
        
            if (r6 != null) goto L59;
         */
        /* JADX WARN: Code restructure failed: missing block: B:59:0x00f5, code lost:
        
            r6.close();
         */
        /* JADX WARN: Code restructure failed: missing block: B:60:0x00f8, code lost:
        
            return false;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static boolean a() throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 249
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.my.tracker.obfuscated.m.a.a():boolean");
        }
    }

    m() {
    }

    private void b(Context context) {
        File filesDir = context.getFilesDir();
        if (filesDir == null) {
            return;
        }
        this.x = filesDir.getTotalSpace();
        this.y = filesDir.getFreeSpace();
    }

    private void c(Context context) {
        Display display;
        DisplayManager displayManager = (DisplayManager) context.getSystemService(t2.h.d);
        if (displayManager == null || (display = displayManager.getDisplay(0)) == null) {
            return;
        }
        Point point = new Point();
        display.getRealSize(point);
        this.q = point.x;
        this.r = point.y;
    }

    public void a(Context context) {
        if (this.f4240a) {
            return;
        }
        z0.a("DeviceParamsDataProvider: collect application info...");
        this.c = Build.DEVICE;
        this.h = Build.MANUFACTURER;
        this.i = Build.MODEL;
        this.d = Build.VERSION.RELEASE;
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (telephonyManager != null) {
                this.n = telephonyManager.getNetworkOperatorName();
                String networkOperator = telephonyManager.getNetworkOperator();
                if (TextUtils.isEmpty(networkOperator) || networkOperator.length() <= 3) {
                    this.m = networkOperator;
                } else {
                    this.m = networkOperator.substring(3);
                    this.l = networkOperator.substring(0, 3);
                }
                if (telephonyManager.getSimState() == 5) {
                    this.o = telephonyManager.getSimOperator();
                }
            }
        } catch (Throwable th) {
            z0.a("DeviceParamsDataProvider: collecting telephony exception: ", th);
        }
        try {
            this.e = context.getPackageName();
        } catch (Throwable th2) {
            z0.a("DeviceParamsDataProvider: collecting packageName exception: ", th2);
        }
        try {
            this.k = context.getResources().getConfiguration().locale.getLanguage();
        } catch (Throwable th3) {
            z0.a("DeviceParamsDataProvider: collecting app lang exception: ", th3);
        }
        try {
            PackageInfo packageInfoA = k.a(context);
            if (packageInfoA != null) {
                this.g = packageInfoA.versionName;
                this.f = Long.toString(Build.VERSION.SDK_INT < 28 ? packageInfoA.versionCode : packageInfoA.getLongVersionCode());
            }
        } catch (Throwable th4) {
            z0.a("DeviceParamsDataProvider: collecting app package info exception: ", th4);
        }
        try {
            c(context);
        } catch (Throwable th5) {
            z0.a("DeviceParamsDataProvider: collecting screen size exception: ", th5);
        }
        try {
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            if (displayMetrics != null) {
                this.s = displayMetrics.densityDpi;
                this.t = displayMetrics.density;
                this.u = displayMetrics.xdpi;
                this.v = displayMetrics.ydpi;
            }
        } catch (Throwable th6) {
            z0.a("DeviceParamsDataProvider: collecting display metrics exception: ", th6);
        }
        try {
            TimeZone timeZone = TimeZone.getDefault();
            this.p = timeZone.getDisplayName(false, 0) + " " + timeZone.getID();
        } catch (Throwable th7) {
            z0.a("DeviceParamsDataProvider: collecting timezone exception: ", th7);
        }
        try {
            this.w = a.f4241a;
        } catch (Throwable th8) {
            z0.a("DeviceParamsDataProvider: collecting isRooted exception: ", th8);
        }
        try {
            b(context);
        } catch (Throwable th9) {
            z0.a("DeviceParamsDataProvider: collecting disk info exception: ", th9);
        }
        try {
            this.j = Locale.getDefault().getLanguage();
        } catch (Throwable th10) {
            z0.a("DeviceParamsDataProvider: collecting lang exception: ", th10);
        }
        try {
            this.z = context.getPackageManager().hasSystemFeature("android.hardware.touchscreen") ? 1 : 0;
        } catch (Throwable th11) {
            z0.a("DeviceParamsDataProvider: collecting touchscreen info exception: ", th11);
        }
        try {
            this.A = ((UiModeManager) context.getSystemService("uimode")).getCurrentModeType();
        } catch (Throwable th12) {
            z0.a("DeviceParamsDataProvider: collecting ui mode info exception: ", th12);
        }
        this.b = b1.a(context);
        this.f4240a = true;
        z0.a("DeviceParamsDataProvider: collected");
    }

    public void a(s0 s0Var, Context context) {
        if (!TextUtils.isEmpty(this.c)) {
            s0Var.g(this.c);
        }
        if (!TextUtils.isEmpty(this.h)) {
            s0Var.l(this.h);
        }
        if (!TextUtils.isEmpty(this.d)) {
            s0Var.q(this.d);
        }
        if (!TextUtils.isEmpty(this.j)) {
            s0Var.p(this.j);
        }
        if (!TextUtils.isEmpty(this.l)) {
            s0Var.t(this.l);
        }
        if (!TextUtils.isEmpty(this.i)) {
            s0Var.h(this.i);
        }
        if (!TextUtils.isEmpty(this.m)) {
            s0Var.r(this.m);
        }
        if (!TextUtils.isEmpty(this.n)) {
            s0Var.s(this.n);
        }
        if (!TextUtils.isEmpty(this.o)) {
            s0Var.u(this.o);
        }
        if (!TextUtils.isEmpty(this.p)) {
            s0Var.v(this.p);
        }
        if (!TextUtils.isEmpty(this.e)) {
            s0Var.e(this.e);
        }
        if (!TextUtils.isEmpty(this.g)) {
            s0Var.f(this.g);
        }
        if (!TextUtils.isEmpty(this.f)) {
            s0Var.b(this.f);
        }
        if (!TextUtils.isEmpty(this.k)) {
            s0Var.d(this.k);
        }
        if (!TextUtils.isEmpty(this.b)) {
            s0Var.j(this.b);
        }
        s0Var.l(3);
        s0Var.p(this.q);
        s0Var.k(this.r);
        s0Var.i(this.s);
        s0Var.a(this.t);
        s0Var.b(this.u);
        s0Var.c(this.v);
        s0Var.m(this.w);
        s0Var.b(this.x);
        s0Var.a(this.y);
        s0Var.n(this.z);
        s0Var.o(this.A);
    }

    public void d(Context context) {
    }
}
