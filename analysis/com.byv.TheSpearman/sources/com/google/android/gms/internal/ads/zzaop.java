package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzaop {
    private final List zza;
    private final zzaem[] zzb;

    public zzaop(List list) {
        this.zza = list;
        this.zzb = new zzaem[list.size()];
    }

    public final void zza(long j, zzfo zzfoVar) {
        zzacq.zza(j, zzfoVar, this.zzb);
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
            String strZzb = zzamVar.zzb;
            if (strZzb == null) {
                strZzb = zzapaVar.zzb();
            }
            zzak zzakVar = new zzak();
            zzakVar.zzK(strZzb);
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
