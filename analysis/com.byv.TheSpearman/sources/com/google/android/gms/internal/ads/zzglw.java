package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
abstract class zzglw {
    int[] zza;
    private final int zzb;

    public zzglw(byte[] bArr, int i) throws InvalidKeyException {
        if (bArr.length != 32) {
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        this.zza = zzgls.zze(bArr);
        this.zzb = i;
    }

    abstract int zza();

    abstract int[] zzb(int[] iArr, int i);

    final ByteBuffer zzc(byte[] bArr, int i) {
        int[] iArrZzb = zzb(zzgls.zze(bArr), i);
        int[] iArr = (int[]) iArrZzb.clone();
        zzgls.zzc(iArr);
        for (int i2 = 0; i2 < 16; i2++) {
            iArrZzb[i2] = iArrZzb[i2] + iArr[i2];
        }
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.asIntBuffer().put(iArrZzb, 0, 16);
        return byteBufferOrder;
    }

    public final byte[] zzd(byte[] bArr, ByteBuffer byteBuffer) throws GeneralSecurityException {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBuffer.remaining());
        if (bArr.length != zza()) {
            throw new GeneralSecurityException("The nonce length (in bytes) must be " + zza());
        }
        int iRemaining = byteBuffer.remaining();
        int i = iRemaining / 64;
        int i2 = 0;
        while (true) {
            int i3 = i + 1;
            if (i2 >= i3) {
                return byteBufferAllocate.array();
            }
            ByteBuffer byteBufferZzc = zzc(bArr, this.zzb + i2);
            if (i2 == i3 - 1) {
                zzgwl.zza(byteBufferAllocate, byteBuffer, byteBufferZzc, iRemaining % 64);
            } else {
                zzgwl.zza(byteBufferAllocate, byteBuffer, byteBufferZzc, 64);
            }
            i2++;
        }
    }
}
