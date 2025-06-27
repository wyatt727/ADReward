package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzfoz implements zzfnz {
    private static final zzfoz zza = new zzfoz();
    private static final Handler zzb = new Handler(Looper.getMainLooper());
    private static Handler zzc = null;
    private static final Runnable zzd = new zzfov();
    private static final Runnable zze = new zzfow();
    private int zzg;
    private long zzm;
    private final List zzf = new ArrayList();
    private boolean zzh = false;
    private final List zzi = new ArrayList();
    private final zzfos zzk = new zzfos();
    private final zzfob zzj = new zzfob();
    private final zzfot zzl = new zzfot(new zzfpc());

    zzfoz() {
    }

    public static zzfoz zzd() {
        return zza;
    }

    static /* bridge */ /* synthetic */ void zzg(zzfoz zzfozVar) throws JSONException {
        zzfozVar.zzg = 0;
        zzfozVar.zzi.clear();
        zzfozVar.zzh = false;
        for (zzfnc zzfncVar : zzfnq.zza().zzb()) {
        }
        zzfozVar.zzm = System.nanoTime();
        zzfozVar.zzk.zzi();
        long jNanoTime = System.nanoTime();
        zzfoa zzfoaVarZza = zzfozVar.zzj.zza();
        if (zzfozVar.zzk.zze().size() > 0) {
            Iterator it = zzfozVar.zzk.zze().iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                JSONObject jSONObjectZza = zzfoaVarZza.zza(null);
                View viewZza = zzfozVar.zzk.zza(str);
                zzfoa zzfoaVarZzb = zzfozVar.zzj.zzb();
                String strZzc = zzfozVar.zzk.zzc(str);
                if (strZzc != null) {
                    JSONObject jSONObjectZza2 = zzfoaVarZzb.zza(viewZza);
                    zzfok.zzb(jSONObjectZza2, str);
                    try {
                        jSONObjectZza2.put("notVisibleReason", strZzc);
                    } catch (JSONException e) {
                        zzfol.zza("Error with setting not visible reason", e);
                    }
                    zzfok.zzc(jSONObjectZza, jSONObjectZza2);
                }
                zzfok.zzf(jSONObjectZza);
                HashSet hashSet = new HashSet();
                hashSet.add(str);
                zzfozVar.zzl.zzc(jSONObjectZza, hashSet, jNanoTime);
            }
        }
        if (zzfozVar.zzk.zzf().size() > 0) {
            JSONObject jSONObjectZza3 = zzfoaVarZza.zza(null);
            zzfozVar.zzk(null, zzfoaVarZza, jSONObjectZza3, 1, false);
            zzfok.zzf(jSONObjectZza3);
            zzfozVar.zzl.zzd(jSONObjectZza3, zzfozVar.zzk.zzf(), jNanoTime);
            boolean z = zzfozVar.zzh;
        } else {
            zzfozVar.zzl.zzb();
        }
        zzfozVar.zzk.zzg();
        long jNanoTime2 = System.nanoTime() - zzfozVar.zzm;
        if (zzfozVar.zzf.size() > 0) {
            for (zzfoy zzfoyVar : zzfozVar.zzf) {
                int i = zzfozVar.zzg;
                TimeUnit.NANOSECONDS.toMillis(jNanoTime2);
                zzfoyVar.zzb();
                if (zzfoyVar instanceof zzfox) {
                    int i2 = zzfozVar.zzg;
                    ((zzfox) zzfoyVar).zza();
                }
            }
        }
    }

    private final void zzk(View view, zzfoa zzfoaVar, JSONObject jSONObject, int i, boolean z) {
        zzfoaVar.zzb(view, jSONObject, this, i == 1, z);
    }

    private static final void zzl() {
        Handler handler = zzc;
        if (handler != null) {
            handler.removeCallbacks(zze);
            zzc = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfnz
    public final void zza(View view, zzfoa zzfoaVar, JSONObject jSONObject, boolean z) throws JSONException {
        int iZzk;
        boolean z2;
        if (zzfoq.zza(view) != null || (iZzk = this.zzk.zzk(view)) == 3) {
            return;
        }
        JSONObject jSONObjectZza = zzfoaVar.zza(view);
        zzfok.zzc(jSONObject, jSONObjectZza);
        String strZzd = this.zzk.zzd(view);
        if (strZzd != null) {
            zzfok.zzb(jSONObjectZza, strZzd);
            try {
                jSONObjectZza.put("hasWindowFocus", Boolean.valueOf(this.zzk.zzj(view)));
            } catch (JSONException e) {
                zzfol.zza("Error with setting has window focus", e);
            }
            this.zzk.zzh();
        } else {
            zzfor zzforVarZzb = this.zzk.zzb(view);
            if (zzforVarZzb != null) {
                zzfnt zzfntVarZza = zzforVarZzb.zza();
                JSONArray jSONArray = new JSONArray();
                ArrayList arrayListZzb = zzforVarZzb.zzb();
                int size = arrayListZzb.size();
                for (int i = 0; i < size; i++) {
                    jSONArray.put((String) arrayListZzb.get(i));
                }
                try {
                    jSONObjectZza.put("isFriendlyObstructionFor", jSONArray);
                    jSONObjectZza.put("friendlyObstructionClass", zzfntVarZza.zzd());
                    jSONObjectZza.put("friendlyObstructionPurpose", zzfntVarZza.zza());
                    jSONObjectZza.put("friendlyObstructionReason", zzfntVarZza.zzc());
                } catch (JSONException e2) {
                    zzfol.zza("Error with setting friendly obstruction", e2);
                }
                z2 = true;
            } else {
                z2 = false;
            }
            zzk(view, zzfoaVar, jSONObjectZza, iZzk, z || z2);
        }
        this.zzg++;
    }

    public final void zzh() {
        zzl();
    }

    public final void zzi() {
        if (zzc == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            zzc = handler;
            handler.post(zzd);
            zzc.postDelayed(zze, 200L);
        }
    }

    public final void zzj() {
        zzl();
        this.zzf.clear();
        zzb.post(new zzfou(this));
    }
}
