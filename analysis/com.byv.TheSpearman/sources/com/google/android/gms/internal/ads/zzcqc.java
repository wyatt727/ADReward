package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzcqc {
    private final String zza;
    private final zzbpz zzb;
    private final Executor zzc;
    private zzcqh zzd;
    private final zzbky zze = new zzcpz(this);
    private final zzbky zzf = new zzcqb(this);

    public zzcqc(String str, zzbpz zzbpzVar, Executor executor) {
        this.zza = str;
        this.zzb = zzbpzVar;
        this.zzc = executor;
    }

    static /* bridge */ /* synthetic */ boolean zzg(zzcqc zzcqcVar, Map map) {
        if (map == null) {
            return false;
        }
        String str = (String) map.get("hashCode");
        return !TextUtils.isEmpty(str) && str.equals(zzcqcVar.zza);
    }

    public final void zzc(zzcqh zzcqhVar) {
        this.zzb.zzb("/updateActiveView", this.zze);
        this.zzb.zzb("/untrackActiveViewUnit", this.zzf);
        this.zzd = zzcqhVar;
    }

    public final void zzd(zzcgm zzcgmVar) {
        zzcgmVar.zzae("/updateActiveView", this.zze);
        zzcgmVar.zzae("/untrackActiveViewUnit", this.zzf);
    }

    public final void zze() {
        this.zzb.zzc("/updateActiveView", this.zze);
        this.zzb.zzc("/untrackActiveViewUnit", this.zzf);
    }

    public final void zzf(zzcgm zzcgmVar) {
        zzcgmVar.zzaw("/updateActiveView", this.zze);
        zzcgmVar.zzaw("/untrackActiveViewUnit", this.zzf);
    }
}
