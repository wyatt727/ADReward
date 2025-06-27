package com.google.android.gms.internal.ads;

import androidx.core.view.ViewCompat;
import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzasb {
    public static double zza(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[4];
        byteBuffer.get(bArr);
        int i = bArr[0] << 24;
        int i2 = bArr[1] << 16;
        int i3 = bArr[2] << 8;
        return ((((i & ViewCompat.MEASURED_STATE_MASK) | (i2 & 16711680)) | (65280 & i3)) | (bArr[3] & 255)) / 1.073741824E9d;
    }

    public static double zzb(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[4];
        byteBuffer.get(bArr);
        int i = bArr[0] << 24;
        int i2 = bArr[1] << 16;
        int i3 = bArr[2] << 8;
        return ((((i & ViewCompat.MEASURED_STATE_MASK) | (i2 & 16711680)) | (65280 & i3)) | (bArr[3] & 255)) / 65536.0d;
    }

    public static int zzc(byte b) {
        return b < 0 ? b + 256 : b;
    }

    public static int zzd(ByteBuffer byteBuffer) {
        return (zzc(byteBuffer.get()) << 8) + zzc(byteBuffer.get());
    }

    public static long zze(ByteBuffer byteBuffer) {
        long j = byteBuffer.getInt();
        return j < 0 ? j + 4294967296L : j;
    }

    public static long zzf(ByteBuffer byteBuffer) {
        long jZze = zze(byteBuffer) << 32;
        if (jZze >= 0) {
            return jZze + zze(byteBuffer);
        }
        throw new RuntimeException("I don't know how to deal with UInt64! long is not sufficient and I don't want to use BigInt");
    }
}
