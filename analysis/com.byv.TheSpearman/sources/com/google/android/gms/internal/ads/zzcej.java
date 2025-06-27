package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzcej {
    private long zza;

    public final long zza(ByteBuffer byteBuffer) {
        zzasf zzasfVar;
        zzase zzaseVar;
        long j = this.zza;
        if (j > 0) {
            return j;
        }
        try {
            ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
            byteBufferDuplicate.flip();
            Iterator it = new zzasa(new zzcei(byteBufferDuplicate), zzcel.zzb).zze().iterator();
            while (true) {
                zzasfVar = null;
                if (!it.hasNext()) {
                    zzaseVar = null;
                    break;
                }
                zzasc zzascVar = (zzasc) it.next();
                if (zzascVar instanceof zzase) {
                    zzaseVar = (zzase) zzascVar;
                    break;
                }
            }
            Iterator it2 = zzaseVar.zze().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                zzasc zzascVar2 = (zzasc) it2.next();
                if (zzascVar2 instanceof zzasf) {
                    zzasfVar = (zzasf) zzascVar2;
                    break;
                }
            }
            long jZzd = (zzasfVar.zzd() * 1000) / zzasfVar.zze();
            this.zza = jZzd;
            return jZzd;
        } catch (IOException | RuntimeException unused) {
            return 0L;
        }
    }
}
