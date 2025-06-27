package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.measurement.zzpc;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.net.URL;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import org.checkerframework.dataflow.qual.Pure;
import org.checkerframework.dataflow.qual.SideEffectFree;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.0 */
/* loaded from: classes3.dex */
public class zzhm implements zzio {
    private static volatile zzhm zzb;
    final long zza;
    private Boolean zzaa;
    private long zzab;
    private volatile Boolean zzac;
    private Boolean zzad;
    private Boolean zzae;
    private volatile boolean zzaf;
    private int zzag;
    private int zzah;
    private final Context zzc;
    private final String zzd;
    private final String zze;
    private final String zzf;
    private final boolean zzg;
    private final zzab zzh;
    private final zzag zzi;
    private final zzgo zzj;
    private final zzfz zzk;
    private final zzhj zzl;
    private final zzmn zzm;
    private final zzny zzn;
    private final zzfy zzo;
    private final Clock zzp;
    private final zzky zzq;
    private final zzjc zzr;
    private final zzb zzs;
    private final zzkp zzt;
    private final String zzu;
    private zzfw zzv;
    private zzld zzw;
    private zzax zzx;
    private zzft zzy;
    private boolean zzz = false;
    private AtomicInteger zzai = new AtomicInteger(0);

    public final int zzc() {
        zzl().zzt();
        if (this.zzi.zzw()) {
            return 1;
        }
        Boolean bool = this.zzae;
        if (bool != null && bool.booleanValue()) {
            return 2;
        }
        if (!zzad()) {
            return 8;
        }
        Boolean boolZzv = zzn().zzv();
        if (boolZzv != null) {
            return boolZzv.booleanValue() ? 0 : 3;
        }
        Boolean boolZzf = this.zzi.zzf("firebase_analytics_collection_enabled");
        if (boolZzf != null) {
            return boolZzf.booleanValue() ? 0 : 4;
        }
        Boolean bool2 = this.zzad;
        return bool2 != null ? bool2.booleanValue() ? 0 : 5 : (this.zzac == null || this.zzac.booleanValue()) ? 0 : 7;
    }

    @Override // com.google.android.gms.measurement.internal.zzio
    @Pure
    public final Context zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.measurement.internal.zzio
    @Pure
    public final Clock zzb() {
        return this.zzp;
    }

    @Pure
    public final zzb zze() {
        zzb zzbVar = this.zzs;
        if (zzbVar != null) {
            return zzbVar;
        }
        throw new IllegalStateException("Component not created");
    }

    @Override // com.google.android.gms.measurement.internal.zzio
    @Pure
    public final zzab zzd() {
        return this.zzh;
    }

    @Pure
    public final zzag zzf() {
        return this.zzi;
    }

    @Pure
    public final zzax zzg() {
        zza((zzip) this.zzx);
        return this.zzx;
    }

    @Pure
    public final zzft zzh() {
        zza((zze) this.zzy);
        return this.zzy;
    }

    @Pure
    public final zzfw zzi() {
        zza((zze) this.zzv);
        return this.zzv;
    }

    @Pure
    public final zzfy zzk() {
        return this.zzo;
    }

    @Override // com.google.android.gms.measurement.internal.zzio
    @Pure
    public final zzfz zzj() {
        zza((zzip) this.zzk);
        return this.zzk;
    }

    public final zzfz zzm() {
        zzfz zzfzVar = this.zzk;
        if (zzfzVar == null || !zzfzVar.zzaf()) {
            return null;
        }
        return this.zzk;
    }

    @Pure
    public final zzgo zzn() {
        zza((zzim) this.zzj);
        return this.zzj;
    }

    @Override // com.google.android.gms.measurement.internal.zzio
    @Pure
    public final zzhj zzl() {
        zza((zzip) this.zzl);
        return this.zzl;
    }

    @SideEffectFree
    final zzhj zzo() {
        return this.zzl;
    }

