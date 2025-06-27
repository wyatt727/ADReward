package com.google.android.gms.internal.measurement;

import java.io.File;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.0 */
/* loaded from: classes3.dex */
final class zzck implements zzch {
    @Override // com.google.android.gms.internal.measurement.zzch
    public final String zza(String str, zzcj zzcjVar) {
        return str;
    }

    @Override // com.google.android.gms.internal.measurement.zzch
    public final /* synthetic */ String zza(String str) {
        return zza(str, zzcj.zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzch
    public final /* synthetic */ String zza(File file, String str) {
        return zza(file, str, zzcj.zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzch
    public final /* synthetic */ String zza(File file, String str, zzcj zzcjVar) {
        return zza(new File(file, str).getPath(), zzcjVar);
    }

    zzck() {
    }
}
