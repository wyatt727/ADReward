package com.google.android.gms.nearby.connection;

/* compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* loaded from: classes3.dex */
public final class zzi {
    private String zza;
    private String zzb;
    private byte[] zzc;
    private boolean zzd;
    private boolean zze;
    private byte[] zzf;

    public final zzi zza(String str) {
        this.zza = str;
        return this;
    }

    @Deprecated
    public final zzi zzb(String str) {
        this.zzb = str;
        return this;
    }

    public final zzi zzc(byte[] bArr) {
        this.zzc = bArr;
        return this;
    }

    public final zzi zzd(boolean z) {
        this.zzd = z;
        return this;
    }

    public final zzi zze(byte[] bArr) {
        this.zzf = bArr;
        return this;
    }

    @Deprecated
    public final zzi zzf(boolean z) {
        this.zze = z;
        return this;
    }

    public final ConnectionInfo zzg() {
        return new ConnectionInfo(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf);
    }
}
