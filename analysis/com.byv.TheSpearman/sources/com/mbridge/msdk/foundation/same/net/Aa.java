package com.mbridge.msdk.foundation.same.net;

import android.os.Handler;
import android.os.Process;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.x;

/* loaded from: classes4.dex */
public class Aa {
    private static final String C_END = "_mv_end";
    private static final String C_START = "mv_channel_";

    /* renamed from: a, reason: collision with root package name */
    private static String f2860a = "";

    public static String b() {
        return null;
    }

    public static String a() {
        return f2860a;
    }

    private static void b(String str) {
        String strA;
        Integer numC;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            strA = x.a(str);
        } catch (Throwable th) {
            th.printStackTrace();
            strA = null;
        }
        if (!TextUtils.isEmpty(strA) && strA.startsWith(C_START) && strA.endsWith(C_END) && (numC = c(strA)) != null) {
            f2860a = String.valueOf(numC);
        } else {
            if (MBridgeConstans.DEBUG) {
                g();
                throw new RuntimeException("please don't update this value");
            }
            f2860a = "";
        }
    }

    private static Integer c(String str) {
        Throwable th;
        Integer numValueOf;
        if (str == null) {
            return null;
        }
        int iIndexOf = str.indexOf(C_START);
        int iIndexOf2 = str.indexOf(C_END);
        if (iIndexOf == -1 || iIndexOf2 == -1 || iIndexOf2 <= iIndexOf) {
            return null;
        }
        try {
            numValueOf = Integer.valueOf(str.substring(iIndexOf + 11, iIndexOf2));
            try {
                if (numValueOf.intValue() > 0) {
                    return numValueOf;
                }
                return null;
            } catch (Throwable th2) {
                th = th2;
                th.printStackTrace();
                return numValueOf;
            }
        } catch (Throwable th3) {
            th = th3;
            numValueOf = null;
        }
    }

    private static void g() {
        new Handler().postDelayed(new Runnable() { // from class: com.mbridge.msdk.foundation.same.net.Aa.1
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    Process.killProcess(Process.myPid());
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }, 500L);
    }
}
