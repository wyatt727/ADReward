package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzemq {
    private final zzdim zza;

    public zzemq(zzdim zzdimVar) {
        this.zza = zzdimVar;
    }

    public final /* bridge */ /* synthetic */ Object zza(zzffz zzffzVar, zzffn zzffnVar, View view, zzemm zzemmVar) {
        zzemo zzemoVar = new zzemo(this, new zzdiu() { // from class: com.google.android.gms.internal.ads.zzemn
            @Override // com.google.android.gms.internal.ads.zzdiu
            public final void zza(boolean z, Context context, zzczd zzczdVar) {
            }
        });
        zzdhm zzdhmVarZze = this.zza.zze(new zzcul(zzffzVar, zzffnVar, null), zzemoVar);
        zzemmVar.zzd(new zzemp(this, zzdhmVarZze));
        return zzdhmVarZze.zzg();
    }
}
