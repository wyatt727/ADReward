package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzbpe implements zzbnv, zzbpd {
    private final zzbpd zza;
    private final HashSet zzb = new HashSet();

    public zzbpe(zzbpd zzbpdVar) {
        this.zza = zzbpdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbnv, com.google.android.gms.internal.ads.zzbog
    public final void zza(String str) {
        this.zza.zza(str);
    }

    @Override // com.google.android.gms.internal.ads.zzbnv, com.google.android.gms.internal.ads.zzbog
    public final /* synthetic */ void zzb(String str, String str2) {
        zzbnu.zzc(this, str, str2);
    }

    public final void zzc() {
        Iterator it = this.zzb.iterator();
        while (it.hasNext()) {
            AbstractMap.SimpleEntry simpleEntry = (AbstractMap.SimpleEntry) it.next();
            com.google.android.gms.ads.internal.util.zze.zza("Unregistering eventhandler: ".concat(String.valueOf(((zzbky) simpleEntry.getValue()).toString())));
            this.zza.zzr((String) simpleEntry.getKey(), (zzbky) simpleEntry.getValue());
        }
        this.zzb.clear();
    }

    @Override // com.google.android.gms.internal.ads.zzbnt
    public final /* synthetic */ void zzd(String str, Map map) {
        zzbnu.zza(this, str, map);
    }

    @Override // com.google.android.gms.internal.ads.zzbnv, com.google.android.gms.internal.ads.zzbnt
    public final /* synthetic */ void zze(String str, JSONObject jSONObject) {
        zzbnu.zzb(this, str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zzbog
    public final /* synthetic */ void zzl(String str, JSONObject jSONObject) {
        zzbnu.zzd(this, str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final void zzq(String str, zzbky zzbkyVar) {
        this.zza.zzq(str, zzbkyVar);
        this.zzb.add(new AbstractMap.SimpleEntry(str, zzbkyVar));
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final void zzr(String str, zzbky zzbkyVar) {
        this.zza.zzr(str, zzbkyVar);
        this.zzb.remove(new AbstractMap.SimpleEntry(str, zzbkyVar));
    }
}
