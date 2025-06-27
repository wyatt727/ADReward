package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.0.0 */
/* loaded from: classes3.dex */
final class zzly implements zzlg {
    private final zzli zza;
    private final String zzb;
    private final Object[] zzc;
    private final int zzd;

    @Override // com.google.android.gms.internal.measurement.zzlg
    public final zzli zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzlg
    public final zzlt zzb() {
        int i = this.zzd;
        return (i & 1) != 0 ? zzlt.PROTO2 : (i & 4) == 4 ? zzlt.EDITIONS : zzlt.PROTO3;
    }

    final String zzd() {
        return this.zzb;
    }

    zzly(zzli zzliVar, String str, Object[] objArr) {
        this.zza = zzliVar;
        this.zzb = str;
        this.zzc = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.zzd = cCharAt;
            return;
        }
        int i = cCharAt & 8191;
        int i2 = 13;
        int i3 = 1;
        while (true) {
            int i4 = i3 + 1;
            char cCharAt2 = str.charAt(i3);
            if (cCharAt2 < 55296) {
                this.zzd = i | (cCharAt2 << i2);
                return;
            } else {
                i |= (cCharAt2 & 8191) << i2;
                i2 += 13;
                i3 = i4;
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzlg
    public final boolean zzc() {
        return (this.zzd & 2) == 2;
    }

    final Object[] zze() {
        return this.zzc;
    }
}
