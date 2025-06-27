package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzcfe extends zzcey implements zzhy {
    private String zzd;
    private final zzcdm zze;
    private boolean zzf;
    private final zzcfd zzg;
    private final zzcej zzh;
    private ByteBuffer zzi;
    private boolean zzj;
    private final Object zzk;
    private final String zzl;
    private final int zzm;
    private boolean zzn;

    public zzcfe(zzcdn zzcdnVar, zzcdm zzcdmVar) {
        super(zzcdnVar);
        this.zze = zzcdmVar;
        this.zzg = new zzcfd();
        this.zzh = new zzcej();
        this.zzk = new Object();
        this.zzl = (String) zzfwm.zzd(zzcdnVar != null ? zzcdnVar.zzr() : null).zzb("");
        this.zzm = zzcdnVar != null ? zzcdnVar.zzf() : 0;
    }

    protected static final String zzm(String str) {
        return "cache:".concat(String.valueOf(com.google.android.gms.ads.internal.util.client.zzf.zzf(str)));
    }

    private final void zzv() {
        int iZza = (int) this.zzg.zza();
        int iZza2 = (int) this.zzh.zza(this.zzi);
        int iPosition = this.zzi.position();
        int iRound = Math.round(iZza2 * (iPosition / iZza));
        int iZzs = zzcde.zzs();
        int iZzu = zzcde.zzu();
        String str = this.zzd;
        zzn(str, zzm(str), iPosition, iZza, iRound, iZza2, iRound > 0, iZzs, iZzu);
    }

    @Override // com.google.android.gms.internal.ads.zzhy
    public final void zza(zzgv zzgvVar, zzhb zzhbVar, boolean z, int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzhy
    public final void zzb(zzgv zzgvVar, zzhb zzhbVar, boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzhy
    public final void zzc(zzgv zzgvVar, zzhb zzhbVar, boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzhy
    public final void zzd(zzgv zzgvVar, zzhb zzhbVar, boolean z) {
        if (zzgvVar instanceof zzhj) {
            this.zzg.zzb((zzhj) zzgvVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcey
    public final void zzf() {
        this.zzf = true;
    }

    public final String zzi() {
        return this.zzd;
    }

    public final ByteBuffer zzk() {
        synchronized (this.zzk) {
            ByteBuffer byteBuffer = this.zzi;
            if (byteBuffer != null && !this.zzj) {
                byteBuffer.flip();
                this.zzj = true;
            }
            this.zzf = true;
        }
        return this.zzi;
    }

    public final boolean zzl() {
        return this.zzn;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x00ae, code lost:
    
        r21.zzn = true;
        zzj(r22, r4, (int) r21.zzh.zza(r21.zzi));
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00df, code lost:
    
        return true;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:? -> B:45:0x0149). Please report as a decompilation issue!!! */
    @Override // com.google.android.gms.internal.ads.zzcey
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zzt(java.lang.String r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 406
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcfe.zzt(java.lang.String):boolean");
    }
}
