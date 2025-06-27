package com.google.android.gms.internal.ads;

import android.view.View;
import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzaza extends zzazd {
    private final View zzi;

    public zzaza(zzaxp zzaxpVar, String str, String str2, zzata zzataVar, int i, int i2, View view) {
        super(zzaxpVar, "fHaUCxrr3fcbpdQPVJw6OSoHeHoizr6wmxmAsnLvDUhuNG2u8ebKX4VPxAoXSx4W", "K/sgHSTVeE1LLZ4HP+m5KF6ND+k7W4ID3M3VTul8bAI=", zzataVar, i, 57);
        this.zzi = view;
    }

    @Override // com.google.android.gms.internal.ads.zzazd
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        if (this.zzi != null) {
            Boolean bool = (Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzdn);
            Boolean bool2 = (Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzkD);
            zzaxt zzaxtVar = new zzaxt((String) this.zzf.invoke(null, this.zzi, this.zzb.zzb().getResources().getDisplayMetrics(), bool, bool2));
            zzaub zzaubVarZza = zzauc.zza();
            zzaubVarZza.zzb(zzaxtVar.zza.longValue());
            zzaubVarZza.zzd(zzaxtVar.zzb.longValue());
            zzaubVarZza.zze(zzaxtVar.zzc.longValue());
            if (bool2.booleanValue()) {
                zzaubVarZza.zzc(zzaxtVar.zze.longValue());
            }
            if (bool.booleanValue()) {
                zzaubVarZza.zza(zzaxtVar.zzd.longValue());
            }
            this.zze.zzaf((zzauc) zzaubVarZza.zzbr());
        }
    }
}
