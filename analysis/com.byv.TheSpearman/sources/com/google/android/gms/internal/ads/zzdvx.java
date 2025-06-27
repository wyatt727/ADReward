package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzdvx implements zzdvh {
    private final long zza;
    private final zzdvm zzb;
    private final zzffe zzc;

    zzdvx(long j, Context context, zzdvm zzdvmVar, zzcik zzcikVar, String str) {
        this.zza = j;
        this.zzb = zzdvmVar;
        zzffg zzffgVarZzw = zzcikVar.zzw();
        zzffgVarZzw.zzb(context);
        zzffgVarZzw.zza(str);
        this.zzc = zzffgVarZzw.zzc().zza();
    }

    @Override // com.google.android.gms.internal.ads.zzdvh
    public final void zza() {
    }

    @Override // com.google.android.gms.internal.ads.zzdvh
    public final void zzb(com.google.android.gms.ads.internal.client.zzl zzlVar) {
        try {
            this.zzc.zzf(zzlVar, new zzdvv(this));
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdvh
    public final void zzc() {
        try {
            this.zzc.zzk(new zzdvw(this));
            this.zzc.zzm(ObjectWrapper.wrap(null));
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e);
        }
    }
}
