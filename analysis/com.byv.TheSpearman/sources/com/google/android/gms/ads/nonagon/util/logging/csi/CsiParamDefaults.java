package com.google.android.gms.ads.nonagon.util.logging.csi;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.zzt;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.internal.ads.zzbdq;
import com.google.android.gms.internal.ads.zzbdz;
import com.google.android.gms.internal.ads.zzfxg;
import com.json.i5;
import com.json.t2;
import com.mbridge.msdk.MBridgeConstans;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes2.dex */
public class CsiParamDefaults {
    private final Context zza;
    private final String zzb;
    private final String zzc;

    public CsiParamDefaults(Context context, VersionInfoParcel versionInfoParcel) {
        this.zza = context;
        this.zzb = context.getPackageName();
        this.zzc = versionInfoParcel.afmaVersion;
    }

    public void set(Map<String, String> map) {
        map.put(CmcdHeadersFactory.STREAMING_FORMAT_SS, "gmob_sdk");
        map.put("v", "3");
        map.put(i5.x, Build.VERSION.RELEASE);
        map.put("api_v", Build.VERSION.SDK);
        zzu.zzp();
        map.put(t2.h.G, zzt.zzr());
        map.put(MBridgeConstans.DYNAMIC_VIEW_WX_APP, this.zzb);
        zzu.zzp();
        map.put("is_lite_sdk", true != zzt.zzE(this.zza) ? "0" : "1");
        zzbdq zzbdqVar = zzbdz.zza;
        List listZzb = zzba.zza().zzb();
        if (((Boolean) zzba.zzc().zza(zzbdz.zzgX)).booleanValue()) {
            listZzb.addAll(zzu.zzo().zzi().zzg().zzd());
        }
        map.put("e", TextUtils.join(",", listZzb));
        map.put("sdkVersion", this.zzc);
        if (((Boolean) zzba.zzc().zza(zzbdz.zzkY)).booleanValue()) {
            zzu.zzp();
            map.put("is_bstar", true == zzt.zzB(this.zza) ? "1" : "0");
        }
        if (((Boolean) zzba.zzc().zza(zzbdz.zzjo)).booleanValue()) {
            if (((Boolean) zzba.zzc().zza(zzbdz.zzcf)).booleanValue()) {
                map.put(i5.B, zzfxg.zzc(zzu.zzo().zzn()));
            }
        }
    }
}
