package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public class zzhid extends zzhig implements zzasc {
    zzasd zza;
    protected final String zzb = "moov";

    public zzhid(String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzasc
    public final String zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzasc
    public final void zzb(zzhih zzhihVar, ByteBuffer byteBuffer, long j, zzarz zzarzVar) throws IOException {
        zzhihVar.zzb();
        byteBuffer.remaining();
        byteBuffer.remaining();
        this.zzd = zzhihVar;
        this.zzf = zzhihVar.zzb();
        zzhihVar.zze(zzhihVar.zzb() + j);
        this.zzg = zzhihVar.zzb();
        this.zzc = zzarzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzasc
    public final void zzc(zzasd zzasdVar) {
        this.zza = zzasdVar;
    }
}
