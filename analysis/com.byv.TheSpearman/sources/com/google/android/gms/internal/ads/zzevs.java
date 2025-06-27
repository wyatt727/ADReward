package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzevs implements zzewr {
    final String zza;
    private final zzgep zzb;
    private final ScheduledExecutorService zzc;
    private final zzemw zzd;
    private final Context zze;
    private final zzfgi zzf;
    private final zzems zzg;
    private final zzdry zzh;
    private final zzdwm zzi;

    zzevs(zzgep zzgepVar, ScheduledExecutorService scheduledExecutorService, String str, zzemw zzemwVar, Context context, zzfgi zzfgiVar, zzems zzemsVar, zzdry zzdryVar, zzdwm zzdwmVar) {
        this.zzb = zzgepVar;
        this.zzc = scheduledExecutorService;
        this.zza = str;
        this.zzd = zzemwVar;
        this.zze = context;
        this.zzf = zzfgiVar;
        this.zzg = zzemsVar;
        this.zzh = zzdryVar;
        this.zzi = zzdwmVar;
    }

    public static /* synthetic */ ListenableFuture zzc(zzevs zzevsVar) {
        String lowerCase = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzkA)).booleanValue() ? zzevsVar.zzf.zzf.toLowerCase(Locale.ROOT) : zzevsVar.zzf.zzf;
        final Bundle bundleZzg = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzbD)).booleanValue() ? zzevsVar.zzi.zzg() : new Bundle();
        final ArrayList arrayList = new ArrayList();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzbM)).booleanValue()) {
            zzevsVar.zzi(arrayList, zzevsVar.zzd.zza(zzevsVar.zza, lowerCase));
        } else {
            for (Map.Entry entry : ((zzfzq) zzevsVar.zzd.zzb(zzevsVar.zza, lowerCase)).entrySet()) {
                String str = (String) entry.getKey();
                arrayList.add(zzevsVar.zzg(str, (List) entry.getValue(), zzevsVar.zzf(str), true, true));
            }
            zzevsVar.zzi(arrayList, zzevsVar.zzd.zzc());
        }
        return zzgee.zzb(arrayList).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzevn
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.concurrent.Callable
            public final Object call() {
                JSONArray jSONArray = new JSONArray();
                for (ListenableFuture listenableFuture : arrayList) {
                    if (((JSONObject) listenableFuture.get()) != null) {
                        jSONArray.put(listenableFuture.get());
                    }
                }
                if (jSONArray.length() == 0) {
                    return null;
                }
                return new zzevt(jSONArray.toString(), bundleZzg);
            }
        }, zzevsVar.zzb);
    }

    private final Bundle zzf(String str) {
        Bundle bundle = this.zzf.zzd.zzm;
        if (bundle != null) {
            return bundle.getBundle(str);
        }
        return null;
    }

    private final zzgdv zzg(final String str, final List list, final Bundle bundle, final boolean z, final boolean z2) {
        zzgdv zzgdvVarZzu = zzgdv.zzu(zzgee.zzk(new zzgdk() { // from class: com.google.android.gms.internal.ads.zzevp
            @Override // com.google.android.gms.internal.ads.zzgdk
            public final ListenableFuture zza() {
                return this.zza.zzd(str, list, bundle, z, z2);
            }
        }, this.zzb));
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzbz)).booleanValue()) {
            zzgdvVarZzu = (zzgdv) zzgee.zzo(zzgdvVarZzu, ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzbs)).longValue(), TimeUnit.MILLISECONDS, this.zzc);
        }
        return (zzgdv) zzgee.zze(zzgdvVarZzu, Throwable.class, new zzfwf() { // from class: com.google.android.gms.internal.ads.zzevq
            @Override // com.google.android.gms.internal.ads.zzfwf
            public final Object apply(Object obj) {
                com.google.android.gms.ads.internal.util.client.zzm.zzg("Error calling adapter: ".concat(String.valueOf(str)));
                return null;
            }
        }, this.zzb);
    }

    private final void zzh(zzbsn zzbsnVar, Bundle bundle, List list, zzemz zzemzVar) throws RemoteException {
        zzbsnVar.zzh(ObjectWrapper.wrap(this.zze), this.zza, bundle, (Bundle) list.get(0), this.zzf.zze, zzemzVar);
    }

    private final void zzi(List list, Map map) {
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            zzena zzenaVar = (zzena) ((Map.Entry) it.next()).getValue();
            String str = zzenaVar.zza;
            list.add(zzg(str, Collections.singletonList(zzenaVar.zze), zzf(str), zzenaVar.zzb, zzenaVar.zzc));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzewr
    public final int zza() {
        return 32;
    }

    @Override // com.google.android.gms.internal.ads.zzewr
    public final ListenableFuture zzb() {
        zzfgi zzfgiVar = this.zzf;
        if (zzfgiVar.zzq) {
            if (!Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzbF)).split(",")).contains(com.google.android.gms.ads.nonagon.signalgeneration.zzh.zza(com.google.android.gms.ads.nonagon.signalgeneration.zzh.zzb(zzfgiVar.zzd)))) {
                return zzgee.zzh(new zzevt(new JSONArray().toString(), new Bundle()));
            }
        }
        return zzgee.zzk(new zzgdk() { // from class: com.google.android.gms.internal.ads.zzevm
            @Override // com.google.android.gms.internal.ads.zzgdk
            public final ListenableFuture zza() {
                return zzevs.zzc(this.zza);
            }
        }, this.zzb);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0026 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zzd(java.lang.String r9, final java.util.List r10, final android.os.Bundle r11, boolean r12, boolean r13) throws java.lang.Exception {
        /*
            r8 = this;
            com.google.android.gms.internal.ads.zzcbw r7 = new com.google.android.gms.internal.ads.zzcbw
            r7.<init>()
            r0 = 0
            if (r13 == 0) goto L26
            com.google.android.gms.internal.ads.zzbdq r13 = com.google.android.gms.internal.ads.zzbdz.zzbE
            com.google.android.gms.internal.ads.zzbdx r1 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r13 = r1.zza(r13)
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            if (r13 != 0) goto L26
            com.google.android.gms.internal.ads.zzems r13 = r8.zzg
            r13.zzb(r9)
            com.google.android.gms.internal.ads.zzems r13 = r8.zzg
            com.google.android.gms.internal.ads.zzbsn r13 = r13.zza(r9)
            goto L34
        L26:
            com.google.android.gms.internal.ads.zzdry r13 = r8.zzh     // Catch: android.os.RemoteException -> L2d
            com.google.android.gms.internal.ads.zzbsn r13 = r13.zzb(r9)     // Catch: android.os.RemoteException -> L2d
            goto L34
        L2d:
            r13 = move-exception
            java.lang.String r1 = "Couldn't create RTB adapter : "
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r1, r13)
            r13 = r0
        L34:
            if (r13 != 0) goto L4e
            com.google.android.gms.internal.ads.zzbdq r10 = com.google.android.gms.internal.ads.zzbdz.zzbu
            com.google.android.gms.internal.ads.zzbdx r11 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r10 = r11.zza(r10)
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L4d
            com.google.android.gms.internal.ads.zzemz.zzb(r9, r7)
            goto Lba
        L4d:
            throw r0
        L4e:
            com.google.android.gms.internal.ads.zzemz r6 = new com.google.android.gms.internal.ads.zzemz
            com.google.android.gms.common.util.Clock r0 = com.google.android.gms.ads.internal.zzu.zzB()
            long r4 = r0.elapsedRealtime()
            r0 = r6
            r1 = r9
            r2 = r13
            r3 = r7
            r0.<init>(r1, r2, r3, r4)
            com.google.android.gms.internal.ads.zzbdq r9 = com.google.android.gms.internal.ads.zzbdz.zzbz
            com.google.android.gms.internal.ads.zzbdx r0 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r9 = r0.zza(r9)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L8d
            java.util.concurrent.ScheduledExecutorService r9 = r8.zzc
            com.google.android.gms.internal.ads.zzevr r0 = new com.google.android.gms.internal.ads.zzevr
            r0.<init>()
            com.google.android.gms.internal.ads.zzbdq r1 = com.google.android.gms.internal.ads.zzbdz.zzbs
            com.google.android.gms.internal.ads.zzbdx r2 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r1 = r2.zza(r1)
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS
            r9.schedule(r0, r1, r3)
        L8d:
            if (r12 == 0) goto Lb7
            com.google.android.gms.internal.ads.zzbdq r9 = com.google.android.gms.internal.ads.zzbdz.zzbG
            com.google.android.gms.internal.ads.zzbdx r12 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r9 = r12.zza(r9)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto Lb3
            com.google.android.gms.internal.ads.zzgep r9 = r8.zzb
            com.google.android.gms.internal.ads.zzevo r12 = new com.google.android.gms.internal.ads.zzevo
            r0 = r12
            r1 = r8
            r2 = r13
            r3 = r11
            r4 = r10
            r5 = r6
            r6 = r7
            r0.<init>()
            r9.zza(r12)
            goto Lba
        Lb3:
            r8.zzh(r13, r11, r10, r6)
            goto Lba
        Lb7:
            r6.zzd()
        Lba:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzevs.zzd(java.lang.String, java.util.List, android.os.Bundle, boolean, boolean):com.google.common.util.concurrent.ListenableFuture");
    }

    final /* synthetic */ void zze(zzbsn zzbsnVar, Bundle bundle, List list, zzemz zzemzVar, zzcbw zzcbwVar) {
        try {
            zzh(zzbsnVar, bundle, list, zzemzVar);
        } catch (RemoteException e) {
            zzcbwVar.zzd(e);
        }
    }
}
