package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzalk implements zzaem {
    private final zzaem zza;
    private final zzalf zzb;
    private zzalh zzh;
    private zzam zzi;
    private final zzaky zzc = new zzaky();
    private int zze = 0;
    private int zzf = 0;
    private byte[] zzg = zzfx.zzf;
    private final zzfo zzd = new zzfo();

    public zzalk(zzaem zzaemVar, zzalf zzalfVar) {
        this.zza = zzaemVar;
        this.zzb = zzalfVar;
    }

    private final void zzb(int i) {
        int length = this.zzg.length;
        int i2 = this.zzf;
        if (length - i2 >= i) {
            return;
        }
        int i3 = i2 - this.zze;
        int iMax = Math.max(i3 + i3, i + i3);
        byte[] bArr = this.zzg;
        byte[] bArr2 = iMax <= bArr.length ? bArr : new byte[iMax];
        System.arraycopy(bArr, this.zze, bArr2, 0, i3);
        this.zze = 0;
        this.zzf = i3;
        this.zzg = bArr2;
    }

    final /* synthetic */ void zza(long j, int i, zzakz zzakzVar) {
        zzek.zzb(this.zzi);
        zzfzn zzfznVar = zzakzVar.zza;
        long j2 = zzakzVar.zzc;
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(zzfznVar.size());
        Iterator<E> it = zzfznVar.iterator();
        while (it.hasNext()) {
            arrayList.add(((zzec) it.next()).zza());
        }
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("c", arrayList);
        bundle.putLong("d", j2);
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeBundle(bundle);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        zzfo zzfoVar = this.zzd;
        int length = bArrMarshall.length;
        zzfoVar.zzI(bArrMarshall, length);
        this.zza.zzq(this.zzd, length);
        int i2 = i & Integer.MAX_VALUE;
        long j3 = zzakzVar.zzb;
        if (j3 == -9223372036854775807L) {
            zzek.zzf(this.zzi.zzq == Long.MAX_VALUE);
        } else {
            long j4 = this.zzi.zzq;
            j = j4 == Long.MAX_VALUE ? j + j3 : j3 + j4;
        }
        this.zza.zzs(j, i2, length, 0, null);
    }

    @Override // com.google.android.gms.internal.ads.zzaem
    public final /* synthetic */ int zzf(zzu zzuVar, int i, boolean z) {
        return zzaek.zza(this, zzuVar, i, z);
    }

    @Override // com.google.android.gms.internal.ads.zzaem
    public final int zzg(zzu zzuVar, int i, boolean z, int i2) throws IOException {
        if (this.zzh == null) {
            return this.zza.zzg(zzuVar, i, z, 0);
        }
        zzb(i);
        int iZza = zzuVar.zza(this.zzg, this.zzf, i);
        if (iZza != -1) {
            this.zzf += iZza;
            return iZza;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // com.google.android.gms.internal.ads.zzaem
    public final void zzl(zzam zzamVar) {
        String str = zzamVar.zzm;
        Objects.requireNonNull(str);
        zzek.zzd(zzcb.zzb(str) == 3);
        if (!zzamVar.equals(this.zzi)) {
            this.zzi = zzamVar;
            this.zzh = this.zzb.zzc(zzamVar) ? this.zzb.zzb(zzamVar) : null;
        }
        if (this.zzh == null) {
            this.zza.zzl(zzamVar);
            return;
        }
        zzaem zzaemVar = this.zza;
        zzak zzakVarZzb = zzamVar.zzb();
        zzakVarZzb.zzW("application/x-media3-cues");
        zzakVarZzb.zzz(zzamVar.zzm);
        zzakVarZzb.zzaa(Long.MAX_VALUE);
        zzakVarZzb.zzD(this.zzb.zza(zzamVar));
        zzaemVar.zzl(zzakVarZzb.zzac());
    }

    @Override // com.google.android.gms.internal.ads.zzaem
    public final /* synthetic */ void zzq(zzfo zzfoVar, int i) {
        zzaek.zzb(this, zzfoVar, i);
    }

    @Override // com.google.android.gms.internal.ads.zzaem
    public final void zzr(zzfo zzfoVar, int i, int i2) {
        if (this.zzh == null) {
            this.zza.zzr(zzfoVar, i, i2);
            return;
        }
        zzb(i);
        zzfoVar.zzG(this.zzg, this.zzf, i);
        this.zzf += i;
    }

    @Override // com.google.android.gms.internal.ads.zzaem
    public final void zzs(final long j, final int i, int i2, int i3, zzael zzaelVar) {
        if (this.zzh == null) {
            this.zza.zzs(j, i, i2, i3, zzaelVar);
            return;
        }
        zzek.zze(zzaelVar == null, "DRM on subtitles is not supported");
        int i4 = (this.zzf - i3) - i2;
        this.zzh.zza(this.zzg, i4, i2, zzalg.zza(), new zzep() { // from class: com.google.android.gms.internal.ads.zzalj
            @Override // com.google.android.gms.internal.ads.zzep
            public final void zza(Object obj) {
                this.zza.zza(j, i, (zzakz) obj);
            }
        });
        int i5 = i4 + i2;
        this.zze = i5;
        if (i5 == this.zzf) {
            this.zze = 0;
            this.zzf = 0;
        }
    }
}
