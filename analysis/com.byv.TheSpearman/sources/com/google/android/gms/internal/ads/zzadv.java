package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzadv {
    private static final Pattern zzc = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");
    public int zza = -1;
    public int zzb = -1;

    private final boolean zzc(String str) throws NumberFormatException {
        Matcher matcher = zzc.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            String strGroup = matcher.group(1);
            int i = zzfx.zza;
            int i2 = Integer.parseInt(strGroup, 16);
            int i3 = Integer.parseInt(matcher.group(2), 16);
            if (i2 <= 0 && i3 <= 0) {
                return false;
            }
            this.zza = i2;
            this.zzb = i3;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public final boolean zza() {
        return (this.zza == -1 || this.zzb == -1) ? false : true;
    }

    public final boolean zzb(zzby zzbyVar) {
        for (int i = 0; i < zzbyVar.zza(); i++) {
            zzbx zzbxVarZzb = zzbyVar.zzb(i);
            if (zzbxVarZzb instanceof zzagw) {
                zzagw zzagwVar = (zzagw) zzbxVarZzb;
                if ("iTunSMPB".equals(zzagwVar.zzb) && zzc(zzagwVar.zzc)) {
                    return true;
                }
            } else if (zzbxVarZzb instanceof zzahf) {
                zzahf zzahfVar = (zzahf) zzbxVarZzb;
                if ("com.apple.iTunes".equals(zzahfVar.zza) && "iTunSMPB".equals(zzahfVar.zzb) && zzc(zzahfVar.zzc)) {
                    return true;
                }
            } else {
                continue;
            }
        }
        return false;
    }
}
