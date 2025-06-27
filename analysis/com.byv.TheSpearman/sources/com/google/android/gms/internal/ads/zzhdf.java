package com.google.android.gms.internal.ads;

import libcore.io.Memory;
import sun.misc.Unsafe;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.1.0 */
/* loaded from: classes3.dex */
final class zzhdf extends zzhdg {
    zzhdf(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.ads.zzhdg
    public final byte zza(long j) {
        return Memory.peekByte(j);
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
        Memory.peekByteArray(j, bArr, (int) j2, (int) j3);
    }

    /* JADX WARN: Failed to inline method: com.google.android.gms.internal.ads.zzhdh.zzk(java.lang.Object, long, boolean):void */
    /* JADX WARN: Failed to inline method: com.google.android.gms.internal.ads.zzhdh.zzl(java.lang.Object, long, boolean):void */
    /* JADX WARN: Unknown register number '(r5v0 'z' boolean)' in method call: com.google.android.gms.internal.ads.zzhdh.zzl(java.lang.Object, long, boolean):void */
    /* JADX WARN: Unknown register number '(r5v0 boolean)' in method call: com.google.android.gms.internal.ads.zzhdh.zzk(java.lang.Object, long, boolean):void */
    @Override // com.google.android.gms.internal.ads.zzhdg
    public final void zze(Object obj, long j, boolean z) {
        if (zzhdh.zzb) {
            zzhdh.zzk(obj, j, z);
        } else {
            zzhdh.zzl(obj, j, z);
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
