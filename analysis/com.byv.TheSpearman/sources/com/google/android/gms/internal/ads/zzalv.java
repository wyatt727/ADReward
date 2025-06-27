package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.zip.Inflater;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzalv implements zzalh {
    private final zzfo zza = new zzfo();
    private final zzfo zzb = new zzfo();
    private final zzalu zzc = new zzalu();
    private Inflater zzd;

    @Override // com.google.android.gms.internal.ads.zzalh
    public final void zza(byte[] bArr, int i, int i2, zzalg zzalgVar, zzep zzepVar) {
        this.zza.zzI(bArr, i2 + i);
        this.zza.zzK(i);
        zzfo zzfoVar = this.zza;
        if (zzfoVar.zzb() > 0 && zzfoVar.zzf() == 120) {
            if (this.zzd == null) {
                this.zzd = new Inflater();
            }
            if (zzfx.zzI(zzfoVar, this.zzb, this.zzd)) {
                zzfo zzfoVar2 = this.zzb;
                zzfoVar.zzI(zzfoVar2.zzM(), zzfoVar2.zze());
            }
        }
        this.zzc.zze();
        ArrayList arrayList = new ArrayList();
        while (true) {
            zzfo zzfoVar3 = this.zza;
            if (zzfoVar3.zzb() < 3) {
                zzepVar.zza(new zzakz(arrayList, -9223372036854775807L, -9223372036854775807L));
                return;
            }
            zzalu zzaluVar = this.zzc;
            int iZze = zzfoVar3.zze();
            int iZzm = zzfoVar3.zzm();
            int iZzq = zzfoVar3.zzq();
            int iZzd = zzfoVar3.zzd() + iZzq;
            zzec zzecVar = null;
            if (iZzd > iZze) {
                zzfoVar3.zzK(iZze);
            } else {
                if (iZzm != 128) {
                    switch (iZzm) {
                        case 20:
                            zzalu.zzd(zzaluVar, zzfoVar3, iZzq);
                            break;
                        case 21:
                            zzalu.zzb(zzaluVar, zzfoVar3, iZzq);
                            break;
                        case 22:
                            zzalu.zzc(zzaluVar, zzfoVar3, iZzq);
                            break;
                    }
                } else {
                    zzec zzecVarZza = zzaluVar.zza();
                    zzaluVar.zze();
                    zzecVar = zzecVarZza;
                }
                zzfoVar3.zzK(iZzd);
            }
            if (zzecVar != null) {
                arrayList.add(zzecVar);
            }
        }
    }
}
