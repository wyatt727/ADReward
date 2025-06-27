package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.mbridge.msdk.MBridgeConstans;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.checkerframework.dataflow.qual.Pure;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.0 */
/* loaded from: classes3.dex */
public final class zzky extends zze {
    protected zzkv zza;
    private volatile zzkv zzb;
    private volatile zzkv zzc;
    private final Map<Activity, zzkv> zzd;
    private Activity zze;
    private volatile boolean zzf;
    private volatile zzkv zzg;
    private zzkv zzh;
    private boolean zzi;
    private final Object zzj;

    @Override // com.google.android.gms.measurement.internal.zzim, com.google.android.gms.measurement.internal.zzio
    @Pure
    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }

    @Override // com.google.android.gms.measurement.internal.zze
    protected final boolean zzz() {
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.zzim, com.google.android.gms.measurement.internal.zzio
    @Pure
    public final /* bridge */ /* synthetic */ Clock zzb() {
        return super.zzb();
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    public final /* bridge */ /* synthetic */ zzb zzc() {
        return super.zzc();
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

    @Override // com.google.android.gms.measurement.internal.zzim
    @Pure
    public final /* bridge */ /* synthetic */ zzax zzf() {
        return super.zzf();
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    public final /* bridge */ /* synthetic */ zzft zzg() {
        return super.zzg();
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    public final /* bridge */ /* synthetic */ zzfw zzh() {
        return super.zzh();
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

    @Override // com.google.android.gms.measurement.internal.zzim, com.google.android.gms.measurement.internal.zzio
    @Pure
    public final /* bridge */ /* synthetic */ zzhj zzl() {
        return super.zzl();
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    public final /* bridge */ /* synthetic */ zzjc zzm() {
        return super.zzm();
    }

    private final zzkv zzd(Activity activity) {
        Preconditions.checkNotNull(activity);
        zzkv zzkvVar = this.zzd.get(activity);
        if (zzkvVar == null) {
            zzkv zzkvVar2 = new zzkv(null, zza(activity.getClass(), "Activity"), zzq().zzm());
            this.zzd.put(activity, zzkvVar2);
            zzkvVar = zzkvVar2;
        }
        return this.zzg != null ? this.zzg : zzkvVar;
    }

    public final zzkv zzaa() {
        return this.zzb;
    }

    public final zzkv zza(boolean z) {
        zzu();
        zzt();
        if (!z) {
            return this.zza;
        }
        zzkv zzkvVar = this.zza;
        return zzkvVar != null ? zzkvVar : this.zzh;
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    public final /* bridge */ /* synthetic */ zzky zzn() {
        return super.zzn();
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    public final /* bridge */ /* synthetic */ zzld zzo() {
        return super.zzo();
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    public final /* bridge */ /* synthetic */ zzmn zzp() {
        return super.zzp();
    }

    @Override // com.google.android.gms.measurement.internal.zzim
    @Pure
    public final /* bridge */ /* synthetic */ zzny zzq() {
        return super.zzq();
    }

    private final String zza(Class<?> cls, String str) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            return str;
        }
        String[] strArrSplit = canonicalName.split("\\.");
        String str2 = strArrSplit.length > 0 ? strArrSplit[strArrSplit.length - 1] : "";
        return str2.length() > zze().zza((String) null, false) ? str2.substring(0, zze().zza((String) null, false)) : str2;
    }

    static /* synthetic */ void zza(zzky zzkyVar, Bundle bundle, zzkv zzkvVar, zzkv zzkvVar2, long j) throws IllegalStateException, IllegalAccessException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
        if (bundle != null) {
            bundle.remove(FirebaseAnalytics.Param.SCREEN_NAME);
            bundle.remove(FirebaseAnalytics.Param.SCREEN_CLASS);
        }
        zzkyVar.zza(zzkvVar, zzkvVar2, j, true, zzkyVar.zzq().zza((String) null, FirebaseAnalytics.Event.SCREEN_VIEW, bundle, (List<String>) null, false));
    }

    public zzky(zzhm zzhmVar) {
        super(zzhmVar);
        this.zzj = new Object();
        this.zzd = new ConcurrentHashMap();
    }

    private final void zza(Activity activity, zzkv zzkvVar, boolean z) throws IllegalStateException {
        zzkv zzkvVar2;
        zzkv zzkvVar3 = this.zzb == null ? this.zzc : this.zzb;
        if (zzkvVar.zzb == null) {
            zzkvVar2 = new zzkv(zzkvVar.zza, activity != null ? zza(activity.getClass(), "Activity") : null, zzkvVar.zzc, zzkvVar.zze, zzkvVar.zzf);
        } else {
            zzkvVar2 = zzkvVar;
        }
        this.zzc = this.zzb;
        this.zzb = zzkvVar2;
        zzl().zzb(new zzla(this, zzkvVar2, zzkvVar3, zzb().elapsedRealtime(), z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzkv zzkvVar, zzkv zzkvVar2, long j, boolean z, Bundle bundle) throws IllegalStateException, IllegalAccessException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
        zzt();
        boolean z2 = false;
        boolean z3 = (zzkvVar2 != null && zzkvVar2.zzc == zzkvVar.zzc && Objects.equals(zzkvVar2.zzb, zzkvVar.zzb) && Objects.equals(zzkvVar2.zza, zzkvVar.zza)) ? false : true;
        if (z && this.zza != null) {
            z2 = true;
        }
        if (z3) {
            Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
            zzny.zza(zzkvVar, bundle2, true);
            if (zzkvVar2 != null) {
                if (zzkvVar2.zza != null) {
                    bundle2.putString("_pn", zzkvVar2.zza);
                }
                if (zzkvVar2.zzb != null) {
                    bundle2.putString("_pc", zzkvVar2.zzb);
                }
                bundle2.putLong("_pi", zzkvVar2.zzc);
            }
            if (z2) {
                long jZza = zzp().zzb.zza(j);
                if (jZza > 0) {
                    zzq().zza(bundle2, jZza);
                }
            }
            if (!zze().zzv()) {
                bundle2.putLong("_mst", 1L);
            }
            zzm().zza(zzkvVar.zze ? MBridgeConstans.DYNAMIC_VIEW_WX_APP : "auto", "_vs", (!zzkvVar.zze || zzkvVar.zzf == 0) ? zzb().currentTimeMillis() : zzkvVar.zzf, bundle2);
        }
        if (z2) {
            zza(this.zza, true, j);
        }
        this.zza = zzkvVar;
        if (zzkvVar.zze) {
            this.zzh = zzkvVar;
        }
        zzo().zza(zzkvVar);
    }

    @Override // com.google.android.gms.measurement.internal.zzf, com.google.android.gms.measurement.internal.zzim
    public final /* bridge */ /* synthetic */ void zzr() {
        super.zzr();
    }

    @Override // com.google.android.gms.measurement.internal.zzf, com.google.android.gms.measurement.internal.zzim
    public final /* bridge */ /* synthetic */ void zzs() {
        super.zzs();
    }

    @Override // com.google.android.gms.measurement.internal.zzf, com.google.android.gms.measurement.internal.zzim
    public final /* bridge */ /* synthetic */ void zzt() {
        super.zzt();
    }

    public final void zza(Activity activity, Bundle bundle) {
        Bundle bundle2;
        if (!zze().zzv() || bundle == null || (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) == null) {
            return;
        }
        this.zzd.put(activity, new zzkv(bundle2.getString("name"), bundle2.getString("referrer_name"), bundle2.getLong("id")));
    }

    public final void zza(Activity activity) {
        synchronized (this.zzj) {
            if (activity == this.zze) {
                this.zze = null;
            }
        }
        if (zze().zzv()) {
            this.zzd.remove(activity);
        }
    }

    public final void zzb(Activity activity) throws IllegalStateException {
        synchronized (this.zzj) {
            this.zzi = false;
            this.zzf = true;
        }
        long jElapsedRealtime = zzb().elapsedRealtime();
        if (!zze().zzv()) {
            this.zzb = null;
            zzl().zzb(new zzlc(this, jElapsedRealtime));
        } else {
            zzkv zzkvVarZzd = zzd(activity);
            this.zzc = this.zzb;
            this.zzb = null;
            zzl().zzb(new zzlb(this, zzkvVarZzd, jElapsedRealtime));
        }
    }

    public final void zzc(Activity activity) throws IllegalStateException {
        synchronized (this.zzj) {
            this.zzi = true;
            if (activity != this.zze) {
                synchronized (this.zzj) {
                    this.zze = activity;
                    this.zzf = false;
                }
                if (zze().zzv()) {
                    this.zzg = null;
                    zzl().zzb(new zzle(this));
                }
            }
        }
        if (!zze().zzv()) {
            this.zzb = this.zzg;
            zzl().zzb(new zzkz(this));
        } else {
            zza(activity, zzd(activity), false);
            zzb zzbVarZzc = zzc();
            zzbVarZzc.zzl().zzb(new zzc(zzbVarZzc, zzbVarZzc.zzb().elapsedRealtime()));
        }
    }

    public final void zzb(Activity activity, Bundle bundle) {
        zzkv zzkvVar;
        if (!zze().zzv() || bundle == null || (zzkvVar = this.zzd.get(activity)) == null) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putLong("id", zzkvVar.zzc);
        bundle2.putString("name", zzkvVar.zza);
        bundle2.putString("referrer_name", zzkvVar.zzb);
        bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzkv zzkvVar, boolean z, long j) {
        zzc().zza(zzb().elapsedRealtime());
        if (!zzp().zza(zzkvVar != null && zzkvVar.zzd, z, j) || zzkvVar == null) {
            return;
        }
        zzkvVar.zzd = false;
    }

    @Deprecated
    public final void zza(Activity activity, String str, String str2) throws IllegalStateException {
        if (!zze().zzv()) {
            zzj().zzv().zza("setCurrentScreen cannot be called while screen reporting is disabled.");
            return;
        }
        zzkv zzkvVar = this.zzb;
        if (zzkvVar == null) {
            zzj().zzv().zza("setCurrentScreen cannot be called while no activity active");
            return;
        }
        if (this.zzd.get(activity) == null) {
            zzj().zzv().zza("setCurrentScreen must be called with an activity in the activity lifecycle");
            return;
        }
        if (str2 == null) {
            str2 = zza(activity.getClass(), "Activity");
        }
        boolean zEquals = Objects.equals(zzkvVar.zzb, str2);
        boolean zEquals2 = Objects.equals(zzkvVar.zza, str);
        if (zEquals && zEquals2) {
            zzj().zzv().zza("setCurrentScreen cannot be called with the same class and name");
            return;
        }
        if (str != null && (str.length() <= 0 || str.length() > zze().zza((String) null, false))) {
            zzj().zzv().zza("Invalid screen name length in setCurrentScreen. Length", Integer.valueOf(str.length()));
            return;
        }
        if (str2 != null && (str2.length() <= 0 || str2.length() > zze().zza((String) null, false))) {
            zzj().zzv().zza("Invalid class name length in setCurrentScreen. Length", Integer.valueOf(str2.length()));
            return;
        }
        zzj().zzp().zza("Setting current screen to name, class", str == null ? AbstractJsonLexerKt.NULL : str, str2);
        zzkv zzkvVar2 = new zzkv(str, str2, zzq().zzm());
        this.zzd.put(activity, zzkvVar2);
        zza(activity, zzkvVar2, true);
    }

    public final void zza(Bundle bundle, long j) {
        String str;
        synchronized (this.zzj) {
            if (!this.zzi) {
                zzj().zzv().zza("Cannot log screen view event when the app is in the background.");
                return;
            }
            String strZza = null;
            if (bundle != null) {
                String string = bundle.getString(FirebaseAnalytics.Param.SCREEN_NAME);
                if (string != null && (string.length() <= 0 || string.length() > zze().zza((String) null, false))) {
                    zzj().zzv().zza("Invalid screen name length for screen view. Length", Integer.valueOf(string.length()));
                    return;
                }
                String string2 = bundle.getString(FirebaseAnalytics.Param.SCREEN_CLASS);
                if (string2 != null && (string2.length() <= 0 || string2.length() > zze().zza((String) null, false))) {
                    zzj().zzv().zza("Invalid screen class length for screen view. Length", Integer.valueOf(string2.length()));
                    return;
                } else {
                    str = string;
                    strZza = string2;
                }
            } else {
                str = null;
            }
            if (strZza == null) {
                Activity activity = this.zze;
                strZza = activity != null ? zza(activity.getClass(), "Activity") : "Activity";
            }
            String str2 = strZza;
            zzkv zzkvVar = this.zzb;
            if (this.zzf && zzkvVar != null) {
                this.zzf = false;
                boolean zEquals = Objects.equals(zzkvVar.zzb, str2);
                boolean zEquals2 = Objects.equals(zzkvVar.zza, str);
                if (zEquals && zEquals2) {
                    zzj().zzv().zza("Ignoring call to log screen view event with duplicate parameters.");
                    return;
                }
            }
            zzj().zzp().zza("Logging screen view with name, class", str == null ? AbstractJsonLexerKt.NULL : str, str2 == null ? AbstractJsonLexerKt.NULL : str2);
            zzkv zzkvVar2 = this.zzb == null ? this.zzc : this.zzb;
            zzkv zzkvVar3 = new zzkv(str, str2, zzq().zzm(), true, j);
            this.zzb = zzkvVar3;
            this.zzc = zzkvVar2;
            this.zzg = zzkvVar3;
            zzl().zzb(new zzkx(this, bundle, zzkvVar3, zzkvVar2, zzb().elapsedRealtime()));
        }
    }
}
