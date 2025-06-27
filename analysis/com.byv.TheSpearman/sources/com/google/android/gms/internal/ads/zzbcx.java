package com.google.android.gms.internal.ads;

import android.os.Environment;
import android.util.Base64;
import com.google.android.gms.internal.ads.zzbdg;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzbcx {
    private final zzbdf zza;
    private final zzbdg.zzt.zza zzb;
    private final boolean zzc;

    private zzbcx() {
        this.zzb = zzbdg.zzt.zzj();
        this.zzc = false;
        this.zza = new zzbdf();
    }

    public static zzbcx zza() {
        return new zzbcx();
    }

    private final synchronized String zzd(zzbcz zzbczVar) {
        return String.format("id=%s,timestamp=%s,event=%s,data=%s\n", this.zzb.zzah(), Long.valueOf(com.google.android.gms.ads.internal.zzu.zzB().elapsedRealtime()), Integer.valueOf(zzbczVar.zza()), Base64.encodeToString(this.zzb.zzbr().zzaV(), 3));
    }

    private final synchronized void zze(zzbcz zzbczVar) {
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        if (externalStorageDirectory == null) {
            return;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(zzfsg.zza(zzfsf.zza(), externalStorageDirectory, "clearcut_events.txt", zzfsk.zza)), true);
            try {
                try {
                    fileOutputStream.write(zzd(zzbczVar).getBytes());
                } catch (IOException unused) {
                    com.google.android.gms.ads.internal.util.zze.zza("Could not write Clearcut to file.");
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused2) {
                        com.google.android.gms.ads.internal.util.zze.zza("Could not close Clearcut output stream.");
                    }
                }
            } finally {
                try {
                    fileOutputStream.close();
                } catch (IOException unused3) {
                    com.google.android.gms.ads.internal.util.zze.zza("Could not close Clearcut output stream.");
                }
            }
        } catch (FileNotFoundException unused4) {
            com.google.android.gms.ads.internal.util.zze.zza("Could not find file for Clearcut");
        }
    }

    private final synchronized void zzf(zzbcz zzbczVar) {
        zzbdg.zzt.zza zzaVar = this.zzb;
        zzaVar.zzq();
        zzaVar.zzj(com.google.android.gms.ads.internal.util.zzt.zzd());
        zzbde zzbdeVar = new zzbde(this.zza, this.zzb.zzbr().zzaV(), null);
        zzbdeVar.zza(zzbczVar.zza());
        zzbdeVar.zzc();
        com.google.android.gms.ads.internal.util.zze.zza("Logging Event with event code : ".concat(String.valueOf(Integer.toString(zzbczVar.zza(), 10))));
    }

    public final synchronized void zzb(zzbcz zzbczVar) {
        if (this.zzc) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzeR)).booleanValue()) {
                zze(zzbczVar);
            } else {
                zzf(zzbczVar);
            }
        }
    }

    public final synchronized void zzc(zzbcw zzbcwVar) {
        if (this.zzc) {
            try {
                zzbcwVar.zza(this.zzb);
            } catch (NullPointerException e) {
                com.google.android.gms.ads.internal.zzu.zzo().zzw(e, "AdMobClearcutLogger.modify");
            }
        }
    }

    public zzbcx(zzbdf zzbdfVar) {
        this.zzb = zzbdg.zzt.zzj();
        this.zza = zzbdfVar;
        this.zzc = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzeQ)).booleanValue();
    }
}
