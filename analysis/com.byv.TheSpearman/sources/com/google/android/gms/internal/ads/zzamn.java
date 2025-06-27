package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzamn implements zzalh {
    private final zzfo zza = new zzfo();

    @Override // com.google.android.gms.internal.ads.zzalh
    public final void zza(byte[] bArr, int i, int i2, zzalg zzalgVar, zzep zzepVar) {
        zzec zzecVarZzp;
        this.zza.zzI(bArr, i2 + i);
        this.zza.zzK(i);
        ArrayList arrayList = new ArrayList();
        while (true) {
            zzfo zzfoVar = this.zza;
            if (zzfoVar.zzb() <= 0) {
                zzepVar.zza(new zzakz(arrayList, -9223372036854775807L, -9223372036854775807L));
                return;
            }
            zzek.zze(zzfoVar.zzb() >= 8, "Incomplete Mp4Webvtt Top Level box header found.");
            zzfo zzfoVar2 = this.zza;
            int iZzg = zzfoVar2.zzg() - 8;
            if (zzfoVar2.zzg() == 1987343459) {
                zzfo zzfoVar3 = this.zza;
                CharSequence charSequenceZza = null;
                zzea zzeaVarZzb = null;
                while (iZzg > 0) {
                    zzek.zze(iZzg >= 8, "Incomplete vtt cue box header found.");
                    int iZzg2 = zzfoVar3.zzg();
                    int iZzg3 = zzfoVar3.zzg();
                    int i3 = iZzg - 8;
                    int i4 = iZzg2 - 8;
                    String strZzB = zzfx.zzB(zzfoVar3.zzM(), zzfoVar3.zzd(), i4);
                    zzfoVar3.zzL(i4);
                    if (iZzg3 == 1937011815) {
                        zzeaVarZzb = zzamx.zzb(strZzB);
                    } else if (iZzg3 == 1885436268) {
                        charSequenceZza = zzamx.zza(null, strZzB.trim(), Collections.emptyList());
                    }
                    iZzg = i3 - i4;
                }
                if (charSequenceZza == null) {
                    charSequenceZza = "";
                }
                if (zzeaVarZzb != null) {
                    zzeaVarZzb.zzl(charSequenceZza);
                    zzecVarZzp = zzeaVarZzb.zzp();
                } else {
                    zzamw zzamwVar = new zzamw();
                    zzamwVar.zzc = charSequenceZza;
                    zzecVarZzp = zzamwVar.zza().zzp();
                }
                arrayList.add(zzecVarZzp);
            } else {
                this.zza.zzL(iZzg);
            }
        }
    }
}
