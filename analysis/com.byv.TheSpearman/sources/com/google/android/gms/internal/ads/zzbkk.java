package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzbkk implements zzbky {
    zzbkk() {
    }

    @Override // com.google.android.gms.internal.ads.zzbky
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcgm zzcgmVar = (zzcgm) obj;
        try {
            zzftr.zzj(zzcgmVar.getContext()).zzk();
            zzfts.zzi(zzcgmVar.getContext()).zzj();
        } catch (IOException e) {
            com.google.android.gms.ads.internal.zzu.zzo().zzw(e, "DefaultGmsgHandlers.ResetPaid");
        }
    }
}
