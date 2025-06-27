package com.google.android.gms.internal.ads;

import com.json.t2;
import java.util.Iterator;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzekf {
    private final zzfha zza;
    private final zzdrv zzb;
    private final zzduh zzc;

    public zzekf(zzfha zzfhaVar, zzdrv zzdrvVar, zzduh zzduhVar) {
        this.zza = zzfhaVar;
        this.zzb = zzdrvVar;
        this.zzc = zzduhVar;
    }

    public final void zza(zzffq zzffqVar, zzffn zzffnVar, int i, @Nullable zzegn zzegnVar, long j) {
        zzdru zzdruVarZza;
        zzdug zzdugVarZza = this.zzc.zza();
        zzdugVarZza.zzd(zzffqVar);
        zzdugVarZza.zzc(zzffnVar);
        zzdugVarZza.zzb(t2.h.h, "adapter_status");
        zzdugVarZza.zzb("adapter_l", String.valueOf(j));
        zzdugVarZza.zzb("sc", Integer.toString(i));
        if (zzegnVar != null) {
            zzdugVarZza.zzb("arec", Integer.toString(zzegnVar.zzb().zza));
            String strZza = this.zza.zza(zzegnVar.getMessage());
            if (strZza != null) {
                zzdugVarZza.zzb("areec", strZza);
            }
        }
        zzdrv zzdrvVar = this.zzb;
        Iterator it = zzffnVar.zzu.iterator();
        while (true) {
            if (!it.hasNext()) {
                zzdruVarZza = null;
                break;
            } else {
                zzdruVarZza = zzdrvVar.zza((String) it.next());
                if (zzdruVarZza != null) {
                    break;
                }
            }
        }
        if (zzdruVarZza != null) {
            zzdugVarZza.zzb("ancn", zzdruVarZza.zza);
            zzbtc zzbtcVar = zzdruVarZza.zzb;
            if (zzbtcVar != null) {
                zzdugVarZza.zzb("adapter_v", zzbtcVar.toString());
            }
            zzbtc zzbtcVar2 = zzdruVarZza.zzc;
            if (zzbtcVar2 != null) {
                zzdugVarZza.zzb("adapter_sv", zzbtcVar2.toString());
            }
        }
        zzdugVarZza.zzf();
    }
}
