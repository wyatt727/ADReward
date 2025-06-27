package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzflg {
    public static void zzb(ListenableFuture listenableFuture, zzflh zzflhVar, zzfkw zzfkwVar) {
        zzg(listenableFuture, zzflhVar, zzfkwVar, false);
    }

    public static void zzc(ListenableFuture listenableFuture, zzflh zzflhVar, zzfkw zzfkwVar) {
        zzg(listenableFuture, zzflhVar, zzfkwVar, true);
    }

    public static void zzd(ListenableFuture listenableFuture, zzflh zzflhVar, zzfkw zzfkwVar) {
        if (((Boolean) zzbfm.zzc.zze()).booleanValue()) {
            zzgee.zzr(zzgdv.zzu(listenableFuture), new zzflf(zzflhVar, zzfkwVar), zzcbr.zzf);
        }
    }

    public static void zze(ListenableFuture listenableFuture, zzfkw zzfkwVar) {
        if (((Boolean) zzbfm.zzc.zze()).booleanValue()) {
            zzgee.zzr(zzgdv.zzu(listenableFuture), new zzfld(zzfkwVar), zzcbr.zzf);
        }
    }

    public static boolean zzf(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return Pattern.matches((String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zziI), str);
    }

    private static void zzg(ListenableFuture listenableFuture, zzflh zzflhVar, zzfkw zzfkwVar, boolean z) {
        if (((Boolean) zzbfm.zzc.zze()).booleanValue()) {
            zzgee.zzr(zzgdv.zzu(listenableFuture), new zzfle(zzflhVar, zzfkwVar, z), zzcbr.zzf);
        }
    }

    public static zzflo zza(zzfgi zzfgiVar) {
        int iZze = com.google.android.gms.ads.nonagon.signalgeneration.zzh.zze(zzfgiVar) - 1;
        return (iZze == 0 || iZze == 1) ? zzflo.CUI_NAME_ADREQUEST : zzflo.CUI_NAME_SCAR_RENDERING;
    }
}
