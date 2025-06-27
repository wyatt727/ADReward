package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzapd {
    private final List zza;
    private final zzaem[] zzb;

    public zzapd(List list) {
        this.zza = list;
        this.zzb = new zzaem[list.size()];
    }

    public final void zza(long j, zzfo zzfoVar) {
        if (zzfoVar.zzb() < 9) {
            return;
        }
        int iZzg = zzfoVar.zzg();
        int iZzg2 = zzfoVar.zzg();
        int iZzm = zzfoVar.zzm();
        if (iZzg == 434 && iZzg2 == 1195456820 && iZzm == 3) {
            zzacq.zzb(j, zzfoVar, this.zzb);
        }
    }

    public final void zzb(zzadi zzadiVar, zzapa zzapaVar) {
        for (int i = 0; i < this.zzb.length; i++) {
            zzapaVar.zzc();
            zzaem zzaemVarZzw = zzadiVar.zzw(zzapaVar.zza(), 3);
            zzam zzamVar = (zzam) this.zza.get(i);
            String str = zzamVar.zzm;
            boolean z = true;
            if (!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) {
                z = false;
            }
            zzek.zze(z, "Invalid closed caption MIME type provided: ".concat(String.valueOf(str)));
            zzak zzakVar = new zzak();
            zzakVar.zzK(zzapaVar.zzb());
            zzakVar.zzW(str);
            zzakVar.zzY(zzamVar.zze);
            zzakVar.zzN(zzamVar.zzd);
            zzakVar.zzw(zzamVar.zzE);
            zzakVar.zzL(zzamVar.zzo);
            zzaemVarZzw.zzl(zzakVar.zzac());
            this.zzb[i] = zzaemVarZzw;
        }
    }
}
