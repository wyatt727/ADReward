package com.google.android.gms.internal.measurement;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.0.0 */
/* loaded from: classes3.dex */
public final class zzjy {
    public static final byte[] zzb;
    private static final ByteBuffer zze;
    private static final zziw zzf;
    private static final Charset zzc = Charset.forName(C.ASCII_NAME);
    static final Charset zza = Charset.forName(C.UTF8_NAME);
    private static final Charset zzd = Charset.forName("ISO-8859-1");

    public static int zza(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static int zza(boolean z) {
        return z ? 1231 : 1237;
    }

    public static int zza(byte[] bArr) {
        int length = bArr.length;
        int iZza = zza(length, bArr, 0, length);
        if (iZza == 0) {
            return 1;
        }
        return iZza;
    }

    static int zza(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    static <T> T zza(T t) {
        Objects.requireNonNull(t);
        return t;
    }

    static <T> T zza(T t, String str) {
        Objects.requireNonNull(t, str);
        return t;
    }

    public static String zzb(byte[] bArr) {
        return new String(bArr, zza);
    }

    static {
        byte[] bArr = new byte[0];
        zzb = bArr;
        zze = ByteBuffer.wrap(bArr);
        zzf = zziw.zza(bArr, 0, bArr.length, false);
    }

    static boolean zza(zzli zzliVar) {
        if (!(zzliVar instanceof zzia)) {
            return false;
        }
        return false;
    }

    public static boolean zzc(byte[] bArr) {
        return zznf.zza(bArr);
    }
}
