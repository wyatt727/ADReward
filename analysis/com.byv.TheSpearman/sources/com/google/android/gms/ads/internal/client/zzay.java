package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.ads.zzbjd;
import com.google.android.gms.internal.ads.zzbje;
import com.google.android.gms.internal.ads.zzbum;
import com.google.android.gms.internal.ads.zzbyv;
import java.util.Random;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.1.0 */
/* loaded from: classes2.dex */
public final class zzay {
    private static final zzay zza = new zzay();
    private final com.google.android.gms.ads.internal.util.client.zzf zzb;
    private final zzaw zzc;
    private final String zzd;
    private final VersionInfoParcel zze;
    private final Random zzf;

    protected zzay() {
        com.google.android.gms.ads.internal.util.client.zzf zzfVar = new com.google.android.gms.ads.internal.util.client.zzf();
        zzaw zzawVar = new zzaw(new zzk(), new zzi(), new zzeq(), new zzbjd(), new zzbyv(), new zzbum(), new zzbje());
        String strZze = com.google.android.gms.ads.internal.util.client.zzf.zze();
        VersionInfoParcel versionInfoParcel = new VersionInfoParcel(0, 241199000, true);
        Random random = new Random();
        this.zzb = zzfVar;
        this.zzc = zzawVar;
        this.zzd = strZze;
        this.zze = versionInfoParcel;
        this.zzf = random;
    }

    public static zzaw zza() {
        return zza.zzc;
    }

    public static com.google.android.gms.ads.internal.util.client.zzf zzb() {
        return zza.zzb;
    }

    public static VersionInfoParcel zzc() {
        return zza.zze;
    }

    public static String zzd() {
        return zza.zzd;
    }

    public static Random zze() {
        return zza.zzf;
    }
}
