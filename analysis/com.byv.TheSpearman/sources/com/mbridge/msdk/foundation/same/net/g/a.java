package com.mbridge.msdk.foundation.same.net.g;

/* compiled from: CommonHttpConfig.java */
/* loaded from: classes4.dex */
public final class a {
    public static String a(com.mbridge.msdk.foundation.same.net.b.a aVar) {
        if (aVar == null) {
            return "Network error,Load failed";
        }
        try {
            int i = aVar.f2868a;
            int i2 = aVar.c != null ? aVar.c.d : 0;
            if (i == -2) {
                return "Network is canceled";
            }
            if (i == 15) {
                return "Network error,I/O exception contents null";
            }
            if (i == 880023) {
                return "timeout";
            }
            if (i == 880041) {
                return "Network error,UnknownHostException";
            }
            switch (i) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    if (i2 == 0) {
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (i2 == 0) {
                        break;
                    } else {
                        break;
                    }
                case 8:
                    break;
                default:
                    switch (i) {
                        case 13:
                            if (aVar.c == null) {
                                break;
                            } else {
                                byte[] bArr = aVar.c.f2886a;
                                if (bArr == null) {
                                    break;
                                } else {
                                    break;
                                }
                            }
                    }
            }
            return "Network error,Load failed";
        } catch (Exception e) {
            e.printStackTrace();
            return "Network error,Load failed";
        }
    }
}
