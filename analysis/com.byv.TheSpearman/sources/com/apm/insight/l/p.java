package com.apm.insight.l;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import com.apm.insight.k.e;
import com.json.p2;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: com.apm.insight.l.p$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f102a;

        static {
            int[] iArr = new int[e.b.values().length];
            f102a = iArr;
            try {
                iArr[e.b.WIFI.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f102a[e.b.MOBILE_2G.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f102a[e.b.MOBILE_3G.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f102a[e.b.MOBILE_4G.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f102a[e.b.MOBILE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f102a[e.b.MOBILE_5G.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public static String a(Context context) {
        return a(c(context));
    }

    public static String a(e.b bVar) {
        String str;
        try {
            switch (AnonymousClass1.f102a[bVar.ordinal()]) {
                case 1:
                    str = p2.b;
                    break;
                case 2:
                    str = "2g";
                    break;
                case 3:
                    str = p2.f2055a;
                    break;
                case 4:
                    str = "4g";
                    break;
                case 5:
                    str = "mobile";
                    break;
                case 6:
                    str = "5g";
                    break;
                default:
                    return "";
            }
            return str;
        } catch (Exception unused) {
            return "";
        }
    }

    public static boolean b(Context context) {
        NetworkInfo activeNetworkInfo;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null) {
                return false;
            }
            return activeNetworkInfo.isAvailable();
        } catch (Exception unused) {
            return false;
        }
    }

    private static e.b c(Context context) {
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager == null) {
                return e.b.NONE;
            }
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null && activeNetworkInfo.isAvailable()) {
                int type = activeNetworkInfo.getType();
                if (1 == type) {
                    return e.b.WIFI;
                }
                if (type != 0) {
                    return e.b.MOBILE;
                }
                int networkType = ((TelephonyManager) context.getSystemService("phone")).getNetworkType();
                if (networkType != 3) {
                    if (networkType == 20) {
                        return e.b.MOBILE_5G;
                    }
                    if (networkType != 5 && networkType != 6) {
                        switch (networkType) {
                            case 8:
                            case 9:
                            case 10:
                                break;
                            default:
                                switch (networkType) {
                                    case 12:
                                    case 14:
                                    case 15:
                                        break;
                                    case 13:
                                        return e.b.MOBILE_4G;
                                    default:
                                        return e.b.MOBILE;
                                }
                        }
                    }
                }
                return e.b.MOBILE_3G;
            }
            return e.b.NONE;
        } catch (Throwable unused) {
            return e.b.MOBILE;
        }
    }
}
