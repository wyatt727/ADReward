package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.util.Pair;
import com.google.android.exoplayer2.util.MimeTypes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Pattern;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzuc {
    public static final /* synthetic */ int zza = 0;
    private static final Pattern zzb = Pattern.compile("^\\D?(\\d+)$");
    private static final HashMap zzc = new HashMap();

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x054a  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x0606  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x0615  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0119  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.util.Pair zza(com.google.android.gms.internal.ads.zzam r21) {
        /*
            Method dump skipped, instructions count: 2474
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzuc.zza(com.google.android.gms.internal.ads.zzam):android.util.Pair");
    }

    public static zzti zzb() throws zztw {
        List listZze = zze("audio/raw", false, false);
        if (listZze.isEmpty()) {
            return null;
        }
        return (zzti) listZze.get(0);
    }

    public static String zzc(zzam zzamVar) {
        Pair pairZza;
        if ("audio/eac3-joc".equals(zzamVar.zzm)) {
            return "audio/eac3";
        }
        if (!MimeTypes.VIDEO_DOLBY_VISION.equals(zzamVar.zzm) || (pairZza = zza(zzamVar)) == null) {
            return null;
        }
        int iIntValue = ((Integer) pairZza.first).intValue();
        if (iIntValue == 16 || iIntValue == 256) {
            return "video/hevc";
        }
        if (iIntValue == 512) {
            return "video/avc";
        }
        return null;
    }

    public static List zzd(zztq zztqVar, zzam zzamVar, boolean z, boolean z2) throws zztw {
        String strZzc = zzc(zzamVar);
        return strZzc == null ? zzfzn.zzm() : zze(strZzc, z, z2);
    }

    public static synchronized List zze(String str, boolean z, boolean z2) throws zztw {
        zztu zztuVar = new zztu(str, z, z2);
        HashMap map = zzc;
        List list = (List) map.get(zztuVar);
        if (list != null) {
            return list;
        }
        int i = zzfx.zza;
        ArrayList arrayListZzh = zzh(zztuVar, new zzua(z, z2));
        if (z && arrayListZzh.isEmpty() && zzfx.zza <= 23) {
            arrayListZzh = zzh(zztuVar, new zztz(null));
            if (!arrayListZzh.isEmpty()) {
                zzfe.zzf("MediaCodecUtil", "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + ((zzti) arrayListZzh.get(0)).zza);
            }
        }
        if ("audio/raw".equals(str)) {
            if (zzfx.zza < 26 && zzfx.zzb.equals("R9") && arrayListZzh.size() == 1 && ((zzti) arrayListZzh.get(0)).zza.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                arrayListZzh.add(zzti.zzc("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, true, false, false, false));
            }
            zzi(arrayListZzh, new zzub() { // from class: com.google.android.gms.internal.ads.zzts
                @Override // com.google.android.gms.internal.ads.zzub
                public final int zza(Object obj) {
                    int i2 = zzuc.zza;
                    String str2 = ((zzti) obj).zza;
                    if (str2.startsWith("OMX.google") || str2.startsWith("c2.android")) {
                        return 1;
                    }
                    return (zzfx.zza >= 26 || !str2.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
                }
            });
        }
        if (zzfx.zza < 32 && arrayListZzh.size() > 1 && "OMX.qti.audio.decoder.flac".equals(((zzti) arrayListZzh.get(0)).zza)) {
            arrayListZzh.add((zzti) arrayListZzh.remove(0));
        }
        zzfzn zzfznVarZzk = zzfzn.zzk(arrayListZzh);
        map.put(zztuVar, zzfznVarZzk);
        return zzfznVarZzk;
    }

    @RequiresNonNull({"#2.sampleMimeType"})
    public static List zzf(zztq zztqVar, zzam zzamVar, boolean z, boolean z2) throws zztw {
        List listZze = zze(zzamVar.zzm, z, z2);
        List listZzd = zzd(zztqVar, zzamVar, z, z2);
        zzfzk zzfzkVar = new zzfzk();
        zzfzkVar.zzh(listZze);
        zzfzkVar.zzh(listZzd);
        return zzfzkVar.zzi();
    }

    public static List zzg(List list, final zzam zzamVar) {
        ArrayList arrayList = new ArrayList(list);
        zzi(arrayList, new zzub() { // from class: com.google.android.gms.internal.ads.zztt
            @Override // com.google.android.gms.internal.ads.zzub
            public final int zza(Object obj) {
                int i = zzuc.zza;
                return ((zzti) obj).zzd(zzamVar) ? 1 : 0;
            }
        });
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0192 A[Catch: Exception -> 0x0224, TryCatch #3 {Exception -> 0x0224, blocks: (B:80:0x0145, B:86:0x015c, B:92:0x0171, B:94:0x0177, B:99:0x0188, B:101:0x0192, B:111:0x01be, B:102:0x0197, B:104:0x01a7, B:106:0x01af, B:95:0x017d), top: B:156:0x0145 }] */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0197 A[Catch: Exception -> 0x0224, TryCatch #3 {Exception -> 0x0224, blocks: (B:80:0x0145, B:86:0x015c, B:92:0x0171, B:94:0x0177, B:99:0x0188, B:101:0x0192, B:111:0x01be, B:102:0x0197, B:104:0x01a7, B:106:0x01af, B:95:0x017d), top: B:156:0x0145 }] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0233 A[Catch: Exception -> 0x0281, TRY_ENTER, TryCatch #5 {Exception -> 0x0281, blocks: (B:3:0x0008, B:5:0x001d, B:7:0x0027, B:10:0x0034, B:14:0x0042, B:16:0x0048, B:18:0x004e, B:20:0x0056, B:22:0x005e, B:24:0x0068, B:26:0x0072, B:28:0x007c, B:30:0x0086, B:32:0x0090, B:34:0x009a, B:36:0x00a4, B:38:0x00ae, B:40:0x00b8, B:42:0x00be, B:44:0x00c6, B:46:0x00ce, B:48:0x00d7, B:137:0x022b, B:140:0x0233, B:142:0x0239, B:143:0x0253, B:144:0x0274, B:51:0x00e0, B:52:0x00e3, B:54:0x00eb, B:57:0x00f6, B:59:0x00fe, B:62:0x0109, B:64:0x0111, B:67:0x011c, B:69:0x0124, B:72:0x012f, B:74:0x0137), top: B:160:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01c4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0253 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0177 A[Catch: Exception -> 0x0224, TryCatch #3 {Exception -> 0x0224, blocks: (B:80:0x0145, B:86:0x015c, B:92:0x0171, B:94:0x0177, B:99:0x0188, B:101:0x0192, B:111:0x01be, B:102:0x0197, B:104:0x01a7, B:106:0x01af, B:95:0x017d), top: B:156:0x0145 }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x017d A[Catch: Exception -> 0x0224, TryCatch #3 {Exception -> 0x0224, blocks: (B:80:0x0145, B:86:0x015c, B:92:0x0171, B:94:0x0177, B:99:0x0188, B:101:0x0192, B:111:0x01be, B:102:0x0197, B:104:0x01a7, B:106:0x01af, B:95:0x017d), top: B:156:0x0145 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.util.ArrayList zzh(com.google.android.gms.internal.ads.zztu r23, com.google.android.gms.internal.ads.zztx r24) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 649
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzuc.zzh(com.google.android.gms.internal.ads.zztu, com.google.android.gms.internal.ads.zztx):java.util.ArrayList");
    }

    private static void zzi(List list, final zzub zzubVar) {
        Collections.sort(list, new Comparator() { // from class: com.google.android.gms.internal.ads.zztr
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int i = zzuc.zza;
                zzub zzubVar2 = zzubVar;
                return zzubVar2.zza(obj2) - zzubVar2.zza(obj);
            }
        });
    }

    private static boolean zzj(MediaCodecInfo mediaCodecInfo, String str) {
        if (zzfx.zza >= 29) {
            return mediaCodecInfo.isSoftwareOnly();
        }
        if (zzcb.zzg(str)) {
            return true;
        }
        String strZza = zzfvx.zza(mediaCodecInfo.getName());
        if (strZza.startsWith("arc.")) {
            return false;
        }
        if (strZza.startsWith("omx.google.") || strZza.startsWith("omx.ffmpeg.")) {
            return true;
        }
        if ((strZza.startsWith("omx.sec.") && strZza.contains(".sw.")) || strZza.equals("omx.qcom.video.decoder.hevcswvdec") || strZza.startsWith("c2.android.") || strZza.startsWith("c2.google.")) {
            return true;
        }
        return (strZza.startsWith("omx.") || strZza.startsWith("c2.")) ? false : true;
    }
}
