package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzcen implements zzbky {
    @Override // com.google.android.gms.internal.ads.zzbky
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) throws NumberFormatException {
        zzcdn zzcdnVar = (zzcdn) obj;
        zzchm zzchmVarZzq = zzcdnVar.zzq();
        if (zzchmVarZzq == null) {
            try {
                zzchm zzchmVar = new zzchm(zzcdnVar, Float.parseFloat((String) map.get("duration")), "1".equals(map.get("customControlsAllowed")), "1".equals(map.get("clickToExpandAllowed")));
                zzcdnVar.zzC(zzchmVar);
                zzchmVarZzq = zzchmVar;
            } catch (NullPointerException e) {
                e = e;
                com.google.android.gms.ads.internal.util.client.zzm.zzh("Unable to parse videoMeta message.", e);
                com.google.android.gms.ads.internal.zzu.zzo().zzw(e, "VideoMetaGmsgHandler.onGmsg");
                return;
            } catch (NumberFormatException e2) {
                e = e2;
                com.google.android.gms.ads.internal.util.client.zzm.zzh("Unable to parse videoMeta message.", e);
                com.google.android.gms.ads.internal.zzu.zzo().zzw(e, "VideoMetaGmsgHandler.onGmsg");
                return;
            }
        }
        float f = Float.parseFloat((String) map.get("duration"));
        boolean zEquals = "1".equals(map.get("muted"));
        float f2 = Float.parseFloat((String) map.get("currentTime"));
        int i = Integer.parseInt((String) map.get("playbackState"));
        int i2 = 0;
        if (i >= 0 && i <= 3) {
            i2 = i;
        }
        String str = (String) map.get("aspectRatio");
        float f3 = TextUtils.isEmpty(str) ? 0.0f : Float.parseFloat(str);
        if (com.google.android.gms.ads.internal.util.zze.zzm(3)) {
            com.google.android.gms.ads.internal.util.client.zzm.zze("Video Meta GMSG: currentTime : " + f2 + " , duration : " + f + " , isMuted : " + zEquals + " , playbackState : " + i2 + " , aspectRatio : " + str);
        }
        zzchmVarZzq.zzc(f2, f, i2, zEquals, f3);
    }
}
