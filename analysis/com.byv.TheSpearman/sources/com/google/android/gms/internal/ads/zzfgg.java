package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzfgg {
    private com.google.android.gms.ads.internal.client.zzl zza;
    private com.google.android.gms.ads.internal.client.zzq zzb;
    private String zzc;
    private com.google.android.gms.ads.internal.client.zzfk zzd;
    private boolean zze;
    private ArrayList zzf;
    private ArrayList zzg;
    private zzbgt zzh;
    private com.google.android.gms.ads.internal.client.zzw zzi;
    private AdManagerAdViewOptions zzj;
    private PublisherAdViewOptions zzk;
    private com.google.android.gms.ads.internal.client.zzcb zzl;
    private zzbni zzn;
    private zzeoa zzq;
    private Bundle zzs;
    private com.google.android.gms.ads.internal.client.zzcf zzt;
    private int zzm = 1;
    private final zzfft zzo = new zzfft();
    private boolean zzp = false;
    private boolean zzr = false;

    public final zzfgg zzA(boolean z) {
        this.zze = z;
        return this;
    }

    public final zzfgg zzB(int i) {
        this.zzm = i;
        return this;
    }

    public final zzfgg zzC(zzbgt zzbgtVar) {
        this.zzh = zzbgtVar;
        return this;
    }

    public final zzfgg zzD(ArrayList arrayList) {
        this.zzf = arrayList;
        return this;
    }

    public final zzfgg zzE(ArrayList arrayList) {
        this.zzg = arrayList;
        return this;
    }

    public final zzfgg zzF(PublisherAdViewOptions publisherAdViewOptions) {
        this.zzk = publisherAdViewOptions;
        if (publisherAdViewOptions != null) {
            this.zze = publisherAdViewOptions.zzc();
            this.zzl = publisherAdViewOptions.zza();
        }
        return this;
    }

    public final zzfgg zzG(com.google.android.gms.ads.internal.client.zzl zzlVar) {
        this.zza = zzlVar;
        return this;
    }

    public final zzfgg zzH(com.google.android.gms.ads.internal.client.zzfk zzfkVar) {
        this.zzd = zzfkVar;
        return this;
    }

    public final zzfgi zzI() {
        Preconditions.checkNotNull(this.zzc, "ad unit must not be null");
        Preconditions.checkNotNull(this.zzb, "ad size must not be null");
        Preconditions.checkNotNull(this.zza, "ad request must not be null");
        return new zzfgi(this, null);
    }

    public final String zzK() {
        return this.zzc;
    }

    public final boolean zzQ() {
        return this.zzp;
    }

    public final zzfgg zzS(com.google.android.gms.ads.internal.client.zzcf zzcfVar) {
        this.zzt = zzcfVar;
        return this;
    }

    public final com.google.android.gms.ads.internal.client.zzl zzf() {
        return this.zza;
    }

    public final com.google.android.gms.ads.internal.client.zzq zzh() {
        return this.zzb;
    }

    public final zzfft zzp() {
        return this.zzo;
    }

    public final zzfgg zzq(zzfgi zzfgiVar) {
        this.zzo.zza(zzfgiVar.zzo.zza);
        this.zza = zzfgiVar.zzd;
        this.zzb = zzfgiVar.zze;
        this.zzt = zzfgiVar.zzs;
        this.zzc = zzfgiVar.zzf;
        this.zzd = zzfgiVar.zza;
        this.zzf = zzfgiVar.zzg;
        this.zzg = zzfgiVar.zzh;
        this.zzh = zzfgiVar.zzi;
        this.zzi = zzfgiVar.zzj;
        zzr(zzfgiVar.zzl);
        zzF(zzfgiVar.zzm);
        this.zzp = zzfgiVar.zzp;
        this.zzq = zzfgiVar.zzc;
        this.zzr = zzfgiVar.zzq;
        this.zzs = zzfgiVar.zzr;
        return this;
    }

    public final zzfgg zzr(AdManagerAdViewOptions adManagerAdViewOptions) {
        this.zzj = adManagerAdViewOptions;
        if (adManagerAdViewOptions != null) {
            this.zze = adManagerAdViewOptions.getManualImpressionsEnabled();
        }
        return this;
    }

    public final zzfgg zzs(com.google.android.gms.ads.internal.client.zzq zzqVar) {
        this.zzb = zzqVar;
        return this;
    }

    public final zzfgg zzt(String str) {
        this.zzc = str;
        return this;
    }

    public final zzfgg zzu(com.google.android.gms.ads.internal.client.zzw zzwVar) {
        this.zzi = zzwVar;
        return this;
    }

    public final zzfgg zzv(zzeoa zzeoaVar) {
        this.zzq = zzeoaVar;
        return this;
    }

    public final zzfgg zzw(zzbni zzbniVar) {
        this.zzn = zzbniVar;
        this.zzd = new com.google.android.gms.ads.internal.client.zzfk(false, true, false);
        return this;
    }

    public final zzfgg zzx(boolean z) {
        this.zzp = z;
        return this;
    }

    public final zzfgg zzy(boolean z) {
        this.zzr = true;
        return this;
    }

    public final zzfgg zzz(Bundle bundle) {
        this.zzs = bundle;
        return this;
    }
}
