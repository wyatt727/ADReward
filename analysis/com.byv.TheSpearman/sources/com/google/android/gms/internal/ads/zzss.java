package com.google.android.gms.internal.ads;

import android.os.HandlerThread;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzss implements zzte {
    private final zzfxh zzb;
    private final zzfxh zzc;
    private boolean zzd;

    public zzss(int i) {
        zzsq zzsqVar = new zzsq(i);
        zzsr zzsrVar = new zzsr(i);
        this.zzb = zzsqVar;
        this.zzc = zzsrVar;
        this.zzd = true;
    }

    static /* synthetic */ HandlerThread zza(int i) {
        return new HandlerThread(zzsu.zzr(i, "ExoPlayer:MediaCodecAsyncAdapter:"));
    }

    static /* synthetic */ HandlerThread zzb(int i) {
        return new HandlerThread(zzsu.zzr(i, "ExoPlayer:MediaCodecQueueingThread:"));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0039 A[Catch: Exception -> 0x0066, TryCatch #1 {Exception -> 0x0066, blocks: (B:4:0x001d, B:6:0x0021, B:9:0x002a, B:11:0x0032, B:13:0x0049, B:12:0x0039), top: B:29:0x001d }] */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.google.android.gms.internal.ads.zzst] */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.android.gms.internal.ads.zzsu] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.internal.ads.zzsu zzc(com.google.android.gms.internal.ads.zztd r7) throws java.lang.Exception {
        /*
            r6 = this;
            com.google.android.gms.internal.ads.zzti r0 = r7.zza
            java.lang.String r0 = r0.zza
            r1 = 0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L68
            r2.<init>()     // Catch: java.lang.Exception -> L68
            java.lang.String r3 = "createCodec:"
            r2.append(r3)     // Catch: java.lang.Exception -> L68
            r2.append(r0)     // Catch: java.lang.Exception -> L68
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Exception -> L68
            android.os.Trace.beginSection(r2)     // Catch: java.lang.Exception -> L68
            android.media.MediaCodec r0 = android.media.MediaCodec.createByCodecName(r0)     // Catch: java.lang.Exception -> L68
            boolean r2 = r6.zzd     // Catch: java.lang.Exception -> L66
            if (r2 == 0) goto L39
            com.google.android.gms.internal.ads.zzam r2 = r7.zzc     // Catch: java.lang.Exception -> L66
            int r3 = com.google.android.gms.internal.ads.zzfx.zza     // Catch: java.lang.Exception -> L66
            r4 = 34
            if (r3 >= r4) goto L2a
            goto L39
        L2a:
            java.lang.String r2 = r2.zzm     // Catch: java.lang.Exception -> L66
            boolean r2 = com.google.android.gms.internal.ads.zzcb.zzh(r2)     // Catch: java.lang.Exception -> L66
            if (r2 == 0) goto L39
            com.google.android.gms.internal.ads.zzuf r2 = new com.google.android.gms.internal.ads.zzuf     // Catch: java.lang.Exception -> L66
            r2.<init>(r0)     // Catch: java.lang.Exception -> L66
            r3 = 4
            goto L49
        L39:
            com.google.android.gms.internal.ads.zzsy r2 = new com.google.android.gms.internal.ads.zzsy     // Catch: java.lang.Exception -> L66
            com.google.android.gms.internal.ads.zzfxh r3 = r6.zzc     // Catch: java.lang.Exception -> L66
            com.google.android.gms.internal.ads.zzsr r3 = (com.google.android.gms.internal.ads.zzsr) r3     // Catch: java.lang.Exception -> L66
            int r3 = r3.zza     // Catch: java.lang.Exception -> L66
            android.os.HandlerThread r3 = zzb(r3)     // Catch: java.lang.Exception -> L66
            r2.<init>(r0, r3)     // Catch: java.lang.Exception -> L66
            r3 = 0
        L49:
            com.google.android.gms.internal.ads.zzsu r4 = new com.google.android.gms.internal.ads.zzsu     // Catch: java.lang.Exception -> L66
            com.google.android.gms.internal.ads.zzfxh r5 = r6.zzb     // Catch: java.lang.Exception -> L66
            com.google.android.gms.internal.ads.zzsq r5 = (com.google.android.gms.internal.ads.zzsq) r5     // Catch: java.lang.Exception -> L66
            int r5 = r5.zza     // Catch: java.lang.Exception -> L66
            android.os.HandlerThread r5 = zza(r5)     // Catch: java.lang.Exception -> L66
            r4.<init>(r0, r5, r2, r1)     // Catch: java.lang.Exception -> L66
            android.os.Trace.endSection()     // Catch: java.lang.Exception -> L63
            android.media.MediaFormat r2 = r7.zzb     // Catch: java.lang.Exception -> L63
            android.view.Surface r7 = r7.zzd     // Catch: java.lang.Exception -> L63
            com.google.android.gms.internal.ads.zzsu.zzh(r4, r2, r7, r1, r3)     // Catch: java.lang.Exception -> L63
            return r4
        L63:
            r7 = move-exception
            r1 = r4
            goto L6a
        L66:
            r7 = move-exception
            goto L6a
        L68:
            r7 = move-exception
            r0 = r1
        L6a:
            if (r1 != 0) goto L72
            if (r0 == 0) goto L75
            r0.release()
            goto L75
        L72:
            r1.zzl()
        L75:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzss.zzc(com.google.android.gms.internal.ads.zztd):com.google.android.gms.internal.ads.zzsu");
    }

    @Override // com.google.android.gms.internal.ads.zzte
    public final /* bridge */ /* synthetic */ zztf zzd(zztd zztdVar) throws IOException {
        throw null;
    }

    public final void zze(boolean z) {
        this.zzd = true;
    }
}
