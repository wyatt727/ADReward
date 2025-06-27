package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.common.net.HttpHeaders;
import com.mbridge.msdk.newreward.function.common.MBridgeCommon;
import java.util.HashMap;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzedl implements zzfjq {
    private static final Pattern zza = Pattern.compile("([^;]+=[^;]+)(;\\s|$)", 2);
    private final String zzb;
    private final zzfkw zzc;
    private final zzflh zzd;

    public zzedl(String str, zzflh zzflhVar, zzfkw zzfkwVar) {
        this.zzb = str;
        this.zzd = zzflhVar;
        this.zzc = zzfkwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfjq
    public final /* bridge */ /* synthetic */ Object zza(Object obj) throws Exception {
        zzdyi zzdyiVar;
        String strConcat;
        zzedk zzedkVar = (zzedk) obj;
        int iOptInt = zzedkVar.zza.optInt("http_timeout_millis", MBridgeCommon.DEFAULT_LOAD_TIMEOUT);
        zzbxg zzbxgVar = zzedkVar.zzb;
        String strJoin = "";
        if (zzbxgVar.zza() != -2) {
            if (zzbxgVar.zza() == 1) {
                if (zzbxgVar.zzh() != null) {
                    strJoin = TextUtils.join(", ", zzbxgVar.zzh());
                    com.google.android.gms.ads.internal.util.client.zzm.zzg(strJoin);
                }
                zzdyiVar = new zzdyi(2, "Error building request URL: ".concat(String.valueOf(strJoin)));
            } else {
                zzdyiVar = new zzdyi(1);
            }
            zzflh zzflhVar = this.zzd;
            zzfkw zzfkwVar = this.zzc;
            zzfkwVar.zzh(zzdyiVar);
            zzfkwVar.zzg(false);
            zzflhVar.zza(zzfkwVar);
            throw zzdyiVar;
        }
        HashMap map = new HashMap();
        if (zzedkVar.zzb.zzj() && !TextUtils.isEmpty(this.zzb)) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzaO)).booleanValue()) {
                String str = this.zzb;
                if (TextUtils.isEmpty(str)) {
                    strConcat = "";
                } else {
                    Matcher matcher = zza.matcher(str);
                    strConcat = "";
                    while (matcher.find()) {
                        String strGroup = matcher.group(1);
                        if (strGroup != null && (strGroup.toLowerCase(Locale.ROOT).startsWith("id=") || strGroup.toLowerCase(Locale.ROOT).startsWith("ide="))) {
                            if (!TextUtils.isEmpty(strConcat)) {
                                strConcat = strConcat.concat("; ");
                            }
                            strConcat = strConcat.concat(strGroup);
                        }
                    }
                }
                if (!TextUtils.isEmpty(strConcat)) {
                    map.put(HttpHeaders.COOKIE, strConcat);
                }
            } else {
                map.put(HttpHeaders.COOKIE, this.zzb);
            }
        }
        if (zzedkVar.zzb.zzk()) {
            zzedm.zza(map, zzedkVar.zza);
        }
        if (zzedkVar.zzb != null && !TextUtils.isEmpty(zzedkVar.zzb.zzf())) {
            strJoin = zzedkVar.zzb.zzf();
        }
        zzflh zzflhVar2 = this.zzd;
        zzfkw zzfkwVar2 = this.zzc;
        zzfkwVar2.zzg(true);
        zzflhVar2.zza(zzfkwVar2);
        return new zzedg(zzedkVar.zzb.zzg(), iOptInt, map, strJoin.getBytes(zzfwd.zzc), "", zzedkVar.zzb.zzk());
    }
}
