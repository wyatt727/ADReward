package com.google.android.gms.internal.measurement;

import android.content.Context;
import com.google.android.gms.internal.measurement.zzhe;
import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import java.util.Collection;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.0 */
/* loaded from: classes3.dex */
public abstract class zzhh<T> {

    @Nullable
    private static volatile zzhs zzb = null;
    private static volatile boolean zzc = false;
    private final zzhp zzg;
    private final String zzh;
    private final T zzi;
    private volatile int zzj;
    private volatile T zzk;
    private final boolean zzl;
    private static final Object zza = new Object();
    private static final AtomicReference<Collection<zzhh<?>>> zzd = new AtomicReference<>();
    private static zzhw zze = new zzhw(new zzhv() { // from class: com.google.android.gms.internal.measurement.zzhm
        @Override // com.google.android.gms.internal.measurement.zzhv
        public final boolean zza() {
            return zzhh.zzd();
        }
    });
    private static final AtomicInteger zzf = new AtomicInteger();

    static /* synthetic */ boolean zzd() {
        return true;
    }

    abstract T zza(Object obj);

    static /* synthetic */ zzhh zza(zzhp zzhpVar, String str, Boolean bool, boolean z) {
        return new zzho(zzhpVar, str, bool, true);
    }

    static /* synthetic */ zzhh zza(zzhp zzhpVar, String str, Double d, boolean z) {
        return new zzhn(zzhpVar, str, d, true);
    }

    static /* synthetic */ zzhh zza(zzhp zzhpVar, String str, Long l, boolean z) {
        return new zzhl(zzhpVar, str, l, true);
    }

