package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public abstract class zzhic implements zzasc {
    private static final zzhin zza = zzhin.zzb(zzhic.class);
    protected final String zzb;
    long zze;
    zzhih zzg;
    private zzasd zzh;
    private ByteBuffer zzi;
    long zzf = -1;
    private ByteBuffer zzj = null;
    boolean zzd = true;
    boolean zzc = true;

    protected zzhic(String str) {
        this.zzb = str;
    }

    private final synchronized void zzd() {
        if (this.zzd) {
            return;
        }
        try {
            zzhin zzhinVar = zza;
            String str = this.zzb;
            zzhinVar.zza(str.length() != 0 ? "mem mapping ".concat(str) : new String("mem mapping "));
            this.zzi = this.zzg.zzd(this.zze, this.zzf);
            this.zzd = true;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzasc
    public final String zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzasc
    public final void zzb(zzhih zzhihVar, ByteBuffer byteBuffer, long j, zzarz zzarzVar) throws IOException {
        this.zze = zzhihVar.zzb();
        byteBuffer.remaining();
        this.zzf = j;
        this.zzg = zzhihVar;
        zzhihVar.zze(zzhihVar.zzb() + j);
        this.zzd = false;
        this.zzc = false;
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzasc
    public final void zzc(zzasd zzasdVar) {
        this.zzh = zzasdVar;
    }

    protected abstract void zzf(ByteBuffer byteBuffer);

    public final synchronized void zzg() {
        zzd();
        zzhin zzhinVar = zza;
        String str = this.zzb;
        zzhinVar.zza(str.length() != 0 ? "parsing details of ".concat(str) : new String("parsing details of "));
        ByteBuffer byteBuffer = this.zzi;
        if (byteBuffer != null) {
            this.zzc = true;
            byteBuffer.rewind();
            zzf(byteBuffer);
            if (byteBuffer.remaining() > 0) {
                this.zzj = byteBuffer.slice();
            }
            this.zzi = null;
        }
    }
}
