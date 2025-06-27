package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import com.json.i5;
import com.json.t2;
import com.mbridge.msdk.MBridgeConstans;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Future;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzbec {
    private final String zza = (String) zzbfn.zzb.zze();
    private final Map zzb;
    private final Context zzc;
    private final String zzd;

    public zzbec(Context context, String str) {
        this.zzc = context;
        this.zzd = str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.zzb = linkedHashMap;
        linkedHashMap.put(CmcdHeadersFactory.STREAMING_FORMAT_SS, "gmob_sdk");
        linkedHashMap.put("v", "3");
        linkedHashMap.put(i5.x, Build.VERSION.RELEASE);
        linkedHashMap.put("api_v", Build.VERSION.SDK);
        com.google.android.gms.ads.internal.zzu.zzp();
        linkedHashMap.put(t2.h.G, com.google.android.gms.ads.internal.util.zzt.zzr());
        linkedHashMap.put(MBridgeConstans.DYNAMIC_VIEW_WX_APP, context.getApplicationContext() != null ? context.getApplicationContext().getPackageName() : context.getPackageName());
        com.google.android.gms.ads.internal.zzu.zzp();
        linkedHashMap.put("is_lite_sdk", true != com.google.android.gms.ads.internal.util.zzt.zzE(context) ? "0" : "1");
        Future futureZzb = com.google.android.gms.ads.internal.zzu.zzm().zzb(context);
        try {
            linkedHashMap.put("network_coarse", Integer.toString(((zzbxi) futureZzb.get()).zzk));
            linkedHashMap.put("network_fine", Integer.toString(((zzbxi) futureZzb.get()).zzl));
        } catch (Exception e) {
            com.google.android.gms.ads.internal.zzu.zzo().zzw(e, "CsiConfiguration.CsiConfiguration");
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzkY)).booleanValue()) {
            Map map = this.zzb;
            com.google.android.gms.ads.internal.zzu.zzp();
            map.put("is_bstar", true == com.google.android.gms.ads.internal.util.zzt.zzB(context) ? "1" : "0");
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzjo)).booleanValue()) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzcf)).booleanValue() || zzfxg.zzd(com.google.android.gms.ads.internal.zzu.zzo().zzn())) {
                return;
            }
            this.zzb.put(i5.B, com.google.android.gms.ads.internal.zzu.zzo().zzn());
        }
    }

    final Context zza() {
        return this.zzc;
    }

    final String zzb() {
        return this.zzd;
    }

    final String zzc() {
        return this.zza;
    }

    final Map zzd() {
        return this.zzb;
    }
}
