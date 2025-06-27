package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzsw extends Handler {
    final /* synthetic */ zzsy zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzsw(zzsy zzsyVar, Looper looper) {
        super(looper);
        this.zza = zzsyVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) throws MediaCodec.CryptoException {
        zzsy.zza(this.zza, message);
    }
}
