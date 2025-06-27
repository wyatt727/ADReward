package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzgms {
    private static final Logger zza = Logger.getLogger(zzgms.class.getName());
    private static final zzgms zzb = new zzgms();
    private final ConcurrentMap zzc = new ConcurrentHashMap();
    private final ConcurrentMap zzd = new ConcurrentHashMap();

    public static zzgms zzc() {
        return zzb;
    }

    private final synchronized zzgfu zzg(String str) throws GeneralSecurityException {
        if (!this.zzc.containsKey(str)) {
            throw new GeneralSecurityException("No key manager found for key type ".concat(String.valueOf(str)));
        }
        return (zzgfu) this.zzc.get(str);
    }

    private final synchronized void zzh(zzgfu zzgfuVar, boolean z, boolean z2) throws GeneralSecurityException {
        String str = ((zzgnb) zzgfuVar).zza;
        if (this.zzd.containsKey(str) && !((Boolean) this.zzd.get(str)).booleanValue()) {
            throw new GeneralSecurityException("New keys are already disallowed for key type ".concat(str));
        }
        zzgfu zzgfuVar2 = (zzgfu) this.zzc.get(str);
        if (zzgfuVar2 != null && !zzgfuVar2.getClass().equals(zzgfuVar.getClass())) {
            zza.logp(Level.WARNING, "com.google.crypto.tink.internal.KeyManagerRegistry", "insertKeyManager", "Attempted overwrite of a registered key manager for key type ".concat(str));
            throw new GeneralSecurityException(String.format("typeUrl (%s) is already registered with %s, cannot be re-registered with %s", str, zzgfuVar2.getClass().getName(), zzgfuVar.getClass().getName()));
        }
        this.zzc.putIfAbsent(str, zzgfuVar);
        this.zzd.put(str, true);
    }

    public final zzgfu zza(String str, Class cls) throws GeneralSecurityException {
        zzgfu zzgfuVarZzg = zzg(str);
        if (zzgfuVarZzg.zzb().equals(cls)) {
            return zzgfuVarZzg;
        }
        throw new GeneralSecurityException("Primitive type " + cls.getName() + " not supported by key manager of type " + String.valueOf(zzgfuVarZzg.getClass()) + ", which only supports: " + zzgfuVarZzg.zzb().toString());
    }

    public final zzgfu zzb(String str) throws GeneralSecurityException {
        return zzg(str);
    }

    public final synchronized void zzd(zzgfu zzgfuVar, boolean z) throws GeneralSecurityException {
        zzf(zzgfuVar, 1, true);
    }

    public final boolean zze(String str) {
        return ((Boolean) this.zzd.get(str)).booleanValue();
    }

    public final synchronized void zzf(zzgfu zzgfuVar, int i, boolean z) throws GeneralSecurityException {
        if (!zzgml.zza(i)) {
            throw new GeneralSecurityException("Cannot register key manager: FIPS compatibility insufficient");
        }
        zzh(zzgfuVar, false, true);
    }
}
