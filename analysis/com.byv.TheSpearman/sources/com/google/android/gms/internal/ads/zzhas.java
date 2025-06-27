package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzhas extends zzgxt implements RandomAccess, zzhat {

    @Deprecated
    public static final zzhat zza;
    private static final zzhas zzb;
    private final List zzc;

    static {
        zzhas zzhasVar = new zzhas(false);
        zzb = zzhasVar;
        zza = zzhasVar;
    }

    public zzhas() {
        this(10);
    }

    private static String zzj(Object obj) {
        return obj instanceof String ? (String) obj : obj instanceof zzgyj ? ((zzgyj) obj).zzx(zzhai.zzb) : zzhai.zzd((byte[]) obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgxt, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        zzdJ();
        this.zzc.add(i, (String) obj);
        this.modCount++;
    }

    @Override // com.google.android.gms.internal.ads.zzgxt, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        zzdJ();
        if (collection instanceof zzhat) {
            collection = ((zzhat) collection).zzh();
        }
        boolean zAddAll = this.zzc.addAll(i, collection);
        this.modCount++;
        return zAddAll;
    }

    @Override // com.google.android.gms.internal.ads.zzgxt, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        zzdJ();
        this.zzc.clear();
        this.modCount++;
    }

    @Override // com.google.android.gms.internal.ads.zzgxt, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        zzdJ();
        Object objRemove = this.zzc.remove(i);
        this.modCount++;
        return zzj(objRemove);
    }

    @Override // com.google.android.gms.internal.ads.zzgxt, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        zzdJ();
        return zzj(this.zzc.set(i, (String) obj));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc.size();
    }

    @Override // com.google.android.gms.internal.ads.zzhat
    public final zzhat zzd() {
        return zzc() ? new zzhdc(this) : this;
    }

    @Override // com.google.android.gms.internal.ads.zzhat
    public final Object zze(int i) {
        return this.zzc.get(i);
    }

    @Override // com.google.android.gms.internal.ads.zzhah
    public final /* bridge */ /* synthetic */ zzhah zzf(int i) {
        if (i < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i);
        arrayList.addAll(this.zzc);
        return new zzhas(arrayList);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: zzg, reason: merged with bridge method [inline-methods] */
    public final String get(int i) {
        Object obj = this.zzc.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzgyj) {
            zzgyj zzgyjVar = (zzgyj) obj;
            String strZzx = zzgyjVar.zzx(zzhai.zzb);
            if (zzgyjVar.zzp()) {
                this.zzc.set(i, strZzx);
            }
            return strZzx;
        }
        byte[] bArr = (byte[]) obj;
        String strZzd = zzhai.zzd(bArr);
        if (zzhdm.zzi(bArr)) {
            this.zzc.set(i, strZzd);
        }
        return strZzd;
    }

    @Override // com.google.android.gms.internal.ads.zzhat
    public final List zzh() {
        return Collections.unmodifiableList(this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzhat
    public final void zzi(zzgyj zzgyjVar) {
        zzdJ();
        this.zzc.add(zzgyjVar);
        this.modCount++;
    }

    public zzhas(int i) {
        ArrayList arrayList = new ArrayList(i);
        super(true);
        this.zzc = arrayList;
    }

    private zzhas(ArrayList arrayList) {
        super(true);
        this.zzc = arrayList;
    }

    private zzhas(boolean z) {
        super(false);
        this.zzc = Collections.emptyList();
    }

    @Override // com.google.android.gms.internal.ads.zzgxt, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }
}
