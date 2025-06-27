package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzbkg implements zzbky {
    zzbkg() {
    }

    @Override // com.google.android.gms.internal.ads.zzbky
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) throws NumberFormatException {
        zzcgm zzcgmVar = (zzcgm) obj;
        if (TextUtils.isEmpty((CharSequence) map.get(RemoteConfigConstants.RequestFieldKey.APP_ID))) {
            com.google.android.gms.ads.internal.util.zze.zza("Missing App Id, cannot show LMD Overlay without it");
            return;
        }
        zzfuz zzfuzVarZzm = zzfva.zzm();
        zzfuzVarZzm.zzb((String) map.get(RemoteConfigConstants.RequestFieldKey.APP_ID));
        zzfuzVarZzm.zzi(zzcgmVar.getWidth());
        zzfuzVarZzm.zzh(zzcgmVar.zzF().getWindowToken());
        if (map.containsKey("gravityX") && map.containsKey("gravityY")) {
            zzfuzVarZzm.zzd(Integer.parseInt((String) map.get("gravityX")) | Integer.parseInt((String) map.get("gravityY")));
        } else {
            zzfuzVarZzm.zzd(81);
        }
        if (map.containsKey("verticalMargin")) {
            zzfuzVarZzm.zze(Float.parseFloat((String) map.get("verticalMargin")));
        } else {
            zzfuzVarZzm.zze(0.02f);
        }
        if (map.containsKey("enifd")) {
            zzfuzVarZzm.zza((String) map.get("enifd"));
        }
        try {
            com.google.android.gms.ads.internal.zzu.zzj().zzj(zzcgmVar, zzfuzVarZzm.zzj());
        } catch (NullPointerException e) {
            com.google.android.gms.ads.internal.zzu.zzo().zzw(e, "DefaultGmsgHandlers.ShowLMDOverlay");
            com.google.android.gms.ads.internal.util.zze.zza("Missing parameters for LMD Overlay show request");
        }
    }
}
