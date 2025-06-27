package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
class zzfya extends zzfxt implements SortedMap {

    @CheckForNull
    SortedSet zzd;
    final /* synthetic */ zzfyg zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzfya(zzfyg zzfygVar, SortedMap sortedMap) {
        super(zzfygVar, sortedMap);
        this.zze = zzfygVar;
    }

    @Override // java.util.SortedMap
    @CheckForNull
    public final Comparator comparator() {
        return zzf().comparator();
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return zzf().firstKey();
    }

    public SortedMap headMap(Object obj) {
        return new zzfya(this.zze, zzf().headMap(obj));
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return zzf().lastKey();
    }

    public SortedMap subMap(Object obj, Object obj2) {
        return new zzfya(this.zze, zzf().subMap(obj, obj2));
    }

    public SortedMap tailMap(Object obj) {
        return new zzfya(this.zze, zzf().tailMap(obj));
    }

    SortedMap zzf() {
        return (SortedMap) this.zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzgaj
    public SortedSet zzg() {
        return new zzfyb(this.zze, zzf());
    }

    @Override // com.google.android.gms.internal.ads.zzfxt, com.google.android.gms.internal.ads.zzgaj, java.util.AbstractMap, java.util.Map
    /* renamed from: zzh, reason: merged with bridge method [inline-methods] */
    public SortedSet keySet() {
        SortedSet sortedSet = this.zzd;
        if (sortedSet != null) {
            return sortedSet;
        }
        SortedSet sortedSetZzg = zzg();
        this.zzd = sortedSetZzg;
        return sortedSetZzg;
    }
}
