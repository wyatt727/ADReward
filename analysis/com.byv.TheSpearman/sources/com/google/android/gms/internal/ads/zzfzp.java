package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzfzp {
    Object[] zza;
    int zzb;
    zzfzo zzc;

    public zzfzp() {
        this(4);
    }

    private final void zzd(int i) {
        Object[] objArr = this.zza;
        int length = objArr.length;
        int i2 = i + i;
        if (i2 > length) {
            this.zza = Arrays.copyOf(objArr, zzfzh.zze(length, i2));
        }
    }

    public final zzfzp zza(Object obj, Object obj2) {
        zzd(this.zzb + 1);
        zzfyk.zzb(obj, obj2);
        Object[] objArr = this.zza;
        int i = this.zzb;
        int i2 = i + i;
        objArr[i2] = obj;
        objArr[i2 + 1] = obj2;
        this.zzb = i + 1;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final zzfzp zzb(Iterable iterable) {
        if (iterable instanceof Collection) {
            zzd(this.zzb + iterable.size());
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            zza(entry.getKey(), entry.getValue());
        }
        return this;
    }

    public final zzfzq zzc() {
        zzfzo zzfzoVar = this.zzc;
        if (zzfzoVar != null) {
            throw zzfzoVar.zza();
        }
        zzgbe zzgbeVarZzj = zzgbe.zzj(this.zzb, this.zza, this);
        zzfzo zzfzoVar2 = this.zzc;
        if (zzfzoVar2 == null) {
            return zzgbeVarZzj;
        }
        throw zzfzoVar2.zza();
    }

    zzfzp(int i) {
        this.zza = new Object[i + i];
        this.zzb = 0;
    }
}
