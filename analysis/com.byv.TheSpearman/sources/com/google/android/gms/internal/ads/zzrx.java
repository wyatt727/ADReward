package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import com.google.android.exoplayer2.util.MimeTypes;
import com.json.mediationsdk.utils.IronSourceConstants;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzrx extends zzto implements zzlh {
    private final Context zzb;
    private final zzqf zzc;
    private final zzqn zzd;
    private int zze;
    private boolean zzf;
    private boolean zzg;
    private zzam zzh;
    private zzam zzi;
    private long zzj;
    private boolean zzk;
    private boolean zzl;
    private zzme zzm;
    private boolean zzn;

    public zzrx(Context context, zzte zzteVar, zztq zztqVar, boolean z, Handler handler, zzqg zzqgVar, zzqn zzqnVar) {
        super(1, zzteVar, zztqVar, false, 44100.0f);
        this.zzb = context.getApplicationContext();
        this.zzd = zzqnVar;
        this.zzc = new zzqf(handler, zzqgVar);
        zzqnVar.zzq(new zzrw(this, null));
    }

    private final int zzaM(zzti zztiVar, zzam zzamVar) {
        if (!"OMX.google.raw.decoder".equals(zztiVar.zza) || zzfx.zza >= 24 || (zzfx.zza == 23 && zzfx.zzM(this.zzb))) {
            return zzamVar.zzn;
        }
        return -1;
    }

    private static List zzaN(zztq zztqVar, zzam zzamVar, boolean z, zzqn zzqnVar) throws zztw {
        zzti zztiVarZzb;
        return zzamVar.zzm == null ? zzfzn.zzm() : (!zzqnVar.zzA(zzamVar) || (zztiVarZzb = zzuc.zzb()) == null) ? zzuc.zzf(zztqVar, zzamVar, false, false) : zzfzn.zzn(zztiVarZzb);
    }

    private final void zzaO() {
        long jZzb = this.zzd.zzb(zzW());
        if (jZzb != Long.MIN_VALUE) {
            if (!this.zzk) {
                jZzb = Math.max(this.zzj, jZzb);
            }
            this.zzj = jZzb;
            this.zzk = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zziq
    protected final void zzA() {
        this.zzd.zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzto, com.google.android.gms.internal.ads.zziq
    protected final void zzC() {
        this.zzn = false;
        try {
            super.zzC();
            if (this.zzl) {
                this.zzl = false;
                this.zzd.zzl();
            }
        } catch (Throwable th) {
            if (this.zzl) {
                this.zzl = false;
                this.zzd.zzl();
            }
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zziq
    protected final void zzD() {
        this.zzd.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zziq
    protected final void zzE() {
        zzaO();
        this.zzd.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzmf, com.google.android.gms.internal.ads.zzmh
    public final String zzU() {
        return "MediaCodecAudioRenderer";
    }

    @Override // com.google.android.gms.internal.ads.zzto, com.google.android.gms.internal.ads.zzmf
    public final boolean zzW() {
        return super.zzW() && this.zzd.zzz();
    }

    @Override // com.google.android.gms.internal.ads.zzto, com.google.android.gms.internal.ads.zzmf
    public final boolean zzX() {
        return this.zzd.zzy() || super.zzX();
    }

    @Override // com.google.android.gms.internal.ads.zzto
    protected final float zzZ(float f, zzam zzamVar, zzam[] zzamVarArr) {
        int iMax = -1;
        for (zzam zzamVar2 : zzamVarArr) {
            int i = zzamVar2.zzA;
            if (i != -1) {
                iMax = Math.max(iMax, i);
            }
        }
        if (iMax == -1) {
            return -1.0f;
        }
        return iMax * f;
    }

    @Override // com.google.android.gms.internal.ads.zzlh
    public final long zza() {
        if (zzcU() == 2) {
            zzaO();
        }
        return this.zzj;
    }

    @Override // com.google.android.gms.internal.ads.zzto
    protected final int zzaa(zztq zztqVar, zzam zzamVar) throws zztw {
        int i;
        boolean z;
        if (!zzcb.zzg(zzamVar.zzm)) {
            return 128;
        }
        int i2 = zzfx.zza;
        int i3 = zzamVar.zzG;
        boolean zZzaL = zzaL(zzamVar);
        int i4 = 1;
        if (!zZzaL || (i3 != 0 && zzuc.zzb() == null)) {
            i = 0;
        } else {
            zzps zzpsVarZzd = this.zzd.zzd(zzamVar);
            if (zzpsVarZzd.zzb) {
                i = true != zzpsVarZzd.zzc ? 512 : 1536;
                if (zzpsVarZzd.zzd) {
                    i |= 2048;
                }
            } else {
                i = 0;
            }
            if (this.zzd.zzA(zzamVar)) {
                return i | 172;
            }
        }
        if ((!"audio/raw".equals(zzamVar.zzm) || this.zzd.zzA(zzamVar)) && this.zzd.zzA(zzfx.zzz(2, zzamVar.zzz, zzamVar.zzA))) {
            List listZzaN = zzaN(zztqVar, zzamVar, false, this.zzd);
            if (!listZzaN.isEmpty()) {
                if (zZzaL) {
                    zzti zztiVar = (zzti) listZzaN.get(0);
                    boolean zZze = zztiVar.zze(zzamVar);
                    if (zZze) {
                        z = true;
                    } else {
                        for (int i5 = 1; i5 < listZzaN.size(); i5++) {
                            zzti zztiVar2 = (zzti) listZzaN.get(i5);
                            if (zztiVar2.zze(zzamVar)) {
                                z = false;
                                zZze = true;
                                zztiVar = zztiVar2;
                                break;
                            }
                        }
                        z = true;
                    }
                    int i6 = true != zZze ? 3 : 4;
                    int i7 = 8;
                    if (zZze && zztiVar.zzf(zzamVar)) {
                        i7 = 16;
                    }
                    return i6 | i7 | 32 | (true != zztiVar.zzg ? 0 : 64) | (true != z ? 0 : 128) | i;
                }
                i4 = 2;
            }
        }
        return i4 | 128;
    }

    @Override // com.google.android.gms.internal.ads.zzto
    protected final zzis zzab(zzti zztiVar, zzam zzamVar, zzam zzamVar2) {
        int i;
        int i2;
        zzis zzisVarZzb = zztiVar.zzb(zzamVar, zzamVar2);
        int i3 = zzisVarZzb.zze;
        if (zzaJ(zzamVar2)) {
            i3 |= 32768;
        }
        if (zzaM(zztiVar, zzamVar2) > this.zze) {
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
    protected final zztd zzaf(zzti zztiVar, zzam zzamVar, MediaCrypto mediaCrypto, float f) {
        zzam[] zzamVarArrZzT = zzT();
        int length = zzamVarArrZzT.length;
        int iZzaM = zzaM(zztiVar, zzamVar);
        if (length != 1) {
            for (zzam zzamVar2 : zzamVarArrZzT) {
                if (zztiVar.zzb(zzamVar, zzamVar2).zzd != 0) {
                    iZzaM = Math.max(iZzaM, zzaM(zztiVar, zzamVar2));
                }
            }
        }
        this.zze = iZzaM;
        this.zzf = zzfx.zza < 24 && "OMX.SEC.aac.dec".equals(zztiVar.zza) && "samsung".equals(zzfx.zzc) && (zzfx.zzb.startsWith("zeroflte") || zzfx.zzb.startsWith("herolte") || zzfx.zzb.startsWith("heroqlte"));
        String str = zztiVar.zza;
        this.zzg = str.equals("OMX.google.opus.decoder") || str.equals("c2.android.opus.decoder") || str.equals("OMX.google.vorbis.decoder") || str.equals("c2.android.vorbis.decoder");
        String str2 = zztiVar.zzc;
        int i = this.zze;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str2);
        mediaFormat.setInteger("channel-count", zzamVar.zzz);
        mediaFormat.setInteger("sample-rate", zzamVar.zzA);
        zzfh.zzb(mediaFormat, zzamVar.zzo);
        zzfh.zza(mediaFormat, "max-input-size", i);
        if (zzfx.zza >= 23) {
            mediaFormat.setInteger(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, 0);
            if (f != -1.0f && (zzfx.zza != 23 || (!"ZTE B2017G".equals(zzfx.zzd) && !"AXON 7 mini".equals(zzfx.zzd)))) {
                mediaFormat.setFloat("operating-rate", f);
            }
        }
        if (zzfx.zza <= 28 && MimeTypes.AUDIO_AC4.equals(zzamVar.zzm)) {
            mediaFormat.setInteger("ac4-is-sync", 1);
        }
        if (zzfx.zza >= 24 && this.zzd.zza(zzfx.zzz(4, zzamVar.zzz, zzamVar.zzA)) == 2) {
            mediaFormat.setInteger("pcm-encoding", 4);
        }
        if (zzfx.zza >= 32) {
            mediaFormat.setInteger("max-output-channel-count", 99);
        }
        this.zzi = (!"audio/raw".equals(zztiVar.zzb) || "audio/raw".equals(zzamVar.zzm)) ? null : zzamVar;
        return zztd.zza(zztiVar, mediaFormat, zzamVar, null);
    }

    @Override // com.google.android.gms.internal.ads.zzto
    protected final List zzag(zztq zztqVar, zzam zzamVar, boolean z) throws zztw {
        return zzuc.zzg(zzaN(zztqVar, zzamVar, false, this.zzd), zzamVar);
    }

    @Override // com.google.android.gms.internal.ads.zzto
    protected final void zzaj(zzih zzihVar) {
        zzam zzamVar;
        if (zzfx.zza < 29 || (zzamVar = zzihVar.zza) == null || !Objects.equals(zzamVar.zzm, "audio/opus") || !zzaI()) {
            return;
        }
        ByteBuffer byteBuffer = zzihVar.zzf;
        Objects.requireNonNull(byteBuffer);
        zzam zzamVar2 = zzihVar.zza;
        Objects.requireNonNull(zzamVar2);
        if (byteBuffer.remaining() == 8) {
            this.zzd.zzr(zzamVar2.zzC, (int) ((byteBuffer.order(ByteOrder.LITTLE_ENDIAN).getLong() * 48000) / 1000000000));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzto
    protected final void zzak(Exception exc) {
        zzfe.zzd("MediaCodecAudioRenderer", "Audio codec error", exc);
        this.zzc.zza(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzto
    protected final void zzal(String str, zztd zztdVar, long j, long j2) {
        this.zzc.zze(str, j, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzto
    protected final void zzam(String str) {
        this.zzc.zzf(str);
    }

    protected final void zzao() {
        this.zzk = true;
    }

    @Override // com.google.android.gms.internal.ads.zzto
    protected final void zzap() {
        this.zzd.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzto
    protected final void zzaq() throws zziz {
        try {
            this.zzd.zzj();
        } catch (zzqm e) {
            throw zzi(e, e.zzc, e.zzb, true != zzaI() ? 5002 : IronSourceConstants.errorCode_loadInProgress);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzto
    protected final boolean zzas(zzam zzamVar) {
        zzm();
        return this.zzd.zzA(zzamVar);
    }

    @Override // com.google.android.gms.internal.ads.zzlh
    public final zzcg zzc() {
        return this.zzd.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzlh
    public final void zzg(zzcg zzcgVar) {
        this.zzd.zzs(zzcgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzlh
    public final boolean zzj() {
        boolean z = this.zzn;
        this.zzn = false;
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zziq, com.google.android.gms.internal.ads.zzmf
    public final zzlh zzk() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zziq, com.google.android.gms.internal.ads.zzma
    public final void zzt(int i, Object obj) throws zziz {
        if (i == 2) {
            zzqn zzqnVar = this.zzd;
            Objects.requireNonNull(obj);
            zzqnVar.zzw(((Float) obj).floatValue());
            return;
        }
        if (i == 3) {
            zzk zzkVar = (zzk) obj;
            zzqn zzqnVar2 = this.zzd;
            Objects.requireNonNull(zzkVar);
            zzqnVar2.zzm(zzkVar);
            return;
        }
        if (i == 6) {
            zzl zzlVar = (zzl) obj;
            zzqn zzqnVar3 = this.zzd;
            Objects.requireNonNull(zzlVar);
            zzqnVar3.zzo(zzlVar);
            return;
        }
        switch (i) {
            case 9:
                zzqn zzqnVar4 = this.zzd;
                Objects.requireNonNull(obj);
                zzqnVar4.zzv(((Boolean) obj).booleanValue());
                break;
            case 10:
                zzqn zzqnVar5 = this.zzd;
                Objects.requireNonNull(obj);
                zzqnVar5.zzn(((Integer) obj).intValue());
                break;
            case 11:
                this.zzm = (zzme) obj;
                break;
            case 12:
                if (zzfx.zza >= 23) {
                    zzru.zza(this.zzd, obj);
                    break;
                }
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzto, com.google.android.gms.internal.ads.zziq
    protected final void zzw() {
        this.zzl = true;
        this.zzh = null;
        try {
            this.zzd.zzf();
            super.zzw();
        } catch (Throwable th) {
            super.zzw();
            throw th;
        } finally {
            this.zzc.zzg(this.zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzto, com.google.android.gms.internal.ads.zziq
    protected final void zzx(boolean z, boolean z2) throws zziz {
        super.zzx(z, z2);
        this.zzc.zzh(this.zza);
        zzm();
        this.zzd.zzt(zzn());
        this.zzd.zzp(zzh());
    }

    @Override // com.google.android.gms.internal.ads.zzto, com.google.android.gms.internal.ads.zziq
    protected final void zzz(long j, boolean z) throws zziz {
        super.zzz(j, z);
        this.zzd.zzf();
        this.zzj = j;
        this.zzn = false;
        this.zzk = true;
    }

    @Override // com.google.android.gms.internal.ads.zzto
    protected final zzis zzac(zzlb zzlbVar) throws zziz {
        zzam zzamVar = zzlbVar.zza;
        Objects.requireNonNull(zzamVar);
        this.zzh = zzamVar;
        zzis zzisVarZzac = super.zzac(zzlbVar);
        this.zzc.zzi(zzamVar, zzisVarZzac);
        return zzisVarZzac;
    }

    @Override // com.google.android.gms.internal.ads.zzto
    protected final boolean zzar(long j, long j2, zztf zztfVar, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, zzam zzamVar) throws zziz {
        Objects.requireNonNull(byteBuffer);
        if (this.zzi != null && (i2 & 2) != 0) {
            Objects.requireNonNull(zztfVar);
            zztfVar.zzn(i, false);
            return true;
        }
        if (z) {
            if (zztfVar != null) {
                zztfVar.zzn(i, false);
            }
            this.zza.zzf += i3;
            this.zzd.zzg();
            return true;
        }
        try {
            if (!this.zzd.zzx(byteBuffer, j3, i3)) {
                return false;
            }
            if (zztfVar != null) {
                zztfVar.zzn(i, false);
            }
            this.zza.zze += i3;
            return true;
        } catch (zzqj e) {
            zzam zzamVar2 = this.zzh;
            if (zzaI()) {
                zzm();
            }
            throw zzi(e, zzamVar2, e.zzb, 5001);
        } catch (zzqm e2) {
            if (zzaI()) {
                zzm();
            }
            throw zzi(e2, zzamVar, e2.zzb, 5002);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzto
    protected final void zzan(zzam zzamVar, MediaFormat mediaFormat) throws zziz {
        int[] iArr;
        int i;
        zzam zzamVar2 = this.zzi;
        int[] iArr2 = null;
        if (zzamVar2 != null) {
            zzamVar = zzamVar2;
        } else if (zzaw() != null) {
            Objects.requireNonNull(mediaFormat);
            int iZzl = "audio/raw".equals(zzamVar.zzm) ? zzamVar.zzB : (zzfx.zza < 24 || !mediaFormat.containsKey("pcm-encoding")) ? mediaFormat.containsKey("v-bits-per-sample") ? zzfx.zzl(mediaFormat.getInteger("v-bits-per-sample")) : 2 : mediaFormat.getInteger("pcm-encoding");
            zzak zzakVar = new zzak();
            zzakVar.zzW("audio/raw");
            zzakVar.zzQ(iZzl);
            zzakVar.zzF(zzamVar.zzC);
            zzakVar.zzG(zzamVar.zzD);
            zzakVar.zzP(zzamVar.zzk);
            zzakVar.zzK(zzamVar.zzb);
            zzakVar.zzM(zzamVar.zzc);
            zzakVar.zzN(zzamVar.zzd);
            zzakVar.zzY(zzamVar.zze);
            zzakVar.zzU(zzamVar.zzf);
            zzakVar.zzy(mediaFormat.getInteger("channel-count"));
            zzakVar.zzX(mediaFormat.getInteger("sample-rate"));
            zzam zzamVarZzac = zzakVar.zzac();
            if (this.zzf && zzamVarZzac.zzz == 6 && (i = zzamVar.zzz) < 6) {
                iArr2 = new int[i];
                for (int i2 = 0; i2 < zzamVar.zzz; i2++) {
                    iArr2[i2] = i2;
                }
            } else if (this.zzg) {
                int i3 = zzamVarZzac.zzz;
                if (i3 == 3) {
                    iArr = new int[]{0, 2, 1};
                } else if (i3 == 5) {
                    iArr = new int[]{0, 2, 1, 3, 4};
                } else if (i3 == 6) {
                    iArr = new int[]{0, 2, 1, 5, 3, 4};
                } else if (i3 == 7) {
                    iArr = new int[]{0, 2, 1, 6, 5, 3, 4};
                } else if (i3 == 8) {
                    iArr = new int[]{0, 2, 1, 7, 5, 6, 3, 4};
                }
                iArr2 = iArr;
            }
            zzamVar = zzamVarZzac;
        }
        try {
            if (zzfx.zza >= 29) {
                if (zzaI()) {
                    zzm();
                }
                zzek.zzf(zzfx.zza >= 29);
            }
            this.zzd.zze(zzamVar, 0, iArr2);
        } catch (zzqi e) {
            throw zzi(e, e.zza, false, 5001);
        }
    }
}
