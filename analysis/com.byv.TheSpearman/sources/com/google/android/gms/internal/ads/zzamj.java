package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzamj {
    public static zzamk zza(zzamk zzamkVar, String[] strArr, Map map) {
        int length;
        int i = 0;
        if (zzamkVar == null) {
            if (strArr == null) {
                return null;
            }
            int length2 = strArr.length;
            if (length2 == 1) {
                return (zzamk) map.get(strArr[0]);
            }
            if (length2 > 1) {
                zzamk zzamkVar2 = new zzamk();
                while (i < length2) {
                    zzamkVar2.zzl((zzamk) map.get(strArr[i]));
                    i++;
                }
                return zzamkVar2;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                zzamkVar.zzl((zzamk) map.get(strArr[0]));
                return zzamkVar;
            }
            if (strArr != null && (length = strArr.length) > 1) {
                while (i < length) {
                    zzamkVar.zzl((zzamk) map.get(strArr[i]));
                    i++;
                }
            }
        }
        return zzamkVar;
    }
}
