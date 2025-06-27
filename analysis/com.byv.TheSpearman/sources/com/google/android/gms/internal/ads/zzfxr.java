package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzfxr extends zzgag {
    final /* synthetic */ zzfxt zza;

    zzfxr(zzfxt zzfxtVar) {
        this.zza = zzfxtVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgag, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(@CheckForNull Object obj) {
        return zzfym.zza(this.zza.zza.entrySet(), obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new zzfxs(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzgag, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(@CheckForNull Object obj) {
        if (!contains(obj)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Objects.requireNonNull(entry);
        zzfxt zzfxtVar = this.zza;
        zzfyg.zzo(zzfxtVar.zzb, entry.getKey());
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzgag
    final Map zza() {
        return this.zza;
    }
}