    public static zzhm zza(Context context, com.google.android.gms.internal.measurement.zzdq zzdqVar, Long l) {
        if (zzdqVar != null && (zzdqVar.zze == null || zzdqVar.zzf == null)) {
            zzdqVar = new com.google.android.gms.internal.measurement.zzdq(zzdqVar.zza, zzdqVar.zzb, zzdqVar.zzc, zzdqVar.zzd, null, null, zzdqVar.zzg, null);
        }
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(context.getApplicationContext());
        if (zzb == null) {
            synchronized (zzhm.class) {
                if (zzb == null) {
                    zzb = new zzhm(new zzja(context, zzdqVar, l));
                }
            }
        } else if (zzdqVar != null && zzdqVar.zzg != null && zzdqVar.zzg.containsKey("dataCollectionDefaultEnabled")) {
            Preconditions.checkNotNull(zzb);
            zzb.zza(zzdqVar.zzg.getBoolean("dataCollectionDefaultEnabled"));
        }
        Preconditions.checkNotNull(zzb);
        return zzb;
    }

    @Pure
    public final zzjc zzp() {
        zza((zze) this.zzr);
        return this.zzr;
    }

    @Pure
    private final zzkp zzai() {
        zza((zzip) this.zzt);
        return this.zzt;
    }

    @Pure
    public final zzky zzq() {
        zza((zze) this.zzq);
        return this.zzq;
    }

    @Pure
    public final zzld zzr() {
        zza((zze) this.zzw);
        return this.zzw;
    }

    @Pure
    public final zzmn zzs() {
        zza((zze) this.zzm);
        return this.zzm;
    }

    @Pure
    public final zzny zzt() {
        zza((zzim) this.zzn);
        return this.zzn;
    }

    @Pure
    public final String zzu() {
        return this.zzd;
    }

    @Pure
    public final String zzv() {
        return this.zze;
    }

    @Pure
    public final String zzw() {
        return this.zzf;
    }

    @Pure
    public final String zzx() {
        return this.zzu;
    }

