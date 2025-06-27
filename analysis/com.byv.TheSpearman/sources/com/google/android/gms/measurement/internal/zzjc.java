package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.collection.ArrayMap;
import androidx.core.app.NotificationCompat;
import androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures;
import com.google.android.exoplayer2.C;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.CollectionUtils;
import com.google.android.gms.common.util.Strings;
import com.google.android.gms.internal.measurement.zzoe;
import com.google.android.gms.internal.measurement.zzpc;
import com.google.android.gms.internal.measurement.zzpz;
import com.google.android.gms.internal.measurement.zzql;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.gms.measurement.internal.zziq;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.json.mediationsdk.metadata.a;
import com.mbridge.msdk.MBridgeConstans;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Function;
import kotlin.Unit;
import org.checkerframework.dataflow.qual.Pure;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.0 */
/* loaded from: classes3.dex */
public final class zzjc extends zze {
    protected zzko zza;
    final zzr zzb;
    private zziy zzc;
    private final Set<zzix> zzd;
    private boolean zze;
    private final AtomicReference<String> zzf;
    private final Object zzg;
    private boolean zzh;
    private int zzi;
    private zzat zzj;
    private PriorityQueue<zzna> zzk;
    private zziq zzl;
    private final AtomicLong zzm;
    private long zzn;
    private boolean zzo;
    private zzat zzp;
    private SharedPreferences.OnSharedPreferenceChangeListener zzq;
    private zzat zzr;
    private final zznx zzs;

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

    public final Boolean zzaa() {
        AtomicReference atomicReference = new AtomicReference();
        return (Boolean) zzl().zza(atomicReference, C.DEFAULT_SEEK_FORWARD_INCREMENT_MS, "boolean test flag value", new zzjl(this, atomicReference));
    }

    public final Double zzab() {
        AtomicReference atomicReference = new AtomicReference();
        return (Double) zzl().zza(atomicReference, C.DEFAULT_SEEK_FORWARD_INCREMENT_MS, "double test flag value", new zzkh(this, atomicReference));
    }

    public final Integer zzac() {
        AtomicReference atomicReference = new AtomicReference();
        return (Integer) zzl().zza(atomicReference, C.DEFAULT_SEEK_FORWARD_INCREMENT_MS, "int test flag value", new zzki(this, atomicReference));
    }

    public final Long zzad() {
        AtomicReference atomicReference = new AtomicReference();
        return (Long) zzl().zza(atomicReference, C.DEFAULT_SEEK_FORWARD_INCREMENT_MS, "long test flag value", new zzkf(this, atomicReference));
    }

    public final String zzae() {
        return this.zzf.get();
    }

    public final String zzaf() {
        zzkv zzkvVarZzaa = this.zzu.zzq().zzaa();
        if (zzkvVarZzaa != null) {
            return zzkvVarZzaa.zzb;
        }
        return null;
    }

    public final String zzag() {
        zzkv zzkvVarZzaa = this.zzu.zzq().zzaa();
        if (zzkvVarZzaa != null) {
            return zzkvVarZzaa.zza;
        }
        return null;
    }

    public final String zzah() throws IllegalStateException {
        if (this.zzu.zzu() != null) {
            return this.zzu.zzu();
        }
        try {
            return new zzhg(zza(), this.zzu.zzx()).zza("google_app_id");
        } catch (IllegalStateException e) {
            this.zzu.zzj().zzg().zza("getGoogleAppId failed with exception", e);
            return null;
        }
    }

    public final String zzai() {
        AtomicReference atomicReference = new AtomicReference();
        return (String) zzl().zza(atomicReference, C.DEFAULT_SEEK_FORWARD_INCREMENT_MS, "String test flag value", new zzjy(this, atomicReference));
    }

