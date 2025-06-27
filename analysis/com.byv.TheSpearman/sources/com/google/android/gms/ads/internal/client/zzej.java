package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdInspectorError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.OnAdInspectorClosedListener;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.initialization.AdapterStatus;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbmw;
import com.google.android.gms.internal.ads.zzbne;
import com.google.android.gms.internal.ads.zzbnf;
import com.google.android.gms.internal.ads.zzbqg;
import com.google.android.gms.internal.ads.zzfxg;
import com.json.mediationsdk.metadata.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.1.0 */
/* loaded from: classes2.dex */
public final class zzej {
    private static zzej zza;
    private zzco zzg;
    private final Object zzb = new Object();
    private boolean zzd = false;
    private boolean zze = false;
    private final Object zzf = new Object();
    private OnAdInspectorClosedListener zzh = null;
    private RequestConfiguration zzi = new RequestConfiguration.Builder().build();
    private final ArrayList zzc = new ArrayList();

    private zzej() {
    }

    private final void zzA(Context context) {
        if (this.zzg == null) {
            this.zzg = (zzco) new zzaq(zzay.zza(), context).zzd(context, false);
        }
    }

    private final void zzB(RequestConfiguration requestConfiguration) {
        try {
            this.zzg.zzu(new zzff(requestConfiguration));
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("Unable to set request configuration parcel.", e);
        }
    }

    public static zzej zzf() {
        zzej zzejVar;
        synchronized (zzej.class) {
            if (zza == null) {
                zza = new zzej();
            }
            zzejVar = zza;
        }
        return zzejVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static InitializationStatus zzy(List list) {
        HashMap map = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzbmw zzbmwVar = (zzbmw) it.next();
            map.put(zzbmwVar.zza, new zzbne(zzbmwVar.zzb ? AdapterStatus.State.READY : AdapterStatus.State.NOT_READY, zzbmwVar.zzd, zzbmwVar.zzc));
        }
        return new zzbnf(map);
    }

    private final void zzz(Context context, String str) {
        try {
            zzbqg.zza().zzb(context, null);
            this.zzg.zzk();
            this.zzg.zzl(null, ObjectWrapper.wrap(null));
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzk("MobileAdsSettingManager initialization failed", e);
        }
    }

    public final RequestConfiguration zzc() {
        return this.zzi;
    }

    public final InitializationStatus zze() {
        InitializationStatus initializationStatusZzy;
        synchronized (this.zzf) {
            Preconditions.checkState(this.zzg != null, "MobileAds.initialize() must be called prior to getting initialization status.");
            try {
                initializationStatusZzy = zzy(this.zzg.zzg());
            } catch (RemoteException unused) {
                com.google.android.gms.ads.internal.util.client.zzm.zzg("Unable to get Initialization status.");
                return new InitializationStatus() { // from class: com.google.android.gms.ads.internal.client.zzeb
                    @Override // com.google.android.gms.ads.initialization.InitializationStatus
                    public final Map getAdapterStatusMap() {
                        HashMap map = new HashMap();
                        map.put("com.google.android.gms.ads.MobileAds", new zzee(this.zza));
                        return map;
                    }
                };
            }
        }
        return initializationStatusZzy;
    }

    public final String zzh() {
        String strZzc;
        synchronized (this.zzf) {
            Preconditions.checkState(this.zzg != null, "MobileAds.initialize() must be called prior to getting version string.");
            try {
                strZzc = zzfxg.zzc(this.zzg.zzf());
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzm.zzh("Unable to get internal version.", e);
                return "";
            }
        }
        return strZzc;
    }

