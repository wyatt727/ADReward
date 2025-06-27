package com.pgl.ssdk;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.text.TextUtils;
import android.view.Display;
import com.json.t2;

/* loaded from: classes4.dex */
public class A {

    /* renamed from: a, reason: collision with root package name */
    private static volatile DisplayManager.DisplayListener f4285a = null;
    private static volatile boolean b = false;
    private static String c;
    private static String d;
    private static String e;
    private static DisplayManager f;

    private static String a(Display display) {
        if (Build.VERSION.SDK_INT < 17) {
            return "api<17";
        }
        String name = display.getName();
        Object objA = P.a(display, display.getClass(), "getType", new Class[0], new Object[0]);
        Object objA2 = P.a(display, display.getClass(), "getOwnerPackageName", new Class[0], new Object[0]);
        Object objA3 = P.a(null, display.getClass(), "TYPE_VIRTUAL", null);
        return String.format("%s#%s#%b", objA2, name, Boolean.valueOf((objA == null || objA3 == null || ((Integer) objA).intValue() != ((Integer) objA3).intValue()) ? false : true));
    }

    static void a(int i, int i2) {
        String strA;
        if (i != 0) {
            try {
                if (Build.VERSION.SDK_INT >= 17) {
                    Display display = f.getDisplay(i);
                    strA = display != null ? a(display) : "pd";
                } else {
                    strA = "api<17";
                }
                if (i2 == 1) {
                    if (strA.equals(c)) {
                        return;
                    }
                    c = strA;
                } else if (i2 == 2) {
                    if (strA.equals(d)) {
                        return;
                    }
                    d = strA;
                } else {
                    if (i2 != 3 || strA.equals(e)) {
                        return;
                    }
                    e = strA;
                }
            } catch (Throwable unused) {
            }
        }
    }

    public static void b(Context context) {
        X xC;
        if (b) {
            return;
        }
        b = true;
        if (Build.VERSION.SDK_INT >= 17) {
            if (f4285a == null) {
                f4285a = new C1424z();
            }
            if (f == null) {
                f = (DisplayManager) context.getSystemService(t2.h.d);
            }
            if (f == null || (xC = W.a().c()) == null) {
                return;
            }
            f.registerDisplayListener(f4285a, xC);
        }
    }

    public static boolean a(Context context) {
        String string;
        Display[] displays;
        if (c != null || d != null || e != null) {
            return true;
        }
        if (context != null) {
            if (Build.VERSION.SDK_INT < 17) {
                string = "api<17";
            } else {
                if (f == null) {
                    f = (DisplayManager) context.getSystemService(t2.h.d);
                }
                DisplayManager displayManager = f;
                if (displayManager == null || (displays = displayManager.getDisplays()) == null) {
                    string = "";
                } else {
                    StringBuffer stringBuffer = new StringBuffer();
                    for (int i = 0; i < displays.length; i++) {
                        if (displays[i] != null && displays[i].getDisplayId() != 0) {
                            stringBuffer.append(a(displays[i]));
                            if (i != displays.length - 1) {
                                stringBuffer.append(",");
                            }
                        }
                    }
                    string = stringBuffer.toString();
                }
            }
            if (!TextUtils.isEmpty(string)) {
                return true;
            }
        }
        return false;
    }
}
