package com.google.android.gms.internal.play_billing;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* compiled from: com.android.billingclient:billing@@6.2.1 */
/* loaded from: classes3.dex */
class zzfi extends AbstractMap {
    private final int zza;
    private boolean zzd;
    private volatile zzfg zze;
    private List zzb = Collections.emptyList();
    private Map zzc = Collections.emptyMap();
    private Map zzf = Collections.emptyMap();

    private final int zzk(Comparable comparable) {
        int size = this.zzb.size() - 1;
        int i = 0;
        if (size >= 0) {
            int iCompareTo = comparable.compareTo(((zzfc) this.zzb.get(size)).zza());
            if (iCompareTo > 0) {
                return -(size + 2);
            }
            if (iCompareTo == 0) {
                return size;
            }
        }
        while (i <= size) {
            int i2 = (i + size) / 2;
            int iCompareTo2 = comparable.compareTo(((zzfc) this.zzb.get(i2)).zza());
            if (iCompareTo2 < 0) {
                size = i2 - 1;
            } else {
                if (iCompareTo2 <= 0) {
                    return i2;
                }
                i = i2 + 1;
            }
        }
        return -(i + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object zzl(int i) {
        zzn();
        Object value = ((zzfc) this.zzb.remove(i)).getValue();
        if (!this.zzc.isEmpty()) {
            Iterator it = zzm().entrySet().iterator();
            List list = this.zzb;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new zzfc(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return value;
    }

    private final SortedMap zzm() {
        zzn();
        if (this.zzc.isEmpty() && !(this.zzc instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.zzc = treeMap;
            this.zzf = treeMap.descendingMap();
        }
        return (SortedMap) this.zzc;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzn() {
        if (this.zzd) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        zzn();
        if (!this.zzb.isEmpty()) {
            this.zzb.clear();
        }
        if (this.zzc.isEmpty()) {
            return;
        }
        this.zzc.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return zzk(comparable) >= 0 || this.zzc.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.zze == null) {
            this.zze = new zzfg(this, null);
        }
        return this.zze;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzfi)) {
            return super.equals(obj);
        }
        zzfi zzfiVar = (zzfi) obj;
        int size = size();
        if (size != zzfiVar.size()) {
            return false;
        }
        int iZzb = zzb();
        if (iZzb != zzfiVar.zzb()) {
            return entrySet().equals(zzfiVar.entrySet());
        }
        for (int i = 0; i < iZzb; i++) {
            if (!zzg(i).equals(zzfiVar.zzg(i))) {
                return false;
            }
        }
        if (iZzb != size) {
            return this.zzc.equals(zzfiVar.zzc);
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iZzk = zzk(comparable);
        return iZzk >= 0 ? ((zzfc) this.zzb.get(iZzk)).getValue() : this.zzc.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int iZzb = zzb();
        int iHashCode = 0;
        for (int i = 0; i < iZzb; i++) {
            iHashCode += ((zzfc) this.zzb.get(i)).hashCode();
        }
        return this.zzc.size() > 0 ? iHashCode + this.zzc.hashCode() : iHashCode;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        zzn();
        Comparable comparable = (Comparable) obj;
        int iZzk = zzk(comparable);
        if (iZzk >= 0) {
            return zzl(iZzk);
        }
        if (this.zzc.isEmpty()) {
            return null;
        }
        return this.zzc.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.zzb.size() + this.zzc.size();
    }

    public void zza() {
        if (this.zzd) {
            return;
        }
        this.zzc = this.zzc.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.zzc);
        this.zzf = this.zzf.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.zzf);
        this.zzd = true;
    }

    public final int zzb() {
        return this.zzb.size();
    }

    public final Iterable zzc() {
        return this.zzc.isEmpty() ? zzfb.zza() : this.zzc.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: zze, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        zzn();
        int iZzk = zzk(comparable);
        if (iZzk >= 0) {
            return ((zzfc) this.zzb.get(iZzk)).setValue(obj);
        }
        zzn();
        if (this.zzb.isEmpty() && !(this.zzb instanceof ArrayList)) {
            this.zzb = new ArrayList(this.zza);
        }
        int i = -(iZzk + 1);
        if (i >= this.zza) {
            return zzm().put(comparable, obj);
        }
        int size = this.zzb.size();
        int i2 = this.zza;
        if (size == i2) {
            zzfc zzfcVar = (zzfc) this.zzb.remove(i2 - 1);
            zzm().put(zzfcVar.zza(), zzfcVar.getValue());
        }
        this.zzb.add(i, new zzfc(this, comparable, obj));
        return null;
    }

    public final Map.Entry zzg(int i) {
        return (Map.Entry) this.zzb.get(i);
    }

    public final boolean zzj() {
        return this.zzd;
    }
}
