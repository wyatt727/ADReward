package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzgad {
    public static ArrayList zza(int i) {
        zzfyk.zza(i, "initialArraySize");
        return new ArrayList(i);
    }

    public static List zzb(List list, zzfwf zzfwfVar) {
        return list instanceof RandomAccess ? new zzgaa(list, zzfwfVar) : new zzgac(list, zzfwfVar);
    }
}
