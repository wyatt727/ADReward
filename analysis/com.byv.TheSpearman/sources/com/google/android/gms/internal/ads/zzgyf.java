package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.1.0 */
/* loaded from: classes3.dex */
class zzgyf extends zzgye {
    protected final byte[] zza;

    zzgyf(byte[] bArr) {
        Objects.requireNonNull(bArr);
        this.zza = bArr;
    }

    @Override // com.google.android.gms.internal.ads.zzgyj
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzgyj) || zzd() != ((zzgyj) obj).zzd()) {
            return false;
        }
        if (zzd() == 0) {
            return true;
        }
        if (!(obj instanceof zzgyf)) {
            return obj.equals(this);
        }
        zzgyf zzgyfVar = (zzgyf) obj;
        int iZzr = zzr();
        int iZzr2 = zzgyfVar.zzr();
        if (iZzr == 0 || iZzr2 == 0 || iZzr == iZzr2) {
            return zzg(zzgyfVar, 0, zzd());
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzgyj
    public byte zza(int i) {
        return this.zza[i];
    }

    @Override // com.google.android.gms.internal.ads.zzgyj
    byte zzb(int i) {
        return this.zza[i];
    }

    protected int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzgyj
    public int zzd() {
        return this.zza.length;
    }

    @Override // com.google.android.gms.internal.ads.zzgyj
    protected void zze(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.zza, i, bArr, i2, i3);
    }

    @Override // com.google.android.gms.internal.ads.zzgye
    final boolean zzg(zzgyj zzgyjVar, int i, int i2) {
        if (i2 > zzgyjVar.zzd()) {
            throw new IllegalArgumentException("Length too large: " + i2 + zzd());
        }
        int i3 = i + i2;
        if (i3 > zzgyjVar.zzd()) {
            throw new IllegalArgumentException("Ran off end of other: " + i + ", " + i2 + ", " + zzgyjVar.zzd());
        }
        if (!(zzgyjVar instanceof zzgyf)) {
            return zzgyjVar.zzk(i, i3).equals(zzk(0, i2));
        }
        zzgyf zzgyfVar = (zzgyf) zzgyjVar;
        byte[] bArr = this.zza;
        byte[] bArr2 = zzgyfVar.zza;
        int iZzc = zzc() + i2;
        int iZzc2 = zzc();
        int iZzc3 = zzgyfVar.zzc() + i;
        while (iZzc2 < iZzc) {
            if (bArr[iZzc2] != bArr2[iZzc3]) {
                return false;
            }
            iZzc2++;
            iZzc3++;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzgyj
    protected final int zzi(int i, int i2, int i3) {
        return zzhai.zzb(i, this.zza, zzc() + i2, i3);
    }

    @Override // com.google.android.gms.internal.ads.zzgyj
    protected final int zzj(int i, int i2, int i3) {
        int iZzc = zzc() + i2;
        return zzhdm.zzf(i, this.zza, iZzc, i3 + iZzc);
    }

    @Override // com.google.android.gms.internal.ads.zzgyj
    public final zzgyj zzk(int i, int i2) {
        int iZzq = zzq(i, i2, zzd());
        return iZzq == 0 ? zzgyj.zzb : new zzgyc(this.zza, zzc() + i, iZzq);
    }

    @Override // com.google.android.gms.internal.ads.zzgyj
    public final zzgyt zzl() {
        return zzgyt.zzJ(this.zza, zzc(), zzd(), true);
    }

    @Override // com.google.android.gms.internal.ads.zzgyj
    protected final String zzm(Charset charset) {
        return new String(this.zza, zzc(), zzd(), charset);
    }

    @Override // com.google.android.gms.internal.ads.zzgyj
    public final ByteBuffer zzn() {
        return ByteBuffer.wrap(this.zza, zzc(), zzd()).asReadOnlyBuffer();
    }

    @Override // com.google.android.gms.internal.ads.zzgyj
    final void zzo(zzgxy zzgxyVar) throws IOException {
        zzgxyVar.zza(this.zza, zzc(), zzd());
    }

    @Override // com.google.android.gms.internal.ads.zzgyj
    public final boolean zzp() {
        int iZzc = zzc();
        return zzhdm.zzj(this.zza, iZzc, zzd() + iZzc);
    }
}
