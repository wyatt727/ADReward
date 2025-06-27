package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzxk {
    public final int zzc;
    private final zzfzn zze;
    private int zzf;
    public static final zzxk zza = new zzxk(new zzcz[0]);
    private static final String zzd = Integer.toString(0, 36);

    @Deprecated
    public static final zzn zzb = new zzn() { // from class: com.google.android.gms.internal.ads.zzxi
    };

    /* JADX WARN: Multi-variable type inference failed */
    public zzxk(zzcz... zzczVarArr) {
        this.zze = zzfzn.zzl(zzczVarArr);
        this.zzc = zzczVarArr.length;
        int i = 0;
        while (i < this.zze.size()) {
            int i2 = i + 1;
            for (int i3 = i2; i3 < this.zze.size(); i3++) {
                if (((zzcz) this.zze.get(i)).equals(this.zze.get(i3))) {
                    zzfe.zzd("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i = i2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzxk zzxkVar = (zzxk) obj;
            if (this.zzc == zzxkVar.zzc && this.zze.equals(zzxkVar.zze)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zzf;
        if (i != 0) {
            return i;
        }
        int iHashCode = this.zze.hashCode();
        this.zzf = iHashCode;
        return iHashCode;
    }

    public final int zza(zzcz zzczVar) {
        int iIndexOf = this.zze.indexOf(zzczVar);
        if (iIndexOf >= 0) {
            return iIndexOf;
        }
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final zzcz zzb(int i) {
        return (zzcz) this.zze.get(i);
    }

    public final zzfzn zzc() {
        return zzfzn.zzk(zzgad.zzb(this.zze, new zzfwf() { // from class: com.google.android.gms.internal.ads.zzxj
            @Override // com.google.android.gms.internal.ads.zzfwf
            public final Object apply(Object obj) {
                zzxk zzxkVar = zzxk.zza;
                return Integer.valueOf(((zzcz) obj).zzd);
            }
        }));
    }
}
