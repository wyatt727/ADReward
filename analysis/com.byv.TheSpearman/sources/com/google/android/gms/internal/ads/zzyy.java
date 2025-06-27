package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzyy {
    public final zzcz zza;
    public final int[] zzb;

    public zzyy(zzcz zzczVar, int[] iArr, int i) {
        if (iArr.length == 0) {
            zzfe.zzd("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
        }
        this.zza = zzczVar;
        this.zzb = iArr;
    }
}