    static /* synthetic */ zzhh zza(zzhp zzhpVar, String str, String str2, boolean z) {
        return new zzhq(zzhpVar, str, str2, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x007d A[Catch: all -> 0x0094, TryCatch #0 {, blocks: (B:8:0x001c, B:10:0x0020, B:12:0x0029, B:14:0x0039, B:18:0x0056, B:20:0x0061, B:33:0x007f, B:36:0x0087, B:37:0x008a, B:38:0x008e, B:23:0x0068, B:32:0x007d, B:26:0x006f, B:29:0x0076, B:39:0x0092), top: B:46:0x001c }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final T zza() {
        /*
            r8 = this;
            boolean r0 = r8.zzl
            if (r0 != 0) goto L11
            com.google.android.gms.internal.measurement.zzhw r0 = com.google.android.gms.internal.measurement.zzhh.zze
            java.lang.String r1 = r8.zzh
            boolean r0 = r0.zza(r1)
            java.lang.String r1 = "Attempt to access PhenotypeFlag not via codegen. All new PhenotypeFlags must be accessed through codegen APIs. If you believe you are seeing this error by mistake, you can add your flag to the exemption list located at //java/com/google/android/libraries/phenotype/client/lockdown/flags.textproto. Send the addition CL to ph-reviews@. See go/phenotype-android-codegen for information about generated code. See go/ph-lockdown for more information about this error."
            com.google.common.base.Preconditions.checkState(r0, r1)
        L11:
            java.util.concurrent.atomic.AtomicInteger r0 = com.google.android.gms.internal.measurement.zzhh.zzf
            int r0 = r0.get()
            int r1 = r8.zzj
            if (r1 >= r0) goto L97
            monitor-enter(r8)
            int r1 = r8.zzj     // Catch: java.lang.Throwable -> L94
            if (r1 >= r0) goto L92
            com.google.android.gms.internal.measurement.zzhs r1 = com.google.android.gms.internal.measurement.zzhh.zzb     // Catch: java.lang.Throwable -> L94
            com.google.common.base.Optional r2 = com.google.common.base.Optional.absent()     // Catch: java.lang.Throwable -> L94
            r3 = 0
            if (r1 == 0) goto L51
            com.google.common.base.Supplier r2 = r1.zzb()     // Catch: java.lang.Throwable -> L94
            java.lang.Object r2 = r2.get()     // Catch: java.lang.Throwable -> L94
            com.google.common.base.Optional r2 = (com.google.common.base.Optional) r2     // Catch: java.lang.Throwable -> L94
            boolean r4 = r2.isPresent()     // Catch: java.lang.Throwable -> L94
            if (r4 == 0) goto L51
            java.lang.Object r3 = r2.get()     // Catch: java.lang.Throwable -> L94
            com.google.android.gms.internal.measurement.zzhf r3 = (com.google.android.gms.internal.measurement.zzhf) r3     // Catch: java.lang.Throwable -> L94
            com.google.android.gms.internal.measurement.zzhp r4 = r8.zzg     // Catch: java.lang.Throwable -> L94
            android.net.Uri r4 = r4.zzb     // Catch: java.lang.Throwable -> L94
            com.google.android.gms.internal.measurement.zzhp r5 = r8.zzg     // Catch: java.lang.Throwable -> L94
            java.lang.String r5 = r5.zza     // Catch: java.lang.Throwable -> L94
            com.google.android.gms.internal.measurement.zzhp r6 = r8.zzg     // Catch: java.lang.Throwable -> L94
            java.lang.String r6 = r6.zzd     // Catch: java.lang.Throwable -> L94
            java.lang.String r7 = r8.zzh     // Catch: java.lang.Throwable -> L94
            java.lang.String r3 = r3.zza(r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L94
        L51:
            if (r1 == 0) goto L55
            r4 = 1
            goto L56
        L55:
            r4 = 0
        L56:
            java.lang.String r5 = "Must call PhenotypeFlagInitializer.maybeInit() first"
            com.google.common.base.Preconditions.checkState(r4, r5)     // Catch: java.lang.Throwable -> L94
            com.google.android.gms.internal.measurement.zzhp r4 = r8.zzg     // Catch: java.lang.Throwable -> L94
            boolean r4 = r4.zzf     // Catch: java.lang.Throwable -> L94
            if (r4 == 0) goto L6f
            java.lang.Object r4 = r8.zza(r1)     // Catch: java.lang.Throwable -> L94
            if (r4 == 0) goto L68
            goto L7f
        L68:
            java.lang.Object r4 = r8.zzb(r1)     // Catch: java.lang.Throwable -> L94
            if (r4 == 0) goto L7d
            goto L7f
        L6f:
            java.lang.Object r4 = r8.zzb(r1)     // Catch: java.lang.Throwable -> L94
            if (r4 == 0) goto L76
            goto L7f
        L76:
            java.lang.Object r4 = r8.zza(r1)     // Catch: java.lang.Throwable -> L94
            if (r4 == 0) goto L7d
            goto L7f
        L7d:
            T r4 = r8.zzi     // Catch: java.lang.Throwable -> L94
        L7f:
            boolean r1 = r2.isPresent()     // Catch: java.lang.Throwable -> L94
            if (r1 == 0) goto L8e
            if (r3 != 0) goto L8a
            T r4 = r8.zzi     // Catch: java.lang.Throwable -> L94
            goto L8e
        L8a:
            java.lang.Object r4 = r8.zza(r3)     // Catch: java.lang.Throwable -> L94
        L8e:
            r8.zzk = r4     // Catch: java.lang.Throwable -> L94
            r8.zzj = r0     // Catch: java.lang.Throwable -> L94
        L92:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L94
            goto L97
        L94:
            r0 = move-exception
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L94
            throw r0
        L97:
            T r0 = r8.zzk
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzhh.zza():java.lang.Object");
    }

    @Nullable
    private final T zza(zzhs zzhsVar) {
        if (!this.zzg.zze && (this.zzg.zzh == null || this.zzg.zzh.apply(zzhsVar.zza()).booleanValue())) {
            Object objZza = zzha.zza(zzhsVar.zza()).zza(this.zzg.zze ? null : zza(this.zzg.zzc));
            if (objZza != null) {
                return zza(objZza);
            }
        }
        return null;
    }

    @Nullable
    private final T zzb(zzhs zzhsVar) {
        zzgz zzgzVarZza;
        Object objZza;
        if (this.zzg.zzb != null) {
            if (!zzhg.zza(zzhsVar.zza(), this.zzg.zzb)) {
                zzgzVarZza = null;
            } else if (this.zzg.zzg) {
                zzgzVarZza = zzgs.zza(zzhsVar.zza().getContentResolver(), zzhi.zza(zzhi.zza(zzhsVar.zza(), this.zzg.zzb.getLastPathSegment())), new Runnable() { // from class: com.google.android.gms.internal.measurement.zzhk
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzhh.zzc();
                    }
                });
            } else {
                zzgzVarZza = zzgs.zza(zzhsVar.zza().getContentResolver(), this.zzg.zzb, new Runnable() { // from class: com.google.android.gms.internal.measurement.zzhk
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzhh.zzc();
                    }
                });
            }
        } else {
            zzgzVarZza = zzhu.zza(zzhsVar.zza(), this.zzg.zza, new Runnable() { // from class: com.google.android.gms.internal.measurement.zzhk
                @Override // java.lang.Runnable
                public final void run() {
                    zzhh.zzc();
                }
            });
        }
        if (zzgzVarZza == null || (objZza = zzgzVarZza.zza(zzb())) == null) {
            return null;
        }
        return zza(objZza);
    }

    public final String zzb() {
        return zza(this.zzg.zzd);
    }

    private final String zza(String str) {
        if (str != null && str.isEmpty()) {
            return this.zzh;
        }
        return str + this.zzh;
    }

    private zzhh(zzhp zzhpVar, String str, T t, boolean z) {
        this.zzj = -1;
        if (zzhpVar.zza == null && zzhpVar.zzb == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        }
        if (zzhpVar.zza != null && zzhpVar.zzb != null) {
            throw new IllegalArgumentException("Must pass one of SharedPreferences file name or ContentProvider URI");
        }
        this.zzg = zzhpVar;
        this.zzh = str;
        this.zzi = t;
        this.zzl = z;
    }

    public static void zzc() {
        zzf.incrementAndGet();
    }

    public static void zzb(final Context context) {
        if (zzb != null || context == null) {
            return;
        }
        Object obj = zza;
        synchronized (obj) {
            if (zzb == null && context != null) {
                synchronized (obj) {
                    zzhs zzhsVar = zzb;
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext != null) {
                        context = applicationContext;
                    }
                    if (zzhsVar == null || zzhsVar.zza() != context) {
                        if (zzhsVar != null) {
                            zzgs.zzc();
                            zzhu.zza();
                            zzha.zza();
                        }
                        zzb = new zzgt(context, Suppliers.memoize(new Supplier() { // from class: com.google.android.gms.internal.measurement.zzhj
                            @Override // com.google.common.base.Supplier
                            public final Object get() {
                                return zzhe.zza.zza(context);
                            }
                        }));
                        zzf.incrementAndGet();
                    }
                }
            }
        }
    }
}
