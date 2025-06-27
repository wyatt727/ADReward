package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzadx {
    private final zzfo zza = new zzfo(10);

    public final zzby zza(zzadg zzadgVar, zzaha zzahaVar) throws IOException {
        zzby zzbyVarZza = null;
        int i = 0;
        while (true) {
            try {
                ((zzact) zzadgVar).zzm(this.zza.zzM(), 0, 10, false);
                this.zza.zzK(0);
                if (this.zza.zzo() != 4801587) {
                    break;
                }
                this.zza.zzL(3);
                int iZzl = this.zza.zzl();
                int i2 = iZzl + 10;
                if (zzbyVarZza == null) {
                    byte[] bArr = new byte[i2];
                    System.arraycopy(this.zza.zzM(), 0, bArr, 0, 10);
                    ((zzact) zzadgVar).zzm(bArr, 10, iZzl, false);
                    zzbyVarZza = zzahc.zza(bArr, i2, zzahaVar, new zzagd());
                } else {
                    ((zzact) zzadgVar).zzl(iZzl, false);
                }
                i += i2;
            } catch (EOFException unused) {
            }
        }
        zzadgVar.zzj();
        ((zzact) zzadgVar).zzl(i, false);
        return zzbyVarZza;
    }
}
