package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzgoz {
    private final Map zza;
    private final Map zzb;
    private final Map zzc;
    private final Map zzd;

    public zzgoz() {
        this.zza = new HashMap();
        this.zzb = new HashMap();
        this.zzc = new HashMap();
        this.zzd = new HashMap();
    }

    public final zzgoz zza(zzgmw zzgmwVar) throws GeneralSecurityException {
        zzgpb zzgpbVar = new zzgpb(zzgmwVar.zzd(), zzgmwVar.zzc(), null);
        if (this.zzb.containsKey(zzgpbVar)) {
            zzgmw zzgmwVar2 = (zzgmw) this.zzb.get(zzgpbVar);
            if (!zzgmwVar2.equals(zzgmwVar) || !zzgmwVar.equals(zzgmwVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(zzgpbVar.toString()));
            }
        } else {
            this.zzb.put(zzgpbVar, zzgmwVar);
        }
        return this;
    }

    public final zzgoz zzb(zzgna zzgnaVar) throws GeneralSecurityException {
        zzgpd zzgpdVar = new zzgpd(zzgnaVar.zzc(), zzgnaVar.zzd(), null);
        if (this.zza.containsKey(zzgpdVar)) {
            zzgna zzgnaVar2 = (zzgna) this.zza.get(zzgpdVar);
            if (!zzgnaVar2.equals(zzgnaVar) || !zzgnaVar.equals(zzgnaVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(zzgpdVar.toString()));
            }
        } else {
            this.zza.put(zzgpdVar, zzgnaVar);
        }
        return this;
    }

    public final zzgoz zzc(zzgny zzgnyVar) throws GeneralSecurityException {
        zzgpb zzgpbVar = new zzgpb(zzgnyVar.zzd(), zzgnyVar.zzc(), null);
        if (this.zzd.containsKey(zzgpbVar)) {
            zzgny zzgnyVar2 = (zzgny) this.zzd.get(zzgpbVar);
            if (!zzgnyVar2.equals(zzgnyVar) || !zzgnyVar.equals(zzgnyVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(zzgpbVar.toString()));
            }
        } else {
            this.zzd.put(zzgpbVar, zzgnyVar);
        }
        return this;
    }

    public final zzgoz zzd(zzgoc zzgocVar) throws GeneralSecurityException {
        zzgpd zzgpdVar = new zzgpd(zzgocVar.zzc(), zzgocVar.zzd(), null);
        if (this.zzc.containsKey(zzgpdVar)) {
            zzgoc zzgocVar2 = (zzgoc) this.zzc.get(zzgpdVar);
            if (!zzgocVar2.equals(zzgocVar) || !zzgocVar.equals(zzgocVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(zzgpdVar.toString()));
            }
        } else {
            this.zzc.put(zzgpdVar, zzgocVar);
        }
        return this;
    }

    public zzgoz(zzgpf zzgpfVar) {
        this.zza = new HashMap(zzgpfVar.zza);
        this.zzb = new HashMap(zzgpfVar.zzb);
        this.zzc = new HashMap(zzgpfVar.zzc);
        this.zzd = new HashMap(zzgpfVar.zzd);
    }
}
