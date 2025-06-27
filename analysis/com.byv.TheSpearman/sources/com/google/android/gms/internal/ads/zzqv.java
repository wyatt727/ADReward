package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioFormat;
import android.media.AudioManager;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzqv {
    private final Context zza;
    private Boolean zzb;

    public zzqv() {
        this.zza = null;
    }

    public zzqv(Context context) {
        this.zza = context;
    }

    public final zzps zza(zzam zzamVar, zzk zzkVar) {
        boolean zBooleanValue;
        AudioManager audioManager;
        Objects.requireNonNull(zzamVar);
        Objects.requireNonNull(zzkVar);
        if (zzfx.zza < 29 || zzamVar.zzA == -1) {
            return zzps.zza;
        }
        Context context = this.zza;
        Boolean bool = this.zzb;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            boolean z = false;
            if (context == null || (audioManager = (AudioManager) context.getSystemService("audio")) == null) {
                this.zzb = false;
            } else {
                String parameters = audioManager.getParameters("offloadVariableRateSupported");
                if (parameters != null && parameters.equals("offloadVariableRateSupported=1")) {
                    z = true;
                }
                this.zzb = Boolean.valueOf(z);
            }
            zBooleanValue = this.zzb.booleanValue();
        }
        String str = zzamVar.zzm;
        Objects.requireNonNull(str);
        int iZza = zzcb.zza(str, zzamVar.zzj);
        if (iZza == 0 || zzfx.zza < zzfx.zzg(iZza)) {
            return zzps.zza;
        }
        int iZzh = zzfx.zzh(zzamVar.zzz);
        if (iZzh == 0) {
            return zzps.zza;
        }
        try {
            AudioFormat audioFormatZzw = zzfx.zzw(zzamVar.zzA, iZzh, iZza);
            return zzfx.zza >= 31 ? zzqu.zza(audioFormatZzw, zzkVar.zza().zza, zBooleanValue) : zzqt.zza(audioFormatZzw, zzkVar.zza().zza, zBooleanValue);
        } catch (IllegalArgumentException unused) {
            return zzps.zza;
        }
    }
}
