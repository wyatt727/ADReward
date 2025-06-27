package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzfgu {
    private final zzffn zza;
    private final zzffq zzb;
    private final zzefd zzc;
    private final zzfmt zzd;
    private final zzflh zze;
    private final zzcpk zzf;

    public zzfgu(zzefd zzefdVar, zzfmt zzfmtVar, zzffn zzffnVar, zzffq zzffqVar, zzcpk zzcpkVar, zzflh zzflhVar) {
        this.zza = zzffnVar;
        this.zzb = zzffqVar;
        this.zzc = zzefdVar;
        this.zzd = zzfmtVar;
        this.zzf = zzcpkVar;
        this.zze = zzflhVar;
    }

    public final void zza(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzb((String) it.next(), 2);
        }
    }

    public final void zzb(String str, int i) {
        if (!this.zza.zzaj) {
            this.zzd.zzc(str, this.zze);
        } else {
            this.zzc.zzd(new zzeff(com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis(), this.zzb.zzb, str, i));
        }
    }

    public final void zzc(List list, int i) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            zzgee.zzr((((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzjR)).booleanValue() && zzcpk.zzj(str)) ? this.zzf.zzb(str, com.google.android.gms.ads.internal.client.zzay.zze()) : zzgee.zzh(str), new zzfgt(this, i), zzcbr.zza);
        }
    }
}
