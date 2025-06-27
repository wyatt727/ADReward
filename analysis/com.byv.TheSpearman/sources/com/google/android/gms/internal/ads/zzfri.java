package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.common.util.Hex;
import java.io.File;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzfri {
    final File zza;
    private final File zzb;
    private final SharedPreferences zzc;
    private final zzazh zzd;

    public zzfri(Context context, zzazh zzazhVar) {
        this.zzc = context.getSharedPreferences("pcvmspf", 0);
        File dir = context.getDir("pccache", 0);
        zzfrj.zza(dir, false);
        this.zzb = dir;
        File dir2 = context.getDir("tmppccache", 0);
        zzfrj.zza(dir2, true);
        this.zza = dir2;
        this.zzd = zzazhVar;
    }

    private final File zzd() {
        File file = new File(this.zzb, Integer.toString(this.zzd.zza()));
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }

    private final String zze() {
        return "FBAMTD" + this.zzd.zza();
    }

    private final String zzf() {
        return "LATMTD" + this.zzd.zza();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zza(com.google.android.gms.internal.ads.zzazk r8, com.google.android.gms.internal.ads.zzfro r9) throws java.lang.IllegalArgumentException {
        /*
            Method dump skipped, instructions count: 390
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfri.zza(com.google.android.gms.internal.ads.zzazk, com.google.android.gms.internal.ads.zzfro):boolean");
    }

    final zzazn zzb(int i) throws IllegalArgumentException {
        String string = i == 1 ? this.zzc.getString(zzf(), null) : this.zzc.getString(zze(), null);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            byte[] bArrStringToBytes = Hex.stringToBytes(string);
            zzgyj zzgyjVar = zzgyj.zzb;
            zzazn zzaznVarZzh = zzazn.zzh(zzgyj.zzv(bArrStringToBytes, 0, bArrStringToBytes.length));
            String strZzk = zzaznVarZzh.zzk();
            File fileZzb = zzfrj.zzb(strZzk, "pcam.jar", zzd());
            if (!fileZzb.exists()) {
                fileZzb = zzfrj.zzb(strZzk, "pcam", zzd());
            }
            File fileZzb2 = zzfrj.zzb(strZzk, "pcbc", zzd());
            if (fileZzb.exists()) {
                if (fileZzb2.exists()) {
                    return zzaznVarZzh;
                }
            }
        } catch (zzhak unused) {
        }
        return null;
    }

    public final zzfrh zzc(int i) throws IllegalArgumentException {
        zzazn zzaznVarZzb = zzb(1);
        if (zzaznVarZzb == null) {
            return null;
        }
        String strZzk = zzaznVarZzb.zzk();
        File fileZzb = zzfrj.zzb(strZzk, "pcam.jar", zzd());
        if (!fileZzb.exists()) {
            fileZzb = zzfrj.zzb(strZzk, "pcam", zzd());
        }
        return new zzfrh(zzaznVarZzb, fileZzb, zzfrj.zzb(strZzk, "pcbc", zzd()), zzfrj.zzb(strZzk, "pcopt", zzd()));
    }
}
