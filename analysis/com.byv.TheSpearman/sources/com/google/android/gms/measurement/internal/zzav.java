package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.zziq;
import com.json.t2;
import com.my.target.ads.Reward;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.0 */
/* loaded from: classes3.dex */
public final class zzav {
    public static final zzav zza = new zzav(null, 100);
    private final int zzb;
    private final String zzc;
    private final Boolean zzd;
    private final String zze;
    private final EnumMap<zziq.zza, zzit> zzf;

    public final int zza() {
        return this.zzb;
    }

    public final int hashCode() {
        Boolean bool = this.zzd;
        int i = bool == null ? 3 : bool == Boolean.TRUE ? 7 : 13;
        String str = this.zze;
        return this.zzc.hashCode() + (i * 29) + ((str == null ? 17 : str.hashCode()) * 137);
    }

    public final Bundle zzb() {
        Bundle bundle = new Bundle();
        Iterator it = this.zzf.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String strZzb = zziq.zzb((zzit) entry.getValue());
            if (strZzb != null) {
                bundle.putString(((zziq.zza) entry.getKey()).zze, strZzb);
            }
        }
        Boolean bool = this.zzd;
        if (bool != null) {
            bundle.putString("is_dma_region", bool.toString());
        }
        String str = this.zze;
        if (str != null) {
            bundle.putString("cps_display_str", str);
        }
        return bundle;
    }

    public static zzav zza(Bundle bundle, int i) {
        if (bundle == null) {
            return new zzav(null, i);
        }
        EnumMap enumMap = new EnumMap(zziq.zza.class);
        for (zziq.zza zzaVar : zzis.DMA.zza()) {
            enumMap.put((EnumMap) zzaVar, (zziq.zza) zziq.zza(bundle.getString(zzaVar.zze)));
        }
        return new zzav((EnumMap<zziq.zza, zzit>) enumMap, i, bundle.containsKey("is_dma_region") ? Boolean.valueOf(bundle.getString("is_dma_region")) : null, bundle.getString("cps_display_str"));
    }

    static zzav zza(zzit zzitVar, int i) {
        EnumMap enumMap = new EnumMap(zziq.zza.class);
        enumMap.put((EnumMap) zziq.zza.AD_USER_DATA, (zziq.zza) zzitVar);
        return new zzav((EnumMap<zziq.zza, zzit>) enumMap, -10, (Boolean) null, (String) null);
    }

    public static zzav zza(String str) throws NumberFormatException {
        if (str == null || str.length() <= 0) {
            return zza;
        }
        String[] strArrSplit = str.split(":");
        int i = Integer.parseInt(strArrSplit[0]);
        EnumMap enumMap = new EnumMap(zziq.zza.class);
        zziq.zza[] zzaVarArrZza = zzis.DMA.zza();
        int length = zzaVarArrZza.length;
        int i2 = 1;
        int i3 = 0;
        while (i3 < length) {
            enumMap.put((EnumMap) zzaVarArrZza[i3], (zziq.zza) zziq.zza(strArrSplit[i2].charAt(0)));
            i3++;
            i2++;
        }
        return new zzav((EnumMap<zziq.zza, zzit>) enumMap, i, (Boolean) null, (String) null);
    }

    public final zzit zzc() {
        zzit zzitVar = this.zzf.get(zziq.zza.AD_USER_DATA);
        return zzitVar == null ? zzit.UNINITIALIZED : zzitVar;
    }

    public static Boolean zza(Bundle bundle) {
        zzit zzitVarZza;
        if (bundle == null || (zzitVarZza = zziq.zza(bundle.getString("ad_personalization"))) == null) {
            return null;
        }
        int i = zzay.zza[zzitVarZza.ordinal()];
        if (i != 3) {
            return i != 4 ? null : true;
        }
        return false;
    }

    public final Boolean zzd() {
        return this.zzd;
    }

    private final String zzh() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.zzb);
        for (zziq.zza zzaVar : zzis.DMA.zza()) {
            sb.append(":");
            sb.append(zziq.zza(this.zzf.get(zzaVar)));
        }
        return sb.toString();
    }

    public final String zze() {
        return this.zze;
    }

    public final String zzf() {
        return this.zzc;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("source=");
        sb.append(zziq.zza(this.zzb));
        for (zziq.zza zzaVar : zzis.DMA.zza()) {
            sb.append(",");
            sb.append(zzaVar.zze);
            sb.append(t2.i.b);
            zzit zzitVar = this.zzf.get(zzaVar);
            if (zzitVar == null) {
                sb.append("uninitialized");
            } else {
                int i = zzay.zza[zzitVar.ordinal()];
                if (i == 1) {
                    sb.append("uninitialized");
                } else if (i == 2) {
                    sb.append(Reward.DEFAULT);
                } else if (i == 3) {
                    sb.append("denied");
                } else if (i == 4) {
                    sb.append("granted");
                }
            }
        }
        if (this.zzd != null) {
            sb.append(",isDmaRegion=");
            sb.append(this.zzd);
        }
        if (this.zze != null) {
            sb.append(",cpsDisplayStr=");
            sb.append(this.zze);
        }
        return sb.toString();
    }

    zzav(Boolean bool, int i) {
        this(bool, i, (Boolean) null, (String) null);
    }

    zzav(Boolean bool, int i, Boolean bool2, String str) {
        EnumMap<zziq.zza, zzit> enumMap = new EnumMap<>(zziq.zza.class);
        this.zzf = enumMap;
        enumMap.put((EnumMap<zziq.zza, zzit>) zziq.zza.AD_USER_DATA, (zziq.zza) zziq.zza(bool));
        this.zzb = i;
        this.zzc = zzh();
        this.zzd = bool2;
        this.zze = str;
    }

    private zzav(EnumMap<zziq.zza, zzit> enumMap, int i, Boolean bool, String str) {
        EnumMap<zziq.zza, zzit> enumMap2 = new EnumMap<>(zziq.zza.class);
        this.zzf = enumMap2;
        enumMap2.putAll(enumMap);
        this.zzb = i;
        this.zzc = zzh();
        this.zzd = bool;
        this.zze = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzav)) {
            return false;
        }
        zzav zzavVar = (zzav) obj;
        if (this.zzc.equalsIgnoreCase(zzavVar.zzc) && Objects.equals(this.zzd, zzavVar.zzd)) {
            return Objects.equals(this.zze, zzavVar.zze);
        }
        return false;
    }

    public final boolean zzg() {
        Iterator<zzit> it = this.zzf.values().iterator();
        while (it.hasNext()) {
            if (it.next() != zzit.UNINITIALIZED) {
                return true;
            }
        }
        return false;
    }
}
