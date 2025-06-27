package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.MediaCodecInfo;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.os.Trace;
import android.view.Surface;
import com.google.android.exoplayer2.util.MimeTypes;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzaaw extends zzto implements zzabc {
    private static final int[] zzb = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    private static boolean zzc;
    private static boolean zzd;
    private zzdp zzA;
    private boolean zzB;
    private boolean zzC;
    private int zzD;
    private zzaba zzE;
    private zzabx zzF;
    private final Context zze;
    private final zzaby zzf;
    private final zzabu zzg;
    private final boolean zzh;
    private final zzabd zzi;
    private final zzabb zzj;
    private zzaav zzk;
    private boolean zzl;
    private boolean zzm;
    private Surface zzn;
    private zzfp zzo;
    private zzaaz zzp;
    private boolean zzq;
    private int zzr;
    private long zzs;
    private int zzt;
    private int zzu;
    private int zzv;
    private long zzw;
    private int zzx;
    private long zzy;
    private zzdp zzz;

    public zzaaw(Context context, zzte zzteVar, zztq zztqVar, long j, boolean z, Handler handler, zzabv zzabvVar, int i, float f) {
        super(2, zzteVar, zztqVar, false, 30.0f);
        Context applicationContext = context.getApplicationContext();
        this.zze = applicationContext;
        this.zzg = new zzabu(handler, zzabvVar);
        zzaaq zzaaqVarZzc = new zzaaj(applicationContext).zzc();
        if (zzaaqVarZzc.zza() == null) {
            zzaaqVarZzc.zzk(new zzabd(applicationContext, this, 0L));
        }
        this.zzf = zzaaqVarZzc;
        zzabd zzabdVarZza = zzaaqVarZzc.zza();
        zzek.zzb(zzabdVarZza);
        this.zzi = zzabdVarZza;
        this.zzj = new zzabb();
        this.zzh = "NVIDIA".equals(zzfx.zzc);
        this.zzr = 1;
        this.zzz = zzdp.zza;
        this.zzD = 0;
        this.zzA = null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0080 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0083 A[Catch: all -> 0x07ab, TRY_ENTER, TryCatch #0 {, blocks: (B:7:0x000f, B:9:0x0013, B:11:0x0021, B:515:0x07a3, B:42:0x0083, B:44:0x0089, B:47:0x0094, B:80:0x00ff, B:82:0x0105, B:507:0x078e, B:516:0x07a7), top: B:522:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:505:0x078a  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00fb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected static final boolean zzaO(java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 2926
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaaw.zzaO(java.lang.String):boolean");
    }

    private static List zzaP(Context context, zztq zztqVar, zzam zzamVar, boolean z, boolean z2) throws zztw {
        if (zzamVar.zzm == null) {
            return zzfzn.zzm();
        }
        if (zzfx.zza >= 26 && MimeTypes.VIDEO_DOLBY_VISION.equals(zzamVar.zzm) && !zzaau.zza(context)) {
            List listZzd = zzuc.zzd(zztqVar, zzamVar, z, z2);
            if (!listZzd.isEmpty()) {
                return listZzd;
            }
        }
        return zzuc.zzf(zztqVar, zzamVar, z, z2);
    }

    private final void zzaQ() {
        zzdp zzdpVar = this.zzA;
        if (zzdpVar != null) {
            this.zzg.zzt(zzdpVar);
        }
    }

    private final void zzaR() {
        Surface surface = this.zzn;
        zzaaz zzaazVar = this.zzp;
        if (surface == zzaazVar) {
            this.zzn = null;
        }
        if (zzaazVar != null) {
            zzaazVar.release();
            this.zzp = null;
        }
    }

    private final boolean zzaS(zzti zztiVar) {
        return zzfx.zza >= 23 && !zzaO(zztiVar.zza) && (!zztiVar.zzf || zzaaz.zzb(this.zze));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int zzad(com.google.android.gms.internal.ads.zzti r10, com.google.android.gms.internal.ads.zzam r11) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaaw.zzad(com.google.android.gms.internal.ads.zzti, com.google.android.gms.internal.ads.zzam):int");
    }

    protected static int zzae(zzti zztiVar, zzam zzamVar) {
        if (zzamVar.zzn == -1) {
            return zzad(zztiVar, zzamVar);
        }
        int size = zzamVar.zzo.size();
        int length = 0;
        for (int i = 0; i < size; i++) {
            length += ((byte[]) zzamVar.zzo.get(i)).length;
        }
        return zzamVar.zzn + length;
    }

    @Override // com.google.android.gms.internal.ads.zziq
    protected final void zzA() {
        if (this.zzf.zzl()) {
            this.zzf.zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzto, com.google.android.gms.internal.ads.zziq
    protected final void zzC() {
        try {
            super.zzC();
            this.zzC = false;
            if (this.zzp != null) {
                zzaR();
            }
        } catch (Throwable th) {
            this.zzC = false;
            if (this.zzp != null) {
                zzaR();
            }
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zziq
    protected final void zzD() {
        this.zzt = 0;
        zzh();
        this.zzs = SystemClock.elapsedRealtime();
        this.zzw = 0L;
        this.zzx = 0;
        this.zzi.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zziq
    protected final void zzE() {
        if (this.zzt > 0) {
            zzh();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.zzg.zzd(this.zzt, jElapsedRealtime - this.zzs);
            this.zzt = 0;
            this.zzs = jElapsedRealtime;
        }
        int i = this.zzx;
        if (i != 0) {
            this.zzg.zzr(this.zzw, i);
            this.zzw = 0L;
            this.zzx = 0;
        }
        this.zzi.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzto, com.google.android.gms.internal.ads.zziq, com.google.android.gms.internal.ads.zzmf
    public final void zzM(float f, float f2) throws zziz {
        super.zzM(f, f2);
        this.zzi.zzn(f);
        if (this.zzF != null) {
            throw null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzmf, com.google.android.gms.internal.ads.zzmh
    public final String zzU() {
        return "MediaCodecVideoRenderer";
    }

    @Override // com.google.android.gms.internal.ads.zzto, com.google.android.gms.internal.ads.zzmf
    public final void zzV(long j, long j2) throws zziz {
        super.zzV(j, j2);
        if (this.zzF == null) {
            return;
        }
        try {
            throw null;
        } catch (zzabw e) {
            throw zzi(e, e.zza, false, 7001);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzto, com.google.android.gms.internal.ads.zzmf
    public final boolean zzW() {
        if (!super.zzW()) {
            return false;
        }
        if (this.zzF == null) {
            return true;
        }
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzto, com.google.android.gms.internal.ads.zzmf
    public final boolean zzX() {
        boolean z;
        zzaaz zzaazVar;
        if (!super.zzX()) {
            z = false;
        } else {
            if (this.zzF != null) {
                throw null;
            }
            z = true;
        }
        if (!z || (((zzaazVar = this.zzp) == null || this.zzn != zzaazVar) && zzaw() != null)) {
            return this.zzi.zzo(z);
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzto
    protected final float zzZ(float f, zzam zzamVar, zzam[] zzamVarArr) {
        float fMax = -1.0f;
        for (zzam zzamVar2 : zzamVarArr) {
            float f2 = zzamVar2.zzt;
            if (f2 != -1.0f) {
                fMax = Math.max(fMax, f2);
            }
        }
        if (fMax == -1.0f) {
            return -1.0f;
        }
        return fMax * f;
    }

    @Override // com.google.android.gms.internal.ads.zzto
    protected final void zzaA(long j) {
        super.zzaA(j);
        this.zzv--;
    }

    @Override // com.google.android.gms.internal.ads.zzto
    protected final void zzaB(zzih zzihVar) throws zziz {
        this.zzv++;
        int i = zzfx.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzto
    protected final void zzaC(zzam zzamVar) throws zziz {
        zzfp zzfpVar;
        if (this.zzB && !this.zzC && !this.zzf.zzl()) {
            try {
                this.zzf.zzd(zzamVar);
                this.zzf.zzh(zzau());
                zzaba zzabaVar = this.zzE;
                if (zzabaVar != null) {
                    this.zzf.zzj(zzabaVar);
                }
                Surface surface = this.zzn;
                if (surface != null && (zzfpVar = this.zzo) != null) {
                    this.zzf.zzg(surface, zzfpVar);
                }
            } catch (zzabw e) {
                throw zzi(e, zzamVar, false, 7000);
            }
        }
        if (this.zzF != null || !this.zzf.zzl()) {
            this.zzC = true;
        } else {
            this.zzF = this.zzf.zzb();
            zzgev.zzb();
            throw null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzto
    protected final void zzaE() {
        super.zzaE();
        this.zzv = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzto
    protected final boolean zzaK(zzti zztiVar) {
        return this.zzn != null || zzaS(zztiVar);
    }

    protected final void zzaM(long j) {
        zzir zzirVar = this.zza;
        zzirVar.zzk += j;
        zzirVar.zzl++;
        this.zzw += j;
        this.zzx++;
    }

    protected final boolean zzaN(long j, boolean z) throws zziz {
        int iZzd = zzd(j);
        if (iZzd == 0) {
            return false;
        }
        if (z) {
            zzir zzirVar = this.zza;
            zzirVar.zzd += iZzd;
            zzirVar.zzf += this.zzv;
        } else {
            this.zza.zzj++;
            zzao(iZzd, this.zzv);
        }
        zzaG();
        if (this.zzF == null) {
            return true;
        }
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzto
    protected final int zzaa(zztq zztqVar, zzam zzamVar) throws zztw {
        boolean z;
        if (!zzcb.zzh(zzamVar.zzm)) {
            return 128;
        }
        int i = 1;
        int i2 = 0;
        boolean z2 = zzamVar.zzp != null;
        List listZzaP = zzaP(this.zze, zztqVar, zzamVar, z2, false);
        if (z2 && listZzaP.isEmpty()) {
            listZzaP = zzaP(this.zze, zztqVar, zzamVar, false, false);
        }
        if (!listZzaP.isEmpty()) {
            if (zzaL(zzamVar)) {
                zzti zztiVar = (zzti) listZzaP.get(0);
                boolean zZze = zztiVar.zze(zzamVar);
                if (zZze) {
                    z = true;
                } else {
                    for (int i3 = 1; i3 < listZzaP.size(); i3++) {
                        zzti zztiVar2 = (zzti) listZzaP.get(i3);
                        if (zztiVar2.zze(zzamVar)) {
                            zZze = true;
                            z = false;
                            zztiVar = zztiVar2;
                            break;
                        }
                    }
                    z = true;
                }
                int i4 = true != zZze ? 3 : 4;
                int i5 = true != zztiVar.zzf(zzamVar) ? 8 : 16;
                int i6 = true != zztiVar.zzg ? 0 : 64;
                int i7 = true != z ? 0 : 128;
                if (zzfx.zza >= 26 && MimeTypes.VIDEO_DOLBY_VISION.equals(zzamVar.zzm) && !zzaau.zza(this.zze)) {
                    i7 = 256;
                }
                if (zZze) {
                    List listZzaP2 = zzaP(this.zze, zztqVar, zzamVar, z2, true);
                    if (!listZzaP2.isEmpty()) {
                        zzti zztiVar3 = (zzti) zzuc.zzg(listZzaP2, zzamVar).get(0);
                        if (zztiVar3.zze(zzamVar) && zztiVar3.zzf(zzamVar)) {
                            i2 = 32;
                        }
                    }
                }
                return i4 | i5 | i2 | i6 | i7;
            }
            i = 2;
        }
        return i | 128;
    }

    @Override // com.google.android.gms.internal.ads.zzto
    protected final zzis zzab(zzti zztiVar, zzam zzamVar, zzam zzamVar2) {
        int i;
        int i2;
        zzis zzisVarZzb = zztiVar.zzb(zzamVar, zzamVar2);
        int i3 = zzisVarZzb.zze;
        zzaav zzaavVar = this.zzk;
        Objects.requireNonNull(zzaavVar);
        if (zzamVar2.zzr > zzaavVar.zza || zzamVar2.zzs > zzaavVar.zzb) {
            i3 |= 256;
        }
        if (zzae(zztiVar, zzamVar2) > zzaavVar.zzc) {
            i3 |= 64;
        }
        String str = zztiVar.zza;
        if (i3 != 0) {
            i2 = i3;
            i = 0;
        } else {
            i = zzisVarZzb.zzd;
            i2 = 0;
        }
        return new zzis(str, zzamVar, zzamVar2, i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzto
    protected final zzis zzac(zzlb zzlbVar) throws zziz {
        zzis zzisVarZzac = super.zzac(zzlbVar);
        zzam zzamVar = zzlbVar.zza;
        Objects.requireNonNull(zzamVar);
        this.zzg.zzf(zzamVar, zzisVarZzac);
        return zzisVarZzac;
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x00ff, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01fb  */
    @Override // com.google.android.gms.internal.ads.zzto
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final com.google.android.gms.internal.ads.zztd zzaf(com.google.android.gms.internal.ads.zzti r20, com.google.android.gms.internal.ads.zzam r21, android.media.MediaCrypto r22, float r23) {
        /*
            Method dump skipped, instructions count: 552
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaaw.zzaf(com.google.android.gms.internal.ads.zzti, com.google.android.gms.internal.ads.zzam, android.media.MediaCrypto, float):com.google.android.gms.internal.ads.zztd");
    }

    @Override // com.google.android.gms.internal.ads.zzto
    protected final List zzag(zztq zztqVar, zzam zzamVar, boolean z) throws zztw {
        return zzuc.zzg(zzaP(this.zze, zztqVar, zzamVar, false, false), zzamVar);
    }

    protected final void zzah(zztf zztfVar, int i, long j, long j2) {
        Surface surface;
        Trace.beginSection("releaseOutputBuffer");
        zztfVar.zzm(i, j2);
        Trace.endSection();
        this.zza.zze++;
        this.zzu = 0;
        if (this.zzF == null) {
            zzdp zzdpVar = this.zzz;
            if (!zzdpVar.equals(zzdp.zza) && !zzdpVar.equals(this.zzA)) {
                this.zzA = zzdpVar;
                this.zzg.zzt(zzdpVar);
            }
            if (!this.zzi.zzp() || (surface = this.zzn) == null) {
                return;
            }
            this.zzg.zzq(surface);
            this.zzq = true;
        }
    }

    protected final void zzai(zztf zztfVar, int i, long j) {
        Trace.beginSection("skipVideoBuffer");
        zztfVar.zzn(i, false);
        Trace.endSection();
        this.zza.zzf++;
    }

    @Override // com.google.android.gms.internal.ads.zzto
    protected final void zzaj(zzih zzihVar) throws zziz {
        if (this.zzm) {
            ByteBuffer byteBuffer = zzihVar.zzf;
            Objects.requireNonNull(byteBuffer);
            if (byteBuffer.remaining() >= 7) {
                byte b = byteBuffer.get();
                short s = byteBuffer.getShort();
                short s2 = byteBuffer.getShort();
                byte b2 = byteBuffer.get();
                byte b3 = byteBuffer.get();
                byteBuffer.position(0);
                if (b == -75 && s == 60 && s2 == 1 && b2 == 4) {
                    if (b3 == 0 || b3 == 1) {
                        byte[] bArr = new byte[byteBuffer.remaining()];
                        byteBuffer.get(bArr);
                        byteBuffer.position(0);
                        zztf zztfVarZzaw = zzaw();
                        Objects.requireNonNull(zztfVarZzaw);
                        Bundle bundle = new Bundle();
                        bundle.putByteArray("hdr10-plus-info", bArr);
                        zztfVarZzaw.zzp(bundle);
                    }
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzto
    protected final void zzak(Exception exc) {
        zzfe.zzd("MediaCodecVideoRenderer", "Video codec error", exc);
        this.zzg.zzs(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzto
    protected final void zzal(String str, zztd zztdVar, long j, long j2) {
        this.zzg.zza(str, j, j2);
        this.zzl = zzaO(str);
        zzti zztiVarZzay = zzay();
        Objects.requireNonNull(zztiVarZzay);
        boolean z = false;
        if (zzfx.zza >= 29 && "video/x-vnd.on2.vp9".equals(zztiVarZzay.zzb)) {
            MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArrZzh = zztiVarZzay.zzh();
            int length = codecProfileLevelArrZzh.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (codecProfileLevelArrZzh[i].profile == 16384) {
                    z = true;
                    break;
                }
                i++;
            }
        }
        this.zzm = z;
    }

    @Override // com.google.android.gms.internal.ads.zzto
    protected final void zzam(String str) {
        this.zzg.zzb(str);
    }

    @Override // com.google.android.gms.internal.ads.zzto
    protected final void zzan(zzam zzamVar, MediaFormat mediaFormat) {
        zztf zztfVarZzaw = zzaw();
        if (zztfVarZzaw != null) {
            zztfVarZzaw.zzq(this.zzr);
        }
        Objects.requireNonNull(mediaFormat);
        boolean z = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
        int integer = z ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
        int integer2 = z ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
        float f = zzamVar.zzv;
        int i = zzfx.zza;
        int i2 = zzamVar.zzu;
        if (i2 == 90 || i2 == 270) {
            f = 1.0f / f;
            int i3 = integer2;
            integer2 = integer;
            integer = i3;
        }
        this.zzz = new zzdp(integer, integer2, 0, f);
        this.zzi.zzl(zzamVar.zzt);
        if (this.zzF == null) {
            return;
        }
        zzak zzakVarZzb = zzamVar.zzb();
        zzakVarZzb.zzab(integer);
        zzakVarZzb.zzI(integer2);
        zzakVarZzb.zzV(0);
        zzakVarZzb.zzS(f);
        zzakVarZzb.zzac();
        throw null;
    }

    protected final void zzao(int i, int i2) {
        zzir zzirVar = this.zza;
        zzirVar.zzh += i;
        int i3 = i + i2;
        zzirVar.zzg += i3;
        this.zzt += i3;
        int i4 = this.zzu + i3;
        this.zzu = i4;
        zzirVar.zzi = Math.max(i4, zzirVar.zzi);
    }

    @Override // com.google.android.gms.internal.ads.zzto
    protected final void zzap() {
        this.zzi.zzf();
        if (this.zzf.zzl()) {
            this.zzf.zzh(zzau());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzto
    protected final int zzat(zzih zzihVar) {
        int i = zzfx.zza;
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzto
    protected final zzth zzax(Throwable th, zzti zztiVar) {
        return new zzaat(th, zztiVar, this.zzn);
    }

    @Override // com.google.android.gms.internal.ads.zziq, com.google.android.gms.internal.ads.zzmf
    public final void zzs() {
        this.zzi.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzto, com.google.android.gms.internal.ads.zziq
    protected final void zzw() {
        this.zzA = null;
        this.zzi.zzd();
        this.zzq = false;
        try {
            super.zzw();
        } finally {
            this.zzg.zzc(this.zza);
            this.zzg.zzt(zzdp.zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzto, com.google.android.gms.internal.ads.zziq
    protected final void zzx(boolean z, boolean z2) throws zziz {
        super.zzx(z, z2);
        zzm();
        this.zzg.zze(this.zza);
        this.zzi.zze(z2);
    }

    @Override // com.google.android.gms.internal.ads.zziq
    protected final void zzy() {
        zzabd zzabdVar = this.zzi;
        zzel zzelVarZzh = zzh();
        zzabdVar.zzk(zzelVarZzh);
        this.zzf.zzf(zzelVarZzh);
    }

    @Override // com.google.android.gms.internal.ads.zzto, com.google.android.gms.internal.ads.zziq
    protected final void zzz(long j, boolean z) throws zziz {
        if (this.zzF != null) {
            throw null;
        }
        super.zzz(j, z);
        if (this.zzf.zzl()) {
            this.zzf.zzh(zzau());
        }
        this.zzi.zzi();
        if (z) {
            this.zzi.zzc();
        }
        this.zzu = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzto
    protected final boolean zzar(long j, long j2, zztf zztfVar, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, zzam zzamVar) throws zziz {
        Objects.requireNonNull(zztfVar);
        long jZzau = j3 - zzau();
        int iZza = this.zzi.zza(j3, j, j2, zzav(), z2, this.zzj);
        if (z && !z2) {
            zzai(zztfVar, i, jZzau);
            return true;
        }
        if (this.zzn != this.zzp || this.zzf.zzl()) {
            if (this.zzF != null) {
                try {
                    throw null;
                } catch (zzabw e) {
                    throw zzi(e, e.zza, false, 7001);
                }
            }
            if (iZza == 0) {
                zzh();
                long jNanoTime = System.nanoTime();
                int i4 = zzfx.zza;
                zzah(zztfVar, i, jZzau, jNanoTime);
                zzaM(this.zzj.zzc());
                return true;
            }
            if (iZza == 1) {
                zzabb zzabbVar = this.zzj;
                long jZzd = zzabbVar.zzd();
                long jZzc = zzabbVar.zzc();
                int i5 = zzfx.zza;
                if (jZzd == this.zzy) {
                    zzai(zztfVar, i, jZzau);
                } else {
                    zzah(zztfVar, i, jZzau, jZzd);
                }
                zzaM(jZzc);
                this.zzy = jZzd;
                return true;
            }
            if (iZza == 2) {
                Trace.beginSection("dropVideoBuffer");
                zztfVar.zzn(i, false);
                Trace.endSection();
                zzao(0, 1);
                zzaM(this.zzj.zzc());
                return true;
            }
            if (iZza == 3) {
                zzai(zztfVar, i, jZzau);
                zzaM(this.zzj.zzc());
                return true;
            }
        } else if (this.zzj.zzc() < 30000) {
            zzai(zztfVar, i, jZzau);
            zzaM(this.zzj.zzc());
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v12, types: [android.view.Surface] */
    @Override // com.google.android.gms.internal.ads.zziq, com.google.android.gms.internal.ads.zzma
    public final void zzt(int i, Object obj) throws zziz {
        Surface surface;
        if (i != 1) {
            if (i == 7) {
                Objects.requireNonNull(obj);
                zzaba zzabaVar = (zzaba) obj;
                this.zzE = zzabaVar;
                this.zzf.zzj(zzabaVar);
                return;
            }
            if (i == 10) {
                Objects.requireNonNull(obj);
                int iIntValue = ((Integer) obj).intValue();
                if (this.zzD != iIntValue) {
                    this.zzD = iIntValue;
                    return;
                }
                return;
            }
            if (i == 4) {
                Objects.requireNonNull(obj);
                int iIntValue2 = ((Integer) obj).intValue();
                this.zzr = iIntValue2;
                zztf zztfVarZzaw = zzaw();
                if (zztfVarZzaw != null) {
                    zztfVarZzaw.zzq(iIntValue2);
                    return;
                }
                return;
            }
            if (i == 5) {
                zzabd zzabdVar = this.zzi;
                Objects.requireNonNull(obj);
                zzabdVar.zzj(((Integer) obj).intValue());
                return;
            }
            if (i == 13) {
                Objects.requireNonNull(obj);
                this.zzf.zzi((List) obj);
                this.zzB = true;
                return;
            } else {
                if (i != 14) {
                    return;
                }
                Objects.requireNonNull(obj);
                this.zzo = (zzfp) obj;
                if (this.zzf.zzl()) {
                    zzfp zzfpVar = this.zzo;
                    Objects.requireNonNull(zzfpVar);
                    if (zzfpVar.zzb() == 0 || zzfpVar.zza() == 0 || (surface = this.zzn) == null) {
                        return;
                    }
                    this.zzf.zzg(surface, zzfpVar);
                    return;
                }
                return;
            }
        }
        zzaaz zzaazVarZza = obj instanceof Surface ? (Surface) obj : null;
        if (zzaazVarZza == null) {
            zzaaz zzaazVar = this.zzp;
            if (zzaazVar != null) {
                zzaazVarZza = zzaazVar;
            } else {
                zzti zztiVarZzay = zzay();
                if (zztiVarZzay != null && zzaS(zztiVarZzay)) {
                    zzaazVarZza = zzaaz.zza(this.zze, zztiVarZzay.zzf);
                    this.zzp = zzaazVarZza;
                }
            }
        }
        if (this.zzn == zzaazVarZza) {
            if (zzaazVarZza == null || zzaazVarZza == this.zzp) {
                return;
            }
            zzaQ();
            Surface surface2 = this.zzn;
            if (surface2 == null || !this.zzq) {
                return;
            }
            this.zzg.zzq(surface2);
            return;
        }
        this.zzn = zzaazVarZza;
        this.zzi.zzm(zzaazVarZza);
        this.zzq = false;
        int iZzcU = zzcU();
        zztf zztfVarZzaw2 = zzaw();
        zzaaz zzaazVar2 = zzaazVarZza;
        if (zztfVarZzaw2 != null) {
            zzaazVar2 = zzaazVarZza;
            if (!this.zzf.zzl()) {
                zzaaz zzaazVar3 = zzaazVarZza;
                if (zzfx.zza < 23) {
                    zzaD();
                    zzaz();
                    zzaazVar2 = zzaazVar3;
                } else {
                    if (zzaazVarZza != null) {
                        zzaazVar3 = zzaazVarZza;
                        if (!this.zzl) {
                            zztfVarZzaw2.zzo(zzaazVarZza);
                            zzaazVar2 = zzaazVarZza;
                        }
                    } else {
                        zzaazVar3 = null;
                    }
                    zzaD();
                    zzaz();
                    zzaazVar2 = zzaazVar3;
                }
            }
        }
        if (zzaazVar2 == null || zzaazVar2 == this.zzp) {
            this.zzA = null;
            if (this.zzf.zzl()) {
                this.zzf.zzc();
                return;
            }
            return;
        }
        zzaQ();
        if (iZzcU == 2) {
            this.zzi.zzc();
        }
        if (this.zzf.zzl()) {
            this.zzf.zzg(zzaazVar2, zzfp.zza);
        }
    }
}
