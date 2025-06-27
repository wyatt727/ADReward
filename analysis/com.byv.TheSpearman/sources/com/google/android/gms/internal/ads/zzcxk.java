package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzcxk implements zzhiv {
    private final zzhjm zza;
    private final zzhjm zzb;
    private final zzhjm zzc;

    public zzcxk(zzhjm zzhjmVar, zzhjm zzhjmVar2, zzhjm zzhjmVar3) {
        this.zza = zzhjmVar;
        this.zzb = zzhjmVar2;
        this.zzc = zzhjmVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzhjm
    public final /* bridge */ /* synthetic */ Object zzb() {
        final Context context = (Context) this.zza.zzb();
        final VersionInfoParcel versionInfoParcelZza = ((zzcjc) this.zzb).zza();
        final zzfgi zzfgiVarZza = ((zzcyh) this.zzc).zza();
        return new zzfwf() { // from class: com.google.android.gms.internal.ads.zzcxj
            @Override // com.google.android.gms.internal.ads.zzfwf
            public final Object apply(Object obj) {
                zzffn zzffnVar = (zzffn) obj;
                com.google.android.gms.ads.internal.util.zzau zzauVar = new com.google.android.gms.ads.internal.util.zzau(context);
                zzauVar.zzp(zzffnVar.zzC);
                zzauVar.zzq(zzffnVar.zzD.toString());
                zzauVar.zzo(versionInfoParcelZza.afmaVersion);
                zzauVar.zzn(zzfgiVarZza.zzf);
                return zzauVar;
            }
        };
    }
}
