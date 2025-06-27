package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.SystemClock;
import android.os.Trace;
import com.json.t2;
import com.my.target.ads.Reward;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public abstract class zzto extends zziq {
    private static final byte[] zzb = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};
    private boolean zzA;
    private boolean zzB;
    private boolean zzC;
    private boolean zzD;
    private boolean zzE;
    private boolean zzF;
    private long zzG;
    private int zzH;
    private int zzI;
    private ByteBuffer zzJ;
    private boolean zzK;
    private boolean zzL;
    private boolean zzM;
    private boolean zzN;
    private boolean zzO;
    private boolean zzP;
    private int zzQ;
    private int zzR;
    private int zzS;
    private boolean zzT;
    private boolean zzU;
    private boolean zzV;
    private long zzW;
    private long zzX;
    private boolean zzY;
    private boolean zzZ;
    protected zzir zza;
    private boolean zzaa;
    private zztn zzab;
    private long zzac;
    private boolean zzad;
    private zzsn zzae;
    private zzsn zzaf;
    private final zzte zzc;
    private final zztq zzd;
    private final float zze;
    private final zzih zzf;
    private final zzih zzg;
    private final zzih zzh;
    private final zztb zzi;
    private final MediaCodec.BufferInfo zzj;
    private final ArrayDeque zzk;
    private final zzry zzl;
    private zzam zzm;
    private zzam zzn;
    private MediaCrypto zzo;
    private long zzp;
    private float zzq;
    private zztf zzr;
    private zzam zzs;
    private MediaFormat zzt;
    private boolean zzu;
    private float zzv;
    private ArrayDeque zzw;
    private zztm zzx;
    private zzti zzy;
    private int zzz;

    public zzto(int i, zzte zzteVar, zztq zztqVar, boolean z, float f) {
        super(i);
        this.zzc = zzteVar;
        Objects.requireNonNull(zztqVar);
        this.zzd = zztqVar;
        this.zze = f;
        this.zzf = new zzih(0, 0);
        this.zzg = new zzih(0, 0);
        this.zzh = new zzih(2, 0);
        zztb zztbVar = new zztb();
        this.zzi = zztbVar;
        this.zzj = new MediaCodec.BufferInfo();
        this.zzq = 1.0f;
        this.zzp = -9223372036854775807L;
        this.zzk = new ArrayDeque();
        this.zzab = zztn.zza;
        zztbVar.zzi(0);
        zztbVar.zzc.order(ByteOrder.nativeOrder());
        this.zzl = new zzry();
        this.zzv = -1.0f;
        this.zzz = 0;
        this.zzQ = 0;
        this.zzH = -1;
        this.zzI = -1;
        this.zzG = -9223372036854775807L;
        this.zzW = -9223372036854775807L;
        this.zzX = -9223372036854775807L;
        this.zzac = -9223372036854775807L;
        this.zzR = 0;
        this.zzS = 0;
        this.zza = new zzir();
    }

    protected static boolean zzaL(zzam zzamVar) {
        return zzamVar.zzG == 0;
    }

    private final void zzaM() {
        this.zzH = -1;
        this.zzg.zzc = null;
    }

    private final void zzaN() {
        this.zzI = -1;
        this.zzJ = null;
    }

    private final void zzaO(zztn zztnVar) {
        this.zzab = zztnVar;
        if (zztnVar.zzd != -9223372036854775807L) {
            this.zzad = true;
        }
    }

    private final void zzaP() throws zziz {
        zzsn zzsnVar = this.zzaf;
        Objects.requireNonNull(zzsnVar);
        this.zzae = zzsnVar;
        this.zzR = 0;
        this.zzS = 0;
    }

    private final boolean zzaQ() throws zziz {
        if (this.zzT) {
            this.zzR = 1;
            if (this.zzB) {
                this.zzS = 3;
                return false;
            }
            this.zzS = 2;
        } else {
            zzaP();
        }
        return true;
    }

    private final boolean zzaR() throws zziz {
        zztf zztfVar = this.zzr;
        if (zztfVar == null || this.zzR == 2 || this.zzY) {
            return false;
        }
        if (this.zzH < 0) {
            int iZza = zztfVar.zza();
            this.zzH = iZza;
            if (iZza < 0) {
                return false;
            }
            this.zzg.zzc = zztfVar.zzf(iZza);
            this.zzg.zzb();
        }
        if (this.zzR == 1) {
            if (!this.zzF) {
                this.zzU = true;
                zztfVar.zzj(this.zzH, 0, 0, 0L, 4);
                zzaM();
            }
            this.zzR = 2;
            return false;
        }
        if (this.zzD) {
            this.zzD = false;
            ByteBuffer byteBuffer = this.zzg.zzc;
            Objects.requireNonNull(byteBuffer);
            byteBuffer.put(zzb);
            zztfVar.zzj(this.zzH, 0, 38, 0L, 0);
            zzaM();
            this.zzT = true;
            return true;
        }
        if (this.zzQ == 1) {
            int i = 0;
            while (true) {
                zzam zzamVar = this.zzs;
                Objects.requireNonNull(zzamVar);
                if (i >= zzamVar.zzo.size()) {
                    break;
                }
                byte[] bArr = (byte[]) this.zzs.zzo.get(i);
                ByteBuffer byteBuffer2 = this.zzg.zzc;
                Objects.requireNonNull(byteBuffer2);
                byteBuffer2.put(bArr);
                i++;
            }
            this.zzQ = 2;
        }
        ByteBuffer byteBuffer3 = this.zzg.zzc;
        Objects.requireNonNull(byteBuffer3);
        int iPosition = byteBuffer3.position();
        zzlb zzlbVarZzcX = zzcX();
        try {
            int iZzcV = zzcV(zzlbVarZzcX, this.zzg, 0);
            if (iZzcV == -3) {
                if (zzQ()) {
                    this.zzX = this.zzW;
                }
                return false;
            }
            if (iZzcV == -5) {
                if (this.zzQ == 2) {
                    this.zzg.zzb();
                    this.zzQ = 1;
                }
                zzac(zzlbVarZzcX);
                return true;
            }
            zzih zzihVar = this.zzg;
            if (zzihVar.zzf()) {
                this.zzX = this.zzW;
                if (this.zzQ == 2) {
                    zzihVar.zzb();
                    this.zzQ = 1;
                }
                this.zzY = true;
                if (!this.zzT) {
                    zzao();
                    return false;
                }
                try {
                    if (!this.zzF) {
                        this.zzU = true;
                        zztfVar.zzj(this.zzH, 0, 0, 0L, 4);
                        zzaM();
                    }
                    return false;
                } catch (MediaCodec.CryptoException e) {
                    throw zzi(e, this.zzm, false, zzfx.zzj(e.getErrorCode()));
                }
            }
            if (!this.zzT && !zzihVar.zzg()) {
                zzihVar.zzb();
                if (this.zzQ == 2) {
                    this.zzQ = 1;
                }
                return true;
            }
            boolean zZzk = zzihVar.zzk();
            if (zZzk) {
                zzihVar.zzb.zzb(iPosition);
            }
            long j = this.zzg.zze;
            if (this.zzaa) {
                if (this.zzk.isEmpty()) {
                    zzfu zzfuVar = this.zzab.zze;
                    zzam zzamVar2 = this.zzm;
                    Objects.requireNonNull(zzamVar2);
                    zzfuVar.zzd(j, zzamVar2);
                } else {
                    zzfu zzfuVar2 = ((zztn) this.zzk.peekLast()).zze;
                    zzam zzamVar3 = this.zzm;
                    Objects.requireNonNull(zzamVar3);
                    zzfuVar2.zzd(j, zzamVar3);
                }
                this.zzaa = false;
            }
            long jMax = Math.max(this.zzW, j);
            this.zzW = jMax;
            if (zzQ() || this.zzg.zzh()) {
                this.zzX = jMax;
            }
            this.zzg.zzj();
            zzih zzihVar2 = this.zzg;
            if (zzihVar2.zze()) {
                zzaj(zzihVar2);
            }
            zzaB(this.zzg);
            zzat(this.zzg);
            try {
                if (zZzk) {
                    zztfVar.zzk(this.zzH, 0, this.zzg.zzb, j, 0);
                } else {
                    int i2 = this.zzH;
                    ByteBuffer byteBuffer4 = this.zzg.zzc;
                    Objects.requireNonNull(byteBuffer4);
                    zztfVar.zzj(i2, 0, byteBuffer4.limit(), j, 0);
                }
                zzaM();
                this.zzT = true;
                this.zzQ = 0;
                this.zza.zzc++;
                return true;
            } catch (MediaCodec.CryptoException e2) {
                throw zzi(e2, this.zzm, false, zzfx.zzj(e2.getErrorCode()));
            }
        } catch (zzig e3) {
            zzak(e3);
            zzaU(0);
            zzah();
            return true;
        }
    }

    private final boolean zzaS() {
        return this.zzI >= 0;
    }

    private final boolean zzaT(long j, long j2) {
        if (j2 >= j) {
            return false;
        }
        zzam zzamVar = this.zzn;
        if (zzamVar == null || !Objects.equals(zzamVar.zzm, "audio/opus")) {
            return true;
        }
        return !zzaeb.zzf(j, j2);
    }

    private final boolean zzaU(int i) throws zziz {
        zzih zzihVar = this.zzf;
        zzlb zzlbVarZzcX = zzcX();
        zzihVar.zzb();
        int iZzcV = zzcV(zzlbVarZzcX, this.zzf, i | 4);
        if (iZzcV == -5) {
            zzac(zzlbVarZzcX);
            return true;
        }
        if (iZzcV != -4 || !this.zzf.zzf()) {
            return false;
        }
        this.zzY = true;
        zzao();
        return false;
    }

    private final boolean zzaV(long j) {
        if (this.zzp == -9223372036854775807L) {
            return true;
        }
        zzh();
        return SystemClock.elapsedRealtime() - j < this.zzp;
    }

    private final boolean zzaW(zzam zzamVar) throws zziz {
        if (zzfx.zza >= 23 && this.zzr != null && this.zzS != 3 && zzcU() != 0) {
            float f = this.zzq;
            Objects.requireNonNull(zzamVar);
            float fZzZ = zzZ(f, zzamVar, zzT());
            float f2 = this.zzv;
            if (f2 != fZzZ) {
                if (fZzZ == -1.0f) {
                    zzae();
                    return false;
                }
                if (f2 != -1.0f || fZzZ > this.zze) {
                    Bundle bundle = new Bundle();
                    bundle.putFloat("operating-rate", fZzZ);
                    zztf zztfVar = this.zzr;
                    Objects.requireNonNull(zztfVar);
                    zztfVar.zzp(bundle);
                    this.zzv = fZzZ;
                }
            }
        }
        return true;
    }

    private final void zzad() {
        this.zzO = false;
        this.zzi.zzb();
        this.zzh.zzb();
        this.zzN = false;
        this.zzM = false;
        this.zzl.zzb();
    }

    private final void zzae() throws zziz {
        if (this.zzT) {
            this.zzR = 1;
            this.zzS = 3;
        } else {
            zzaD();
            zzaz();
        }
    }

    private final void zzah() {
        try {
            zztf zztfVar = this.zzr;
            zzek.zzb(zztfVar);
            zztfVar.zzi();
        } finally {
            zzaE();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void zzai(zzti zztiVar, MediaCrypto mediaCrypto) throws Exception {
        long j;
        zztd zztdVar;
        int i;
        long j2;
        zzam zzamVar = this.zzm;
        Objects.requireNonNull(zzamVar);
        String str = zztiVar.zza;
        float fZzZ = zzfx.zza < 23 ? -1.0f : zzZ(this.zzq, zzamVar, zzT());
        if (fZzZ <= this.zze) {
            fZzZ = -1.0f;
        }
        zzaC(zzamVar);
        zzh();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        zztd zztdVarZzaf = zzaf(zztiVar, zzamVar, null, fZzZ);
        if (zzfx.zza >= 31) {
            zztl.zza(zztdVarZzaf, zzn());
        }
        try {
            Trace.beginSection("createCodec:" + str);
            this.zzr = this.zzc.zzd(zztdVarZzaf);
            Trace.endSection();
            zzh();
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            if (zztiVar.zze(zzamVar)) {
                j = jElapsedRealtime;
                zztdVar = zztdVarZzaf;
                i = 0;
            } else {
                Object[] objArr = new Object[2];
                StringBuilder sb = new StringBuilder();
                sb.append("id=");
                sb.append(zzamVar.zzb);
                sb.append(", mimeType=");
                sb.append(zzamVar.zzm);
                if (zzamVar.zzl != null) {
                    sb.append(", container=");
                    sb.append(zzamVar.zzl);
                }
                if (zzamVar.zzi != -1) {
                    sb.append(", bitrate=");
                    sb.append(zzamVar.zzi);
                }
                if (zzamVar.zzj != null) {
                    sb.append(", codecs=");
                    sb.append(zzamVar.zzj);
                }
                if (zzamVar.zzp != null) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    int i2 = 0;
                    while (true) {
                        zzae zzaeVar = zzamVar.zzp;
                        zztdVar = zztdVarZzaf;
                        if (i2 >= zzaeVar.zzb) {
                            break;
                        }
                        UUID uuid = zzaeVar.zza(i2).zza;
                        if (uuid.equals(zzo.zzb)) {
                            linkedHashSet.add("cenc");
                        } else if (uuid.equals(zzo.zzc)) {
                            linkedHashSet.add("clearkey");
                        } else if (uuid.equals(zzo.zze)) {
                            linkedHashSet.add("playready");
                        } else if (uuid.equals(zzo.zzd)) {
                            linkedHashSet.add("widevine");
                        } else if (uuid.equals(zzo.zza)) {
                            linkedHashSet.add("universal");
                        } else {
                            String string = uuid.toString();
                            StringBuilder sb2 = new StringBuilder();
                            j2 = jElapsedRealtime;
                            sb2.append("unknown (");
                            sb2.append(string);
                            sb2.append(")");
                            linkedHashSet.add(sb2.toString());
                            i2++;
                            zztdVarZzaf = zztdVar;
                            jElapsedRealtime = j2;
                        }
                        j2 = jElapsedRealtime;
                        i2++;
                        zztdVarZzaf = zztdVar;
                        jElapsedRealtime = j2;
                    }
                    j = jElapsedRealtime;
                    sb.append(", drm=[");
                    zzfwg.zzb(sb, linkedHashSet, ",");
                    sb.append(AbstractJsonLexerKt.END_LIST);
                } else {
                    j = jElapsedRealtime;
                    zztdVar = zztdVarZzaf;
                }
                if (zzamVar.zzr != -1 && zzamVar.zzs != -1) {
                    sb.append(", res=");
                    sb.append(zzamVar.zzr);
                    sb.append("x");
                    sb.append(zzamVar.zzs);
                }
                zzt zztVar = zzamVar.zzy;
                if (zztVar != null && (zztVar.zze() || zztVar.zzf())) {
                    sb.append(", color=");
                    sb.append(zzamVar.zzy.zzd());
                }
                if (zzamVar.zzt != -1.0f) {
                    sb.append(", fps=");
                    sb.append(zzamVar.zzt);
                }
                if (zzamVar.zzz != -1) {
                    sb.append(", channels=");
                    sb.append(zzamVar.zzz);
                }
                if (zzamVar.zzA != -1) {
                    sb.append(", sample_rate=");
                    sb.append(zzamVar.zzA);
                }
                if (zzamVar.zzd != null) {
                    sb.append(", language=");
                    sb.append(zzamVar.zzd);
                }
                if (zzamVar.zzc != null) {
                    sb.append(", label=");
                    sb.append(zzamVar.zzc);
                }
                if (zzamVar.zze != 0) {
                    sb.append(", selectionFlags=[");
                    int i3 = zzamVar.zze;
                    ArrayList arrayList = new ArrayList();
                    if ((i3 & 1) != 0) {
                        arrayList.add(Reward.DEFAULT);
                    }
                    if ((i3 & 2) != 0) {
                        arrayList.add("forced");
                    }
                    zzfwg.zzb(sb, arrayList, ",");
                    sb.append(t2.i.e);
                }
                if (zzamVar.zzf != 0) {
                    sb.append(", roleFlags=[");
                    int i4 = zzamVar.zzf;
                    ArrayList arrayList2 = new ArrayList();
                    if ((i4 & 1) != 0) {
                        arrayList2.add(t2.h.Z);
                    }
                    if ((i4 & 2) != 0) {
                        arrayList2.add("alt");
                    }
                    if ((i4 & 4) != 0) {
                        arrayList2.add("supplementary");
                    }
                    if ((i4 & 8) != 0) {
                        arrayList2.add("commentary");
                    }
                    if ((i4 & 16) != 0) {
                        arrayList2.add("dub");
                    }
                    if ((i4 & 32) != 0) {
                        arrayList2.add("emergency");
                    }
                    if ((i4 & 64) != 0) {
                        arrayList2.add("caption");
                    }
                    if ((i4 & 128) != 0) {
                        arrayList2.add("subtitle");
                    }
                    if ((i4 & 256) != 0) {
                        arrayList2.add("sign");
                    }
                    if ((i4 & 512) != 0) {
                        arrayList2.add("describes-video");
                    }
                    if ((i4 & 1024) != 0) {
                        arrayList2.add("describes-music");
                    }
                    if ((i4 & 2048) != 0) {
                        arrayList2.add("enhanced-intelligibility");
                    }
                    if ((i4 & 4096) != 0) {
                        arrayList2.add("transcribes-dialog");
                    }
                    if ((i4 & 8192) != 0) {
                        arrayList2.add("easy-read");
                    }
                    if ((i4 & 16384) != 0) {
                        arrayList2.add("trick-play");
                    }
                    zzfwg.zzb(sb, arrayList2, ",");
                    sb.append(t2.i.e);
                }
                i = 0;
                objArr[0] = sb.toString();
                objArr[1] = str;
                zzfe.zzf("MediaCodecRenderer", String.format(Locale.US, "Format exceeds selected codec's capabilities [%s, %s]", objArr));
            }
            this.zzy = zztiVar;
            this.zzv = fZzZ;
            this.zzs = zzamVar;
            this.zzz = (zzfx.zza <= 25 && "OMX.Exynos.avc.dec.secure".equals(str) && (zzfx.zzd.startsWith("SM-T585") || zzfx.zzd.startsWith("SM-A510") || zzfx.zzd.startsWith("SM-A520") || zzfx.zzd.startsWith("SM-J700"))) ? 2 : (zzfx.zza >= 24 || !(("OMX.Nvidia.h264.decode".equals(str) || "OMX.Nvidia.h264.decode.secure".equals(str)) && ("flounder".equals(zzfx.zzb) || "flounder_lte".equals(zzfx.zzb) || "grouper".equals(zzfx.zzb) || "tilapia".equals(zzfx.zzb)))) ? i : 1;
            Objects.requireNonNull(this.zzs);
            this.zzA = (zzfx.zza == 29 && "c2.android.aac.decoder".equals(str)) ? 1 : i;
            this.zzB = (zzfx.zza > 23 || !"OMX.google.vorbis.decoder".equals(str)) ? i : 1;
            this.zzC = (zzfx.zza == 21 && "OMX.google.aac.decoder".equals(str)) ? 1 : i;
            String str2 = zztiVar.zza;
            this.zzF = ((zzfx.zza > 25 || !"OMX.rk.video_decoder.avc".equals(str2)) && (zzfx.zza > 29 || !("OMX.broadcom.video_decoder.tunnel".equals(str2) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str2) || "OMX.bcm.vdec.avc.tunnel".equals(str2) || "OMX.bcm.vdec.avc.tunnel.secure".equals(str2) || "OMX.bcm.vdec.hevc.tunnel".equals(str2) || "OMX.bcm.vdec.hevc.tunnel.secure".equals(str2))) && !("Amazon".equals(zzfx.zzc) && "AFTS".equals(zzfx.zzd) && zztiVar.zzf)) ? i : 1;
            Objects.requireNonNull(this.zzr);
            if (zzcU() == 2) {
                zzh();
                this.zzG = SystemClock.elapsedRealtime() + 1000;
            }
            this.zza.zza++;
            zzal(str, zztdVar, jElapsedRealtime2, jElapsedRealtime2 - j);
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zziq
    protected void zzC() {
        try {
            zzad();
            zzaD();
        } finally {
            this.zzaf = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0036, code lost:
    
        if (r5 >= r1) goto L14;
     */
    @Override // com.google.android.gms.internal.ads.zziq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void zzF(com.google.android.gms.internal.ads.zzam[] r13, long r14, long r16, com.google.android.gms.internal.ads.zzvh r18) throws com.google.android.gms.internal.ads.zziz {
        /*
            r12 = this;
            r0 = r12
            com.google.android.gms.internal.ads.zztn r1 = r0.zzab
            long r1 = r1.zzd
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L20
            com.google.android.gms.internal.ads.zztn r1 = new com.google.android.gms.internal.ads.zztn
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5 = r1
            r8 = r14
            r10 = r16
            r5.<init>(r6, r8, r10)
            r12.zzaO(r1)
            return
        L20:
            java.util.ArrayDeque r1 = r0.zzk
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L55
            long r1 = r0.zzW
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L38
            long r5 = r0.zzac
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 == 0) goto L55
            int r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r1 < 0) goto L55
        L38:
            com.google.android.gms.internal.ads.zztn r1 = new com.google.android.gms.internal.ads.zztn
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5 = r1
            r8 = r14
            r10 = r16
            r5.<init>(r6, r8, r10)
            r12.zzaO(r1)
            com.google.android.gms.internal.ads.zztn r1 = r0.zzab
            long r1 = r1.zzd
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L54
            r12.zzap()
        L54:
            return
        L55:
            java.util.ArrayDeque r1 = r0.zzk
            com.google.android.gms.internal.ads.zztn r9 = new com.google.android.gms.internal.ads.zztn
            long r3 = r0.zzW
            r2 = r9
            r5 = r14
            r7 = r16
            r2.<init>(r3, r5, r7)
            r1.add(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzto.zzF(com.google.android.gms.internal.ads.zzam[], long, long, com.google.android.gms.internal.ads.zzvh):void");
    }

    @Override // com.google.android.gms.internal.ads.zziq, com.google.android.gms.internal.ads.zzmf
    public void zzM(float f, float f2) throws zziz {
        this.zzq = f2;
        zzaW(this.zzs);
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    @Override // com.google.android.gms.internal.ads.zzmf
    public void zzV(long r24, long r26) throws com.google.android.gms.internal.ads.zziz {
        /*
            Method dump skipped, instructions count: 1065
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzto.zzV(long, long):void");
    }

    @Override // com.google.android.gms.internal.ads.zzmf
    public boolean zzW() {
        return this.zzZ;
    }

    @Override // com.google.android.gms.internal.ads.zzmf
    public boolean zzX() {
        if (this.zzm != null) {
            if (zzS() || zzaS()) {
                return true;
            }
            if (this.zzG != -9223372036854775807L) {
                zzh();
                if (SystemClock.elapsedRealtime() < this.zzG) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzmh
    public final int zzY(zzam zzamVar) throws zziz {
        try {
            return zzaa(this.zzd, zzamVar);
        } catch (zztw e) {
            throw zzi(e, zzamVar, false, 4002);
        }
    }

    protected float zzZ(float f, zzam zzamVar, zzam[] zzamVarArr) {
        throw null;
    }

    protected void zzaA(long j) {
        this.zzac = j;
        while (!this.zzk.isEmpty() && j >= ((zztn) this.zzk.peek()).zzb) {
            zztn zztnVar = (zztn) this.zzk.poll();
            Objects.requireNonNull(zztnVar);
            zzaO(zztnVar);
            zzap();
        }
    }

    protected void zzaB(zzih zzihVar) throws zziz {
    }

    protected void zzaC(zzam zzamVar) throws zziz {
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected final void zzaD() {
        try {
            zztf zztfVar = this.zzr;
            if (zztfVar != null) {
                zztfVar.zzl();
                this.zza.zzb++;
                zzti zztiVar = this.zzy;
                Objects.requireNonNull(zztiVar);
                zzam(zztiVar.zza);
            }
        } finally {
            this.zzr = null;
            this.zzo = null;
            this.zzae = null;
            zzaF();
        }
    }

    protected void zzaE() {
        zzaM();
        zzaN();
        this.zzG = -9223372036854775807L;
        this.zzU = false;
        this.zzT = false;
        this.zzD = false;
        this.zzE = false;
        this.zzK = false;
        this.zzL = false;
        this.zzW = -9223372036854775807L;
        this.zzX = -9223372036854775807L;
        this.zzac = -9223372036854775807L;
        this.zzR = 0;
        this.zzS = 0;
        this.zzQ = this.zzP ? 1 : 0;
    }

    protected final void zzaF() {
        zzaE();
        this.zzw = null;
        this.zzy = null;
        this.zzs = null;
        this.zzt = null;
        this.zzu = false;
        this.zzV = false;
        this.zzv = -1.0f;
        this.zzz = 0;
        this.zzA = false;
        this.zzB = false;
        this.zzC = false;
        this.zzF = false;
        this.zzP = false;
        this.zzQ = 0;
    }

    protected final boolean zzaG() throws zziz {
        boolean zZzaH = zzaH();
        if (zZzaH) {
            zzaz();
        }
        return zZzaH;
    }

    protected final boolean zzaH() {
        if (this.zzr == null) {
            return false;
        }
        int i = this.zzS;
        if (i == 3 || ((this.zzA && !this.zzV) || (this.zzB && this.zzU))) {
            zzaD();
            return true;
        }
        if (i == 2) {
            zzek.zzf(zzfx.zza >= 23);
            if (zzfx.zza >= 23) {
                try {
                    zzaP();
                } catch (zziz e) {
                    zzfe.zzg("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e);
                    zzaD();
                    return true;
                }
            }
        }
        zzah();
        return false;
    }

    protected final boolean zzaI() {
        return this.zzM;
    }

    protected final boolean zzaJ(zzam zzamVar) {
        return this.zzaf == null && zzas(zzamVar);
    }

    protected boolean zzaK(zzti zztiVar) {
        return true;
    }

    protected abstract int zzaa(zztq zztqVar, zzam zzamVar) throws zztw;

    protected zzis zzab(zzti zztiVar, zzam zzamVar, zzam zzamVar2) {
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected com.google.android.gms.internal.ads.zzis zzac(com.google.android.gms.internal.ads.zzlb r12) throws com.google.android.gms.internal.ads.zziz {
        /*
            Method dump skipped, instructions count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzto.zzac(com.google.android.gms.internal.ads.zzlb):com.google.android.gms.internal.ads.zzis");
    }

    protected abstract zztd zzaf(zzti zztiVar, zzam zzamVar, MediaCrypto mediaCrypto, float f);

    protected abstract List zzag(zztq zztqVar, zzam zzamVar, boolean z) throws zztw;

    protected void zzaj(zzih zzihVar) throws zziz {
        throw null;
    }

    protected void zzak(Exception exc) {
        throw null;
    }

    protected void zzal(String str, zztd zztdVar, long j, long j2) {
        throw null;
    }

    protected void zzam(String str) {
        throw null;
    }

    protected void zzan(zzam zzamVar, MediaFormat mediaFormat) throws zziz {
        throw null;
    }

    protected void zzap() {
    }

    protected void zzaq() throws zziz {
    }

    protected abstract boolean zzar(long j, long j2, zztf zztfVar, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, zzam zzamVar) throws zziz;

    protected boolean zzas(zzam zzamVar) {
        return false;
    }

    protected int zzat(zzih zzihVar) {
        return 0;
    }

    protected final long zzau() {
        return this.zzab.zzd;
    }

    protected final long zzav() {
        return this.zzab.zzc;
    }

    protected final zztf zzaw() {
        return this.zzr;
    }

    protected zzth zzax(Throwable th, zzti zztiVar) {
        return new zzth(th, zztiVar);
    }

    protected final zzti zzay() {
        return this.zzy;
    }

    protected final void zzaz() throws zziz {
        zzam zzamVar;
        if (this.zzr != null || this.zzM || (zzamVar = this.zzm) == null) {
            return;
        }
        if (zzaJ(zzamVar)) {
            zzad();
            String str = zzamVar.zzm;
            if ("audio/mp4a-latm".equals(str) || "audio/mpeg".equals(str) || "audio/opus".equals(str)) {
                this.zzi.zzn(32);
            } else {
                this.zzi.zzn(1);
            }
            this.zzM = true;
            return;
        }
        zzsn zzsnVar = this.zzaf;
        this.zzae = zzsnVar;
        if (zzsnVar != null) {
            zzek.zzf(true);
            zzsn zzsnVar2 = this.zzae;
            boolean z = zzso.zza;
            zzsnVar2.zza();
        }
        try {
            if (this.zzae != null) {
                zzek.zzb(zzamVar.zzm);
            }
            zzam zzamVar2 = this.zzm;
            Objects.requireNonNull(zzamVar2);
            if (this.zzw == null) {
                try {
                    List listZzag = zzag(this.zzd, zzamVar2, false);
                    listZzag.isEmpty();
                    this.zzw = new ArrayDeque();
                    if (!listZzag.isEmpty()) {
                        this.zzw.add((zzti) listZzag.get(0));
                    }
                    this.zzx = null;
                } catch (zztw e) {
                    throw new zztm(zzamVar2, (Throwable) e, false, -49998);
                }
            }
            if (this.zzw.isEmpty()) {
                throw new zztm(zzamVar2, (Throwable) null, false, -49999);
            }
            ArrayDeque arrayDeque = this.zzw;
            Objects.requireNonNull(arrayDeque);
            zzti zztiVar = (zzti) arrayDeque.peekFirst();
            while (this.zzr == null) {
                zzti zztiVar2 = (zzti) arrayDeque.peekFirst();
                Objects.requireNonNull(zztiVar2);
                if (!zzaK(zztiVar2)) {
                    return;
                }
                try {
                    zzai(zztiVar2, null);
                } catch (Exception e2) {
                    if (zztiVar2 != zztiVar) {
                        throw e2;
                    }
                    try {
                        zzfe.zzf("MediaCodecRenderer", "Preferred decoder instantiation failed. Sleeping for 50ms then retrying.");
                        Thread.sleep(50L);
                        zzai(zztiVar2, null);
                    } catch (Exception e3) {
                        zzfe.zzg("MediaCodecRenderer", "Failed to initialize decoder: ".concat(zztiVar2.zza), e3);
                        arrayDeque.removeFirst();
                        zztm zztmVar = new zztm(zzamVar2, (Throwable) e3, false, zztiVar2);
                        zzak(zztmVar);
                        zztm zztmVar2 = this.zzx;
                        if (zztmVar2 == null) {
                            this.zzx = zztmVar;
                        } else {
                            this.zzx = zztm.zza(zztmVar2, zztmVar);
                        }
                        if (arrayDeque.isEmpty()) {
                            throw this.zzx;
                        }
                    }
                }
            }
            this.zzw = null;
        } catch (zztm e4) {
            throw zzi(e4, zzamVar, false, 4001);
        }
    }

    @Override // com.google.android.gms.internal.ads.zziq, com.google.android.gms.internal.ads.zzmh
    public final int zze() {
        return 8;
    }

    @Override // com.google.android.gms.internal.ads.zziq
    protected void zzw() {
        this.zzm = null;
        zzaO(zztn.zza);
        this.zzk.clear();
        zzaH();
    }

    @Override // com.google.android.gms.internal.ads.zziq
    protected void zzx(boolean z, boolean z2) throws zziz {
        this.zza = new zzir();
    }

    @Override // com.google.android.gms.internal.ads.zziq
    protected void zzz(long j, boolean z) throws zziz {
        this.zzY = false;
        this.zzZ = false;
        if (this.zzM) {
            this.zzi.zzb();
            this.zzh.zzb();
            this.zzN = false;
            this.zzl.zzb();
        } else {
            zzaG();
        }
        zzfu zzfuVar = this.zzab.zze;
        if (zzfuVar.zza() > 0) {
            this.zzaa = true;
        }
        zzfuVar.zze();
        this.zzk.clear();
    }

    private final void zzao() throws zziz {
        int i = this.zzS;
        if (i == 1) {
            zzah();
            return;
        }
        if (i == 2) {
            zzah();
            zzaP();
        } else if (i != 3) {
            this.zzZ = true;
            zzaq();
        } else {
            zzaD();
            zzaz();
        }
    }
}
