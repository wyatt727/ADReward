package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public class zzadt implements zzadg {
    private final zzadg zza;

    public zzadt(zzadg zzadgVar) {
        this.zza = zzadgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzadg, com.google.android.gms.internal.ads.zzu
    public final int zza(byte[] bArr, int i, int i2) throws IOException {
        return this.zza.zza(bArr, i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzadg
    public final int zzb(byte[] bArr, int i, int i2) throws IOException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzadg
    public final int zzc(int i) throws IOException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzadg
    public long zzd() {
        return this.zza.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzadg
    public long zze() {
        return this.zza.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzadg
    public long zzf() {
        return this.zza.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzadg
    public final void zzg(int i) throws IOException {
        ((zzact) this.zza).zzl(i, false);
    }

    @Override // com.google.android.gms.internal.ads.zzadg
    public final void zzh(byte[] bArr, int i, int i2) throws IOException {
        ((zzact) this.zza).zzm(bArr, i, i2, false);
    }

    @Override // com.google.android.gms.internal.ads.zzadg
    public final void zzi(byte[] bArr, int i, int i2) throws IOException {
        ((zzact) this.zza).zzn(bArr, i, i2, false);
    }

    @Override // com.google.android.gms.internal.ads.zzadg
    public final void zzj() {
        this.zza.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzadg
    public final void zzk(int i) throws IOException {
        ((zzact) this.zza).zzo(i, false);
    }

    @Override // com.google.android.gms.internal.ads.zzadg
    public final boolean zzm(byte[] bArr, int i, int i2, boolean z) throws IOException {
        return this.zza.zzm(bArr, 0, 8, true);
    }

    @Override // com.google.android.gms.internal.ads.zzadg
    public final boolean zzn(byte[] bArr, int i, int i2, boolean z) throws IOException {
        return this.zza.zzn(bArr, 0, 8, true);
    }
}
