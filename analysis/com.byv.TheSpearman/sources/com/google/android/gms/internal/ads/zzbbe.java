package com.google.android.gms.internal.ads;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzbbe extends zzbaz {
    private MessageDigest zzb;

    @Override // com.google.android.gms.internal.ads.zzbaz
    public final byte[] zzb(String str) throws UnsupportedEncodingException {
        byte[] bArr;
        byte[] bArrArray;
        String[] strArrSplit = str.split(" ");
        int length = strArrSplit.length;
        int i = 4;
        if (length == 1) {
            int iZza = zzbbd.zza(strArrSplit[0]);
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
            byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
            byteBufferAllocate.putInt(iZza);
            bArrArray = byteBufferAllocate.array();
        } else {
            if (length < 5) {
                bArr = new byte[length + length];
                for (int i2 = 0; i2 < strArrSplit.length; i2++) {
                    int iZza2 = zzbbd.zza(strArrSplit[i2]);
                    int i3 = (iZza2 >> 16) ^ ((char) iZza2);
                    byte b = (byte) (i3 >> 8);
                    int i4 = i2 + i2;
                    bArr[i4] = new byte[]{(byte) i3, b}[0];
                    bArr[i4 + 1] = b;
                }
            } else {
                bArr = new byte[length];
                for (int i5 = 0; i5 < strArrSplit.length; i5++) {
                    int iZza3 = zzbbd.zza(strArrSplit[i5]);
                    bArr[i5] = (byte) ((iZza3 >> 24) ^ (((iZza3 & 255) ^ ((iZza3 >> 8) & 255)) ^ ((iZza3 >> 16) & 255)));
                }
            }
            bArrArray = bArr;
        }
        this.zzb = zza();
        synchronized (this.zza) {
            MessageDigest messageDigest = this.zzb;
            if (messageDigest == null) {
                return new byte[0];
            }
            messageDigest.reset();
            this.zzb.update(bArrArray);
            byte[] bArrDigest = this.zzb.digest();
            int length2 = bArrDigest.length;
            if (length2 <= 4) {
                i = length2;
            }
            byte[] bArr2 = new byte[i];
            System.arraycopy(bArrDigest, 0, bArr2, 0, i);
            return bArr2;
        }
    }
}