    public final void zzl(Context context) {
        synchronized (this.zzf) {
            zzA(context);
            try {
                this.zzg.zzi();
            } catch (RemoteException unused) {
                com.google.android.gms.ads.internal.util.client.zzm.zzg("Unable to disable mediation adapter initialization.");
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0077 A[Catch: all -> 0x005e, TryCatch #2 {, blocks: (B:24:0x0030, B:26:0x0050, B:34:0x0066, B:36:0x0077, B:38:0x0089, B:45:0x00cc, B:39:0x0099, B:41:0x00a7, B:43:0x00b9, B:44:0x00c4, B:28:0x0058, B:33:0x0061), top: B:54:0x0030, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0099 A[Catch: all -> 0x005e, TryCatch #2 {, blocks: (B:24:0x0030, B:26:0x0050, B:34:0x0066, B:36:0x0077, B:38:0x0089, B:45:0x00cc, B:39:0x0099, B:41:0x00a7, B:43:0x00b9, B:44:0x00c4, B:28:0x0058, B:33:0x0061), top: B:54:0x0030, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c4 A[Catch: all -> 0x005e, TryCatch #2 {, blocks: (B:24:0x0030, B:26:0x0050, B:34:0x0066, B:36:0x0077, B:38:0x0089, B:45:0x00cc, B:39:0x0099, B:41:0x00a7, B:43:0x00b9, B:44:0x00c4, B:28:0x0058, B:33:0x0061), top: B:54:0x0030, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzm(final android.content.Context r3, java.lang.String r4, com.google.android.gms.ads.initialization.OnInitializationCompleteListener r5) {
        /*
            r2 = this;
            java.lang.Object r4 = r2.zzb
            monitor-enter(r4)
            boolean r0 = r2.zzd     // Catch: java.lang.Throwable -> Ld8
            if (r0 == 0) goto L10
            if (r5 == 0) goto Le
            java.util.ArrayList r3 = r2.zzc     // Catch: java.lang.Throwable -> Ld8
            r3.add(r5)     // Catch: java.lang.Throwable -> Ld8
        Le:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> Ld8
            return
        L10:
            boolean r0 = r2.zze     // Catch: java.lang.Throwable -> Ld8
            if (r0 == 0) goto L1f
            if (r5 == 0) goto L1d
            com.google.android.gms.ads.initialization.InitializationStatus r3 = r2.zze()     // Catch: java.lang.Throwable -> Ld8
            r5.onInitializationComplete(r3)     // Catch: java.lang.Throwable -> Ld8
        L1d:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> Ld8
            return
        L1f:
            r0 = 1
            r2.zzd = r0     // Catch: java.lang.Throwable -> Ld8
            if (r5 == 0) goto L29
            java.util.ArrayList r0 = r2.zzc     // Catch: java.lang.Throwable -> Ld8
            r0.add(r5)     // Catch: java.lang.Throwable -> Ld8
        L29:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> Ld8
            if (r3 == 0) goto Ld0
            java.lang.Object r4 = r2.zzf
            monitor-enter(r4)
            r5 = 0
            r2.zzA(r3)     // Catch: java.lang.Throwable -> L5e android.os.RemoteException -> L60
            com.google.android.gms.ads.internal.client.zzco r0 = r2.zzg     // Catch: java.lang.Throwable -> L5e android.os.RemoteException -> L60
            com.google.android.gms.ads.internal.client.zzei r1 = new com.google.android.gms.ads.internal.client.zzei     // Catch: java.lang.Throwable -> L5e android.os.RemoteException -> L60
            r1.<init>(r2, r5)     // Catch: java.lang.Throwable -> L5e android.os.RemoteException -> L60
            r0.zzs(r1)     // Catch: java.lang.Throwable -> L5e android.os.RemoteException -> L60
            com.google.android.gms.ads.internal.client.zzco r0 = r2.zzg     // Catch: java.lang.Throwable -> L5e android.os.RemoteException -> L60
            com.google.android.gms.internal.ads.zzbqk r1 = new com.google.android.gms.internal.ads.zzbqk     // Catch: java.lang.Throwable -> L5e android.os.RemoteException -> L60
            r1.<init>()     // Catch: java.lang.Throwable -> L5e android.os.RemoteException -> L60
            r0.zzo(r1)     // Catch: java.lang.Throwable -> L5e android.os.RemoteException -> L60
            com.google.android.gms.ads.RequestConfiguration r0 = r2.zzi     // Catch: java.lang.Throwable -> L5e android.os.RemoteException -> L60
            int r0 = r0.getTagForChildDirectedTreatment()     // Catch: java.lang.Throwable -> L5e android.os.RemoteException -> L60
            r1 = -1
            if (r0 != r1) goto L58
            com.google.android.gms.ads.RequestConfiguration r0 = r2.zzi     // Catch: java.lang.Throwable -> L5e android.os.RemoteException -> L60
            int r0 = r0.getTagForUnderAgeOfConsent()     // Catch: java.lang.Throwable -> L5e android.os.RemoteException -> L60
            if (r0 == r1) goto L66
        L58:
            com.google.android.gms.ads.RequestConfiguration r0 = r2.zzi     // Catch: java.lang.Throwable -> L5e android.os.RemoteException -> L60
            r2.zzB(r0)     // Catch: java.lang.Throwable -> L5e android.os.RemoteException -> L60
            goto L66
        L5e:
            r3 = move-exception
            goto Lce
        L60:
            r0 = move-exception
            java.lang.String r1 = "MobileAdsSettingManager initialization failed"
            com.google.android.gms.ads.internal.util.client.zzm.zzk(r1, r0)     // Catch: java.lang.Throwable -> L5e
        L66:
            com.google.android.gms.internal.ads.zzbdz.zza(r3)     // Catch: java.lang.Throwable -> L5e
            com.google.android.gms.internal.ads.zzbff r0 = com.google.android.gms.internal.ads.zzbfr.zza     // Catch: java.lang.Throwable -> L5e
            java.lang.Object r0 = r0.zze()     // Catch: java.lang.Throwable -> L5e
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L5e
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L5e
            if (r0 == 0) goto L99
            com.google.android.gms.internal.ads.zzbdq r0 = com.google.android.gms.internal.ads.zzbdz.zzkO     // Catch: java.lang.Throwable -> L5e
            com.google.android.gms.internal.ads.zzbdx r1 = com.google.android.gms.ads.internal.client.zzba.zzc()     // Catch: java.lang.Throwable -> L5e
            java.lang.Object r0 = r1.zza(r0)     // Catch: java.lang.Throwable -> L5e
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L5e
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L5e
            if (r0 == 0) goto L99
            java.lang.String r0 = "Initializing on bg thread"
            com.google.android.gms.ads.internal.util.client.zzm.zze(r0)     // Catch: java.lang.Throwable -> L5e
            java.util.concurrent.ThreadPoolExecutor r0 = com.google.android.gms.ads.internal.util.client.zzb.zza     // Catch: java.lang.Throwable -> L5e
            com.google.android.gms.ads.internal.client.zzec r1 = new com.google.android.gms.ads.internal.client.zzec     // Catch: java.lang.Throwable -> L5e
            r1.<init>(r3, r5)     // Catch: java.lang.Throwable -> L5e
            r0.execute(r1)     // Catch: java.lang.Throwable -> L5e
            goto Lcc
        L99:
            com.google.android.gms.internal.ads.zzbff r0 = com.google.android.gms.internal.ads.zzbfr.zzb     // Catch: java.lang.Throwable -> L5e
            java.lang.Object r0 = r0.zze()     // Catch: java.lang.Throwable -> L5e
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L5e
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L5e
            if (r0 == 0) goto Lc4
            com.google.android.gms.internal.ads.zzbdq r0 = com.google.android.gms.internal.ads.zzbdz.zzkO     // Catch: java.lang.Throwable -> L5e
            com.google.android.gms.internal.ads.zzbdx r1 = com.google.android.gms.ads.internal.client.zzba.zzc()     // Catch: java.lang.Throwable -> L5e
            java.lang.Object r0 = r1.zza(r0)     // Catch: java.lang.Throwable -> L5e
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L5e
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L5e
            if (r0 == 0) goto Lc4
            java.util.concurrent.ExecutorService r0 = com.google.android.gms.ads.internal.util.client.zzb.zzb     // Catch: java.lang.Throwable -> L5e
            com.google.android.gms.ads.internal.client.zzed r1 = new com.google.android.gms.ads.internal.client.zzed     // Catch: java.lang.Throwable -> L5e
            r1.<init>(r3, r5)     // Catch: java.lang.Throwable -> L5e
            r0.execute(r1)     // Catch: java.lang.Throwable -> L5e
            goto Lcc
        Lc4:
            java.lang.String r0 = "Initializing on calling thread"
            com.google.android.gms.ads.internal.util.client.zzm.zze(r0)     // Catch: java.lang.Throwable -> L5e
            r2.zzz(r3, r5)     // Catch: java.lang.Throwable -> L5e
        Lcc:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L5e
            return
        Lce:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L5e
            throw r3
        Ld0:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "Context cannot be null."
            r3.<init>(r4)
            throw r3
        Ld8:
            r3 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> Ld8
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.client.zzej.zzm(android.content.Context, java.lang.String, com.google.android.gms.ads.initialization.OnInitializationCompleteListener):void");
    }

    final /* synthetic */ void zzn(Context context, String str) {
        synchronized (this.zzf) {
            zzz(context, null);
        }
    }

    final /* synthetic */ void zzo(Context context, String str) {
        synchronized (this.zzf) {
            zzz(context, null);
        }
    }

    public final void zzp(Context context, OnAdInspectorClosedListener onAdInspectorClosedListener) {
        synchronized (this.zzf) {
            zzA(context);
            this.zzh = onAdInspectorClosedListener;
            try {
                this.zzg.zzm(new zzeg(null));
            } catch (RemoteException unused) {
                com.google.android.gms.ads.internal.util.client.zzm.zzg("Unable to open the ad inspector.");
                if (onAdInspectorClosedListener != null) {
                    onAdInspectorClosedListener.onAdInspectorClosed(new AdInspectorError(0, "Ad inspector had an internal error.", MobileAds.ERROR_DOMAIN));
                }
            }
        }
    }

    public final void zzq(Context context, String str) {
        synchronized (this.zzf) {
            Preconditions.checkState(this.zzg != null, "MobileAds.initialize() must be called prior to opening debug menu.");
            try {
                this.zzg.zzn(ObjectWrapper.wrap(context), str);
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzm.zzh("Unable to open debug menu.", e);
            }
        }
    }

    public final void zzr(Class cls) {
        synchronized (this.zzf) {
            try {
                this.zzg.zzh(cls.getCanonicalName());
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzm.zzh("Unable to register RtbAdapter", e);
            }
        }
    }

    public final void zzs(boolean z) {
        synchronized (this.zzf) {
            Preconditions.checkState(this.zzg != null, "MobileAds.initialize() must be called prior to setting app muted state.");
            try {
                this.zzg.zzp(z);
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzm.zzh("Unable to set app mute state.", e);
            }
        }
    }

    public final void zzt(float f) {
        boolean z = true;
        Preconditions.checkArgument(f >= 0.0f && f <= 1.0f, "The app volume must be a value between 0 and 1 inclusive.");
        synchronized (this.zzf) {
            if (this.zzg == null) {
                z = false;
            }
            Preconditions.checkState(z, "MobileAds.initialize() must be called prior to setting the app volume.");
            try {
                this.zzg.zzq(f);
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzm.zzh("Unable to set app volume.", e);
            }
        }
    }

    public final void zzu(String str) {
        synchronized (this.zzf) {
            Preconditions.checkState(this.zzg != null, "MobileAds.initialize() must be called prior to setting the plugin.");
            try {
                this.zzg.zzt(str);
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzm.zzh("Unable to set plugin.", e);
            }
        }
    }

    public final void zzv(RequestConfiguration requestConfiguration) {
        Preconditions.checkArgument(requestConfiguration != null, "Null passed to setRequestConfiguration.");
        synchronized (this.zzf) {
            RequestConfiguration requestConfiguration2 = this.zzi;
            this.zzi = requestConfiguration;
            if (this.zzg == null) {
                return;
            }
            if (requestConfiguration2.getTagForChildDirectedTreatment() != requestConfiguration.getTagForChildDirectedTreatment() || requestConfiguration2.getTagForUnderAgeOfConsent() != requestConfiguration.getTagForUnderAgeOfConsent()) {
                zzB(requestConfiguration);
            }
        }
    }

    public final boolean zzx(boolean z) {
        synchronized (this.zzf) {
            Preconditions.checkState(this.zzg != null, "MobileAds.initialize() must be called prior to enable/disable the publisher first-party ID.");
            try {
                this.zzg.zzj(z);
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzm.zzh("Unable to " + (z ? a.i : "disable") + " the publisher first-party ID.", e);
                return false;
            }
        }
        return true;
    }

    public final float zza() {
        synchronized (this.zzf) {
            zzco zzcoVar = this.zzg;
            float fZze = 1.0f;
            if (zzcoVar == null) {
                return 1.0f;
            }
            try {
                fZze = zzcoVar.zze();
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzm.zzh("Unable to get app volume.", e);
            }
            return fZze;
        }
    }

    public final boolean zzw() {
        synchronized (this.zzf) {
            zzco zzcoVar = this.zzg;
            boolean zZzv = false;
            if (zzcoVar == null) {
                return false;
            }
            try {
                zZzv = zzcoVar.zzv();
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzm.zzh("Unable to get app mute state.", e);
            }
            return zZzv;
        }
    }
}
