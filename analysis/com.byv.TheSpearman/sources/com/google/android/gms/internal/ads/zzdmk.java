package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import android.view.View;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzdmk {
    private final zzdri zza;
    private final zzdpx zzb;
    private final zzcqr zzc;
    private final zzdlg zzd;

    public zzdmk(zzdri zzdriVar, zzdpx zzdpxVar, zzcqr zzcqrVar, zzdlg zzdlgVar) {
        this.zza = zzdriVar;
        this.zzb = zzdpxVar;
        this.zzc = zzcqrVar;
        this.zzd = zzdlgVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final View zza() throws zzcgy {
        zzcgm zzcgmVarZza = this.zza.zza(com.google.android.gms.ads.internal.client.zzq.zzc(), null, null);
        View view = (View) zzcgmVarZza;
        view.setVisibility(8);
        zzcgmVarZza.zzae("/sendMessageToSdk", new zzbky() { // from class: com.google.android.gms.internal.ads.zzdmf
            @Override // com.google.android.gms.internal.ads.zzbky
            public final void zza(Object obj, Map map) {
                this.zza.zzb((zzcgm) obj, map);
            }
        });
        zzcgmVarZza.zzae("/adMuted", new zzbky() { // from class: com.google.android.gms.internal.ads.zzdmg
            @Override // com.google.android.gms.internal.ads.zzbky
            public final void zza(Object obj, Map map) {
                this.zza.zzc((zzcgm) obj, map);
            }
        });
        this.zzb.zzm(new WeakReference(zzcgmVarZza), "/loadHtml", new zzbky() { // from class: com.google.android.gms.internal.ads.zzdmh
            @Override // com.google.android.gms.internal.ads.zzbky
            public final void zza(Object obj, final Map map) {
                zzcgm zzcgmVar = (zzcgm) obj;
                zzcic zzcicVarZzN = zzcgmVar.zzN();
                final zzdmk zzdmkVar = this.zza;
                zzcicVarZzN.zzB(new zzcia() { // from class: com.google.android.gms.internal.ads.zzdme
                    @Override // com.google.android.gms.internal.ads.zzcia
                    public final void zza(boolean z, int i, String str, String str2) {
                        zzdmkVar.zzd(map, z, i, str, str2);
                    }
                });
                String str = (String) map.get("overlayHtml");
                String str2 = (String) map.get("baseUrl");
                if (TextUtils.isEmpty(str2)) {
                    zzcgmVar.loadData(str, "text/html", C.UTF8_NAME);
                } else {
                    zzcgmVar.loadDataWithBaseURL(str2, str, "text/html", C.UTF8_NAME, null);
                }
            }
        });
        this.zzb.zzm(new WeakReference(zzcgmVarZza), "/showOverlay", new zzbky() { // from class: com.google.android.gms.internal.ads.zzdmi
            @Override // com.google.android.gms.internal.ads.zzbky
            public final void zza(Object obj, Map map) {
                this.zza.zze((zzcgm) obj, map);
            }
        });
        this.zzb.zzm(new WeakReference(zzcgmVarZza), "/hideOverlay", new zzbky() { // from class: com.google.android.gms.internal.ads.zzdmj
            @Override // com.google.android.gms.internal.ads.zzbky
            public final void zza(Object obj, Map map) {
                this.zza.zzf((zzcgm) obj, map);
            }
        });
        return view;
    }

    final /* synthetic */ void zzb(zzcgm zzcgmVar, Map map) {
        this.zzb.zzj("sendMessageToNativeJs", map);
    }

    final /* synthetic */ void zzc(zzcgm zzcgmVar, Map map) {
        this.zzd.zzg();
    }

    final /* synthetic */ void zzd(Map map, boolean z, int i, String str, String str2) {
        HashMap map2 = new HashMap();
        map2.put("messageType", "htmlLoaded");
        map2.put("id", (String) map.get("id"));
        this.zzb.zzj("sendMessageToNativeJs", map2);
    }

    final /* synthetic */ void zze(zzcgm zzcgmVar, Map map) {
        com.google.android.gms.ads.internal.util.client.zzm.zzi("Showing native ads overlay.");
        zzcgmVar.zzF().setVisibility(0);
        this.zzc.zze(true);
    }

    final /* synthetic */ void zzf(zzcgm zzcgmVar, Map map) {
        com.google.android.gms.ads.internal.util.client.zzm.zzi("Hiding native ads overlay.");
        zzcgmVar.zzF().setVisibility(8);
        this.zzc.zze(false);
    }
}
