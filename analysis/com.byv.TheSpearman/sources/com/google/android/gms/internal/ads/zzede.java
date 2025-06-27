package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Objects;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzede extends zzbwp {
    private final Context zza;
    private final zzeyf zzb;
    private final zzeyd zzc;
    private final zzedm zzd;
    private final zzgep zze;
    private final zzedj zzf;
    private final zzbxm zzg;

    zzede(Context context, zzeyf zzeyfVar, zzeyd zzeydVar, zzedj zzedjVar, zzedm zzedmVar, zzgep zzgepVar, zzbxm zzbxmVar) {
        this.zza = context;
        this.zzb = zzeyfVar;
        this.zzc = zzeydVar;
        this.zzf = zzedjVar;
        this.zzd = zzedmVar;
        this.zze = zzgepVar;
        this.zzg = zzbxmVar;
    }

    private final void zzc(ListenableFuture listenableFuture, zzbwt zzbwtVar) {
        zzgee.zzr(zzgee.zzn(zzgdv.zzu(listenableFuture), new zzgdl() { // from class: com.google.android.gms.internal.ads.zzedb
            @Override // com.google.android.gms.internal.ads.zzgdl
            public final ListenableFuture zza(Object obj) {
                return zzgee.zzh(zzfhj.zza((InputStream) obj));
            }
        }, zzcbr.zza), new zzedd(this, zzbwtVar), zzcbr.zzf);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.common.util.concurrent.ListenableFuture zzb(com.google.android.gms.internal.ads.zzbwi r9, int r10) {
        /*
            r8 = this;
            com.google.android.gms.internal.ads.zzedg r7 = new com.google.android.gms.internal.ads.zzedg
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            android.os.Bundle r0 = r9.zzc
            if (r0 == 0) goto L29
            java.util.Set r1 = r0.keySet()
            java.util.Iterator r1 = r1.iterator()
        L13:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L29
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r4 = r0.getString(r2)
            if (r4 == 0) goto L13
            r3.put(r2, r4)
            goto L13
        L29:
            int r2 = r9.zzb
            java.lang.String r1 = r9.zza
            byte[] r4 = r9.zzd
            boolean r6 = r9.zze
            java.lang.String r5 = ""
            r0 = r7
            r0.<init>(r1, r2, r3, r4, r5, r6)
            com.google.android.gms.internal.ads.zzeyd r0 = r8.zzc
            com.google.android.gms.internal.ads.zzezl r1 = new com.google.android.gms.internal.ads.zzezl
            r1.<init>(r9)
            r0.zza(r1)
            boolean r1 = r7.zzf
            com.google.android.gms.internal.ads.zzeye r0 = r0.zzb()
            if (r1 == 0) goto Laa
            java.lang.String r9 = r9.zza
            com.google.android.gms.internal.ads.zzbff r1 = com.google.android.gms.internal.ads.zzbfz.zzb
            java.lang.Object r1 = r1.zze()
            java.lang.String r1 = (java.lang.String) r1
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 == 0) goto L5a
            goto Laa
        L5a:
            android.net.Uri r9 = android.net.Uri.parse(r9)
            java.lang.String r9 = r9.getHost()
            boolean r2 = android.text.TextUtils.isEmpty(r9)
            if (r2 != 0) goto Laa
            r2 = 59
            com.google.android.gms.internal.ads.zzfwc r2 = com.google.android.gms.internal.ads.zzfwc.zzc(r2)
            com.google.android.gms.internal.ads.zzfxe r2 = com.google.android.gms.internal.ads.zzfxe.zzc(r2)
            java.lang.Iterable r1 = r2.zzd(r1)
            java.util.Iterator r1 = r1.iterator()
        L7a:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto Laa
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            boolean r2 = r9.endsWith(r2)
            if (r2 == 0) goto L7a
            com.google.android.gms.internal.ads.zzewu r9 = r0.zza()
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            com.google.common.util.concurrent.ListenableFuture r9 = r9.zza(r1, r2)
            com.google.android.gms.internal.ads.zzecw r1 = new com.google.android.gms.internal.ads.zzecw
            r1.<init>()
            com.google.android.gms.internal.ads.zzgep r2 = r8.zze
            com.google.common.util.concurrent.ListenableFuture r9 = com.google.android.gms.internal.ads.zzgee.zzm(r9, r1, r2)
            goto Lae
        Laa:
            com.google.common.util.concurrent.ListenableFuture r9 = com.google.android.gms.internal.ads.zzgee.zzh(r7)
        Lae:
            com.google.android.gms.internal.ads.zzfkn r0 = r0.zzb()
            android.content.Context r1 = r8.zza
            com.google.android.gms.internal.ads.zzbxm r2 = r8.zzg
            com.google.android.gms.internal.ads.zzedi r3 = new com.google.android.gms.internal.ads.zzedi
            java.lang.String r4 = ""
            r3.<init>(r1, r4, r2, r10)
            com.google.android.gms.internal.ads.zzfkh r10 = com.google.android.gms.internal.ads.zzfkh.HTTP
            com.google.android.gms.internal.ads.zzfke r9 = r0.zzb(r10, r9)
            com.google.android.gms.internal.ads.zzfke r9 = r9.zze(r3)
            com.google.android.gms.internal.ads.zzfjs r9 = r9.zza()
            com.google.android.gms.internal.ads.zzgep r10 = r8.zze
            com.google.android.gms.internal.ads.zzecx r0 = new com.google.android.gms.internal.ads.zzgdl() { // from class: com.google.android.gms.internal.ads.zzecx
                static {
                    /*
                        com.google.android.gms.internal.ads.zzecx r0 = new com.google.android.gms.internal.ads.zzecx
                        r0.<init>()
                        
                        // error: 0x0005: SPUT (r0 I:com.google.android.gms.internal.ads.zzecx) com.google.android.gms.internal.ads.zzecx.zza com.google.android.gms.internal.ads.zzecx
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzecx.<clinit>():void");
                }

                {
                    /*
                        r0 = this;
                        r0.<init>()
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzecx.<init>():void");
                }

                @Override // com.google.android.gms.internal.ads.zzgdl
                public final com.google.common.util.concurrent.ListenableFuture zza(java.lang.Object r9) throws org.json.JSONException {
                    /*
                        r8 = this;
                        com.google.android.gms.internal.ads.zzedh r9 = (com.google.android.gms.internal.ads.zzedh) r9
                        java.io.ByteArrayInputStream r0 = new java.io.ByteArrayInputStream
                        org.json.JSONObject r1 = new org.json.JSONObject
                        r1.<init>()
                        java.lang.String r2 = "response"
                        int r3 = r9.zza     // Catch: org.json.JSONException -> L7b
                        r1.put(r2, r3)     // Catch: org.json.JSONException -> L7b
                        org.json.JSONObject r2 = new org.json.JSONObject     // Catch: org.json.JSONException -> L7b
                        r2.<init>()     // Catch: org.json.JSONException -> L7b
                        java.util.Map r3 = r9.zzb     // Catch: org.json.JSONException -> L7b
                        java.util.Set r3 = r3.keySet()     // Catch: org.json.JSONException -> L7b
                        java.util.Iterator r3 = r3.iterator()     // Catch: org.json.JSONException -> L7b
                    L1f:
                        boolean r4 = r3.hasNext()     // Catch: org.json.JSONException -> L7b
                        if (r4 == 0) goto L54
                        java.lang.Object r4 = r3.next()     // Catch: org.json.JSONException -> L7b
                        java.lang.String r4 = (java.lang.String) r4     // Catch: org.json.JSONException -> L7b
                        if (r4 == 0) goto L1f
                        java.util.Map r5 = r9.zzb     // Catch: org.json.JSONException -> L7b
                        java.lang.Object r5 = r5.get(r4)     // Catch: org.json.JSONException -> L7b
                        java.util.List r5 = (java.util.List) r5     // Catch: org.json.JSONException -> L7b
                        org.json.JSONArray r6 = new org.json.JSONArray     // Catch: org.json.JSONException -> L7b
                        r6.<init>()     // Catch: org.json.JSONException -> L7b
                        java.util.Iterator r5 = r5.iterator()     // Catch: org.json.JSONException -> L7b
                    L3e:
                        boolean r7 = r5.hasNext()     // Catch: org.json.JSONException -> L7b
                        if (r7 == 0) goto L50
                        java.lang.Object r7 = r5.next()     // Catch: org.json.JSONException -> L7b
                        java.lang.String r7 = (java.lang.String) r7     // Catch: org.json.JSONException -> L7b
                        if (r7 == 0) goto L3e
                        r6.put(r7)     // Catch: org.json.JSONException -> L7b
                        goto L3e
                    L50:
                        r2.put(r4, r6)     // Catch: org.json.JSONException -> L7b
                        goto L1f
                    L54:
                        java.lang.String r3 = "headers"
                        r1.put(r3, r2)     // Catch: org.json.JSONException -> L7b
                        java.lang.String r2 = r9.zzc     // Catch: org.json.JSONException -> L7b
                        if (r2 == 0) goto L62
                        java.lang.String r3 = "body"
                        r1.put(r3, r2)     // Catch: org.json.JSONException -> L7b
                    L62:
                        java.lang.String r2 = "latency"
                        long r3 = r9.zzd     // Catch: org.json.JSONException -> L7b
                        r1.put(r2, r3)     // Catch: org.json.JSONException -> L7b
                        java.lang.String r9 = r1.toString()
                        java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.UTF_8
                        byte[] r9 = r9.getBytes(r1)
                        r0.<init>(r9)
                        com.google.common.util.concurrent.ListenableFuture r9 = com.google.android.gms.internal.ads.zzgee.zzh(r0)
                        return r9
                    L7b:
                        r9 = move-exception
                        java.lang.String r0 = r9.getMessage()
                        java.lang.String r0 = java.lang.String.valueOf(r0)
                        java.lang.String r1 = "Error converting response to JSONObject: "
                        java.lang.String r0 = r1.concat(r0)
                        com.google.android.gms.ads.internal.util.client.zzm.zzj(r0)
                        org.json.JSONException r0 = new org.json.JSONException
                        java.lang.Throwable r9 = r9.getCause()
                        java.lang.String r9 = java.lang.String.valueOf(r9)
                        java.lang.String r9 = java.lang.String.valueOf(r9)
                        java.lang.String r1 = "Parsing HTTP Response: "
                        java.lang.String r9 = r1.concat(r9)
                        r0.<init>(r9)
                        throw r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzecx.zza(java.lang.Object):com.google.common.util.concurrent.ListenableFuture");
                }
            }
            com.google.common.util.concurrent.ListenableFuture r9 = com.google.android.gms.internal.ads.zzgee.zzn(r9, r0, r10)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzede.zzb(com.google.android.gms.internal.ads.zzbwi, int):com.google.common.util.concurrent.ListenableFuture");
    }

    @Override // com.google.android.gms.internal.ads.zzbwq
    public final void zze(zzbwi zzbwiVar, zzbwt zzbwtVar) {
        zzc(zzb(zzbwiVar, Binder.getCallingUid()), zzbwtVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbwq
    public final void zzf(zzbwe zzbweVar, zzbwt zzbwtVar) {
        zzexu zzexuVar = new zzexu(zzbweVar, Binder.getCallingUid());
        zzeyf zzeyfVar = this.zzb;
        zzeyfVar.zza(zzexuVar);
        final zzeyg zzeygVarZzb = zzeyfVar.zzb();
        zzfkn zzfknVarZzb = zzeygVarZzb.zzb();
        zzfjs zzfjsVarZza = zzfknVarZzb.zzb(zzfkh.GMS_SIGNALS, zzgee.zzi()).zzf(new zzgdl() { // from class: com.google.android.gms.internal.ads.zzeda
            @Override // com.google.android.gms.internal.ads.zzgdl
            public final ListenableFuture zza(Object obj) {
                return zzeygVarZzb.zza().zza(new JSONObject(), new Bundle());
            }
        }).zze(new zzfjq() { // from class: com.google.android.gms.internal.ads.zzecz
            @Override // com.google.android.gms.internal.ads.zzfjq
            public final Object zza(Object obj) {
                JSONObject jSONObject = (JSONObject) obj;
                com.google.android.gms.ads.internal.util.zze.zza("GMS AdRequest Signals: ");
                com.google.android.gms.ads.internal.util.zze.zza(jSONObject.toString(2));
                return jSONObject;
            }
        }).zzf(new zzgdl() { // from class: com.google.android.gms.internal.ads.zzecy
            @Override // com.google.android.gms.internal.ads.zzgdl
            public final ListenableFuture zza(Object obj) {
                return zzgee.zzh(new ByteArrayInputStream(((JSONObject) obj).toString().getBytes(StandardCharsets.UTF_8)));
            }
        }).zza();
        zzc(zzfjsVarZza, zzbwtVar);
        if (((Boolean) zzbft.zzf.zze()).booleanValue()) {
            final zzedm zzedmVar = this.zzd;
            Objects.requireNonNull(zzedmVar);
            zzfjsVarZza.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzedc
                @Override // java.lang.Runnable
                public final void run() {
                    zzedmVar.zzb();
                }
            }, this.zze);
        }
    }
}
