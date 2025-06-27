package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.os.SystemClock;
import java.lang.reflect.Method;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzqr {
    private long zzA;
    private long zzB;
    private long zzC;
    private boolean zzD;
    private long zzE;
    private long zzF;
    private boolean zzG;
    private long zzH;
    private zzel zzI;
    private final zzqq zza;
    private final long[] zzb;
    private AudioTrack zzc;
    private int zzd;
    private zzqp zze;
    private int zzf;
    private boolean zzg;
    private long zzh;
    private float zzi;
    private boolean zzj;
    private long zzk;
    private long zzl;
    private Method zzm;
    private long zzn;
    private boolean zzo;
    private boolean zzp;
    private long zzq;
    private long zzr;
    private long zzs;
    private long zzt;
    private long zzu;
    private int zzv;
    private int zzw;
    private long zzx;
    private long zzy;
    private long zzz;

    public zzqr(zzqq zzqqVar) {
        this.zza = zzqqVar;
        try {
            this.zzm = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.zzb = new long[10];
        this.zzI = zzel.zza;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0099  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final long zzl() {
        /*
            r13 = this;
            long r0 = android.os.SystemClock.elapsedRealtime()
            long r2 = r13.zzx
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            r3 = 2
            if (r2 == 0) goto L3b
            android.media.AudioTrack r2 = r13.zzc
            java.util.Objects.requireNonNull(r2)
            int r2 = r2.getPlayState()
            if (r2 != r3) goto L1e
            long r0 = r13.zzz
            return r0
        L1e:
            long r0 = com.google.android.gms.internal.ads.zzfx.zzr(r0)
            long r2 = r13.zzx
            long r0 = r0 - r2
            float r2 = r13.zzi
            long r0 = com.google.android.gms.internal.ads.zzfx.zzp(r0, r2)
            int r2 = r13.zzf
            long r0 = com.google.android.gms.internal.ads.zzfx.zzo(r0, r2)
            long r2 = r13.zzA
            long r4 = r13.zzz
            long r4 = r4 + r0
            long r0 = java.lang.Math.min(r2, r4)
            return r0
        L3b:
            long r6 = r13.zzr
            long r6 = r0 - r6
            r8 = 5
            int r2 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r2 < 0) goto La4
            android.media.AudioTrack r2 = r13.zzc
            java.util.Objects.requireNonNull(r2)
            int r6 = r2.getPlayState()
            r7 = 1
            if (r6 != r7) goto L52
            goto La2
        L52:
            int r2 = r2.getPlaybackHeadPosition()
            long r7 = (long) r2
            boolean r2 = r13.zzg
            r9 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r7 = r7 & r9
            r9 = 0
            if (r2 == 0) goto L73
            if (r6 != r3) goto L6e
            int r2 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r2 != 0) goto L6f
            long r11 = r13.zzs
            r13.zzu = r11
            goto L6f
        L6e:
            r3 = r6
        L6f:
            long r11 = r13.zzu
            long r7 = r7 + r11
            r6 = r3
        L73:
            int r2 = com.google.android.gms.internal.ads.zzfx.zza
            r3 = 29
            if (r2 > r3) goto L93
            int r2 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r2 != 0) goto L8f
            long r2 = r13.zzs
            int r2 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r2 <= 0) goto L90
            r2 = 3
            if (r6 != r2) goto L90
            long r2 = r13.zzy
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto La2
            r13.zzy = r0
            goto La2
        L8f:
            r9 = r7
        L90:
            r13.zzy = r4
            r7 = r9
        L93:
            long r2 = r13.zzs
            int r2 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r2 <= 0) goto La0
            long r2 = r13.zzt
            r4 = 1
            long r2 = r2 + r4
            r13.zzt = r2
        La0:
            r13.zzs = r7
        La2:
            r13.zzr = r0
        La4:
            long r0 = r13.zzs
            long r2 = r13.zzH
            long r0 = r0 + r2
            long r2 = r13.zzt
            r4 = 32
            long r2 = r2 << r4
            long r0 = r0 + r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzqr.zzl():long");
    }

    private final long zzm() {
        return zzfx.zzs(zzl(), this.zzf);
    }

    private final void zzn() {
        this.zzk = 0L;
        this.zzw = 0;
        this.zzv = 0;
        this.zzl = 0L;
        this.zzC = 0L;
        this.zzF = 0L;
        this.zzj = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long zza(boolean r22) {
        /*
            Method dump skipped, instructions count: 589
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzqr.zza(boolean):long");
    }

    public final void zzb(long j) {
        this.zzz = zzl();
        this.zzx = zzfx.zzr(SystemClock.elapsedRealtime());
        this.zzA = j;
    }

    public final void zzc() {
        zzn();
        this.zzc = null;
        this.zze = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzd(android.media.AudioTrack r4, boolean r5, int r6, int r7, int r8) {
        /*
            r3 = this;
            r3.zzc = r4
            r3.zzd = r8
            com.google.android.gms.internal.ads.zzqp r0 = new com.google.android.gms.internal.ads.zzqp
            r0.<init>(r4)
            r3.zze = r0
            int r4 = r4.getSampleRate()
            r3.zzf = r4
            r4 = 6
            r0 = 1
            r1 = 0
            if (r5 == 0) goto L23
            int r5 = com.google.android.gms.internal.ads.zzfx.zza
            r2 = 23
            if (r5 >= r2) goto L23
            r5 = 5
            if (r6 == r5) goto L24
            if (r6 != r4) goto L23
            r6 = r4
            goto L24
        L23:
            r0 = r1
        L24:
            r3.zzg = r0
            boolean r4 = com.google.android.gms.internal.ads.zzfx.zzK(r6)
            r3.zzp = r4
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 == 0) goto L3c
            int r8 = r8 / r7
            long r7 = (long) r8
            int r4 = r3.zzf
            long r7 = com.google.android.gms.internal.ads.zzfx.zzs(r7, r4)
            goto L3d
        L3c:
            r7 = r5
        L3d:
            r3.zzh = r7
            r7 = 0
            r3.zzs = r7
            r3.zzt = r7
            r3.zzG = r1
            r3.zzH = r7
            r3.zzu = r7
            r3.zzo = r1
            r3.zzx = r5
            r3.zzy = r5
            r3.zzq = r7
            r3.zzn = r7
            r4 = 1065353216(0x3f800000, float:1.0)
            r3.zzi = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzqr.zzd(android.media.AudioTrack, boolean, int, int, int):void");
    }

    public final void zze(zzel zzelVar) {
        this.zzI = zzelVar;
    }

    public final void zzf() {
        if (this.zzx != -9223372036854775807L) {
            this.zzx = zzfx.zzr(SystemClock.elapsedRealtime());
        }
        zzqp zzqpVar = this.zze;
        Objects.requireNonNull(zzqpVar);
        zzqpVar.zze();
    }

    public final boolean zzg(long j) {
        if (j > zzfx.zzo(zza(false), this.zzf)) {
            return true;
        }
        if (this.zzg) {
            AudioTrack audioTrack = this.zzc;
            Objects.requireNonNull(audioTrack);
            if (audioTrack.getPlayState() == 2 && zzl() == 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean zzh() {
        AudioTrack audioTrack = this.zzc;
        Objects.requireNonNull(audioTrack);
        return audioTrack.getPlayState() == 3;
    }

    public final boolean zzi(long j) {
        return this.zzy != -9223372036854775807L && j > 0 && SystemClock.elapsedRealtime() - this.zzy >= 200;
    }

    public final boolean zzj(long j) {
        AudioTrack audioTrack = this.zzc;
        Objects.requireNonNull(audioTrack);
        int playState = audioTrack.getPlayState();
        if (this.zzg) {
            if (playState == 2) {
                this.zzo = false;
                return false;
            }
            if (playState == 1) {
                if (zzl() == 0) {
                    return false;
                }
                playState = 1;
            }
        }
        boolean z = this.zzo;
        boolean zZzg = zzg(j);
        this.zzo = zZzg;
        if (z && !zZzg && playState != 1) {
            zzqq zzqqVar = this.zza;
            int i = this.zzd;
            long jZzu = zzfx.zzu(this.zzh);
            zzrm zzrmVar = (zzrm) zzqqVar;
            zzrr zzrrVar = zzrmVar.zza;
            if (zzrrVar.zzq != null) {
                ((zzrw) zzrmVar.zza.zzq).zza.zzc.zzx(i, jZzu, SystemClock.elapsedRealtime() - zzrrVar.zzV);
            }
        }
        return true;
    }

    public final boolean zzk() {
        zzn();
        if (this.zzx != -9223372036854775807L) {
            this.zzz = zzl();
            return false;
        }
        zzqp zzqpVar = this.zze;
        Objects.requireNonNull(zzqpVar);
        zzqpVar.zze();
        return true;
    }
}
