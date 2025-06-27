package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import org.objectweb.asm.Opcodes;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.1.0 */
/* loaded from: classes3.dex */
final class zzhcf extends zzgyj {
    static final int[] zza = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, Opcodes.D2F, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};
    private final int zzc;
    private final zzgyj zzd;
    private final zzgyj zze;
    private final int zzf;
    private final int zzg;

    private zzhcf(zzgyj zzgyjVar, zzgyj zzgyjVar2) {
        this.zzd = zzgyjVar;
        this.zze = zzgyjVar2;
        int iZzd = zzgyjVar.zzd();
        this.zzf = iZzd;
        this.zzc = iZzd + zzgyjVar2.zzd();
        this.zzg = Math.max(zzgyjVar.zzf(), zzgyjVar2.zzf()) + 1;
    }

    static zzgyj zzD(zzgyj zzgyjVar, zzgyj zzgyjVar2) {
        if (zzgyjVar2.zzd() == 0) {
            return zzgyjVar;
        }
        if (zzgyjVar.zzd() == 0) {
            return zzgyjVar2;
        }
        int iZzd = zzgyjVar.zzd() + zzgyjVar2.zzd();
        if (iZzd < 128) {
            return zzE(zzgyjVar, zzgyjVar2);
        }
        if (zzgyjVar instanceof zzhcf) {
            zzhcf zzhcfVar = (zzhcf) zzgyjVar;
            if (zzhcfVar.zze.zzd() + zzgyjVar2.zzd() < 128) {
                return new zzhcf(zzhcfVar.zzd, zzE(zzhcfVar.zze, zzgyjVar2));
            }
            if (zzhcfVar.zzd.zzf() > zzhcfVar.zze.zzf() && zzhcfVar.zzg > zzgyjVar2.zzf()) {
                return new zzhcf(zzhcfVar.zzd, new zzhcf(zzhcfVar.zze, zzgyjVar2));
            }
        }
        return iZzd >= zzc(Math.max(zzgyjVar.zzf(), zzgyjVar2.zzf()) + 1) ? new zzhcf(zzgyjVar, zzgyjVar2) : zzhcb.zza(new zzhcb(null), zzgyjVar, zzgyjVar2);
    }

    private static zzgyj zzE(zzgyj zzgyjVar, zzgyj zzgyjVar2) {
        int iZzd = zzgyjVar.zzd();
        int iZzd2 = zzgyjVar2.zzd();
        byte[] bArr = new byte[iZzd + iZzd2];
        zzgyjVar.zzA(bArr, 0, 0, iZzd);
        zzgyjVar2.zzA(bArr, 0, iZzd, iZzd2);
        return new zzgyf(bArr);
    }

    static int zzc(int i) {
        int[] iArr = zza;
        int length = iArr.length;
        if (i >= 47) {
            return Integer.MAX_VALUE;
        }
        return iArr[i];
    }

    @Override // com.google.android.gms.internal.ads.zzgyj
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzgyj)) {
            return false;
        }
        zzgyj zzgyjVar = (zzgyj) obj;
        if (this.zzc != zzgyjVar.zzd()) {
            return false;
        }
        if (this.zzc == 0) {
            return true;
        }
        int iZzr = zzr();
        int iZzr2 = zzgyjVar.zzr();
        if (iZzr != 0 && iZzr2 != 0 && iZzr != iZzr2) {
            return false;
        }
        zzhcc zzhccVar = null;
        zzhcd zzhcdVar = new zzhcd(this, zzhccVar);
        zzgye zzgyeVarZza = zzhcdVar.next();
        zzhcd zzhcdVar2 = new zzhcd(zzgyjVar, zzhccVar);
        zzgye zzgyeVarZza2 = zzhcdVar2.next();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int iZzd = zzgyeVarZza.zzd() - i;
            int iZzd2 = zzgyeVarZza2.zzd() - i2;
            int iMin = Math.min(iZzd, iZzd2);
            if (!(i == 0 ? zzgyeVarZza.zzg(zzgyeVarZza2, i2, iMin) : zzgyeVarZza2.zzg(zzgyeVarZza, i, iMin))) {
                return false;
            }
            i3 += iMin;
            int i4 = this.zzc;
            if (i3 >= i4) {
                if (i3 == i4) {
                    return true;
                }
                throw new IllegalStateException();
            }
            if (iMin == iZzd) {
                zzgyeVarZza = zzhcdVar.next();
                i = 0;
            } else {
                i += iMin;
                zzgyeVarZza = zzgyeVarZza;
            }
            if (iMin == iZzd2) {
                zzgyeVarZza2 = zzhcdVar2.next();
                i2 = 0;
            } else {
                i2 += iMin;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgyj, java.lang.Iterable
    public final /* synthetic */ Iterator<Byte> iterator() {
        return new zzhbz(this);
    }

    @Override // com.google.android.gms.internal.ads.zzgyj
    public final byte zza(int i) {
        zzz(i, this.zzc);
        return zzb(i);
    }

    @Override // com.google.android.gms.internal.ads.zzgyj
    final byte zzb(int i) {
        int i2 = this.zzf;
        return i < i2 ? this.zzd.zzb(i) : this.zze.zzb(i - i2);
    }

    @Override // com.google.android.gms.internal.ads.zzgyj
    public final int zzd() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgyj
    protected final void zze(byte[] bArr, int i, int i2, int i3) {
        int i4 = i + i3;
        int i5 = this.zzf;
        if (i4 <= i5) {
            this.zzd.zze(bArr, i, i2, i3);
        } else {
            if (i >= i5) {
                this.zze.zze(bArr, i - i5, i2, i3);
                return;
            }
            int i6 = i5 - i;
            this.zzd.zze(bArr, i, i2, i6);
            this.zze.zze(bArr, 0, i2 + i6, i3 - i6);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgyj
    protected final int zzf() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzgyj
    protected final boolean zzh() {
        return this.zzc >= zzc(this.zzg);
    }

    @Override // com.google.android.gms.internal.ads.zzgyj
    protected final int zzi(int i, int i2, int i3) {
        int i4 = i2 + i3;
        int i5 = this.zzf;
        if (i4 <= i5) {
            return this.zzd.zzi(i, i2, i3);
        }
        if (i2 >= i5) {
            return this.zze.zzi(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return this.zze.zzi(this.zzd.zzi(i, i2, i6), 0, i3 - i6);
    }

    @Override // com.google.android.gms.internal.ads.zzgyj
    protected final int zzj(int i, int i2, int i3) {
        int i4 = i2 + i3;
        int i5 = this.zzf;
        if (i4 <= i5) {
            return this.zzd.zzj(i, i2, i3);
        }
        if (i2 >= i5) {
            return this.zze.zzj(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return this.zze.zzj(this.zzd.zzj(i, i2, i6), 0, i3 - i6);
    }

    @Override // com.google.android.gms.internal.ads.zzgyj
    public final zzgyj zzk(int i, int i2) {
        int iZzq = zzq(i, i2, this.zzc);
        if (iZzq == 0) {
            return zzgyj.zzb;
        }
        if (iZzq == this.zzc) {
            return this;
        }
        int i3 = this.zzf;
        if (i2 <= i3) {
            return this.zzd.zzk(i, i2);
        }
        if (i >= i3) {
            return this.zze.zzk(i - i3, i2 - i3);
        }
        zzgyj zzgyjVar = this.zzd;
        return new zzhcf(zzgyjVar.zzk(i, zzgyjVar.zzd()), this.zze.zzk(0, i2 - this.zzf));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzgyj
    public final zzgyt zzl() {
        ArrayList<ByteBuffer> arrayList = new ArrayList();
        Object[] objArr = 0;
        zzhcd zzhcdVar = new zzhcd(this, null);
        while (zzhcdVar.hasNext()) {
            arrayList.add(zzhcdVar.next().zzn());
        }
        int i = zzgyt.zzd;
        int i2 = 0;
        int iRemaining = 0;
        for (ByteBuffer byteBuffer : arrayList) {
            iRemaining += byteBuffer.remaining();
            i2 = byteBuffer.hasArray() ? i2 | 1 : byteBuffer.isDirect() ? i2 | 2 : i2 | 4;
        }
        return i2 == 2 ? new zzgyn(arrayList, iRemaining, true, objArr == true ? 1 : 0) : zzgyt.zzI(new zzhal(arrayList), 4096);
    }

    @Override // com.google.android.gms.internal.ads.zzgyj
    protected final String zzm(Charset charset) {
        return new String(zzB(), charset);
    }

    @Override // com.google.android.gms.internal.ads.zzgyj
    public final ByteBuffer zzn() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzgyj
    final void zzo(zzgxy zzgxyVar) throws IOException {
        this.zzd.zzo(zzgxyVar);
        this.zze.zzo(zzgxyVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgyj
    public final boolean zzp() {
        zzgyj zzgyjVar = this.zzd;
        zzgyj zzgyjVar2 = this.zze;
        return zzgyjVar2.zzj(zzgyjVar.zzj(0, 0, this.zzf), 0, zzgyjVar2.zzd()) == 0;
    }

    @Override // com.google.android.gms.internal.ads.zzgyj
    /* renamed from: zzs */
    public final zzgyd iterator() {
        return new zzhbz(this);
    }
}
