package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzip {
    private final AudioManager zza;
    private final zzin zzb;
    private zzio zzc;
    private int zzd;
    private float zze = 1.0f;

    public zzip(Context context, Handler handler, zzio zzioVar) {
        AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
        Objects.requireNonNull(audioManager);
        this.zza = audioManager;
        this.zzc = zzioVar;
        this.zzb = new zzin(this, handler);
        this.zzd = 0;
    }

    private final void zze() {
        if (this.zzd == 0) {
            return;
        }
        if (zzfx.zza < 26) {
            this.zza.abandonAudioFocus(this.zzb);
        }
        zzg(0);
    }

    private final void zzf(int i) {
        zzio zzioVar = this.zzc;
        if (zzioVar != null) {
            zzkk zzkkVar = (zzkk) zzioVar;
            boolean zZzv = zzkkVar.zza.zzv();
            zzkkVar.zza.zzak(zZzv, i, zzko.zzX(zZzv, i));
        }
    }

    private final void zzg(int i) {
        if (this.zzd == i) {
            return;
        }
        this.zzd = i;
        float f = i == 3 ? 0.2f : 1.0f;
        if (this.zze != f) {
            this.zze = f;
            zzio zzioVar = this.zzc;
            if (zzioVar != null) {
                ((zzkk) zzioVar).zza.zzah();
            }
        }
    }

    public final float zza() {
        return this.zze;
    }

    public final int zzb(boolean z, int i) {
        zze();
        return z ? 1 : -1;
    }

    public final void zzd() {
        this.zzc = null;
        zze();
    }

    static /* bridge */ /* synthetic */ void zzc(zzip zzipVar, int i) {
        if (i == -3 || i == -2) {
            if (i != -2) {
                zzipVar.zzg(3);
                return;
            } else {
                zzipVar.zzf(0);
                zzipVar.zzg(2);
                return;
            }
        }
        if (i == -1) {
            zzipVar.zzf(-1);
            zzipVar.zze();
        } else if (i == 1) {
            zzipVar.zzg(1);
            zzipVar.zzf(1);
        } else {
            zzfe.zzf("AudioFocusManager", "Unknown focus change type: " + i);
        }
    }
}
