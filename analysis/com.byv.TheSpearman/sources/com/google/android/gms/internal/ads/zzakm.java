package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzakm implements zzadf {
    public static final zzadm zza = new zzadm() { // from class: com.google.android.gms.internal.ads.zzakl
        @Override // com.google.android.gms.internal.ads.zzadm
        public final /* synthetic */ zzadf[] zza(Uri uri, Map map) {
            int i = zzadl.zza;
            zzadm zzadmVar = zzakm.zza;
            return new zzadf[]{new zzakm()};
        }
    };
    private zzadi zzb;
    private zzaku zzc;
    private boolean zzd;

    @EnsuresNonNullIf(expression = {"streamReader"}, result = true)
    private final boolean zza(zzadg zzadgVar) throws IOException {
        zzako zzakoVar = new zzako();
        if (zzakoVar.zzb(zzadgVar, true) && (zzakoVar.zza & 2) == 2) {
            int iMin = Math.min(zzakoVar.zze, 8);
            zzfo zzfoVar = new zzfo(iMin);
            ((zzact) zzadgVar).zzm(zzfoVar.zzM(), 0, iMin, false);
            zzfoVar.zzK(0);
            if (zzfoVar.zzb() >= 5 && zzfoVar.zzm() == 127 && zzfoVar.zzu() == 1179402563) {
                this.zzc = new zzakk();
            } else {
                zzfoVar.zzK(0);
                if (zzaes.zzd(1, zzfoVar, true)) {
                    this.zzc = new zzakw();
                } else {
                    zzfoVar.zzK(0);
                    if (zzakq.zzd(zzfoVar)) {
                        this.zzc = new zzakq();
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzadf
    public final int zzb(zzadg zzadgVar, zzaec zzaecVar) throws IOException {
        zzek.zzb(this.zzb);
        if (this.zzc == null) {
            if (!zza(zzadgVar)) {
                throw zzcc.zza("Failed to determine bitstream type", null);
            }
            zzadgVar.zzj();
        }
        if (!this.zzd) {
            zzaem zzaemVarZzw = this.zzb.zzw(0, 1);
            this.zzb.zzD();
            this.zzc.zzh(this.zzb, zzaemVarZzw);
            this.zzd = true;
        }
        return this.zzc.zze(zzadgVar, zzaecVar);
    }

    @Override // com.google.android.gms.internal.ads.zzadf
    public final /* synthetic */ List zzc() {
        return zzfzn.zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzadf
    public final void zzd(zzadi zzadiVar) {
        this.zzb = zzadiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzadf
    public final void zze(long j, long j2) {
        zzaku zzakuVar = this.zzc;
        if (zzakuVar != null) {
            zzakuVar.zzj(j, j2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzadf
    public final boolean zzf(zzadg zzadgVar) throws IOException {
        try {
            return zza(zzadgVar);
        } catch (zzcc unused) {
            return false;
        }
    }
}
