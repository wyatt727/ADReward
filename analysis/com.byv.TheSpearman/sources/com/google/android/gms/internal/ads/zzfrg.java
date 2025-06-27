package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.util.Base64;
import android.view.MotionEvent;
import android.view.View;
import com.json.t2;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzfrg implements zzfps {
    private final Object zza;
    private final zzfrh zzb;
    private final zzfrs zzc;
    private final zzfpp zzd;

    zzfrg(Object obj, zzfrh zzfrhVar, zzfrs zzfrsVar, zzfpp zzfppVar) {
        this.zza = obj;
        this.zzb = zzfrhVar;
        this.zzc = zzfrsVar;
        this.zzd = zzfppVar;
    }

    private static String zzi(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        zzauv zzauvVarZza = zzauw.zza();
        zzauvVarZza.zzb(zzauk.DG);
        zzauvVarZza.zza(zzgyj.zzv(bArr, 0, bArr.length));
        return Base64.encodeToString(((zzauw) zzauvVarZza.zzbr()).zzaV(), 11);
    }

    private final synchronized byte[] zzj(Map map, Map map2) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
        } catch (Exception e) {
            this.zzd.zzc(2007, System.currentTimeMillis() - jCurrentTimeMillis, e);
            return null;
        }
        return (byte[]) this.zza.getClass().getDeclaredMethod("xss", Map.class, Map.class).invoke(this.zza, null, map2);
    }

    @Override // com.google.android.gms.internal.ads.zzfps
    public final synchronized String zza(Context context, String str, String str2, View view, Activity activity) {
        Map mapZza;
        mapZza = this.zzc.zza();
        mapZza.put("f", "c");
        mapZza.put("ctx", context);
        mapZza.put("cs", str2);
        mapZza.put("aid", null);
        mapZza.put(MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, view);
        mapZza.put("act", activity);
        return zzi(zzj(null, mapZza));
    }

    @Override // com.google.android.gms.internal.ads.zzfps
    public final synchronized String zzb(Context context, String str, View view, Activity activity) {
        Map mapZzc;
        mapZzc = this.zzc.zzc();
        mapZzc.put("f", "v");
        mapZzc.put("ctx", context);
        mapZzc.put("aid", null);
        mapZzc.put(MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, view);
        mapZzc.put("act", activity);
        return zzi(zzj(null, mapZzc));
    }

    @Override // com.google.android.gms.internal.ads.zzfps
    public final synchronized String zzc(Context context, String str) {
        Map mapZzb;
        mapZzb = this.zzc.zzb();
        mapZzb.put("f", CampaignEx.JSON_KEY_AD_Q);
        mapZzb.put("ctx", context);
        mapZzb.put("aid", null);
        return zzi(zzj(null, mapZzb));
    }

    @Override // com.google.android.gms.internal.ads.zzfps
    public final synchronized void zzd(String str, MotionEvent motionEvent) throws zzfrq {
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            HashMap map = new HashMap();
            map.put("t", new Throwable());
            map.put("aid", null);
            map.put("evt", motionEvent);
            this.zza.getClass().getDeclaredMethod("he", Map.class).invoke(this.zza, map);
            this.zzd.zzd(3003, System.currentTimeMillis() - jCurrentTimeMillis);
        } catch (Exception e) {
            throw new zzfrq(2005, e);
        }
    }

    public final synchronized int zze() throws zzfrq {
        try {
        } catch (Exception e) {
            throw new zzfrq(2006, e);
        }
        return ((Integer) this.zza.getClass().getDeclaredMethod("lcs", new Class[0]).invoke(this.zza, new Object[0])).intValue();
    }

    final zzfrh zzf() {
        return this.zzb;
    }

    public final synchronized void zzg() throws zzfrq {
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            this.zza.getClass().getDeclaredMethod("close", new Class[0]).invoke(this.zza, new Object[0]);
            this.zzd.zzd(3001, System.currentTimeMillis() - jCurrentTimeMillis);
        } catch (Exception e) {
            throw new zzfrq(2003, e);
        }
    }

    final synchronized boolean zzh() throws zzfrq {
        try {
        } catch (Exception e) {
            throw new zzfrq(2001, e);
        }
        return ((Boolean) this.zza.getClass().getDeclaredMethod(t2.a.e, new Class[0]).invoke(this.zza, new Object[0])).booleanValue();
    }
}
