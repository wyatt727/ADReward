package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzix implements zzlh {
    private final zzmm zza;
    private final zziw zzb;
    private zzmf zzc;
    private zzlh zzd;
    private boolean zze = true;
    private boolean zzf;

    public zzix(zziw zziwVar, zzel zzelVar) {
        this.zzb = zziwVar;
        this.zza = new zzmm(zzelVar);
    }

    @Override // com.google.android.gms.internal.ads.zzlh
    public final long zza() {
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long zzb(boolean r5) {
        /*
            r4 = this;
            com.google.android.gms.internal.ads.zzmf r0 = r4.zzc
            if (r0 == 0) goto L71
            boolean r0 = r0.zzW()
            if (r0 != 0) goto L71
            if (r5 == 0) goto L15
            com.google.android.gms.internal.ads.zzmf r0 = r4.zzc
            int r0 = r0.zzcU()
            r1 = 2
            if (r0 != r1) goto L71
        L15:
            com.google.android.gms.internal.ads.zzmf r0 = r4.zzc
            boolean r0 = r0.zzX()
            if (r0 != 0) goto L28
            if (r5 != 0) goto L71
            com.google.android.gms.internal.ads.zzmf r5 = r4.zzc
            boolean r5 = r5.zzQ()
            if (r5 == 0) goto L28
            goto L71
        L28:
            com.google.android.gms.internal.ads.zzlh r5 = r4.zzd
            java.util.Objects.requireNonNull(r5)
            long r0 = r5.zza()
            boolean r2 = r4.zze
            if (r2 == 0) goto L51
            com.google.android.gms.internal.ads.zzmm r2 = r4.zza
            long r2 = r2.zza()
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 >= 0) goto L45
            com.google.android.gms.internal.ads.zzmm r5 = r4.zza
            r5.zze()
            goto L7d
        L45:
            r2 = 0
            r4.zze = r2
            boolean r2 = r4.zzf
            if (r2 == 0) goto L51
            com.google.android.gms.internal.ads.zzmm r2 = r4.zza
            r2.zzd()
        L51:
            com.google.android.gms.internal.ads.zzmm r2 = r4.zza
            r2.zzb(r0)
            com.google.android.gms.internal.ads.zzcg r5 = r5.zzc()
            com.google.android.gms.internal.ads.zzmm r0 = r4.zza
            com.google.android.gms.internal.ads.zzcg r0 = r0.zzc()
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L7d
            com.google.android.gms.internal.ads.zzmm r0 = r4.zza
            r0.zzg(r5)
            com.google.android.gms.internal.ads.zziw r0 = r4.zzb
            r0.zza(r5)
            goto L7d
        L71:
            r5 = 1
            r4.zze = r5
            boolean r5 = r4.zzf
            if (r5 == 0) goto L7d
            com.google.android.gms.internal.ads.zzmm r5 = r4.zza
            r5.zzd()
        L7d:
            boolean r5 = r4.zze
            if (r5 == 0) goto L88
            com.google.android.gms.internal.ads.zzmm r5 = r4.zza
            long r0 = r5.zza()
            goto L91
        L88:
            com.google.android.gms.internal.ads.zzlh r5 = r4.zzd
            java.util.Objects.requireNonNull(r5)
            long r0 = r5.zza()
        L91:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzix.zzb(boolean):long");
    }

    @Override // com.google.android.gms.internal.ads.zzlh
    public final zzcg zzc() {
        zzlh zzlhVar = this.zzd;
        return zzlhVar != null ? zzlhVar.zzc() : this.zza.zzc();
    }

    public final void zzd(zzmf zzmfVar) {
        if (zzmfVar == this.zzc) {
            this.zzd = null;
            this.zzc = null;
            this.zze = true;
        }
    }

    public final void zze(zzmf zzmfVar) throws zziz {
        zzlh zzlhVar;
        zzlh zzlhVarZzk = zzmfVar.zzk();
        if (zzlhVarZzk == null || zzlhVarZzk == (zzlhVar = this.zzd)) {
            return;
        }
        if (zzlhVar != null) {
            throw zziz.zzd(new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
        }
        this.zzd = zzlhVarZzk;
        this.zzc = zzmfVar;
        zzlhVarZzk.zzg(this.zza.zzc());
    }

    public final void zzf(long j) {
        this.zza.zzb(j);
    }

    @Override // com.google.android.gms.internal.ads.zzlh
    public final void zzg(zzcg zzcgVar) {
        zzlh zzlhVar = this.zzd;
        if (zzlhVar != null) {
            zzlhVar.zzg(zzcgVar);
            zzcgVar = this.zzd.zzc();
        }
        this.zza.zzg(zzcgVar);
    }

    public final void zzh() {
        this.zzf = true;
        this.zza.zzd();
    }

    public final void zzi() {
        this.zzf = false;
        this.zza.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzlh
    public final boolean zzj() {
        if (this.zze) {
            return false;
        }
        zzlh zzlhVar = this.zzd;
        Objects.requireNonNull(zzlhVar);
        return zzlhVar.zzj();
    }
}
