package com.google.android.gms.internal.ads;

import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzdw implements zzdt {
    private int zzb;
    private float zzc = 1.0f;
    private float zzd = 1.0f;
    private zzdr zze = zzdr.zza;
    private zzdr zzf;
    private zzdr zzg;
    private zzdr zzh;
    private boolean zzi;
    private zzdv zzj;
    private ByteBuffer zzk;
    private ShortBuffer zzl;
    private ByteBuffer zzm;
    private long zzn;
    private long zzo;
    private boolean zzp;

    public zzdw() {
        zzdr zzdrVar = zzdr.zza;
        this.zzf = zzdrVar;
        this.zzg = zzdrVar;
        this.zzh = zzdrVar;
        ByteBuffer byteBuffer = zza;
        this.zzk = byteBuffer;
        this.zzl = byteBuffer.asShortBuffer();
        this.zzm = zza;
        this.zzb = -1;
    }

    @Override // com.google.android.gms.internal.ads.zzdt
    public final zzdr zza(zzdr zzdrVar) throws zzds {
        if (zzdrVar.zzd != 2) {
            throw new zzds("Unhandled input format:", zzdrVar);
        }
        int i = this.zzb;
        if (i == -1) {
            i = zzdrVar.zzb;
        }
        this.zze = zzdrVar;
        zzdr zzdrVar2 = new zzdr(i, zzdrVar.zzc, 2);
        this.zzf = zzdrVar2;
        this.zzi = true;
        return zzdrVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzdt
    public final ByteBuffer zzb() {
        int iZza;
        zzdv zzdvVar = this.zzj;
        if (zzdvVar != null && (iZza = zzdvVar.zza()) > 0) {
            if (this.zzk.capacity() < iZza) {
                ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(iZza).order(ByteOrder.nativeOrder());
                this.zzk = byteBufferOrder;
                this.zzl = byteBufferOrder.asShortBuffer();
            } else {
                this.zzk.clear();
                this.zzl.clear();
            }
            zzdvVar.zzd(this.zzl);
            this.zzo += iZza;
            this.zzk.limit(iZza);
            this.zzm = this.zzk;
        }
        ByteBuffer byteBuffer = this.zzm;
        this.zzm = zza;
        return byteBuffer;
    }

    @Override // com.google.android.gms.internal.ads.zzdt
    public final void zzc() {
        if (zzg()) {
            zzdr zzdrVar = this.zze;
            this.zzg = zzdrVar;
            this.zzh = this.zzf;
            if (this.zzi) {
                this.zzj = new zzdv(zzdrVar.zzb, zzdrVar.zzc, this.zzc, this.zzd, this.zzh.zzb);
            } else {
                zzdv zzdvVar = this.zzj;
                if (zzdvVar != null) {
                    zzdvVar.zzc();
                }
            }
        }
        this.zzm = zza;
        this.zzn = 0L;
        this.zzo = 0L;
        this.zzp = false;
    }

    @Override // com.google.android.gms.internal.ads.zzdt
    public final void zzd() {
        zzdv zzdvVar = this.zzj;
        if (zzdvVar != null) {
            zzdvVar.zze();
        }
        this.zzp = true;
    }

    @Override // com.google.android.gms.internal.ads.zzdt
    public final void zze(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            zzdv zzdvVar = this.zzj;
            Objects.requireNonNull(zzdvVar);
            ShortBuffer shortBufferAsShortBuffer = byteBuffer.asShortBuffer();
            int iRemaining = byteBuffer.remaining();
            this.zzn += iRemaining;
            zzdvVar.zzf(shortBufferAsShortBuffer);
            byteBuffer.position(byteBuffer.position() + iRemaining);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdt
    public final void zzf() {
        this.zzc = 1.0f;
        this.zzd = 1.0f;
        this.zze = zzdr.zza;
        zzdr zzdrVar = zzdr.zza;
        this.zzf = zzdrVar;
        this.zzg = zzdrVar;
        this.zzh = zzdrVar;
        ByteBuffer byteBuffer = zza;
        this.zzk = byteBuffer;
        this.zzl = byteBuffer.asShortBuffer();
        this.zzm = zza;
        this.zzb = -1;
        this.zzi = false;
        this.zzj = null;
        this.zzn = 0L;
        this.zzo = 0L;
        this.zzp = false;
    }

    @Override // com.google.android.gms.internal.ads.zzdt
    public final boolean zzg() {
        if (this.zzf.zzb == -1) {
            return false;
        }
        if (Math.abs(this.zzc - 1.0f) >= 1.0E-4f || Math.abs(this.zzd - 1.0f) >= 1.0E-4f) {
            return true;
        }
        return this.zzf.zzb != this.zze.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzdt
    public final boolean zzh() {
        zzdv zzdvVar;
        return this.zzp && ((zzdvVar = this.zzj) == null || zzdvVar.zza() == 0);
    }

    public final long zzi(long j) {
        long j2 = this.zzo;
        if (j2 < 1024) {
            return (long) (this.zzc * j);
        }
        long j3 = this.zzn;
        Objects.requireNonNull(this.zzj);
        long jZzb = j3 - r3.zzb();
        int i = this.zzh.zzb;
        int i2 = this.zzg.zzb;
        return i == i2 ? zzfx.zzt(j, jZzb, j2, RoundingMode.FLOOR) : zzfx.zzt(j, jZzb * i, j2 * i2, RoundingMode.FLOOR);
    }

    public final void zzj(float f) {
        if (this.zzd != f) {
            this.zzd = f;
            this.zzi = true;
        }
    }

    public final void zzk(float f) {
        if (this.zzc != f) {
            this.zzc = f;
            this.zzi = true;
        }
    }
}
