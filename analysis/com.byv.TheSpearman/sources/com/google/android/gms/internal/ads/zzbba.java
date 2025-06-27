package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzbba implements Comparator {
    zzbba(zzbbc zzbbcVar) {
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        zzbbg zzbbgVar = (zzbbg) obj;
        zzbbg zzbbgVar2 = (zzbbg) obj2;
        int i = zzbbgVar.zzc - zzbbgVar2.zzc;
        return i != 0 ? i : Long.compare(zzbbgVar.zza, zzbbgVar2.zza);
    }
}
