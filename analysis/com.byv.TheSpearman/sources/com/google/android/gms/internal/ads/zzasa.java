package com.google.android.gms.internal.ads;

import java.io.Closeable;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzasa extends zzhig implements Closeable {
    private static final zzhin zza = zzhin.zzb(zzasa.class);

    public zzasa(zzhih zzhihVar, zzarz zzarzVar) throws IOException {
        zzf(zzhihVar, zzhihVar.zzc(), zzarzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhig, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
    }

    @Override // com.google.android.gms.internal.ads.zzhig
    public final String toString() {
        String string = this.zzd.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 7);
        sb.append("model(");
        sb.append(string);
        sb.append(")");
        return sb.toString();
    }
}
