package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzgoi {
    private final Map zza;
    private final Map zzb;

    private zzgoi() {
        this.zza = new HashMap();
        this.zzb = new HashMap();
    }

    public final zzgoi zza(zzgog zzgogVar) throws GeneralSecurityException {
        Objects.requireNonNull(zzgogVar, "primitive constructor must be non-null");
        zzgok zzgokVar = new zzgok(zzgogVar.zzc(), zzgogVar.zzd(), null);
        if (this.zza.containsKey(zzgokVar)) {
            zzgog zzgogVar2 = (zzgog) this.zza.get(zzgokVar);
            if (!zzgogVar2.equals(zzgogVar) || !zzgogVar.equals(zzgogVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal PrimitiveConstructor object for already existing object of type: ".concat(zzgokVar.toString()));
            }
        } else {
            this.zza.put(zzgokVar, zzgogVar);
        }
        return this;
    }

    public final zzgoi zzb(zzggj zzggjVar) throws GeneralSecurityException {
        Map map = this.zzb;
        Class clsZzb = zzggjVar.zzb();
        if (map.containsKey(clsZzb)) {
            zzggj zzggjVar2 = (zzggj) this.zzb.get(clsZzb);
            if (!zzggjVar2.equals(zzggjVar) || !zzggjVar.equals(zzggjVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal PrimitiveWrapper object or input class object for already existing object of type".concat(clsZzb.toString()));
            }
        } else {
            this.zzb.put(clsZzb, zzggjVar);
        }
        return this;
    }

    /* synthetic */ zzgoi(zzgoh zzgohVar) {
        this.zza = new HashMap();
        this.zzb = new HashMap();
    }

    /* synthetic */ zzgoi(zzgom zzgomVar, zzgoh zzgohVar) {
        this.zza = new HashMap(zzgomVar.zza);
        this.zzb = new HashMap(zzgomVar.zzb);
    }
}
