package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes3.dex */
public final class zzbpq {
    static final com.google.android.gms.ads.internal.util.zzbd zza = new zzbpo();
    static final com.google.android.gms.ads.internal.util.zzbd zzb = new zzbpp();
    private final zzbpc zzc;

    public zzbpq(Context context, VersionInfoParcel versionInfoParcel, String str, @Nullable zzflk zzflkVar) {
        this.zzc = new zzbpc(context, versionInfoParcel, str, zza, zzb, zzflkVar);
    }

    public final zzbpg zza(String str, zzbpj zzbpjVar, zzbpi zzbpiVar) {
        return new zzbpu(this.zzc, str, zzbpjVar, zzbpiVar);
    }

    public final zzbpz zzb() {
        return new zzbpz(this.zzc);
    }
}
