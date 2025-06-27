package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzdxa {
    private final zzdwk zza;
    private final zzdrv zzb;
    private final Object zzc = new Object();
    private final List zzd = new ArrayList();
    private boolean zze;

    zzdxa(zzdwk zzdwkVar, zzdrv zzdrvVar) {
        this.zza = zzdwkVar;
        this.zzb = zzdrvVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzd(List list) {
        zzdru zzdruVarZza;
        zzdru zzdruVarZza2;
        zzbtc zzbtcVar;
        synchronized (this.zzc) {
            if (this.zze) {
                return;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                zzbmw zzbmwVar = (zzbmw) it.next();
                String string = (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzjk)).booleanValue() || (zzdruVarZza2 = this.zzb.zza(zzbmwVar.zza)) == null || (zzbtcVar = zzdruVarZza2.zzc) == null) ? "" : zzbtcVar.toString();
                String str = string;
                boolean z = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzjl)).booleanValue() && (zzdruVarZza = this.zzb.zza(zzbmwVar.zza)) != null && zzdruVarZza.zzd;
                List list2 = this.zzd;
                String str2 = zzbmwVar.zza;
                list2.add(new zzdwz(str2, str, this.zzb.zzb(str2), zzbmwVar.zzb ? 1 : 0, zzbmwVar.zzd, zzbmwVar.zzc, z));
            }
            this.zze = true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f A[Catch: all -> 0x003f, LOOP:0: B:13:0x0029->B:15:0x002f, LOOP_END, TryCatch #0 {, blocks: (B:4:0x0008, B:6:0x000c, B:8:0x0014, B:9:0x001e, B:10:0x0021, B:12:0x0023, B:13:0x0029, B:15:0x002f, B:16:0x003d), top: B:21:0x0008 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final org.json.JSONArray zza() throws org.json.JSONException {
        /*
            r4 = this;
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>()
            java.lang.Object r1 = r4.zzc
            monitor-enter(r1)
            boolean r2 = r4.zze     // Catch: java.lang.Throwable -> L3f
            if (r2 != 0) goto L23
            com.google.android.gms.internal.ads.zzdwk r2 = r4.zza     // Catch: java.lang.Throwable -> L3f
            boolean r2 = r2.zzt()     // Catch: java.lang.Throwable -> L3f
            if (r2 == 0) goto L1e
            com.google.android.gms.internal.ads.zzdwk r2 = r4.zza     // Catch: java.lang.Throwable -> L3f
            java.util.List r2 = r2.zzg()     // Catch: java.lang.Throwable -> L3f
            r4.zzd(r2)     // Catch: java.lang.Throwable -> L3f
            goto L23
        L1e:
            r4.zzc()     // Catch: java.lang.Throwable -> L3f
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L3f
            goto L3e
        L23:
            java.util.List r2 = r4.zzd     // Catch: java.lang.Throwable -> L3f
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L3f
        L29:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L3f
            if (r3 == 0) goto L3d
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L3f
            com.google.android.gms.internal.ads.zzdwz r3 = (com.google.android.gms.internal.ads.zzdwz) r3     // Catch: java.lang.Throwable -> L3f
            org.json.JSONObject r3 = r3.zza()     // Catch: java.lang.Throwable -> L3f
            r0.put(r3)     // Catch: java.lang.Throwable -> L3f
            goto L29
        L3d:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L3f
        L3e:
            return r0
        L3f:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L3f
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdxa.zza():org.json.JSONArray");
    }

    public final void zzc() {
        this.zza.zzs(new zzdwy(this));
    }
}
