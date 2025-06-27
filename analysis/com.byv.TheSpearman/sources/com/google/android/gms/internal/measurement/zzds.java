package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.NetworkOnMainThreadException;
import android.os.RemoteException;
import android.util.Log;
import android.util.Pair;
import com.google.android.exoplayer2.C;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ExecutorService;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@22.0.0 */
/* loaded from: classes3.dex */
public class zzds {
    private static volatile zzds zzb;
    protected final Clock zza;
    private final String zzc;
    private final ExecutorService zzd;
    private final AppMeasurementSdk zze;
    private final List<Pair<com.google.android.gms.measurement.internal.zzix, zzb>> zzf;
    private int zzg;
    private boolean zzh;
    private String zzi;
    private volatile zzdd zzj;

    /* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@22.0.0 */
    static class zzb extends zzdm {
        private final com.google.android.gms.measurement.internal.zzix zza;

        @Override // com.google.android.gms.internal.measurement.zzdj
        public final int zza() {
            return System.identityHashCode(this.zza);
        }

        zzb(com.google.android.gms.measurement.internal.zzix zzixVar) {
            this.zza = zzixVar;
        }

        @Override // com.google.android.gms.internal.measurement.zzdj
        public final void zza(String str, String str2, Bundle bundle, long j) {
            this.zza.onEvent(str, str2, bundle, j);
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@22.0.0 */
    static class zzc extends zzdm {
        private final com.google.android.gms.measurement.internal.zziy zza;

        @Override // com.google.android.gms.internal.measurement.zzdj
        public final int zza() {
            return System.identityHashCode(this.zza);
        }

        zzc(com.google.android.gms.measurement.internal.zziy zziyVar) {
            this.zza = zziyVar;
        }

        @Override // com.google.android.gms.internal.measurement.zzdj
        public final void zza(String str, String str2, Bundle bundle, long j) {
            this.zza.interceptEvent(str, str2, bundle, j);
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@22.0.0 */
    class zzd implements Application.ActivityLifecycleCallbacks {
        zzd() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(Activity activity, Bundle bundle) {
            zzds.this.zza(new zzfa(this, bundle, activity));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(Activity activity) {
            zzds.this.zza(new zzff(this, activity));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(Activity activity) {
            zzds.this.zza(new zzfe(this, activity));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(Activity activity) {
            zzds.this.zza(new zzfb(this, activity));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            zzde zzdeVar = new zzde();
            zzds.this.zza(new zzfg(this, activity, zzdeVar));
            Bundle bundleZza = zzdeVar.zza(50L);
            if (bundleZza != null) {
                bundle.putAll(bundleZza);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(Activity activity) {
            zzds.this.zza(new zzfc(this, activity));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(Activity activity) {
            zzds.this.zza(new zzfd(this, activity));
        }
    }

    public final int zza(String str) {
        zzde zzdeVar = new zzde();
        zza(new zzep(this, str, zzdeVar));
        Integer num = (Integer) zzde.zza(zzdeVar.zza(10000L), Integer.class);
        if (num == null) {
            return 25;
        }
        return num.intValue();
    }

    /* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@22.0.0 */
    abstract class zza implements Runnable {
        final long zza;
        final long zzb;
        private final boolean zzc;

        zza(zzds zzdsVar) {
            this(true);
        }

        abstract void zza() throws RemoteException;

        protected void zzb() {
        }

        zza(boolean z) {
            this.zza = zzds.this.zza.currentTimeMillis();
            this.zzb = zzds.this.zza.elapsedRealtime();
            this.zzc = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (zzds.this.zzh) {
                zzb();
                return;
            }
            try {
                zza();
            } catch (Exception e) {
                zzds.this.zza(e, false, this.zzc);
                zzb();
            }
        }
    }

    public final long zza() {
        zzde zzdeVar = new zzde();
        zza(new zzek(this, zzdeVar));
        Long lZzb = zzdeVar.zzb(500L);
        if (lZzb == null) {
            long jNextLong = new Random(System.nanoTime() ^ this.zza.currentTimeMillis()).nextLong();
            int i = this.zzg + 1;
            this.zzg = i;
            return jNextLong + i;
        }
        return lZzb.longValue();
    }

    public final Bundle zza(Bundle bundle, boolean z) {
        zzde zzdeVar = new zzde();
        zza(new zzeq(this, bundle, zzdeVar));
        if (z) {
            return zzdeVar.zza(5000L);
        }
        return null;
    }

    public final AppMeasurementSdk zzb() {
        return this.zze;
    }

    protected final zzdd zza(Context context, boolean z) {
        try {
            return zzdg.asInterface(DynamiteModule.load(context, DynamiteModule.PREFER_HIGHEST_OR_LOCAL_VERSION, ModuleDescriptor.MODULE_ID).instantiate("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
        } catch (DynamiteModule.LoadingException e) {
            zza((Exception) e, true, false);
            return null;
        }
    }

    public static zzds zza(Context context) {
        return zza(context, (String) null, (String) null, (String) null, (Bundle) null);
    }

    public static zzds zza(Context context, String str, String str2, String str3, Bundle bundle) {
        Preconditions.checkNotNull(context);
        if (zzb == null) {
            synchronized (zzds.class) {
                if (zzb == null) {
                    zzb = new zzds(context, str, str2, str3, bundle);
                }
            }
        }
        return zzb;
    }

    public final Long zzc() {
        zzde zzdeVar = new zzde();
        zza(new zzer(this, zzdeVar));
        return zzdeVar.zzb(120000L);
    }

    public final Object zza(int i) {
        zzde zzdeVar = new zzde();
        zza(new zzeu(this, zzdeVar, i));
        return zzde.zza(zzdeVar.zza(C.DEFAULT_SEEK_FORWARD_INCREMENT_MS), Object.class);
    }

    public final String zzd() {
        return this.zzi;
    }

    public final String zze() {
        zzde zzdeVar = new zzde();
        zza(new zzes(this, zzdeVar));
        return zzdeVar.zzc(120000L);
    }

    public final String zzf() {
        zzde zzdeVar = new zzde();
        zza(new zzeh(this, zzdeVar));
        return zzdeVar.zzc(50L);
    }

    public final String zzg() {
        zzde zzdeVar = new zzde();
        zza(new zzem(this, zzdeVar));
        return zzdeVar.zzc(500L);
    }

    public final String zzh() {
        zzde zzdeVar = new zzde();
        zza(new zzej(this, zzdeVar));
        return zzdeVar.zzc(500L);
    }

    public final String zzi() {
        zzde zzdeVar = new zzde();
        zza(new zzei(this, zzdeVar));
        return zzdeVar.zzc(500L);
    }

    public final List<Bundle> zza(String str, String str2) {
        zzde zzdeVar = new zzde();
        zza(new zzdv(this, str, str2, zzdeVar));
        List<Bundle> list = (List) zzde.zza(zzdeVar.zza(5000L), List.class);
        return list == null ? Collections.emptyList() : list;
    }

    public final Map<String, Object> zza(String str, String str2, boolean z) {
        zzde zzdeVar = new zzde();
        zza(new zzel(this, str, str2, z, zzdeVar));
        Bundle bundleZza = zzdeVar.zza(5000L);
        if (bundleZza == null || bundleZza.size() == 0) {
            return Collections.emptyMap();
        }
        HashMap map = new HashMap(bundleZza.size());
        for (String str3 : bundleZza.keySet()) {
            Object obj = bundleZza.get(str3);
            if ((obj instanceof Double) || (obj instanceof Long) || (obj instanceof String)) {
                map.put(str3, obj);
            }
        }
        return map;
    }

    private zzds(Context context, String str, String str2, String str3, Bundle bundle) {
        if (str == null || !zzc(str2, str3)) {
            this.zzc = "FA";
        } else {
            this.zzc = str;
        }
        this.zza = DefaultClock.getInstance();
        this.zzd = zzcu.zza().zza(new zzee(this), zzcz.zza);
        this.zze = new AppMeasurementSdk(this);
        this.zzf = new ArrayList();
        if (!(!zzb(context) || zzk())) {
            this.zzi = null;
            this.zzh = true;
            Log.w(this.zzc, "Disabling data collection. Found google_app_id in strings.xml but Google Analytics for Firebase is missing. Remove this value or add Google Analytics for Firebase to resume data collection.");
            return;
        }
        if (!zzc(str2, str3)) {
            this.zzi = "fa";
            if (str2 == null || str3 == null) {
                if ((str2 == null) ^ (str3 == null)) {
                    Log.w(this.zzc, "Specified origin or custom app id is null. Both parameters will be ignored.");
                }
            } else {
                Log.v(this.zzc, "Deferring to Google Analytics for Firebase for event data collection. https://firebase.google.com/docs/analytics");
            }
        } else {
            this.zzi = str2;
        }
        zza(new zzdr(this, str2, str3, context, bundle));
        Application application = (Application) context.getApplicationContext();
        if (application == null) {
            Log.w(this.zzc, "Unable to register lifecycle notifications. Application null.");
        } else {
            application.registerActivityLifecycleCallbacks(new zzd());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(Exception exc, boolean z, boolean z2) {
        this.zzh |= z;
        if (z) {
            Log.w(this.zzc, "Data collection startup failed. No data will be collected.", exc);
            return;
        }
        if (z2) {
            zza(5, "Error with data collection. Data lost.", exc, (Object) null, (Object) null);
        }
        Log.w(this.zzc, "Error with data collection. Data lost.", exc);
    }

    public final void zzb(String str) {
        zza(new zzeg(this, str));
    }

    public final void zza(String str, String str2, Bundle bundle) {
        zza(new zzdw(this, str, str2, bundle));
    }

    public final void zzc(String str) {
        zza(new zzef(this, str));
    }

    public final void zza(String str, Bundle bundle) {
        zza(null, str, bundle, false, true, null);
    }

    public final void zzb(String str, String str2, Bundle bundle) {
        zza(str, str2, bundle, true, true, null);
    }

    public final void zza(String str, String str2, Bundle bundle, long j) {
        zza(str, str2, bundle, true, false, Long.valueOf(j));
    }

    private final void zza(String str, String str2, Bundle bundle, boolean z, boolean z2, Long l) {
        zza(new zzez(this, l, str, str2, bundle, z, z2));
    }

    public final void zza(int i, String str, Object obj, Object obj2, Object obj3) {
        zza(new zzeo(this, false, 5, str, obj, null, null));
    }

    public final void zza(com.google.android.gms.measurement.internal.zzix zzixVar) {
        Preconditions.checkNotNull(zzixVar);
        synchronized (this.zzf) {
            for (int i = 0; i < this.zzf.size(); i++) {
                if (zzixVar.equals(this.zzf.get(i).first)) {
                    Log.w(this.zzc, "OnEventListener already registered.");
                    return;
                }
            }
            zzb zzbVar = new zzb(zzixVar);
            this.zzf.add(new Pair<>(zzixVar, zzbVar));
            if (this.zzj != null) {
                try {
                    this.zzj.registerOnMeasurementEventListener(zzbVar);
                    return;
                } catch (BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException unused) {
                    Log.w(this.zzc, "Failed to register event listener on calling thread. Trying again on the dynamite thread.");
                }
            }
            zza(new zzey(this, zzbVar));
        }
    }

    public final void zzj() {
        zza(new zzeb(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zza zzaVar) {
        this.zzd.execute(zzaVar);
    }

    public final void zza(Bundle bundle) {
        zza(new zzdt(this, bundle));
    }

    public final void zzb(Bundle bundle) {
        zza(new zzdz(this, bundle));
    }

    public final void zzc(Bundle bundle) {
        zza(new zzec(this, bundle));
    }

    public final void zza(Activity activity, String str, String str2) {
        zza(new zzdx(this, activity, str, str2));
    }

    public final void zza(boolean z) {
        zza(new zzet(this, z));
    }

    public final void zzd(Bundle bundle) {
        zza(new zzew(this, bundle));
    }

    public final void zza(com.google.android.gms.measurement.internal.zziy zziyVar) {
        zzc zzcVar = new zzc(zziyVar);
        if (this.zzj != null) {
            try {
                this.zzj.setEventInterceptor(zzcVar);
                return;
            } catch (BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException unused) {
                Log.w(this.zzc, "Failed to set event interceptor on calling thread. Trying again on the dynamite thread.");
            }
        }
        zza(new zzen(this, zzcVar));
    }

    public final void zza(Boolean bool) {
        zza(new zzea(this, bool));
    }

    public final void zza(long j) {
        zza(new zzed(this, j));
    }

    public final void zza(Intent intent) {
        zza(new zzev(this, intent));
    }

    public final void zzd(String str) {
        zza(new zzdy(this, str));
    }

    public final void zzb(String str, String str2) {
        zza((String) null, str, (Object) str2, false);
    }

    public final void zza(String str, String str2, Object obj, boolean z) {
        zza(new zzdu(this, str, str2, obj, z));
    }

    public final void zzb(com.google.android.gms.measurement.internal.zzix zzixVar) {
        Preconditions.checkNotNull(zzixVar);
        synchronized (this.zzf) {
            Pair<com.google.android.gms.measurement.internal.zzix, zzb> pair = null;
            int i = 0;
            while (true) {
                if (i >= this.zzf.size()) {
                    break;
                }
                if (zzixVar.equals(this.zzf.get(i).first)) {
                    pair = this.zzf.get(i);
                    break;
                }
                i++;
            }
            if (pair == null) {
                Log.w(this.zzc, "OnEventListener had not been registered.");
                return;
            }
            this.zzf.remove(pair);
            zzb zzbVar = (zzb) pair.second;
            if (this.zzj != null) {
                try {
                    this.zzj.unregisterOnMeasurementEventListener(zzbVar);
                    return;
                } catch (BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException unused) {
                    Log.w(this.zzc, "Failed to unregister event listener on calling thread. Trying again on the dynamite thread.");
                }
            }
            zza(new zzex(this, zzbVar));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean zzc(String str, String str2) {
        return (str2 == null || str == null || zzk()) ? false : true;
    }

    private final boolean zzk() throws ClassNotFoundException {
        try {
            Class.forName("com.google.firebase.analytics.FirebaseAnalytics", false, getClass().getClassLoader());
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    private static boolean zzb(Context context) {
        return new com.google.android.gms.measurement.internal.zzhg(context, com.google.android.gms.measurement.internal.zzhg.zza(context)).zza("google_app_id") != null;
    }
}