    static /* synthetic */ void zza(zzhm zzhmVar, zzja zzjaVar) throws IllegalStateException {
        zzhmVar.zzl().zzt();
        zzax zzaxVar = new zzax(zzhmVar);
        zzaxVar.zzad();
        zzhmVar.zzx = zzaxVar;
        zzft zzftVar = new zzft(zzhmVar, zzjaVar.zzf);
        zzftVar.zzv();
        zzhmVar.zzy = zzftVar;
        zzfw zzfwVar = new zzfw(zzhmVar);
        zzfwVar.zzv();
        zzhmVar.zzv = zzfwVar;
        zzld zzldVar = new zzld(zzhmVar);
        zzldVar.zzv();
        zzhmVar.zzw = zzldVar;
        zzhmVar.zzn.zzae();
        zzhmVar.zzj.zzae();
        zzhmVar.zzy.zzw();
        zzhmVar.zzj().zzn().zza("App measurement initialized, version", 92000L);
        zzhmVar.zzj().zzn().zza("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
        String strZzad = zzftVar.zzad();
        if (TextUtils.isEmpty(zzhmVar.zzd)) {
            if (zzhmVar.zzt().zzd(strZzad, zzhmVar.zzi.zzp())) {
                zzhmVar.zzj().zzn().zza("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
            } else {
                zzhmVar.zzj().zzn().zza("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app " + strZzad);
            }
        }
        zzhmVar.zzj().zzc().zza("Debug-level message logging enabled");
        if (zzhmVar.zzag != zzhmVar.zzai.get()) {
            zzhmVar.zzj().zzg().zza("Not all components initialized", Integer.valueOf(zzhmVar.zzag), Integer.valueOf(zzhmVar.zzai.get()));
        }
        zzhmVar.zzz = true;
    }

    private zzhm(zzja zzjaVar) throws IllegalStateException {
        long jCurrentTimeMillis;
        boolean z = false;
        Preconditions.checkNotNull(zzjaVar);
        zzab zzabVar = new zzab(zzjaVar.zza);
        this.zzh = zzabVar;
        zzfn.zza = zzabVar;
        Context context = zzjaVar.zza;
        this.zzc = context;
        this.zzd = zzjaVar.zzb;
        this.zze = zzjaVar.zzc;
        this.zzf = zzjaVar.zzd;
        this.zzg = zzjaVar.zzh;
        this.zzac = zzjaVar.zze;
        this.zzu = zzjaVar.zzj;
        this.zzaf = true;
        com.google.android.gms.internal.measurement.zzdq zzdqVar = zzjaVar.zzg;
        if (zzdqVar != null && zzdqVar.zzg != null) {
            Object obj = zzdqVar.zzg.get("measurementEnabled");
            if (obj instanceof Boolean) {
                this.zzad = (Boolean) obj;
            }
            Object obj2 = zzdqVar.zzg.get("measurementDeactivated");
            if (obj2 instanceof Boolean) {
                this.zzae = (Boolean) obj2;
            }
        }
        com.google.android.gms.internal.measurement.zzhh.zzb(context);
        Clock defaultClock = DefaultClock.getInstance();
        this.zzp = defaultClock;
        if (zzjaVar.zzi != null) {
            jCurrentTimeMillis = zzjaVar.zzi.longValue();
        } else {
            jCurrentTimeMillis = defaultClock.currentTimeMillis();
        }
        this.zza = jCurrentTimeMillis;
        this.zzi = new zzag(this);
        zzgo zzgoVar = new zzgo(this);
        zzgoVar.zzad();
        this.zzj = zzgoVar;
        zzfz zzfzVar = new zzfz(this);
        zzfzVar.zzad();
        this.zzk = zzfzVar;
        zzny zznyVar = new zzny(this);
        zznyVar.zzad();
        this.zzn = zznyVar;
        this.zzo = new zzfy(new zziz(zzjaVar, this));
        this.zzs = new zzb(this);
        zzky zzkyVar = new zzky(this);
        zzkyVar.zzv();
        this.zzq = zzkyVar;
        zzjc zzjcVar = new zzjc(this);
        zzjcVar.zzv();
        this.zzr = zzjcVar;
        zzmn zzmnVar = new zzmn(this);
        zzmnVar.zzv();
        this.zzm = zzmnVar;
        zzkp zzkpVar = new zzkp(this);
        zzkpVar.zzad();
        this.zzt = zzkpVar;
        zzhj zzhjVar = new zzhj(this);
        zzhjVar.zzad();
        this.zzl = zzhjVar;
        if (zzjaVar.zzg != null && zzjaVar.zzg.zzb != 0) {
            z = true;
        }
        boolean z2 = !z;
        if (context.getApplicationContext() instanceof Application) {
            zzjc zzjcVarZzp = zzp();
            if (zzjcVarZzp.zza().getApplicationContext() instanceof Application) {
                Application application = (Application) zzjcVarZzp.zza().getApplicationContext();
                if (zzjcVarZzp.zza == null) {
                    zzjcVarZzp.zza = new zzko(zzjcVarZzp);
                }
                if (z2) {
                    application.unregisterActivityLifecycleCallbacks(zzjcVarZzp.zza);
                    application.registerActivityLifecycleCallbacks(zzjcVarZzp.zza);
                    zzjcVarZzp.zzj().zzp().zza("Registered activity lifecycle callback");
                }
            }
        } else {
            zzj().zzu().zza("Application context is not an Application");
        }
        zzhjVar.zzb(new zzhr(this, zzjaVar));
    }

    private static void zza(zzim zzimVar) {
        if (zzimVar == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    private static void zza(zze zzeVar) {
        if (zzeVar == null) {
            throw new IllegalStateException("Component not created");
        }
        if (zzeVar.zzy()) {
            return;
        }
        throw new IllegalStateException("Component not initialized: " + String.valueOf(zzeVar.getClass()));
    }

    private static void zza(zzip zzipVar) {
        if (zzipVar == null) {
            throw new IllegalStateException("Component not created");
        }
        if (zzipVar.zzaf()) {
            return;
        }
        throw new IllegalStateException("Component not initialized: " + String.valueOf(zzipVar.getClass()));
    }

    final void zzy() {
        throw new IllegalStateException("Unexpected call on client side");
    }

    final void zzz() {
        this.zzai.incrementAndGet();
    }

    final /* synthetic */ void zza(String str, int i, Throwable th, byte[] bArr, Map map) throws IllegalStateException {
        if (!((i == 200 || i == 204 || i == 304) && th == null)) {
            zzj().zzu().zza("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i), th);
            return;
        }
        zzn().zzo.zza(true);
        if (bArr == null || bArr.length == 0) {
            zzj().zzc().zza("Deferred Deep Link response empty.");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(new String(bArr));
            String strOptString = jSONObject.optString("deeplink", "");
            String strOptString2 = jSONObject.optString("gclid", "");
            String strOptString3 = jSONObject.optString("gbraid", "");
            double dOptDouble = jSONObject.optDouble("timestamp", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
            if (TextUtils.isEmpty(strOptString)) {
                zzj().zzc().zza("Deferred Deep Link is empty.");
                return;
            }
            Bundle bundle = new Bundle();
            if (zzpc.zza() && this.zzi.zza(zzbf.zzcs)) {
                if (!zzt().zzi(strOptString)) {
                    zzj().zzu().zza("Deferred Deep Link validation failed. gclid, gbraid, deep link", strOptString2, strOptString3, strOptString);
                    return;
                }
                bundle.putString("gbraid", strOptString3);
            } else if (!zzt().zzi(strOptString)) {
                zzj().zzu().zza("Deferred Deep Link validation failed. gclid, deep link", strOptString2, strOptString);
                return;
            }
            bundle.putString("gclid", strOptString2);
            bundle.putString("_cis", "ddp");
            this.zzr.zzc("auto", "_cmp", bundle);
            zzny zznyVarZzt = zzt();
            if (TextUtils.isEmpty(strOptString) || !zznyVarZzt.zza(strOptString, dOptDouble)) {
                return;
            }
            zznyVarZzt.zza().sendBroadcast(new Intent("android.google.analytics.action.DEEPLINK_ACTION"));
        } catch (JSONException e) {
            zzj().zzg().zza("Failed to parse the Deferred Deep Link response. exception", e);
        }
    }

    final void zzaa() {
        this.zzag++;
    }

    final void zza(boolean z) {
        this.zzac = Boolean.valueOf(z);
    }

    public final void zzb(boolean z) {
        zzl().zzt();
        this.zzaf = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:81:0x01e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void zza(com.google.android.gms.internal.measurement.zzdq r13) throws java.lang.IllegalStateException {
        /*
            Method dump skipped, instructions count: 1300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzhm.zza(com.google.android.gms.internal.measurement.zzdq):void");
    }

    public final boolean zzab() {
        return this.zzac != null && this.zzac.booleanValue();
    }

    public final boolean zzac() {
        return zzc() == 0;
    }

    public final boolean zzad() {
        zzl().zzt();
        return this.zzaf;
    }

    @Pure
    public final boolean zzae() {
        return TextUtils.isEmpty(this.zzd);
    }

    protected final boolean zzaf() {
        if (!this.zzz) {
            throw new IllegalStateException("AppMeasurement is not initialized");
        }
        zzl().zzt();
        Boolean bool = this.zzaa;
        if (bool == null || this.zzab == 0 || (bool != null && !bool.booleanValue() && Math.abs(this.zzp.elapsedRealtime() - this.zzab) > 1000)) {
            this.zzab = this.zzp.elapsedRealtime();
            boolean z = true;
            Boolean boolValueOf = Boolean.valueOf(zzt().zze("android.permission.INTERNET") && zzt().zze("android.permission.ACCESS_NETWORK_STATE") && (Wrappers.packageManager(this.zzc).isCallerInstantApp() || this.zzi.zzx() || (zzny.zza(this.zzc) && zzny.zza(this.zzc, false))));
            this.zzaa = boolValueOf;
            if (boolValueOf.booleanValue()) {
                if (!zzt().zza(zzh().zzae(), zzh().zzac()) && TextUtils.isEmpty(zzh().zzac())) {
                    z = false;
                }
                this.zzaa = Boolean.valueOf(z);
            }
        }
        return this.zzaa.booleanValue();
    }

    @Pure
    public final boolean zzag() {
        return this.zzg;
    }

    public final boolean zzah() throws IllegalStateException {
        zzl().zzt();
        zza((zzip) zzai());
        String strZzad = zzh().zzad();
        Pair<String, Boolean> pairZza = zzn().zza(strZzad);
        if (!this.zzi.zzu() || ((Boolean) pairZza.second).booleanValue() || TextUtils.isEmpty((CharSequence) pairZza.first)) {
            zzj().zzc().zza("ADID unavailable to retrieve Deferred Deep Link. Skipping");
            return false;
        }
        if (!zzai().zzc()) {
            zzj().zzu().zza("Network is not available for Deferred Deep Link request. Skipping");
            return false;
        }
        StringBuilder sb = new StringBuilder();
        zzld zzldVarZzr = zzr();
        zzldVarZzr.zzt();
        zzldVarZzr.zzu();
        if (!zzldVarZzr.zzao() || zzldVarZzr.zzq().zzg() >= 234200) {
            zzjc zzjcVarZzp = zzp();
            zzjcVarZzp.zzt();
            zzaj zzajVarZzaa = zzjcVarZzp.zzo().zzaa();
            Bundle bundle = zzajVarZzaa != null ? zzajVarZzaa.zza : null;
            if (bundle == null) {
                int i = this.zzah;
                this.zzah = i + 1;
                boolean z = i < 10;
                zzj().zzc().zza("Failed to retrieve DMA consent from the service, " + (z ? "Retrying." : "Skipping.") + " retryCount", Integer.valueOf(this.zzah));
                return z;
            }
            zziq zziqVarZza = zziq.zza(bundle, 100);
            sb.append("&gcs=");
            sb.append(zziqVarZza.zzg());
            zzav zzavVarZza = zzav.zza(bundle, 100);
            sb.append("&dma=");
            sb.append(zzavVarZza.zzd() == Boolean.FALSE ? 0 : 1);
            if (!TextUtils.isEmpty(zzavVarZza.zze())) {
                sb.append("&dma_cps=");
                sb.append(zzavVarZza.zze());
            }
            int i2 = zzav.zza(bundle) == Boolean.TRUE ? 0 : 1;
            sb.append("&npa=");
            sb.append(i2);
            zzj().zzp().zza("Consent query parameters to Bow", sb);
        }
        zzny zznyVarZzt = zzt();
        zzh();
        URL urlZza = zznyVarZzt.zza(92000L, strZzad, (String) pairZza.first, zzn().zzp.zza() - 1, sb.toString());
        if (urlZza != null) {
            zzkp zzkpVarZzai = zzai();
            zzks zzksVar = new zzks() { // from class: com.google.android.gms.measurement.internal.zzho
                @Override // com.google.android.gms.measurement.internal.zzks
                public final void zza(String str, int i3, Throwable th, byte[] bArr, Map map) throws IllegalStateException {
                    this.zza.zza(str, i3, th, bArr, map);
                }
            };
            zzkpVarZzai.zzt();
            zzkpVarZzai.zzac();
            Preconditions.checkNotNull(urlZza);
            Preconditions.checkNotNull(zzksVar);
            zzkpVarZzai.zzl().zza(new zzkr(zzkpVarZzai, strZzad, urlZza, null, null, zzksVar));
        }
        return false;
    }
}
