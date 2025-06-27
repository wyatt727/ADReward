package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzhjj implements zzhiv {
    private static final zzhiv zza = zzhiw.zza(Collections.emptySet());
    private final List zzb;
    private final List zzc;

    /* synthetic */ zzhjj(List list, List list2, zzhjh zzhjhVar) {
        this.zzb = list;
        this.zzc = list2;
    }

    public static zzhji zza(int i, int i2) {
        return new zzhji(i, i2, null);
    }

    @Override // com.google.android.gms.internal.ads.zzhjm
    /* renamed from: zzc, reason: merged with bridge method [inline-methods] */
    public final Set zzb() {
        int size = this.zzb.size();
        ArrayList arrayList = new ArrayList(this.zzc.size());
        int size2 = this.zzc.size();
        for (int i = 0; i < size2; i++) {
            Collection collection = (Collection) ((zzhje) this.zzc.get(i)).zzb();
            size += collection.size();
            arrayList.add(collection);
        }
        HashSet hashSetZza = zzhis.zza(size);
        int size3 = this.zzb.size();
        for (int i2 = 0; i2 < size3; i2++) {
            Object objZzb = ((zzhje) this.zzb.get(i2)).zzb();
            Objects.requireNonNull(objZzb);
            hashSetZza.add(objZzb);
        }
        int size4 = arrayList.size();
        for (int i3 = 0; i3 < size4; i3++) {
            for (Object obj : (Collection) arrayList.get(i3)) {
                Objects.requireNonNull(obj);
                hashSetZza.add(obj);
            }
        }
        return Collections.unmodifiableSet(hashSetZza);
    }
}
