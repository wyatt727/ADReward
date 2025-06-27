package com.google.android.gms.internal.measurement;

import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@22.0.0 */
/* loaded from: classes3.dex */
public final class zzw extends zzal {
    private zzaa zzk;

    @Override // com.google.android.gms.internal.measurement.zzal
    public final zzaq zza(zzh zzhVar, List<zzaq> list) {
        zzg.zza(this.zza, 3, list);
        String strZzf = zzhVar.zza(list.get(0)).zzf();
        zzaq zzaqVarZza = zzhVar.zza(list.get(1));
        if (!(zzaqVarZza instanceof zzar)) {
            throw new IllegalArgumentException("Invalid callback type");
        }
        zzaq zzaqVarZza2 = zzhVar.zza(list.get(2));
        if (!(zzaqVarZza2 instanceof zzap)) {
            throw new IllegalArgumentException("Invalid callback params");
        }
        zzap zzapVar = (zzap) zzaqVarZza2;
        if (!zzapVar.zzc("type")) {
            throw new IllegalArgumentException("Undefined rule type");
        }
        this.zzk.zza(strZzf, zzapVar.zzc(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY) ? zzg.zzb(zzapVar.zza(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY).zze().doubleValue()) : 1000, (zzar) zzaqVarZza, zzapVar.zza("type").zzf());
        return zzaq.zzc;
    }

    public zzw(zzaa zzaaVar) {
        super("internal.registerCallback");
        this.zzk = zzaaVar;
    }
}
