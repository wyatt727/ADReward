package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Pair;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.util.Clock;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import org.checkerframework.dataflow.qual.Pure;

/* compiled from: com.google.android.gms:play-services-measurement@@22.0.0 */
/* loaded from: classes3.dex */
public final class zzmi extends zznd {
    public final zzgp zza;
    public final zzgp zzb;
    public final zzgp zzc;
    public final zzgp zzd;
    public final zzgp zze;
    private final Map<String, zzmh> zzg;

    @Override // com.google.android.gms.measurement.internal.zzim, com.google.android.gms.measurement.internal.zzio
    @Pure
    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }

    @Override // com.google.android.gms.measurement.internal.zznd
    protected final boolean zzc() {
        return false;
    }

    @Deprecated
    private final Pair<String, Boolean> zza(String str) throws IllegalStateException {
        zzmh zzmhVar;
        zzt();
        long jElapsedRealtime = zzb().elapsedRealtime();
        zzmh zzmhVar2 = this.zzg.get(str);
        if (zzmhVar2 != null && jElapsedRealtime < zzmhVar2.zzc) {
            return new Pair<>(zzmhVar2.zza, Boolean.valueOf(zzmhVar2.zzb));
        }
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(true);
        long jZzd = zze().zzd(str) + jElapsedRealtime;
        AdvertisingIdClient.Info advertisingIdInfo = null;
        try {
            try {
                advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(zza());
            } catch (PackageManager.NameNotFoundException unused) {
                if (zzmhVar2 != null && jElapsedRealtime < zzmhVar2.zzc + zze().zzc(str, zzbf.zzb)) {
                    return new Pair<>(zzmhVar2.zza, Boolean.valueOf(zzmhVar2.zzb));
                }
            }
        } catch (Exception e) {
            zzj().zzc().zza("Unable to get advertising id", e);
            zzmhVar = new zzmh("", false, jZzd);
        }
        if (advertisingIdInfo == null) {
            return new Pair<>("00000000-0000-0000-0000-000000000000", false);
        }
        String id = advertisingIdInfo.getId();
        zzmhVar = id != null ? new zzmh(id, advertisingIdInfo.isLimitAdTrackingEnabled(), jZzd) : new zzmh("", advertisingIdInfo.isLimitAdTrackingEnabled(), jZzd);
        this.zzg.put(str, zzmhVar);
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(false);
        return new Pair<>(zzmhVar.zza, Boolean.valueOf(zzmhVar.zzb));
    }

    final Pair<String, Boolean> zza(String str, zziq zziqVar) {
        if (zziqVar.zzi()) {
            return zza(str);
        }
        return new Pair<>("", false);
    }

    @Override // com.google.android.gms.measurement.internal.zzim, com.google.android.gms.measurement.internal.zzio
    @Pure
    public final /* bridge */ /* synthetic */ Clock zzb() {
        return super.zzb();
    }

    @Override // com.google.android.gms.measurement.internal.zzne
    public final /* bridge */ /* synthetic */ zzu zzg() {
        return super.zzg();
    }

    @Override // com.google.android.gms.measurement.internal.zzim, com.google.android.gms.measurement.internal.zzio
    @Pure
    public final /* bridge */ /* synthetic */ zzab zzd() {
        return super.zzd();
    }

    @Override // com.google.android.gms.measurement.internal.zzim
    @Pure
    public final /* bridge */ /* synthetic */ zzag zze() {
        return super.zze();
    }

    @Override // com.google.android.gms.measurement.internal.zzne
    public final /* bridge */ /* synthetic */ zzal zzh() {
        return super.zzh();
    }

    @Override // com.google.android.gms.measurement.internal.zzim
    @Pure
    public final /* bridge */ /* synthetic */ zzax zzf() {
        return super.zzf();
    }

    @Override // com.google.android.gms.measurement.internal.zzim
    @Pure
    public final /* bridge */ /* synthetic */ zzfy zzi() {
        return super.zzi();
    }

    @Override // com.google.android.gms.measurement.internal.zzim, com.google.android.gms.measurement.internal.zzio
    @Pure
    public final /* bridge */ /* synthetic */ zzfz zzj() {
        return super.zzj();
    }

    @Override // com.google.android.gms.measurement.internal.zzim
    @Pure
    public final /* bridge */ /* synthetic */ zzgo zzk() {
        return super.zzk();
    }

    @Override // com.google.android.gms.measurement.internal.zzne
    public final /* bridge */ /* synthetic */ zzgz zzm() {
        return super.zzm();
    }

    @Override // com.google.android.gms.measurement.internal.zzim, com.google.android.gms.measurement.internal.zzio
    @Pure
    public final /* bridge */ /* synthetic */ zzhj zzl() {
        return super.zzl();
    }

    @Override // com.google.android.gms.measurement.internal.zzne
    public final /* bridge */ /* synthetic */ zzmi zzn() {
        return super.zzn();
    }

    @Override // com.google.android.gms.measurement.internal.zzne
    public final /* bridge */ /* synthetic */ zzng zzo() {
        return super.zzo();
    }

    @Override // com.google.android.gms.measurement.internal.zzne
    public final /* bridge */ /* synthetic */ zznr g_() {
        return super.g_();
    }

    @Override // com.google.android.gms.measurement.internal.zzim
    @Pure
    public final /* bridge */ /* synthetic */ zzny zzq() {
        return super.zzq();
    }

    @Deprecated
    final String zza(String str, boolean z) throws NoSuchAlgorithmException {
        zzt();
        String str2 = z ? (String) zza(str).first : "00000000-0000-0000-0000-000000000000";
        MessageDigest messageDigestZzu = zzny.zzu();
        if (messageDigestZzu == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new BigInteger(1, messageDigestZzu.digest(str2.getBytes())));
    }

    zzmi(zzni zzniVar) {
        super(zzniVar);
        this.zzg = new HashMap();
        zzgo zzgoVarZzk = zzk();
        Objects.requireNonNull(zzgoVarZzk);
        this.zza = new zzgp(zzgoVarZzk, "last_delete_stale", 0L);
        zzgo zzgoVarZzk2 = zzk();
        Objects.requireNonNull(zzgoVarZzk2);
        this.zzb = new zzgp(zzgoVarZzk2, "backoff", 0L);
        zzgo zzgoVarZzk3 = zzk();
        Objects.requireNonNull(zzgoVarZzk3);
        this.zzc = new zzgp(zzgoVarZzk3, "last_upload", 0L);
        zzgo zzgoVarZzk4 = zzk();
        Objects.requireNonNull(zzgoVarZzk4);
        this.zzd = new zzgp(zzgoVarZzk4, "last_upload_attempt", 0L);
        zzgo zzgoVarZzk5 = zzk();
        Objects.requireNonNull(zzgoVarZzk5);
        this.zze = new zzgp(zzgoVarZzk5, "midnight_offset", 0L);
    }

    @Override // com.google.android.gms.measurement.internal.zzim
    public final /* bridge */ /* synthetic */ void zzr() {
        super.zzr();
    }

    @Override // com.google.android.gms.measurement.internal.zzim
    public final /* bridge */ /* synthetic */ void zzs() {
        super.zzs();
    }

    @Override // com.google.android.gms.measurement.internal.zzim
    public final /* bridge */ /* synthetic */ void zzt() {
        super.zzt();
    }
}
