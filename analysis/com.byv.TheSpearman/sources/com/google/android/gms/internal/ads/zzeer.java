package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzeer extends zzeev {
    private final String zza;
    private final String zzb;
    private final Drawable zzc;

    zzeer(String str, String str2, Drawable drawable) {
        Objects.requireNonNull(str, "Null advertiserName");
        this.zza = str;
        Objects.requireNonNull(str2, "Null imageUrl");
        this.zzb = str2;
        this.zzc = drawable;
    }

    public final boolean equals(Object obj) {
        Drawable drawable;
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzeev) {
            zzeev zzeevVar = (zzeev) obj;
            if (this.zza.equals(zzeevVar.zzb()) && this.zzb.equals(zzeevVar.zzc()) && ((drawable = this.zzc) != null ? drawable.equals(zzeevVar.zza()) : zzeevVar.zza() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((this.zza.hashCode() ^ 1000003) * 1000003) ^ this.zzb.hashCode();
        Drawable drawable = this.zzc;
        return (iHashCode * 1000003) ^ (drawable == null ? 0 : drawable.hashCode());
    }

    public final String toString() {
        return "OfflineAdAssets{advertiserName=" + this.zza + ", imageUrl=" + this.zzb + ", icon=" + String.valueOf(this.zzc) + "}";
    }

    @Override // com.google.android.gms.internal.ads.zzeev
    final Drawable zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzeev
    final String zzb() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzeev
    final String zzc() {
        return this.zzb;
    }
}
