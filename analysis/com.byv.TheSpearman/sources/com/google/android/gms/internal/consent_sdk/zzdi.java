package com.google.android.gms.internal.consent_sdk;

import com.json.t2;
import java.util.Iterator;
import java.util.Objects;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.ump:user-messaging-platform@@2.2.0 */
/* loaded from: classes3.dex */
final class zzdi extends zzde {
    final transient Object zza;

    zzdi(Object obj) {
        Objects.requireNonNull(obj);
        this.zza = obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(@CheckForNull Object obj) {
        return this.zza.equals(obj);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzde, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.zza.hashCode();
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzde, com.google.android.gms.internal.consent_sdk.zzda, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new zzdf(this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return t2.i.d + this.zza.toString() + t2.i.e;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzda
    final int zza(Object[] objArr, int i) {
        objArr[0] = this.zza;
        return 1;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzde, com.google.android.gms.internal.consent_sdk.zzda
    /* renamed from: zzd */
    public final zzdj iterator() {
        return new zzdf(this.zza);
    }
}
