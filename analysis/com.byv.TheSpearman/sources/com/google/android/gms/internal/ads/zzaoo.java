package com.google.android.gms.internal.ads;

import androidx.core.view.InputDeviceCompat;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzaoo implements zzapb {
    private final zzaon zza;
    private final zzfo zzb = new zzfo(32);
    private int zzc;
    private int zzd;
    private boolean zze;
    private boolean zzf;

    public zzaoo(zzaon zzaonVar) {
        this.zza = zzaonVar;
    }

    @Override // com.google.android.gms.internal.ads.zzapb
    public final void zza(zzfo zzfoVar, int i) {
        int i2 = i & 1;
        int iZzd = i2 != 0 ? zzfoVar.zzd() + zzfoVar.zzm() : -1;
        if (this.zzf) {
            if (i2 == 0) {
                return;
            }
            this.zzf = false;
            zzfoVar.zzK(iZzd);
            this.zzd = 0;
        }
        while (zzfoVar.zzb() > 0) {
            int i3 = this.zzd;
            if (i3 < 3) {
                if (i3 == 0) {
                    int iZzm = zzfoVar.zzm();
                    zzfoVar.zzK(zzfoVar.zzd() - 1);
                    if (iZzm == 255) {
                        this.zzf = true;
                        return;
                    }
                }
                int iMin = Math.min(zzfoVar.zzb(), 3 - this.zzd);
                zzfoVar.zzG(this.zzb.zzM(), this.zzd, iMin);
                int i4 = this.zzd + iMin;
                this.zzd = i4;
                if (i4 == 3) {
                    this.zzb.zzK(0);
                    this.zzb.zzJ(3);
                    this.zzb.zzL(1);
                    zzfo zzfoVar2 = this.zzb;
                    int iZzm2 = zzfoVar2.zzm();
                    boolean z = (iZzm2 & 128) != 0;
                    int iZzm3 = zzfoVar2.zzm();
                    this.zze = z;
                    this.zzc = (iZzm3 | ((iZzm2 & 15) << 8)) + 3;
                    int iZzc = this.zzb.zzc();
                    int i5 = this.zzc;
                    if (iZzc < i5) {
                        int iZzc2 = this.zzb.zzc();
                        this.zzb.zzE(Math.min(InputDeviceCompat.SOURCE_TOUCHSCREEN, Math.max(i5, iZzc2 + iZzc2)));
                    }
                }
            } else {
                int iMin2 = Math.min(zzfoVar.zzb(), this.zzc - i3);
                zzfoVar.zzG(this.zzb.zzM(), this.zzd, iMin2);
                int i6 = this.zzd + iMin2;
                this.zzd = i6;
                int i7 = this.zzc;
                if (i6 != i7) {
                    continue;
                } else {
                    if (!this.zze) {
                        this.zzb.zzJ(i7);
                    } else {
                        if (zzfx.zze(this.zzb.zzM(), 0, i7, -1) != 0) {
                            this.zzf = true;
                            return;
                        }
                        this.zzb.zzJ(this.zzc - 4);
                    }
                    this.zzb.zzK(0);
                    this.zza.zza(this.zzb);
                    this.zzd = 0;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzapb
    public final void zzb(zzfv zzfvVar, zzadi zzadiVar, zzapa zzapaVar) {
        this.zza.zzb(zzfvVar, zzadiVar, zzapaVar);
        this.zzf = true;
    }

    @Override // com.google.android.gms.internal.ads.zzapb
    public final void zzc() {
        this.zzf = true;
    }
}
