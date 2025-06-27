package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzaag {
    private static final Comparator zza = new Comparator() { // from class: com.google.android.gms.internal.ads.zzaac
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return ((zzaaf) obj).zza - ((zzaaf) obj2).zza;
        }
    };
    private static final Comparator zzb = new Comparator() { // from class: com.google.android.gms.internal.ads.zzaad
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return Float.compare(((zzaaf) obj).zzc, ((zzaaf) obj2).zzc);
        }
    };
    private int zzf;
    private int zzg;
    private int zzh;
    private final zzaaf[] zzd = new zzaaf[5];
    private final ArrayList zzc = new ArrayList();
    private int zze = -1;

    public zzaag(int i) {
    }

    public final float zza(float f) {
        if (this.zze != 0) {
            Collections.sort(this.zzc, zzb);
            this.zze = 0;
        }
        float f2 = this.zzg;
        int i = 0;
        for (int i2 = 0; i2 < this.zzc.size(); i2++) {
            float f3 = 0.5f * f2;
            zzaaf zzaafVar = (zzaaf) this.zzc.get(i2);
            i += zzaafVar.zzb;
            if (i >= f3) {
                return zzaafVar.zzc;
            }
        }
        if (this.zzc.isEmpty()) {
            return Float.NaN;
        }
        return ((zzaaf) this.zzc.get(r6.size() - 1)).zzc;
    }

    public final void zzb(int i, float f) {
        zzaaf zzaafVar;
        if (this.zze != 1) {
            Collections.sort(this.zzc, zza);
            this.zze = 1;
        }
        int i2 = this.zzh;
        if (i2 > 0) {
            zzaaf[] zzaafVarArr = this.zzd;
            int i3 = i2 - 1;
            this.zzh = i3;
            zzaafVar = zzaafVarArr[i3];
        } else {
            zzaafVar = new zzaaf(null);
        }
        int i4 = this.zzf;
        this.zzf = i4 + 1;
        zzaafVar.zza = i4;
        zzaafVar.zzb = i;
        zzaafVar.zzc = f;
        this.zzc.add(zzaafVar);
        this.zzg += i;
        while (true) {
            int i5 = this.zzg;
            if (i5 <= 2000) {
                return;
            }
            int i6 = i5 - 2000;
            zzaaf zzaafVar2 = (zzaaf) this.zzc.get(0);
            int i7 = zzaafVar2.zzb;
            if (i7 <= i6) {
                this.zzg -= i7;
                this.zzc.remove(0);
                int i8 = this.zzh;
                if (i8 < 5) {
                    zzaaf[] zzaafVarArr2 = this.zzd;
                    this.zzh = i8 + 1;
                    zzaafVarArr2[i8] = zzaafVar2;
                }
            } else {
                zzaafVar2.zzb = i7 - i6;
                this.zzg -= i6;
            }
        }
    }

    public final void zzc() {
        this.zzc.clear();
        this.zze = -1;
        this.zzf = 0;
        this.zzg = 0;
    }
}
