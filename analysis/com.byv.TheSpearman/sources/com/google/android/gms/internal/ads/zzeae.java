package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzeae implements zzdbl {
    private final Context zza;
    private final zzcad zzb;

    zzeae(Context context, zzcad zzcadVar) {
        this.zza = context;
        this.zzb = zzcadVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdbl
    public final void zzdn(zzbxd zzbxdVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdbl
    public final void zzdo(zzffz zzffzVar) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (TextUtils.isEmpty(zzffzVar.zzb.zzb.zzd)) {
            return;
        }
        this.zzb.zzm(this.zza, zzffzVar.zza.zza.zzd);
        this.zzb.zzi(this.zza, zzffzVar.zzb.zzb.zzd);
    }
}
