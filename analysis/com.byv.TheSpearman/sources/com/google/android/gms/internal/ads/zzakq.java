package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.audio.OpusUtil;
import java.util.Arrays;
import java.util.List;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzakq extends zzaku {
    private static final byte[] zza = {79, 112, 117, 115, 72, 101, 97, 100};
    private static final byte[] zzb = {79, 112, 117, 115, 84, 97, 103, 115};
    private boolean zzc;

    zzakq() {
    }

    public static boolean zzd(zzfo zzfoVar) {
        return zzk(zzfoVar, zza);
    }

    private static boolean zzk(zzfo zzfoVar, byte[] bArr) {
        if (zzfoVar.zzb() < 8) {
            return false;
        }
        int iZzd = zzfoVar.zzd();
        byte[] bArr2 = new byte[8];
        zzfoVar.zzG(bArr2, 0, 8);
        zzfoVar.zzK(iZzd);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // com.google.android.gms.internal.ads.zzaku
    protected final long zza(zzfo zzfoVar) {
        return zzg(zzaeb.zzd(zzfoVar.zzM()));
    }

    @Override // com.google.android.gms.internal.ads.zzaku
    protected final void zzb(boolean z) {
        super.zzb(z);
        if (z) {
            this.zzc = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaku
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    protected final boolean zzc(zzfo zzfoVar, long j, zzakr zzakrVar) throws zzcc {
        if (zzk(zzfoVar, zza)) {
            byte[] bArrCopyOf = Arrays.copyOf(zzfoVar.zzM(), zzfoVar.zze());
            int i = bArrCopyOf[9] & 255;
            List listZze = zzaeb.zze(bArrCopyOf);
            if (zzakrVar.zza == null) {
                zzak zzakVar = new zzak();
                zzakVar.zzW("audio/opus");
                zzakVar.zzy(i);
                zzakVar.zzX(OpusUtil.SAMPLE_RATE);
                zzakVar.zzL(listZze);
                zzakrVar.zza = zzakVar.zzac();
                return true;
            }
        } else {
            if (!zzk(zzfoVar, zzb)) {
                zzek.zzb(zzakrVar.zza);
                return false;
            }
            zzek.zzb(zzakrVar.zza);
            if (!this.zzc) {
                this.zzc = true;
                zzfoVar.zzL(8);
                zzby zzbyVarZzb = zzaes.zzb(zzfzn.zzl(zzaes.zzc(zzfoVar, false, false).zzb));
                if (zzbyVarZzb != null) {
                    zzak zzakVarZzb = zzakrVar.zza.zzb();
                    zzakVarZzb.zzP(zzbyVarZzb.zzd(zzakrVar.zza.zzk));
                    zzakrVar.zza = zzakVarZzb.zzac();
                }
            }
        }
        return true;
    }
}
