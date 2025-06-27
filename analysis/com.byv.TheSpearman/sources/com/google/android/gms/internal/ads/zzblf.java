package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.CollectionUtils;
import com.json.t2;
import com.vungle.ads.internal.presenter.MRAIDPresenter;
import java.util.Map;
import org.json.JSONException;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzblf implements zzbky {
    static final Map zza = CollectionUtils.mapOfKeyValueArrays(new String[]{"resize", "playVideo", "storePicture", "createCalendarEvent", MRAIDPresenter.SET_ORIENTATION_PROPERTIES, "closeResizedAd", "unload"}, new Integer[]{1, 2, 3, 4, 5, 6, 7});
    private final com.google.android.gms.ads.internal.zzb zzb;
    private final zzbtm zzc;
    private final zzbtt zzd;

    public zzblf(com.google.android.gms.ads.internal.zzb zzbVar, zzbtm zzbtmVar, zzbtt zzbttVar) {
        this.zzb = zzbVar;
        this.zzc = zzbtmVar;
        this.zzd = zzbttVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbky
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) throws JSONException {
        zzcgm zzcgmVar = (zzcgm) obj;
        int iIntValue = ((Integer) zza.get((String) map.get("a"))).intValue();
        int i = 6;
        if (iIntValue != 5) {
            if (iIntValue != 7) {
                com.google.android.gms.ads.internal.zzb zzbVar = this.zzb;
                if (!zzbVar.zzc()) {
                    zzbVar.zzb(null);
                    return;
                }
                if (iIntValue == 1) {
                    this.zzc.zzb(map);
                    return;
                }
                if (iIntValue == 3) {
                    new zzbtp(zzcgmVar, map).zzb();
                    return;
                }
                if (iIntValue == 4) {
                    new zzbtj(zzcgmVar, map).zzc();
                    return;
                } else if (iIntValue != 5) {
                    if (iIntValue == 6) {
                        this.zzc.zza(true);
                        return;
                    } else if (iIntValue != 7) {
                        com.google.android.gms.ads.internal.util.client.zzm.zzi("Unknown MRAID command called.");
                        return;
                    }
                }
            }
            this.zzd.zzc();
            return;
        }
        String str = (String) map.get("forceOrientation");
        boolean z = map.containsKey("allowOrientationChange") ? Boolean.parseBoolean((String) map.get("allowOrientationChange")) : true;
        if (zzcgmVar == null) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("AdWebView is null");
            return;
        }
        if (t2.h.D.equalsIgnoreCase(str)) {
            i = 7;
        } else if (!t2.h.C.equalsIgnoreCase(str)) {
            i = z ? -1 : 14;
        }
        zzcgmVar.zzar(i);
    }
}
