package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzbcq extends PushbackInputStream {
    final /* synthetic */ zzbcr zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzbcq(zzbcr zzbcrVar, InputStream inputStream, int i) {
        super(inputStream, 1);
        this.zza = zzbcrVar;
    }

    @Override // java.io.PushbackInputStream, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() throws IOException {
        zzbct.zze(this.zza.zzc);
        super.close();
    }
}
