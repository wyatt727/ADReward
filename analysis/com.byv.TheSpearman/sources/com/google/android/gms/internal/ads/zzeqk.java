package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzeqk implements zzewq {
    private final com.google.android.gms.ads.internal.client.zzw zza;
    private final VersionInfoParcel zzb;
    private final boolean zzc;

    public zzeqk(com.google.android.gms.ads.internal.client.zzw zzwVar, VersionInfoParcel versionInfoParcel, boolean z) {
        this.zza = zzwVar;
        this.zzb = versionInfoParcel;
        this.zzc = z;
    }

    @Override // com.google.android.gms.internal.ads.zzewq
    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (this.zzb.clientJarVersion >= ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzfj)).intValue()) {
            bundle.putString("app_open_version", "2");
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzfk)).booleanValue()) {
            bundle.putBoolean("app_switched", this.zzc);
        }
        com.google.android.gms.ads.internal.client.zzw zzwVar = this.zza;
        if (zzwVar != null) {
            int i = zzwVar.zza;
            if (i == 1) {
                bundle.putString("avo", "p");
            } else if (i == 2) {
                bundle.putString("avo", CmcdHeadersFactory.STREAM_TYPE_LIVE);
            }
        }
    }
}
