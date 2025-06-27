package com.google.android.gms.ads.internal.util;

import com.google.android.gms.internal.ads.zzaqm;
import com.google.android.gms.internal.ads.zzaqq;
import com.google.android.gms.internal.ads.zzaqw;
import com.google.android.gms.internal.ads.zzarn;
import com.google.android.gms.internal.ads.zzcbw;
import java.io.IOException;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes2.dex */
public final class zzbp extends zzaqq {
    private final zzcbw zza;
    private final com.google.android.gms.ads.internal.util.client.zzl zzb;

    public zzbp(String str, Map map, zzcbw zzcbwVar) throws IOException {
        super(0, str, new zzbo(zzcbwVar));
        this.zza = zzcbwVar;
        com.google.android.gms.ads.internal.util.client.zzl zzlVar = new com.google.android.gms.ads.internal.util.client.zzl(null);
        this.zzb = zzlVar;
        zzlVar.zzd(str, "GET", null, null);
    }

    @Override // com.google.android.gms.internal.ads.zzaqq
    protected final zzaqw zzh(zzaqm zzaqmVar) {
        return zzaqw.zzb(zzaqmVar, zzarn.zzb(zzaqmVar));
    }

    @Override // com.google.android.gms.internal.ads.zzaqq
    protected final /* bridge */ /* synthetic */ void zzo(Object obj) throws IOException {
        zzaqm zzaqmVar = (zzaqm) obj;
        this.zzb.zzf(zzaqmVar.zzc, zzaqmVar.zza);
        byte[] bArr = zzaqmVar.zzb;
        if (com.google.android.gms.ads.internal.util.client.zzl.zzk() && bArr != null) {
            this.zzb.zzh(bArr);
        }
        this.zza.zzc(zzaqmVar);
    }
}