    public final ArrayList<Bundle> zza(String str, String str2) throws IllegalStateException {
        if (zzl().zzg()) {
            zzj().zzg().zza("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList<>(0);
        }
        if (zzab.zza()) {
            zzj().zzg().zza("Cannot get conditional user properties from main thread");
            return new ArrayList<>(0);
        }
        AtomicReference atomicReference = new AtomicReference();
        this.zzu.zzl().zza(atomicReference, 5000L, "get conditional user properties", new zzkb(this, atomicReference, null, str, str2));
        List list = (List) atomicReference.get();
        if (list == null) {
            zzj().zzg().zza("Timed out waiting for get conditional user properties", null);
            return new ArrayList<>();
        }
        return zzny.zzb((List<zzae>) list);
    }

    public final List<zznt> zza(boolean z) throws IllegalStateException {
        zzu();
        zzj().zzp().zza("Getting user properties (FE)");
        if (zzl().zzg()) {
            zzj().zzg().zza("Cannot get all user properties from analytics worker thread");
            return Collections.emptyList();
        }
        if (zzab.zza()) {
            zzj().zzg().zza("Cannot get all user properties from main thread");
            return Collections.emptyList();
        }
        AtomicReference atomicReference = new AtomicReference();
        this.zzu.zzl().zza(atomicReference, 5000L, "get user properties", new zzjv(this, atomicReference, z));
        List<zznt> list = (List) atomicReference.get();
        if (list != null) {
            return list;
        }
        zzj().zzg().zza("Timed out waiting for get user properties, includeInternal", Boolean.valueOf(z));
        return Collections.emptyList();
    }

    public final Map<String, Object> zza(String str, String str2, boolean z) throws IllegalStateException {
        if (zzl().zzg()) {
            zzj().zzg().zza("Cannot get user properties from analytics worker thread");
            return Collections.emptyMap();
        }
        if (zzab.zza()) {
            zzj().zzg().zza("Cannot get user properties from main thread");
            return Collections.emptyMap();
        }
        AtomicReference atomicReference = new AtomicReference();
        this.zzu.zzl().zza(atomicReference, 5000L, "get user properties", new zzke(this, atomicReference, null, str, str2, z));
        List<zznt> list = (List) atomicReference.get();
        if (list == null) {
            zzj().zzg().zza("Timed out waiting for handle get user properties, includeInternal", Boolean.valueOf(z));
            return Collections.emptyMap();
        }
        ArrayMap arrayMap = new ArrayMap(list.size());
        for (zznt zzntVar : list) {
            Object objZza = zzntVar.zza();
            if (objZza != null) {
                arrayMap.put(zzntVar.zza, objZza);
            }
        }
        return arrayMap;
    }

    final PriorityQueue<zzna> zzaj() {
        if (this.zzk == null) {
            this.zzk = new PriorityQueue<>(Comparator.comparing(new Function() { // from class: com.google.android.gms.measurement.internal.zzjb
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return Long.valueOf(((zzna) obj).zzb);
                }
            }, new Comparator() { // from class: com.google.android.gms.measurement.internal.zzje
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return Long.compare(((Long) obj).longValue(), ((Long) obj2).longValue());
                }
            }));
        }
        return this.zzk;
    }

    static /* synthetic */ void zza(zzjc zzjcVar, zziq zziqVar, zziq zziqVar2) {
        if (zzoe.zza() && zzjcVar.zze().zza(zzbf.zzde)) {
            return;
        }
        boolean zZza = zziqVar.zza(zziqVar2, zziq.zza.ANALYTICS_STORAGE, zziq.zza.AD_STORAGE);
        boolean zZzb = zziqVar.zzb(zziqVar2, zziq.zza.ANALYTICS_STORAGE, zziq.zza.AD_STORAGE);
        if (zZza || zZzb) {
            zzjcVar.zzg().zzag();
        }
    }

    static /* synthetic */ void zza(zzjc zzjcVar, zziq zziqVar, long j, boolean z, boolean z2) throws IllegalStateException {
        zzjcVar.zzt();
        zzjcVar.zzu();
        zziq zziqVarZzn = zzjcVar.zzk().zzn();
        if (j <= zzjcVar.zzn && zziq.zza(zziqVarZzn.zza(), zziqVar.zza())) {
            zzjcVar.zzj().zzn().zza("Dropped out-of-date consent setting, proposed settings", zziqVar);
            return;
        }
        if (zzjcVar.zzk().zza(zziqVar)) {
            zzjcVar.zzj().zzp().zza("Setting storage consent. consent", zziqVar);
            zzjcVar.zzn = j;
            if (zzjcVar.zze().zza(zzbf.zzcp) && zzjcVar.zzo().zzan()) {
                zzjcVar.zzo().zzb(z);
            } else {
                zzjcVar.zzo().zza(z);
            }
            if (z2) {
                zzjcVar.zzo().zza(new AtomicReference<>());
                return;
            }
            return;
        }
        zzjcVar.zzj().zzn().zza("Lower precedence consent source ignored, proposed source", Integer.valueOf(zziqVar.zza()));
    }

    static /* synthetic */ void zzb(zzjc zzjcVar, int i) {
        if (zzjcVar.zzj == null) {
            zzjcVar.zzj = new zzjq(zzjcVar, zzjcVar.zzu);
        }
        zzjcVar.zzj.zza(i * 1000);
    }

    protected zzjc(zzhm zzhmVar) {
        super(zzhmVar);
        this.zzd = new CopyOnWriteArraySet();
        this.zzg = new Object();
        this.zzh = false;
        this.zzi = 1;
        this.zzo = true;
        this.zzs = new zzkg(this);
        this.zzf = new AtomicReference<>();
        this.zzl = zziq.zza;
        this.zzn = -1L;
        this.zzm = new AtomicLong(0L);
        this.zzb = new zzr(zzhmVar);
    }

    public final void zzak() {
        zzt();
        zzu();
        if (this.zzu.zzaf()) {
            Boolean boolZzf = zze().zzf("google_analytics_deferred_deep_link_enabled");
            if (boolZzf != null && boolZzf.booleanValue()) {
                zzj().zzc().zza("Deferred Deep Link feature enabled.");
                zzl().zzb(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzjh
                    @Override // java.lang.Runnable
                    public final void run() throws IllegalStateException {
                        this.zza.zzan();
                    }
                });
            }
            zzo().zzac();
            this.zzo = false;
            String strZzw = zzk().zzw();
            if (TextUtils.isEmpty(strZzw)) {
                return;
            }
            zzf().zzac();
            if (strZzw.equals(Build.VERSION.RELEASE)) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("_po", strZzw);
            zzc("auto", "_ou", bundle);
        }
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

    public final void zza(String str, String str2, Bundle bundle) throws IllegalStateException {
        long jCurrentTimeMillis = zzb().currentTimeMillis();
        Preconditions.checkNotEmpty(str);
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str);
        bundle2.putLong(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, jCurrentTimeMillis);
        if (str2 != null) {
            bundle2.putString(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME, str2);
            bundle2.putBundle(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS, bundle);
        }
        zzl().zzb(new zzkc(this, bundle2));
    }

    public final void zzal() {
        if (!(zza().getApplicationContext() instanceof Application) || this.zza == null) {
            return;
        }
        ((Application) zza().getApplicationContext()).unregisterActivityLifecycleCallbacks(this.zza);
    }

    final void zzam() throws IllegalStateException {
        if (zzpz.zza() && zze().zza(zzbf.zzcf)) {
            if (zzl().zzg()) {
                zzj().zzg().zza("Cannot get trigger URIs from analytics worker thread");
                return;
            }
            if (zzab.zza()) {
                zzj().zzg().zza("Cannot get trigger URIs from main thread");
                return;
            }
            zzu();
            zzj().zzp().zza("Getting trigger URIs (FE)");
            final AtomicReference atomicReference = new AtomicReference();
            zzl().zza(atomicReference, 5000L, "get trigger URIs", new Runnable() { // from class: com.google.android.gms.measurement.internal.zzjd
                @Override // java.lang.Runnable
                public final void run() throws IllegalStateException {
                    zzjc zzjcVar = this.zza;
                    AtomicReference<List<zzna>> atomicReference2 = atomicReference;
                    Bundle bundleZza = zzjcVar.zzk().zzi.zza();
                    zzld zzldVarZzo = zzjcVar.zzo();
                    if (bundleZza == null) {
                        bundleZza = new Bundle();
                    }
                    zzldVarZzo.zza(atomicReference2, bundleZza);
                }
            });
            final List list = (List) atomicReference.get();
            if (list == null) {
                zzj().zzg().zza("Timed out waiting for get trigger URIs");
            } else {
                zzl().zzb(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzjg
                    @Override // java.lang.Runnable
                    public final void run() throws IllegalStateException {
                        this.zza.zza(list);
                    }
                });
            }
        }
    }

    public final void zzan() throws IllegalStateException {
        zzt();
        if (zzk().zzo.zza()) {
            zzj().zzc().zza("Deferred Deep Link already retrieved. Not fetching again.");
            return;
        }
        long jZza = zzk().zzp.zza();
        zzk().zzp.zza(1 + jZza);
        if (jZza >= 5) {
            zzj().zzu().zza("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
            zzk().zzo.zza(true);
        } else {
            if (this.zzp == null) {
                this.zzp = new zzjx(this, this.zzu);
            }
            this.zzp.zza(0L);
        }
    }

    public final void zzao() {
        zzt();
        zzj().zzc().zza("Handle tcf update.");
        zzmy zzmyVarZza = zzmy.zza(zzk().zzc());
        zzj().zzp().zza("Tcf preferences read", zzmyVarZza);
        if (zzk().zza(zzmyVarZza)) {
            Bundle bundleZza = zzmyVarZza.zza();
            zzj().zzp().zza("Consent generated from Tcf", bundleZza);
            if (bundleZza != Bundle.EMPTY) {
                zza(bundleZza, -30, zzb().currentTimeMillis());
            }
            Bundle bundle = new Bundle();
            bundle.putString("_tcfd", zzmyVarZza.zzb());
            zzc("auto", "_tcf", bundle);
        }
    }

    final /* synthetic */ void zza(List list) throws IllegalStateException {
        zzt();
        if (Build.VERSION.SDK_INT >= 30) {
            SparseArray<Long> sparseArrayZzh = zzk().zzh();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                zzna zznaVar = (zzna) it.next();
                if (!sparseArrayZzh.contains(zznaVar.zzc) || sparseArrayZzh.get(zznaVar.zzc).longValue() < zznaVar.zzb) {
                    zzaj().add(zznaVar);
                }
            }
            zzap();
        }
    }

    final /* synthetic */ void zza(SharedPreferences sharedPreferences, String str) throws IllegalStateException {
        if ("IABTCF_TCString".equals(str)) {
            zzj().zzp().zza("IABTCF_TCString change picked up in listener.");
            ((zzat) Preconditions.checkNotNull(this.zzr)).zza(500L);
        }
    }

    final /* synthetic */ void zza(Bundle bundle) throws IllegalStateException {
        if (bundle == null) {
            zzk().zzt.zza(new Bundle());
            return;
        }
        Bundle bundleZza = zzk().zzt.zza();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            if (obj != null && !(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Double)) {
                zzq();
                if (zzny.zza(obj)) {
                    zzq();
                    zzny.zza(this.zzs, 27, (String) null, (String) null, 0);
                }
                zzj().zzv().zza("Invalid default event parameter type. Name, value", str, obj);
            } else if (zzny.zzg(str)) {
                zzj().zzv().zza("Invalid default event parameter name. Name", str);
            } else if (obj == null) {
                bundleZza.remove(str);
            } else if (zzq().zza("param", str, zze().zza((String) null, false), obj)) {
                zzq().zza(bundleZza, str, obj);
            }
        }
        zzq();
        if (zzny.zza(bundleZza, zze().zzg())) {
            zzq();
            zzny.zza(this.zzs, 26, (String) null, (String) null, 0);
            zzj().zzv().zza("Too many default event parameters set. Discarding beyond event parameter limit");
        }
        zzk().zzt.zza(bundleZza);
        zzo().zza(bundleZza);
    }

    public final void zzb(String str, String str2, Bundle bundle) throws IllegalStateException {
        zza(str, str2, bundle, true, true, zzb().currentTimeMillis());
    }

    public final void zza(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) throws IllegalStateException {
        String str3 = str == null ? MBridgeConstans.DYNAMIC_VIEW_WX_APP : str;
        Bundle bundle2 = bundle == null ? new Bundle() : bundle;
        if (Objects.equals(str2, FirebaseAnalytics.Event.SCREEN_VIEW)) {
            zzn().zza(bundle2, j);
        } else {
            zzb(str3, str2, j, bundle2, z2, !z2 || this.zzc == null || zzny.zzg(str2), z, null);
        }
    }

    public final void zza(String str, String str2, Bundle bundle, String str3) throws IllegalStateException {
        zzs();
        zzb(str, str2, zzb().currentTimeMillis(), bundle, false, true, true, str3);
    }

    final void zzc(String str, String str2, Bundle bundle) {
        zzt();
        zza(str, str2, zzb().currentTimeMillis(), bundle);
    }

    final void zza(String str, String str2, long j, Bundle bundle) throws IllegalStateException, IllegalAccessException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
        zzt();
        zza(str, str2, j, bundle, true, this.zzc == null || zzny.zzg(str2), true, null);
    }

    protected final void zza(String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) throws IllegalStateException, IllegalAccessException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
        boolean zZza;
        String str4;
        long j2;
        String str5;
        String str6;
        boolean z4;
        int length;
        Class<?> cls;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(bundle);
        zzt();
        zzu();
        if (!this.zzu.zzac()) {
            zzj().zzc().zza("Event not sent since app measurement is disabled");
            return;
        }
        List<String> listZzaf = zzg().zzaf();
        if (listZzaf != null && !listZzaf.contains(str2)) {
            zzj().zzc().zza("Dropping non-safelisted event. event name, origin", str2, str);
            return;
        }
        boolean z5 = true;
        if (!this.zze) {
            this.zze = true;
            try {
                if (!this.zzu.zzag()) {
                    cls = Class.forName("com.google.android.gms.tagmanager.TagManagerService", true, zza().getClassLoader());
                } else {
                    cls = Class.forName("com.google.android.gms.tagmanager.TagManagerService");
                }
                try {
                    cls.getDeclaredMethod(MobileAdsBridgeBase.initializeMethodName, Context.class).invoke(null, zza());
                } catch (Exception e) {
                    zzj().zzu().zza("Failed to invoke Tag Manager's initialize() method", e);
                }
            } catch (ClassNotFoundException unused) {
                zzj().zzn().zza("Tag Manager is not found and thus will not be used");
            }
        }
        if ("_cmp".equals(str2)) {
            if (bundle.containsKey("gclid")) {
                zza("auto", "_lgclid", bundle.getString("gclid"), zzb().currentTimeMillis());
            }
            if (zzpc.zza() && zze().zza(zzbf.zzcs) && bundle.containsKey("gbraid")) {
                zza("auto", "_gbraid", bundle.getString("gbraid"), zzb().currentTimeMillis());
            }
        }
        if (z && zzny.zzj(str2)) {
            zzq().zza(bundle, zzk().zzt.zza());
        }
        if (!z3 && !"_iap".equals(str2)) {
            zzny zznyVarZzt = this.zzu.zzt();
            int i = 2;
            if (zznyVarZzt.zzc(NotificationCompat.CATEGORY_EVENT, str2)) {
                if (!zznyVarZzt.zza(NotificationCompat.CATEGORY_EVENT, zziu.zza, zziu.zzb, str2)) {
                    i = 13;
                } else if (zznyVarZzt.zza(NotificationCompat.CATEGORY_EVENT, 40, str2)) {
                    i = 0;
                }
            }
            if (i != 0) {
                zzj().zzh().zza("Invalid public event name. Event will not be logged (FE)", zzi().zza(str2));
                this.zzu.zzt();
                String strZza = zzny.zza(str2, 40, true);
                length = str2 != null ? str2.length() : 0;
                this.zzu.zzt();
                zzny.zza(this.zzs, i, "_ev", strZza, length);
                return;
            }
        }
        zzkv zzkvVarZza = zzn().zza(false);
        if (zzkvVarZza != null && !bundle.containsKey("_sc")) {
            zzkvVarZza.zzd = true;
        }
        zzny.zza(zzkvVarZza, bundle, z && !z3);
        boolean zEquals = "am".equals(str);
        boolean zZzg = zzny.zzg(str2);
        if (z && this.zzc != null && !zZzg && !zEquals) {
            zzj().zzc().zza("Passing event to registered event handler (FE)", zzi().zza(str2), zzi().zza(bundle));
            Preconditions.checkNotNull(this.zzc);
            this.zzc.interceptEvent(str, str2, bundle, j);
            return;
        }
        if (this.zzu.zzaf()) {
            int iZza = zzq().zza(str2);
            if (iZza != 0) {
                zzj().zzh().zza("Invalid event name. Event will not be logged (FE)", zzi().zza(str2));
                zzq();
                String strZza2 = zzny.zza(str2, 40, true);
                length = str2 != null ? str2.length() : 0;
                this.zzu.zzt();
                zzny.zza(this.zzs, str3, iZza, "_ev", strZza2, length);
                return;
            }
            Bundle bundleZza = zzq().zza(str3, str2, bundle, CollectionUtils.listOf((Object[]) new String[]{"_o", "_sn", "_sc", "_si"}), z3);
            Preconditions.checkNotNull(bundleZza);
            if (zzn().zza(false) != null && "_ae".equals(str2)) {
                zzmt zzmtVar = zzp().zzb;
                long jElapsedRealtime = zzmtVar.zzb.zzb().elapsedRealtime();
                long j3 = jElapsedRealtime - zzmtVar.zza;
                zzmtVar.zza = jElapsedRealtime;
                if (j3 > 0) {
                    zzq().zza(bundleZza, j3);
                }
            }
            if (!"auto".equals(str) && "_ssr".equals(str2)) {
                zzny zznyVarZzq = zzq();
                String string = bundleZza.getString("_ffr");
                if (Strings.isEmptyOrWhitespace(string)) {
                    string = null;
                } else if (string != null) {
                    string = string.trim();
                }
                if (Objects.equals(string, zznyVarZzq.zzk().zzq.zza())) {
                    zznyVarZzq.zzj().zzc().zza("Not logging duplicate session_start_with_rollout event");
                    z4 = false;
                } else {
                    zznyVarZzq.zzk().zzq.zza(string);
                    z4 = true;
                }
                if (!z4) {
                    return;
                }
            } else if ("_ae".equals(str2)) {
                String strZza3 = zzq().zzk().zzq.zza();
                if (!TextUtils.isEmpty(strZza3)) {
                    bundleZza.putString("_ffr", strZza3);
                }
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(bundleZza);
            if (zze().zza(zzbf.zzcl)) {
                zZza = zzp().zzaa();
            } else {
                zZza = zzk().zzn.zza();
            }
            if (zzk().zzk.zza() > 0 && zzk().zza(j) && zZza) {
                zzj().zzp().zza("Current session is expired, remove the session number, ID, and engagement time");
                j2 = 0;
                str4 = "_ae";
                zza("auto", "_sid", (Object) null, zzb().currentTimeMillis());
                zza("auto", "_sno", (Object) null, zzb().currentTimeMillis());
                zza("auto", "_se", (Object) null, zzb().currentTimeMillis());
                zzk().zzl.zza(0L);
            } else {
                str4 = "_ae";
                j2 = 0;
            }
            if (bundleZza.getLong(FirebaseAnalytics.Param.EXTEND_SESSION, j2) == 1) {
                zzj().zzp().zza("EXTEND_SESSION param attached: initiate a new session or extend the current active session");
                this.zzu.zzs().zza.zza(j, true);
            }
            ArrayList arrayList2 = new ArrayList(bundleZza.keySet());
            Collections.sort(arrayList2);
            int size = arrayList2.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList2.get(i2);
                i2++;
                String str7 = (String) obj;
                if (str7 != null) {
                    zzq();
                    Bundle[] bundleArrZzb = zzny.zzb(bundleZza.get(str7));
                    if (bundleArrZzb != null) {
                        bundleZza.putParcelableArray(str7, bundleArrZzb);
                    }
                }
            }
            int i3 = 0;
            while (i3 < arrayList.size()) {
                Bundle bundleZza2 = (Bundle) arrayList.get(i3);
                if (i3 != 0 ? z5 : false) {
                    str6 = "_ep";
                    str5 = str;
                } else {
                    str5 = str;
                    str6 = str2;
                }
                bundleZza2.putString("_o", str5);
                if (z2) {
                    bundleZza2 = zzq().zza(bundleZza2, (String) null);
                }
                Bundle bundle2 = bundleZza2;
                zzo().zza(new zzbd(str6, new zzbc(bundle2), str, j), str3);
                if (!zEquals) {
                    Iterator<zzix> it = this.zzd.iterator();
                    while (it.hasNext()) {
                        it.next().onEvent(str, str2, new Bundle(bundle2), j);
                    }
                }
                i3++;
                z5 = true;
            }
            if (zzn().zza(false) == null || !str4.equals(str2)) {
                return;
            }
            zzp().zza(true, true, zzb().elapsedRealtime());
        }
    }

    final void zzap() throws IllegalStateException {
        zzna zznaVarPoll;
        MeasurementManagerFutures measurementManagerFuturesZzn;
        zzt();
        if (zzaj().isEmpty() || this.zzh || (zznaVarPoll = zzaj().poll()) == null || (measurementManagerFuturesZzn = zzq().zzn()) == null) {
            return;
        }
        this.zzh = true;
        zzj().zzp().zza("Registering trigger URI", zznaVarPoll.zza);
        ListenableFuture<Unit> listenableFutureRegisterTriggerAsync = measurementManagerFuturesZzn.registerTriggerAsync(Uri.parse(zznaVarPoll.zza));
        if (listenableFutureRegisterTriggerAsync == null) {
            this.zzh = false;
            zzaj().add(zznaVarPoll);
            return;
        }
        if (!zze().zza(zzbf.zzcj)) {
            SparseArray<Long> sparseArrayZzh = zzk().zzh();
            sparseArrayZzh.put(zznaVarPoll.zzc, Long.valueOf(zznaVarPoll.zzb));
            zzk().zza(sparseArrayZzh);
        }
        Futures.addCallback(listenableFutureRegisterTriggerAsync, new zzjn(this, zznaVarPoll), new zzjo(this));
    }

    public final void zza(zzix zzixVar) throws IllegalStateException {
        zzu();
        Preconditions.checkNotNull(zzixVar);
        if (this.zzd.add(zzixVar)) {
            return;
        }
        zzj().zzu().zza("OnEventListener already registered");
    }

    public final void zzaq() {
        zzt();
        zzj().zzc().zza("Register tcfPrefChangeListener.");
        if (this.zzq == null) {
            this.zzr = new zzju(this, this.zzu);
            this.zzq = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.google.android.gms.measurement.internal.zzjk
                @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) throws IllegalStateException {
                    this.zza.zza(sharedPreferences, str);
                }
            };
        }
        zzk().zzc().registerOnSharedPreferenceChangeListener(this.zzq);
    }

    final void zza(long j, boolean z) throws IllegalStateException {
        zzt();
        zzu();
        zzj().zzc().zza("Resetting analytics data (FE)");
        zzmn zzmnVarZzp = zzp();
        zzmnVarZzp.zzt();
        zzmnVarZzp.zzb.zza();
        if (zzql.zza() && zze().zza(zzbf.zzbr)) {
            zzg().zzag();
        }
        boolean zZzac = this.zzu.zzac();
        zzgo zzgoVarZzk = zzk();
        zzgoVarZzk.zzc.zza(j);
        if (!TextUtils.isEmpty(zzgoVarZzk.zzk().zzq.zza())) {
            zzgoVarZzk.zzq.zza(null);
        }
        zzgoVarZzk.zzk.zza(0L);
        zzgoVarZzk.zzl.zza(0L);
        if (!zzgoVarZzk.zze().zzw()) {
            zzgoVarZzk.zzb(!zZzac);
        }
        zzgoVarZzk.zzr.zza(null);
        zzgoVarZzk.zzs.zza(0L);
        zzgoVarZzk.zzt.zza(null);
        if (z) {
            zzo().zzah();
        }
        zzp().zza.zza();
        this.zzo = !zZzac;
    }

    private final void zzb(String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) throws IllegalStateException {
        zzl().zzb(new zzjt(this, str, str2, j, zzny.zza(bundle), z, z2, z3, str3));
    }

    private final void zza(String str, String str2, long j, Object obj) throws IllegalStateException {
        zzl().zzb(new zzjw(this, str, str2, obj, j));
    }

    final void zza(String str) {
        this.zzf.set(str);
    }

    public final void zzb(Bundle bundle) throws IllegalStateException {
        zza(bundle, zzb().currentTimeMillis());
    }

    public final void zza(Bundle bundle, long j) throws IllegalStateException {
        Preconditions.checkNotNull(bundle);
        Bundle bundle2 = new Bundle(bundle);
        if (!TextUtils.isEmpty(bundle2.getString("app_id"))) {
            zzj().zzu().zza("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove("app_id");
        Preconditions.checkNotNull(bundle2);
        zzir.zza(bundle2, "app_id", String.class, null);
        zzir.zza(bundle2, "origin", String.class, null);
        zzir.zza(bundle2, "name", String.class, null);
        zzir.zza(bundle2, "value", Object.class, null);
        zzir.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, String.class, null);
        zzir.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, Long.class, 0L);
        zzir.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_NAME, String.class, null);
        zzir.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_PARAMS, Bundle.class, null);
        zzir.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_NAME, String.class, null);
        zzir.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_PARAMS, Bundle.class, null);
        zzir.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, Long.class, 0L);
        zzir.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME, String.class, null);
        zzir.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS, Bundle.class, null);
        Preconditions.checkNotEmpty(bundle2.getString("name"));
        Preconditions.checkNotEmpty(bundle2.getString("origin"));
        Preconditions.checkNotNull(bundle2.get("value"));
        bundle2.putLong(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, j);
        String string = bundle2.getString("name");
        Object obj = bundle2.get("value");
        if (zzq().zzb(string) != 0) {
            zzj().zzg().zza("Invalid conditional user property name", zzi().zzc(string));
            return;
        }
        if (zzq().zza(string, obj) != 0) {
            zzj().zzg().zza("Invalid conditional user property value", zzi().zzc(string), obj);
            return;
        }
        Object objZzc = zzq().zzc(string, obj);
        if (objZzc == null) {
            zzj().zzg().zza("Unable to normalize conditional user property value", zzi().zzc(string), obj);
            return;
        }
        zzir.zza(bundle2, objZzc);
        long j2 = bundle2.getLong(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT);
        if (!TextUtils.isEmpty(bundle2.getString(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME)) && (j2 > 15552000000L || j2 < 1)) {
            zzj().zzg().zza("Invalid conditional user property timeout", zzi().zzc(string), Long.valueOf(j2));
            return;
        }
        long j3 = bundle2.getLong(AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE);
        if (j3 > 15552000000L || j3 < 1) {
            zzj().zzg().zza("Invalid conditional user property time to live", zzi().zzc(string), Long.valueOf(j3));
        } else {
            zzl().zzb(new zzjz(this, bundle2));
        }
    }

    final void zza(Bundle bundle, int i, long j) throws IllegalStateException {
        zzu();
        String strZza = zziq.zza(bundle);
        if (strZza != null) {
            zzj().zzv().zza("Ignoring invalid consent setting", strZza);
            zzj().zzv().zza("Valid consent values are 'granted', 'denied'");
        }
        boolean z = zze().zza(zzbf.zzcq) && zzl().zzg();
        zziq zziqVarZza = zziq.zza(bundle, i);
        if (zziqVarZza.zzk()) {
            zza(zziqVarZza, j, z);
        }
        zzav zzavVarZza = zzav.zza(bundle, i);
        if (zzavVarZza.zzg()) {
            zza(zzavVarZza, z);
        }
        Boolean boolZza = zzav.zza(bundle);
        if (boolZza != null) {
            zza(i == -30 ? "tcf" : MBridgeConstans.DYNAMIC_VIEW_WX_APP, FirebaseAnalytics.UserProperty.ALLOW_AD_PERSONALIZATION_SIGNALS, (Object) boolZza.toString(), false);
        }
    }

    final void zza(zzav zzavVar, boolean z) {
        zzkj zzkjVar = new zzkj(this, zzavVar);
        if (z) {
            zzt();
            zzkjVar.run();
        } else {
            zzl().zzb(zzkjVar);
        }
    }

    public final void zza(zziy zziyVar) {
        zziy zziyVar2;
        zzt();
        zzu();
        if (zziyVar != null && zziyVar != (zziyVar2 = this.zzc)) {
            Preconditions.checkState(zziyVar2 == null, "EventInterceptor already set.");
        }
        this.zzc = zziyVar;
    }

    public final void zza(Boolean bool) throws IllegalStateException {
        zzu();
        zzl().zzb(new zzkk(this, bool));
    }

    final void zza(zziq zziqVar) {
        zzt();
        boolean z = (zziqVar.zzj() && zziqVar.zzi()) || zzo().zzam();
        if (z != this.zzu.zzad()) {
            this.zzu.zzb(z);
            Boolean boolZzu = zzk().zzu();
            if (!z || boolZzu == null || boolZzu.booleanValue()) {
                zza(Boolean.valueOf(z), false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(Boolean bool, boolean z) throws IllegalStateException {
        zzt();
        zzu();
        zzj().zzc().zza("Setting app measurement enabled (FE)", bool);
        zzk().zza(bool);
        if (z) {
            zzk().zzb(bool);
        }
        if (this.zzu.zzad() || !(bool == null || bool.booleanValue())) {
            zzar();
        }
    }

    public final void zza(zziq zziqVar, long j, boolean z) {
        zziq zziqVar2;
        boolean z2;
        boolean z3;
        boolean z4;
        zziq zziqVarZzb = zziqVar;
        zzu();
        int iZza = zziqVar.zza();
        if (com.google.android.gms.internal.measurement.zzny.zza() && zze().zza(zzbf.zzcz)) {
            if (iZza != -10 && zziqVar.zzc() == zzit.UNINITIALIZED && zziqVar.zzd() == zzit.UNINITIALIZED) {
                zzj().zzv().zza("Ignoring empty consent settings");
                return;
            }
        } else if (iZza != -10 && zziqVar.zze() == null && zziqVar.zzf() == null) {
            zzj().zzv().zza("Discarding empty consent settings");
            return;
        }
        synchronized (this.zzg) {
            zziqVar2 = this.zzl;
            z2 = true;
            z3 = false;
            if (zziq.zza(iZza, zziqVar2.zza())) {
                boolean zZzc = zziqVar.zzc(this.zzl);
                if (zziqVar.zzj() && !this.zzl.zzj()) {
                    z3 = true;
                }
                zziqVarZzb = zziqVar.zzb(this.zzl);
                this.zzl = zziqVarZzb;
                z4 = z3;
                z3 = zZzc;
            } else {
                z2 = false;
                z4 = false;
            }
        }
        if (!z2) {
            zzj().zzn().zza("Ignoring lower-priority consent settings, proposed settings", zziqVarZzb);
            return;
        }
        long andIncrement = this.zzm.getAndIncrement();
        if (z3) {
            zza((String) null);
            zzkm zzkmVar = new zzkm(this, zziqVarZzb, j, andIncrement, z4, zziqVar2);
            if (z) {
                zzt();
                zzkmVar.run();
                return;
            } else {
                zzl().zzc(zzkmVar);
                return;
            }
        }
        zzkl zzklVar = new zzkl(this, zziqVarZzb, andIncrement, z4, zziqVar2);
        if (z) {
            zzt();
            zzklVar.run();
        } else if (iZza == 30 || iZza == -10) {
            zzl().zzc(zzklVar);
        } else {
            zzl().zzb(zzklVar);
        }
    }

    public final void zza(String str, String str2, Object obj, boolean z) {
        zza(str, str2, obj, z, zzb().currentTimeMillis());
    }

    public final void zza(String str, String str2, Object obj, boolean z, long j) throws IllegalStateException {
        int length;
        if (str == null) {
            str = MBridgeConstans.DYNAMIC_VIEW_WX_APP;
        }
        String str3 = str;
        int iZzb = 6;
        if (z) {
            iZzb = zzq().zzb(str2);
        } else {
            zzny zznyVarZzq = zzq();
            if (zznyVarZzq.zzc("user property", str2)) {
                if (!zznyVarZzq.zza("user property", zziv.zza, str2)) {
                    iZzb = 15;
                } else if (zznyVarZzq.zza("user property", 24, str2)) {
                    iZzb = 0;
                }
            }
        }
        if (iZzb != 0) {
            zzq();
            String strZza = zzny.zza(str2, 24, true);
            length = str2 != null ? str2.length() : 0;
            this.zzu.zzt();
            zzny.zza(this.zzs, iZzb, "_ev", strZza, length);
            return;
        }
        if (obj != null) {
            int iZza = zzq().zza(str2, obj);
            if (iZza != 0) {
                zzq();
                String strZza2 = zzny.zza(str2, 24, true);
                length = ((obj instanceof String) || (obj instanceof CharSequence)) ? String.valueOf(obj).length() : 0;
                this.zzu.zzt();
                zzny.zza(this.zzs, iZza, "_ev", strZza2, length);
                return;
            }
            Object objZzc = zzq().zzc(str2, obj);
            if (objZzc != null) {
                zza(str3, str2, j, objZzc);
                return;
            }
            return;
        }
        zza(str3, str2, j, (Object) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final void zza(java.lang.String r9, java.lang.String r10, java.lang.Object r11, long r12) throws java.lang.IllegalStateException {
        /*
            r8 = this;
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r9)
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r10)
            r8.zzt()
            r8.zzu()
            java.lang.String r0 = "allow_personalized_ads"
            boolean r0 = r0.equals(r10)
            if (r0 == 0) goto L6e
            boolean r0 = r11 instanceof java.lang.String
            java.lang.String r1 = "_npa"
            if (r0 == 0) goto L53
            r0 = r11
            java.lang.String r0 = (java.lang.String) r0
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L53
            java.util.Locale r10 = java.util.Locale.ENGLISH
            java.lang.String r10 = r0.toLowerCase(r10)
            java.lang.String r11 = "false"
            boolean r10 = r11.equals(r10)
            r2 = 1
            if (r10 == 0) goto L35
            r4 = r2
            goto L37
        L35:
            r4 = 0
        L37:
            java.lang.Long r10 = java.lang.Long.valueOf(r4)
            com.google.android.gms.measurement.internal.zzgo r0 = r8.zzk()
            com.google.android.gms.measurement.internal.zzgu r0 = r0.zzh
            r4 = r10
            java.lang.Long r4 = (java.lang.Long) r4
            long r4 = r10.longValue()
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 != 0) goto L4e
            java.lang.String r11 = "true"
        L4e:
            r0.zza(r11)
            r11 = r10
            goto L60
        L53:
            if (r11 != 0) goto L61
            com.google.android.gms.measurement.internal.zzgo r10 = r8.zzk()
            com.google.android.gms.measurement.internal.zzgu r10 = r10.zzh
            java.lang.String r0 = "unset"
            r10.zza(r0)
        L60:
            r10 = r1
        L61:
            com.google.android.gms.measurement.internal.zzfz r0 = r8.zzj()
            com.google.android.gms.measurement.internal.zzgb r0 = r0.zzp()
            java.lang.String r1 = "Setting _npa user property (which is the inverse of AD_PERSONALIZATION consent or allow_personalized_ads user property)"
            r0.zza(r1, r11, r9)
        L6e:
            r3 = r10
            r6 = r11
            com.google.android.gms.measurement.internal.zzhm r10 = r8.zzu
            boolean r10 = r10.zzac()
            if (r10 != 0) goto L86
            com.google.android.gms.measurement.internal.zzfz r9 = r8.zzj()
            com.google.android.gms.measurement.internal.zzgb r9 = r9.zzp()
            java.lang.String r10 = "User property not set since app measurement is disabled"
            r9.zza(r10)
            return
        L86:
            com.google.android.gms.measurement.internal.zzhm r10 = r8.zzu
            boolean r10 = r10.zzaf()
            if (r10 != 0) goto L8f
            return
        L8f:
            com.google.android.gms.measurement.internal.zznt r10 = new com.google.android.gms.measurement.internal.zznt
            r2 = r10
            r4 = r12
            r7 = r9
            r2.<init>(r3, r4, r6, r7)
            com.google.android.gms.measurement.internal.zzld r9 = r8.zzo()
            r9.zza(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzjc.zza(java.lang.String, java.lang.String, java.lang.Object, long):void");
    }

    public final void zzb(zzix zzixVar) throws IllegalStateException {
        zzu();
        Preconditions.checkNotNull(zzixVar);
        if (this.zzd.remove(zzixVar)) {
            return;
        }
        zzj().zzu().zza("OnEventListener had not been registered");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzar() throws IllegalStateException {
        zzt();
        String strZza = zzk().zzh.zza();
        if (strZza != null) {
            if ("unset".equals(strZza)) {
                zza(MBridgeConstans.DYNAMIC_VIEW_WX_APP, "_npa", (Object) null, zzb().currentTimeMillis());
            } else {
                zza(MBridgeConstans.DYNAMIC_VIEW_WX_APP, "_npa", Long.valueOf(a.g.equals(strZza) ? 1L : 0L), zzb().currentTimeMillis());
            }
        }
        if (this.zzu.zzac() && this.zzo) {
            zzj().zzc().zza("Recording app launch after enabling measurement for the first time (FE)");
            zzak();
            zzp().zza.zza();
            zzl().zzb(new zzjs(this));
            return;
        }
        zzj().zzc().zza("Updating Scion state (FE)");
        zzo().zzaj();
    }
}
