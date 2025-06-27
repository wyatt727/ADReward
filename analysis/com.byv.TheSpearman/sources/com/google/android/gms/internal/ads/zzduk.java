package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzduk implements zzfko {
    private final zzduc zzb;
    private final Clock zzc;
    private final Map zza = new HashMap();
    private final Map zzd = new HashMap();

    public zzduk(zzduc zzducVar, Set set, Clock clock) {
        this.zzb = zzducVar;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            zzduj zzdujVar = (zzduj) it.next();
            this.zzd.put(zzdujVar.zzc, zzdujVar);
        }
        this.zzc = clock;
    }

    private final void zze(zzfkh zzfkhVar, boolean z) {
        zzfkh zzfkhVar2 = ((zzduj) this.zzd.get(zzfkhVar)).zzb;
        if (this.zza.containsKey(zzfkhVar2)) {
            String str = true != z ? "f." : "s.";
            long jElapsedRealtime = this.zzc.elapsedRealtime() - ((Long) this.zza.get(zzfkhVar2)).longValue();
            this.zzb.zzb().put("label.".concat(((zzduj) this.zzd.get(zzfkhVar)).zza), str.concat(String.valueOf(Long.toString(jElapsedRealtime))));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfko
    public final void zzd(zzfkh zzfkhVar, String str) {
        if (this.zza.containsKey(zzfkhVar)) {
            long jElapsedRealtime = this.zzc.elapsedRealtime() - ((Long) this.zza.get(zzfkhVar)).longValue();
            zzduc zzducVar = this.zzb;
            String strValueOf = String.valueOf(str);
            zzducVar.zzb().put("task.".concat(strValueOf), "s.".concat(String.valueOf(Long.toString(jElapsedRealtime))));
        }
        if (this.zzd.containsKey(zzfkhVar)) {
            zze(zzfkhVar, true);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfko
    public final void zzdC(zzfkh zzfkhVar, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzfko
    public final void zzdD(zzfkh zzfkhVar, String str, Throwable th) {
        if (this.zza.containsKey(zzfkhVar)) {
            long jElapsedRealtime = this.zzc.elapsedRealtime() - ((Long) this.zza.get(zzfkhVar)).longValue();
            zzduc zzducVar = this.zzb;
            String strValueOf = String.valueOf(str);
            zzducVar.zzb().put("task.".concat(strValueOf), "f.".concat(String.valueOf(Long.toString(jElapsedRealtime))));
        }
        if (this.zzd.containsKey(zzfkhVar)) {
            zze(zzfkhVar, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfko
    public final void zzdE(zzfkh zzfkhVar, String str) {
        this.zza.put(zzfkhVar, Long.valueOf(this.zzc.elapsedRealtime()));
    }
}
