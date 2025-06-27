package com.google.android.gms.internal.ads;

import com.json.m4;
import com.json.mediationsdk.metadata.a;
import java.io.IOException;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzbkl implements zzbky {
    zzbkl() {
    }

    @Override // com.google.android.gms.internal.ads.zzbky
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcgm zzcgmVar = (zzcgm) obj;
        try {
            String str = (String) map.get(m4.r);
            if (!zzfvx.zzc(a.g, str) && !zzfvx.zzc("false", str)) {
                return;
            }
            zzfts.zzi(zzcgmVar.getContext()).zzm(Boolean.parseBoolean(str));
        } catch (IOException e) {
            com.google.android.gms.ads.internal.zzu.zzo().zzw(e, "DefaultGmsgHandlers.SetPaidv2PersonalizationEnabled");
        }
    }
}
