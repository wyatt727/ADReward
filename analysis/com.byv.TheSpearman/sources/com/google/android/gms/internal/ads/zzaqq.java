package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.util.Collections;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public abstract class zzaqq implements Comparable {
    private final zzarb zza;
    private final int zzb;
    private final String zzc;
    private final int zzd;
    private final Object zze;
    private final zzaqu zzf;
    private Integer zzg;
    private zzaqt zzh;
    private boolean zzi;
    private zzapz zzj;
    private zzaqp zzk;
    private final zzaqe zzl;

    public zzaqq(int i, String str, zzaqu zzaquVar) {
        Uri uri;
        String host;
        this.zza = zzarb.zza ? new zzarb() : null;
        this.zze = new Object();
        int iHashCode = 0;
        this.zzi = false;
        this.zzj = null;
        this.zzb = i;
        this.zzc = str;
        this.zzf = zzaquVar;
        this.zzl = new zzaqe();
        if (!TextUtils.isEmpty(str) && (uri = Uri.parse(str)) != null && (host = uri.getHost()) != null) {
            iHashCode = host.hashCode();
        }
        this.zzd = iHashCode;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.zzg.intValue() - ((zzaqq) obj).zzg.intValue();
    }

    public final String toString() {
        String strValueOf = String.valueOf(Integer.toHexString(this.zzd));
        zzw();
        return "[ ] " + this.zzc + " " + "0x".concat(strValueOf) + " NORMAL " + this.zzg;
    }

    public final int zza() {
        return this.zzb;
    }

    public final int zzb() {
        return this.zzl.zzb();
    }

    public final int zzc() {
        return this.zzd;
    }

    public final zzapz zzd() {
        return this.zzj;
    }

    public final zzaqq zze(zzapz zzapzVar) {
        this.zzj = zzapzVar;
        return this;
    }

    public final zzaqq zzf(zzaqt zzaqtVar) {
        this.zzh = zzaqtVar;
        return this;
    }

    public final zzaqq zzg(int i) {
        this.zzg = Integer.valueOf(i);
        return this;
    }

    protected abstract zzaqw zzh(zzaqm zzaqmVar);

    public final String zzj() {
        int i = this.zzb;
        String str = this.zzc;
        if (i == 0) {
            return str;
        }
        return Integer.toString(1) + "-" + str;
    }

    public final String zzk() {
        return this.zzc;
    }

    public Map zzl() throws zzapy {
        return Collections.emptyMap();
    }

    public final void zzm(String str) {
        if (zzarb.zza) {
            this.zza.zza(str, Thread.currentThread().getId());
        }
    }

    public final void zzn(zzaqz zzaqzVar) {
        zzaqu zzaquVar;
        synchronized (this.zze) {
            zzaquVar = this.zzf;
        }
        zzaquVar.zza(zzaqzVar);
    }

    protected abstract void zzo(Object obj);

    final void zzp(String str) {
        zzaqt zzaqtVar = this.zzh;
        if (zzaqtVar != null) {
            zzaqtVar.zzb(this);
        }
        if (zzarb.zza) {
            long id = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new zzaqo(this, str, id));
            } else {
                this.zza.zza(str, id);
                this.zza.zzb(toString());
            }
        }
    }

    public final void zzq() {
        synchronized (this.zze) {
            this.zzi = true;
        }
    }

    final void zzr() {
        zzaqp zzaqpVar;
        synchronized (this.zze) {
            zzaqpVar = this.zzk;
        }
        if (zzaqpVar != null) {
            zzaqpVar.zza(this);
        }
    }

    final void zzs(zzaqw zzaqwVar) {
        zzaqp zzaqpVar;
        synchronized (this.zze) {
            zzaqpVar = this.zzk;
        }
        if (zzaqpVar != null) {
            zzaqpVar.zzb(this, zzaqwVar);
        }
    }

    final void zzt(int i) {
        zzaqt zzaqtVar = this.zzh;
        if (zzaqtVar != null) {
            zzaqtVar.zzc(this, i);
        }
    }

    final void zzu(zzaqp zzaqpVar) {
        synchronized (this.zze) {
            this.zzk = zzaqpVar;
        }
    }

    public final boolean zzv() {
        boolean z;
        synchronized (this.zze) {
            z = this.zzi;
        }
        return z;
    }

    public final boolean zzw() {
        synchronized (this.zze) {
        }
        return false;
    }

    public byte[] zzx() throws zzapy {
        return null;
    }

    public final zzaqe zzy() {
        return this.zzl;
    }
}
