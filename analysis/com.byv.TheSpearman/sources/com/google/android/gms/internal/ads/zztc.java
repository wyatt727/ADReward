package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.os.Trace;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zztc implements zzte {
    private final Context zzb;

    @Deprecated
    public zztc() {
        this.zzb = null;
    }

    public zztc(Context context) {
        this.zzb = context;
    }

    @Override // com.google.android.gms.internal.ads.zzte
    public final zztf zzd(zztd zztdVar) throws Throwable {
        MediaCodec mediaCodecCreateByCodecName;
        Context context;
        int i = zzfx.zza;
        if (i >= 23 && (i >= 31 || ((context = this.zzb) != null && zzfx.zza >= 28 && context.getPackageManager().hasSystemFeature("com.amazon.hardware.tv_screen")))) {
            int iZzb = zzcb.zzb(zztdVar.zzc.zzm);
            zzfe.zze("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type ".concat(zzfx.zzC(iZzb)));
            zzss zzssVar = new zzss(iZzb);
            zzssVar.zze(true);
            return zzssVar.zzc(zztdVar);
        }
        MediaCodec mediaCodec = null;
        try {
            String str = zztdVar.zza.zza;
            Trace.beginSection("createCodec:".concat(str));
            mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
            Trace.endSection();
        } catch (IOException e) {
            e = e;
        } catch (RuntimeException e2) {
            e = e2;
        }
        try {
            Trace.beginSection("configureCodec");
            mediaCodecCreateByCodecName.configure(zztdVar.zzb, zztdVar.zzd, (MediaCrypto) null, 0);
            Trace.endSection();
            Trace.beginSection("startCodec");
            mediaCodecCreateByCodecName.start();
            Trace.endSection();
            return new zzue(mediaCodecCreateByCodecName, null);
        } catch (IOException | RuntimeException e3) {
            e = e3;
            mediaCodec = mediaCodecCreateByCodecName;
            if (mediaCodec != null) {
                mediaCodec.release();
            }
            throw e;
        }
    }
}
