package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement@@22.0.0 */
/* loaded from: classes3.dex */
final class zznk implements zzgf {
    private final /* synthetic */ String zza;
    private final /* synthetic */ zzni zzb;

    zznk(zzni zzniVar, String str) {
        this.zza = str;
        this.zzb = zzniVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzgf
    public final void zza(String str, int i, Throwable th, byte[] bArr, Map<String, List<String>> map) throws IllegalStateException {
        this.zzb.zza(true, i, th, bArr, this.zza);
    }
}
