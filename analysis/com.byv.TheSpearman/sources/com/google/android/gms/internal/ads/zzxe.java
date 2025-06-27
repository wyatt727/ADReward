package com.google.android.gms.internal.ads;

import android.util.SparseArray;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzxe {
    private int zza;
    private final SparseArray zzb;
    private final zzep zzc;

    public zzxe() {
        this(new zzep() { // from class: com.google.android.gms.internal.ads.zzxd
            @Override // com.google.android.gms.internal.ads.zzep
            public final void zza(Object obj) {
            }
        });
    }

    public final Object zzb() {
        return this.zzb.valueAt(this.zzb.size() - 1);
    }

    public final void zzc(int i, Object obj) {
        if (this.zza == -1) {
            zzek.zzf(this.zzb.size() == 0);
            this.zza = 0;
        }
        if (this.zzb.size() > 0) {
            int iKeyAt = this.zzb.keyAt(r0.size() - 1);
            zzek.zzd(i >= iKeyAt);
            if (iKeyAt == i) {
                this.zzc.zza(this.zzb.valueAt(r1.size() - 1));
            }
        }
        this.zzb.append(i, obj);
    }

    public final void zzd() {
        for (int i = 0; i < this.zzb.size(); i++) {
            this.zzc.zza(this.zzb.valueAt(i));
        }
        this.zza = -1;
        this.zzb.clear();
    }

    public final void zze(int i) {
        int i2 = 0;
        while (i2 < this.zzb.size() - 1) {
            int i3 = i2 + 1;
            if (i < this.zzb.keyAt(i3)) {
                return;
            }
            this.zzc.zza(this.zzb.valueAt(i2));
            this.zzb.removeAt(i2);
            int i4 = this.zza;
            if (i4 > 0) {
                this.zza = i4 - 1;
            }
            i2 = i3;
        }
    }

    public final boolean zzf() {
        return this.zzb.size() == 0;
    }

    public zzxe(zzep zzepVar) {
        this.zzb = new SparseArray();
        this.zzc = zzepVar;
        this.zza = -1;
    }

    public final Object zza(int i) {
        if (this.zza == -1) {
            this.zza = 0;
        }
        while (true) {
            int i2 = this.zza;
            if (i2 <= 0 || i >= this.zzb.keyAt(i2)) {
                break;
            }
            this.zza--;
        }
        while (this.zza < this.zzb.size() - 1 && i >= this.zzb.keyAt(this.zza + 1)) {
            this.zza++;
        }
        return this.zzb.valueAt(this.zza);
    }
}
