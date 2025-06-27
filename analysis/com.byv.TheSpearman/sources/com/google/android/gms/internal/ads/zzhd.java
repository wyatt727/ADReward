package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.json.t2;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzhd implements zzgv {
    private final Context zza;
    private final List zzb = new ArrayList();
    private final zzgv zzc;
    private zzgv zzd;
    private zzgv zze;
    private zzgv zzf;
    private zzgv zzg;
    private zzgv zzh;
    private zzgv zzi;
    private zzgv zzj;
    private zzgv zzk;

    public zzhd(Context context, zzgv zzgvVar) {
        this.zza = context.getApplicationContext();
        this.zzc = zzgvVar;
    }

    private final zzgv zzg() {
        if (this.zze == null) {
            zzgo zzgoVar = new zzgo(this.zza);
            this.zze = zzgoVar;
            zzh(zzgoVar);
        }
        return this.zze;
    }

    private final void zzh(zzgv zzgvVar) {
        for (int i = 0; i < this.zzb.size(); i++) {
            zzgvVar.zzf((zzhy) this.zzb.get(i));
        }
    }

    private static final void zzi(zzgv zzgvVar, zzhy zzhyVar) {
        if (zzgvVar != null) {
            zzgvVar.zzf(zzhyVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgv
    public final long zzb(zzhb zzhbVar) throws IOException {
        zzgv zzgvVar;
        zzek.zzf(this.zzk == null);
        String scheme = zzhbVar.zza.getScheme();
        Uri uri = zzhbVar.zza;
        int i = zzfx.zza;
        String scheme2 = uri.getScheme();
        if (TextUtils.isEmpty(scheme2) || t2.h.b.equals(scheme2)) {
            String path = zzhbVar.zza.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                if (this.zzd == null) {
                    zzhm zzhmVar = new zzhm();
                    this.zzd = zzhmVar;
                    zzh(zzhmVar);
                }
                this.zzk = this.zzd;
            } else {
                this.zzk = zzg();
            }
        } else if ("asset".equals(scheme)) {
            this.zzk = zzg();
        } else if ("content".equals(scheme)) {
            if (this.zzf == null) {
                zzgs zzgsVar = new zzgs(this.zza);
                this.zzf = zzgsVar;
                zzh(zzgsVar);
            }
            this.zzk = this.zzf;
        } else if ("rtmp".equals(scheme)) {
            if (this.zzg == null) {
                try {
                    zzgv zzgvVar2 = (zzgv) Class.forName("androidx.media3.datasource.rtmp.RtmpDataSource").getConstructor(new Class[0]).newInstance(new Object[0]);
                    this.zzg = zzgvVar2;
                    zzh(zzgvVar2);
                } catch (ClassNotFoundException unused) {
                    zzfe.zzf("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
                } catch (Exception e) {
                    throw new RuntimeException("Error instantiating RTMP extension", e);
                }
                if (this.zzg == null) {
                    this.zzg = this.zzc;
                }
            }
            this.zzk = this.zzg;
        } else if ("udp".equals(scheme)) {
            if (this.zzh == null) {
                zzia zziaVar = new zzia(2000);
                this.zzh = zziaVar;
                zzh(zziaVar);
            }
            this.zzk = this.zzh;
        } else if ("data".equals(scheme)) {
            if (this.zzi == null) {
                zzgt zzgtVar = new zzgt();
                this.zzi = zzgtVar;
                zzh(zzgtVar);
            }
            this.zzk = this.zzi;
        } else {
            if ("rawresource".equals(scheme) || "android.resource".equals(scheme)) {
                if (this.zzj == null) {
                    zzhw zzhwVar = new zzhw(this.zza);
                    this.zzj = zzhwVar;
                    zzh(zzhwVar);
                }
                zzgvVar = this.zzj;
            } else {
                zzgvVar = this.zzc;
            }
            this.zzk = zzgvVar;
        }
        return this.zzk.zzb(zzhbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgv
    public final Uri zzc() {
        zzgv zzgvVar = this.zzk;
        if (zzgvVar == null) {
            return null;
        }
        return zzgvVar.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzgv
    public final void zzd() throws IOException {
        zzgv zzgvVar = this.zzk;
        if (zzgvVar != null) {
            try {
                zzgvVar.zzd();
            } finally {
                this.zzk = null;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgv
    public final Map zze() {
        zzgv zzgvVar = this.zzk;
        return zzgvVar == null ? Collections.emptyMap() : zzgvVar.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzu
    public final int zza(byte[] bArr, int i, int i2) throws IOException {
        zzgv zzgvVar = this.zzk;
        Objects.requireNonNull(zzgvVar);
        return zzgvVar.zza(bArr, i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzgv
    public final void zzf(zzhy zzhyVar) {
        Objects.requireNonNull(zzhyVar);
        this.zzc.zzf(zzhyVar);
        this.zzb.add(zzhyVar);
        zzi(this.zzd, zzhyVar);
        zzi(this.zze, zzhyVar);
        zzi(this.zzf, zzhyVar);
        zzi(this.zzg, zzhyVar);
        zzi(this.zzh, zzhyVar);
        zzi(this.zzi, zzhyVar);
        zzi(this.zzj, zzhyVar);
    }
}
