package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.IBinder;
import android.text.TextUtils;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzfky implements zzfkw {
    private final Context zza;
    private final zzflo zzb;
    private long zzc = 0;
    private long zzd = -1;
    private boolean zze = false;
    private zzflq zzf = zzflq.FORMAT_UNKNOWN;
    private zzfls zzg = zzfls.ORIENTATION_UNKNOWN;
    private int zzh = 0;
    private String zzi = "";
    private String zzj = "";
    private String zzk = "";
    private String zzl = "";
    private String zzm = "";
    private String zzn = "";
    private String zzo = "";
    private boolean zzp = false;
    private boolean zzq = false;

    zzfky(Context context, zzflo zzfloVar) {
        this.zza = context;
        this.zzb = zzfloVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfkw
    public final /* bridge */ /* synthetic */ zzfkw zza(com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzq(zzeVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfkw
    public final /* bridge */ /* synthetic */ zzfkw zzb(zzffy zzffyVar) {
        zzr(zzffyVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfkw
    public final /* bridge */ /* synthetic */ zzfkw zzc(String str) {
        zzs(str);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfkw
    public final /* bridge */ /* synthetic */ zzfkw zzd(zzflq zzflqVar) {
        zzt(zzflqVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfkw
    public final /* bridge */ /* synthetic */ zzfkw zze(String str) {
        zzu(str);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfkw
    public final /* bridge */ /* synthetic */ zzfkw zzf(String str) {
        zzv(str);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfkw
    public final /* bridge */ /* synthetic */ zzfkw zzg(boolean z) {
        zzw(z);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfkw
    public final /* bridge */ /* synthetic */ zzfkw zzh(Throwable th) {
        zzx(th);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfkw
    public final /* bridge */ /* synthetic */ zzfkw zzi() {
        zzy();
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfkw
    public final /* bridge */ /* synthetic */ zzfkw zzj() {
        zzz();
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfkw
    public final synchronized boolean zzk() {
        return this.zzq;
    }

    @Override // com.google.android.gms.internal.ads.zzfkw
    public final boolean zzl() {
        return !TextUtils.isEmpty(this.zzk);
    }

    @Override // com.google.android.gms.internal.ads.zzfkw
    public final synchronized zzfla zzm() {
        zzfkz zzfkzVar = null;
        if (this.zzp) {
            return null;
        }
        this.zzp = true;
        if (!this.zzq) {
            zzy();
        }
        if (this.zzd < 0) {
            zzz();
        }
        return new zzfla(this, zzfkzVar);
    }

    public final synchronized zzfky zzq(com.google.android.gms.ads.internal.client.zze zzeVar) {
        IBinder iBinder = zzeVar.zze;
        if (iBinder != null) {
            zzcyj zzcyjVar = (zzcyj) iBinder;
            String strZzk = zzcyjVar.zzk();
            if (!TextUtils.isEmpty(strZzk)) {
                this.zzi = strZzk;
            }
            String strZzi = zzcyjVar.zzi();
            if (!TextUtils.isEmpty(strZzi)) {
                this.zzj = strZzi;
            }
        }
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002b, code lost:
    
        r2.zzj = r0.zzac;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized com.google.android.gms.internal.ads.zzfky zzr(com.google.android.gms.internal.ads.zzffy r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            com.google.android.gms.internal.ads.zzffq r0 = r3.zzb     // Catch: java.lang.Throwable -> L31
            java.lang.String r0 = r0.zzb     // Catch: java.lang.Throwable -> L31
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L31
            if (r0 != 0) goto L11
            com.google.android.gms.internal.ads.zzffq r0 = r3.zzb     // Catch: java.lang.Throwable -> L31
            java.lang.String r0 = r0.zzb     // Catch: java.lang.Throwable -> L31
            r2.zzi = r0     // Catch: java.lang.Throwable -> L31
        L11:
            java.util.List r3 = r3.zza     // Catch: java.lang.Throwable -> L31
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L31
        L17:
            boolean r0 = r3.hasNext()     // Catch: java.lang.Throwable -> L31
            if (r0 == 0) goto L2f
            java.lang.Object r0 = r3.next()     // Catch: java.lang.Throwable -> L31
            com.google.android.gms.internal.ads.zzffn r0 = (com.google.android.gms.internal.ads.zzffn) r0     // Catch: java.lang.Throwable -> L31
            java.lang.String r1 = r0.zzac     // Catch: java.lang.Throwable -> L31
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L31
            if (r1 != 0) goto L17
            java.lang.String r3 = r0.zzac     // Catch: java.lang.Throwable -> L31
            r2.zzj = r3     // Catch: java.lang.Throwable -> L31
        L2f:
            monitor-exit(r2)
            return r2
        L31:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfky.zzr(com.google.android.gms.internal.ads.zzffy):com.google.android.gms.internal.ads.zzfky");
    }

    public final synchronized zzfky zzs(String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zziJ)).booleanValue()) {
            this.zzo = str;
        }
        return this;
    }

    public final synchronized zzfky zzt(zzflq zzflqVar) {
        this.zzf = zzflqVar;
        return this;
    }

    public final synchronized zzfky zzu(String str) {
        this.zzk = str;
        return this;
    }

    public final synchronized zzfky zzv(String str) {
        this.zzl = str;
        return this;
    }

    public final synchronized zzfky zzw(boolean z) {
        this.zze = z;
        return this;
    }

    public final synchronized zzfky zzx(Throwable th) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zziJ)).booleanValue()) {
            this.zzn = zzbvs.zze(th);
            this.zzm = (String) zzfxe.zzc(zzfwc.zzc('\n')).zzd(zzbvs.zzd(th)).iterator().next();
        }
        return this;
    }

    public final synchronized zzfky zzy() {
        Configuration configuration;
        this.zzh = com.google.android.gms.ads.internal.zzu.zzq().zzm(this.zza);
        Resources resources = this.zza.getResources();
        zzfls zzflsVar = (resources == null || (configuration = resources.getConfiguration()) == null) ? zzfls.ORIENTATION_UNKNOWN : configuration.orientation == 2 ? zzfls.ORIENTATION_LANDSCAPE : zzfls.ORIENTATION_PORTRAIT;
        this.zzg = zzflsVar;
        this.zzc = com.google.android.gms.ads.internal.zzu.zzB().elapsedRealtime();
        this.zzq = true;
        return this;
    }

    public final synchronized zzfky zzz() {
        this.zzd = com.google.android.gms.ads.internal.zzu.zzB().elapsedRealtime();
        return this;
    }
}
