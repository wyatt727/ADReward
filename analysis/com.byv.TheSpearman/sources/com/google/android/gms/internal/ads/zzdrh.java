package com.google.android.gms.internal.ads;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzdrh {
    private final zzcyo zza;
    private final zzdgl zzb;
    private final zzczx zzc;
    private final zzdak zzd;
    private final zzdaw zze;
    private final zzddk zzf;
    private final Executor zzg;
    private final zzdgh zzh;
    private final zzcqh zzi;
    private final com.google.android.gms.ads.internal.zzb zzj;
    private final zzbzo zzk;
    private final zzawo zzl;
    private final zzddb zzm;
    private final zzefd zzn;
    private final zzfmt zzo;
    private final zzduh zzp;
    private final zzcpk zzq;
    private final zzdrn zzr;

    public zzdrh(zzcyo zzcyoVar, zzczx zzczxVar, zzdak zzdakVar, zzdaw zzdawVar, zzddk zzddkVar, Executor executor, zzdgh zzdghVar, zzcqh zzcqhVar, com.google.android.gms.ads.internal.zzb zzbVar, zzbzo zzbzoVar, zzawo zzawoVar, zzddb zzddbVar, zzefd zzefdVar, zzfmt zzfmtVar, zzduh zzduhVar, zzdgl zzdglVar, zzcpk zzcpkVar, zzdrn zzdrnVar) {
        this.zza = zzcyoVar;
        this.zzc = zzczxVar;
        this.zzd = zzdakVar;
        this.zze = zzdawVar;
        this.zzf = zzddkVar;
        this.zzg = executor;
        this.zzh = zzdghVar;
        this.zzi = zzcqhVar;
        this.zzj = zzbVar;
        this.zzk = zzbzoVar;
        this.zzl = zzawoVar;
        this.zzm = zzddbVar;
        this.zzn = zzefdVar;
        this.zzo = zzfmtVar;
        this.zzp = zzduhVar;
        this.zzb = zzdglVar;
        this.zzq = zzcpkVar;
        this.zzr = zzdrnVar;
    }

    public static final ListenableFuture zzj(zzcgm zzcgmVar, String str, String str2) {
        final zzcbw zzcbwVar = new zzcbw();
        zzcgmVar.zzN().zzB(new zzcia() { // from class: com.google.android.gms.internal.ads.zzdqy
            @Override // com.google.android.gms.internal.ads.zzcia
            public final void zza(boolean z, int i, String str3, String str4) {
                zzcbw zzcbwVar2 = zzcbwVar;
                if (z) {
                    zzcbwVar2.zzc(null);
                    return;
                }
                zzcbwVar2.zzd(new Exception("Ad Web View failed to load. Error code: " + i + ", Description: " + str3 + ", Failing URL: " + str4));
            }
        });
        zzcgmVar.zzac(str, str2, null);
        return zzcbwVar;
    }

    final /* synthetic */ void zzc() {
        this.zza.onAdClicked();
    }

    final /* synthetic */ void zzd(String str, String str2) {
        this.zzf.zzb(str, str2);
    }

    final /* synthetic */ void zze() {
        this.zzc.zzb();
    }

    final /* synthetic */ void zzf(View view) {
        this.zzj.zza();
    }

    final /* synthetic */ void zzg(zzcgm zzcgmVar, zzcgm zzcgmVar2, Map map) {
        this.zzi.zzh(zzcgmVar);
    }

    final /* synthetic */ boolean zzh(View view, MotionEvent motionEvent) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzjR)).booleanValue() && motionEvent != null && motionEvent.getAction() == 0) {
            this.zzr.zzb(motionEvent);
        }
        this.zzj.zza();
        if (view == null) {
            return false;
        }
        view.performClick();
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzi(final zzcgm zzcgmVar, boolean z, zzblb zzblbVar) {
        zzawk zzawkVarZzc;
        zzcgmVar.zzN().zzR(new com.google.android.gms.ads.internal.client.zza() { // from class: com.google.android.gms.internal.ads.zzdqz
            @Override // com.google.android.gms.ads.internal.client.zza
            public final void onAdClicked() {
                this.zza.zzc();
            }
        }, this.zzd, this.zze, new zzbjq() { // from class: com.google.android.gms.internal.ads.zzdra
            @Override // com.google.android.gms.internal.ads.zzbjq
            public final void zzb(String str, String str2) {
                this.zza.zzd(str, str2);
            }
        }, new com.google.android.gms.ads.internal.overlay.zzaa() { // from class: com.google.android.gms.internal.ads.zzdrb
            @Override // com.google.android.gms.ads.internal.overlay.zzaa
            public final void zzg() {
                this.zza.zze();
            }
        }, z, zzblbVar, this.zzj, new zzdrg(this), this.zzk, this.zzn, this.zzo, this.zzp, null, this.zzb, null, null, null, this.zzq);
        zzcgmVar.setOnTouchListener(new View.OnTouchListener() { // from class: com.google.android.gms.internal.ads.zzdrc
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                this.zza.zzh(view, motionEvent);
                return false;
            }
        });
        zzcgmVar.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.gms.internal.ads.zzdrd
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.zza.zzf(view);
            }
        });
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzcy)).booleanValue() && (zzawkVarZzc = this.zzl.zzc()) != null) {
            zzawkVarZzc.zzo((View) zzcgmVar);
        }
        this.zzh.zzo(zzcgmVar, this.zzg);
        this.zzh.zzo(new zzazy() { // from class: com.google.android.gms.internal.ads.zzdre
            @Override // com.google.android.gms.internal.ads.zzazy
            public final void zzdp(zzazx zzazxVar) {
                zzcic zzcicVarZzN = zzcgmVar.zzN();
                Rect rect = zzazxVar.zzd;
                zzcicVarZzN.zzq(rect.left, rect.top, false);
            }
        }, this.zzg);
        this.zzh.zza((View) zzcgmVar);
        zzcgmVar.zzae("/trackActiveViewUnit", new zzbky() { // from class: com.google.android.gms.internal.ads.zzdrf
            @Override // com.google.android.gms.internal.ads.zzbky
            public final void zza(Object obj, Map map) {
                this.zza.zzg(zzcgmVar, (zzcgm) obj, map);
            }
        });
        this.zzi.zzi(zzcgmVar);
    }
}
