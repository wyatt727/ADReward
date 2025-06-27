package com.google.android.gms.measurement.internal;

import android.os.Binder;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.GoogleSignatureVerifier;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.UidVerifier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-measurement@@22.0.0 */
/* loaded from: classes3.dex */
public final class zzhq extends zzfr {
    private final zzni zza;
    private Boolean zzb;
    private String zzc;

    @Override // com.google.android.gms.measurement.internal.zzfs
    public final zzaj zza(zzo zzoVar) throws IllegalStateException {
        zzb(zzoVar, false);
        Preconditions.checkNotEmpty(zzoVar.zza);
        try {
            return (zzaj) this.zza.zzl().zzb(new zzih(this, zzoVar)).get(10000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            this.zza.zzj().zzg().zza("Failed to get consent. appId", zzfz.zza(zzoVar.zza), e);
            return new zzaj(null);
        }
    }

    final zzbd zzb(zzbd zzbdVar, zzo zzoVar) throws IllegalStateException {
        boolean z = false;
        if ("_cmp".equals(zzbdVar.zza) && zzbdVar.zzb != null && zzbdVar.zzb.zza() != 0) {
            String strZzd = zzbdVar.zzb.zzd("_cis");
            if ("referrer broadcast".equals(strZzd) || "referrer API".equals(strZzd)) {
                z = true;
            }
        }
        if (!z) {
            return zzbdVar;
        }
        this.zza.zzj().zzn().zza("Event has been filtered ", zzbdVar.toString());
        return new zzbd("_cmpx", zzbdVar.zzb, zzbdVar.zzc, zzbdVar.zzd);
    }

    @Override // com.google.android.gms.measurement.internal.zzfs
    public final String zzb(zzo zzoVar) throws IllegalStateException {
        zzb(zzoVar, false);
        return this.zza.zzb(zzoVar);
    }

    @Override // com.google.android.gms.measurement.internal.zzfs
    public final List<zzna> zza(zzo zzoVar, Bundle bundle) throws IllegalStateException {
        zzb(zzoVar, false);
        Preconditions.checkNotNull(zzoVar.zza);
        try {
            return (List) this.zza.zzl().zza(new zzik(this, zzoVar, bundle)).get();
        } catch (InterruptedException | ExecutionException e) {
            this.zza.zzj().zzg().zza("Failed to get trigger URIs. appId", zzfz.zza(zzoVar.zza), e);
            return Collections.emptyList();
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzfs
    public final List<zznt> zza(zzo zzoVar, boolean z) throws IllegalStateException {
        zzb(zzoVar, false);
        String str = zzoVar.zza;
        Preconditions.checkNotNull(str);
        try {
            List<zznv> list = (List) this.zza.zzl().zza(new zzin(this, str)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (zznv zznvVar : list) {
                if (z || !zzny.zzg(zznvVar.zzc)) {
                    arrayList.add(new zznt(zznvVar));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            this.zza.zzj().zzg().zza("Failed to get user properties. appId", zzfz.zza(zzoVar.zza), e);
            return null;
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzfs
    public final List<zzae> zza(String str, String str2, zzo zzoVar) throws IllegalStateException {
        zzb(zzoVar, false);
        String str3 = zzoVar.zza;
        Preconditions.checkNotNull(str3);
        try {
            return (List) this.zza.zzl().zza(new zzid(this, str3, str, str2)).get();
        } catch (InterruptedException | ExecutionException e) {
            this.zza.zzj().zzg().zza("Failed to get conditional user properties", e);
            return Collections.emptyList();
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzfs
    public final List<zzae> zza(String str, String str2, String str3) throws IllegalStateException {
        zza(str, true);
        try {
            return (List) this.zza.zzl().zza(new zzic(this, str, str2, str3)).get();
        } catch (InterruptedException | ExecutionException e) {
            this.zza.zzj().zzg().zza("Failed to get conditional user properties as", e);
            return Collections.emptyList();
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzfs
    public final List<zznt> zza(String str, String str2, boolean z, zzo zzoVar) throws IllegalStateException {
        zzb(zzoVar, false);
        String str3 = zzoVar.zza;
        Preconditions.checkNotNull(str3);
        try {
            List<zznv> list = (List) this.zza.zzl().zza(new zzib(this, str3, str, str2)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (zznv zznvVar : list) {
                if (z || !zzny.zzg(zznvVar.zzc)) {
                    arrayList.add(new zznt(zznvVar));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            this.zza.zzj().zzg().zza("Failed to query user properties. appId", zzfz.zza(zzoVar.zza), e);
            return Collections.emptyList();
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzfs
    public final List<zznt> zza(String str, String str2, String str3, boolean z) throws IllegalStateException {
        zza(str, true);
        try {
            List<zznv> list = (List) this.zza.zzl().zza(new zzia(this, str, str2, str3)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (zznv zznvVar : list) {
                if (z || !zzny.zzg(zznvVar.zzc)) {
                    arrayList.add(new zznt(zznvVar));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            this.zza.zzj().zzg().zza("Failed to get user properties as. appId", zzfz.zza(str), e);
            return Collections.emptyList();
        }
    }

    public zzhq(zzni zzniVar) {
        this(zzniVar, null);
    }

    private zzhq(zzni zzniVar, String str) {
        Preconditions.checkNotNull(zzniVar);
        this.zza = zzniVar;
        this.zzc = null;
    }

    @Override // com.google.android.gms.measurement.internal.zzfs
    public final void zzc(zzo zzoVar) throws IllegalStateException {
        zzb(zzoVar, false);
        zzb(new zzhx(this, zzoVar));
    }

    private final void zzb(zzo zzoVar, boolean z) throws IllegalStateException {
        Preconditions.checkNotNull(zzoVar);
        Preconditions.checkNotEmpty(zzoVar.zza);
        zza(zzoVar.zza, false);
        this.zza.zzq().zza(zzoVar.zzb, zzoVar.zzp);
    }

    private final void zza(String str, boolean z) throws IllegalStateException {
        if (TextUtils.isEmpty(str)) {
            this.zza.zzj().zzg().zza("Measurement Service called without app package");
            throw new SecurityException("Measurement Service called without app package");
        }
        if (z) {
            try {
                if (this.zzb == null) {
                    this.zzb = Boolean.valueOf("com.google.android.gms".equals(this.zzc) || UidVerifier.isGooglePlayServicesUid(this.zza.zza(), Binder.getCallingUid()) || GoogleSignatureVerifier.getInstance(this.zza.zza()).isUidGoogleSigned(Binder.getCallingUid()));
                }
                if (this.zzb.booleanValue()) {
                    return;
                }
            } catch (SecurityException e) {
                this.zza.zzj().zzg().zza("Measurement Service called with invalid calling package. appId", zzfz.zza(str));
                throw e;
            }
        }
        if (this.zzc == null && GooglePlayServicesUtilLight.uidHasPackageName(this.zza.zza(), Binder.getCallingUid(), str)) {
            this.zzc = str;
        }
        if (str.equals(this.zzc)) {
        } else {
            throw new SecurityException(String.format("Unknown calling package name '%s'.", str));
        }
    }

    final void zzc(zzbd zzbdVar, zzo zzoVar) throws IllegalStateException {
        if (!this.zza.zzi().zzl(zzoVar.zza)) {
            zzd(zzbdVar, zzoVar);
            return;
        }
        this.zza.zzj().zzp().zza("EES config found for", zzoVar.zza);
        zzgz zzgzVarZzi = this.zza.zzi();
        String str = zzoVar.zza;
        com.google.android.gms.internal.measurement.zzb zzbVar = TextUtils.isEmpty(str) ? null : zzgzVarZzi.zza.get(str);
        if (zzbVar == null) {
            this.zza.zzj().zzp().zza("EES not loaded for", zzoVar.zza);
            zzd(zzbdVar, zzoVar);
            return;
        }
        boolean zZza = false;
        try {
            Map<String, Object> mapZza = this.zza.zzp().zza(zzbdVar.zzb.zzb(), true);
            String strZza = zziu.zza(zzbdVar.zza);
            if (strZza == null) {
                strZza = zzbdVar.zza;
            }
            zZza = zzbVar.zza(new com.google.android.gms.internal.measurement.zzad(strZza, zzbdVar.zzd, mapZza));
        } catch (com.google.android.gms.internal.measurement.zzc unused) {
            this.zza.zzj().zzg().zza("EES error. appId, eventName", zzoVar.zzb, zzbdVar.zza);
        }
        if (!zZza) {
            this.zza.zzj().zzp().zza("EES was not applied to event", zzbdVar.zza);
            zzd(zzbdVar, zzoVar);
            return;
        }
        if (zzbVar.zzd()) {
            this.zza.zzj().zzp().zza("EES edited event", zzbdVar.zza);
            zzd(this.zza.zzp().zza(zzbVar.zza().zzb()), zzoVar);
        } else {
            zzd(zzbdVar, zzoVar);
        }
        if (zzbVar.zzc()) {
            for (com.google.android.gms.internal.measurement.zzad zzadVar : zzbVar.zza().zzc()) {
                this.zza.zzj().zzp().zza("EES logging created event", zzadVar.zzb());
                zzd(this.zza.zzp().zza(zzadVar), zzoVar);
            }
        }
    }

    final /* synthetic */ void zza(String str, Bundle bundle) {
        this.zza.zzf().zza(str, bundle);
    }

    final /* synthetic */ void zzi(zzo zzoVar) {
        this.zza.zzr();
        this.zza.zze(zzoVar);
    }

    final /* synthetic */ void zzj(zzo zzoVar) {
        this.zza.zzr();
        this.zza.zzf(zzoVar);
    }

    @Override // com.google.android.gms.measurement.internal.zzfs
    public final void zza(zzbd zzbdVar, zzo zzoVar) throws IllegalStateException {
        Preconditions.checkNotNull(zzbdVar);
        zzb(zzoVar, false);
        zzb(new zzig(this, zzbdVar, zzoVar));
    }

    @Override // com.google.android.gms.measurement.internal.zzfs
    public final void zza(zzbd zzbdVar, String str, String str2) throws IllegalStateException {
        Preconditions.checkNotNull(zzbdVar);
        Preconditions.checkNotEmpty(str);
        zza(str, true);
        zzb(new zzij(this, zzbdVar, str));
    }

    private final void zzd(zzbd zzbdVar, zzo zzoVar) {
        this.zza.zzr();
        this.zza.zza(zzbdVar, zzoVar);
    }

    @Override // com.google.android.gms.measurement.internal.zzfs
    public final void zzd(zzo zzoVar) throws IllegalStateException {
        Preconditions.checkNotEmpty(zzoVar.zza);
        zza(zzoVar.zza, false);
        zzb(new zzif(this, zzoVar));
    }

    private final void zza(Runnable runnable) throws IllegalStateException {
        Preconditions.checkNotNull(runnable);
        if (this.zza.zzl().zzg()) {
            runnable.run();
        } else {
            this.zza.zzl().zzc(runnable);
        }
    }

    private final void zzb(Runnable runnable) throws IllegalStateException {
        Preconditions.checkNotNull(runnable);
        if (this.zza.zzl().zzg()) {
            runnable.run();
        } else {
            this.zza.zzl().zzb(runnable);
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzfs
    public final void zza(zzae zzaeVar, zzo zzoVar) throws IllegalStateException {
        Preconditions.checkNotNull(zzaeVar);
        Preconditions.checkNotNull(zzaeVar.zzc);
        zzb(zzoVar, false);
        zzae zzaeVar2 = new zzae(zzaeVar);
        zzaeVar2.zza = zzoVar.zza;
        zzb(new zzhz(this, zzaeVar2, zzoVar));
    }

    @Override // com.google.android.gms.measurement.internal.zzfs
    public final void zza(zzae zzaeVar) throws IllegalStateException {
        Preconditions.checkNotNull(zzaeVar);
        Preconditions.checkNotNull(zzaeVar.zzc);
        Preconditions.checkNotEmpty(zzaeVar.zza);
        zza(zzaeVar.zza, true);
        zzb(new zzhy(this, new zzae(zzaeVar)));
    }

    @Override // com.google.android.gms.measurement.internal.zzfs
    public final void zze(zzo zzoVar) throws IllegalStateException {
        Preconditions.checkNotEmpty(zzoVar.zza);
        Preconditions.checkNotNull(zzoVar.zzt);
        zza(new zzie(this, zzoVar));
    }

    @Override // com.google.android.gms.measurement.internal.zzfs
    public final void zza(long j, String str, String str2, String str3) throws IllegalStateException {
        zzb(new zzhw(this, str2, str3, str, j));
    }

    @Override // com.google.android.gms.measurement.internal.zzfs
    public final void zza(final Bundle bundle, zzo zzoVar) throws IllegalStateException {
        zzb(zzoVar, false);
        final String str = zzoVar.zza;
        Preconditions.checkNotNull(str);
        zzb(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzhv
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zza(str, bundle);
            }
        });
    }

    @Override // com.google.android.gms.measurement.internal.zzfs
    public final void zzf(final zzo zzoVar) throws IllegalStateException {
        Preconditions.checkNotEmpty(zzoVar.zza);
        Preconditions.checkNotNull(zzoVar.zzt);
        zza(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzhs
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzi(zzoVar);
            }
        });
    }

    @Override // com.google.android.gms.measurement.internal.zzfs
    public final void zzg(zzo zzoVar) throws IllegalStateException {
        zzb(zzoVar, false);
        zzb(new zzhu(this, zzoVar));
    }

    @Override // com.google.android.gms.measurement.internal.zzfs
    public final void zzh(final zzo zzoVar) throws IllegalStateException {
        Preconditions.checkNotEmpty(zzoVar.zza);
        Preconditions.checkNotNull(zzoVar.zzt);
        zza(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzht
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzj(zzoVar);
            }
        });
    }

    @Override // com.google.android.gms.measurement.internal.zzfs
    public final void zza(zznt zzntVar, zzo zzoVar) throws IllegalStateException {
        Preconditions.checkNotNull(zzntVar);
        zzb(zzoVar, false);
        zzb(new zzil(this, zzntVar, zzoVar));
    }

    @Override // com.google.android.gms.measurement.internal.zzfs
    public final byte[] zza(zzbd zzbdVar, String str) throws IllegalStateException {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(zzbdVar);
        zza(str, true);
        this.zza.zzj().zzc().zza("Log and bundle. event", this.zza.zzg().zza(zzbdVar.zza));
        long jNanoTime = this.zza.zzb().nanoTime() / 1000000;
        try {
            byte[] bArr = (byte[]) this.zza.zzl().zzb(new zzii(this, zzbdVar, str)).get();
            if (bArr == null) {
                this.zza.zzj().zzg().zza("Log and bundle returned null. appId", zzfz.zza(str));
                bArr = new byte[0];
            }
            this.zza.zzj().zzc().zza("Log and bundle processed. event, size, time_ms", this.zza.zzg().zza(zzbdVar.zza), Integer.valueOf(bArr.length), Long.valueOf((this.zza.zzb().nanoTime() / 1000000) - jNanoTime));
            return bArr;
        } catch (InterruptedException | ExecutionException e) {
            this.zza.zzj().zzg().zza("Failed to log and bundle. appId, event, error", zzfz.zza(str), this.zza.zzg().zza(zzbdVar.zza), e);
            return null;
        }
    }
}
