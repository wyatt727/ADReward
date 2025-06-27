package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzbkv implements zzbky {
    zzbkv() {
    }

    @Override // com.google.android.gms.internal.ads.zzbky
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcgm zzcgmVar = (zzcgm) obj;
        if (map.keySet().contains("start")) {
            zzcgmVar.zzN().zzl();
        } else if (map.keySet().contains("stop")) {
            zzcgmVar.zzN().zzm();
        } else if (map.keySet().contains("cancel")) {
            zzcgmVar.zzN().zzk();
        }
    }
}
