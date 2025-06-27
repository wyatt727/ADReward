package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzamy implements zzalh {
    private final zzfo zza = new zzfo();
    private final zzamo zzb = new zzamo();

    @Override // com.google.android.gms.internal.ads.zzalh
    public final void zza(byte[] bArr, int i, int i2, zzalg zzalgVar, zzep zzepVar) throws zzcc {
        this.zza.zzI(bArr, i2 + i);
        this.zza.zzK(i);
        ArrayList arrayList = new ArrayList();
        try {
            zzfo zzfoVar = this.zza;
            int iZzd = zzfoVar.zzd();
            String strZzy = zzfoVar.zzy(zzfwd.zzc);
            if (strZzy == null || !strZzy.startsWith("WEBVTT")) {
                zzfoVar.zzK(iZzd);
                throw zzcc.zza("Expected WEBVTT. Got ".concat(String.valueOf(zzfoVar.zzy(zzfwd.zzc))), null);
            }
            while (!TextUtils.isEmpty(this.zza.zzy(zzfwd.zzc))) {
            }
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                zzfo zzfoVar2 = this.zza;
                char c = 65535;
                int iZzd2 = 0;
                while (c == 65535) {
                    iZzd2 = zzfoVar2.zzd();
                    String strZzy2 = zzfoVar2.zzy(zzfwd.zzc);
                    c = strZzy2 == null ? (char) 0 : "STYLE".equals(strZzy2) ? (char) 2 : strZzy2.startsWith("NOTE") ? (char) 1 : (char) 3;
                }
                zzfoVar2.zzK(iZzd2);
                if (c == 0) {
                    zzalb.zza(new zzanb(arrayList2), zzalgVar, zzepVar);
                    return;
                }
                if (c == 1) {
                    while (!TextUtils.isEmpty(this.zza.zzy(zzfwd.zzc))) {
                    }
                } else if (c != 2) {
                    zzamq zzamqVarZzc = zzamx.zzc(this.zza, arrayList);
                    if (zzamqVarZzc != null) {
                        arrayList2.add(zzamqVarZzc);
                    }
                } else {
                    if (!arrayList2.isEmpty()) {
                        throw new IllegalArgumentException("A style block was found after the first cue.");
                    }
                    this.zza.zzy(zzfwd.zzc);
                    arrayList.addAll(this.zzb.zzb(this.zza));
                }
            }
        } catch (zzcc e) {
            throw new IllegalArgumentException(e);
        }
    }
}
