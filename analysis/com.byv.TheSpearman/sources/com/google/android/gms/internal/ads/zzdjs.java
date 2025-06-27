package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzdjs implements zzbky {
    private final WeakReference zza;

    /* synthetic */ zzdjs(zzdjv zzdjvVar, zzdjr zzdjrVar) {
        this.zza = new WeakReference(zzdjvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbky
    public final void zza(Object obj, Map map) {
        zzdjv zzdjvVar = (zzdjv) this.zza.get();
        if (zzdjvVar == null) {
            return;
        }
        zzdjvVar.zzh.onAdClicked();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzkv)).booleanValue()) {
            zzdjvVar.zzi.zzdG();
            if (TextUtils.isEmpty((CharSequence) map.get("sccg"))) {
                return;
            }
            zzdjvVar.zzi.zzdf();
        }
    }
}
