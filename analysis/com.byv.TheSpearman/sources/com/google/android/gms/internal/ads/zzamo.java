package com.google.android.gms.internal.ads;

import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzamo {
    private static final Pattern zza = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");
    private static final Pattern zzb = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");
    private final zzfo zzc = new zzfo();
    private final StringBuilder zzd = new StringBuilder();

    static String zza(zzfo zzfoVar, StringBuilder sb) {
        zzc(zzfoVar);
        if (zzfoVar.zzb() == 0) {
            return null;
        }
        String strZzd = zzd(zzfoVar, sb);
        if (!"".equals(strZzd)) {
            return strZzd;
        }
        char cZzm = (char) zzfoVar.zzm();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(cZzm);
        return sb2.toString();
    }

    static void zzc(zzfo zzfoVar) {
        while (true) {
            for (boolean z = true; zzfoVar.zzb() > 0 && z; z = false) {
                char c = (char) zzfoVar.zzM()[zzfoVar.zzd()];
                if (c == '\t' || c == '\n' || c == '\f' || c == '\r' || c == ' ') {
                    zzfoVar.zzL(1);
                } else {
                    int iZzd = zzfoVar.zzd();
                    int iZze = zzfoVar.zze();
                    byte[] bArrZzM = zzfoVar.zzM();
                    if (iZzd + 2 <= iZze) {
                        int i = iZzd + 1;
                        if (bArrZzM[iZzd] == 47) {
                            int i2 = i + 1;
                            if (bArrZzM[i] == 42) {
                                while (true) {
                                    int i3 = i2 + 1;
                                    if (i3 >= iZze) {
                                        break;
                                    }
                                    if (((char) bArrZzM[i2]) == '*' && ((char) bArrZzM[i3]) == '/') {
                                        iZze = i3 + 1;
                                        i2 = iZze;
                                    } else {
                                        i2 = i3;
                                    }
                                }
                                zzfoVar.zzL(iZze - zzfoVar.zzd());
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
            return;
        }
    }

    private static String zzd(zzfo zzfoVar, StringBuilder sb) {
        boolean z;
        char c;
        sb.setLength(0);
        int iZzd = zzfoVar.zzd();
        int iZze = zzfoVar.zze();
        loop0: while (true) {
            for (false; iZzd < iZze && !z; true) {
                c = (char) zzfoVar.zzM()[iZzd];
                z = (c < 'A' || c > 'Z') && (c < 'a' || c > 'z') && !((c >= '0' && c <= '9') || c == '#' || c == '-' || c == '.' || c == '_');
            }
            sb.append(c);
            iZzd++;
        }
        zzfoVar.zzL(iZzd - zzfoVar.zzd());
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:172:0x031a, code lost:
    
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List zzb(com.google.android.gms.internal.ads.zzfo r18) {
        /*
            Method dump skipped, instructions count: 795
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzamo.zzb(com.google.android.gms.internal.ads.zzfo):java.util.List");
    }
}
