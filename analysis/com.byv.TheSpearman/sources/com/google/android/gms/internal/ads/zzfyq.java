package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzfyq extends AbstractSet {
    final /* synthetic */ zzfyw zza;

    zzfyq(zzfyw zzfywVar) {
        this.zza = zzfywVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.zza.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(@CheckForNull Object obj) {
        Map mapZzl = this.zza.zzl();
        if (mapZzl != null) {
            return mapZzl.entrySet().contains(obj);
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            int iZzw = this.zza.zzw(entry.getKey());
            if (iZzw != -1 && zzfwl.zza(zzfyw.zzj(this.zza, iZzw), entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        zzfyw zzfywVar = this.zza;
        Map mapZzl = zzfywVar.zzl();
        return mapZzl != null ? mapZzl.entrySet().iterator() : new zzfyo(zzfywVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(@CheckForNull Object obj) {
        Map mapZzl = this.zza.zzl();
        if (mapZzl != null) {
            return mapZzl.entrySet().remove(obj);
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        zzfyw zzfywVar = this.zza;
        if (zzfywVar.zzr()) {
            return false;
        }
        int iZzv = zzfywVar.zzv();
        Object key = entry.getKey();
        Object value = entry.getValue();
        zzfyw zzfywVar2 = this.zza;
        int iZzb = zzfyx.zzb(key, value, iZzv, zzfyw.zzi(zzfywVar2), zzfywVar2.zzA(), zzfywVar2.zzB(), zzfywVar2.zzC());
        if (iZzb == -1) {
            return false;
        }
        this.zza.zzq(iZzb, iZzv);
        zzfyw zzfywVar3 = this.zza;
        zzfywVar3.zzg--;
        this.zza.zzo();
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zza.size();
    }
}
