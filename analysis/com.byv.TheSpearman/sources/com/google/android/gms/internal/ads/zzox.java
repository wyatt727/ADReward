package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.util.Pair;
import com.google.android.exoplayer2.PlaybackException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Objects;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzox implements zzms, zzoy {
    private final Context zza;
    private final zzoz zzb;
    private final PlaybackSession zzc;
    private String zzi;
    private PlaybackMetrics.Builder zzj;
    private int zzk;
    private zzce zzn;
    private zzow zzo;
    private zzow zzp;
    private zzow zzq;
    private zzam zzr;
    private zzam zzs;
    private zzam zzt;
    private boolean zzu;
    private boolean zzv;
    private int zzw;
    private int zzx;
    private int zzy;
    private boolean zzz;
    private final zzcw zze = new zzcw();
    private final zzcu zzf = new zzcu();
    private final HashMap zzh = new HashMap();
    private final HashMap zzg = new HashMap();
    private final long zzd = SystemClock.elapsedRealtime();
    private int zzl = 0;
    private int zzm = 0;

    private zzox(Context context, PlaybackSession playbackSession) {
        this.zza = context.getApplicationContext();
        this.zzc = playbackSession;
        zzov zzovVar = new zzov(zzov.zza);
        this.zzb = zzovVar;
        zzovVar.zzh(this);
    }

    public static zzox zzb(Context context) {
        MediaMetricsManager mediaMetricsManager = (MediaMetricsManager) context.getSystemService("media_metrics");
        if (mediaMetricsManager == null) {
            return null;
        }
        return new zzox(context, mediaMetricsManager.createPlaybackSession());
    }

    private static int zzr(int i) {
        switch (zzfx.zzj(i)) {
            case 6002:
                return 24;
            case 6003:
                return 28;
            case 6004:
                return 25;
            case PlaybackException.ERROR_CODE_DRM_DISALLOWED_OPERATION /* 6005 */:
                return 26;
            default:
                return 27;
        }
    }

    private final void zzs() {
        PlaybackMetrics.Builder builder = this.zzj;
        if (builder != null && this.zzz) {
            builder.setAudioUnderrunCount(this.zzy);
            this.zzj.setVideoFramesDropped(this.zzw);
            this.zzj.setVideoFramesPlayed(this.zzx);
            Long l = (Long) this.zzg.get(this.zzi);
            this.zzj.setNetworkTransferDurationMillis(l == null ? 0L : l.longValue());
            Long l2 = (Long) this.zzh.get(this.zzi);
            this.zzj.setNetworkBytesRead(l2 == null ? 0L : l2.longValue());
            this.zzj.setStreamSource((l2 == null || l2.longValue() <= 0) ? 0 : 1);
            this.zzc.reportPlaybackMetrics(this.zzj.build());
        }
        this.zzj = null;
        this.zzi = null;
        this.zzy = 0;
        this.zzw = 0;
        this.zzx = 0;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
        this.zzz = false;
    }

    private final void zzt(long j, zzam zzamVar, int i) {
        if (zzfx.zzG(this.zzs, zzamVar)) {
            return;
        }
        int i2 = this.zzs == null ? 1 : 0;
        this.zzs = zzamVar;
        zzx(0, j, zzamVar, i2);
    }

    private final void zzu(long j, zzam zzamVar, int i) {
        if (zzfx.zzG(this.zzt, zzamVar)) {
            return;
        }
        int i2 = this.zzt == null ? 1 : 0;
        this.zzt = zzamVar;
        zzx(2, j, zzamVar, i2);
    }

    @RequiresNonNull({"metricsBuilder"})
    private final void zzv(zzcx zzcxVar, zzvh zzvhVar) {
        int iZza;
        PlaybackMetrics.Builder builder = this.zzj;
        if (zzvhVar == null || (iZza = zzcxVar.zza(zzvhVar.zza)) == -1) {
            return;
        }
        int i = 0;
        zzcxVar.zzd(iZza, this.zzf, false);
        zzcxVar.zze(this.zzf.zzd, this.zze, 0L);
        zzbi zzbiVar = this.zze.zze.zzd;
        if (zzbiVar != null) {
            int iZzn = zzfx.zzn(zzbiVar.zzb);
            i = iZzn != 0 ? iZzn != 1 ? iZzn != 2 ? 1 : 4 : 5 : 3;
        }
        builder.setStreamType(i);
        zzcw zzcwVar = this.zze;
        if (zzcwVar.zzo != -9223372036854775807L && !zzcwVar.zzm && !zzcwVar.zzj && !zzcwVar.zzb()) {
            builder.setMediaDurationMillis(zzfx.zzu(this.zze.zzo));
        }
        builder.setPlaybackType(true != this.zze.zzb() ? 1 : 2);
        this.zzz = true;
    }

    private final void zzw(long j, zzam zzamVar, int i) {
        if (zzfx.zzG(this.zzr, zzamVar)) {
            return;
        }
        int i2 = this.zzr == null ? 1 : 0;
        this.zzr = zzamVar;
        zzx(1, j, zzamVar, i2);
    }

    private final void zzx(int i, long j, zzam zzamVar, int i2) {
        TrackChangeEvent.Builder timeSinceCreatedMillis = new TrackChangeEvent.Builder(i).setTimeSinceCreatedMillis(j - this.zzd);
        if (zzamVar != null) {
            timeSinceCreatedMillis.setTrackState(1);
            timeSinceCreatedMillis.setTrackChangeReason(i2 != 1 ? 1 : 2);
            String str = zzamVar.zzl;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = zzamVar.zzm;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = zzamVar.zzj;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i3 = zzamVar.zzi;
            if (i3 != -1) {
                timeSinceCreatedMillis.setBitrate(i3);
            }
            int i4 = zzamVar.zzr;
            if (i4 != -1) {
                timeSinceCreatedMillis.setWidth(i4);
            }
            int i5 = zzamVar.zzs;
            if (i5 != -1) {
                timeSinceCreatedMillis.setHeight(i5);
            }
            int i6 = zzamVar.zzz;
            if (i6 != -1) {
                timeSinceCreatedMillis.setChannelCount(i6);
            }
            int i7 = zzamVar.zzA;
            if (i7 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i7);
            }
            String str4 = zzamVar.zzd;
            if (str4 != null) {
                int i8 = zzfx.zza;
                String[] strArrSplit = str4.split("-", -1);
                Pair pairCreate = Pair.create(strArrSplit[0], strArrSplit.length >= 2 ? strArrSplit[1] : null);
                timeSinceCreatedMillis.setLanguage((String) pairCreate.first);
                if (pairCreate.second != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) pairCreate.second);
                }
            }
            float f = zzamVar.zzt;
            if (f != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.zzz = true;
        this.zzc.reportTrackChangeEvent(timeSinceCreatedMillis.build());
    }

    @EnsuresNonNullIf(expression = {"#1"}, result = true)
    private final boolean zzy(zzow zzowVar) {
        if (zzowVar != null) {
            return zzowVar.zzc.equals(this.zzb.zze());
        }
        return false;
    }

    public final LogSessionId zza() {
        return this.zzc.getSessionId();
    }

    @Override // com.google.android.gms.internal.ads.zzoy
    public final void zzc(zzmq zzmqVar, String str) {
        zzvh zzvhVar = zzmqVar.zzd;
        if (zzvhVar == null || !zzvhVar.zzb()) {
            zzs();
            this.zzi = str;
            this.zzj = new PlaybackMetrics.Builder().setPlayerName("AndroidXMedia3").setPlayerVersion("1.3.0");
            zzv(zzmqVar.zzb, zzmqVar.zzd);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzoy
    public final void zzd(zzmq zzmqVar, String str, boolean z) {
        zzvh zzvhVar = zzmqVar.zzd;
        if ((zzvhVar == null || !zzvhVar.zzb()) && str.equals(this.zzi)) {
            zzs();
        }
        this.zzg.remove(str);
        this.zzh.remove(str);
    }

    @Override // com.google.android.gms.internal.ads.zzms
    public final /* synthetic */ void zze(zzmq zzmqVar, zzam zzamVar, zzis zzisVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzms
    public final void zzf(zzmq zzmqVar, int i, long j, long j2) {
        zzvh zzvhVar = zzmqVar.zzd;
        if (zzvhVar != null) {
            zzoz zzozVar = this.zzb;
            zzcx zzcxVar = zzmqVar.zzb;
            HashMap map = this.zzh;
            String strZzf = zzozVar.zzf(zzcxVar, zzvhVar);
            Long l = (Long) map.get(strZzf);
            Long l2 = (Long) this.zzg.get(strZzf);
            this.zzh.put(strZzf, Long.valueOf((l == null ? 0L : l.longValue()) + j));
            this.zzg.put(strZzf, Long.valueOf((l2 != null ? l2.longValue() : 0L) + i));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzms
    public final void zzg(zzmq zzmqVar, zzvd zzvdVar) {
        zzvh zzvhVar = zzmqVar.zzd;
        if (zzvhVar == null) {
            return;
        }
        zzam zzamVar = zzvdVar.zzb;
        Objects.requireNonNull(zzamVar);
        zzow zzowVar = new zzow(zzamVar, 0, this.zzb.zzf(zzmqVar.zzb, zzvhVar));
        int i = zzvdVar.zza;
        if (i != 0) {
            if (i == 1) {
                this.zzp = zzowVar;
                return;
            } else if (i != 2) {
                if (i != 3) {
                    return;
                }
                this.zzq = zzowVar;
                return;
            }
        }
        this.zzo = zzowVar;
    }

    @Override // com.google.android.gms.internal.ads.zzms
    public final /* synthetic */ void zzh(zzmq zzmqVar, int i, long j) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x029c  */
    @Override // com.google.android.gms.internal.ads.zzms
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzi(com.google.android.gms.internal.ads.zzco r21, com.google.android.gms.internal.ads.zzmr r22) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 992
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzox.zzi(com.google.android.gms.internal.ads.zzco, com.google.android.gms.internal.ads.zzmr):void");
    }

    @Override // com.google.android.gms.internal.ads.zzms
    public final void zzj(zzmq zzmqVar, zzuy zzuyVar, zzvd zzvdVar, IOException iOException, boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzms
    public final /* synthetic */ void zzk(zzmq zzmqVar, int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzms
    public final void zzl(zzmq zzmqVar, zzce zzceVar) {
        this.zzn = zzceVar;
    }

    @Override // com.google.android.gms.internal.ads.zzms
    public final void zzm(zzmq zzmqVar, zzcn zzcnVar, zzcn zzcnVar2, int i) {
        if (i == 1) {
            this.zzu = true;
            i = 1;
        }
        this.zzk = i;
    }

    @Override // com.google.android.gms.internal.ads.zzms
    public final /* synthetic */ void zzn(zzmq zzmqVar, Object obj, long j) {
    }

    @Override // com.google.android.gms.internal.ads.zzms
    public final void zzo(zzmq zzmqVar, zzir zzirVar) {
        this.zzw += zzirVar.zzg;
        this.zzx += zzirVar.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzms
    public final /* synthetic */ void zzp(zzmq zzmqVar, zzam zzamVar, zzis zzisVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzms
    public final void zzq(zzmq zzmqVar, zzdp zzdpVar) {
        zzow zzowVar = this.zzo;
        if (zzowVar != null) {
            zzam zzamVar = zzowVar.zza;
            if (zzamVar.zzs == -1) {
                zzak zzakVarZzb = zzamVar.zzb();
                zzakVarZzb.zzab(zzdpVar.zzc);
                zzakVarZzb.zzI(zzdpVar.zzd);
                this.zzo = new zzow(zzakVarZzb.zzac(), 0, zzowVar.zzc);
            }
        }
    }
}
