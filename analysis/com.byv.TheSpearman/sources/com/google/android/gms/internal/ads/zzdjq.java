package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.json.t2;
import java.lang.ref.WeakReference;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzdjq implements zzbky {
    private final WeakReference zza;

    /* synthetic */ zzdjq(zzdjv zzdjvVar, zzdjp zzdjpVar) {
        this.zza = new WeakReference(zzdjvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbky
    public final void zza(Object obj, Map map) {
        zzdjv zzdjvVar = (zzdjv) this.zza.get();
        if (zzdjvVar != null && "_ac".equals((String) map.get(t2.h.k0))) {
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
}
