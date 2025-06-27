package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzzo {
    private int zza;
    private int zzb;
    private int zzc = 0;
    private zzzh[] zzd = new zzzh[100];

    public zzzo(boolean z, int i) {
    }

    public final synchronized int zza() {
        return this.zzb * 65536;
    }

    public final synchronized zzzh zzb() {
        zzzh zzzhVar;
        this.zzb++;
        int i = this.zzc;
        if (i > 0) {
            zzzh[] zzzhVarArr = this.zzd;
            int i2 = i - 1;
            this.zzc = i2;
            zzzhVar = zzzhVarArr[i2];
            Objects.requireNonNull(zzzhVar);
            zzzhVarArr[i2] = null;
        } else {
            zzzhVar = new zzzh(new byte[65536], 0);
            int i3 = this.zzb;
            zzzh[] zzzhVarArr2 = this.zzd;
            int length = zzzhVarArr2.length;
            if (i3 > length) {
                this.zzd = (zzzh[]) Arrays.copyOf(zzzhVarArr2, length + length);
                return zzzhVar;
            }
        }
        return zzzhVar;
    }

    public final synchronized void zzc(zzzh zzzhVar) {
        zzzh[] zzzhVarArr = this.zzd;
        int i = this.zzc;
        this.zzc = i + 1;
        zzzhVarArr[i] = zzzhVar;
        this.zzb--;
        notifyAll();
    }

    public final synchronized void zzd(zzzi zzziVar) {
        while (zzziVar != null) {
            zzzh[] zzzhVarArr = this.zzd;
            int i = this.zzc;
            this.zzc = i + 1;
            zzzhVarArr[i] = zzziVar.zzc();
            this.zzb--;
            zzziVar = zzziVar.zzd();
        }
        notifyAll();
    }

    public final synchronized void zze() {
        zzf(0);
    }

    public final synchronized void zzf(int i) {
        int i2 = this.zza;
        this.zza = i;
        if (i < i2) {
            zzg();
        }
    }

    public final synchronized void zzg() {
        int i = this.zza;
        int i2 = zzfx.zza;
        int iMax = Math.max(0, ((i + 65535) / 65536) - this.zzb);
        int i3 = this.zzc;
        if (iMax >= i3) {
            return;
        }
        Arrays.fill(this.zzd, iMax, i3, (Object) null);
        this.zzc = iMax;
    }
}
