package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;
import org.checkerframework.dataflow.qual.Pure;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzadj {
    public static int zza(zzadg zzadgVar, byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        while (i3 < i2) {
            int iZzb = zzadgVar.zzb(bArr, i + i3, i2 - i3);
            if (iZzb == -1) {
                break;
            }
            i3 += iZzb;
        }
        return i3;
    }

    @Pure
    public static void zzb(boolean z, String str) throws zzcc {
        if (!z) {
            throw zzcc.zza(str, null);
        }
    }

    public static boolean zzc(zzadg zzadgVar, byte[] bArr, int i, int i2, boolean z) throws IOException {
        try {
            return zzadgVar.zzm(bArr, 0, i2, z);
        } catch (EOFException e) {
            if (z) {
                return false;
            }
            throw e;
        }
    }

    public static boolean zzd(zzadg zzadgVar, byte[] bArr, int i, int i2) throws IOException {
        try {
            ((zzact) zzadgVar).zzn(bArr, i, i2, false);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public static boolean zze(zzadg zzadgVar, int i) throws IOException {
        try {
            ((zzact) zzadgVar).zzo(i, false);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }
}
