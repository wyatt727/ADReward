package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.util.Map;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzuj implements zzvz {
    private final zzadm zza;
    private zzadf zzb;
    private zzadg zzc;

    public zzuj(zzadm zzadmVar) {
        this.zza = zzadmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final long zzb() {
        zzadg zzadgVar = this.zzc;
        if (zzadgVar != null) {
            return zzadgVar.zzf();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final void zzc() {
        zzadf zzadfVar = this.zzb;
        if (zzadfVar != null && (zzadfVar instanceof zzais)) {
            ((zzais) zzadfVar).zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final void zzd(zzu zzuVar, Uri uri, Map map, long j, long j2, zzadi zzadiVar) throws IOException {
        zzact zzactVar = new zzact(zzuVar, j, j2);
        this.zzc = zzactVar;
        if (this.zzb != null) {
            return;
        }
        zzadf[] zzadfVarArrZza = this.zza.zza(uri, map);
        int length = zzadfVarArrZza.length;
        zzfzk zzfzkVarZzi = zzfzn.zzi(length);
        int i = 0;
        boolean z = true;
        if (length == 1) {
            this.zzb = zzadfVarArrZza[0];
        } else {
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                }
                zzadf zzadfVar = zzadfVarArrZza[i2];
                try {
                } catch (EOFException unused) {
                    if (this.zzb != null || zzactVar.zzf() == j) {
                    }
                } catch (Throwable th) {
                    zzek.zzf(this.zzb != null || zzactVar.zzf() == j);
                    zzactVar.zzj();
                    throw th;
                }
                if (zzadfVar.zzf(zzactVar)) {
                    this.zzb = zzadfVar;
                    if (zzadfVar == null && zzactVar.zzf() != j) {
                        z = false;
                    }
                    zzek.zzf(z);
                    zzactVar.zzj();
                } else {
                    zzfzkVarZzi.zzh(zzadfVar.zzc());
                    boolean z2 = this.zzb != null || zzactVar.zzf() == j;
                    zzek.zzf(z2);
                    zzactVar.zzj();
                    i2++;
                }
            }
            if (this.zzb == null) {
                StringBuilder sb = new StringBuilder();
                while (true) {
                    int length2 = zzadfVarArrZza.length;
                    if (i >= length2) {
                        throw new zzxl("None of the available extractors (" + sb.toString() + ") could read the stream.", uri, zzfzkVarZzi.zzi());
                    }
                    sb.append(zzadfVarArrZza[i].getClass().getSimpleName());
                    if (i < length2 - 1) {
                        sb.append(", ");
                    }
                    i++;
                }
            }
        }
        this.zzb.zzd(zzadiVar);
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final void zze() {
        if (this.zzb != null) {
            this.zzb = null;
        }
        this.zzc = null;
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final int zza(zzaec zzaecVar) throws IOException {
        zzadf zzadfVar = this.zzb;
        Objects.requireNonNull(zzadfVar);
        zzadg zzadgVar = this.zzc;
        Objects.requireNonNull(zzadgVar);
        return zzadfVar.zzb(zzadgVar, zzaecVar);
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final void zzf(long j, long j2) {
        zzadf zzadfVar = this.zzb;
        Objects.requireNonNull(zzadfVar);
        zzadfVar.zze(j, j2);
    }
}
