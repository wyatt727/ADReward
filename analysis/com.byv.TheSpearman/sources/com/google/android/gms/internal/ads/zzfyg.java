package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
abstract class zzfyg extends zzfyj implements Serializable {
    private final transient Map zza;
    private transient int zzb;

    protected zzfyg(Map map) {
        zzfwr.zze(map.isEmpty());
        this.zza = map;
    }

    static /* bridge */ /* synthetic */ void zzo(zzfyg zzfygVar, Object obj) {
        Object objRemove;
        try {
            objRemove = zzfygVar.zza.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            objRemove = null;
        }
        Collection collection = (Collection) objRemove;
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            zzfygVar.zzb -= size;
        }
    }

    abstract Collection zza();

    Collection zzb(Collection collection) {
        throw null;
    }

    Collection zzc(Object obj, Collection collection) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzgal
    public final int zze() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfyj
    final Collection zzf() {
        return new zzfyi(this);
    }

    @Override // com.google.android.gms.internal.ads.zzfyj
    final Iterator zzg() {
        return new zzfxq(this);
    }

    final List zzh(Object obj, List list, @CheckForNull zzfyd zzfydVar) {
        return list instanceof RandomAccess ? new zzfxz(this, obj, list, zzfydVar) : new zzfyf(this, obj, list, zzfydVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfyj
    Map zzj() {
        throw null;
    }

    final Map zzk() {
        Map map = this.zza;
        return map instanceof NavigableMap ? new zzfxx(this, (NavigableMap) map) : map instanceof SortedMap ? new zzfya(this, (SortedMap) map) : new zzfxt(this, map);
    }

    @Override // com.google.android.gms.internal.ads.zzfyj
    Set zzl() {
        throw null;
    }

    final Set zzm() {
        Map map = this.zza;
        return map instanceof NavigableMap ? new zzfxy(this, (NavigableMap) map) : map instanceof SortedMap ? new zzfyb(this, (SortedMap) map) : new zzfxw(this, map);
    }

    @Override // com.google.android.gms.internal.ads.zzgal
    public final void zzp() {
        Iterator it = this.zza.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        this.zza.clear();
        this.zzb = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzfyj, com.google.android.gms.internal.ads.zzgal
    public final boolean zzq(Object obj, Object obj2) {
        Collection collection = (Collection) this.zza.get(obj);
        if (collection != null) {
            if (!collection.add(obj2)) {
                return false;
            }
            this.zzb++;
            return true;
        }
        Collection collectionZza = zza();
        if (!collectionZza.add(obj2)) {
            throw new AssertionError("New Collection violated the Collection spec");
        }
        this.zzb++;
        this.zza.put(obj, collectionZza);
        return true;
    }
}
