package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.my.tracker.ads.AdFormat;
import java.util.UUID;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzdke implements zzhiv {
    private final zzhjm zza;
    private final zzhjm zzb;

    public zzdke(zzhjm zzhjmVar, zzhjm zzhjmVar2) {
        this.zza = zzhjmVar;
        this.zzb = zzhjmVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhjm
    public final /* bridge */ /* synthetic */ Object zzb() {
        VersionInfoParcel versionInfoParcelZza = ((zzcjc) this.zza).zza();
        com.google.android.gms.ads.internal.zzu.zzp();
        return new zzazu(UUID.randomUUID().toString(), versionInfoParcelZza, AdFormat.NATIVE, new JSONObject(), false, true);
    }
}
