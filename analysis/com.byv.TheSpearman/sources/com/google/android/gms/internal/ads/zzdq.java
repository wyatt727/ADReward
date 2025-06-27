package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzdq {
    private final zzfzn zza;
    private final List zzb = new ArrayList();
    private ByteBuffer[] zzc = new ByteBuffer[0];
    private zzdr zzd = zzdr.zza;
    private zzdr zze = zzdr.zza;
    private boolean zzf = false;

    public zzdq(zzfzn zzfznVar) {
        this.zza = zzfznVar;
    }

    private final int zzi() {
        return this.zzc.length - 1;
    }

    private final void zzj(ByteBuffer byteBuffer) {
        boolean z;
        do {
            int i = 0;
            z = false;
            while (i <= zzi()) {
                int i2 = i + 1;
                if (!this.zzc[i].hasRemaining()) {
                    zzdt zzdtVar = (zzdt) this.zzb.get(i);
                    if (!zzdtVar.zzh()) {
                        ByteBuffer byteBuffer2 = i > 0 ? this.zzc[i - 1] : byteBuffer.hasRemaining() ? byteBuffer : zzdt.zza;
                        long jRemaining = byteBuffer2.remaining();
                        zzdtVar.zze(byteBuffer2);
                        this.zzc[i] = zzdtVar.zzb();
                        long jRemaining2 = jRemaining - byteBuffer2.remaining();
                        boolean z2 = true;
                        if (jRemaining2 <= 0 && !this.zzc[i].hasRemaining()) {
                            z2 = false;
                        }
                        z |= z2;
                    } else if (!this.zzc[i].hasRemaining() && i < zzi()) {
                        ((zzdt) this.zzb.get(i2)).zzd();
                    }
                }
                i = i2;
            }
        } while (z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzdq)) {
            return false;
        }
        zzdq zzdqVar = (zzdq) obj;
        if (this.zza.size() != zzdqVar.zza.size()) {
            return false;
        }
        for (int i = 0; i < this.zza.size(); i++) {
            if (this.zza.get(i) != zzdqVar.zza.get(i)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final zzdr zza(zzdr zzdrVar) throws zzds {
        if (zzdrVar.equals(zzdr.zza)) {
            throw new zzds("Unhandled input format:", zzdrVar);
        }
        for (int i = 0; i < this.zza.size(); i++) {
            zzdt zzdtVar = (zzdt) this.zza.get(i);
            zzdr zzdrVarZza = zzdtVar.zza(zzdrVar);
            if (zzdtVar.zzg()) {
                zzek.zzf(!zzdrVarZza.equals(zzdr.zza));
                zzdrVar = zzdrVarZza;
            }
        }
        this.zze = zzdrVar;
        return zzdrVar;
    }

    public final ByteBuffer zzb() {
        if (!zzh()) {
            return zzdt.zza;
        }
        ByteBuffer byteBuffer = this.zzc[zzi()];
        if (byteBuffer.hasRemaining()) {
            return byteBuffer;
        }
        zzj(zzdt.zza);
        return this.zzc[zzi()];
    }

    public final void zzc() {
        this.zzb.clear();
        this.zzd = this.zze;
        this.zzf = false;
        for (int i = 0; i < this.zza.size(); i++) {
            zzdt zzdtVar = (zzdt) this.zza.get(i);
            zzdtVar.zzc();
            if (zzdtVar.zzg()) {
                this.zzb.add(zzdtVar);
            }
        }
        this.zzc = new ByteBuffer[this.zzb.size()];
        for (int i2 = 0; i2 <= zzi(); i2++) {
            this.zzc[i2] = ((zzdt) this.zzb.get(i2)).zzb();
        }
    }

    public final void zzd() {
        if (!zzh() || this.zzf) {
            return;
        }
        this.zzf = true;
        ((zzdt) this.zzb.get(0)).zzd();
    }

    public final void zze(ByteBuffer byteBuffer) {
        if (!zzh() || this.zzf) {
            return;
        }
        zzj(byteBuffer);
    }

    public final void zzf() {
        for (int i = 0; i < this.zza.size(); i++) {
            zzdt zzdtVar = (zzdt) this.zza.get(i);
            zzdtVar.zzc();
            zzdtVar.zzf();
        }
        this.zzc = new ByteBuffer[0];
        this.zzd = zzdr.zza;
        this.zze = zzdr.zza;
        this.zzf = false;
    }

    public final boolean zzg() {
        return this.zzf && ((zzdt) this.zzb.get(zzi())).zzh() && !this.zzc[zzi()].hasRemaining();
    }

    public final boolean zzh() {
        return !this.zzb.isEmpty();
    }
}
