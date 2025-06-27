package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzetg implements zzewr {
    private final Context zza;
    private final zzgep zzb;

    public zzetg(Context context, zzgep zzgepVar) {
        this.zza = context;
        this.zzb = zzgepVar;
    }

    @Override // com.google.android.gms.internal.ads.zzewr
    public final int zza() {
        return 19;
    }

    @Override // com.google.android.gms.internal.ads.zzewr
    public final ListenableFuture zzb() {
        return this.zzb.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzetf
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String strZzi;
                String strZzj;
                String strZze;
                com.google.android.gms.ads.internal.zzu.zzp();
                zzbax zzbaxVarZzf = com.google.android.gms.ads.internal.zzu.zzo().zzi().zzf();
                Bundle bundle = null;
                if (zzbaxVarZzf != null && (!com.google.android.gms.ads.internal.zzu.zzo().zzi().zzL() || !com.google.android.gms.ads.internal.zzu.zzo().zzi().zzM())) {
                    if (zzbaxVarZzf.zzh()) {
                        zzbaxVarZzf.zzg();
                    }
                    zzban zzbanVarZza = zzbaxVarZzf.zza();
                    if (zzbanVarZza != null) {
                        strZzi = zzbanVarZza.zzd();
                        strZze = zzbanVarZza.zze();
                        strZzj = zzbanVarZza.zzf();
                        if (strZzi != null) {
                            com.google.android.gms.ads.internal.zzu.zzo().zzi().zzv(strZzi);
                        }
                        if (strZzj != null) {
                            com.google.android.gms.ads.internal.zzu.zzo().zzi().zzx(strZzj);
                        }
                    } else {
                        strZzi = com.google.android.gms.ads.internal.zzu.zzo().zzi().zzi();
                        strZzj = com.google.android.gms.ads.internal.zzu.zzo().zzi().zzj();
                        strZze = null;
                    }
                    Bundle bundle2 = new Bundle(1);
                    if (!com.google.android.gms.ads.internal.zzu.zzo().zzi().zzM()) {
                        if (strZzj == null || TextUtils.isEmpty(strZzj)) {
                            bundle2.putString("v_fp_vertical", "no_hash");
                        } else {
                            bundle2.putString("v_fp_vertical", strZzj);
                        }
                    }
                    if (strZzi != null && !com.google.android.gms.ads.internal.zzu.zzo().zzi().zzL()) {
                        bundle2.putString("fingerprint", strZzi);
                        if (!strZzi.equals(strZze)) {
                            bundle2.putString("v_fp", strZze);
                        }
                    }
                    if (!bundle2.isEmpty()) {
                        bundle = bundle2;
                    }
                }
                return new zzeth(bundle);
            }
        });
    }
}
