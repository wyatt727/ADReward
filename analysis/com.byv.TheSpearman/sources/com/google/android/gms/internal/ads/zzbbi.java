package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes3.dex */
public final class zzbbi extends zzbaz {
    private MessageDigest zzb;
    private final int zzc;
    private final int zzd;

    public zzbbi(int i) {
        int i2 = i >> 3;
        this.zzc = (i & 7) > 0 ? i2 + 1 : i2;
        this.zzd = i;
    }

    @Override // com.google.android.gms.internal.ads.zzbaz
    public final byte[] zzb(String str) {
        synchronized (this.zza) {
            MessageDigest messageDigestZza = zza();
            this.zzb = messageDigestZza;
            if (messageDigestZza == null) {
                return new byte[0];
            }
            messageDigestZza.reset();
            this.zzb.update(str.getBytes(Charset.forName(C.UTF8_NAME)));
            byte[] bArrDigest = this.zzb.digest();
            int length = bArrDigest.length;
            int i = this.zzc;
            if (length > i) {
                length = i;
            }
            byte[] bArr = new byte[length];
            System.arraycopy(bArrDigest, 0, bArr, 0, length);
            if ((this.zzd & 7) > 0) {
                long j = 0;
                for (int i2 = 0; i2 < length; i2++) {
                    if (i2 > 0) {
                        j <<= 8;
                    }
                    j += bArr[i2] & 255;
                }
                long j2 = j >>> (8 - (this.zzd & 7));
                int i3 = this.zzc;
                while (true) {
                    i3--;
                    if (i3 < 0) {
                        break;
                    }
                    bArr[i3] = (byte) (255 & j2);
                    j2 >>>= 8;
                }
            }
            return bArr;
        }
    }
}
