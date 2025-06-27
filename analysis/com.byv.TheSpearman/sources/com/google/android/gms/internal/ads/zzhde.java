package com.google.android.gms.internal.ads;

import libcore.io.Memory;
import sun.misc.Unsafe;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.1.0 */
/* loaded from: classes3.dex */
final class zzhde extends zzhdg {
    zzhde(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.ads.zzhdg
    public final byte zza(long j) {
        return Memory.peekByte((int) j);
    }

    @Override // com.google.android.gms.internal.ads.zzhdg
    public final double zzb(Object obj, long j) {
        return Double.longBitsToDouble(this.zza.getLong(obj, j));
    }

    @Override // com.google.android.gms.internal.ads.zzhdg
    public final float zzc(Object obj, long j) {
        return Float.intBitsToFloat(this.zza.getInt(obj, j));
    }

    @Override // com.google.android.gms.internal.ads.zzhdg
    public final void zzd(long j, byte[] bArr, long j2, long j3) {
        Memory.peekByteArray((int) j, bArr, (int) j2, (int) j3);
    }

    @Override // com.google.android.gms.internal.ads.zzhdg
    public final void zze(Object obj, long j, boolean z) {
        if (zzhdh.zzb) {
            zzhdh.zzG(obj, j, z ? (byte) 1 : (byte) 0);
        } else {
            zzhdh.zzH(obj, j, z ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhdg
    public final void zzf(Object obj, long j, byte b) {
        if (zzhdh.zzb) {
            zzhdh.zzG(obj, j, b);
        } else {
            zzhdh.zzH(obj, j, b);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhdg
    public final void zzg(Object obj, long j, double d) {
        this.zza.putLong(obj, j, Double.doubleToLongBits(d));
    }

    @Override // com.google.android.gms.internal.ads.zzhdg
    public final void zzh(Object obj, long j, float f) {
        this.zza.putInt(obj, j, Float.floatToIntBits(f));
    }

    @Override // com.google.android.gms.internal.ads.zzhdg
    public final boolean zzi(Object obj, long j) {
        return zzhdh.zzb ? zzhdh.zzw(obj, j) : zzhdh.zzx(obj, j);
    }
}
