package com.google.android.gms.internal.ads;

import com.json.t2;
import java.util.Iterator;
import java.util.Objects;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzgbq extends zzfzs {
    final transient Object zza;

    zzgbq(Object obj) {
        Objects.requireNonNull(obj);
        this.zza = obj;
    }

    @Override // com.google.android.gms.internal.ads.zzfzi, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(@CheckForNull Object obj) {
        return this.zza.equals(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzfzs, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.zza.hashCode();
    }

    @Override // com.google.android.gms.internal.ads.zzfzs, com.google.android.gms.internal.ads.zzfzi, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new zzfzw(this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return t2.i.d + this.zza.toString() + t2.i.e;
    }

    @Override // com.google.android.gms.internal.ads.zzfzi
    final int zza(Object[] objArr, int i) {
        objArr[i] = this.zza;
        return i + 1;
    }

    @Override // com.google.android.gms.internal.ads.zzfzs, com.google.android.gms.internal.ads.zzfzi
    public final zzfzn zzd() {
        return zzfzn.zzn(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfzs, com.google.android.gms.internal.ads.zzfzi
    /* renamed from: zze */
    public final zzgbt iterator() {
        return new zzfzw(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfzi
    final boolean zzf() {
        return false;
    }
}
