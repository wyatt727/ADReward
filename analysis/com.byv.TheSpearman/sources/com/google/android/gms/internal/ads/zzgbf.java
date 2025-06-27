package com.google.android.gms.internal.ads;

import java.util.Iterator;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzgbf extends zzfzs {
    static final zzgbf zza;
    private static final Object[] zzd;
    final transient Object[] zzb;
    final transient Object[] zzc;
    private final transient int zze;
    private final transient int zzf;
    private final transient int zzg;

    static {
        Object[] objArr = new Object[0];
        zzd = objArr;
        zza = new zzgbf(objArr, 0, objArr, 0, 0);
    }

    zzgbf(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
        this.zzb = objArr;
        this.zze = i;
        this.zzc = objArr2;
        this.zzf = i2;
        this.zzg = i3;
    }

    @Override // com.google.android.gms.internal.ads.zzfzi, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(@CheckForNull Object obj) {
        if (obj != null) {
            Object[] objArr = this.zzc;
            if (objArr.length != 0) {
                int iZzb = zzfzf.zzb(obj);
                while (true) {
                    int i = iZzb & this.zzf;
                    Object obj2 = objArr[i];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    iZzb = i + 1;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzfzs, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzfzs, com.google.android.gms.internal.ads.zzfzi, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return zzd().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzfzi
    final int zza(Object[] objArr, int i) {
        System.arraycopy(this.zzb, 0, objArr, i, this.zzg);
        return i + this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzfzi
    final int zzb() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzfzi
    final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzfzs, com.google.android.gms.internal.ads.zzfzi
    /* renamed from: zze */
    public final zzgbt iterator() {
        return zzd().listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.zzfzi
    final boolean zzf() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzfzi
    final Object[] zzg() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfzs
    final zzfzn zzi() {
        return zzfzn.zzj(this.zzb, this.zzg);
    }

    @Override // com.google.android.gms.internal.ads.zzfzs
    final boolean zzu() {
        return true;
    }
}
