package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
abstract class zzfyj implements zzgal {

    @CheckForNull
    private transient Set zza;

    @CheckForNull
    private transient Collection zzb;

    @CheckForNull
    private transient Map zzc;

    zzfyj() {
    }

    public final boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzgal) {
            return zzs().equals(((zzgal) obj).zzs());
        }
        return false;
    }

    public final int hashCode() {
        return zzs().hashCode();
    }

    public final String toString() {
        return zzs().toString();
    }

    abstract Collection zzf();

    Iterator zzg() {
        throw null;
    }

    abstract Map zzj();

    abstract Set zzl();

    @Override // com.google.android.gms.internal.ads.zzgal
    public boolean zzq(Object obj, Object obj2) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzgal
    public final Collection zzr() {
        Collection collection = this.zzb;
        if (collection != null) {
            return collection;
        }
        Collection collectionZzf = zzf();
        this.zzb = collectionZzf;
        return collectionZzf;
    }

    @Override // com.google.android.gms.internal.ads.zzgal
    public final Map zzs() {
        Map map = this.zzc;
        if (map != null) {
            return map;
        }
        Map mapZzj = zzj();
        this.zzc = mapZzj;
        return mapZzj;
    }

    public final Set zzt() {
        Set set = this.zza;
        if (set != null) {
            return set;
        }
        Set setZzl = zzl();
        this.zza = setZzl;
        return setZzl;
    }
}
