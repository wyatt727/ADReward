package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.json.t2;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzaqi {
    private final String zza;
    private final String zzb;

    public zzaqi(String str, String str2) {
        this.zza = str;
        this.zzb = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzaqi zzaqiVar = (zzaqi) obj;
            if (TextUtils.equals(this.zza, zzaqiVar.zza) && TextUtils.equals(this.zzb, zzaqiVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.zza.hashCode() * 31) + this.zzb.hashCode();
    }

    public final String toString() {
        return "Header[name=" + this.zza + ",value=" + this.zzb + t2.i.e;
    }

    public final String zza() {
        return this.zza;
    }

    public final String zzb() {
        return this.zzb;
    }
}
