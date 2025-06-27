package com.google.android.gms.internal.ads;

import com.json.t2;
import java.nio.ByteBuffer;
import java.util.Date;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzasf extends zzhie {
    private Date zza;
    private Date zzh;
    private long zzi;
    private long zzj;
    private double zzk;
    private float zzl;
    private zzhio zzm;
    private long zzn;

    public zzasf() {
        super("mvhd");
        this.zzk = 1.0d;
        this.zzl = 1.0f;
        this.zzm = zzhio.zza;
    }

    public final String toString() {
        return "MovieHeaderBox[creationTime=" + this.zza + ";modificationTime=" + this.zzh + ";timescale=" + this.zzi + ";duration=" + this.zzj + ";rate=" + this.zzk + ";volume=" + this.zzl + ";matrix=" + this.zzm + ";nextTrackId=" + this.zzn + t2.i.e;
    }

    public final long zzd() {
        return this.zzj;
    }

    public final long zze() {
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzhic
    public final void zzf(ByteBuffer byteBuffer) {
        zzi(byteBuffer);
        if (zzh() == 1) {
            this.zza = zzhij.zza(zzasb.zzf(byteBuffer));
            this.zzh = zzhij.zza(zzasb.zzf(byteBuffer));
            this.zzi = zzasb.zze(byteBuffer);
            this.zzj = zzasb.zzf(byteBuffer);
        } else {
            this.zza = zzhij.zza(zzasb.zze(byteBuffer));
            this.zzh = zzhij.zza(zzasb.zze(byteBuffer));
            this.zzi = zzasb.zze(byteBuffer);
            this.zzj = zzasb.zze(byteBuffer);
        }
        this.zzk = zzasb.zzb(byteBuffer);
        byteBuffer.get(new byte[2]);
        this.zzl = ((short) ((r1[1] & 255) | ((short) (65280 & (r1[0] << 8))))) / 256.0f;
        zzasb.zzd(byteBuffer);
        zzasb.zze(byteBuffer);
        zzasb.zze(byteBuffer);
        this.zzm = new zzhio(zzasb.zzb(byteBuffer), zzasb.zzb(byteBuffer), zzasb.zzb(byteBuffer), zzasb.zzb(byteBuffer), zzasb.zza(byteBuffer), zzasb.zza(byteBuffer), zzasb.zza(byteBuffer), zzasb.zzb(byteBuffer), zzasb.zzb(byteBuffer));
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        this.zzn = zzasb.zze(byteBuffer);
    }
}
