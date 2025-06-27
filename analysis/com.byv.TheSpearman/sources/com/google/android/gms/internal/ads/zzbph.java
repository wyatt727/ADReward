package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes3.dex */
public final class zzbph {
    private final Object zza = new Object();
    private final Object zzb = new Object();
    private zzbpq zzc;
    private zzbpq zzd;

    private static final Context zzc(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }

    public final zzbpq zza(Context context, VersionInfoParcel versionInfoParcel, zzflk zzflkVar) {
        zzbpq zzbpqVar;
        synchronized (this.zza) {
            if (this.zzc == null) {
                this.zzc = new zzbpq(zzc(context), versionInfoParcel, (String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zza), zzflkVar);
            }
            zzbpqVar = this.zzc;
        }
        return zzbpqVar;
    }

    public final zzbpq zzb(Context context, VersionInfoParcel versionInfoParcel, zzflk zzflkVar) {
        zzbpq zzbpqVar;
        synchronized (this.zzb) {
            if (this.zzd == null) {
                this.zzd = new zzbpq(zzc(context), versionInfoParcel, (String) zzbgc.zzb.zze(), zzflkVar);
            }
            zzbpqVar = this.zzd;
        }
        return zzbpqVar;
    }
}
