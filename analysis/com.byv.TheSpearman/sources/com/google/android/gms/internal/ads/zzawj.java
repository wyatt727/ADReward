package com.google.android.gms.internal.ads;

import android.os.ConditionVariable;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzawj {
    protected volatile Boolean zzb;
    private final zzaxp zze;
    private static final ConditionVariable zzc = new ConditionVariable();
    protected static volatile zzfrv zza = null;
    private static volatile Random zzd = null;

    public zzawj(zzaxp zzaxpVar) {
        this.zze = zzaxpVar;
        zzaxpVar.zzk().execute(new zzawi(this));
    }

    public static final int zzd() {
        try {
            return ThreadLocalRandom.current().nextInt();
        } catch (RuntimeException unused) {
            if (zzd == null) {
                synchronized (zzawj.class) {
                    if (zzd == null) {
                        zzd = new Random();
                    }
                }
            }
            return zzd.nextInt();
        }
    }

    public final void zzc(int i, int i2, long j, String str, Exception exc) {
        try {
            zzc.block();
            if (!this.zzb.booleanValue() || zza == null) {
                return;
            }
            zzasi zzasiVarZza = zzaso.zza();
            zzasiVarZza.zza(this.zze.zza.getPackageName());
            zzasiVarZza.zzf(j);
            if (str != null) {
                zzasiVarZza.zzb(str);
            }
            if (exc != null) {
                StringWriter stringWriter = new StringWriter();
                exc.printStackTrace(new PrintWriter(stringWriter));
                zzasiVarZza.zzg(stringWriter.toString());
                zzasiVarZza.zzd(exc.getClass().getName());
            }
            zzfru zzfruVarZza = zza.zza(((zzaso) zzasiVarZza.zzbr()).zzaV());
            zzfruVarZza.zza(i);
            if (i2 != -1) {
                zzfruVarZza.zzb(i2);
            }
            zzfruVarZza.zzc();
        } catch (Exception unused) {
        }
    }
}
