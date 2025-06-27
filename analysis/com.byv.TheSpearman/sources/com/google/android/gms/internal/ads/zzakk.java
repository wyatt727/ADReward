package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzakk extends zzaku {
    private zzads zza;
    private zzakj zzb;

    zzakk() {
    }

    private static boolean zzd(byte[] bArr) {
        return bArr[0] == -1;
    }

    @Override // com.google.android.gms.internal.ads.zzaku
    protected final long zza(zzfo zzfoVar) {
        if (!zzd(zzfoVar.zzM())) {
            return -1L;
        }
        int i = (zzfoVar.zzM()[2] & 255) >> 4;
        if (i == 6) {
            zzfoVar.zzL(4);
            zzfoVar.zzw();
        } else if (i == 7) {
            i = 7;
            zzfoVar.zzL(4);
            zzfoVar.zzw();
        }
        int iZza = zzado.zza(zzfoVar, i);
        zzfoVar.zzK(0);
        return iZza;
    }

    @Override // com.google.android.gms.internal.ads.zzaku
    protected final void zzb(boolean z) {
        super.zzb(z);
        if (z) {
            this.zza = null;
            this.zzb = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaku
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    protected final boolean zzc(zzfo zzfoVar, long j, zzakr zzakrVar) {
        byte[] bArrZzM = zzfoVar.zzM();
        zzads zzadsVar = this.zza;
        if (zzadsVar == null) {
            zzads zzadsVar2 = new zzads(bArrZzM, 17);
            this.zza = zzadsVar2;
            zzakrVar.zza = zzadsVar2.zzc(Arrays.copyOfRange(bArrZzM, 9, zzfoVar.zze()), null);
            return true;
        }
        if ((bArrZzM[0] & Byte.MAX_VALUE) == 3) {
            zzadr zzadrVarZzb = zzadp.zzb(zzfoVar);
            zzads zzadsVarZzf = zzadsVar.zzf(zzadrVarZzb);
            this.zza = zzadsVarZzf;
            this.zzb = new zzakj(zzadsVarZzf, zzadrVarZzb);
            return true;
        }
        if (!zzd(bArrZzM)) {
            return true;
        }
        zzakj zzakjVar = this.zzb;
        if (zzakjVar != null) {
            zzakjVar.zza(j);
            zzakrVar.zzb = this.zzb;
        }
        Objects.requireNonNull(zzakrVar.zza);
        return false;
    }
}
