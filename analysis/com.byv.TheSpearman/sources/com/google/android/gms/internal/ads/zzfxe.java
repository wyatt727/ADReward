package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzfxe {
    private final zzfwc zza;
    private final zzfxd zzb;

    private zzfxe(zzfxd zzfxdVar) {
        zzfwc zzfwcVar = zzfwb.zza;
        this.zzb = zzfxdVar;
        this.zza = zzfwcVar;
    }

    public static zzfxe zzb(int i) {
        return new zzfxe(new zzfxa(4000));
    }

    public static zzfxe zzc(zzfwc zzfwcVar) {
        return new zzfxe(new zzfwy(zzfwcVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Iterator zzg(CharSequence charSequence) {
        return this.zzb.zza(this, charSequence);
    }

    public final Iterable zzd(CharSequence charSequence) {
        Objects.requireNonNull(charSequence);
        return new zzfxb(this, charSequence);
    }

    public final List zzf(CharSequence charSequence) {
        Objects.requireNonNull(charSequence);
        Iterator itZzg = zzg(charSequence);
        ArrayList arrayList = new ArrayList();
        while (itZzg.hasNext()) {
            arrayList.add((String) itZzg.next());
        }
        return Collections.unmodifiableList(arrayList);
    }
}
