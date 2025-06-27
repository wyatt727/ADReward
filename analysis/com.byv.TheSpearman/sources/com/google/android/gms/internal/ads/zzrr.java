package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import com.google.android.exoplayer2.audio.Ac3Util;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.Objects;
import java.util.concurrent.ExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzrr implements zzqn {
    private static final Object zza = new Object();
    private static ExecutorService zzb;
    private static int zzc;
    private zzrh zzA;
    private zzcg zzB;
    private boolean zzC;
    private long zzD;
    private long zzE;
    private long zzF;
    private long zzG;
    private int zzH;
    private boolean zzI;
    private boolean zzJ;
    private long zzK;
    private float zzL;
    private ByteBuffer zzM;
    private int zzN;
    private ByteBuffer zzO;
    private boolean zzP;
    private boolean zzQ;
    private boolean zzR;
    private int zzS;
    private zzl zzT;
    private zzpp zzU;
    private long zzV;
    private boolean zzW;
    private boolean zzX;
    private Looper zzY;
    private long zzZ;
    private long zzaa;
    private Handler zzab;
    private final zzrf zzac;
    private final zzqv zzad;
    private final Context zzd;
    private final zzqs zze;
    private final zzsb zzf;
    private final zzfzn zzg;
    private final zzfzn zzh;
    private final zzeo zzi;
    private final zzqr zzj;
    private final ArrayDeque zzk;
    private zzrp zzl;
    private final zzrk zzm;
    private final zzrk zzn;
    private final zzrc zzo;
    private zzpb zzp;
    private zzqk zzq;
    private zzre zzr;
    private zzre zzs;
    private zzdq zzt;
    private AudioTrack zzu;
    private zzph zzv;
    private zzpo zzw;
    private zzrj zzx;
    private zzk zzy;
    private zzrh zzz;

    /* synthetic */ zzrr(zzrd zzrdVar, zzrq zzrqVar) {
        zzph zzphVarZzc;
        Context context = zzrdVar.zza;
        this.zzd = context;
        zzk zzkVar = zzk.zza;
        this.zzy = zzkVar;
        if (context != null) {
            zzph zzphVar = zzph.zza;
            int i = zzfx.zza;
            zzphVarZzc = zzph.zzc(context, zzkVar, null);
        } else {
            zzphVarZzc = zzrdVar.zzb;
        }
        this.zzv = zzphVarZzc;
        this.zzac = zzrdVar.zze;
        int i2 = zzfx.zza;
        this.zzo = zzrdVar.zzd;
        zzqv zzqvVar = zzrdVar.zzf;
        Objects.requireNonNull(zzqvVar);
        this.zzad = zzqvVar;
        zzeo zzeoVar = new zzeo(zzel.zza);
        this.zzi = zzeoVar;
        zzeoVar.zze();
        this.zzj = new zzqr(new zzrm(this, null));
        zzqs zzqsVar = new zzqs();
        this.zze = zzqsVar;
        zzsb zzsbVar = new zzsb();
        this.zzf = zzsbVar;
        this.zzg = zzfzn.zzp(new zzdx(), zzqsVar, zzsbVar);
        this.zzh = zzfzn.zzn(new zzsa());
        this.zzL = 1.0f;
        this.zzS = 0;
        this.zzT = new zzl(0, 0.0f);
        this.zzA = new zzrh(zzcg.zza, 0L, 0L, null);
        this.zzB = zzcg.zza;
        this.zzC = false;
        this.zzk = new ArrayDeque();
        this.zzm = new zzrk(100L);
        this.zzn = new zzrk(100L);
    }

    public static /* synthetic */ void zzG(zzrr zzrrVar) {
        if (zzrrVar.zzaa >= 300000) {
            ((zzrw) zzrrVar.zzq).zza.zzn = true;
            zzrrVar.zzaa = 0L;
        }
    }

    static /* synthetic */ void zzH(AudioTrack audioTrack, final zzqk zzqkVar, Handler handler, final zzqh zzqhVar, zzeo zzeoVar) {
        try {
            audioTrack.flush();
            audioTrack.release();
            if (zzqkVar != null && handler.getLooper().getThread().isAlive()) {
                handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzqx
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((zzrw) zzqkVar).zza.zzc.zzd(zzqhVar);
                    }
                });
            }
            zzeoVar.zze();
            synchronized (zza) {
                int i = zzc - 1;
                zzc = i;
                if (i == 0) {
                    zzb.shutdown();
                    zzb = null;
                }
            }
        } catch (Throwable th) {
            if (zzqkVar != null && handler.getLooper().getThread().isAlive()) {
                handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzqx
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((zzrw) zzqkVar).zza.zzc.zzd(zzqhVar);
                    }
                });
            }
            zzeoVar.zze();
            synchronized (zza) {
                int i2 = zzc - 1;
                zzc = i2;
                if (i2 == 0) {
                    zzb.shutdown();
                    zzb = null;
                }
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long zzK() {
        return this.zzs.zzc == 0 ? this.zzD / r0.zzb : this.zzE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long zzL() {
        zzre zzreVar = this.zzs;
        if (zzreVar.zzc != 0) {
            return this.zzG;
        }
        long j = this.zzF;
        long j2 = zzreVar.zzd;
        int i = zzfx.zza;
        return ((j + j2) - 1) / j2;
    }

    private final AudioTrack zzM(zzre zzreVar) throws zzqj {
        try {
            return zzreVar.zza(this.zzy, this.zzS);
        } catch (zzqj e) {
            zzqk zzqkVar = this.zzq;
            if (zzqkVar != null) {
                zzqkVar.zza(e);
            }
            throw e;
        }
    }

    private final void zzN(long j) {
        zzcg zzcgVar;
        boolean z;
        if (zzZ()) {
            zzrf zzrfVar = this.zzac;
            zzcgVar = this.zzB;
            zzrfVar.zzc(zzcgVar);
        } else {
            zzcgVar = zzcg.zza;
        }
        zzcg zzcgVar2 = zzcgVar;
        this.zzB = zzcgVar2;
        if (zzZ()) {
            zzrf zzrfVar2 = this.zzac;
            z = this.zzC;
            zzrfVar2.zzd(z);
        } else {
            z = false;
        }
        this.zzC = z;
        this.zzk.add(new zzrh(zzcgVar2, Math.max(0L, j), zzfx.zzs(zzL(), this.zzs.zze), null));
        zzU();
        zzqk zzqkVar = this.zzq;
        if (zzqkVar != null) {
            ((zzrw) zzqkVar).zza.zzc.zzw(this.zzC);
        }
    }

    private final void zzO() {
        if (this.zzs.zzc()) {
            this.zzW = true;
        }
    }

    private final void zzP() {
        if (this.zzw != null || this.zzd == null) {
            return;
        }
        this.zzY = Looper.myLooper();
        zzpo zzpoVar = new zzpo(this.zzd, new zzqz(this), this.zzy, this.zzU);
        this.zzw = zzpoVar;
        this.zzv = zzpoVar.zzc();
    }

    private final void zzQ() throws IllegalStateException {
        if (this.zzQ) {
            return;
        }
        this.zzQ = true;
        this.zzj.zzb(zzL());
        this.zzu.stop();
    }

    private final void zzR(long j) throws Exception {
        ByteBuffer byteBufferZzb;
        if (!this.zzt.zzh()) {
            ByteBuffer byteBuffer = this.zzM;
            if (byteBuffer == null) {
                byteBuffer = zzdt.zza;
            }
            zzV(byteBuffer, j);
            return;
        }
        while (!this.zzt.zzg()) {
            do {
                byteBufferZzb = this.zzt.zzb();
                if (byteBufferZzb.hasRemaining()) {
                    zzV(byteBufferZzb, j);
                } else {
                    ByteBuffer byteBuffer2 = this.zzM;
                    if (byteBuffer2 == null || !byteBuffer2.hasRemaining()) {
                        return;
                    } else {
                        this.zzt.zze(this.zzM);
                    }
                }
            } while (!byteBufferZzb.hasRemaining());
            return;
        }
    }

    private final void zzS(zzcg zzcgVar) {
        zzrh zzrhVar = new zzrh(zzcgVar, -9223372036854775807L, -9223372036854775807L, null);
        if (zzX()) {
            this.zzz = zzrhVar;
        } else {
            this.zzA = zzrhVar;
        }
    }

    private final void zzT() {
        if (zzX()) {
            int i = zzfx.zza;
            this.zzu.setVolume(this.zzL);
        }
    }

    private final void zzU() {
        zzdq zzdqVar = this.zzs.zzi;
        this.zzt = zzdqVar;
        zzdqVar.zzc();
    }

    private final void zzV(ByteBuffer byteBuffer, long j) throws Exception {
        zzqk zzqkVar;
        if (byteBuffer.hasRemaining()) {
            ByteBuffer byteBuffer2 = this.zzO;
            if (byteBuffer2 != null) {
                zzek.zzd(byteBuffer2 == byteBuffer);
            } else {
                this.zzO = byteBuffer;
                int i = zzfx.zza;
            }
            int iRemaining = byteBuffer.remaining();
            int i2 = zzfx.zza;
            int iWrite = this.zzu.write(byteBuffer, iRemaining, 1);
            this.zzV = SystemClock.elapsedRealtime();
            if (iWrite < 0) {
                if ((zzfx.zza >= 24 && iWrite == -6) || iWrite == -32) {
                    if (zzL() > 0) {
                        z = true;
                    } else if (zzY(this.zzu)) {
                        zzO();
                        z = true;
                    }
                }
                zzqm zzqmVar = new zzqm(iWrite, this.zzs.zza, z);
                zzqk zzqkVar2 = this.zzq;
                if (zzqkVar2 != null) {
                    zzqkVar2.zza(zzqmVar);
                }
                if (zzqmVar.zzb) {
                    this.zzv = zzph.zza;
                    throw zzqmVar;
                }
                this.zzn.zzb(zzqmVar);
                return;
            }
            this.zzn.zza();
            if (zzY(this.zzu)) {
                if (this.zzG > 0) {
                    this.zzX = false;
                }
                if (this.zzR && (zzqkVar = this.zzq) != null && iWrite < iRemaining) {
                    zzrx zzrxVar = ((zzrw) zzqkVar).zza;
                    if (zzrxVar.zzm != null) {
                        zzrxVar.zzm.zza();
                    }
                }
            }
            int i3 = this.zzs.zzc;
            if (i3 == 0) {
                this.zzF += iWrite;
            }
            if (iWrite == iRemaining) {
                if (i3 != 0) {
                    zzek.zzf(byteBuffer == this.zzM);
                    this.zzG += this.zzH * this.zzN;
                }
                this.zzO = null;
            }
        }
    }

    private final boolean zzW() throws Exception {
        if (!this.zzt.zzh()) {
            ByteBuffer byteBuffer = this.zzO;
            if (byteBuffer == null) {
                return true;
            }
            zzV(byteBuffer, Long.MIN_VALUE);
            return this.zzO == null;
        }
        this.zzt.zzd();
        zzR(Long.MIN_VALUE);
        if (!this.zzt.zzg()) {
            return false;
        }
        ByteBuffer byteBuffer2 = this.zzO;
        return byteBuffer2 == null || !byteBuffer2.hasRemaining();
    }

    private final boolean zzX() {
        return this.zzu != null;
    }

    private static boolean zzY(AudioTrack audioTrack) {
        return zzfx.zza >= 29 && audioTrack.isOffloadedPlayback();
    }

    private final boolean zzZ() {
        zzre zzreVar = this.zzs;
        if (zzreVar.zzc != 0) {
            return false;
        }
        int i = zzreVar.zza.zzB;
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzqn
    public final boolean zzA(zzam zzamVar) {
        return zza(zzamVar) != 0;
    }

    public final void zzI(zzph zzphVar) {
        zzek.zzf(this.zzY == Looper.myLooper());
        if (zzphVar.equals(this.zzv)) {
            return;
        }
        this.zzv = zzphVar;
        zzqk zzqkVar = this.zzq;
        if (zzqkVar != null) {
            ((zzrw) zzqkVar).zza.zzB();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqn
    public final int zza(zzam zzamVar) {
        zzP();
        if (!"audio/raw".equals(zzamVar.zzm)) {
            return this.zzv.zzb(zzamVar, this.zzy) != null ? 2 : 0;
        }
        if (zzfx.zzK(zzamVar.zzB)) {
            return zzamVar.zzB != 2 ? 1 : 2;
        }
        zzfe.zzf("DefaultAudioSink", "Invalid PCM encoding: " + zzamVar.zzB);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzqn
    public final long zzb(boolean z) {
        long jZzp;
        if (!zzX() || this.zzJ) {
            return Long.MIN_VALUE;
        }
        long jMin = Math.min(this.zzj.zza(z), zzfx.zzs(zzL(), this.zzs.zze));
        while (!this.zzk.isEmpty() && jMin >= ((zzrh) this.zzk.getFirst()).zzc) {
            this.zzA = (zzrh) this.zzk.remove();
        }
        zzrh zzrhVar = this.zzA;
        long j = jMin - zzrhVar.zzc;
        if (zzrhVar.zza.equals(zzcg.zza)) {
            jZzp = this.zzA.zzb + j;
        } else if (this.zzk.isEmpty()) {
            jZzp = this.zzac.zza(j) + this.zzA.zzb;
        } else {
            zzrh zzrhVar2 = (zzrh) this.zzk.getFirst();
            jZzp = zzrhVar2.zzb - zzfx.zzp(zzrhVar2.zzc - jMin, this.zzA.zza.zzc);
        }
        long jZzb = this.zzac.zzb();
        long jZzs = jZzp + zzfx.zzs(jZzb, this.zzs.zze);
        long j2 = this.zzZ;
        if (jZzb > j2) {
            long jZzs2 = zzfx.zzs(jZzb - j2, this.zzs.zze);
            this.zzZ = jZzb;
            this.zzaa += jZzs2;
            if (this.zzab == null) {
                this.zzab = new Handler(Looper.myLooper());
            }
            this.zzab.removeCallbacksAndMessages(null);
            this.zzab.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.zzqy
                @Override // java.lang.Runnable
                public final void run() {
                    zzrr.zzG(this.zza);
                }
            }, 100L);
        }
        return jZzs;
    }

    @Override // com.google.android.gms.internal.ads.zzqn
    public final zzcg zzc() {
        return this.zzB;
    }

    @Override // com.google.android.gms.internal.ads.zzqn
    public final zzps zzd(zzam zzamVar) {
        return this.zzW ? zzps.zza : this.zzad.zza(zzamVar, this.zzy);
    }

    @Override // com.google.android.gms.internal.ads.zzqn
    public final void zze(zzam zzamVar, int i, int[] iArr) throws zzqi {
        int iIntValue;
        zzdq zzdqVar;
        int iZzm;
        int iIntValue2;
        int iZzm2;
        int i2;
        int i3;
        int i4;
        int iMax;
        zzP();
        if ("audio/raw".equals(zzamVar.zzm)) {
            zzek.zzd(zzfx.zzK(zzamVar.zzB));
            iZzm = zzfx.zzm(zzamVar.zzB, zzamVar.zzz);
            zzfzk zzfzkVar = new zzfzk();
            int i5 = zzamVar.zzB;
            zzfzkVar.zzh(this.zzg);
            zzfzkVar.zzg(this.zzac.zze());
            zzdq zzdqVar2 = new zzdq(zzfzkVar.zzi());
            if (zzdqVar2.equals(this.zzt)) {
                zzdqVar2 = this.zzt;
            }
            this.zzf.zzq(zzamVar.zzC, zzamVar.zzD);
            this.zze.zzo(iArr);
            try {
                zzdr zzdrVarZza = zzdqVar2.zza(new zzdr(zzamVar.zzA, zzamVar.zzz, zzamVar.zzB));
                iIntValue = zzdrVarZza.zzd;
                i2 = zzdrVarZza.zzb;
                int i6 = zzdrVarZza.zzc;
                iIntValue2 = zzfx.zzh(i6);
                zzdqVar = zzdqVar2;
                iZzm2 = zzfx.zzm(iIntValue, i6);
                i3 = 0;
            } catch (zzds e) {
                throw new zzqi(e, zzamVar);
            }
        } else {
            zzdq zzdqVar3 = new zzdq(zzfzn.zzm());
            int i7 = zzamVar.zzA;
            zzps zzpsVar = zzps.zza;
            Pair pairZzb = this.zzv.zzb(zzamVar, this.zzy);
            if (pairZzb == null) {
                throw new zzqi("Unable to configure passthrough for: ".concat(String.valueOf(String.valueOf(zzamVar))), zzamVar);
            }
            iIntValue = ((Integer) pairZzb.first).intValue();
            zzdqVar = zzdqVar3;
            iZzm = -1;
            iIntValue2 = ((Integer) pairZzb.second).intValue();
            iZzm2 = -1;
            i2 = i7;
            i3 = 2;
        }
        if (iIntValue == 0) {
            throw new zzqi("Invalid output encoding (mode=" + i3 + ") for: " + String.valueOf(zzamVar), zzamVar);
        }
        if (iIntValue2 == 0) {
            throw new zzqi("Invalid output channel config (mode=" + i3 + ") for: " + String.valueOf(zzamVar), zzamVar);
        }
        int i8 = zzamVar.zzi;
        if ("audio/vnd.dts.hd;profile=lbr".equals(zzamVar.zzm) && i8 == -1) {
            i8 = Ac3Util.E_AC3_MAX_RATE_BYTES_PER_SECOND;
        }
        int minBufferSize = AudioTrack.getMinBufferSize(i2, iIntValue2, iIntValue);
        zzek.zzf(minBufferSize != -2);
        int i9 = iZzm2 != -1 ? iZzm2 : 1;
        int i10 = 250000;
        if (i3 == 0) {
            i4 = i3;
            iMax = Math.max(zzrt.zza(250000, i2, i9), Math.min(minBufferSize * 4, zzrt.zza(750000, i2, i9)));
        } else if (i3 != 1) {
            if (iIntValue == 5) {
                i10 = 500000;
            } else if (iIntValue == 8) {
                i10 = 1000000;
                iIntValue = 8;
            }
            i4 = i3;
            iMax = zzgcl.zzb((i10 * (i8 != -1 ? zzgcd.zza(i8, 8, RoundingMode.CEILING) : zzrt.zzb(iIntValue))) / 1000000);
        } else {
            i4 = i3;
            iMax = zzgcl.zzb((zzrt.zzb(iIntValue) * 50000000) / 1000000);
        }
        this.zzW = false;
        zzre zzreVar = new zzre(zzamVar, iZzm, i4, iZzm2, i2, iIntValue2, iIntValue, (((Math.max(minBufferSize, iMax) + i9) - 1) / i9) * i9, zzdqVar, false, false, false);
        if (zzX()) {
            this.zzr = zzreVar;
        } else {
            this.zzs = zzreVar;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqn
    public final void zzf() throws IllegalStateException {
        zzrj zzrjVar;
        if (zzX()) {
            this.zzD = 0L;
            this.zzE = 0L;
            this.zzF = 0L;
            this.zzG = 0L;
            this.zzX = false;
            this.zzH = 0;
            this.zzA = new zzrh(this.zzB, 0L, 0L, null);
            this.zzK = 0L;
            this.zzz = null;
            this.zzk.clear();
            this.zzM = null;
            this.zzN = 0;
            this.zzO = null;
            this.zzQ = false;
            this.zzP = false;
            this.zzf.zzp();
            zzU();
            if (this.zzj.zzh()) {
                this.zzu.pause();
            }
            if (zzY(this.zzu)) {
                zzrp zzrpVar = this.zzl;
                Objects.requireNonNull(zzrpVar);
                zzrpVar.zzb(this.zzu);
            }
            int i = zzfx.zza;
            final zzqh zzqhVarZzb = this.zzs.zzb();
            zzre zzreVar = this.zzr;
            if (zzreVar != null) {
                this.zzs = zzreVar;
                this.zzr = null;
            }
            this.zzj.zzc();
            if (zzfx.zza >= 24 && (zzrjVar = this.zzx) != null) {
                zzrjVar.zzb();
                this.zzx = null;
            }
            final AudioTrack audioTrack = this.zzu;
            final zzeo zzeoVar = this.zzi;
            final zzqk zzqkVar = this.zzq;
            zzeoVar.zzc();
            final Handler handler = new Handler(Looper.myLooper());
            synchronized (zza) {
                if (zzb == null) {
                    zzb = zzfx.zzE("ExoPlayer:AudioTrackReleaseThread");
                }
                zzc++;
                zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzqw
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzrr.zzH(audioTrack, zzqkVar, handler, zzqhVarZzb, zzeoVar);
                    }
                });
            }
            this.zzu = null;
        }
        this.zzn.zza();
        this.zzm.zza();
        this.zzZ = 0L;
        this.zzaa = 0L;
        Handler handler2 = this.zzab;
        if (handler2 != null) {
            handler2.removeCallbacksAndMessages(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqn
    public final void zzg() {
        this.zzI = true;
    }

    @Override // com.google.android.gms.internal.ads.zzqn
    public final void zzh() throws IllegalStateException {
        this.zzR = false;
        if (zzX()) {
            if (this.zzj.zzk() || zzY(this.zzu)) {
                this.zzu.pause();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqn
    public final void zzi() throws IllegalStateException {
        this.zzR = true;
        if (zzX()) {
            this.zzj.zzf();
            this.zzu.play();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqn
    public final void zzj() throws IllegalStateException, zzqm {
        if (!this.zzP && zzX() && zzW()) {
            zzQ();
            this.zzP = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqn
    public final void zzk() {
        zzpo zzpoVar = this.zzw;
        if (zzpoVar != null) {
            zzpoVar.zzi();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqn
    public final void zzl() throws IllegalStateException {
        zzf();
        zzfzn zzfznVar = this.zzg;
        int size = zzfznVar.size();
        for (int i = 0; i < size; i++) {
            ((zzdt) zzfznVar.get(i)).zzf();
        }
        zzfzn zzfznVar2 = this.zzh;
        int size2 = zzfznVar2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((zzdt) zzfznVar2.get(i2)).zzf();
        }
        zzdq zzdqVar = this.zzt;
        if (zzdqVar != null) {
            zzdqVar.zzf();
        }
        this.zzR = false;
        this.zzW = false;
    }

    @Override // com.google.android.gms.internal.ads.zzqn
    public final void zzm(zzk zzkVar) throws IllegalStateException {
        if (this.zzy.equals(zzkVar)) {
            return;
        }
        this.zzy = zzkVar;
        zzpo zzpoVar = this.zzw;
        if (zzpoVar != null) {
            zzpoVar.zzg(zzkVar);
        }
        zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzqn
    public final void zzn(int i) throws IllegalStateException {
        if (this.zzS != i) {
            this.zzS = i;
            zzf();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqn
    public final void zzo(zzl zzlVar) {
        if (this.zzT.equals(zzlVar)) {
            return;
        }
        if (this.zzu != null) {
            int i = this.zzT.zza;
        }
        this.zzT = zzlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzqn
    public final void zzp(zzel zzelVar) {
        this.zzj.zze(zzelVar);
    }

    @Override // com.google.android.gms.internal.ads.zzqn
    public final void zzq(zzqk zzqkVar) {
        this.zzq = zzqkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzqn
    public final void zzr(int i, int i2) {
        AudioTrack audioTrack = this.zzu;
        if (audioTrack != null) {
            zzY(audioTrack);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqn
    public final void zzs(zzcg zzcgVar) {
        this.zzB = new zzcg(Math.max(0.1f, Math.min(zzcgVar.zzc, 8.0f)), Math.max(0.1f, Math.min(zzcgVar.zzd, 8.0f)));
        zzS(zzcgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzqn
    public final void zzt(zzpb zzpbVar) {
        this.zzp = zzpbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzqn
    public final void zzv(boolean z) {
        this.zzC = z;
        zzS(this.zzB);
    }

    @Override // com.google.android.gms.internal.ads.zzqn
    public final void zzw(float f) {
        if (this.zzL != f) {
            this.zzL = f;
            zzT();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0302 A[RETURN] */
    @Override // com.google.android.gms.internal.ads.zzqn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zzx(java.nio.ByteBuffer r28, long r29, int r31) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 1018
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzrr.zzx(java.nio.ByteBuffer, long, int):boolean");
    }

    @Override // com.google.android.gms.internal.ads.zzqn
    public final boolean zzy() {
        return zzX() && this.zzj.zzg(zzL());
    }

    @Override // com.google.android.gms.internal.ads.zzqn
    public final boolean zzz() {
        return !zzX() || (this.zzP && !zzy());
    }

    @Override // com.google.android.gms.internal.ads.zzqn
    public final void zzu(AudioDeviceInfo audioDeviceInfo) {
        this.zzU = audioDeviceInfo == null ? null : new zzpp(audioDeviceInfo);
        zzpo zzpoVar = this.zzw;
        if (zzpoVar != null) {
            zzpoVar.zzh(audioDeviceInfo);
        }
        AudioTrack audioTrack = this.zzu;
        if (audioTrack != null) {
            zzra.zza(audioTrack, this.zzU);
        }
    }
}
