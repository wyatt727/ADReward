package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzaoy {
    public final int zza;
    public final String zzb;
    public final int zzc;
    public final List zzd;
    public final byte[] zze;

    public zzaoy(int i, String str, int i2, List list, byte[] bArr) {
        this.zza = i;
        this.zzb = str;
        this.zzc = i2;
        this.zzd = list == null ? Collections.emptyList() : Collections.unmodifiableList(list);
        this.zze = bArr;
    }

    public final int zza() {
        int i = this.zzc;
        if (i != 2) {
            return i != 3 ? 0 : 512;
        }
        return 2048;
    }
}
