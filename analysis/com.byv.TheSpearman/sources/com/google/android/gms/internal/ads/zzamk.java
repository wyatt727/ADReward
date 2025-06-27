package com.google.android.gms.internal.ads;

import android.text.Layout;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzamk {
    private String zza;
    private int zzb;
    private boolean zzc;
    private int zzd;
    private boolean zze;
    private float zzk;
    private String zzl;
    private Layout.Alignment zzo;
    private Layout.Alignment zzp;
    private zzamd zzr;
    private int zzf = -1;
    private int zzg = -1;
    private int zzh = -1;
    private int zzi = -1;
    private int zzj = -1;
    private int zzm = -1;
    private int zzn = -1;
    private int zzq = -1;
    private float zzs = Float.MAX_VALUE;

    public final zzamk zzA(boolean z) {
        this.zzq = z ? 1 : 0;
        return this;
    }

    public final zzamk zzB(zzamd zzamdVar) {
        this.zzr = zzamdVar;
        return this;
    }

    public final zzamk zzC(boolean z) {
        this.zzg = z ? 1 : 0;
        return this;
    }

    public final String zzD() {
        return this.zza;
    }

    public final String zzE() {
        return this.zzl;
    }

    public final boolean zzF() {
        return this.zzq == 1;
    }

    public final boolean zzG() {
        return this.zze;
    }

    public final boolean zzH() {
        return this.zzc;
    }

    public final boolean zzI() {
        return this.zzf == 1;
    }

    public final boolean zzJ() {
        return this.zzg == 1;
    }

    public final float zza() {
        return this.zzk;
    }

    public final float zzb() {
        return this.zzs;
    }

    public final int zzc() {
        if (this.zze) {
            return this.zzd;
        }
        throw new IllegalStateException("Background color has not been defined.");
    }

    public final int zzd() {
        if (this.zzc) {
            return this.zzb;
        }
        throw new IllegalStateException("Font color has not been defined.");
    }

    public final int zze() {
        return this.zzj;
    }

    public final int zzf() {
        return this.zzn;
    }

    public final int zzg() {
        return this.zzm;
    }

    public final int zzh() {
        int i = this.zzh;
        if (i == -1 && this.zzi == -1) {
            return -1;
        }
        return (i == 1 ? 1 : 0) | (this.zzi == 1 ? 2 : 0);
    }

    public final Layout.Alignment zzi() {
        return this.zzp;
    }

    public final Layout.Alignment zzj() {
        return this.zzo;
    }

    public final zzamd zzk() {
        return this.zzr;
    }

    public final zzamk zzl(zzamk zzamkVar) {
        int i;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (zzamkVar != null) {
            if (!this.zzc && zzamkVar.zzc) {
                zzo(zzamkVar.zzb);
            }
            if (this.zzh == -1) {
                this.zzh = zzamkVar.zzh;
            }
            if (this.zzi == -1) {
                this.zzi = zzamkVar.zzi;
            }
            if (this.zza == null && (str = zzamkVar.zza) != null) {
                this.zza = str;
            }
            if (this.zzf == -1) {
                this.zzf = zzamkVar.zzf;
            }
            if (this.zzg == -1) {
                this.zzg = zzamkVar.zzg;
            }
            if (this.zzn == -1) {
                this.zzn = zzamkVar.zzn;
            }
            if (this.zzo == null && (alignment2 = zzamkVar.zzo) != null) {
                this.zzo = alignment2;
            }
            if (this.zzp == null && (alignment = zzamkVar.zzp) != null) {
                this.zzp = alignment;
            }
            if (this.zzq == -1) {
                this.zzq = zzamkVar.zzq;
            }
            if (this.zzj == -1) {
                this.zzj = zzamkVar.zzj;
                this.zzk = zzamkVar.zzk;
            }
            if (this.zzr == null) {
                this.zzr = zzamkVar.zzr;
            }
            if (this.zzs == Float.MAX_VALUE) {
                this.zzs = zzamkVar.zzs;
            }
            if (!this.zze && zzamkVar.zze) {
                zzm(zzamkVar.zzd);
            }
            if (this.zzm == -1 && (i = zzamkVar.zzm) != -1) {
                this.zzm = i;
            }
        }
        return this;
    }

    public final zzamk zzm(int i) {
        this.zzd = i;
        this.zze = true;
        return this;
    }

    public final zzamk zzn(boolean z) {
        this.zzh = z ? 1 : 0;
        return this;
    }

    public final zzamk zzo(int i) {
        this.zzb = i;
        this.zzc = true;
        return this;
    }

    public final zzamk zzp(String str) {
        this.zza = str;
        return this;
    }

    public final zzamk zzq(float f) {
        this.zzk = f;
        return this;
    }

    public final zzamk zzr(int i) {
        this.zzj = i;
        return this;
    }

    public final zzamk zzs(String str) {
        this.zzl = str;
        return this;
    }

    public final zzamk zzt(boolean z) {
        this.zzi = z ? 1 : 0;
        return this;
    }

    public final zzamk zzu(boolean z) {
        this.zzf = z ? 1 : 0;
        return this;
    }

    public final zzamk zzv(Layout.Alignment alignment) {
        this.zzp = alignment;
        return this;
    }

    public final zzamk zzw(int i) {
        this.zzn = i;
        return this;
    }

    public final zzamk zzx(int i) {
        this.zzm = i;
        return this;
    }

    public final zzamk zzy(float f) {
        this.zzs = f;
        return this;
    }

    public final zzamk zzz(Layout.Alignment alignment) {
        this.zzo = alignment;
        return this;
    }
}
